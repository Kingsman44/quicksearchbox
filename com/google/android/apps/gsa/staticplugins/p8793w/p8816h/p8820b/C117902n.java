package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84378x;
import com.google.android.apps.gsa.search.core.p6519al.p6524ab.C84617a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.core.service.p6848e.C86683e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C87684al;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88260vb;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88261vc;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88262vd;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88380zn;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88381zo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88382zp;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.C90086ek;
import com.google.android.apps.gsa.shared.util.C90738av;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.accl.C92718b;
import com.google.android.libraries.assistant.auto.ondevice.p714f.C11907a;
import com.google.android.libraries.assistant.auto.ondevice.p714f.C11908b;
import com.google.android.libraries.assistant.auto.ondevice.p714f.C11909c;
import com.google.android.libraries.assistant.auto.ondevice.p714f.C11911e;
import com.google.android.libraries.gsa.conversation.p1855h.C22688aa;
import com.google.android.libraries.gsa.conversation.p1855h.C22689ab;
import com.google.android.libraries.gsa.conversation.p1855h.C22697b;
import com.google.android.libraries.gsa.conversation.p1855h.C22708l;
import com.google.android.libraries.gsa.conversation.p1855h.C22717u;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58847bk;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4553a.C59449a;
import com.google.common.p4552o.p4553a.C59476b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.b.n */
/* compiled from: PG */
public final class C117902n extends C22697b {

    /* renamed from: e */
    private static final C59071e f327243e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.b.n");

    /* renamed from: a */
    public final C68214a f327244a;

    /* renamed from: b */
    public final C68214a f327245b;

    /* renamed from: c */
    boolean f327246c;

    /* renamed from: f */
    private final C86683e f327247f;

    /* renamed from: g */
    private final C84378x f327248g;

    /* renamed from: h */
    private final int f327249h;

    /* renamed from: i */
    private final C68214a f327250i;

    /* renamed from: j */
    private final C84617a f327251j;

    /* renamed from: k */
    private final ConcurrentMap f327252k = new ConcurrentHashMap();

    /* renamed from: l */
    private final C68214a f327253l;

    /* renamed from: m */
    private final C86124t f327254m;

    /* renamed from: n */
    private final C22871g f327255n;

    /* renamed from: o */
    private final C11911e f327256o;

    public C117902n(int i, C86683e eVar, C117894f fVar, C68214a aVar, C84617a aVar2, C68214a aVar3, C86124t tVar, C68214a aVar4, C68214a aVar5, C22871g gVar, C11911e eVar2) {
        this.f327249h = i;
        this.f327247f = eVar;
        this.f327248g = fVar;
        this.f327250i = aVar;
        this.f327251j = aVar2;
        this.f327253l = aVar3;
        this.f327254m = tVar;
        this.f327244a = aVar4;
        this.f327245b = aVar5;
        this.f327255n = gVar;
        this.f327256o = eVar2;
    }

    /* renamed from: a */
    public final void mo27813a(C22722z zVar) {
        if (this.f327249h != 3) {
            C58976aa aaVar = C58975e.f156826a;
            SettableFuture m = mo103481m(zVar.mo27879f());
            if (!m.isDone()) {
                m.mo57356n(C118826c.f331422a);
            }
            C84378x xVar = this.f327248g;
            Objects.requireNonNull(xVar);
            m42246p(zVar, new C117897i(xVar));
            this.f327248g.mo77899d(zVar);
        }
    }

