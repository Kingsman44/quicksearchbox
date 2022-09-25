package com.google.android.libraries.silk.p3240c.p3252l;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40323n;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3133b.C40335z;
import com.google.android.libraries.silk.event.C41896d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4323c.p4335l.C56912d;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.silk.c.l.i */
/* compiled from: PG */
public final class C41848i implements C40323n {

    /* renamed from: a */
    private final C41896d f109232a;

    /* renamed from: b */
    private final Executor f109233b;

    public C41848i(C41896d dVar, Executor executor) {
        this.f109232a = dVar;
        this.f109233b = executor;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo42087a(Object obj, C21311r rVar, C40335z zVar) {
        C56912d dVar = (C56912d) obj;
        if (rVar == null) {
            return C60856cj.m92899h(new IllegalStateException("No command EventData was provided"));
        }
        C41896d dVar2 = this.f109232a;
        Objects.requireNonNull(dVar2);
        C41847h hVar = new C41847h(dVar2);
        return C60856cj.m92903l(C47810es.m84977q(hVar), this.f109233b);
    }
}
