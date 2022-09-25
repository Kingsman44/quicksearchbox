package p3186j$.wrapper.java.p3189io;

import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.nio.channels.C41336b;

/* renamed from: j$.wrapper.java.io.FileInputStreamWrapper */
public final class FileInputStreamWrapper {
    public static FileChannel getChannel(FileInputStream fileInputStream) {
        return C41336b.m72303a(fileInputStream.getChannel());
    }
}
