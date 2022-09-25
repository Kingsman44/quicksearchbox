package com.google.android.libraries.search.assistant.notification.p2709a.p2710a;

import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1791ah;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.search.assistant.notification.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C34843f implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C34851n f92414a;

    public /* synthetic */ C34843f(C34851n nVar) {
        this.f92414a = nVar;
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
        C34851n nVar = this.f92414a;
        StatusBarNotification statusBarNotification = (StatusBarNotification) obj;
        if (statusBarNotification.getNotification() == null || C58837ba.m90859h(statusBarNotification.getPackageName())) {
            ((C59052c) ((C59052c) C34851n.f92423a.mo56226d()).mo56372aa(51448)).mo56389s("Not handling notification %s", statusBarNotification);
            return false;
        } else if (C1791ah.m4935c(statusBarNotification.getNotification())) {
            return false;
        } else {
            Context context = nVar.f92424b;
            if (context.getPackageName().equals(statusBarNotification.getPackageName())) {
                return true;
            }
            if ("call".equals(statusBarNotification.getNotification().category) || "event".equals(statusBarNotification.getNotification().category)) {
                return false;
            }
            return true;
        }
    }
}
