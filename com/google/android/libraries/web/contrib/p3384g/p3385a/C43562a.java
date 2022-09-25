package com.google.android.libraries.web.contrib.p3384g.p3385a;

import com.google.android.libraries.web.base.C43271v;
import com.google.android.libraries.web.contrib.p3384g.C43582c;
import com.google.common.base.C58838bb;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.web.contrib.g.a.a */
/* compiled from: PG */
public final /* synthetic */ class C43562a {

    /* renamed from: a */
    public final /* synthetic */ Map f113740a;

    public /* synthetic */ C43562a(Map map) {
        this.f113740a = map;
    }

    /* renamed from: a */
    public final C43582c mo46625a(C43271v vVar) {
        C69464a aVar = (C69464a) this.f113740a.get(vVar);
        C58838bb.m90867b(aVar, "No WebPrewarmer exists for %s, make sure you injected the associated module.", vVar);
        return (C43582c) aVar.mo17428b();
    }
}
