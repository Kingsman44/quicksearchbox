package org.chromium.net;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: org.chromium.net.w */
/* compiled from: PG */
final class C72558w implements C72561z {

    /* renamed from: a */
    final /* synthetic */ File f193082a;

    public C72558w(File file) {
        this.f193082a = file;
    }

    /* renamed from: a */
    public final FileChannel mo64308a() {
        return FileInputStreamWrapper.getChannel(new FileInputStream(this.f193082a));
    }
}
