package com.google.android.libraries.search.assistant.performer.p2766i;

import android.content.Intent;
import android.net.Uri;
import com.google.assistant.p3897e.p3917i.p3918a.C51473j;
import com.google.assistant.p3897e.p3917i.p3918a.C51527l;
import java.util.List;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.ak */
/* compiled from: PG */
public final /* synthetic */ class C36132ak implements Function {

    /* renamed from: a */
    public final /* synthetic */ C36133al f94471a;

    public /* synthetic */ C36132ak(C36133al alVar) {
        this.f94471a = alVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        Uri.Builder builder;
        C36133al alVar = this.f94471a;
        C51527l lVar = (C51527l) obj;
        boolean z = false;
        C36128ag.m64537e(lVar.f134276b.size() > 0, "AlarmParams contains no alarms");
        if (lVar.f134276b.size() == 1) {
            C51473j jVar = (C51473j) lVar.f134276b.get(0);
            if (1 == (jVar.f134092a & 1)) {
                z = true;
            }
            C36128ag.m64537e(z, "Alarm 0 has no AlarmId");
            builder = Uri.parse(jVar.f134095d).buildUpon().appendPath("delete");
        } else {
            Uri.Builder appendPath = C36133al.f94472a.buildUpon().appendPath("multi");
            for (C51473j jVar2 : lVar.f134276b) {
                C36128ag.m64537e(1 == (jVar2.f134092a & 1), "An Alarm in AlarmParams has no AlarmId");
                List<String> pathSegments = Uri.parse(jVar2.f134095d).getPathSegments();
                if (pathSegments.size() > 1) {
                    appendPath.appendQueryParameter("action", Uri.parse("/alarm").buildUpon().appendPath(pathSegments.get(1)).appendPath("delete").build().toString());
                }
            }
            builder = appendPath;
        }
        Uri build = builder.build();
        return alVar.f94473b.mo40003a(new Intent().setAction("android.intent.action.VIEW").setData(build).setPackage(build.getHost()));
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
