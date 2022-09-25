package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.ActivityManager;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.o.a.d */
/* compiled from: PG */
public final /* synthetic */ class C34903d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C34903d f92556a = new C34903d();

    private /* synthetic */ C34903d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58974d dVar = C34913n.f92566a;
        return ((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
