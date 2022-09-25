package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.net.Uri;
import androidx.media3.p132b.C2499c;
import androidx.media3.p132b.C2510n;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4543n.p4546c.C59395c;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.d */
/* compiled from: PG */
public final class C105809d extends C2499c {

    /* renamed from: a */
    boolean f295177a;

    /* renamed from: b */
    private final C85346o f295178b;

    /* renamed from: c */
    private Uri f295179c;

    /* renamed from: d */
    private final int f295180d;

    /* renamed from: e */
    private long f295181e;

    /* renamed from: f */
    private int f295182f;

    /* renamed from: g */
    private C63088z f295183g;

    /* renamed from: h */
    private C58833ax f295184h = C58836b.f156633a;

    public C105809d(C85346o oVar, int i) {
        super(true);
        this.f295178b = oVar;
        this.f295180d = i;
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        if (!this.f295177a) {
            throw new IOException("Trying to read data from an non opened SpeakrDataSource");
        } else if (i2 == 0) {
            return 0;
        } else {
            int i3 = this.f295182f;
            if (i3 == 0) {
                return -1;
            }
            int min = Math.min(i3, i2);
            System.arraycopy(this.f295183g.mo59174N(), (int) this.f295181e, bArr, i, min);
            this.f295181e += (long) min;
            this.f295182f -= min;
            mo5927g(min);
            return min;
        }
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        mo5929i(nVar);
        this.f295179c = nVar.f6891a;
        this.f295181e = nVar.f6896f;
        try {
            if (!this.f295184h.mo56113h()) {
                C85346o oVar = this.f295178b;
                this.f295184h = C58833ax.m90834k((C63088z) C90877ak.m148472f(oVar.f231139b.mo78871f(oVar.f231138a, this.f295180d)));
            }
            this.f295183g = (C63088z) this.f295184h.mo56107c();
            long j = nVar.f6897g;
            if (j == -1) {
                j = ((long) this.f295183g.mo59031d()) - nVar.f6896f;
            }
            int i = (int) j;
            this.f295182f = i;
            if (i <= 0 || this.f295181e + ((long) i) > ((long) this.f295183g.mo59031d())) {
                long j2 = this.f295181e;
                long j3 = nVar.f6897g;
                int d = this.f295183g.mo59031d();
                throw new IOException("Unsatisfiable range: [" + j2 + ", " + j3 + "], length: " + d);
            }
            this.f295177a = true;
            mo5930j(nVar);
            return (long) this.f295182f;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof C59395c) {
                cause = cause.getCause();
            }
            if (cause == null) {
                throw new IOException("Error fetching paragraph audio.", e);
            } else if (cause instanceof CancellationException) {
                throw new IOException("Error fetching paragraph audio.", e);
            } else {
                throw new IOException("Error fetching paragraph audio.", new C90457d((Throwable) e, C105810e.m176156a(cause)));
            }
        } catch (InterruptedException e2) {
            throw new IOException("Error fetching paragraph audio.", e2);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        return this.f295179c;
    }

    /* renamed from: d */
    public final void mo5882d() {
        if (this.f295177a) {
            this.f295177a = false;
            mo5928h();
        }
    }
}
