package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.apps.search.assistant.platform.pcp.validity.C124167p;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.s */
/* compiled from: PG */
public final /* synthetic */ class C124023s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124025u f342559a;

    /* renamed from: b */
    public final /* synthetic */ List f342560b;

    public /* synthetic */ C124023s(C124025u uVar, List list) {
        this.f342559a = uVar;
        this.f342560b = list;
    }

    public final C60870cx apply(Object obj) {
        C124025u uVar = this.f342559a;
        List list = this.f342560b;
        Void voidR = (Void) obj;
        if (uVar.f342566f.isPresent()) {
            return C47633f.m84733g(((C124167p) uVar.f342566f.get()).mo106310d(uVar.f342572l)).mo51516i(new C124021q(list), uVar.f342562b);
        }
        return C60856cj.m92900i(list);
    }
}
