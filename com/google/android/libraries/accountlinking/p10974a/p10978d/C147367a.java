package com.google.android.libraries.accountlinking.p10974a.p10978d;

import android.content.pm.ResolveInfo;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.libraries.accountlinking.a.d.a */
/* compiled from: PG */
public final /* synthetic */ class C147367a implements C58839bc {

    /* renamed from: a */
    public static final /* synthetic */ C147367a f397810a = new C147367a();

    private /* synthetic */ C147367a() {
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        int i = C147369c.f397812a;
        return resolveInfo.filter.hasAction("android.intent.action.VIEW") && resolveInfo.filter.hasCategory("android.intent.category.BROWSABLE") && resolveInfo.filter.schemesIterator() != null && resolveInfo.filter.authoritiesIterator() == null && resolveInfo.filter.hasDataScheme("http") && resolveInfo.filter.hasDataScheme("https");
    }
}
