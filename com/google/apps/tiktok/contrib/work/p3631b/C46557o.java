package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4395as;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;

/* renamed from: com.google.apps.tiktok.contrib.work.b.o */
/* compiled from: PG */
public final /* synthetic */ class C46557o implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46557o f121732a = new C46557o();

    private /* synthetic */ C46557o() {
    }

    public final Object apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        for (C4395as asVar : (List) obj) {
            if (!asVar.f14028c.contains("tiktok_account_work")) {
                e.mo55395g(asVar);
            }
        }
        return e.mo55394f();
    }
}
