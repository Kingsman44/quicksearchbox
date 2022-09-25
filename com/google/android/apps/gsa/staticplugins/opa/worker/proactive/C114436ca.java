package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import android.app.Notification;
import android.os.Bundle;
import androidx.core.app.C1839z;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.p2185ve.synthetic.remote.ParcelableSyntheticTree;
import com.google.android.libraries.search.assistant.proactive.C36201a;
import com.google.android.libraries.search.assistant.proactive.C36206ab;
import com.google.android.libraries.search.assistant.proactive.C36316i;
import com.google.android.libraries.search.assistant.proactive.C36334o;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36266e;
import com.google.android.libraries.search.assistant.proactive.p2774f.C36267f;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36280ai;
import com.google.android.libraries.search.assistant.proactive.p2776h.C36314g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aao;
import com.google.assistant.p3897e.p3921j.aap;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.assistant.p3897e.p3921j.abc;
import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.ajw;
import com.google.common.p4552o.ajy;
import com.google.common.p4552o.ajz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.ca */
/* compiled from: PG */
public final /* synthetic */ class C114436ca implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C114464db f317305a;

    /* renamed from: b */
    public final /* synthetic */ aas f317306b;

    /* renamed from: c */
    public final /* synthetic */ ajy f317307c;

    /* renamed from: d */
    public final /* synthetic */ C36334o f317308d;

    /* renamed from: e */
    public final /* synthetic */ int f317309e;

    /* renamed from: f */
    public final /* synthetic */ abc f317310f;

    public /* synthetic */ C114436ca(C114464db dbVar, aas aas, ajy ajy, C36334o oVar, int i, abc abc) {
        this.f317305a = dbVar;
        this.f317306b = aas;
        this.f317307c = ajy;
        this.f317308d = oVar;
        this.f317309e = i;
        this.f317310f = abc;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        String str;
        C114464db dbVar = this.f317305a;
        aas aas = this.f317306b;
        ajy ajy = this.f317307c;
        C36334o oVar = this.f317308d;
        int i = this.f317309e;
        abc abc = this.f317310f;
        C36316i iVar = (C36316i) obj;
        if ((aas.f134663a & 4) != 0) {
            String str2 = oVar.f94887a;
            long b = aas.f134666d - dbVar.f317391l.mo26870b();
            C36201a aVar = iVar.f94830c;
            C28293k kVar = aVar.f94574a;
            if (kVar != null) {
                str = C36206ab.m64608d(kVar, 0);
                C58976aa aaVar = C58975e.f156826a;
            } else {
                ParcelableSyntheticTree parcelableSyntheticTree = aVar.f94575b;
                str = parcelableSyntheticTree != null ? C36206ab.m64609e(parcelableSyntheticTree) : BuildConfig.FLAVOR;
            }
            long nextLong = C90719ac.f253778a.f253779b.nextLong();
            C1839z zVar = iVar.f94828a;
            Bundle bundle = new Bundle(1);
            bundle.putLong("opa.uniqueNotificationId", nextLong);
            zVar.mo5018g(bundle);
            C36266e eVar = (C36266e) C36267f.f94725g.createBuilder();
            eVar.copyOnWrite();
            C36267f fVar = (C36267f) eVar.instance;
            fVar.f94727a |= 1;
            fVar.f94728b = nextLong;
            String str3 = aas.f134670h;
            eVar.copyOnWrite();
            C36267f fVar2 = (C36267f) eVar.instance;
            str3.getClass();
            fVar2.f94727a |= 2;
            fVar2.f94729c = str3;
            eVar.copyOnWrite();
            C36267f fVar3 = (C36267f) eVar.instance;
            str.getClass();
            fVar3.f94727a |= 4;
            fVar3.f94730d = str;
            C114418bj bjVar = dbVar.f317399t;
            ajw b2 = C36206ab.m64606b(aas);
            boolean d = bjVar.mo101319d();
            b2.copyOnWrite();
            ajz ajz = (ajz) b2.instance;
            ajz ajz2 = ajz.f158928q;
            ajz.f158932a |= 2048;
            ajz.f158945n = d;
            b2.copyOnWrite();
            ajz ajz3 = (ajz) b2.instance;
            ajz3.f158939h = ajy.f158927f;
            ajz3.f158932a |= 64;
            b2.copyOnWrite();
            ajz ajz4 = (ajz) b2.instance;
            str2.getClass();
            ajz4.f158932a |= 1024;
            ajz4.f158944m = str2;
            ajz ajz5 = (ajz) b2.build();
            eVar.copyOnWrite();
            C36267f fVar4 = (C36267f) eVar.instance;
            ajz5.getClass();
            fVar4.f94731e = ajz5;
            fVar4.f94727a |= 8;
            aap aap = aas.f134676n;
            if (aap == null) {
                aap = aap.f134650h;
            }
            int a = aao.m86268a(aap.f134658g);
            boolean z = a != 0 && a == 2;
            eVar.copyOnWrite();
            C36267f fVar5 = (C36267f) eVar.instance;
            fVar5.f94727a |= 32;
            fVar5.f94732f = z;
            C60922j.m93045h(dbVar.f317405z.mo79697b(), C47810es.m84966f(new C114458cw(dbVar, (C36267f) eVar.build(), b)), C60826bg.f164896a);
            C36314g gVar = dbVar.f317402w;
            aap aap2 = aas.f134676n;
            if (aap2 == null) {
                aap2 = aap.f134650h;
            }
            gVar.mo40101c(aap2, 6);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        String str4 = aas.f134670h;
        if (aas.f134677o) {
            return C118826c.f331422a;
        }
        dbVar.f317401v.mo40019g(i, aas);
        Notification a2 = iVar.f94828a.mo5013a();
        if (abc.f134703j) {
            dbVar.f317382c.mo40039k(i);
        }
        if (dbVar.f317382c.mo40041m(i, a2)) {
            C58833ax axVar = iVar.f94829b;
            if (axVar.mo56113h()) {
                if (!dbVar.f317382c.mo40041m(C114464db.m189728a(aas.f134671i), (Notification) axVar.mo56107c())) {
                    C59104x c = C114464db.f317374a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ProactiveNotifications");
                    ((C59052c) ((C59052c) c).mo56372aa(29057)).mo56389s("Could not update summary for bundleId: %s", aas.f134671i);
                }
            }
            int i2 = abc.f134700g;
            if (((C58833ax) dbVar.f317395p.mo27525b()).mo56113h()) {
                ((C36280ai) ((C58833ax) dbVar.f317395p.mo27525b()).mo56107c()).mo40088b(i2);
            }
            C36314g gVar2 = dbVar.f317402w;
            aap aap3 = aas.f134676n;
            if (aap3 == null) {
                aap3 = aap.f134650h;
            }
            gVar2.mo40101c(aap3, 3);
            return C118826c.f331422a;
        }
        throw new C114463da(C51962fo.INTERNAL_ERROR);
    }
}
