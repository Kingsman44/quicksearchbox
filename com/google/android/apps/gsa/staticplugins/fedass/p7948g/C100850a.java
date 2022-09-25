package com.google.android.apps.gsa.staticplugins.fedass.p7948g;

import android.text.TextUtils;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132815w;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.android.libraries.assistant.trainingcache.p1615a.p1616a.C19397a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5228m.C67276ag;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67280ak;
import com.google.speech.p5228m.C67349m;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.g.a */
/* compiled from: PG */
public final /* synthetic */ class C100850a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C100851b f281811a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f281812b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f281813c;

    public /* synthetic */ C100850a(C100851b bVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f281811a = bVar;
        this.f281812b = cxVar;
        this.f281813c = cxVar2;
    }

    public final Object call() {
        int b;
        C100851b bVar = this.f281811a;
        C60870cx cxVar = this.f281812b;
        C60870cx cxVar2 = this.f281813c;
        C132800h hVar = (C132800h) C60856cj.m92909r(cxVar);
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        C132815w wVar = zVar.f362397c;
        if (wVar == null) {
            wVar = C132815w.f362363x;
        }
        if (!wVar.f362366b) {
            C59104x b2 = C100851b.f281814a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
            ((C59052c) ((C59052c) b2).mo56372aa(19648)).mo56386p("Hotword training not scheduled: fedhot flag is OFF.");
            return Optional.empty();
        } else if (!bVar.f281815b.mo92028c(hVar)) {
            C59104x b3 = C100851b.f281814a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
            ((C59052c) ((C59052c) b3).mo56372aa(19647)).mo56386p("Hotword training not scheduled: setting OFF.");
            return Optional.empty();
        } else {
            C132818z zVar2 = hVar.f362336d;
            if (zVar2 == null) {
                zVar2 = C132818z.f362393h;
            }
            String str = zVar2.f362399e;
            if (TextUtils.isEmpty(str)) {
                C59104x b4 = C100851b.f281814a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
                ((C59052c) ((C59052c) b4).mo56372aa(19646)).mo56386p("Hotword training not scheduled: empty population.");
                return Optional.empty();
            }
            Optional optional = (Optional) C60856cj.m92909r(cxVar2);
            if (optional.isEmpty()) {
                C59104x d = C100851b.f281814a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
                ((C59052c) ((C59052c) d).mo56372aa(19650)).mo56386p("CacheMetrics is not present. nothing to register.");
            } else {
                C67349m mVar = (C67349m) optional.get();
                if (mVar.f183063b.size() > 0) {
                    long j = 0;
                    for (C67280ak akVar : mVar.f183063b) {
                        int i = akVar.f182884a;
                        int b5 = C67278ai.m97449b(i);
                        if ((b5 != 0 && b5 == 1005) || ((b = C67278ai.m97449b(i)) != 0 && b == 1006)) {
                            C67276ag agVar = akVar.f182885b;
                            if (agVar == null) {
                                agVar = C67276ag.f182875c;
                            }
                            j += agVar.f182877a;
                            if (j >= 1) {
                                C58976aa aaVar = C58975e.f156826a;
                                C19397a aVar = new C19397a();
                                aVar.mo24545b(str);
                                aVar.f54267a = "HotwordTrainerSession";
                                aVar.mo24546c(293690132);
                                return Optional.m71637of(aVar.mo24544a());
                            }
                        }
                    }
                }
                C59104x d2 = C100851b.f281814a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
                ((C59052c) ((C59052c) d2).mo56372aa(19649)).mo56386p("Audio record count is zero. nothing to register.");
            }
            C59104x b6 = C100851b.f281814a.mo56224b();
            b6.mo56378ag(C58975e.f156826a, "FedHotwordRegistration");
            ((C59052c) ((C59052c) b6).mo56372aa(19645)).mo56386p("Hotword training not scheduled. empty cache.");
            return Optional.empty();
        }
    }
}
