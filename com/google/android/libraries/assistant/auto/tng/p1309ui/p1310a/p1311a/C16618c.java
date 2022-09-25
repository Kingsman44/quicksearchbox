package com.google.android.libraries.assistant.auto.tng.p1309ui.p1310a.p1311a;

import android.content.Context;
import android.graphics.drawable.Icon;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.a.a.c */
/* compiled from: PG */
public final class C16618c {

    /* renamed from: a */
    public final C47449e f48704a;

    /* renamed from: b */
    public final C16620e f48705b;

    /* renamed from: c */
    private final Executor f48706c;

    public C16618c(C47449e eVar, C16620e eVar2, Executor executor) {
        this.f48704a = eVar;
        this.f48705b = eVar2;
        this.f48706c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo22933a(Icon icon, Context context) {
        C16617b bVar = new C16617b(this, icon, context);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f48706c);
    }
}
