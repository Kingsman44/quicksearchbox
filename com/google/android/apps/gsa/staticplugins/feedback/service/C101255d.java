package com.google.android.apps.gsa.staticplugins.feedback.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.google.android.apps.gsa.shared.p7129r.C90466h;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7184t.C91099i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.feedback.service.d */
/* compiled from: PG */
public final class C101255d implements C90466h {

    /* renamed from: a */
    private static final C59071e f282590a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.feedback.service.d");

    /* renamed from: b */
    private final Context f282591b;

    /* renamed from: c */
    private final C101260i f282592c;

    /* renamed from: d */
    private final ServiceConnection f282593d;

    /* renamed from: e */
    private final C91099i f282594e;

    public C101255d(Context context, C101260i iVar, ServiceConnection serviceConnection, C91099i iVar2) {
        this.f282591b = context;
        this.f282592c = iVar;
        this.f282593d = serviceConnection;
        this.f282594e = iVar2;
    }

    /* renamed from: g */
    public static void m167496g(Context context, C22871g gVar, C101254c cVar) {
        C91099i iVar = new C91099i(context);
        C101253b bVar = new C101253b(gVar, cVar, context, iVar);
        Intent i = m167497i(context);
        C91070p.m148777b(iVar.f254390a, i);
        iVar.f254390a.bindService(i, bVar, 0);
    }

    /* renamed from: i */
    private static Intent m167497i(Context context) {
        ComponentName componentName = new ComponentName(context, FeedbackService.class);
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return intent;
    }

    /* renamed from: a */
    public final String mo84211a() {
        try {
            return this.f282592c.mo92200a();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19936)).mo56386p("Error making getFeedbackUseNonredactedReportSavedDecisionAccount request");
            int i = C90755l.f253831a;
            return null;
        }
    }

    /* renamed from: b */
    public final void mo84212b(boolean z) {
        try {
            this.f282592c.mo92201b(z);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19939)).mo56386p("Error making setFeedbackUseNonredactedReportSavedDecision request");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: c */
    public final void mo84213c(String str) {
        try {
            this.f282592c.mo92202c(str);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19940)).mo56386p("Error making setFeedbackUseNonredactedReportSavedDecisionAccount request");
            int i = C90755l.f253831a;
        }
    }

    /* renamed from: d */
    public final boolean mo84214d() {
        try {
            return this.f282592c.mo92203d();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19941)).mo56386p("Error making getFeedbackUseNonredactedReportSavedDecision request");
            int i = C90755l.f253831a;
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo84215e() {
        try {
            return this.f282592c.mo92204e();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19942)).mo56386p("Error making isFeedbackConsentFormForced request");
            int i = C90755l.f253831a;
            return false;
        }
    }

    /* renamed from: f */
    public final boolean mo84216f() {
        try {
            return this.f282592c.mo92205f();
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f282590a.mo56226d()).mo56382g(e)).mo56372aa(19943)).mo56386p("Error making isForceIncludeSensitiveDataEnabled request");
            int i = C90755l.f253831a;
            return false;
        }
    }

    /* renamed from: h */
    public final void mo92199h() {
        C91099i iVar = this.f282594e;
        iVar.f254390a.unbindService(this.f282593d);
        this.f282594e.f254390a.stopService(m167497i(this.f282591b));
    }
}
