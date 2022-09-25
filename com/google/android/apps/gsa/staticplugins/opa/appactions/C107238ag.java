package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.assistant.shared.appactions.ChatBubbleDialogLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.p5805d.C73812a;
import com.google.android.apps.gsa.assistant.shared.appactions.u;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8288a.C107230b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8290c.C107271b;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107277a;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107279c;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8291d.C107290n;
import com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e.C107298a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.concurrent.futuresmixin.C46436b;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.assistant.p3861at.C50463y;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.ag */
/* compiled from: PG */
public final class C107238ag {

    /* renamed from: a */
    public static final C59071e f298441a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.ag");

    /* renamed from: b */
    public final C107324y f298442b;

    /* renamed from: c */
    public final C107290n f298443c;

    /* renamed from: d */
    public final C22871g f298444d;

    /* renamed from: e */
    public final C107230b f298445e;

    /* renamed from: f */
    public final C107279c f298446f;

    /* renamed from: g */
    public final C107298a f298447g;

    /* renamed from: h */
    public final C73812a f298448h;

    /* renamed from: i */
    public final C46439e f298449i;

    /* renamed from: j */
    public final C107271b f298450j;

    /* renamed from: k */
    public final C107306g f298451k;

    /* renamed from: l */
    public final u f298452l;

    /* renamed from: m */
    public final C68214a f298453m;

    /* renamed from: n */
    public final C28310af f298454n;

    /* renamed from: o */
    public final C28443m f298455o;

    /* renamed from: p */
    public final C91189au f298456p;

    /* renamed from: q */
    public final C90021c f298457q;

    /* renamed from: r */
    public final C107264bc f298458r;

    /* renamed from: s */
    public C107305f f298459s;

    /* renamed from: t */
    public ChatBubbleDialogLayout f298460t;

    /* renamed from: u */
    public C107308i f298461u;

    /* renamed from: v */
    public C58833ax f298462v = C58836b.f156633a;

    /* renamed from: w */
    public final C107277a f298463w;

    public C107238ag(C107324y yVar, C22871g gVar, C107290n nVar, C107230b bVar, C107279c cVar, C107277a aVar, C107298a aVar2, C73812a aVar3, C46439e eVar, C68214a aVar4, C28310af afVar, C28443m mVar, u uVar, C91189au auVar, C90021c cVar2, C107264bc bcVar, C107271b bVar2, C107306g gVar2) {
        this.f298442b = yVar;
        this.f298443c = nVar;
        this.f298444d = gVar;
        this.f298445e = bVar;
        this.f298446f = cVar;
        this.f298463w = aVar;
        this.f298447g = aVar2;
        this.f298448h = aVar3;
        this.f298449i = eVar;
        this.f298453m = aVar4;
        this.f298454n = afVar;
        this.f298455o = mVar;
        this.f298452l = uVar;
        this.f298456p = auVar;
        this.f298457q = cVar2;
        this.f298458r = bcVar;
        this.f298450j = bVar2;
        this.f298451k = gVar2;
    }

    /* renamed from: a */
    public final void mo95842a(String str, boolean z) {
        ((C59052c) ((C59052c) f298441a.mo56224b()).mo56372aa(23553)).mo56389s("Updating the shortcut query to \"%s\"", str);
        ChatBubbleDialogLayout chatBubbleDialogLayout = this.f298460t;
        chatBubbleDialogLayout.getClass();
        chatBubbleDialogLayout.i(str);
        C107308i iVar = this.f298461u;
        iVar.getClass();
        C107307h b = iVar.mo95850b();
        b.mo95847c(str);
        this.f298461u = b.mo95845a();
        if (z) {
            mo95844c();
        }
    }

    /* renamed from: b */
    public final void mo95843b() {
        this.f298442b.getActivity().setResult(20);
        this.f298442b.getActivity().finish();
    }

    /* renamed from: c */
    public final void mo95844c() {
        C107279c cVar = this.f298446f;
        C107308i iVar = this.f298461u;
        iVar.getClass();
        C50463y a = cVar.mo95891a(iVar, false);
        C46439e eVar = this.f298449i;
        C46438d a2 = C46438d.m82809a(this.f298443c.mo95894b(a));
        C46436b a3 = C46436b.m82808a(a);
        C107305f fVar = this.f298459s;
        fVar.getClass();
        eVar.mo50445g(a2, a3, fVar);
    }
}
