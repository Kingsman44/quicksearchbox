package com.google.android.libraries.assistant.auto.tng.common.p933q;

import android.content.pm.ResolveInfo;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.q.g */
/* compiled from: PG */
public final /* synthetic */ class C13323g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C13323g f41047a = new C13323g();

    private /* synthetic */ C13323g() {
    }

    public final Object apply(Object obj) {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        C58838bb.m90866a(resolveInfo, "ResolveInfo is null");
        C58838bb.m90866a(resolveInfo.activityInfo, "ActivityInfo is null");
        return resolveInfo.activityInfo.packageName;
    }
}
