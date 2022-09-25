package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.p10162a;

import android.app.PendingIntent;
import android.net.Uri;
import android.text.Html;
import android.widget.RemoteViews;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p395al.p398b.p399a.p402b.p403a.p407d.C8441b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54079ac;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54124w;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.a.e */
/* compiled from: PG */
public final /* synthetic */ class C133877e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133880h f364629a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f364630b;

    /* renamed from: c */
    public final /* synthetic */ C54120s f364631c;

    /* renamed from: d */
    public final /* synthetic */ C54079ac f364632d;

    /* renamed from: e */
    public final /* synthetic */ C60870cx f364633e;

    /* renamed from: f */
    public final /* synthetic */ C60870cx f364634f;

    public /* synthetic */ C133877e(C133880h hVar, C60870cx cxVar, C54120s sVar, C54079ac acVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f364629a = hVar;
        this.f364630b = cxVar;
        this.f364631c = sVar;
        this.f364632d = acVar;
        this.f364633e = cxVar2;
        this.f364634f = cxVar3;
    }

    public final Object call() {
        String str;
        C133880h hVar = this.f364629a;
        C60870cx cxVar = this.f364630b;
        C54120s sVar = this.f364631c;
        C54079ac acVar = this.f364632d;
        C60870cx cxVar2 = this.f364633e;
        C60870cx cxVar3 = this.f364634f;
        PendingIntent pendingIntent = (PendingIntent) C60856cj.m92909r(cxVar);
        RemoteViews remoteViews = new RemoteViews(hVar.f364643b.getPackageName(), R.layout.googleapp_goc_bottombar_card_peek_2);
        remoteViews.setInt(R.id.googleapp_customtabs_bottom_bar, "setMinimumHeight", (int) (((float) ((int) hVar.f364648g)) * hVar.f364643b.getResources().getDisplayMetrics().density));
        C54098av avVar = sVar.f142012c;
        if (avVar == null) {
            avVar = C54098av.f141935j;
        }
        C54124w wVar = avVar.f141941e;
        if (wVar == null) {
            wVar = C54124w.f142030c;
        }
        remoteViews.setTextViewText(R.id.googleapp_goc_bottombar_title, wVar.f142033b);
        remoteViews.setOnClickPendingIntent(R.id.googleapp_goc_bottombar_close, pendingIntent);
        Optional optional = (Optional) C60856cj.m92909r(cxVar2);
        Optional optional2 = (Optional) C60856cj.m92909r(cxVar3);
        remoteViews.setTextViewText(R.id.googleapp_goc_peek_card_title, Html.fromHtml(acVar.f141895e).toString());
        if ((acVar.f141891a & 32) != 0) {
            str = Html.fromHtml(acVar.f141897g).toString();
        } else {
            C8441b bVar = acVar.f141892b;
            if (bVar == null) {
                bVar = C8441b.f29337b;
            }
            str = C58837ba.m90858g(Uri.parse(bVar.f29339a).getHost());
        }
        if (!str.isEmpty()) {
            remoteViews.setTextViewText(R.id.googleapp_goc_peek_card_source, str);
            remoteViews.setViewVisibility(R.id.googleapp_goc_peek_card_source, 0);
        }
        C133880h.m217160a(remoteViews, R.id.googleapp_goc_peek_card_thumbnail, optional);
        C133880h.m217160a(remoteViews, R.id.googleapp_goc_peek_card_favicon, optional2);
        return remoteViews;
    }
}
