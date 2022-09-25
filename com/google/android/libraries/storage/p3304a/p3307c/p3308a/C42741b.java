package com.google.android.libraries.storage.p3304a.p3307c.p3308a;

import com.google.android.libraries.storage.p3304a.p3307c.C42739a;
import com.google.android.libraries.storage.p3304a.p3307c.C42749b;
import com.google.android.libraries.storage.p3304a.p3307c.C42767t;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.google.android.libraries.storage.a.c.a.b */
/* compiled from: PG */
public final class C42741b extends C42745f implements C42749b, C42739a, C42767t {

    /* renamed from: a */
    private final FileOutputStream f112001a;

    /* renamed from: b */
    private final File f112002b;

    public C42741b(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f112001a = fileOutputStream;
        this.f112002b = file;
    }

    /* renamed from: a */
    public final void mo45847a() {
        this.f112001a.getFD().sync();
    }

    /* renamed from: b */
    public final FileChannel mo45845b() {
        return this.f112001a.getChannel();
    }

    /* renamed from: c */
    public final File mo45846c() {
        return this.f112002b;
    }
}
