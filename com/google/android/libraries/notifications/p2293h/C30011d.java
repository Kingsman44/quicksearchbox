package com.google.android.libraries.notifications.p2293h;

import android.os.Bundle;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.android.libraries.notifications.h.d */
/* compiled from: PG */
public abstract class C30011d {
    /* renamed from: d */
    public static C30011d m55651d(List list) {
        boolean z = false;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        C58838bb.m90884s(z, "Must provide at least one activity intent.");
        return new C30008a(1, C58485gu.m89842j(list));
    }

    /* renamed from: e */
    public static C30011d m55652e() {
        return new C30008a(2, (C58485gu) null);
    }

    /* renamed from: a */
    public abstract Bundle mo35313a();

    /* renamed from: b */
    public abstract C58485gu mo35314b();

    /* renamed from: c */
    public abstract int mo35315c();
}
