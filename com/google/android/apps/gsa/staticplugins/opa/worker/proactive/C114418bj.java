package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.search.assistant.proactive.C36205aa;
import com.google.android.libraries.search.assistant.proactive.C36206ab;
import com.google.android.libraries.search.assistant.proactive.C36221aq;
import com.google.android.libraries.search.assistant.proactive.C36231b;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.account.data.p3614c.C46194e;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aao;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.ajw;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.ajz;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bj */
/* compiled from: PG */
public final class C114418bj {

    /* renamed from: a */
    public static final C59071e f317255a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.worker.proactive.bj");

    /* renamed from: b */
    public final C36221aq f317256b;

    /* renamed from: c */
    public final C86034c f317257c;

    /* renamed from: d */
    public final C68214a f317258d;

    /* renamed from: e */
    public final C46194e f317259e;

    /* renamed from: f */
    public final Executor f317260f;

    /* renamed from: g */
    public final C36231b f317261g;

    /* renamed from: h */
    public final C46325t f317262h;

    /* renamed from: i */
    public final C36205aa f317263i;

    /* renamed from: j */
    private final C68214a f317264j;

    /* renamed from: k */
    private final Context f317265k;

    public C114418bj(C36221aq aqVar, Context context, C68214a aVar, C36231b bVar, C68214a aVar2, C86034c cVar, C46194e eVar, C46325t tVar, Executor executor, C36205aa aaVar) {
        this.f317256b = aqVar;
        this.f317265k = context;
        this.f317264j = aVar;
        this.f317261g = bVar;
        this.f317258d = aVar2;
        this.f317257c = cVar;
        this.f317259e = eVar;
        this.f317262h = tVar;
        this.f317260f = executor;
        this.f317263i = aaVar;
    }

    /* renamed from: c */
    public static void m189711c(C60321oe oeVar, ajz ajz, boolean z) {
        if (ajz != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 647;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164203cD = ajz;
            ufVar2.f164255j |= 8388608;
            C89949q.m146525j((C60555uf) tzVar.build(), oeVar, (C63196b) null, true != z ? null : BuildConfig.FLAVOR);
            return;
        }
        C89949q.m146521e(oeVar, true);
    }

    /* renamed from: e */
    public static C60218r m189712e(int i, String str, ajz ajz, boolean z) {
        C60321oe l;
        if (C58837ba.m90859h(str) || (l = C28285c.m52885l(str, i)) == null) {
            return null;
        }
        m189711c(l, ajz, z);
        C60218r rVar = l.f163227b;
        return rVar == null ? C60218r.f162925d : rVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo101317a(aas aas, ajy ajy, C51962fo foVar, String str, int i) {
        C60870cx cxVar;
        int a;
        int i2 = aas.f134664b;
        int a2 = aar.m86269a(i2);
        if ((a2 != 0 && a2 == 2) || ((a = aar.m86269a(i2)) != 0 && a == 5)) {
            aap aap = aas.f134676n;
            if (aap == null) {
                aap = aap.f134650h;
            }
            int a3 = aao.m86268a(aap.f134658g);
            boolean z = a3 != 0 && a3 == 2;
            ajw b = C36206ab.m64606b(aas);
            boolean d = mo101319d();
            b.copyOnWrite();
            ajz ajz = (ajz) b.instance;
            ajz ajz2 = ajz.f158928q;
            ajz.f158932a |= 2048;
            ajz.f158945n = d;
            b.copyOnWrite();
            ajz ajz3 = (ajz) b.instance;
            ajz3.f158939h = ajy.f158927f;
            ajz3.f158932a |= 64;
            b.copyOnWrite();
            ajz ajz4 = (ajz) b.instance;
            ajz4.f158942k = foVar.f136364u;
            ajz4.f158932a |= 512;
            if (str != null) {
                b.copyOnWrite();
                ajz ajz5 = (ajz) b.instance;
                ajz5.f158932a |= 1024;
                ajz5.f158944m = str;
            }
            if (i > 0) {
                b.copyOnWrite();
                ajz ajz6 = (ajz) b.instance;
                ajz6.f158932a |= 4096;
                ajz6.f158946o = i;
            }
            ajz ajz7 = (ajz) b.build();
            if (this.f317263i.f94583a) {
                if (z) {
                    cxVar = this.f317259e.mo50254a();
                } else {
                    cxVar = this.f317257c.mo79697b();
                }
                C46459k.m82829b(C60922j.m93044g(cxVar, C47810es.m84963c(new C114411bc(this, aas, ajz7)), this.f317260f), "GilNotificationLogger.logImpressionFailure failed.", new Object[0]);
                return;
            }
            m189711c(C36206ab.m64612h(85000, aas), ajz7, z);
        }
    }

    /* renamed from: b */
    public final void mo101318b(Intent intent, ajz ajz, boolean z) {
        C89849ae aeVar;
        int intExtra = intent.getIntExtra("button-type", 0);
        if (intExtra != 2) {
            C89856f fVar = new C89856f();
            if (intent.getParcelableExtra("target-intent") != null) {
                aeVar = C89849ae.OPA_NOTIFICATION_TAPPED_EXTERNAL_ACTION;
            } else if (z || intExtra == 3) {
                aeVar = C89849ae.OPA_NOTIFICATION_TAPPED_ASSISTANT_INTERACTION;
            } else {
                aeVar = C89849ae.OPA_ANDROID_STARTUP_NOTIFICATION;
            }
            fVar.f246201a = aeVar;
            if (ajz != null) {
                C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                cbVar.f160102an = ajz;
                cbVar.f160122c |= 32;
                fVar.f246203c = (C59687cb) ajVar.build();
            }
            ((C89859i) this.f317264j.mo27525b()).mo74236a(fVar.mo83699a());
        }
    }

    /* renamed from: d */
    public final boolean mo101319d() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f317265k.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3)) {
            return true;
        }
        return false;
    }
}
