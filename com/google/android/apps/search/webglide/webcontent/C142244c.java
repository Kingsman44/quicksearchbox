package com.google.android.apps.search.webglide.webcontent;

import android.content.pm.ResolveInfo;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.webglide.webcontent.c */
/* compiled from: PG */
public final /* synthetic */ class C142244c implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C58528ij f385892a;

    public /* synthetic */ C142244c(C58528ij ijVar) {
        this.f385892a = ijVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C58528ij ijVar = this.f385892a;
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo.activityInfo == null) {
            return false;
        }
        return ijVar.contains(resolveInfo.activityInfo.packageName);
    }
}
