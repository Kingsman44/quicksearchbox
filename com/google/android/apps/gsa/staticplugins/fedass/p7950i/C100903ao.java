package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132797e;
import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.soda.C19245ah;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19419w;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import com.google.speech.p5218j.C66997hf;
import com.google.speech.p5218j.C66999hh;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ao */
/* compiled from: PG */
public final /* synthetic */ class C100903ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C100908at f281918a;

    /* renamed from: b */
    public final /* synthetic */ C66999hh f281919b;

    public /* synthetic */ C100903ao(C100908at atVar, C66999hh hhVar) {
        this.f281918a = atVar;
        this.f281919b = hhVar;
    }

    public final Object apply(Object obj) {
        C19419w wVar;
        C100908at atVar = this.f281918a;
        C66999hh hhVar = this.f281919b;
        C132800h hVar = (C132800h) obj;
        C19419w c = atVar.f281926c.mo92102c(hVar);
        C100934q qVar = atVar.f281926c;
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar2 = zVar.f362397c;
        if (wVar2 == null) {
            wVar2 = C132815w.f362363x;
        }
        if (!wVar2.f362375k) {
            ((C19435g) qVar.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Inference.Optin.Reason", C19419w.RUNTIME_FLAG_OFF.f54321h);
            wVar = C19419w.RUNTIME_FLAG_OFF;
        } else {
            C19419w a = C100934q.m167167a(hVar);
            ((C19435g) qVar.f281979a.mo17428b()).mo24621c("Sheldon.Classic.Inference.Optin.Reason", a.f54321h);
            wVar = a;
        }
        if (c.mo24611a() || wVar.mo24611a()) {
            C66997hf hfVar = hhVar.f182132d;
            if (hfVar == null) {
                hfVar = C66997hf.f182099z;
            }
            String str = hfVar.f182115n;
            C100888a aVar = new C100888a(str, C19245ah.m36696d(str));
            C8476as asVar = aVar.f281880b;
            if (asVar == null) {
                ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19713)).mo56386p("Soda Language pack proto not found.");
                return Optional.empty();
            }
            Locale forLanguageTag = Locale.forLanguageTag(asVar.f29417b);
            if (!forLanguageTag.equals(Locale.US)) {
                ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19712)).mo56389s("Sheldon p13n resources is only supported for en-US. Soda locale pack locale = %s", forLanguageTag);
                return Optional.empty();
            }
            C100904ap apVar = new C100904ap(atVar, hVar.f362334b, aVar);
            C47633f g = C47633f.m84733g(C60856cj.m92905n(C47810es.m84965e(apVar), atVar.f281927d));
            C100906ar arVar = new C100906ar();
            C60856cj.m92911t(g.f164926b, C47810es.m84974n(arVar), atVar.f281927d);
            if (!wVar.mo24611a()) {
                ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19711)).mo56389s("Sheldon inference not enabled. InferenceReason: %s", wVar);
                return Optional.empty();
            }
            C8476as asVar2 = aVar.f281880b;
            if (asVar2 == null) {
                ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19719)).mo56386p("Soda Language pack proto not found.");
            } else {
                String str2 = asVar2.f29417b;
                if (TextUtils.isEmpty(str2)) {
                    ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19718)).mo56386p("Soda Locale not found in the language pack.");
                } else {
                    Locale forLanguageTag2 = Locale.forLanguageTag(str2);
                    if (!forLanguageTag2.equals(Locale.US)) {
                        ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19717)).mo56389s("Sheldon p13n resources is only supported for en-US. Soda locale pack locale = %s", forLanguageTag2);
                    } else {
                        int i = asVar2.f29419d;
                        if (i > 0) {
                            C132798f fVar = hVar.f362335c;
                            if (fVar == null) {
                                fVar = C132798f.f362315o;
                            }
                            C132797e eVar = fVar.f362325i;
                            if (eVar == null) {
                                eVar = C132797e.f362307g;
                            }
                            if (i != eVar.f362314f) {
                                ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19715)).mo56386p("p13n resources version doesn't match the Soda Language pack version.");
                                C59052c cVar = (C59052c) ((C59052c) C100908at.f281924a.mo56225c()).mo56372aa(19716);
                                C132798f fVar2 = hVar.f362335c;
                                if (fVar2 == null) {
                                    fVar2 = C132798f.f362315o;
                                }
                                C132797e eVar2 = fVar2.f362325i;
                                if (eVar2 == null) {
                                    eVar2 = C132797e.f362307g;
                                }
                                cVar.mo56393w("p13n resources version (%d) doesn't match the Soda Language pack version (%d).", eVar2.f362314f, asVar2.f29419d);
                            }
                        }
                        C132798f fVar3 = hVar.f362335c;
                        if (fVar3 == null) {
                            fVar3 = C132798f.f362315o;
                        }
                        C132797e eVar3 = fVar3.f362325i;
                        if (eVar3 == null) {
                            eVar3 = C132797e.f362307g;
                        }
                        String str3 = eVar3.f362313e;
                        if (TextUtils.isEmpty(str3)) {
                            ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19706)).mo56386p("Sheldon p13n resources unavailable.");
                            return Optional.empty();
                        }
                        ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19704)).mo56386p("Returning the sheldon personalized resources.");
                        return Optional.m71637of(str3);
                    }
                }
            }
            ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19707)).mo56386p("Sheldon p13n resources are not compatible with Soda.");
            return Optional.empty();
        }
        ((C59052c) ((C59052c) C100908at.f281924a.mo56224b()).mo56372aa(19714)).mo56354G("Sheldon not enabled. TrainingReason: %s, InferenceReason: %s", c, wVar);
        return Optional.empty();
    }
}
