package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.material.p3505b.C44534d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.ip */
/* compiled from: PG */
public final class C108435ip {
    /* renamed from: a */
    public static ContextThemeWrapper m180256a(C104149a aVar, Context context) {
        if (aVar.mo93970a()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(C44534d.m78716c(context), 2132148956);
            if (!C44534d.m78715b()) {
                return contextThemeWrapper;
            }
            contextThemeWrapper.getTheme().applyStyle(2132148957, true);
            return contextThemeWrapper;
        } else if (!aVar.mo93971b()) {
            return new ContextThemeWrapper(context, 2132148451);
        } else {
            ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, 2132149689);
            if (!C44534d.m78715b()) {
                return contextThemeWrapper2;
            }
            contextThemeWrapper2.getTheme().applyStyle(2132149690, true);
            return contextThemeWrapper2;
        }
    }
}
