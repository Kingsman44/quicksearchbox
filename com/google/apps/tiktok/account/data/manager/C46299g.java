package com.google.apps.tiktok.account.data.manager;

import com.google.apps.tiktok.account.data.C46161am;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.apps.tiktok.account.data.manager.p3615a.C46227h;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.Collections;

/* renamed from: com.google.apps.tiktok.account.data.manager.g */
/* compiled from: PG */
public final /* synthetic */ class C46299g implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C46299g f121283a = new C46299g();

    private /* synthetic */ C46299g() {
    }

    public final Object apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        for (C46227h hVar : Collections.unmodifiableMap(((C46222c) obj).f121177c).values()) {
            int a = C46161am.m82384a(hVar.f121188d);
            if (a != 0 && a == 2) {
                e.mo55395g(C46301i.m82575a(hVar));
            }
        }
        return e.mo55394f();
    }
}
