package com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62917ay;
import java.util.Date;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.b.g */
/* compiled from: PG */
public abstract class C90998g {

    /* renamed from: a */
    private final C21370a f254199a;

    protected C90998g(C21370a aVar) {
        this.f254199a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C58485gu mo85265a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo85266b(C91000i iVar);

    /* renamed from: c */
    public abstract void mo85267c(String str, C91000i iVar);

    /* renamed from: d */
    public final C90999h mo85268d(String str) {
        C90999h hVar = (C90999h) C91000i.f254200e.createBuilder();
        long b = this.f254199a.mo26870b();
        hVar.copyOnWrite();
        C91000i iVar = (C91000i) hVar.instance;
        iVar.f254202a |= 1;
        iVar.f254203b = b;
        hVar.copyOnWrite();
        C91000i iVar2 = (C91000i) hVar.instance;
        str.getClass();
        iVar2.f254202a |= 2;
        iVar2.f254204c = str;
        return hVar;
    }

    /* renamed from: e */
    public final String mo85269e(String str, C62917ay ayVar, Object obj) {
        C90999h d = mo85268d(str);
        d.mo58885m(ayVar, obj);
        return mo85266b((C91000i) d.build());
    }

    /* renamed from: f */
    public final void mo85270f(String str, C58817ah ahVar) {
        C90999h d = mo85268d(str);
        Void voidR = (Void) ahVar.apply(d);
        mo85266b((C91000i) d.build());
    }

    /* renamed from: g */
    public final void mo85271g(C91006f fVar, String str, C90997f fVar2, boolean z) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r(str);
        C58485gu a = mo85265a();
        if (z) {
            a = a.mo55401lD();
        }
        int size = a.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C91000i iVar = (C91000i) a.get(i2);
            i++;
            C91006f e2 = e.mo85281e((Object) null);
            e2.mo85279c("timestamp").mo85276a(C90752i.m148232f(new Date(iVar.f254203b)));
            if (!iVar.f254204c.isEmpty()) {
                e2.mo85279c("label").mo85276a(C90752i.m148229c(iVar.f254204c));
            }
            if (fVar2 != null) {
                fVar2.mo84666a(e2, iVar);
            }
        }
        if (i == 0) {
            e.mo85292s(C90752i.m148229c("none"));
        }
    }
}
