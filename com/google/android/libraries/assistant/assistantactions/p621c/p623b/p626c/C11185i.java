package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51164u;
import com.google.assistant.p3897e.p3902c.p3907c.C51165v;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.i */
/* compiled from: PG */
public final class C11185i {

    /* renamed from: a */
    public static final Uri f36585a = new Uri.Builder().scheme("clock-app").authority("com.google.android.deskclock").appendPath("alarm").build();

    /* renamed from: b */
    private static final C59071e f36586b = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.c.b.c.i");

    /* renamed from: a */
    public static C51165v m26510a(String str, boolean z) {
        String uri = f36585a.buildUpon().appendPath(str).appendPath("edit").appendQueryParameter("enabled", String.valueOf(z)).build().toString();
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
    public static C60870cx m26511b(PackageManager packageManager, Intent intent, C11059d dVar, String str, C60887da daVar) {
        C60870cx cxVar;
        HashSet hashSet = new HashSet();
        if (!(packageManager == null || intent.getAction() == null)) {
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ((C59052c) ((C59052c) f36586b.mo56224b()).mo56372aa(43068)).mo56387q("[getClockAndroidIntentCapabilities] resolveInfos size: %d", queryIntentActivities.size());
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str2 = resolveInfo.activityInfo.applicationInfo.packageName;
                ((C59052c) ((C59052c) f36586b.mo56224b()).mo56372aa(43069)).mo56354G("[getClockAndroidIntentCapabilities] intent action: %s, packageName: %s", intent.getAction(), str2);
                hashSet.add(str2);
            }
        }
        if (!hashSet.isEmpty()) {
            if (dVar != null) {
                ((C59052c) ((C59052c) f36586b.mo56224b()).mo56372aa(43067)).mo56389s("Get user preferred app package name for: %s", str);
                cxVar = C60922j.m93044g(dVar.mo19528b(str), C11184h.f36584a, daVar);
            } else {
                cxVar = C60856cj.m92900i(C58836b.f156633a);
            }
            return C60922j.m93044g(cxVar, new C11183g(hashSet), daVar);
        }
        ((C59052c) ((C59052c) f36586b.mo56225c()).mo56372aa(43066)).mo56386p("No installed clock app found.");
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
