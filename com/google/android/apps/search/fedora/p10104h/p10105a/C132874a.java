package com.google.android.apps.search.fedora.p10104h.p10105a;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.metrics.C133072j;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.android.apps.search.fedora.p10099e.C132775af;
import com.google.android.apps.search.fedora.p10099e.C132778ai;
import com.google.android.apps.search.fedora.p10099e.C132779aj;
import com.google.android.apps.search.fedora.p10099e.C132784ao;
import com.google.android.apps.search.fedora.p10099e.C132787ar;
import com.google.android.apps.search.fedora.p10099e.C132789at;
import com.google.android.apps.search.fedora.p10099e.C132790au;
import com.google.android.apps.search.fedora.p10099e.C132791av;
import com.google.android.apps.search.fedora.p10104h.C132901j;
import com.google.android.apps.search.fedora.p10104h.C132904m;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19401e;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19403g;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19413q;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19414r;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19419w;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19421y;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19422z;
import com.google.android.libraries.search.integrations.p3021e.C38511a;
import com.google.common.p4526f.C59052c;
import com.google.common.util.C60790c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.io.File;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.fedora.h.a.a */
/* compiled from: PG */
public final /* synthetic */ class C132874a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C132875b f362499a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362500b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f362501c;

    public /* synthetic */ C132874a(C132875b bVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f362499a = bVar;
        this.f362500b = cxVar;
        this.f362501c = cxVar2;
    }

    public final Object call() {
        Optional optional;
        C19419w wVar;
        C19419w wVar2;
        C132875b bVar = this.f362499a;
        C60870cx cxVar = this.f362500b;
        C60870cx cxVar2 = this.f362501c;
        C132789at atVar = (C132789at) C60856cj.m92909r(cxVar);
        C132773ad adVar = (C132773ad) C60856cj.m92909r(cxVar2);
        C132890p pVar = (C132890p) bVar.f362503b.mo17428b();
        C132904m mVar = pVar.f362527c;
        C132779aj ajVar = adVar.f362229c;
        if (ajVar == null) {
            ajVar = C132779aj.f362244h;
        }
        C132778ai aiVar = ajVar.f362250e;
        if (aiVar == null) {
            aiVar = C132778ai.f362239d;
        }
        if ((aiVar.f362241a & 1) != 0) {
            String str = aiVar.f362242b;
            if (TextUtils.isEmpty(str)) {
                ((C59052c) ((C59052c) C132904m.f362546a.mo56224b()).mo56372aa(39883)).mo56386p("Soda Lp dir not available yet.");
                optional = Optional.empty();
            } else {
                optional = Optional.m71637of(new File(str));
            }
        } else {
            ((C59052c) ((C59052c) C132904m.f362546a.mo56224b()).mo56372aa(39884)).mo56386p("Soda Lp dir not available yet.");
            optional = Optional.empty();
        }
        Optional flatMap = optional.flatMap(C132887m.f362523a);
        Optional flatMap2 = optional.flatMap(C132888n.f362524a);
        C132901j jVar = pVar.f362526b;
        C132787ar arVar = atVar.f362292b;
        if (arVar == null) {
            arVar = C132787ar.f362281g;
        }
        C132784ao aoVar = arVar.f362285c;
        if (aoVar == null) {
            aoVar = C132784ao.f362255t;
        }
        if (!aoVar.f362265i) {
            ((C133072j) jVar.f362543a.mo17428b()).mo110965c("Sheldon.TNG.Training.Optin.Reason", C19419w.RUNTIME_FLAG_OFF.f54321h);
            wVar = C19419w.RUNTIME_FLAG_OFF;
        } else {
            C132779aj ajVar2 = adVar.f362229c;
            if (ajVar2 == null) {
                ajVar2 = C132779aj.f362244h;
            }
            C132787ar arVar2 = atVar.f362292b;
            if (arVar2 == null) {
                arVar2 = C132787ar.f362281g;
            }
            C132784ao aoVar2 = arVar2.f362285c;
            if (aoVar2 == null) {
                aoVar2 = C132784ao.f362255t;
            }
            if (!aoVar2.f362275s || ((ajVar2.f362246a & 64) != 0 && ajVar2.f362252g)) {
                C132775af afVar = adVar.f362228b;
                if (afVar == null) {
                    afVar = C132775af.f362231g;
                }
                if ((afVar.f362233a & 4) != 0) {
                    C132775af afVar2 = adVar.f362228b;
                    if (afVar2 == null) {
                        afVar2 = C132775af.f362231g;
                    }
                    if (afVar2.f362236d) {
                        wVar2 = C19419w.OPTED_IN_SETTINGS;
                    } else {
                        wVar2 = C19419w.OPTED_OUT_SETTINGS;
                    }
                } else {
                    wVar2 = C19419w.OPTED_IN_SETTINGS;
                }
            } else {
                wVar2 = C19419w.CACHING_NOT_ELIGIBLE;
            }
            ((C133072j) jVar.f362543a.mo17428b()).mo110965c("Sheldon.TNG.Training.Optin.Reason", wVar2.f54321h);
            wVar = wVar2;
        }
        boolean a = wVar.mo24611a();
        C132787ar arVar3 = atVar.f362292b;
        C132784ao aoVar3 = (arVar3 == null ? C132787ar.f362281g : arVar3).f362285c;
        if (aoVar3 == null) {
            aoVar3 = C132784ao.f362255t;
        }
        boolean z = aoVar3.f362267k;
        if (arVar3 == null) {
            arVar3 = C132787ar.f362281g;
        }
        C132784ao aoVar4 = arVar3.f362285c;
        if (aoVar4 == null) {
            aoVar4 = C132784ao.f362255t;
        }
        boolean z2 = aoVar4.f362268l;
        C19421y k = C19422z.m37077k();
        k.mo24583i(a);
        k.mo24576b(z);
        k.mo24578d(z2);
        k.mo24581g(optional);
        k.mo24577c(flatMap);
        k.mo24579e(flatMap2);
        C19403g gVar = (C19403g) k;
        gVar.f54292a = new File(C60790c.m92793a(C38511a.m67760a(pVar.f362527c.f362547b, "fedora").getAbsolutePath(), "sheldon/p13n/asr_p13n/brella"));
        gVar.f54293b = new File(C60790c.m92793a(C38511a.m67760a(pVar.f362527c.f362547b, "fedora").getAbsolutePath(), "sheldon/p13n/lm_p13n/brella"));
        C132790au auVar = (C132790au) C132791av.f362294d.createBuilder();
        C132779aj ajVar3 = adVar.f362229c;
        if (ajVar3 == null) {
            ajVar3 = C132779aj.f362244h;
        }
        C132778ai aiVar2 = ajVar3.f362250e;
        if (aiVar2 == null) {
            aiVar2 = C132778ai.f362239d;
        }
        String str2 = aiVar2.f362242b;
        auVar.copyOnWrite();
        C132791av avVar = (C132791av) auVar.instance;
        str2.getClass();
        avVar.f362296a = 1 | avVar.f362296a;
        avVar.f362297b = str2;
        C132779aj ajVar4 = adVar.f362229c;
        if (ajVar4 == null) {
            ajVar4 = C132779aj.f362244h;
        }
        C132778ai aiVar3 = ajVar4.f362250e;
        if (aiVar3 == null) {
            aiVar3 = C132778ai.f362239d;
        }
        int i = aiVar3.f362243c;
        auVar.copyOnWrite();
        C132791av avVar2 = (C132791av) auVar.instance;
        avVar2.f362296a |= 2;
        avVar2.f362298c = i;
        k.mo24582h(((C132791av) auVar.build()).toByteString());
        C132787ar arVar4 = atVar.f362292b;
        if (arVar4 == null) {
            arVar4 = C132787ar.f362281g;
        }
        k.mo24580f(arVar4.f362288f);
        C19422z a2 = k.mo24575a();
        if (!a2.mo24595j() || !a2.mo24591g() || !a2.mo24587d().isPresent() || !a2.mo24585b().isPresent()) {
            ((C59052c) ((C59052c) C132875b.f362502a.mo56224b()).mo56372aa(39921)).mo56386p("Not eligible for ASR FT training.");
            ((C132890p) bVar.f362503b.mo17428b()).mo110927a(bVar.mo110925b(a2, false, false), C132875b.m215858c(a2));
            return Optional.empty();
        } else if (a2.mo24587d().isEmpty() || a2.mo24585b().isEmpty()) {
            ((C59052c) ((C59052c) C132875b.f362502a.mo56225c()).mo56372aa(39920)).mo56386p("Cannot schedule the task with empty SODA LP dir and ASR plan.");
            return Optional.empty();
        } else {
            C19413q h = C19414r.m37052h();
            C19401e eVar = (C19401e) h;
            eVar.f54277a = "SheldonAsrP13nTrainerSession";
            h.mo24564e(444340172);
            h.mo24561b((File) a2.mo24587d().get());
            h.mo24562c((File) a2.mo24585b().get());
            h.mo24563d(a2.mo24588e());
            eVar.f54278b = a2.mo24584a();
            eVar.f54279c = a2;
            return Optional.m71637of(h.mo24560a());
        }
    }
}
