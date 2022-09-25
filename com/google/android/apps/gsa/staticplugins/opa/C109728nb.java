package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.nga.shared.p6361q.C81449a;
import com.google.android.apps.gsa.nga.shared.p6369ui.p6370a.C81517a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87564g;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87566i;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.util.p7184t.C91093c;
import com.google.android.apps.gsa.staticplugins.opa.p8186ai.C106176a;
import com.google.android.apps.gsa.staticplugins.opa.p8186ai.p8187a.C106178b;
import com.google.android.apps.gsa.staticplugins.opa.util.C113806bv;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9608e.C127525a;
import com.google.assistant.p3994s.p3995a.C53275hw;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.base.C58881cr;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.nb */
/* compiled from: PG */
public final class C109728nb implements C87568k, C127525a {

    /* renamed from: a */
    private static final C59071e f305691a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.nb");

    /* renamed from: b */
    private final C68214a f305692b;

    /* renamed from: c */
    private final C68214a f305693c;

    /* renamed from: d */
    private final Optional f305694d;

    /* renamed from: e */
    private final C87573b f305695e;

    /* renamed from: f */
    private final C68214a f305696f;

    /* renamed from: g */
    private final C68214a f305697g;

    /* renamed from: h */
    private final Optional f305698h;

    /* renamed from: i */
    private final C58881cr f305699i;

    /* renamed from: j */
    private final C81517a f305700j;

    /* renamed from: k */
    private final bm f305701k;

    public C109728nb(C68214a aVar, C68214a aVar2, Optional optional, C87573b bVar, C68214a aVar3, C68214a aVar4, Optional optional2, C58881cr crVar, C81517a aVar5, bm bmVar) {
        this.f305692b = aVar;
        this.f305693c = aVar2;
        this.f305694d = optional;
        this.f305695e = bVar;
        this.f305696f = aVar3;
        this.f305697g = aVar4;
        this.f305698h = optional2;
        this.f305699i = crVar;
        this.f305700j = aVar5;
        this.f305701k = bmVar;
    }

    /* renamed from: e */
    private final Intent m182693e(Context context) {
        C53275hw hwVar = (C53275hw) C53287ih.f139693l.createBuilder();
        hwVar.copyOnWrite();
        C53287ih ihVar = (C53287ih) hwVar.instance;
        ihVar.f139698d = 1;
        ihVar.f139695a = 1 | ihVar.f139695a;
        hwVar.copyOnWrite();
        C53287ih ihVar2 = (C53287ih) hwVar.instance;
        ihVar2.f139702h = 0;
        ihVar2.f139695a |= 64;
        hwVar.copyOnWrite();
        C53287ih ihVar3 = (C53287ih) hwVar.instance;
        ihVar3.f139703i = 41;
        ihVar3.f139695a |= 128;
        return ((C87571n) this.f305697g.mo27525b()).mo81694a(context, (C53287ih) hwVar.build());
    }

    /* renamed from: f */
    private final void m182694f(Context context, Intent intent) {
        C106176a aVar;
        new C91093c(context).mo65089a(intent);
        if (this.f305698h.isPresent()) {
            Bundle extras = intent.getExtras();
            boolean ac = C87566i.m142279ac(extras);
            boolean ag = C87566i.m142283ag(extras);
            if (ac) {
                aVar = C106176a.OUTSIDE_AGSA;
            } else if (ag) {
                aVar = C106176a.NGA_CLOUD_HANDOVER;
            } else {
                return;
            }
            ((C106178b) this.f305698h.get()).mo95346b(aVar);
        }
    }

    /* renamed from: g */
    private final void m182695g(Intent intent) {
        ((C81449a) this.f305694d.get()).mo74742c(intent);
    }

    /* renamed from: h */
    private final boolean m182696h() {
        C87573b bVar = this.f305695e;
        return bVar != null && bVar.f236596a.mo17534a() && ((C86124t) this.f305693c.mo27525b()).mo79746e(C90014bt.f247430gx);
    }

