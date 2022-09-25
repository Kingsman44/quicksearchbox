package com.google.android.apps.search.assistant.platform.appintegration.p8997e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.platform.appintegration.e.e */
/* compiled from: PG */
public final class C119536e implements C119533b {

    /* renamed from: a */
    public static final C59071e f333169a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.appintegration.e.e");

    /* renamed from: b */
    public final C39141kp f333170b;

    /* renamed from: c */
    private final Context f333171c;

    /* renamed from: d */
    private final C60887da f333172d;

    public C119536e(C39141kp kpVar, Context context, C60887da daVar) {
        this.f333170b = kpVar;
        this.f333171c = context;
        this.f333172d = daVar;
    }

    /* renamed from: a */
    public final void mo104418a(C119532a aVar, String str) {
        C119534c cVar = new C119534c(this, str, aVar);
        C60856cj.m92903l(C47810es.m84977q(cVar), this.f333172d);
    }

    /* renamed from: b */
    public final void mo104419b(C119532a aVar, String str, boolean z) {
        C119535d dVar = new C119535d(this, str, aVar, z);
        C60856cj.m92903l(C47810es.m84977q(dVar), this.f333172d);
    }

    /* renamed from: c */
    public final PackageInfo mo104422c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return this.f333171c.getPackageManager().getPackageInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.packageName = "unknown";
        packageInfo.versionName = "unknown";
        return packageInfo;
    }
}
