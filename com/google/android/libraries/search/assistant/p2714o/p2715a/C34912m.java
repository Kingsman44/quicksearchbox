package com.google.android.libraries.search.assistant.p2714o.p2715a;

import android.app.ActivityManager;
import android.content.ComponentName;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.o.a.m */
/* compiled from: PG */
public final /* synthetic */ class C34912m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C34912m f92565a = new C34912m();

    private /* synthetic */ C34912m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58974d dVar = C34913n.f92566a;
        return (ComponentName) Objects.requireNonNull(((ActivityManager.RunningTaskInfo) obj).topActivity);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
