package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.ca */
/* compiled from: PG */
public final class C112775ca {
    /* renamed from: a */
    static final void m186636a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && !queryIntentActivities.isEmpty()) {
            context.startActivity(intent);
        }
    }
}
