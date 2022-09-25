package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129720c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.C129722e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.aku;
import com.google.assistant.p3897e.p3921j.akz;
import com.google.assistant.p3897e.p3921j.alb;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.v */
/* compiled from: PG */
public final /* synthetic */ class C129802v implements Function {

    /* renamed from: a */
    public final /* synthetic */ C129739aa f356142a;

    public /* synthetic */ C129802v(C129739aa aaVar) {
        this.f356142a = aaVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C129739aa aaVar = this.f356142a;
        akz akz = (akz) obj;
        if (akz.f135300a == 2) {
            C129722e eVar = aaVar.f356039p;
            alb alb = ((aku) akz.f135301b).f135292a;
            if (alb == null) {
                alb = alb.f135306b;
            }
            eVar.f355970b.execute(C47810es.m84977q(new C129720c(eVar, alb)));
        }
        return C127406c.f350821b;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
