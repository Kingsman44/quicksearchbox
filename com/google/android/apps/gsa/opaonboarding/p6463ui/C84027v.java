package com.google.android.apps.gsa.opaonboarding.p6463ui;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.material.p3505b.C44534d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.v */
/* compiled from: PG */
public final class C84027v {

    /* renamed from: a */
    private static final C59071e f228874a = C59071e.m91332i("com.google.android.apps.gsa.opaonboarding.ui.v");

    /* renamed from: a */
    public static Context m133919a(C104149a aVar, Context context, boolean z) {
        if (z) {
            return context;
        }
        if (!aVar.mo93971b()) {
            return new ContextThemeWrapper(context, 2132149501);
        }
        ((C59052c) ((C59052c) f228874a.mo56224b()).mo56372aa(6916)).mo56386p("OpaOnboarding is using the Material theme with dynamic colors.");
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132149504);
        if (!C44534d.m78715b()) {
            return contextThemeWrapper;
        }
        contextThemeWrapper.getTheme().applyStyle(2132150627, true);
        return contextThemeWrapper;
    }
}
