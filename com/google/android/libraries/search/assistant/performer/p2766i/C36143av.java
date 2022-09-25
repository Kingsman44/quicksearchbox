package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.net.Uri;
import com.google.assistant.p3897e.p3899b.p3901b.C50883j;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.av */
/* compiled from: PG */
public final /* synthetic */ class C36143av implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36144aw f94485a;

    public /* synthetic */ C36143av(C36144aw awVar) {
        this.f94485a = awVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C36144aw awVar = this.f94485a;
        C50883j jVar = (C50883j) obj;
        C36128ag.m64537e(jVar.f132486a.size() > 0, "AlarmStopAlarmArgs contained no AlarmIds to stop");
        Uri build = Uri.parse((String) jVar.f132486a.get(0)).buildUpon().appendPath("dismiss").build();
        return awVar.f94486a.mo40003a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
