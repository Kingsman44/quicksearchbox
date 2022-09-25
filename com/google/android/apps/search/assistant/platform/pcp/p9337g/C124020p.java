package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53140cw;
import com.google.assistant.p3994s.p3995a.C53142cy;
import com.google.assistant.p3994s.p3995a.C53151dg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.p */
/* compiled from: PG */
public final /* synthetic */ class C124020p implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124025u f342551a;

    /* renamed from: b */
    public final /* synthetic */ C53140cw f342552b;

    /* renamed from: c */
    public final /* synthetic */ C53142cy f342553c;

    public /* synthetic */ C124020p(C124025u uVar, C53140cw cwVar, C53142cy cyVar) {
        this.f342551a = uVar;
        this.f342552b = cwVar;
        this.f342553c = cyVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124025u uVar = this.f342551a;
        C53140cw cwVar = this.f342552b;
        C53142cy cyVar = this.f342553c;
        HashSet hashSet = new HashSet();
        uVar.f342568h.clear();
        uVar.f342569i.clear();
        uVar.f342570j.clear();
        uVar.f342571k.clear();
        uVar.f342572l.clear();
        for (C53151dg dgVar : cwVar.f139283d) {
            hashSet.addAll(dgVar.f139312c);
        }
        ArrayList arrayList = new ArrayList();
        return C47633f.m84733g(uVar.f342564d.f341550b.mo45938b(new C124022r(uVar, hashSet, cyVar, arrayList))).mo51516i(new C124023s(uVar, arrayList), uVar.f342562b);
    }
}
