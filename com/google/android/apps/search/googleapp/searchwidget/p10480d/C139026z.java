package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.z */
/* compiled from: PG */
public final /* synthetic */ class C139026z implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139001ae f378089a;

    /* renamed from: b */
    public final /* synthetic */ C139006f f378090b;

    /* renamed from: c */
    public final /* synthetic */ RemoteViews f378091c;

    /* renamed from: d */
    public final /* synthetic */ boolean f378092d;

    public /* synthetic */ C139026z(C139001ae aeVar, C139006f fVar, RemoteViews remoteViews, boolean z) {
        this.f378089a = aeVar;
        this.f378090b = fVar;
        this.f378091c = remoteViews;
        this.f378092d = z;
    }

    public final Object apply(Object obj) {
        C139001ae aeVar = this.f378089a;
        C139006f fVar = this.f378090b;
        RemoteViews remoteViews = this.f378091c;
        boolean z = this.f378092d;
        Bitmap bitmap = (Bitmap) obj;
        String str = fVar.f378040b;
        C139008h hVar = fVar.f378041c;
        if (hVar == null) {
            hVar = C139008h.f378043h;
        }
        C139002b bVar = hVar.f378051g;
        if (bVar == null) {
            bVar = C139002b.f378023f;
        }
        PendingIntent a = aeVar.mo114652a(str, bVar, 200);
        if (a == null) {
            ((C59052c) ((C59052c) C139001ae.f378015a.mo56226d()).mo56372aa(41349)).mo56386p("Cannot build search icon as intent data is missing.");
            return Optional.empty();
        }
        remoteViews.setImageViewBitmap(R.id.googleapp_search_widget_third_party_logo, bitmap);
        remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_third_party_logo, a);
        if (!z) {
            remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_background, a);
        }
        return Optional.m71637of(remoteViews);
    }
}
