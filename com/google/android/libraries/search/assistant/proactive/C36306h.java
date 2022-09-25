package com.google.android.libraries.search.assistant.proactive;

import android.content.Context;
import android.content.Intent;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.assistant.p2485a.C32240a;
import com.google.android.libraries.search.assistant.proactive.p2768a.p2769a.C36202a;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36269h;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36281b;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3803ag.p3804a.C48800ah;
import com.google.assistant.p3803ag.p3804a.C48851br;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4985f.p5036r.C65316b;
import com.google.protos.p4985f.p5036r.C65330p;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.proactive.h */
/* compiled from: PG */
public final class C36306h implements C36254d {

    /* renamed from: a */
    public static final C59071e f94805a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.h");

    /* renamed from: c */
    private static final Duration f94806c = Duration.ofSeconds(60);

    /* renamed from: b */
    public final Context f94807b;

    /* renamed from: d */
    private final C60887da f94808d;

    /* renamed from: e */
    private final C21370a f94809e;

    /* renamed from: f */
    private final C68214a f94810f;

    /* renamed from: g */
    private final C36208ad f94811g;

    /* renamed from: h */
    private final C36314g f94812h;

    /* renamed from: i */
    private final Executor f94813i;

    /* renamed from: j */
    private final C32240a f94814j;

    /* renamed from: com.google.android.libraries.search.assistant.proactive.h$a */
    /* compiled from: PG */
    public interface C36307a {
        /* renamed from: fD */
        C36202a mo40098fD();

        /* renamed from: ib */
        Optional mo40099ib();
    }

    public C36306h(C32240a aVar, Context context, C60887da daVar, C21370a aVar2, C68214a aVar3, C36208ad adVar, C36314g gVar, Executor executor) {
        this.f94814j = aVar;
        this.f94807b = context;
        this.f94808d = daVar;
        this.f94809e = aVar2;
        this.f94810f = aVar3;
        this.f94811g = adVar;
        this.f94812h = gVar;
        this.f94813i = executor;
    }

    /* renamed from: d */
    private static Class m64784d() {
        try {
            return Class.forName("com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver");
        } catch (ClassNotFoundException | LinkageError e) {
            C59104x c = f94805a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(52215)).mo56386p("Can't get CommonBroadcastReceiverClass class");
            return null;
        }
    }

    /* renamed from: a */
    public final C60870cx mo40071a(Intent intent) {
        C60870cx a = this.f94814j.f86461a.mo104411a(C36307a.class);
        C36256e eVar = new C36256e(intent);
        return C60922j.m93045h(a, C47810es.m84966f(eVar), this.f94808d);
    }

    /* renamed from: b */
    public final void mo40072b(C51805du duVar) {
        C59104x b = f94805a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
        ((C59052c) ((C59052c) b).mo56372aa(52216)).mo56386p("#Calling handleWholeHomeClientInput");
        C47633f h = C47633f.m84733g(this.f94814j.f86461a.mo104411a(C36307a.class)).mo51515h(C36261f.f94711a, this.f94813i);
        C36270g gVar = new C36270g(duVar);
        C60856cj.m92911t(h.f164926b, C47810es.m84974n(gVar), this.f94813i);
    }

    /* renamed from: c */
    public final void mo40073c(C36269h hVar) {
        String str;
        if (hVar.f94736b.size() != 0) {
            if ((hVar.f94735a & 8) != 0) {
                C48800ah ahVar = hVar.f94740f;
                if (ahVar == null) {
                    ahVar = C48800ah.f126269b;
                }
                C48851br brVar = ahVar.f126271a;
                if (brVar == null) {
                    brVar = C48851br.f126412f;
                }
                C59104x b = f94805a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
                ((C59052c) ((C59052c) b).mo56372aa(52218)).mo56386p("#sendUserActionDismissalIntent");
                Intent intent = new Intent();
                intent.setAction("USER_DISMISSAL_ACTION");
                intent.setPackage("com.google.android.googlequicksearchbox");
                intent.putExtra("CONTENT_SELECTOR_EXTRA", brVar.toByteArray());
                intent.putExtra("CLIENT_UI_OBJECT_TYPE_EXTRA", 200);
                Class d = m64784d();
                if (d != null) {
                    intent.setClass(this.f94807b, d);
                    this.f94807b.sendBroadcast(intent);
                }
            }
            for (String d2 : hVar.f94736b) {
                ((C36281b) this.f94810f.mo27525b()).mo40092d(d2);
            }
            if (hVar.f94742h > 0 && Duration.ofMillis(this.f94809e.mo26870b() - hVar.f94742h).compareTo(f94806c) > 0) {
                ajz ajz = hVar.f94739e;
                if (ajz == null) {
                    ajz = ajz.f158928q;
                }
                int b2 = C65330p.m96670b(ajz.f158936e);
                ajz ajz2 = hVar.f94739e;
                if (ajz2 == null) {
                    ajz2 = ajz.f158928q;
                }
                int c = C65316b.m96666c(ajz2.f158937f);
                C36314g gVar = this.f94812h;
                String str2 = BuildConfig.FLAVOR;
                if (b2 == 0) {
                    str = str2;
                } else {
                    str = C65330p.m96669a(b2);
                }
                if (c != 0) {
                    str2 = C65316b.m96664a(c);
                }
                gVar.mo40102d(str, str2, 5);
            }
            C36208ad adVar = this.f94811g;
            ajz ajz3 = hVar.f94739e;
            if (ajz3 == null) {
                ajz3 = ajz.f158928q;
            }
            int i = ajz3.f158937f;
            int i2 = hVar.f94743i;
            ajz ajz4 = hVar.f94739e;
            if (ajz4 == null) {
                ajz4 = ajz.f158928q;
            }
            adVar.mo40017e(i, i2, ajz4.f158947p);
            return;
        }
        C59104x d3 = f94805a.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "NTF.ActionsHandler");
        ((C59052c) ((C59052c) d3).mo56372aa(52217)).mo56386p("Record dismissed failed: groupingKey is empty.");
    }
}
