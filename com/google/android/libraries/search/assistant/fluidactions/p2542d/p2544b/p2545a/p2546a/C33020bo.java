package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2546a;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.common.p4526f.C59071e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C33020bo implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C33020bo f88422a = new C33020bo();

    private /* synthetic */ C33020bo() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C59071e eVar = C33025bt.f88431a;
        return (KeyguardManager) ((Context) obj).getSystemService("keyguard");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
