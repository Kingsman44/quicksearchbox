package com.google.android.apps.gsa.shared.util.p7159c.p7160a;

import android.text.TextUtils;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.shared.util.c.a.m */
/* compiled from: PG */
public final class C90853m implements ThreadFactory {

    /* renamed from: a */
    public static final C59071e f254039a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.c.a.m");

    /* renamed from: b */
    public final int f254040b;

    /* renamed from: c */
    private final String f254041c;

    /* renamed from: d */
    private final AtomicLong f254042d = new AtomicLong(0);

    public C90853m(String str, int i) {
        boolean z = false;
        if (i >= -19 && i <= 19) {
            z = true;
        }
        C58838bb.m90871f(z, "Invalid priority: %s", i);
        C58838bb.m90868c(!TextUtils.isEmpty(str));
        this.f254041c = str;
        this.f254040b = i;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f254041c;
        long andIncrement = this.f254042d.getAndIncrement();
        return new C90852l(this, runnable, str + andIncrement);
    }
}
