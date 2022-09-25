package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;

/* renamed from: dagger.b.a.c */
/* compiled from: PG */
final class C68242c extends C60873d implements Runnable {

    /* renamed from: a */
    private C60870cx f184603a;

    public C68242c(C60870cx cxVar) {
        this.f184603a = cxVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        this.f184603a = null;
    }

    /* renamed from: e */
    public final boolean mo60302e() {
        return super.mo57359q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: hT */
    public final String mo45912hT() {
        C60870cx cxVar = this.f184603a;
        if (cxVar == null) {
            return null;
        }
        return "delegate=[" + cxVar + "]";
    }

    public final void run() {
        C60870cx cxVar = this.f184603a;
        if (cxVar != null) {
            mo57358p(cxVar);
        }
    }
}
