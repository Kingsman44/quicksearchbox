package com.google.android.apps.gsa.shared.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.util.p */
/* compiled from: PG */
public final class C91070p {

    /* renamed from: a */
    private static final C59071e f254335a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.p");

    /* renamed from: a */
    public static Activity m148776a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        ((C59052c) ((C59052c) f254335a.mo56224b()).mo56372aa(11315)).mo56386p("Unable to get activity from context");
        return null;
    }

    /* renamed from: b */
    public static ComponentName m148777b(Context context, Intent intent) {
        try {
            return context.startService(intent);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f254335a.mo56226d()).mo56382g(e)).mo56372aa(11316)).mo56389s("%s", "Attempting to start service when the app is in background is not allowed on Android O+. Intent: ".concat(String.valueOf(String.valueOf(intent))));
            C89911f.m146435c(36022058);
            return null;
        }
    }
}
