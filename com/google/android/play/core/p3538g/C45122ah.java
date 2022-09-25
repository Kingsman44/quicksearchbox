package com.google.android.play.core.p3538g;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.play.core.g.ah */
/* compiled from: PG */
public final class C45122ah {

    /* renamed from: a */
    public final List f117807a;

    /* renamed from: b */
    public final List f117808b;

    public C45122ah(C45121ag agVar) {
        this.f117807a = new ArrayList(agVar.f117805a);
        this.f117808b = new ArrayList(agVar.f117806b);
    }

    public final String toString() {
        return String.format("SplitInstallRequest{modulesNames=%s,languages=%s}", new Object[]{this.f117807a, this.f117808b});
    }
}
