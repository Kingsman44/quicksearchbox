package com.google.android.voicesearch.serviceapi;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.voicesearch.serviceapi.l */
/* compiled from: PG */
public final class C45436l {

    /* renamed from: a */
    public static final C59071e f118830a = C59071e.m91332i("com.google.android.voicesearch.serviceapi.l");

    /* renamed from: b */
    public final ConcurrentHashMap f118831b = new ConcurrentHashMap();

    /* renamed from: c */
    public final GoogleRecognitionService f118832c;

    /* renamed from: d */
    public final C68214a f118833d;

    /* renamed from: e */
    public final C39141kp f118834e;

    /* renamed from: f */
    public String f118835f = BuildConfig.FLAVOR;

    /* renamed from: g */
    private final C68214a f118836g;

    public C45436l(GoogleRecognitionService googleRecognitionService, C68214a aVar, C68214a aVar2, C39141kp kpVar) {
        C91083b.m148803a(C91084c.SEARCH);
        this.f118832c = googleRecognitionService;
        this.f118833d = aVar;
        this.f118836g = aVar2;
        this.f118834e = kpVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r0 = com.google.android.apps.search.transcription.C141762c.m229999b(r2.f118832c);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49568a() {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L_0x0034
            dagger.a r0 = r2.f118836g
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.search.core.ag.a.e r0 = (com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e) r0
            boolean r0 = r0.mo78099am()
            if (r0 == 0) goto L_0x0034
            com.google.android.voicesearch.serviceapi.GoogleRecognitionService r0 = r2.f118832c
            android.content.ComponentName r0 = com.google.android.apps.search.transcription.C141762c.m229999b(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r0.getPackageName()
            java.lang.String r1 = "com.google.android.tts"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r2.f118835f
            java.lang.String r1 = "com.google.android.apps.accessibility.voiceaccess"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0034
            r0 = 1
            return r0
        L_0x0034:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.voicesearch.serviceapi.C45436l.mo49568a():boolean");
    }
}
