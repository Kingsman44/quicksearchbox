package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11686aq;
import com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a.C11687ar;
import com.google.apps.tiktok.account.data.C46167as;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.al */
/* compiled from: PG */
final class C11490al implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C11686aq f37343a;

    public C11490al(C11686aq aqVar) {
        this.f37343a = aqVar;
    }

    public final /* synthetic */ Object apply(Object obj) {
        C46167as asVar = (C46167as) obj;
        C69664n.m101061g(asVar, "it");
        C59052c cVar = (C59052c) ((C59052c) C11494ap.f37347a.mo56226d()).mo56382g(asVar);
        cVar.mo56379ah(new C59094n(43355));
        cVar.mo56386p("Error getting account name");
        C11686aq aqVar = this.f37343a;
        aqVar.copyOnWrite();
        C11687ar arVar = (C11687ar) aqVar.instance;
        C11687ar arVar2 = C11687ar.f37682e;
        arVar.f37685b = 4;
        arVar.f37686c = BuildConfig.FLAVOR;
        return (C11687ar) aqVar.build();
    }
}
