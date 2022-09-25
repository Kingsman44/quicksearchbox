package com.google.android.apps.auto.sdk;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.google.android.apps.auto.sdk.ab */
/* compiled from: PG */
public final class C8966ab {
    /* renamed from: a */
    public static final boolean m23523a(C8994z zVar, Context context, Resources resources) {
        C8994z zVar2 = C8994z.SUPPORTS_WINDOW_INSETS;
        int identifier = resources.getIdentifier(zVar.f31115d, "bool", context.getPackageName());
        if (identifier != 0) {
            return resources.getBoolean(identifier);
        }
        Boolean bool = zVar.f31116e;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new Resources.NotFoundException("Can't find resource: @bool/".concat(String.valueOf(zVar.f31115d)));
    }
}
