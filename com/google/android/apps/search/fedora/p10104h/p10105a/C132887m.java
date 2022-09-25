package com.google.android.apps.search.fedora.p10104h.p10105a;

import com.google.common.util.C60790c;
import java.io.File;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.fedora.h.a.m */
/* compiled from: PG */
public final /* synthetic */ class C132887m implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C132887m f362523a = new C132887m();

    private /* synthetic */ C132887m() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        File file = (File) obj;
        File file2 = new File(C60790c.m92793a(file.getAbsolutePath(), "personalization/asr_finetuning_agsa_plan.pb"));
        if (!file2.exists()) {
            file.getAbsolutePath();
            return Optional.empty();
        }
        file.getAbsolutePath();
        return Optional.m71637of(file2);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
