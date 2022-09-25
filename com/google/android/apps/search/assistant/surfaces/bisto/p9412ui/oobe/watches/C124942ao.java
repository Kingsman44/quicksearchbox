package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import androidx.lifecycle.C2368bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.OobeActivityViewModel;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.ao */
/* compiled from: PG */
class C124942ao implements C46440f {

    /* renamed from: a */
    final /* synthetic */ C124944aq f344731a;

    public C124942ao(C124944aq aqVar) {
        this.f344731a = aqVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
        Void voidR = (Void) obj;
        C59104x c = C124944aq.f344733a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ResetAssistantSettings");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36395)).mo56386p("Failed continue anyway");
        ((OobeActivityViewModel) new C2368bp(this.f344731a.f344734b.requireActivity()).mo5770a(OobeActivityViewModel.class)).mo106637a().mo106662b("DisableAssistantOrphan-Error");
        this.f344731a.mo106738a();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
        Void voidR = (Void) obj;
        Void voidR2 = (Void) obj2;
        this.f344731a.mo106738a();
    }

    /* renamed from: i */
    public final /* synthetic */ void mo18068i(Object obj) {
    }
}
