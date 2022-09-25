package com.google.android.libraries.search.assistant.performer.p2767j;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.presencemanager.ActiveUser;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.l */
/* compiled from: PG */
public final /* synthetic */ class C36190l implements Function {

    /* renamed from: a */
    public final /* synthetic */ Intent f94553a;

    public /* synthetic */ C36190l(Intent intent) {
        this.f94553a = intent;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Intent intent = this.f94553a;
        Bundle bundle = new Bundle();
        bundle.putBinder("presence-manager-active-user", ((ActiveUser) obj).f394084a);
        intent.putExtras(bundle);
        return intent;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
