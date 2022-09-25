package com.google.android.apps.search.sceneviewer;

import android.content.Context;
import android.net.Uri;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import com.google.android.apps.search.sceneviewer.modelviewer.C141592b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p579ar.sceneviewer.analytics.ViewerLogger;
import com.google.android.libraries.search.p2476a.p2477a.C32158h;
import com.google.apps.tiktok.account.api.controller.C45983au;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p3723ar.core.viewer.analytics.ArViewerLogEnumOuterClass;
import com.google.p3723ar.p3724a.p3725a.C47890a;
import java.util.UUID;

/* renamed from: com.google.android.apps.search.sceneviewer.o */
/* compiled from: PG */
public final class C141624o extends C141625p implements C45987ay {

    /* renamed from: a */
    public static final C59071e f384426a = C59071e.m91332i("com.google.android.apps.search.sceneviewer.o");

    /* renamed from: b */
    public final ViewerActivity f384427b;

    /* renamed from: c */
    public final Context f384428c;

    /* renamed from: d */
    public final C47890a f384429d;

    /* renamed from: e */
    public final UUID f384430e;

    /* renamed from: f */
    public final boolean f384431f;

    /* renamed from: g */
    public Uri f384432g;

    public C141624o(ViewerActivity viewerActivity, C45989b bVar, C32158h hVar, Context context, UUID uuid, C47890a aVar, boolean z, boolean z2) {
        this.f384427b = viewerActivity;
        this.f384428c = context;
        this.f384429d = aVar;
        this.f384430e = uuid;
        this.f384431f = z2;
        if (!z) {
            viewerActivity.finish();
        } else {
            hVar.mo37971b(viewerActivity, this, bVar);
        }
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        ((C59052c) ((C59052c) f384426a.mo56224b()).mo56372aa(41723)).mo56389s("Account changed to ID: %s", awVar.f120815a.f120816a);
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SESSION_STARTED);
        C141592b a = C141584am.m229779a(awVar.f120815a.f120816a);
        C0154a aVar = new C0154a(this.f384427b.f727a.f739a.f744e);
        aVar.mo511h(R.id.sceneviewer_fragment_container, a, C141584am.f384270a, 1);
        aVar.mo509f();
        a.mo17754z().mo116588v(this.f384427b.getIntent());
        this.f384427b.getWindow().setBackgroundDrawableResource(R.drawable.sceneviewer_three_d_viewer_bg);
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        if (this.f384429d.equals(C47890a.STANDALONE)) {
            ((C59052c) ((C59052c) ((C59052c) f384426a.mo56225c()).mo56382g(th)).mo56372aa(41724)).mo56389s("Scene Viewer failed with %s. See go/sceneviewer-g3doc/developing/android#issues on how to rectify this.", th.getMessage());
        }
        ViewerLogger.getInstance().logAction(ArViewerLogEnumOuterClass.ArViewerLogEnum.Action.SESSION_NO_ACCOUNT);
        this.f384427b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo19985d(C45986ax axVar) {
        C45983au.m82161a(this);
    }

    /* renamed from: e */
    public final C141592b mo116615e() {
        FragmentManager fragmentManager = this.f384427b.f727a.f739a.f744e;
        return (C141592b) fragmentManager.f634a.mo671c(C141584am.f384270a);
    }

    /* renamed from: f */
    public final void mo116616f() {
        this.f384427b.overridePendingTransition(R.animator.transition_enter, R.animator.transition_exit);
    }
}
