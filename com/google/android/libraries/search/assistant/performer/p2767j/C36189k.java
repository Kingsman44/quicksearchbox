package com.google.android.libraries.search.assistant.performer.p2767j;

import android.os.Bundle;
import com.google.android.gms.presencemanager.ActiveUser;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.k */
/* compiled from: PG */
public final /* synthetic */ class C36189k implements Function {

    /* renamed from: a */
    public final /* synthetic */ Bundle f94552a;

    public /* synthetic */ C36189k(Bundle bundle) {
        this.f94552a = bundle;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Bundle bundle = this.f94552a;
        C59071e eVar = C36193o.f94556a;
        bundle.putBinder("presence-manager-active-user", ((ActiveUser) obj).f394084a);
        return bundle;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