    /* renamed from: b */
    public final C60870cx mo27814b(C51809dy dyVar, C58833ax axVar) {
        C60870cx cxVar;
        C11911e eVar = this.f327256o;
        C86683e eVar2 = this.f327247f;
        if (dyVar.f135936b.equals("ui.SHOW_NATIVE_FORM")) {
            try {
                C51807dw dwVar = dyVar.f135938d;
                if (dwVar == null) {
                    dwVar = C51807dw.f135930b;
                }
                C63010eb parserForType = C51953ff.f136315l.getParserForType();
                for (C52232kc kcVar : dwVar.f135932a) {
                    if ("show_native_form_args".equals(kcVar.f137065b)) {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        boolean equals = ((C51953ff) ((C58847bk) C58833ax.m90834k((C51953ff) ((MessageLite) parserForType.mo59011j(kaVar.f137061c, C62921ba.m95368a())))).f156646a).f136321e.equals("REPLY_INTENT_SELECTION");
                        if (eVar.f38291c.mo79746e(C90086ek.f250280aE) && equals) {
                            C60870cx a = eVar.f38290b.mo20297a();
                            C11909c cVar = new C11909c(dyVar);
                            C60870cx e = C90877ak.m148471e(C60922j.m93045h(a, C47810es.m84966f(cVar), C60826bg.f164896a), eVar.f38291c.mo79743a(C90086ek.f250278aC), TimeUnit.MILLISECONDS, eVar.f38292d);
                            C11907a aVar = new C11907a(dyVar);
                            C60870cx g = C60846c.m92878g(e, Throwable.class, C47810es.m84963c(aVar), C60826bg.f164896a);
                            C87682aj ajVar = eVar2.f234157a;
                            if (ajVar != null) {
                                C11908b bVar = new C11908b(ajVar);
                                cxVar = C60922j.m93044g(g, C47810es.m84963c(bVar), C60826bg.f164896a);
                                return C60922j.m93045h(cxVar, new C117900l(this, dyVar, axVar), C60826bg.f164896a);
                            }
                            ((C59052c) ((C59052c) C11911e.f38289a.mo56226d()).mo56372aa(43794)).mo56386p("ServiceEventCallback is null");
                        }
                    }
                }
                throw new C62974ct("no arg");
            } catch (C62974ct e2) {
                ((C59052c) ((C59052c) ((C59052c) C11911e.f38289a.mo56225c()).mo56382g(e2)).mo56372aa(43797)).mo56386p("Unable to parse ShowNativeFormArgs");
            }
        }
        cxVar = C60856cj.m92900i(false);
        return C60922j.m93045h(cxVar, new C117900l(this, dyVar, axVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo27815c(C59476b bVar) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1237;
        C59449a aVar = (C59449a) bVar.toBuilder();
        int i = this.f327249h;
        aVar.copyOnWrite();
        C59476b bVar2 = (C59476b) aVar.instance;
        bVar2.f157799a |= 1;
        bVar2.f157802d = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        C59476b bVar3 = (C59476b) aVar.build();
        bVar3.getClass();
        ufVar2.f164175bc = bVar3;
        ufVar2.f164251f |= 67108864;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: d */
    public final void mo27816d(C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f327249h != 3) {
            if (this.f327254m.mo79746e(C90086ek.f250467dg)) {
                if (this.f327254m.mo79746e(C90082eg.f250067dx)) {
                    C59104x b = f327243e.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SARConversationSurface");
                    ((C59052c) ((C59052c) b).mo56372aa(18786)).mo56386p("#onConversationEnded");
                }
                this.f327251j.mo78379b();
                return;
            }
            this.f327255n.mo28212l("onConversationEnded", new C117898j(this));
            if (this.f327246c) {
                this.f327255n.mo28212l("update CCL audio status", new C117899k(this));
            }
        }
    }

    /* renamed from: e */
    public final void mo27817e(C22688aa aaVar, C58833ax axVar) {
        if (this.f327249h != 3) {
            C22708l lVar = (C22708l) aaVar;
            String d = C22717u.m42330d(lVar.f62508a);
            if (d == null) {
                d = BuildConfig.FLAVOR;
            }
            mo103481m(d);
            this.f327246c = false;
            C58976aa aaVar2 = C58975e.f156826a;
            ((C92718b) this.f327250i.mo27525b()).mo87450b(this.f327249h, lVar.f62509b);
            this.f327248g.mo77904i(lVar.f62508a, ((C90738av) this.f327253l.mo27525b()).mo85088a(lVar.f62509b));
        }
    }

    /* renamed from: f */
    public final void mo27818f(C22689ab abVar) {
        if (this.f327249h != 3) {
            C58976aa aaVar = C58975e.f156826a;
            this.f327248g.mo77901f(abVar);
        }
    }

    /* renamed from: g */
    public final void mo27819g() {
        this.f327248g.mo77902g();
    }

    /* renamed from: h */
    public final void mo27694h(String str, String str2, boolean z) {
        C87682aj ajVar;
        C87682aj ajVar2 = this.f327247f.f234157a;
        if (ajVar2 != null) {
            C87684al alVar = new C87684al(C88244um.UPDATE_RECOGNIZED_TEXT);
            C62940bt btVar = C88380zn.f238990a;
            C88381zo zoVar = (C88381zo) C88382zp.f238991e.createBuilder();
            zoVar.copyOnWrite();
            C88382zp zpVar = (C88382zp) zoVar.instance;
            str.getClass();
            zpVar.f238993a |= 1;
            zpVar.f238994b = str;
            zoVar.copyOnWrite();
            C88382zp zpVar2 = (C88382zp) zoVar.instance;
            str2.getClass();
            zpVar2.f238993a |= 2;
            zpVar2.f238995c = str2;
            alVar.mo81965b(btVar, (C88382zp) zoVar.build());
            ((C86771n) ajVar2).mo80379b(alVar.mo81964a());
        }
        if (z && (ajVar = this.f327247f.f234157a) != null) {
            C87684al alVar2 = new C87684al(C88244um.SET_FINAL_RECOGNIZED_TEXT);
            C62940bt btVar2 = C88260vb.f238727a;
            C88261vc vcVar = (C88261vc) C88262vd.f238728d.createBuilder();
            vcVar.copyOnWrite();
            C88262vd vdVar = (C88262vd) vcVar.instance;
            str.getClass();
            vdVar.f238730a |= 1;
            vdVar.f238731b = str;
            alVar2.mo81965b(btVar2, (C88262vd) vcVar.build());
            ((C86771n) ajVar).mo80379b(alVar2.mo81964a());
        }
    }

    /* renamed from: i */
    public final void mo27820i(C51809dy dyVar, C58833ax axVar) {
        this.f327248g.mo77903h(dyVar, C58836b.f156633a, axVar);
    }

    /* renamed from: j */
    public final void mo27821j(boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f327254m.mo79746e(C90086ek.f250467dg)) {
            boolean z2 = this.f327246c;
            if (z2) {
                if (z) {
                    z = true;
                } else {
                    return;
                }
            }
            this.f327246c = z2 | z;
            this.f327255n.mo28212l("update CCL audio status", new C117901m(this, z));
        }
    }

    /* renamed from: m */
    public final SettableFuture mo103481m(String str) {
        this.f327252k.putIfAbsent(str, new SettableFuture());
        return (SettableFuture) this.f327252k.get(str);
    }
}
