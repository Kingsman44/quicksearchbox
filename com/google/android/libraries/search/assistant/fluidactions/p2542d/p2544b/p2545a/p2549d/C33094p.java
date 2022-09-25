package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51164u;
import com.google.assistant.p3897e.p3902c.p3907c.C51165v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.HashSet;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.p */
/* compiled from: PG */
public final class C33094p {

    /* renamed from: a */
    public static final Uri f88611a = new Uri.Builder().scheme("clock-app").authority("com.google.android.deskclock").appendPath("alarm").build();

    /* renamed from: b */
    private static final C59071e f88612b = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.p");

    /* renamed from: a */
    public static C51165v m61394a(String str, boolean z) {
        String uri = f88611a.buildUpon().appendPath(str).appendPath("edit").appendQueryParameter("enabled", String.valueOf(z)).build().toString();
        C51164u uVar = (C51164u) C51165v.f133190c.createBuilder();
        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
        esVar.copyOnWrite();
        C51058ev evVar = (C51058ev) esVar.instance;
        uri.getClass();
        evVar.f132943a |= 32;
        evVar.f132949g = uri;
        C51058ev evVar2 = (C51058ev) esVar.build();
        ggVar.copyOnWrite();
        C51098gh ghVar = (C51098gh) ggVar.instance;
        evVar2.getClass();
        ghVar.f133013c = evVar2;
        ghVar.f133012b = 1;
        uVar.copyOnWrite();
        C51165v vVar = (C51165v) uVar.instance;
        C51098gh ghVar2 = (C51098gh) ggVar.build();
        ghVar2.getClass();
        vVar.f133193b = ghVar2;
        vVar.f133192a |= 2;
        return (C51165v) uVar.build();
    }

    /* renamed from: b */
    public static C60870cx m61395b(PackageManager packageManager, Intent intent, C60870cx cxVar, C60887da daVar) {
        HashSet hashSet = new HashSet();
        if (!(packageManager == null || intent.getAction() == null)) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ((C59052c) ((C59052c) f88612b.mo56224b()).mo56372aa(50891)).mo56387q("[getClockAndroidIntentCapabilities] resolveInfos size: %d", queryIntentActivities.size());
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.applicationInfo.packageName;
                ((C59052c) ((C59052c) f88612b.mo56224b()).mo56372aa(50892)).mo56354G("[getClockAndroidIntentCapabilities] intent action: %s, packageName: %s", intent.getAction(), str);
                hashSet.add(str);
            }
        }
        if (!hashSet.isEmpty()) {
            return C60922j.m93044g(cxVar, C47810es.m84963c(new C33093o(hashSet)), daVar);
        }
        ((C59052c) ((C59052c) f88612b.mo56225c()).mo56372aa(50890)).mo56386p("No installed clock app found.");
        return C60856cj.m92900i(Optional.empty());
    }
}
