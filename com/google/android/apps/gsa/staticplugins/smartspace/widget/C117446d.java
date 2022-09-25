package com.google.android.apps.gsa.staticplugins.smartspace.widget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.apps.gsa.shared.util.C90771bo;
import com.google.android.apps.gsa.shared.util.UserHandleCompat;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.smartspace.widget.d */
/* compiled from: PG */
public final class C117446d implements C86091a {

    /* renamed from: a */
    private static final C59071e f325986a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.smartspace.widget.d");

    /* renamed from: b */
    private final Context f325987b;

    public C117446d(Context context) {
        this.f325987b = context;
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        if (C90771bo.m148273b(this.f325987b, UserHandleCompat.m148154a())) {
            try {
                AppWidgetManager.getInstance(this.f325987b).updateAppWidgetProviderInfo(SmartspaceWidgetProvider.f325979f, "hidden_provider_info");
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f325986a.mo56226d()).mo56382g(e)).mo56372aa(33127)).mo56386p("Failed to update AppWidgetProviderInfo for Smartspace.");
            }
        }
    }
}
