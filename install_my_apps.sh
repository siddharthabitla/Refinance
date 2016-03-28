#!/bin/sh

echo "Composed by Siddhartha Bitla, mail:<siddhartha.bitla@gmail.com>"
# ------------------------------------------------- startup install -----------------------------------------------------------
# Download and install GetDeb and PlayDeb
echo "Downloading GetDeb and PlayDeb" &&
wget http://archive.getdeb.net/install_deb/getdeb-repository_0.1-1~getdeb1_all.deb http://archive.getdeb.net/install_deb/playdeb_0.3-1~getdeb1_all.deb &&

echo "Installing GetDeb" &&
dpkg -i getdeb-repository_0.1-1~getdeb1_all.deb &&

echo "Installing PlayDeb" &&
dpkg -i playdeb_0.3-1~getdeb1_all.deb &&

echo "Deleting Downloads" &&
rm -f getdeb-repository_0.1-1~getdeb1_all.deb &&
rm -f playdeb_0.3-1~getdeb1_all.deb

# vlc
add-apt-repository -y ppa:videolan/stable-daily
# gimp
add-apt-repository -y ppa:otto-kesselgulasch/gimp
# java
add-apt-repository -y ppa:webupd8team/java
# ppa manager
add-apt-repository -y ppa:webupd8team/y-ppa-manager
# qbittorrent
add-apt-repository -y ppa:qbittorrent-team/qbittorrent-stable
# guake terminal
add-apt-repository -y ppa:webupd8team/unstable
# youtube-dl
add-apt-repository -y ppa:nilarimogard/webupd8
# libdvdcss
echo 'deb http://download.videolan.org/pub/debian/stable/ /' | sudo tee -a /etc/apt/sources.list.d/libdvdcss.list &&
    echo 'deb-src http://download.videolan.org/pub/debian/stable/ /' | sudo tee -a /etc/apt/sources.list.d/libdvdcss.list &&
    wget -O - http://download.videolan.org/pub/debian/videolan-apt.asc|sudo apt-key add -

# Updates
apt-get update
apt-get upgrade
apt-get dist-upgrade

# Installing
apt-get install libcurl4-openssl-dev libjpeg62 r-base-core r-base-dev artha python-pip guake qbittorrent synaptic vlc gimp gimp-data gimp-plugin-registry gimp-data-extras y-ppa-manager bleachbit openjdk-7-jre oracle-java8-installer flashplugin-installer unace unrar zip unzip p7zip-full p7zip-rar sharutils rar uudeview mpack arj cabextract file-roller libxine1-ffmpeg mencoder flac faac faad sox ffmpeg2theora libmpeg2-4 uudeview libmpeg3-1 mpeg3-utils mpegdemux liba52-dev mpeg2dec vorbis-tools id3v2 mpg321 mpg123 libflac++6 totem-mozilla icedax lame libmad0 libjpeg-progs libdvdcss2 libdvdread4 libdvdnav4 libswscale-extra-2 ubuntu-restricted-extras ubuntu-wallpapers* dia gnome-tweak-tool git g++ youtube-dl -y

# -----------------------------------------------------------------------------------------------------------------------------

# Install Calibre
sudo -v && 
    wget -nv -O- https://raw.githubusercontent.com/kovidgoyal/calibre/master/setup/linux-installer.py | 
	sudo python -c "import sys; main=lambda:sys.stderr.write('Download failed\n'); exec(sys.stdin.read()); main()"

# Cleaning up
echo "Cleaning Up" &&
    sudo apt-get -f install -y &&
    sudo apt-get autoremove -y &&
    sudo apt-get -y autoclean &&
    sudo apt-get -y clean
