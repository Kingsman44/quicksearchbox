package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abl */
/* compiled from: PG */
public final class abl extends abr {

    /* renamed from: a */
    private final AssetManager f20198a;

    /* renamed from: b */
    private Uri f20199b;

    /* renamed from: c */
    private InputStream f20200c;

    /* renamed from: d */
    private long f20201d;

    /* renamed from: e */
    private boolean f20202e;

    public abl(Context context) {
        super(false);
        this.f20198a = context.getAssets();
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20201d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new abk(e);
            }
        }
        InputStream inputStream = this.f20200c;
        int i3 = aeu.f20466a;
        int read = inputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f20201d;
            if (j2 != -1) {
                this.f20201d = j2 - ((long) read);
            }
            mo14406i(read);
            return read;
        } else if (this.f20201d == -1) {
            return -1;
        } else {
            throw new abk(new EOFException());
        }
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        try {
            Uri uri = acb.f20241a;
            this.f20199b = uri;
            String path = uri.getPath();
            ary.m19467t(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo14404g(acb);
            InputStream open = this.f20198a.open(path, 1);
            this.f20200c = open;
            if (open.skip(acb.f20245e) >= acb.f20245e) {
                long j = acb.f20246f;
                if (j != -1) {
                    this.f20201d = j;
                } else {
                    long available = (long) this.f20200c.available();
                    this.f20201d = available;
                    if (available == 2147483647L) {
                        this.f20201d = -1;
                    }
                }
                this.f20202e = true;
                mo14405h(acb);
                return this.f20201d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new abk(e);
        }
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20199b;
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20199b = null;
        try {
            InputStream inputStream = this.f20200c;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f20200c = null;
            if (this.f20202e) {
                this.f20202e = false;
                mo14407j();
            }
        } catch (IOException e) {
            throw new abk(e);
        } catch (Throwable th) {
            this.f20200c = null;
            if (this.f20202e) {
                this.f20202e = false;
                mo14407j();
            }
            throw th;
        }
    }
}
