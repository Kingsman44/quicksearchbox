package androidx.mediarouter.p175a;

import android.os.Bundle;

/* renamed from: androidx.mediarouter.a.bu */
/* compiled from: PG */
final class C3712bu extends C3748u implements C3707bp {

    /* renamed from: a */
    final /* synthetic */ C3713bv f11922a;

    /* renamed from: b */
    private final String f11923b;

    /* renamed from: c */
    private final String f11924c;

    /* renamed from: d */
    private boolean f11925d;

    /* renamed from: e */
    private int f11926e = -1;

    /* renamed from: f */
    private int f11927f;

    /* renamed from: g */
    private C3706bo f11928g;

    /* renamed from: h */
    private int f11929h;

    public C3712bu(C3713bv bvVar, String str, String str2) {
        this.f11922a = bvVar;
        this.f11923b = str;
        this.f11924c = str2;
    }

    /* renamed from: a */
    public final void mo7816a() {
        this.f11922a.mo7830l(this);
    }

    /* renamed from: b */
    public final void mo7817b(int i) {
        C3706bo boVar = this.f11928g;
        if (boVar != null) {
            boVar.mo7808d(this.f11929h, i);
            return;
        }
        this.f11926e = i;
        this.f11927f = 0;
    }

    /* renamed from: c */
    public final void mo7818c(int i) {
        C3706bo boVar = this.f11928g;
        if (boVar != null) {
            boVar.mo7810f(this.f11929h, i);
        } else {
            this.f11927f += i;
        }
    }

    /* renamed from: d */
    public final int mo7812d() {
        return this.f11929h;
    }

    /* renamed from: e */
    public final void mo7813e(C3706bo boVar) {
        this.f11928g = boVar;
        String str = this.f11923b;
        String str2 = this.f11924c;
        int i = boVar.f11907d;
        boVar.f11907d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = boVar.f11906c;
        boVar.f11906c = i2 + 1;
        boVar.mo7811g(3, i2, i, (Object) null, bundle);
        this.f11929h = i;
        if (this.f11925d) {
            boVar.mo7805b(i);
            int i3 = this.f11926e;
            if (i3 >= 0) {
                boVar.mo7808d(this.f11929h, i3);
                this.f11926e = -1;
            }
            int i4 = this.f11927f;
            if (i4 != 0) {
                boVar.mo7810f(this.f11929h, i4);
                this.f11927f = 0;
            }
        }
    }

    /* renamed from: f */
    public final void mo7814f() {
        C3706bo boVar = this.f11928g;
        if (boVar != null) {
            boVar.mo7804a(this.f11929h);
            this.f11928g = null;
            this.f11929h = 0;
        }
    }

    /* renamed from: g */
    public final void mo7819g() {
        this.f11925d = true;
        C3706bo boVar = this.f11928g;
        if (boVar != null) {
            boVar.mo7805b(this.f11929h);
        }
    }

    /* renamed from: h */
    public final void mo7820h() {
        mo7821i(0);
    }

    /* renamed from: i */
    public final void mo7821i(int i) {
        this.f11925d = false;
        C3706bo boVar = this.f11928g;
        if (boVar != null) {
            boVar.mo7809e(this.f11929h, i);
        }
    }
}
