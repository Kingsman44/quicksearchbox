package com.google.android.libraries.assistant.auto.ondevice.p708b;

import android.text.TextUtils;
import com.google.android.apps.gsa.g.c.b;
import com.google.android.apps.gsa.g.g.a;
import com.google.android.apps.gsa.g.g.c;
import com.google.android.apps.gsa.p496a.p500c.C9309a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85713a;
import com.google.android.apps.gsa.search.core.carassistant.p6784f.C85726n;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11942e;
import com.google.android.libraries.assistant.auto.ondevice.utils.C11943f;
import com.google.android.libraries.assistant.auto.ondevice.utils.CommsNlgUtil;
import com.google.android.libraries.assistant.auto.ondevice.utils.SemanticsBuilderUtil;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4242bp.p4243a.p4246c.C56159d;
import com.google.speech.grammar.pumpkin.C66525q;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.b.c */
/* compiled from: PG */
public final class C11846c {

    /* renamed from: a */
    public static final C58974d f38105a = C58974d.m91134h("OfflineDispatcher");

    /* renamed from: b */
    public final C86124t f38106b;

    /* renamed from: c */
    public final C11839aa f38107c;

    /* renamed from: d */
    public final C11853j f38108d;

    /* renamed from: e */
    public final C11841ac f38109e;

    /* renamed from: f */
    public final C11843ae f38110f;

    /* renamed from: g */
    public final C11868y f38111g;

    /* renamed from: h */
    public final C11861r f38112h;

    /* renamed from: i */
    public final C11856m f38113i;

    /* renamed from: j */
    public final C11860q f38114j;

    /* renamed from: k */
    public final C11869z f38115k;

    /* renamed from: l */
    public final C11859p f38116l;

    /* renamed from: m */
    public final C11848e f38117m;

    /* renamed from: n */
    public final b f38118n;

    /* renamed from: o */
    public final C85726n f38119o;

    /* renamed from: p */
    public final C86054o f38120p;

    /* renamed from: q */
    public C66525q f38121q = C66525q.f180929f;

    /* renamed from: r */
    public C58833ax f38122r = C58836b.f156633a;

    /* renamed from: s */
    public final C11844af f38123s;

    /* renamed from: t */
    public final C11857n f38124t;

    public C11846c(C86124t tVar, C11839aa aaVar, C11853j jVar, C11842ad adVar, C11843ae aeVar, C11844af afVar, C11868y yVar, C11861r rVar, C11856m mVar, C11860q qVar, C11869z zVar, C11859p pVar, C11848e eVar, C11857n nVar, b bVar, C85726n nVar2, C86054o oVar, C56159d dVar) {
        C11842ad adVar2 = adVar;
        this.f38106b = tVar;
        this.f38107c = aaVar;
        this.f38108d = jVar;
        SemanticsBuilderUtil semanticsBuilderUtil = (SemanticsBuilderUtil) adVar2.f38061a.mo17428b();
        semanticsBuilderUtil.getClass();
        b bVar2 = (b) adVar2.f38062b.mo17428b();
        bVar2.getClass();
        c cVar = (c) adVar2.f38063c.mo17428b();
        cVar.getClass();
        C11943f fVar = (C11943f) adVar2.f38064d.mo17428b();
        fVar.getClass();
        C11942e eVar2 = (C11942e) adVar2.f38065e.mo17428b();
        eVar2.getClass();
        C22871g gVar = (C22871g) adVar2.f38066f.mo17428b();
        gVar.getClass();
        C86124t tVar2 = (C86124t) adVar2.f38067g.mo17428b();
        tVar2.getClass();
        a aVar = (a) adVar2.f38068h.mo17428b();
        aVar.getClass();
        CommsNlgUtil commsNlgUtil = (CommsNlgUtil) adVar2.f38069i.mo17428b();
        commsNlgUtil.getClass();
        C86054o oVar2 = (C86054o) adVar2.f38070j.mo17428b();
        oVar2.getClass();
        C85713a aVar2 = (C85713a) adVar2.f38071k.mo17428b();
        aVar2.getClass();
        C9309a aVar3 = (C9309a) adVar2.f38072l.mo17428b();
        aVar3.getClass();
        this.f38109e = new C11841ac(semanticsBuilderUtil, bVar2, cVar, fVar, eVar2, gVar, tVar2, aVar, commsNlgUtil, oVar2, aVar2, aVar3, dVar);
        this.f38110f = aeVar;
        this.f38111g = yVar;
        this.f38112h = rVar;
        this.f38123s = afVar;
        this.f38113i = mVar;
        this.f38114j = qVar;
        this.f38115k = zVar;
        this.f38116l = pVar;
        this.f38117m = eVar;
        this.f38124t = nVar;
        this.f38118n = bVar;
        this.f38119o = nVar2;
        this.f38120p = oVar;
    }

    /* renamed from: a */
    public final boolean mo20221a(String str) {
        if (!TextUtils.equals("SendMessageFollowOn", str)) {
            return false;
        }
        b bVar = this.f38118n;
        return bVar.b && bVar.c.equals("SendMessage");
    }

    /* renamed from: b */
    public final boolean mo20222b() {
        return this.f38118n.f() && TextUtils.equals("SearchMessage", this.f38118n.c);
    }

    /* renamed from: c */
    public final boolean mo20223c(String str) {
        if (TextUtils.equals("SearchMessageFollowOn", str)) {
            return true;
        }
        if (!TextUtils.equals("SendMessageFollowOn", str) || !mo20222b()) {
            return false;
        }
        return true;
    }
}
