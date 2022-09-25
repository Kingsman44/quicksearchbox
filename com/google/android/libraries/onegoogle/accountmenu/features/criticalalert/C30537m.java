package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.app.Activity;
import com.google.android.gms.p10815k.C144415o;
import com.google.android.gms.p10815k.C144416p;
import com.google.android.gms.p10815k.C144417q;
import com.google.android.gms.p10815k.p10816a.C144376ar;
import com.google.android.gms.p10815k.p10816a.C144378c;
import com.google.android.gms.p10815k.p10816a.C144382g;
import com.google.android.gms.p10815k.p10816a.C144393r;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2348d.C30171a;
import com.google.android.libraries.onegoogle.account.particle.C30240n;
import com.google.common.p4522b.C58495hd;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53933b;
import com.google.p4017at.p4049f.p4050a.p4051a.p4052a.C53935d;
import com.google.protobuf.C62995dn;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.m */
/* compiled from: PG */
public final class C30537m extends C30535k {

    /* renamed from: i */
    private final C144416p f82480i;

    /* renamed from: j */
    private final C144417q f82481j = new C30536l(this);

    /* renamed from: k */
    private String f82482k;

    public C30537m(C144416p pVar, C30158c cVar) {
        super(cVar);
        this.f82480i = pVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo5677g() {
        C144416p pVar = this.f82480i;
        C144393r.f390971b.mo119876b(this.f82481j, new C144378c((C144376ar) pVar));
        C144393r.m234671c((C144376ar) this.f82480i);
        String str = this.f82482k;
        if (str != null) {
            C144393r.m234669a(str, (C144376ar) this.f82480i);
            this.f82482k = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo5678h() {
        C144416p pVar = this.f82480i;
        C144393r.f390971b.mo119877c(this.f82481j, new C144382g((C144376ar) pVar));
    }

    /* renamed from: s */
    public final void mo36193s(String str, C144415o oVar) {
        C144393r.m234670b(str, oVar.f391006a, (C144376ar) this.f82480i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final void mo36194t(C30240n nVar, Activity activity, boolean z) {
        C53933b bVar = (C53933b) C53935d.f141520d.createBuilder();
        bVar.copyOnWrite();
        C53935d dVar = (C53935d) bVar.instance;
        dVar.f141522a |= 1;
        dVar.f141523b = 409;
        C58495hd s = C58495hd.m89905s("rfn", nVar.mo35716c(), "rfnc", nVar.mo35717d(), "security-event-id", nVar.mo35718e(), "sa", String.valueOf(z), "ve", String.valueOf(C30541q.m57025a(z)), "origin", "8");
        bVar.copyOnWrite();
        C53935d dVar2 = (C53935d) bVar.instance;
        C62995dn dnVar = dVar2.f141524c;
        if (!dnVar.f170058b) {
            dVar2.f141524c = dnVar.mo58980a();
        }
        dVar2.f141524c.putAll(s);
        String b = nVar.mo35715b();
        this.f82482k = b;
        C30171a.m56063b(activity, b, (C53935d) bVar.build());
    }
}
