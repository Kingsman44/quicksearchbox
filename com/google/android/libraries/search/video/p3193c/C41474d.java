package com.google.android.libraries.search.video.p3193c;

import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.p031v4.app.Fragment;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.gsa.p8867w.p8879i.C118817r;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.apps.tiktok.inject.p3657c.C47215a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57175f;
import com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.video.c.d */
/* compiled from: PG */
public final class C41474d implements C41471a {

    /* renamed from: a */
    public static final C59071e f108335a = C59071e.m91332i("com.google.android.libraries.search.video.c.d");

    /* renamed from: b */
    public final AccessibilityManager f108336b;

    /* renamed from: c */
    private final int f108337c;

    /* renamed from: d */
    private final ConnectivityManager f108338d;

    /* renamed from: e */
    private final PackageManager f108339e;

    /* renamed from: f */
    private final Executor f108340f;

    /* renamed from: g */
    private final C47215a f108341g;

    /* renamed from: h */
    private final C118817r f108342h;

    public C41474d(C41454m mVar, Fragment fragment, C47215a aVar, C118817r rVar, AccessibilityManager accessibilityManager, ConnectivityManager connectivityManager, Executor executor) {
        this.f108341g = aVar;
        this.f108337c = mVar.mo43982a();
        this.f108342h = rVar;
        this.f108339e = fragment.getContext().getPackageManager();
        this.f108336b = accessibilityManager;
        this.f108338d = connectivityManager;
        this.f108340f = executor;
    }

    /* renamed from: a */
    public final C60870cx mo43991a(C57175f fVar) {
        C60870cx cxVar;
        C57194y yVar = fVar.f152642c;
        if (yVar == null) {
            yVar = C57194y.f152692i;
        }
        if (!mo43992b(yVar)) {
            return C60856cj.m92900i(false);
        }
        ConnectivityManager connectivityManager = this.f108338d;
        if (connectivityManager == null) {
            cxVar = C60856cj.m92900i(false);
        } else {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                cxVar = C60856cj.m92900i(false);
            } else {
                int type = activeNetworkInfo.getType();
                C60870cx a = this.f108342h.mo103997a();
                C41473c cVar = new C41473c(type);
                cxVar = C60922j.m93044g(a, C47810es.m84963c(cVar), this.f108340f);
            }
        }
        C41472b bVar = new C41472b(this);
        return C60922j.m93044g(cxVar, C47810es.m84963c(bVar), this.f108340f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r3.f108339e.getPackageInfo("com.google.android.youtube", 0).versionCode >= r3.f108337c) goto L_0x0051;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo43992b(com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57194y r4) {
        /*
            r3 = this;
            int r4 = r4.f152695b
            int r4 = com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a.C57191v.m88267a(r4)
            r0 = 5
            r1 = 0
            if (r4 != r0) goto L_0x0019
            com.google.common.f.e r4 = f108335a
            com.google.common.f.x r4 = r4.mo56224b()
            java.lang.String r0 = "Video will not play because there is no valid video data."
            r2 = 53896(0xd288, float:7.5524E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x0019:
            r0 = 1
            if (r4 != r0) goto L_0x0051
            com.google.apps.tiktok.inject.c.a r4 = r3.f108341g
            android.view.Window r4 = r4.mo51123r()
            if (r4 == 0) goto L_0x0042
            android.content.pm.PackageManager r4 = r3.f108339e     // Catch:{ NameNotFoundException -> 0x0033 }
            java.lang.String r2 = "com.google.android.youtube"
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0033 }
            int r4 = r4.versionCode     // Catch:{ NameNotFoundException -> 0x0033 }
            int r2 = r3.f108337c     // Catch:{ NameNotFoundException -> 0x0033 }
            if (r4 < r2) goto L_0x0033
            goto L_0x0051
        L_0x0033:
            com.google.common.f.e r4 = f108335a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r0 = "Video will not play since YouTube app does not meet the minimum requirement."
            r2 = 53894(0xd286, float:7.5522E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x0042:
            com.google.common.f.e r4 = f108335a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r0 = "Video will not play because there is no window for the YouTube player."
            r2 = 53895(0xd287, float:7.5523E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r2)).mo56386p(r0)
            return r1
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.p3193c.C41474d.mo43992b(com.google.bv.e.b.b.c.a.y):boolean");
    }
}
