package com.google.ads.interactivemedia.p367v3.internal;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.google.ads.interactivemedia.v3.internal.acl */
/* compiled from: PG */
public final class acl extends abr {

    /* renamed from: a */
    private RandomAccessFile f20312a;

    /* renamed from: b */
    private Uri f20313b;

    /* renamed from: c */
    private long f20314c;

    /* renamed from: d */
    private boolean f20315d;

    public acl() {
        super(false);
    }

    /* renamed from: a */
    public final int mo14388a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20314c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f20312a;
            int i3 = aeu.f20466a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f20314c -= (long) read;
                mo14406i(read);
            }
            return read;
        } catch (IOException e) {
            throw new ack(e);
        }
    }

    /* renamed from: c */
    public final long mo14389c(acb acb) {
        Uri uri;
        try {
            uri = acb.f20241a;
            this.f20313b = uri;
            mo14404g(acb);
            String path = uri.getPath();
            ary.m19467t(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, C33259r.f88929b);
            this.f20312a = randomAccessFile;
            randomAccessFile.seek(acb.f20245e);
            long j = acb.f20246f;
            if (j == -1) {
                j = this.f20312a.length() - acb.f20245e;
            }
            this.f20314c = j;
            if (j >= 0) {
                this.f20315d = true;
                mo14405h(acb);
                return this.f20314c;
            }
            throw new EOFException();
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery())) {
                if (TextUtils.isEmpty(uri.getFragment())) {
                    throw new ack(e);
                }
            }
            throw new ack(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
        } catch (IOException e2) {
            throw new ack(e2);
        }
    }

    /* renamed from: d */
    public final Uri mo14390d() {
        return this.f20313b;
    }

    /* renamed from: f */
    public final void mo14391f() {
        this.f20313b = null;
        try {
            RandomAccessFile randomAccessFile = this.f20312a;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f20312a = null;
            if (this.f20315d) {
                this.f20315d = false;
                mo14407j();
            }
        } catch (IOException e) {
            throw new ack(e);
        } catch (Throwable th) {
            this.f20312a = null;
            if (this.f20315d) {
                this.f20315d = false;
                mo14407j();
            }
            throw th;
        }
    }
}
