package com.google.android.apps.gsa.search.core.p6813n;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import java.io.InputStream;

@Deprecated
/* renamed from: com.google.android.apps.gsa.search.core.n.b */
/* compiled from: PG */
public interface C86183b extends C90991b {
    /* renamed from: b */
    int mo79820b(long... jArr);

    /* renamed from: c */
    long mo79821c(DownloadManager.Request request, int i);

    /* renamed from: e */
    Cursor mo79822e(DownloadManager.Query query);

    @Deprecated
    /* renamed from: f */
    Uri mo79823f(long j);

    /* renamed from: g */
    InputStream mo79824g(Context context, long j);

    /* renamed from: h */
    String mo79825h(long j);
}
