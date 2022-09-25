package com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9995c.p9997b;

import android.content.Context;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59071e;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.m */
/* compiled from: PG */
public final class C131631m {

    /* renamed from: a */
    public static final C59071e f359667a = C59071e.m91331h();

    /* renamed from: com.google.android.apps.search.assistant.verticals.ambient.smartspace.c.b.m$a */
    /* compiled from: PG */
    public interface C131632a {
        /* renamed from: dX */
        Optional mo110229dX();
    }

    /* renamed from: a */
    public static final C131630l m214067a(Context context) {
        C69664n.m101061g(context, "context");
        Object orElse = ((C131632a) C47266f.m84076a(context, C131632a.class)).mo110229dX().orElse(new C131633n());
        C69664n.m101060f(orElse, "entryPoint.timersLocalCh….orElse(NoOpController())");
        return (C131630l) orElse;
    }
}
