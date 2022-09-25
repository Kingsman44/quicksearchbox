package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42749b;
import com.google.android.libraries.storage.p3304a.p3307c.C42766s;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import p3186j$.wrapper.java.p3189io.FileInputStreamWrapper;

/* renamed from: com.google.android.libraries.storage.a.c.a.a */
/* compiled from: PG */
public final class C42740a extends C42744e implements C42749b, C42739a, C42766s {

    /* renamed from: a */
    private final FileInputStream f111999a;

    /* renamed from: b */
    private final File f112000b;

    public C42740a(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f111999a = fileInputStream;
        this.f112000b = file;
    }

    /* renamed from: a */
    public final Long mo45840a() {
        return Long.valueOf(FileInputStreamWrapper.getChannel(this.f111999a).size());
    }

    /* renamed from: b */
    public final FileChannel mo45845b() {
        return FileInputStreamWrapper.getChannel(this.f111999a);
    }

    /* renamed from: c */
    public final File mo45846c() {
        return this.f112000b;
    }
}
