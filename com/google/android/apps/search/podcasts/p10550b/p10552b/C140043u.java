package com.google.android.apps.search.podcasts.p10550b.p10552b;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97918h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58837ba;
import com.google.protos.p4757ac.p4758a.C63111j;

/* renamed from: com.google.android.apps.search.podcasts.b.b.u */
/* compiled from: PG */
public final /* synthetic */ class C140043u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C140022ao f380611a;

    /* renamed from: b */
    public final /* synthetic */ C97918h f380612b;

    public /* synthetic */ C140043u(C140022ao aoVar, C97918h hVar) {
        this.f380611a = aoVar;
        this.f380612b = hVar;
    }

    public final Object apply(Object obj) {
        C140022ao aoVar = this.f380611a;
        C97918h hVar = this.f380612b;
        String str = (String) obj;
        DownloadManager downloadManager = aoVar.f380566i;
        C63111j jVar = hVar.f273418e;
        if (jVar == null) {
            jVar = C63111j.f170348p;
        }
        String str2 = jVar.f170351b;
        Uri parse = Uri.parse(str);
        DownloadManager.Request request = new DownloadManager.Request(parse);
        request.setTitle(str2);
        request.setDestinationInExternalFilesDir(aoVar.f380565h, Environment.DIRECTORY_PODCASTS, "InProgressDownloads/".concat(aoVar.f380569l.mo26870b() + "_" + C58837ba.m90858g(parse.getLastPathSegment()).replaceAll("[.]{2,}", ".")));
        request.setVisibleInDownloadsUi(false);
        request.setNotificationVisibility(0);
        request.addRequestHeader("User-Agent", aoVar.f380572o);
        return Long.valueOf(downloadManager.enqueue(request));
    }
}
