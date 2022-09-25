package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.app.DownloadManager;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.File;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.y */
/* compiled from: PG */
public final class C96505y {

    /* renamed from: a */
    private static final C59071e f269996a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.y");

    /* renamed from: a */
    public static Integer m159887a(Context context, long j) {
        C58976aa aaVar = C58975e.f156826a;
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(new long[]{j});
        Cursor query2 = ((DownloadManager) context.getSystemService("download")).query(query);
        Integer num = null;
        if (query2 == null) {
            return null;
        }
        try {
            if (query2.moveToFirst()) {
                query2.getInt(query2.getColumnIndex("total_size"));
                query2.getInt(query2.getColumnIndex("bytes_so_far"));
                num = Integer.valueOf(query2.getInt(query2.getColumnIndex("status")));
            }
            query2.close();
            return num;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: b */
    public static Long m159888b(Context context, Uri uri, File file, boolean z, boolean z2) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            C58976aa aaVar = C58975e.f156826a;
            parentFile.mkdirs();
        }
        if (file.exists()) {
            C58976aa aaVar2 = C58975e.f156826a;
            file.delete();
        }
        Uri fromFile = Uri.fromFile(file);
        C59104x b = f269996a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DownloadUtil");
        ((C59052c) ((C59052c) b).mo56372aa(17132)).mo56354G("Downloading %s to file %s", uri, file.getAbsoluteFile());
        try {
            DownloadManager.Request request = new DownloadManager.Request(uri);
            request.setVisibleInDownloadsUi(false);
            request.setNotificationVisibility(2);
            request.setDestinationUri(fromFile);
            request.setAllowedOverMetered(z);
            request.setAllowedOverRoaming(z2);
            try {
                return Long.valueOf(((DownloadManager) context.getSystemService("download")).enqueue(request));
            } catch (IllegalArgumentException e) {
                C59104x d = f269996a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DownloadUtil");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17134)).mo56386p("Encountered exception when downloading");
                return null;
            }
        } catch (IllegalArgumentException unused) {
            C89655j.m145957a("Bad download URL: ".concat(String.valueOf(String.valueOf(uri))));
            return null;
        }
    }
}
