package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.assistant.p3897e.p3921j.p3924c.C51745p;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.x */
/* compiled from: PG */
public final /* synthetic */ class C36176x implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36178z f94534a;

    public /* synthetic */ C36176x(C36178z zVar) {
        this.f94534a = zVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C36178z zVar = this.f94534a;
        ((C59052c) ((C59052c) C36178z.f94537a.mo56224b()).mo56372aa(52189)).mo56386p("TNG DeleteReminderOnDevicePerformer called.");
        return C60922j.m93045h(C60838bs.m92859i(zVar.f94539c.mo50215b(zVar.f94538b)), new C36177y(zVar, (C51745p) obj), C60826bg.f164896a);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
