package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9261a;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122115b;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122119d;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;
import p3186j$.util.Objects;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C122110a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122119d f338762a;

    /* renamed from: b */
    public final /* synthetic */ Function f338763b;

    public /* synthetic */ C122110a(C122119d dVar, Function function) {
        this.f338762a = dVar;
        this.f338763b = function;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Object obj2;
        C122119d dVar = this.f338762a;
        Function function = this.f338763b;
        C122099h hVar = (C122099h) obj;
        C62940bt r2 = C62942bv.checkIsLite(((C122115b) dVar).f338768a);
        hVar.mo58887l(r2);
        Object l = hVar.f169962ag.mo58854l(r2.f169971d);
        if (l == null) {
            obj2 = r2.f169969b;
        } else {
            obj2 = r2.mo58889c(l);
        }
        Objects.requireNonNull(dVar);
        C122111b bVar = new C122111b(dVar);
        return C60922j.m93044g((C60870cx) function.apply((MessageLite) obj2), C47810es.m84963c(bVar), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
