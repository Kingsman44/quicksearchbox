package com.google.android.libraries.search.assistant.performer.p2757g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36953a;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2846a.C36954b;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.ad */
/* compiled from: PG */
public final /* synthetic */ class C36034ad implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C36034ad f94258a = new C36034ad();

    private /* synthetic */ C36034ad() {
    }

    public final Object apply(Object obj) {
        C36953a aVar = (C36953a) ((C36954b) obj).toBuilder();
        aVar.copyOnWrite();
        C36954b bVar = (C36954b) aVar.instance;
        bVar.f96229a |= 1;
        bVar.f96230b = BuildConfig.FLAVOR;
        aVar.copyOnWrite();
        C36954b bVar2 = (C36954b) aVar.instance;
        bVar2.f96229a |= 2;
        bVar2.f96231c = 0;
        return (C36954b) aVar.build();
    }
}
