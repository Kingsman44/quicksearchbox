package com.google.android.libraries.assistant.auto.ondevice.utils;

import com.evernote.android.state.BuildConfig;
import com.google.protos.p4985f.p4988b.p4993d.C64788h;
import com.google.protos.p4985f.p4988b.p4993d.C64791k;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.utils.d */
/* compiled from: PG */
public final /* synthetic */ class C11941d implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C11941d f38360a = new C11941d();

    private /* synthetic */ C11941d() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        int i = C11942e.f38361b;
        C64788h hVar = ((C64791k) obj).f175601b;
        if (hVar == null) {
            hVar = C64788h.f175594c;
        }
        return hVar.f175596a == 4 ? (String) hVar.f175597b : BuildConfig.FLAVOR;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
