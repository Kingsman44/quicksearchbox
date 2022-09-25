package com.google.android.libraries.storage.p3304a;

import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42745f;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;
import com.google.android.libraries.storage.p3304a.p3313g.C42802e;
import java.io.OutputStream;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.d */
/* compiled from: PG */
public final class C42769d extends C42745f {

    /* renamed from: a */
    private final List f112025a;

    public C42769d(OutputStream outputStream, List list) {
        super(outputStream);
        this.f112025a = list;
        C42748i.m75526a(outputStream != null, "Output was null", new Object[0]);
    }

    public final void close() {
        for (C42802e close : this.f112025a) {
            try {
                close.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    public final void write(int i) {
        this.out.write(i);
        for (C42802e a : this.f112025a) {
            a.mo34687a(1);
        }
    }

    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (C42802e a : this.f112025a) {
            a.mo34687a(bArr.length);
        }
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        for (C42802e a : this.f112025a) {
            a.mo34687a(i2);
        }
    }
}
