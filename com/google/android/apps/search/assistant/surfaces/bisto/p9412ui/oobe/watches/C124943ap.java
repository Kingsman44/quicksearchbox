package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124679cr;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124680cs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124681ct;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124844bo;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ap */
/* compiled from: PG */
class C124943ap implements C46440f {

    /* renamed from: a */
    final /* synthetic */ C124944aq f344732a;

    public C124943ap(C124944aq aqVar) {
        this.f344732a = aqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        C59104x d = C124944aq.f344733a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ResetAssistantSettings");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36396)).mo56386p("Missing Device");
        this.f344732a.mo106738a();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        C124944aq aqVar = this.f344732a;
        C124679cr crVar = (C124679cr) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C124679cr.f343956o, C62921ba.m95368a());
        if (!crVar.f343966i.isEmpty()) {
            C59104x b = C124944aq.f344733a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ResetAssistantSettings");
            C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(36397);
            C124844bo boVar = aqVar.f344735c.f344439b;
            if (boVar == null) {
                boVar = C124844bo.f344417m;
            }
            cVar.mo56354G("DisableAssistant %s %s", boVar.f344420b, crVar.f343966i);
            ((OobeActivityViewModel) new C2368bp(aqVar.f344734b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("DisableAssistantOrphan");
            C46439e eVar = aqVar.f344737e;
            C124669ch chVar = aqVar.f344738f;
            C124680cs csVar = (C124680cs) C124681ct.f343972c.createBuilder();
            C124844bo boVar2 = aqVar.f344735c.f344439b;
            if (boVar2 == null) {
                boVar2 = C124844bo.f344417m;
            }
            String str = boVar2.f344420b;
            csVar.copyOnWrite();
            C124681ct ctVar = (C124681ct) csVar.instance;
            str.getClass();
            ctVar.f343974a |= 1;
            ctVar.f343975b = str;
            C46438d b2 = C46438d.m82810b(chVar.mo106580b((C124681ct) csVar.build()));
            C46440f fVar = aqVar.f344739g;
            fVar.getClass();
            eVar.mo50428h(b2.f121541a, (Object) null, fVar);
            return;
        }
        aqVar.mo106738a();
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18068i(Object obj) {
    }
}
