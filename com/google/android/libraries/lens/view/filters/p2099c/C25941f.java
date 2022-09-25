package com.google.android.libraries.lens.view.filters.p2099c;

import android.content.Context;
import androidx.lifecycle.C2331af;
import androidx.lifecycle.C2333ah;
import androidx.lifecycle.C2391v;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.p2101e.C25976a;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d;
import com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25981e;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26120dc;
import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2078at.C25497ac;

/* renamed from: com.google.android.libraries.lens.view.filters.c.f */
/* compiled from: PG */
public final class C25941f {

    /* renamed from: a */
    public String f70476a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f70477b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f70478c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C25497ac f70479d = C25497ac.NONE;

    /* renamed from: e */
    public boolean f70480e = true;

    /* renamed from: f */
    public boolean f70481f;

    /* renamed from: g */
    public boolean f70482g;

    /* renamed from: h */
    private final Context f70483h;

    /* renamed from: i */
    private final LensConnectivityManager f70484i;

    /* renamed from: j */
    private final C2331af f70485j = new C2331af();

    /* renamed from: k */
    private final C26059ax f70486k;

    /* renamed from: l */
    private final C25976a f70487l;

    /* renamed from: m */
    private final C26120dc f70488m;

    /* renamed from: n */
    private final boolean f70489n;

    /* renamed from: o */
    private final boolean f70490o;

    /* renamed from: p */
    private final boolean f70491p;

    /* renamed from: q */
    private C25981e f70492q;

    /* renamed from: r */
    private boolean f70493r;

    public C25941f(C26244b bVar, Context context, LensConnectivityManager lensConnectivityManager, C26059ax axVar, C25976a aVar, C26120dc dcVar, boolean z, boolean z2) {
        this.f70483h = context.getApplicationContext();
        this.f70484i = lensConnectivityManager;
        this.f70486k = axVar;
        this.f70487l = aVar;
        this.f70488m = dcVar;
        this.f70489n = z;
        this.f70490o = z2;
        this.f70491p = bVar.mo31462g(C26239a.PARTIAL_TRANSLATE_GUIDANCE_ENABLED);
    }

    /* renamed from: e */
    private final boolean m47848e() {
        C25981e eVar = this.f70492q;
        return eVar != null && eVar.mo31185d().equals(C25980d.TRANSLATE);
    }

