package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.net.Uri;
import androidx.media3.p132b.C2499c;
import androidx.media3.p132b.C2506j;
import androidx.media3.p132b.C2510n;
import com.google.android.apps.gsa.search.core.p6519al.p6694dd.C85346o;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4543n.p4546c.C59395c;
import com.google.protobuf.C63088z;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.g */
/* compiled from: PG */
final class C105812g extends C2499c {

    /* renamed from: b */
    private static final C59071e f295186b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.o.b.g");

    /* renamed from: a */
    boolean f295187a;

    /* renamed from: c */
    private final C85346o f295188c;

    /* renamed from: d */
    private final int f295189d;

    /* renamed from: e */
    private Uri f295190e;

    /* renamed from: f */
    private C58833ax f295191f = C58836b.f156633a;

    /* renamed from: g */
    private long f295192g;

    /* renamed from: h */
    private int f295193h;

    /* renamed from: i */
    private long f295194i;

    /* renamed from: j */
    private long f295195j;

    public C105812g(C85346o oVar, int i) {
        super(false);
        this.f295188c = oVar;
        this.f295189d = i;
    }

    /* renamed from: k */
    private static IOException m176160k(ExecutionException executionException) {
        ((C59052c) ((C59052c) ((C59052c) f295186b.mo56225c()).mo56382g(executionException)).mo56372aa(14098)).mo56386p("Error fetching audio.");
        Throwable cause = executionException.getCause();
        if (cause instanceof C59395c) {
            cause = cause.getCause();
        }
        if (cause == null) {
            return new IOException("Error fetching audio.", executionException);
        }
        if (cause instanceof CancellationException) {
            return new IOException("Error fetching audio.", executionException);
        }
        return new IOException("Error fetching audio.", new C90457d((Throwable) executionException, C105810e.m176156a(cause)));
    }

    /* renamed from: l */
    private final byte[] m176161l(long j) {
        if (!this.f295191f.mo56113h()) {
            this.f295191f = C58833ax.m90834k(this.f295188c.mo78881a(this.f295189d, this.f295193h));
        }
        C63088z zVar = (C63088z) C90877ak.m148472f((Future) this.f295191f.mo56107c());
        if (zVar.mo59031d() == 0) {
            return new byte[0];
        }
        long d = (long) zVar.mo59031d();
        long j2 = this.f295192g;
        if (j2 < d) {
            long min = Math.min(j, d - j2);
            long j3 = this.f295192g;
            C63088z k = zVar.mo59039k((int) j3, (int) (j3 + min));
            this.f295192g += min;
            this.f295193h = (int) (((long) this.f295193h) + min);
            return k.mo59174N();
        }
        this.f295192g = 0;
        this.f295191f = C58833ax.m90834k(this.f295188c.mo78881a(this.f295189d, this.f295193h));
        return m176161l(j);
    }

    /* renamed from: a */
    public final int mo5879a(byte[] bArr, int i, int i2) {
        long j;
        if (!this.f295187a) {
            throw new IOException("Trying to read data from an non opened SpeakrLocalDataSource");
        } else if (i2 == 0) {
            return 0;
        } else {
            try {
                long j2 = this.f295195j;
                if (j2 == -1) {
                    j = (long) i2;
                } else {
                    j = Math.min((long) i2, j2 - this.f295194i);
                }
                byte[] l = m176161l(j);
                int length = l.length;
                if (length == 0) {
                    return -1;
                }
                this.f295194i += (long) length;
                mo5927g(length);
                System.arraycopy(l, 0, bArr, i, length);
                return length;
            } catch (ExecutionException e) {
                throw m176160k(e);
            } catch (InterruptedException e2) {
                throw new IOException("Error fetching audio.", e2);
            }
        }
    }

    /* renamed from: b */
    public final long mo5880b(C2510n nVar) {
        this.f295187a = true;
        this.f295190e = nVar.f6891a;
        this.f295193h = (int) nVar.f6896f;
        this.f295192g = 0;
        this.f295195j = nVar.f6897g;
        mo5929i(nVar);
        this.f295191f = C58833ax.m90834k(this.f295188c.mo78881a(this.f295189d, this.f295193h));
        mo5930j(nVar);
        try {
            if (!((C63088z) C90877ak.m148472f((Future) this.f295191f.mo56107c())).mo59173M()) {
                return nVar.f6897g;
            }
            throw new IOException(String.format("Out of range (requested position %s).", new Object[]{Integer.valueOf(this.f295193h)}), new C2506j(2008));
        } catch (ExecutionException e) {
            throw m176160k(e);
        } catch (InterruptedException e2) {
            throw new IOException("Error fetching audio.", e2);
        }
    }

    /* renamed from: c */
    public final Uri mo5881c() {
        if (!this.f295187a) {
            return null;
        }
        return this.f295190e;
    }

    /* renamed from: d */
    public final void mo5882d() {
        if (this.f295187a) {
            this.f295187a = false;
            mo5928h();
        }
    }
}
