package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Intent;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.j */
/* compiled from: PG */
public final /* synthetic */ class C76966j implements Function {

    /* renamed from: a */
    public final /* synthetic */ C76973q f212484a;

    public /* synthetic */ C76966j(C76973q qVar) {
        this.f212484a = qVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C76973q qVar = this.f212484a;
        Intent intent = new Intent((String) obj);
        if (qVar.mo72372d()) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1).putExtra("android.intent.extras.LENS_FACING_FRONT", 1).putExtra("com.google.assistant.extra.USE_FRONT_CAMERA", true).putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
        if (qVar.mo72373e()) {
            intent.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", true);
        }
        qVar.mo72369a().ifPresent(new C76970n(intent));
        qVar.mo72371c().ifPresent(new C76971o(intent));
        qVar.mo72370b().ifPresent(new C76961e(intent));
        return intent;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
