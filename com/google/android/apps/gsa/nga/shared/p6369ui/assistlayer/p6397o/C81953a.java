package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6397o;

import android.content.Context;
import android.view.ContextThemeWrapper;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.material.p3505b.C44534d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a */
/* compiled from: PG */
public final class C81953a {

    /* renamed from: a */
    private static final C59071e f224075a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.ui.assistlayer.o.a");

    /* renamed from: b */
    private final C104149a f224076b;

    public C81953a(C104149a aVar) {
        this.f224076b = aVar;
    }

    /* renamed from: a */
    public final Context mo75409a(Context context) {
        ContextThemeWrapper contextThemeWrapper;
        Context createConfigurationContext = context.createConfigurationContext(context.getResources().getConfiguration());
        int c = this.f224076b.mo93972c() - 1;
        if (c == 1) {
            ((C59052c) ((C59052c) f224075a.mo56224b()).mo56372aa(6422)).mo56386p("AssistLayer is using the Material You theme.");
            contextThemeWrapper = new ContextThemeWrapper(createConfigurationContext, 2132150608);
        } else if (c != 2) {
            ((C59052c) ((C59052c) f224075a.mo56224b()).mo56372aa(6421)).mo56386p("AssistLayer is using the Material theme.");
            contextThemeWrapper = new ContextThemeWrapper(createConfigurationContext, 2132150605);
        } else {
            ((C59052c) ((C59052c) f224075a.mo56224b()).mo56372aa(6423)).mo56386p("AssistLayer is using the Material Beacon theme.");
            contextThemeWrapper = new ContextThemeWrapper(createConfigurationContext, 2132150606);
        }
        return C44534d.m78716c(contextThemeWrapper);
    }
}
