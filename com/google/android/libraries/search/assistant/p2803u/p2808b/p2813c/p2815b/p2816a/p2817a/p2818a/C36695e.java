package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a.p2817a.p2818a;

import androidx.core.p097i.C1970e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4184bj.p4193c.p4201f.C56002b;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C36695e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f95588a;

    public /* synthetic */ C36695e(List list) {
        this.f95588a = list;
    }

    public final Object call() {
        List<C60870cx> list = this.f95588a;
        C58480gp e = C58485gu.m89837e();
        for (C60870cx r : list) {
            C1970e eVar = (C1970e) C60856cj.m92909r(r);
            C56002b bVar = (C56002b) eVar.f5888a;
            if (((Boolean) eVar.f5889b).booleanValue()) {
                e.mo55395g(bVar);
            }
        }
        return e.mo55394f();
    }
}
