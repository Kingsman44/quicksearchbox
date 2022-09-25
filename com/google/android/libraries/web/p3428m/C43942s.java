package com.google.android.libraries.web.p3428m;

import com.google.android.libraries.web.p3353c.C43364i;
import com.google.android.libraries.web.p3353c.C43366k;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.p3353c.p3355b.C43331ag;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43911f;
import com.google.android.libraries.web.p3428m.p3429a.p3430a.C43912g;

/* renamed from: com.google.android.libraries.web.m.s */
/* compiled from: PG */
public final class C43942s {

    /* renamed from: a */
    private final C43904a f114431a;

    /* renamed from: b */
    private final C43911f f114432b;

    public C43942s(C43904a aVar) {
        this.f114431a = aVar;
        this.f114432b = C43912g.m77530a(aVar);
    }

    /* renamed from: a */
    public final void mo46948a() {
        int c;
        if (!this.f114431a.mo46410c().mo46899e() && (c = this.f114432b.mo46928c()) >= 0) {
            C43364i iVar = (C43364i) C43367l.f113293h.createBuilder();
            String f = this.f114432b.mo46930f(c);
            iVar.copyOnWrite();
            C43367l lVar = (C43367l) iVar.instance;
            f.getClass();
            lVar.f113295a |= 2;
            lVar.f113297c = f;
            C43366k kVar = C43366k.REFRESH;
            iVar.copyOnWrite();
            C43367l lVar2 = (C43367l) iVar.instance;
            lVar2.f113299e = kVar.f113292i;
            lVar2.f113295a |= 8;
            ((C43331ag) this.f114431a.mo46411d(C43331ag.class)).mo46449k((C43367l) iVar.build());
            this.f114432b.mo46934k();
        }
    }
}
