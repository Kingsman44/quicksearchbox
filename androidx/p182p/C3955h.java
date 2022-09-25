package androidx.p182p;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p186q.p187a.C4049d;
import androidx.p186q.p187a.C4056k;
import androidx.p186q.p187a.C4057l;
import p5462h.C69788q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.p.h */
/* compiled from: PG */
public final class C3955h implements C4049d {

    /* renamed from: a */
    public final C3938c f12642a;

    public C3955h(C3938c cVar) {
        this.f12642a = cVar;
    }

    /* renamed from: a */
    public final Cursor mo8241a(C4056k kVar) {
        C69664n.m101061g(kVar, "query");
        try {
            Cursor a = this.f12642a.mo8221a().mo8241a(kVar);
            C69664n.m101060f(a, "try {\n                au…w throwable\n            }");
            return new C3960m(a, this.f12642a);
        } catch (Throwable th) {
            this.f12642a.mo8224d();
            throw th;
        }
    }

    /* renamed from: b */
    public final Cursor mo8242b(String str) {
        throw null;
    }

    /* renamed from: c */
    public final Cursor mo8243c(C4056k kVar, CancellationSignal cancellationSignal) {
        C69664n.m101061g(kVar, "query");
        try {
            Cursor c = this.f12642a.mo8221a().mo8243c(kVar, cancellationSignal);
            C69664n.m101060f(c, "try {\n                au…w throwable\n            }");
            return new C3960m(c, this.f12642a);
        } catch (Throwable th) {
            this.f12642a.mo8224d();
            throw th;
        }
    }

    public final void close() {
        this.f12642a.mo8223c();
    }

    /* renamed from: d */
    public final C4057l mo8245d(String str) {
        C69664n.m101061g(str, "sql");
        return new C3959l(str, this.f12642a);
    }

    /* renamed from: e */
    public final void mo8246e() {
        try {
            this.f12642a.mo8221a().mo8246e();
        } catch (Throwable th) {
            this.f12642a.mo8224d();
            throw th;
        }
    }

    /* renamed from: f */
    public final void mo8247f() {
        try {
            this.f12642a.mo8221a().mo8247f();
        } catch (Throwable th) {
            this.f12642a.mo8224d();
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo8248g() {
        C4049d dVar = this.f12642a.f12605h;
        if (dVar != null) {
            try {
                dVar.mo8248g();
            } finally {
                this.f12642a.mo8224d();
            }
        } else {
            throw new IllegalStateException("End transaction called but delegateDb is null");
        }
    }

    /* renamed from: h */
    public final void mo8249h(String str) {
        this.f12642a.mo8222b(new C3951d(str));
    }

    /* renamed from: i */
    public final void mo8250i() {
        C69788q qVar;
        C4049d dVar = this.f12642a.f12605h;
        if (dVar != null) {
            dVar.mo8250i();
            qVar = C69788q.f186170a;
        } else {
            qVar = null;
        }
        if (qVar == null) {
            throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
        }
    }

    /* renamed from: j */
    public final boolean mo8251j() {
        C3938c cVar = this.f12642a;
        if (cVar.f12605h == null) {
            return false;
        }
        return ((Boolean) cVar.mo8222b(C3952e.f12639a)).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo8252k() {
        C4049d dVar = this.f12642a.f12605h;
        if (dVar == null) {
            return false;
        }
        return dVar.mo8252k();
    }

    /* renamed from: l */
    public final boolean mo8253l() {
        return ((Boolean) this.f12642a.mo8222b(C3953f.f12640a)).booleanValue();
    }

    /* renamed from: m */
    public final void mo8254m(Object[] objArr) {
        throw null;
    }

    /* renamed from: n */
    public final void mo8255n(String str, int i, ContentValues contentValues, String str2, Object[] objArr) {
        throw null;
    }
}
