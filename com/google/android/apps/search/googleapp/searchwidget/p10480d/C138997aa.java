package com.google.android.apps.search.googleapp.searchwidget.p10480d;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.d.aa */
/* compiled from: PG */
public final /* synthetic */ class C138997aa implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C139001ae f378001a;

    /* renamed from: b */
    public final /* synthetic */ C139006f f378002b;

    /* renamed from: c */
    public final /* synthetic */ RemoteViews f378003c;

    public /* synthetic */ C138997aa(C139001ae aeVar, C139006f fVar, RemoteViews remoteViews) {
        this.f378001a = aeVar;
        this.f378002b = fVar;
        this.f378003c = remoteViews;
    }

    public final Object apply(Object obj) {
        C139001ae aeVar = this.f378001a;
        C139006f fVar = this.f378002b;
        RemoteViews remoteViews = this.f378003c;
        Bitmap bitmap = (Bitmap) obj;
        C139008h hVar = fVar.f378042d;
        if (hVar == null) {
            hVar = C139008h.f378043h;
        }
        if ((hVar.f378045a & 32) != 0) {
            String str = fVar.f378040b;
            C139008h hVar2 = fVar.f378042d;
            if (hVar2 == null) {
                hVar2 = C139008h.f378043h;
            }
            C139002b bVar = hVar2.f378051g;
            if (bVar == null) {
                bVar = C139002b.f378023f;
            }
            PendingIntent a = aeVar.mo114652a(str, bVar, 201);
            if (a == null) {
                ((C59052c) ((C59052c) C139001ae.f378015a.mo56226d()).mo56372aa(41350)).mo56386p("Cannot build voice icon as intent data is missing.");
                return Optional.empty();
            }
            remoteViews.setImageViewBitmap(R.id.googleapp_search_widget_third_party_voice_btn, bitmap);
            remoteViews.setOnClickPendingIntent(R.id.googleapp_search_widget_third_party_voice_btn, a);
            return Optional.m71637of(remoteViews);
        }
        ((C59052c) ((C59052c) C139001ae.f378015a.mo56226d()).mo56372aa(41351)).mo56386p("Cannot build voice icon as provider data is missing.");
        return Optional.empty();
    }
}
