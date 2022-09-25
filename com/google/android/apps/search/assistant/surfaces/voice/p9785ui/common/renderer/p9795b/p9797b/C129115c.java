package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import com.google.assistant.p3897e.p3902c.p3907c.C51047ek;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.c */
/* compiled from: PG */
public final /* synthetic */ class C129115c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354704a;

    public /* synthetic */ C129115c(C129123k kVar) {
        this.f354704a = kVar;
    }

    public final Object apply(Object obj) {
        C129123k kVar = this.f354704a;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            for (int i = 0; i < ((C51047ek) kVar.f354718e.instance).f132924b.size(); i++) {
                aco aco = kVar.f354718e.mo53508a(i).f132918e;
                if (aco == null) {
                    aco = aco.f134821t;
                }
                if (aco.equals(optional.get())) {
                    return Integer.valueOf(i);
                }
            }
        }
        C59104x b = C129123k.f354714a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FAReadNotiAdapter");
        ((C59052c) ((C59052c) b).mo56372aa(38216)).mo56386p("Did not find notification for ReplyResult");
        return -1;
    }
}
