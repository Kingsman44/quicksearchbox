package com.google.android.libraries.web.weblayer.contrib.p3452a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.common.util.concurrent.C60934v;
import java.util.List;
import p3186j$.util.DesugarArrays;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.web.weblayer.contrib.a.p */
/* compiled from: PG */
public final /* synthetic */ class C44158p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C44161s f114900a;

    /* renamed from: b */
    public final /* synthetic */ List f114901b;

    public /* synthetic */ C44158p(C44161s sVar, List list) {
        this.f114900a = sVar;
        this.f114901b = list;
    }

    public final C60870cx apply(Object obj) {
        C44161s sVar = this.f114900a;
        return C47638k.m84752c((List) DesugarArrays.stream((T[]) (String[]) obj).filter(new C44155m(this.f114901b)).map(new C44156n(sVar)).collect(Collectors.toCollection(C44152j.f114891a))).mo51520a(new C60934v((Object) null), C60826bg.f164896a);
    }
}
