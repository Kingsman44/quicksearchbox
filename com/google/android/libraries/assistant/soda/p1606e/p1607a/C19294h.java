package com.google.android.libraries.assistant.soda.p1606e.p1607a;

import com.google.common.p4526f.C59052c;
import java.util.concurrent.TimeUnit;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.soda.e.a.h */
/* compiled from: PG */
public final /* synthetic */ class C19294h implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C19294h f54017a = new C19294h();

    private /* synthetic */ C19294h() {
    }

    public final void accept(Object obj) {
        C59052c cVar = (C59052c) C19299m.f54021a.mo56224b();
        cVar.mo56374ac(1, TimeUnit.MINUTES);
        ((C59052c) cVar.mo56372aa(47722)).mo56359L("Found %s in file group %s at: %s [SD]", "hotmatch.data", "apa_hotmatch", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
