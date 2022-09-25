package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.z */
/* compiled from: PG */
public final /* synthetic */ class C97854z implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C97764ae f273253a;

    /* renamed from: b */
    public final /* synthetic */ List f273254b;

    /* renamed from: c */
    public final /* synthetic */ C91006f f273255c;

    public /* synthetic */ C97854z(C97764ae aeVar, List list, C91006f fVar) {
        this.f273253a = aeVar;
        this.f273254b = list;
        this.f273255c = fVar;
    }

    public final C60870cx apply(Object obj) {
        C97764ae aeVar = this.f273253a;
        List list = this.f273254b;
        C91006f fVar = this.f273255c;
        Collection.EL.stream((Set) obj).forEach(new C97848t(aeVar, list));
        C123615ah b = C123624c.m202993b(aeVar.f272972b);
        list.add(b.f341542c.mo106059c(b.f341541b, (AccountId) null));
        C60870cx o = C60856cj.m92906o(list);
        C47638k.m84753d(o).mo51520a(new C97850v(o, fVar), C60826bg.f164896a);
        return C60866ct.f164955a;
    }
}
