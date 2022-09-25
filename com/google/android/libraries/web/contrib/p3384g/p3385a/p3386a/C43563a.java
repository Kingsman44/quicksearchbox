package com.google.android.libraries.web.contrib.p3384g.p3385a.p3386a;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Function;
import p3186j$.util.function.UnaryOperator;

/* renamed from: com.google.android.libraries.web.contrib.g.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43563a implements UnaryOperator {

    /* renamed from: a */
    public final /* synthetic */ C43568f f113741a;

    public /* synthetic */ C43563a(C43568f fVar) {
        this.f113741a = fVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C60870cx cxVar;
        C43568f fVar = this.f113741a;
        C60870cx cxVar2 = (C60870cx) obj;
        if (cxVar2 != null) {
            return cxVar2;
        }
        C47558bi a = C47831fm.m85006a("WebLayerPrewarmer#prewarmNativeCode");
        try {
            if (C19559g.m37305d(Thread.currentThread())) {
                cxVar = fVar.mo46628b();
            } else {
                C43566d dVar = new C43566d(fVar);
                cxVar = C60856cj.m92905n(C47810es.m84965e(dVar), fVar.f113746a);
            }
            a.mo51417a(cxVar);
            a.close();
            return cxVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
