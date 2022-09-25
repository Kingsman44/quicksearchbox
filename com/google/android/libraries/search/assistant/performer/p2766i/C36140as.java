package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.net.Uri;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.as */
/* compiled from: PG */
public final /* synthetic */ class C36140as implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36141at f94482a;

    public /* synthetic */ C36140as(C36141at atVar) {
        this.f94482a = atVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C36141at atVar = this.f94482a;
        C51527l lVar = (C51527l) obj;
        boolean z = true;
        C36128ag.m64537e(lVar.f134276b.size() > 0, "AlarmParams contain no alarm");
        if (1 != (((C51473j) lVar.f134276b.get(0)).f134092a & 1)) {
            z = false;
        }
        C36128ag.m64537e(z, "Alarm 0 has no AlarmId");
        Uri.Builder appendPath = Uri.parse(((C51473j) lVar.f134276b.get(0)).f134095d).buildUpon().appendPath("snooze");
        if ((lVar.f134275a & 2) != 0) {
            long round = (long) Math.round(((float) lVar.f134277c) / 60000.0f);
            if (round == 0) {
                round = 1;
            }
            appendPath.appendQueryParameter("snoozeLength", Long.toString(round));
        }
        Uri build = appendPath.build();
        return atVar.f94483a.mo40003a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
