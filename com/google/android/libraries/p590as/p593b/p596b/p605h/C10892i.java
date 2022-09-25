package com.google.android.libraries.p590as.p593b.p596b.p605h;

import com.google.common.p4526f.p4527a.C58974d;
import java.io.File;
import p3186j$.util.DesugarArrays;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.as.b.b.h.i */
/* compiled from: PG */
public final /* synthetic */ class C10892i implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C10892i f35978a = new C10892i();

    private /* synthetic */ C10892i() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C58974d dVar = C10895l.f35981a;
        File[] listFiles = ((File) obj).listFiles();
        listFiles.getClass();
        return DesugarArrays.stream((T[]) listFiles);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
