package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import android.content.Intent;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.opa.p6443g.C83679a;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C84920a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87571n;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.staticplugins.opa.p8378m.C109458d;
import com.google.android.apps.gsa.staticplugins.opa.worker.proactive.p8619b.p8620a.C114408c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.ParcelableSyntheticTree;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.TreeNodeRef;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.proactive.C36206ab;
import com.google.android.libraries.search.assistant.proactive.C36208ad;
import com.google.android.libraries.search.assistant.proactive.C36221aq;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36269h;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protos.p4985f.p5036r.C65316b;
import com.google.protos.p4985f.p5036r.C65330p;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.af */
/* compiled from: PG */
public final class C114384af implements C114500y {

    /* renamed from: a */
    public static final C59071e f317139a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.af");

    /* renamed from: b */
    public static final C58528ij f317140b = C58528ij.m90015O(212, 224, 225, 226, 227, 228, 229, 232, 233, 309, 310, 311, 532);

    /* renamed from: c */
    public static final C58528ij f317141c = C58528ij.m90014N("com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_CLICKED", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_LAUNCH_DRIVING_SETTINGS", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOT_DRIVING", "com.google.android.apps.gsa.staticplugins.opa.morris.notification.INTENT_ACTION_NOTIFICATION_DISMISS", "com.google.android.apps.search.assistant.surfaces.notification.TNG_CLIENT_INPUT_ACTION");

    /* renamed from: d */
    public final Context f317142d;

    /* renamed from: e */
    public final ProxyIntentStarter f317143e;

    /* renamed from: f */
    public final C58833ax f317144f;

    /* renamed from: g */
    public final C86124t f317145g;

    /* renamed from: h */
    public final C22871g f317146h;

    /* renamed from: i */
    public final C87571n f317147i;

    /* renamed from: j */
    public final C84920a f317148j;

    /* renamed from: k */
    public final C83679a f317149k;

    /* renamed from: l */
    public final C68214a f317150l;

    /* renamed from: m */
    public final C68214a f317151m;

    /* renamed from: n */
    public final C58881cr f317152n;

    /* renamed from: o */
    public final C114408c f317153o;

    /* renamed from: p */
    public final C86034c f317154p;

    /* renamed from: q */
    private final C36221aq f317155q;

    /* renamed from: r */
    private final C21370a f317156r;

    /* renamed from: s */
    private final C68214a f317157s;

    /* renamed from: t */
    private final C114418bj f317158t;

    /* renamed from: u */
    private final C36208ad f317159u;

    /* renamed from: v */
    private final C36314g f317160v;

    public C114384af(Context context, C36221aq aqVar, C58833ax axVar, C21370a aVar, ProxyIntentStarter proxyIntentStarter, C86124t tVar, C22871g gVar, C87571n nVar, C68214a aVar2, C84920a aVar3, C114418bj bjVar, C83679a aVar4, C68214a aVar5, C36208ad adVar, C68214a aVar6, C58881cr crVar, C36314g gVar2, C114408c cVar, C86034c cVar2) {
        this.f317142d = context;
        this.f317155q = aqVar;
        this.f317143e = proxyIntentStarter;
        this.f317144f = axVar;
        this.f317156r = aVar;
        this.f317145g = tVar;
        this.f317146h = gVar;
        this.f317147i = nVar;
        this.f317157s = aVar2;
        this.f317148j = aVar3;
        this.f317158t = bjVar;
        this.f317149k = aVar4;
        this.f317150l = aVar5;
        this.f317159u = adVar;
        this.f317151m = aVar6;
        this.f317152n = crVar;
        this.f317160v = gVar2;
        this.f317153o = cVar;
        this.f317154p = cVar2;
    }

