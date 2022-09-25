package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11686aq;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11687ar;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ak */
/* compiled from: PG */
final class C11489ak implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C11686aq f37342a;

    public C11489ak(C11686aq aqVar) {
        this.f37342a = aqVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        C11686aq aqVar = this.f37342a;
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        aqVar.copyOnWrite();
        C11687ar arVar = (C11687ar) aqVar.instance;
        C11687ar arVar2 = C11687ar.f37682e;
        arVar.f37685b = 4;
        arVar.f37686c = str;
        return (C11687ar) aqVar.build();
    }
}
