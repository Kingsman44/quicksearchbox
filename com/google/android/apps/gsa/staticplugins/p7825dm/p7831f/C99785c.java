package com.google.android.apps.gsa.staticplugins.p7825dm.p7831f;

import android.app.DownloadManager;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.f.c */
/* compiled from: PG */
public final class C99785c {

    /* renamed from: a */
    private final C86183b f279179a;

    public C99785c(C86183b bVar) {
        this.f279179a = bVar;
    }

    @JavascriptInterface
    public void startImageDownload(String str) {
        if (!TextUtils.isEmpty(str) && URLUtil.isValidUrl(str)) {
            Uri parse = Uri.parse(str);
            DownloadManager.Request request = new DownloadManager.Request(parse);
            try {
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, parse.getLastPathSegment());
            } catch (IllegalStateException | NullPointerException unused) {
                C58976aa aaVar = C58975e.f156826a;
            }
            request.setNotificationVisibility(1);
            request.allowScanningByMediaScanner();
            this.f279179a.mo79821c(request, 652);
        }
    }
}