    /* renamed from: d */
    private final C60870cx m189685d(Intent intent, boolean z, ajz ajz) {
        C60870cx cxVar;
        int i;
        if (!C1888a.m5149c()) {
            this.f317142d.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        int intExtra = intent.getIntExtra("android-notification-id", 0);
        boolean z2 = intent.getBooleanExtra("disable-auto-dismiss", false) && !intent.getBooleanExtra("explicit-dismiss-on-tap", false);
        if (intExtra != 0 && !z2) {
            this.f317155q.mo40034f(intExtra, intent.getStringExtra("bundle-id"));
        }
        long longExtra = intent.getLongExtra("expiry-time-ms", 0);
        if (longExtra > 0 && longExtra < this.f317156r.mo26870b()) {
            if (ajz == null) {
                i = 0;
            } else {
                i = C65330p.m96670b(ajz.f158936e);
            }
            int c = ajz == null ? 0 : C65316b.m96666c(ajz.f158937f);
            C36314g gVar = this.f317160v;
            String str = BuildConfig.FLAVOR;
            String a = i == 0 ? str : C65330p.m96669a(i);
            if (c != 0) {
                str = C65316b.m96664a(c);
            }
            gVar.mo40102d(a, str, 5);
        }
        C114418bj bjVar = this.f317158t;
        C60218r rVar = C60218r.f162925d;
        boolean booleanExtra = intent.getBooleanExtra("log-pseudonymously", false);
        ajz c2 = C36206ab.m64607c(intent);
        String stringExtra = intent.getStringExtra("ved");
        if (C58837ba.m90859h(stringExtra)) {
            return C60856cj.m92899h(new IllegalStateException("No VED present!"));
        }
        if (bjVar.f317263i.f94583a) {
            ParcelableSyntheticTree a2 = C36206ab.m64605a(stringExtra);
            TreeNodeRef treeNodeRef = (TreeNodeRef) intent.getParcelableExtra("gil-tree-ref");
            if (booleanExtra) {
                cxVar = bjVar.f317259e.mo50254a();
            } else {
                cxVar = bjVar.f317257c.mo79697b();
            }
            return C60922j.m93045h(cxVar, C47810es.m84966f(new C114415bg(bjVar, a2, treeNodeRef, c2, booleanExtra, intent, z)), bjVar.f317260f);
        }
        C60218r e = C114418bj.m189712e(5, stringExtra, c2, booleanExtra);
        if (!booleanExtra) {
            bjVar.mo101318b(intent, c2, z);
        }
        return C60856cj.m92900i(new C114417bi(e, stringExtra));
    }

    /* renamed from: a */
    public final void mo101304a(Intent intent, C84370p pVar) {
        C58833ax axVar;
        C60870cx cxVar;
        if (!"com.google.android.search.core.action.OPA_PROACTIVE_NOTIFICATION_DISMISSED".equals(intent.getAction())) {
            C59104x c = f317139a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationActions");
            ((C59052c) ((C59052c) c).mo56372aa(28969)).mo56386p("This intent is not for the dismiss action.");
            axVar = C58836b.f156633a;
        } else if (intent.getByteArrayExtra("dismissed-context") == null) {
            C59104x c2 = f317139a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NotificationActions");
            ((C59052c) ((C59052c) c2).mo56372aa(28968)).mo56386p("No dismiss context found.");
            axVar = C58836b.f156633a;
        } else {
            try {
                byte[] byteArrayExtra = intent.getByteArrayExtra("dismissed-context");
                if (byteArrayExtra != null) {
                    axVar = C58833ax.m90834k((C36269h) C62942bv.parseFrom((C62942bv) C36269h.f94733k, byteArrayExtra, C62921ba.m95368a()));
                }
            } catch (C62974ct e) {
                C59104x c3 = f317139a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "NotificationActions");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(28967)).mo56386p("Could not parse dismiss context.");
            }
            axVar = C58836b.f156633a;
        }
        if (!axVar.mo56113h()) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C36269h hVar = (C36269h) axVar.mo56107c();
        if (hVar.f94736b.size() != 0) {
            pVar.mo77919a(C109458d.m182153a(hVar.f94736b, hVar.f94737c.mo59174N()));
            if ((hVar.f94735a & 8) != 0) {
                C83679a aVar = this.f317149k;
                C48800ah ahVar = hVar.f94740f;
                if (ahVar == null) {
                    ahVar = C48800ah.f126269b;
                }
                C48851br brVar = ahVar.f126271a;
                if (brVar == null) {
                    brVar = C48851br.f126412f;
                }
                aVar.mo77006b(brVar, 201, C58836b.f156633a);
            }
            for (String d : hVar.f94736b) {
                ((C36281b) this.f317157s.mo27525b()).mo40092d(d);
            }
            if (hVar.f94742h > 0 && this.f317156r.mo26870b() - hVar.f94742h > 60000) {
                ajz ajz = hVar.f94739e;
                if (ajz == null) {
                    ajz = ajz.f158928q;
                }
                int b = C65330p.m96670b(ajz.f158936e);
                ajz ajz2 = hVar.f94739e;
                if (ajz2 == null) {
                    ajz2 = ajz.f158928q;
                }
                int c4 = C65316b.m96666c(ajz2.f158937f);
                C36314g gVar = this.f317160v;
                String str = BuildConfig.FLAVOR;
                String a = b == 0 ? str : C65330p.m96669a(b);
                if (c4 != 0) {
                    str = C65316b.m96664a(c4);
                }
                gVar.mo40102d(a, str, 5);
            }
            C114418bj bjVar = this.f317158t;
            String str2 = hVar.f94738d;
            ajz ajz3 = hVar.f94739e;
            if (ajz3 == null) {
                ajz3 = ajz.f158928q;
            }
            boolean z = hVar.f94744j;
            if (bjVar.f317263i.f94583a) {
                if (z) {
                    cxVar = C60922j.m93045h(bjVar.f317259e.mo50254a(), C47810es.m84966f(new C114404az(bjVar)), C60826bg.f164896a);
                } else {
                    cxVar = bjVar.f317257c.mo79697b();
                }
                C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(new C114409ba(bjVar, str2, ajz3)), bjVar.f317260f), "GilNotificationLogger.logDismiss failed.", new Object[0]);
            } else {
                C114418bj.m189712e(22, str2, ajz3, z);
            }
            C36208ad adVar = this.f317159u;
            ajz ajz4 = hVar.f94739e;
            int i = (ajz4 == null ? ajz.f158928q : ajz4).f158937f;
            int i2 = hVar.f94743i;
            if (ajz4 == null) {
                ajz4 = ajz.f158928q;
            }
            adVar.mo40017e(i, i2, ajz4.f158947p);
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo101305b(Intent intent, C84370p pVar, boolean z) {
        int i;
        String stringExtra = intent.getStringExtra("grouping-key");
        int intExtra = intent.getIntExtra("button-index", -1);
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.search.core.extra.EXTRA_OPA_PROACTIVE_OPAQUE_TOKEN");
        if (byteArrayExtra != null) {
            ((C36281b) this.f317157s.mo27525b()).mo40093e(stringExtra, intExtra);
        }
        int intExtra2 = intent.getIntExtra("button-type", 0);
        ajz c = C36206ab.m64607c(intent);
        int intExtra3 = intent.getIntExtra("category-id", 0);
        if (intExtra < 0) {
            this.f317159u.mo40020h(c.f158937f, intExtra3, c.f158947p);
        } else if (intExtra2 == 1) {
            this.f317159u.mo40018f(c.f158937f, intExtra3, c.f158947p, true);
        } else if (intExtra2 == 2) {
            this.f317159u.mo40018f(c.f158937f, intExtra3, c.f158947p, false);
        } else if (intExtra2 != 4) {
            this.f317159u.mo40016d(c.f158937f, intExtra3, c.f158947p, intExtra);
        }
        if (intExtra2 == 3) {
            C60870cx d = m189685d(intent, z, c);
            C114381ac acVar = new C114381ac(intent, pVar, byteArrayExtra, intExtra);
            C60922j.m93044g(d, C47810es.m84963c(acVar), C60826bg.f164896a);
            return;
        }
        String stringExtra2 = intent.getStringExtra("survey-trigger-id");
        if (intExtra2 != 1) {
            if (intExtra2 == 2) {
                if (!mo101306c(stringExtra2)) {
                    intExtra2 = 2;
                } else {
                    i = 2;
                    C60870cx d2 = m189685d(intent, z, c);
                    C114383ae aeVar = new C114383ae(this, intent, z, i, pVar, stringExtra, byteArrayExtra, stringExtra2);
                    C60922j.m93044g(d2, C47810es.m84963c(aeVar), C60826bg.f164896a);
                }
            }
            i = intExtra2;
            C60870cx d22 = m189685d(intent, z, c);
            C114383ae aeVar2 = new C114383ae(this, intent, z, i, pVar, stringExtra, byteArrayExtra, stringExtra2);
            C60922j.m93044g(d22, C47810es.m84963c(aeVar2), C60826bg.f164896a);
        }
        this.f317146h.mo28212l("Show notification toast", new C114382ad(this));
        i = intExtra2;
        C60870cx d222 = m189685d(intent, z, c);
        C114383ae aeVar22 = new C114383ae(this, intent, z, i, pVar, stringExtra, byteArrayExtra, stringExtra2);
        C60922j.m93044g(d222, C47810es.m84963c(aeVar22), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final boolean mo101306c(String str) {
        return !C58837ba.m90859h(str) && ((C58833ax) this.f317150l.mo27525b()).mo56113h();
    }
}
