package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.aj */
/* compiled from: PG */
public final /* synthetic */ class C117195aj implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C117204as f325331a;

    /* renamed from: b */
    public final /* synthetic */ boolean f325332b;

    /* renamed from: c */
    public final /* synthetic */ Context f325333c;

    public /* synthetic */ C117195aj(C117204as asVar, boolean z, Context context) {
        this.f325331a = asVar;
        this.f325332b = z;
        this.f325333c = context;
    }

    public final C60870cx apply(Object obj) {
        C117204as asVar = this.f325331a;
        boolean z = this.f325332b;
        Context context = this.f325333c;
        Void voidR = (Void) obj;
        ((C89859i) asVar.f325358l.mo27525b()).mo83702b(C89849ae.SELECTABLE_SEARCH_WIDGET_UPDATE_DSE_COMPLETED);
        if (z) {
            return asVar.mo103185d(context, AppWidgetManager.getInstance(context), asVar.f325355i.mo83226s());
        }
        return C60866ct.f164955a;
    }
}
