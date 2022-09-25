package androidx.mediarouter.p175a;

import android.os.Bundle;

/* renamed from: androidx.mediarouter.a.bt */
/* compiled from: PG */
final class C3711bt extends C3745r implements C3707bp {

    /* renamed from: a */
    final /* synthetic */ C3713bv f11915a;

    /* renamed from: b */
    private final String f11916b;

    /* renamed from: c */
    private boolean f11917c;

    /* renamed from: d */
    private int f11918d = -1;

    /* renamed from: e */
    private int f11919e;

    /* renamed from: f */
    private C3706bo f11920f;

    /* renamed from: g */
    private int f11921g = -1;

    public C3711bt(C3713bv bvVar, String str) {
        this.f11915a = bvVar;
        this.f11916b = str;
    }

    /* renamed from: a */
    public final void mo7816a() {
        this.f11915a.mo7830l(this);
    }

    /* renamed from: b */
    public final void mo7817b(int i) {
        C3706bo boVar = this.f11920f;
        if (boVar != null) {
            boVar.mo7808d(this.f11921g, i);
            return;
        }
        this.f11918d = i;
        this.f11919e = 0;
    }

    /* renamed from: c */
    public final void mo7818c(int i) {
        C3706bo boVar = this.f11920f;
        if (boVar != null) {
            boVar.mo7810f(this.f11921g, i);
        } else {
            this.f11919e += i;
        }
    }

    /* renamed from: d */
    public final int mo7812d() {
        return this.f11921g;
    }

    /* renamed from: e */
    public final void mo7813e(C3706bo boVar) {
        C3710bs bsVar = new C3710bs(this);
        this.f11920f = boVar;
        String str = this.f11916b;
        int i = boVar.f11907d;
        boVar.f11907d = i + 1;
        int i2 = boVar.f11906c;
        boVar.f11906c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        boVar.mo7811g(11, i2, i, (Object) null, bundle);
        boVar.f11910g.put(i2, bsVar);
        this.f11921g = i;
        if (this.f11917c) {
            boVar.mo7805b(i);
            int i3 = this.f11918d;
            if (i3 >= 0) {
                boVar.mo7808d(this.f11921g, i3);
                this.f11918d = -1;
            }
            int i4 = this.f11919e;
            if (i4 != 0) {
                boVar.mo7810f(this.f11921g, i4);
                this.f11919e = 0;
            }
        }
    }

    /* renamed from: f */
    public final void mo7814f() {
        C3706bo boVar = this.f11920f;
        if (boVar != null) {
            boVar.mo7804a(this.f11921g);
            this.f11920f = null;
            this.f11921g = 0;
        }
    }

    /* renamed from: g */
    public final void mo7819g() {
        this.f11917c = true;
        C3706bo boVar = this.f11920f;
        if (boVar != null) {
            boVar.mo7805b(this.f11921g);
        }
    }

    /* renamed from: h */
    public final void mo7820h() {
        mo7821i(0);
    }

    /* renamed from: i */
    public final void mo7821i(int i) {
        this.f11917c = false;
        C3706bo boVar = this.f11920f;
        if (boVar != null) {
            boVar.mo7809e(this.f11921g, i);
        }
    }
}