    /* renamed from: a */
    public final void mo31108a() {
        this.f70477b = BuildConfig.FLAVOR;
        this.f70478c = BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    public final void mo31109b(C2391v vVar, C2333ah ahVar) {
        if (!this.f70493r) {
            this.f70485j.mo5727n(this.f70484i.mo30903g(), new C25937b(this));
            this.f70485j.mo5727n(this.f70486k.f70830t, new C25938c(this));
            C2331af afVar = this.f70485j;
            C26059ax axVar = this.f70486k;
            axVar.mo31256k();
            afVar.mo5727n(axVar.f70826p, new C25939d(this));
            if (this.f70491p) {
                this.f70485j.mo5727n(this.f70488m.f70975a, new C25937b(this));
            }
            this.f70493r = true;
        }
        this.f70485j.mo5704e(vVar, ahVar);
        mo31111d();
    }

    /* renamed from: c */
    public final void mo31110c(C25981e eVar) {
        if (!eVar.equals(this.f70492q)) {
            this.f70492q = eVar;
            mo31108a();
            mo31111d();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo31111d() {
        /*
            r5 = this;
            boolean r0 = r5.f70480e
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x00c6
            com.google.android.libraries.lens.view.at.ac r0 = r5.f70479d
            boolean r0 = r0.mo30526c()
            if (r0 == 0) goto L_0x00c6
            com.google.android.libraries.lens.view.filters.e.a.e r0 = r5.f70492q
            if (r0 == 0) goto L_0x0022
            com.google.android.libraries.lens.view.filters.e.a r2 = r5.f70487l
            com.google.android.libraries.lens.view.filters.e.a.d r0 = r0.mo31185d()
            com.google.android.libraries.lens.view.at.ac r3 = r5.f70479d
            boolean r0 = r2.mo31167a(r0, r3)
            if (r0 == 0) goto L_0x0022
            goto L_0x00c6
        L_0x0022:
            java.lang.String r0 = r5.f70476a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = r5.f70476a
            goto L_0x00c7
        L_0x002e:
            com.google.android.libraries.lens.view.connectivity.LensConnectivityManager r0 = r5.f70484i
            com.google.android.libraries.lens.view.d.a r0 = r0.mo30903g()
            java.lang.Object r0 = r0.mo3842a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0043
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x008e
        L_0x0043:
            boolean r0 = r5.m47848e()
            if (r0 == 0) goto L_0x0081
            com.google.android.libraries.lens.view.filters.translation.ax r0 = r5.f70486k
            androidx.lifecycle.ag r0 = r0.f70830t
            java.lang.Object r0 = r0.mo3842a()
            if (r0 == 0) goto L_0x0081
            com.google.android.libraries.lens.view.filters.translation.ax r0 = r5.f70486k
            r0.mo31256k()
            com.google.android.libraries.lens.view.d.g r0 = r0.f70826p
            java.lang.Object r0 = r0.mo3842a()
            com.google.android.libraries.lens.view.filters.translation.cz r0 = (com.google.android.libraries.lens.view.filters.translation.C26116cz) r0
            if (r0 == 0) goto L_0x0081
            com.google.android.libraries.lens.view.filters.translation.ax r2 = r5.f70486k
            java.util.Locale r3 = r0.mo31306a()
            com.google.android.libraries.lens.view.filters.translation.ag r4 = com.google.android.libraries.lens.view.filters.translation.C26042ag.f70763a
            boolean r2 = r2.mo31267v(r3, r4)
            if (r2 == 0) goto L_0x0081
            com.google.android.libraries.lens.view.filters.translation.ax r2 = r5.f70486k
            java.util.Locale r0 = r0.mo31307b()
            com.google.android.libraries.lens.view.filters.translation.ag r3 = com.google.android.libraries.lens.view.filters.translation.C26042ag.f70763a
            boolean r0 = r2.mo31267v(r0, r3)
            if (r0 == 0) goto L_0x0081
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
            goto L_0x008e
        L_0x0081:
            android.content.Context r0 = r5.f70483h
            r2 = 2132088843(0x7f15180b, float:1.981798E38)
            java.lang.String r0 = r0.getString(r2)
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x008e:
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x009b
            java.lang.Object r0 = r0.mo56107c()
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00c7
        L_0x009b:
            boolean r0 = r5.f70490o
            if (r0 == 0) goto L_0x00b3
            com.google.android.libraries.lens.view.filters.e.a.e r0 = r5.f70492q
            if (r0 == 0) goto L_0x00b0
            com.google.android.libraries.lens.view.filters.e.a.d r0 = r0.mo31185d()
            com.google.android.libraries.lens.view.filters.e.a.d r2 = com.google.android.libraries.lens.view.filters.p2101e.p2102a.C25980d.AUTO_FILTER
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b0
            goto L_0x00b3
        L_0x00b0:
            java.lang.String r0 = r5.f70477b
            goto L_0x00c7
        L_0x00b3:
            com.google.android.libraries.lens.view.filters.e.a.e r0 = r5.f70492q
            if (r0 != 0) goto L_0x00b8
            goto L_0x00c6
        L_0x00b8:
            boolean r2 = r5.f70489n
            if (r2 == 0) goto L_0x00c1
            java.lang.String r0 = r0.mo31188f()
            goto L_0x00c7
        L_0x00c1:
            java.lang.String r0 = r0.mo31189g()
            goto L_0x00c7
        L_0x00c6:
            r0 = r1
        L_0x00c7:
            com.google.android.libraries.lens.view.at.ac r2 = r5.f70479d
            boolean r2 = r2.mo30525b()
            if (r2 != 0) goto L_0x00d0
            goto L_0x00f7
        L_0x00d0:
            boolean r2 = r5.f70491p
            if (r2 == 0) goto L_0x00f0
            com.google.android.libraries.lens.view.filters.translation.dc r2 = r5.f70488m
            boolean r2 = r2.mo31318k()
            if (r2 == 0) goto L_0x00f0
            boolean r2 = r5.f70481f
            if (r2 != 0) goto L_0x00f0
            boolean r2 = r5.m47848e()
            if (r2 == 0) goto L_0x00f0
            android.content.Context r1 = r5.f70483h
            r2 = 2132088954(0x7f15187a, float:1.9818206E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x00f7
        L_0x00f0:
            boolean r2 = r5.f70482g
            if (r2 != 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r1 = r5.f70478c
        L_0x00f7:
            com.google.android.libraries.lens.view.filters.c.a r2 = new com.google.android.libraries.lens.view.filters.c.a
            r2.<init>(r0, r1)
            androidx.lifecycle.af r0 = r5.f70485j
            java.lang.Object r0 = r0.mo3842a()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x010d
            androidx.lifecycle.af r0 = r5.f70485j
            r0.mo5708l(r2)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.filters.p2099c.C25941f.mo31111d():void");
    }
}
