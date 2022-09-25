package com.google.android.apps.gsa.staticplugins.opa.morris2.framework.p8388a;

import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.assistant.auto.tng.morris.p1069d.p1070a.C14160ab;
import com.google.assistant.p3897e.p3929l.p3930a.C52685ar;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.framework.a.ah */
/* compiled from: PG */
public final /* synthetic */ class C109581ah implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C109585al f305191a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f305192b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f305193c;

    public /* synthetic */ C109581ah(C109585al alVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f305191a = alVar;
        this.f305192b = cxVar;
        this.f305193c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C109585al alVar = this.f305191a;
        C60870cx cxVar = this.f305192b;
        C60870cx cxVar2 = this.f305193c;
        try {
            if (C60856cj.m92909r(cxVar) != C14782b.SUCCESS) {
                C59104x c = C109585al.f305198a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
                ((C59052c) ((C59052c) c).mo56372aa(24906)).mo56386p("Driving settings fetch failed");
                return C60866ct.f164955a;
            }
            try {
                C52686as asVar = (C52686as) alVar.f305205h.orElse(C52686as.f138291q);
                C14077e eVar = (C14077e) C60856cj.m92909r(cxVar2);
                boolean c2 = C14160ab.m30482c(alVar.f305204g);
                boolean b = C14160ab.m30481b(alVar.f305204g);
                if (!c2) {
                    if (!b) {
                        alVar.f305206i.mo21401e(false);
                        alVar.f305206i.mo21398b(false);
                        alVar.f305206i.mo21400d(false);
                        alVar.f305202e.set(alVar.mo97910k((C52686as) alVar.f305205h.get()));
                        alVar.f305200c.set(((C52686as) alVar.f305205h.get()).f138299g);
                        alVar.f305201d.set(((C52686as) alVar.f305205h.get()).f138306n);
                        return C60866ct.f164955a;
                    }
                    b = true;
                }
                C52685ar arVar = (C52685ar) asVar.toBuilder();
                if (eVar.f42742j && c2) {
                    C58976aa aaVar = C58975e.f156826a;
                    arVar.copyOnWrite();
                    C52686as asVar2 = (C52686as) arVar.instance;
                    asVar2.f138293a |= 2048;
                    asVar2.f138300h = true;
                }
                if (eVar.f42744l && b) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    arVar.copyOnWrite();
                    C52686as asVar3 = (C52686as) arVar.instance;
                    asVar3.f138293a |= 1048576;
                    asVar3.f138306n = true;
                }
                if (eVar.f42743k && b) {
                    C58976aa aaVar3 = C58975e.f156826a;
                    arVar.copyOnWrite();
                    C52686as asVar4 = (C52686as) arVar.instance;
                    asVar4.f138293a |= 1024;
                    asVar4.f138299g = false;
                }
                if (!((C52686as) arVar.build()).equals(asVar)) {
                    alVar.mo97909j((C52686as) arVar.build());
                }
            } catch (ExecutionException e) {
                C59104x c3 = C109585al.f305198a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e)).mo56372aa(24908)).mo56386p("Morris data store fetch failed");
            }
            alVar.f305206i.mo21401e(false);
            alVar.f305206i.mo21398b(false);
            alVar.f305206i.mo21400d(false);
            alVar.f305202e.set(alVar.mo97910k((C52686as) alVar.f305205h.get()));
            alVar.f305200c.set(((C52686as) alVar.f305205h.get()).f138299g);
            alVar.f305201d.set(((C52686as) alVar.f305205h.get()).f138306n);
            return C60866ct.f164955a;
        } catch (ExecutionException e2) {
            C59104x c4 = C109585al.f305198a.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "Morris.SettingsDataSrc");
            ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e2)).mo56372aa(24907)).mo56386p("Driving settings fetch failed");
            return C60866ct.f164955a;
        }
    }
}
