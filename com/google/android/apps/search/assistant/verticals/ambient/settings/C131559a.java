package com.google.android.apps.search.assistant.verticals.ambient.settings;

import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4552o.ali;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.a */
/* compiled from: PG */
public final /* synthetic */ class C131559a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C131567i f359447a;

    /* renamed from: b */
    public final /* synthetic */ ak f359448b;

    public /* synthetic */ C131559a(C131567i iVar, ak akVar) {
        this.f359447a = iVar;
        this.f359448b = akVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        return C131567i.m213966a((ali) entry.getKey(), this.f359447a.mo110191c(this.f359448b, (C50794cr) entry.getValue()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
