package com.google.android.libraries.storage.p3304a;

import com.google.android.libraries.storage.p3304a.p3307c.C42766s;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42744e;
import com.google.android.libraries.storage.p3304a.p3307c.p3308a.C42748i;
import com.google.android.libraries.storage.p3304a.p3313g.C42801d;
import java.io.InputStream;
import java.util.List;

/* renamed from: com.google.android.libraries.storage.a.c */
/* compiled from: PG */
public final class C42738c extends C42744e implements C42766s {

    /* renamed from: a */
    private final List f111998a;

    public C42738c(InputStream inputStream, List list) {
        super(inputStream);
        this.f111998a = list;
        C42748i.m75526a(inputStream != null, "Input was null", new Object[0]);
    }

    /* renamed from: a */
    public final Long mo45840a() {
        if (!(this.in instanceof C42766s)) {
            return null;
        }
        return ((C42766s) this.in).mo45840a();
    }

    public final void close() {
        for (C42801d close : this.f111998a) {
            try {
                close.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            for (C42801d a : this.f111998a) {
                a.mo45877a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            for (C42801d a : this.f111998a) {
                a.mo45877a();
            }
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            for (C42801d a : this.f111998a) {
                a.mo45877a();
            }
        }
        return read;
    }
}
