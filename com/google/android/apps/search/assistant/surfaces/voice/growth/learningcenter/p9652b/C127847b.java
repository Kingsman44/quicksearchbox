package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.p9652b;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.p031v4.app.Fragment;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.elements.interfaces.C21312s;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62917ay;
import com.google.protos.youtube.elements.C66059au;
import com.google.protos.youtube.elements.p5165a.C66038z;
import p5488io.p5490b.C69794a;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.b.b */
/* compiled from: PG */
public final class C127847b implements C21312s {

    /* renamed from: a */
    private static final C58974d f351880a = C58974d.m91136j();

    /* renamed from: b */
    private final Fragment f351881b;

    /* renamed from: c */
    private final PackageManager f351882c;

    /* renamed from: d */
    private final boolean f351883d;

    /* renamed from: e */
    private final String f351884e;

    /* renamed from: f */
    private final String f351885f;

    /* renamed from: g */
    private final C37215b f351886g;

    public C127847b(Fragment fragment, PackageManager packageManager, String str, String str2, C37215b bVar) {
        this.f351881b = fragment;
        Bundle arguments = fragment.getArguments() != null ? fragment.getArguments() : new Bundle();
        arguments.getClass();
        this.f351883d = arguments.getBoolean("olc.enable_direct_query_issue");
        this.f351882c = packageManager;
        this.f351884e = str;
        this.f351885f = str2;
        this.f351886g = bVar;
    }

    /* renamed from: a */
    public final C62917ay mo25802a() {
        return C66038z.f179598e;
    }

    /* renamed from: b */
    public final /* synthetic */ C66059au mo25803b() {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C69794a mo25804c(Object obj, C21311r rVar) {
        return C69794a.m101255g(new C127846a(this, (C66038z) obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cf, code lost:
        if (r4.f351882c.getApplicationInfo(r2, 0).enabled == false) goto L_0x00d3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0104  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo108245d(com.google.protos.youtube.elements.p5165a.C66038z r5) {
        /*
            r4 = this;
            java.lang.String r0 = r5.f179601b
            r1 = 0
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r1)
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = r5.f179601b
            java.lang.String r2 = r5.f179602c
            com.google.android.libraries.search.b.b r2 = r4.f351886g
            com.google.android.libraries.search.b.i.g r3 = com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a.f97144fx
            r2.mo19974a(r3)
            r0.getClass()
            android.os.Bundle r2 = r0.getExtras()
            if (r2 == 0) goto L_0x004a
            android.os.Bundle r2 = r0.getExtras()
            r2.getClass()
            java.util.Set r2 = r2.keySet()
            java.lang.String r3 = "olc.close_activity"
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x004a
            android.os.Bundle r2 = r0.getExtras()
            r2.getClass()
            boolean r2 = r2.getBoolean(r3)
            if (r2 == 0) goto L_0x004a
            android.support.v4.app.Fragment r5 = r4.f351881b
            r5.getClass()
            android.support.v4.app.am r5 = r5.getActivity()
            r5.finish()
            return
        L_0x004a:
            java.lang.String r2 = "com.google.opa.QUERY"
            boolean r3 = r0.hasExtra(r2)
            if (r3 == 0) goto L_0x00c1
            java.lang.String r5 = r0.getStringExtra(r2)
            boolean r0 = r4.f351883d
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r4.f351884e
            java.lang.String r2 = r4.f351885f     // Catch:{ URISyntaxException -> 0x0088 }
            boolean r2 = r2.isEmpty()     // Catch:{ URISyntaxException -> 0x0088 }
            if (r2 == 0) goto L_0x0073
            java.lang.String r0 = r4.f351884e     // Catch:{ URISyntaxException -> 0x0088 }
            java.lang.String r2 = "$query_string"
            r5.getClass()
            java.lang.String r3 = p3186j$.net.URLEncoder.encode(r5)     // Catch:{ URISyntaxException -> 0x0088 }
            java.lang.String r0 = r0.replace(r2, r3)     // Catch:{ URISyntaxException -> 0x0088 }
        L_0x0073:
            android.content.Intent r0 = android.content.Intent.parseUri(r0, r1)     // Catch:{ URISyntaxException -> 0x0088 }
            java.lang.String r2 = r4.f351885f     // Catch:{ URISyntaxException -> 0x0088 }
            boolean r2 = r2.isEmpty()     // Catch:{ URISyntaxException -> 0x0088 }
            if (r2 != 0) goto L_0x0084
            java.lang.String r2 = r4.f351885f     // Catch:{ URISyntaxException -> 0x0088 }
            r0.putExtra(r2, r5)     // Catch:{ URISyntaxException -> 0x0088 }
        L_0x0084:
            r0.toUri(r1)     // Catch:{ URISyntaxException -> 0x0088 }
            goto L_0x00bf
        L_0x0088:
            com.google.common.f.a.d r0 = f351880a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "OlcUrlCommandHandler"
            r0.mo56378ag(r1, r2)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            r1 = 37654(0x9316, float:5.2764E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0
            java.lang.String r1 = "Cannot create an Intent from uri=%s, query=%s"
            java.lang.String r2 = r4.f351884e
            r0.mo56354G(r1, r2, r5)
            return
        L_0x00a8:
            r5.getClass()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            java.lang.String r3 = "com.google.android.apps.gsa.staticplugins.nga.education.pie.ui.PieActivity"
            r0.setClassName(r2, r3)
            java.lang.String r2 = "learning_center_suggested_query"
            r0.putExtra(r2, r5)
            r0.toUri(r1)
        L_0x00bf:
            r3 = 0
            goto L_0x00fc
        L_0x00c1:
            java.lang.String r2 = r0.getPackage()
            if (r2 == 0) goto L_0x00e7
            android.content.pm.PackageManager r3 = r4.f351882c     // Catch:{ NameNotFoundException -> 0x00d2 }
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x00d2 }
            boolean r3 = r3.enabled     // Catch:{ NameNotFoundException -> 0x00d2 }
            if (r3 != 0) goto L_0x00e7
            goto L_0x00d3
        L_0x00d2:
        L_0x00d3:
            java.lang.String r3 = r5.f179602c
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x00e7
            java.lang.String r5 = r5.f179602c
            android.content.Intent r0 = android.content.Intent.parseUri(r5, r1)
            java.lang.String r2 = r0.getPackage()
            r3 = 0
            goto L_0x00ef
        L_0x00e7:
            java.lang.String r3 = "com.google.android.apps.gsa.shared.util.starter.IntentStarter.START_ACTIVITY_FOR_RESULT"
            boolean r3 = r0.getBooleanExtra(r3, r1)
            java.lang.String r5 = r5.f179601b
        L_0x00ef:
            if (r2 != 0) goto L_0x00fc
            android.content.ComponentName r5 = r0.getComponent()
            if (r5 != 0) goto L_0x00fc
            java.lang.String r5 = "android.intent.category.BROWSABLE"
            r0.addCategory(r5)
        L_0x00fc:
            if (r3 == 0) goto L_0x0104
            android.support.v4.app.Fragment r5 = r4.f351881b
            com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i.m84862b(r5, r0, r1)
            return
        L_0x0104:
            android.support.v4.app.Fragment r5 = r4.f351881b
            com.google.apps.tiktok.tracing.contrib.p3708i.p3712c.C47709i.m84861a(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.p9652b.C127847b.mo108245d(com.google.protos.youtube.elements.a.z):void");
    }
}
