package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import android.support.p031v4.app.Fragment;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.c */
/* compiled from: PG */
public final class C139644c implements C139642a {

    /* renamed from: a */
    private static final C59071e f379615a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.c");

    /* renamed from: b */
    private final Fragment f379616b;

    public C139644c(Fragment fragment) {
        this.f379616b = fragment;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_document_state_update_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "documentStateUpdate";
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041 A[Catch:{ JSONException -> 0x0050 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115140c(org.json.JSONObject r3, boolean r4, p3186j$.util.Optional r5) {
        /*
            r2 = this;
            java.lang.String r4 = "state"
            java.lang.String r4 = r3.getString(r4)     // Catch:{ JSONException -> 0x0050 }
            int r5 = r4.hashCode()     // Catch:{ JSONException -> 0x0050 }
            r0 = 535389701(0x1fe96605, float:9.8848116E-20)
            r1 = 1
            if (r5 == r0) goto L_0x0020
            r0 = 2100486394(0x7d32e0fa, float:1.486067E37)
            if (r5 == r0) goto L_0x0016
            goto L_0x002a
        L_0x0016:
            java.lang.String r5 = "EDUCATION_STATE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002a
            r4 = 0
            goto L_0x002b
        L_0x0020:
            java.lang.String r5 = "PAGE_ATTACHMENT_STATE"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = -1
        L_0x002b:
            java.lang.String r5 = "value"
            if (r4 == 0) goto L_0x0041
            if (r4 == r1) goto L_0x0032
            return
        L_0x0032:
            boolean r3 = r3.getBoolean(r5)     // Catch:{ JSONException -> 0x0050 }
            com.google.android.apps.search.googleapp.stampviewer.c.e r4 = new com.google.android.apps.search.googleapp.stampviewer.c.e     // Catch:{ JSONException -> 0x0050 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0050 }
            android.support.v4.app.Fragment r3 = r2.f379616b     // Catch:{ JSONException -> 0x0050 }
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r4, r3)     // Catch:{ JSONException -> 0x0050 }
            return
        L_0x0041:
            boolean r3 = r3.getBoolean(r5)     // Catch:{ JSONException -> 0x0050 }
            com.google.android.apps.search.googleapp.stampviewer.c.d r4 = new com.google.android.apps.search.googleapp.stampviewer.c.d     // Catch:{ JSONException -> 0x0050 }
            r4.<init>(r3)     // Catch:{ JSONException -> 0x0050 }
            android.support.v4.app.Fragment r3 = r2.f379616b     // Catch:{ JSONException -> 0x0050 }
            com.google.apps.tiktok.p3674l.p3679c.C47393f.m84236g(r4, r3)     // Catch:{ JSONException -> 0x0050 }
            return
        L_0x0050:
            r3 = move-exception
            com.google.common.f.e r4 = f379615a
            com.google.common.f.x r4 = r4.mo56225c()
            java.lang.String r5 = "Error parsing document state update message payload"
            r0 = 41394(0xa1b2, float:5.8005E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56382g(r3)).mo56372aa(r0)).mo56386p(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a.C139644c.mo115140c(org.json.JSONObject, boolean, j$.util.Optional):void");
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo115141d() {
        return true;
    }
}
