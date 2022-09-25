package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.l */
/* compiled from: PG */
public final /* synthetic */ class C76968l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C76974r f212486a;

    public /* synthetic */ C76968l(C76974r rVar) {
        this.f212486a = rVar;
    }

    public final void accept(Object obj) {
        Intent intent = (Intent) obj;
        ResolveInfo resolveActivity = this.f212486a.f212490a.resolveActivity(intent, 0);
        if (resolveActivity != null) {
            ActivityInfo activityInfo = resolveActivity.activityInfo;
            if (!activityInfo.name.equals("com.android.internal.app.ResolverActivity")) {
                intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
