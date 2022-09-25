package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6648ch.C85107a;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.accl.p7338h.C92847b;
import com.google.android.libraries.gsa.conversation.p1852f.C22589p;
import com.google.android.libraries.gsa.conversation.p1852f.C22591r;
import com.google.android.libraries.gsa.conversation.p1852f.C22592s;
import com.google.android.libraries.gsa.conversation.p1852f.C22593t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.bb */
/* compiled from: PG */
public final class C92792bb implements C22593t {

    /* renamed from: d */
    public static final /* synthetic */ int f258934d = 0;

    /* renamed from: e */
    private static final C118575h f258935e = C118575h.UNKNOWN_WORKLOAD;

    /* renamed from: a */
    public final C22871g f258936a;

    /* renamed from: b */
    public final C92847b f258937b;

    /* renamed from: c */
    public final C85107a f258938c;

    /* renamed from: f */
    private final C69464a f258939f;

    /* renamed from: g */
    private final C68214a f258940g;

    /* renamed from: h */
    private final C92804m f258941h;

    /* renamed from: i */
    private final C92768af f258942i;

    /* renamed from: j */
    private final boolean f258943j;

    public C92792bb(C22871g gVar, C69464a aVar, C68214a aVar2, C92804m mVar, C92768af afVar, C92847b bVar, C85107a aVar3, boolean z) {
        this.f258936a = gVar;
        this.f258939f = aVar;
        this.f258940g = aVar2;
        this.f258941h = mVar;
        this.f258942i = afVar;
        this.f258937b = bVar;
        this.f258938c = aVar3;
        this.f258943j = z;
    }

    /* renamed from: a */
    public final C22592s mo27696a(C60870cx cxVar, C22591r rVar, C22589p pVar) {
        C89356b b = ((C84466a) this.f258939f.mo17428b()).mo78026b("OpaAcclVoiceSearch", C118575h.GRAPH_NETWORK_SPEECHIE_VOICE_SEARCH, f258935e);
        C89061q a = ((C89037bh) this.f258940g.mo27525b()).mo27376a(53, C89066v.f241382a);
        C60870cx cxVar2 = cxVar;
        C60870cx g = C60922j.m93044g(cxVar, new C92782at(this, rVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        C60870cx h = C60922j.m93045h(g, new C92783au(this, b, a, pVar), C60826bg.f164896a);
        C60870cx h2 = C60922j.m93045h(h, new C92784av(g), C60826bg.f164896a);
        this.f258936a.mo28211k(h2, "SpeechieVoiceInputSendeMaybe fail SR on VR done", new C92764ab());
        C60870cx h3 = C60922j.m93045h(h2, C92785aw.f258925a, C60826bg.f164896a);
        C60870cx h4 = C60922j.m93045h(h2, C92786ax.f258926a, C60826bg.f164896a);
        C92768af afVar = this.f258942i;
        C58833ax b2 = rVar.mo27679b();
        C60870cx h5 = C60922j.m93045h(h2, C92787ay.f258927a, C60826bg.f164896a);
        boolean z = this.f258943j;
        b2.getClass();
        ((C90476a) afVar.f258889a.mo17428b()).getClass();
        C92811t tVar = (C92811t) afVar.f258890b.mo17428b();
        tVar.getClass();
        C92767ae aeVar = new C92767ae(b2, b, h, h3, h5, h4, z, tVar);
        C92810s sVar = aeVar.f258882a;
        this.f258941h.mo87460a(sVar.f258981a, h4, sVar.mo87463c(), C58836b.f156633a);
        return aeVar;
    }
}
