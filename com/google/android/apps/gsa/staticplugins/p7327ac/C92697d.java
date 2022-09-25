package com.google.android.apps.gsa.staticplugins.p7327ac;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import com.google.android.apps.gsa.nowoverlayservice.p6423b.C83466n;
import com.google.common.base.C58817ah;
import com.google.p343ac.p346b.p347a.C6625b;
import com.google.p343ac.p346b.p347a.C6636m;

/* renamed from: com.google.android.apps.gsa.staticplugins.ac.d */
/* compiled from: PG */
public final /* synthetic */ class C92697d implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C92701h f258738a;

    public /* synthetic */ C92697d(C92701h hVar) {
        this.f258738a = hVar;
    }

    public final Object apply(Object obj) {
        ActivityInfo activityInfo;
        C92701h hVar = this.f258738a;
        C83466n nVar = (C83466n) obj;
        C6625b bVar = (C6625b) C6636m.f19775aC.createBuilder();
        long b = hVar.f258757g.mo26870b();
        long j = nVar.f227532c;
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19816ak = b - j;
        String str = nVar.f227531b;
        ResolveInfo resolveActivity = hVar.f258753c.getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME"), 65536);
        String str2 = null;
        if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null)) {
            str2 = activityInfo.packageName;
        }
        boolean equals = str.equals(str2);
        bVar.copyOnWrite();
        ((C6636m) bVar.instance).f19817al = equals;
        return (C6636m) bVar.build();
    }
}
