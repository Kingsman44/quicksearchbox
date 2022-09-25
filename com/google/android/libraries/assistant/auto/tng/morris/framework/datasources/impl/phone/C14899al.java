package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.car.C143100al;
import com.google.android.gms.car.CarCall;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1082c.p1083a.C14742l;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14117ar;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14594p;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.net.p4726a.p4727a.C62722b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.al */
/* compiled from: PG */
final class C14899al extends C143100al {

    /* renamed from: a */
    final /* synthetic */ C14901an f44810a;

    public C14899al(C14901an anVar) {
        this.f44810a = anVar;
    }

    /* renamed from: a */
    public final void mo21806a(boolean z, int i, int i2) {
        C59104x b = C14901an.f44813a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) b).mo56372aa(45755)).mo56359L("onAudioStateChanged: isMuted: %b route: %d, supported route mask: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2));
        this.f44810a.f44816d.mo21875g(C14742l.m31045a(z, C15388p.m32015b(i), i2));
    }

    /* renamed from: b */
    public final void mo21807b(CarCall carCall) {
        C59104x b = C14901an.f44813a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) b).mo56372aa(45756)).mo56393w("onCallAdded, id: %d, state: %d", carCall.f387931a, carCall.f387935e);
        int j = C14901an.m31327j(carCall);
        C14901an anVar = this.f44810a;
        C14117ar arVar = anVar.f44818f;
        if (arVar == null || j != 4) {
            C14117ar arVar2 = anVar.f44819g;
            if (arVar2 != null) {
                if (j != 3) {
                    if (j == 8) {
                        j = 8;
                    }
                }
                arVar2.mo21435c(C37182a.f97834bM.mo40815i(C62722b.OK));
            }
        } else {
            arVar.mo21435c(C37182a.f97829bH.mo40815i(C62722b.OK));
            j = 4;
        }
        this.f44810a.f44817e.put(Integer.valueOf(carCall.f387931a), carCall);
        this.f44810a.mo21810f(carCall);
        if (j == 5) {
            C14901an anVar2 = this.f44810a;
            C14986h hVar = anVar2.f44816d;
            hVar.getClass();
            C14907f fVar = anVar2.f44814b;
            fVar.getClass();
            boolean p = fVar.mo21834p();
            C14594p b2 = C15388p.m32015b(this.f44810a.f44814b.mo21819a());
            C14905d dVar = this.f44810a.f44815c;
            dVar.getClass();
            boolean c = dVar.mo21815c();
            if (dVar.mo21816d()) {
                c |= true;
            }
            if (dVar.mo21817e()) {
                c |= true;
            }
            if (dVar.mo21814b()) {
                c |= true;
            }
            hVar.mo21875g(C14742l.m31045a(p, b2, c ? 1 : 0));
        }
    }

    /* renamed from: c */
    public final void mo21808c(CarCall carCall) {
        C59104x b = C14901an.f44813a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) b).mo56372aa(45757)).mo56393w("onCallRemoved, id: %d, state: %d", carCall.f387931a, carCall.f387935e);
        this.f44810a.f44817e.remove(Integer.valueOf(carCall.f387931a));
        C14117ar arVar = this.f44810a.f44818f;
        if (arVar != null) {
            arVar.mo21433a(C37182a.f97831bJ.mo40805c(C62722b.OK));
        }
        String f = C15388p.m32018f(carCall);
        if (f == null) {
            f = BuildConfig.FLAVOR;
        }
        this.f44810a.f44816d.mo21875g(C14742l.m31054j(carCall.f387931a, 7, f, carCall.f387936f.f387943d));
    }

    /* renamed from: d */
    public final void mo21809d(CarCall carCall, int i) {
        C59104x b = C14901an.f44813a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.PhoneDataSource");
        ((C59052c) ((C59052c) b).mo56372aa(45758)).mo56387q("onStateChanged: %d", i);
        this.f44810a.mo21810f(carCall);
    }
}
