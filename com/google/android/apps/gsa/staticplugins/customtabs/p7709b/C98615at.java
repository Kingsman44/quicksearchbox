package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.exploreoncontent.ExplorePivotItem;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.at */
/* compiled from: PG */
public final /* synthetic */ class C98615at implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C98617av f275438a;

    /* renamed from: b */
    public final /* synthetic */ C54120s f275439b;

    /* renamed from: c */
    public final /* synthetic */ C98642y f275440c;

    /* renamed from: d */
    public final /* synthetic */ ExplorePivotItem f275441d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f275442e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f275443f;

    public /* synthetic */ C98615at(C98617av avVar, C54120s sVar, C98642y yVar, ExplorePivotItem explorePivotItem, C60870cx cxVar, C60870cx cxVar2) {
        this.f275438a = avVar;
        this.f275439b = sVar;
        this.f275440c = yVar;
        this.f275441d = explorePivotItem;
        this.f275442e = cxVar;
        this.f275443f = cxVar2;
    }

    public final Object call() {
        C98617av avVar = this.f275438a;
        C54120s sVar = this.f275439b;
        C98642y yVar = this.f275440c;
        ExplorePivotItem explorePivotItem = this.f275441d;
        C60870cx cxVar = this.f275442e;
        C60870cx cxVar2 = this.f275443f;
        C58833ax b = avVar.mo91226b(sVar, yVar);
        if (!b.mo56113h()) {
            return C58836b.f156633a;
        }
        RemoteViews remoteViews = (RemoteViews) b.mo56107c();
        remoteViews.setTextViewText(R.id.explore_peek_card_title, explorePivotItem.f242885b);
        if (!TextUtils.isEmpty(explorePivotItem.f242888e)) {
            remoteViews.setTextViewText(R.id.explore_peek_card_source, explorePivotItem.f242888e);
            remoteViews.setViewVisibility(R.id.explore_peek_card_source, 0);
        }
        C98617av.m163366d(remoteViews, R.id.explore_peek_card_thumbnail, cxVar);
        C98617av.m163366d(remoteViews, R.id.explore_peek_card_favicon, cxVar2);
        return C58833ax.m90834k(remoteViews);
    }
}
