package com.google.android.apps.gsa.shared.p7038f.p7039a;

import android.content.pm.ShortcutInfo;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.gsa.shared.f.a.a */
/* compiled from: PG */
public final /* synthetic */ class C89723a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f242898a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f242899b;

    public /* synthetic */ C89723a(C60870cx cxVar, C60870cx cxVar2) {
        this.f242898a = cxVar;
        this.f242899b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f242898a;
        C58528ij ijVar = (C58528ij) C60856cj.m92909r(this.f242899b);
        C58480gp e = C58485gu.m89837e();
        for (ShortcutInfo shortcutInfo : (List) C60856cj.m92909r(cxVar)) {
            if (ijVar.contains(shortcutInfo.getPackage())) {
                e.mo55395g(shortcutInfo);
            }
        }
        return e.mo55394f();
    }
}