    /* renamed from: i */
    private final boolean m182697i() {
        if (!this.f305701k.u() || !this.f305701k.w()) {
            return false;
        }
        int b = this.f305700j.mo75125b();
        boolean z = ((Boolean) this.f305699i.mo6453a()).booleanValue() && this.f305694d.isPresent() && ((C86124t) this.f305693c.mo27525b()).mo79746e(C90029ch.f248234aU);
        if (b == 2 || z) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m182698j(Bundle bundle) {
        if (C87566i.m142297au(bundle) || C87566i.m142294ar(bundle) || C87566i.m142282af(bundle) || C87566i.m142281ae(bundle)) {
            return false;
        }
        if ((bundle != null && "and.gsa.widget.mic".equals(bundle.getString("source"))) || C87564g.m142223a(bundle) == e.aF || C87564g.m142223a(bundle) == e.aG || C87564g.m142223a(bundle) == e.aH || C87566i.m142299aw(bundle)) {
            return false;
        }
        return !((C86124t) this.f305693c.mo27525b()).mo79746e(C90014bt.f247401gU) || !C87566i.m142283ag(bundle);
    }

    /* renamed from: k */
    private final boolean m182699k(Bundle bundle) {
        return C87566i.m142270aR(bundle) && ((C86124t) this.f305693c.mo27525b()).mo79746e(C90014bt.f247287eM);
    }

    /* renamed from: a */
    public final Intent mo81687a(Context context, Bundle bundle, int i) {
        if (m182699k(bundle)) {
            C58976aa aaVar = C58975e.f156826a;
            return m182693e(context);
        } else if (!m182696h()) {
            return ((C113806bv) this.f305692b.mo27525b()).mo100655a(context, bundle, i);
        } else {
            Intent intent = new Intent();
            intent.setClassName(context, "com.google.android.apps.gsa.staticplugins.opa.EnterOpaActivity");
            C87565h hVar = new C87565h(bundle);
            hVar.f236512P = i;
            intent.putExtras(hVar.mo81685a());
            return intent;
        }
    }

    /* renamed from: b */
    public final void mo81688b(Context context, Bundle bundle) {
        Intent intent;
        C58976aa aaVar = C58975e.f156826a;
        m182696h();
        if (m182699k(bundle)) {
            m182694f(context, m182693e(context));
            return;
        }
        if (m182698j(bundle)) {
            ((C89859i) this.f305696f.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_OTHER);
        }
        C59104x b = f305691a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaStarter");
        ((C59052c) ((C59052c) b).mo56372aa(22992)).mo56386p("Starting Opa");
        if (m182696h()) {
            C87573b bVar = this.f305695e;
            bVar.getClass();
            bVar.mo81706d(bundle);
            return;
        }
        if (C87566i.m142251Z(bundle)) {
            intent = ((C113806bv) this.f305692b.mo27525b()).mo100655a(context, bundle, C87566i.m142308g(bundle));
        } else {
            intent = ((C113806bv) this.f305692b.mo27525b()).mo100655a(context, bundle, 268468224);
        }
        Bundle D = C87566i.m142229D(bundle);
        if (D != null) {
            intent.setAction("android.intent.action.SEND");
            intent.addFlags(1);
            intent.setType(D.getString("type"));
            intent.putExtra("android.intent.extra.STREAM", D.getParcelable("android.intent.extra.STREAM"));
            intent.putExtra("android.intent.extra.TEXT", D.getCharSequence("android.intent.extra.TEXT"));
        }
        if (m182697i()) {
            m182695g(intent);
        } else {
            m182694f(context, intent);
        }
    }

    /* renamed from: c */
    public final void mo81689c(Context context, Bundle bundle, int i) {
        C58976aa aaVar = C58975e.f156826a;
        m182696h();
        if (m182699k(bundle)) {
            m182694f(context, m182693e(context));
            return;
        }
        if (m182698j(bundle)) {
            ((C89859i) this.f305696f.mo27525b()).mo83702b(C89849ae.OPA_ANDROID_STARTUP_OTHER);
        }
        C59104x b = f305691a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaStarter");
        ((C59052c) ((C59052c) b).mo56372aa(22995)).mo56386p("Starting Opa");
        if (m182696h()) {
            C87573b bVar = this.f305695e;
            bVar.getClass();
            C87565h hVar = new C87565h(bundle);
            hVar.f236512P = i;
            bVar.mo81706d(hVar.mo81685a());
            return;
        }
        Intent a = ((C113806bv) this.f305692b.mo27525b()).mo100655a(context, bundle, i);
        if (m182697i()) {
            m182695g(a);
        } else {
            m182694f(context, a);
        }
    }

    /* renamed from: d */
    public final Bundle mo98052d() {
        return new C87565h().mo81685a();
    }
}
