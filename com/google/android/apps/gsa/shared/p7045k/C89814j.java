package com.google.android.apps.gsa.shared.p7045k;

import android.content.Context;
import androidx.annotation.C0825a;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3687aw;
import androidx.mediarouter.p175a.C3752y;
import androidx.mediarouter.p175a.C3753z;
import com.google.android.gms.cast.C143606o;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.common.p4522b.C58373cq;
import com.google.common.p4522b.C58374cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;

/* renamed from: com.google.android.apps.gsa.shared.k.j */
/* compiled from: PG */
public final class C89814j implements C89810f {

    /* renamed from: a */
    public final C3753z f243099a;

    /* renamed from: b */
    private final C3687aw f243100b;

    /* renamed from: c */
    private C3665aa f243101c;

    /* renamed from: d */
    private boolean f243102d;

    public C89814j(Context context) {
        C58733pz pzVar = C58733pz.f156496a;
        this.f243100b = C3687aw.m10683e(context);
        C3752y yVar = new C3752y();
        yVar.mo7923c("com.google.android.gms.cast.CATEGORY_CAST");
        yVar.mo7923c(C143606o.m233298a("CC1AD845"));
        this.f243099a = yVar.mo7921a();
    }

    /* renamed from: a */
    public final void mo83669a() {
        C22872h.m42743c(C0825a.class);
        if (this.f243102d) {
            this.f243102d = false;
            this.f243100b.mo7774j(this.f243101c);
            this.f243101c = null;
            C58733pz pzVar = C58733pz.f156496a;
        }
    }

    /* renamed from: b */
    public final void mo83670b(C89823s sVar) {
        C22872h.m42743c(C0825a.class);
        if (!this.f243102d) {
            this.f243102d = true;
            C89811g gVar = new C89811g(sVar);
            this.f243101c = gVar;
            this.f243100b.mo7773h(this.f243099a, gVar, 1);
            C58528ij<C89809e> F = C58528ij.m90006F(new C58373cq(C58374cr.m89410b(this.f243100b.mo7772g(), new C89812h(this)), new C89813i()));
            if (!F.isEmpty()) {
                for (C89809e a : F) {
                    sVar.mo83671a(a);
                }
            }
        }
    }
}
