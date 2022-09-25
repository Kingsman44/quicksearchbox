package com.google.android.apps.gsa.staticplugins.recently.p8682e;

import com.google.android.libraries.gsa.p1875j.C22832c;
import com.google.android.libraries.gsa.p1875j.C22845p;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.e.d */
/* compiled from: PG */
public abstract class C116076d {

    /* renamed from: a */
    public C116073a f321867a;

    /* renamed from: c */
    protected static final C22845p m192455c(int i) {
        C22832c cVar = (C22832c) C22845p.f62890o.createBuilder();
        cVar.copyOnWrite();
        C22845p pVar = (C22845p) cVar.instance;
        int i2 = i - 1;
        pVar.f62894c = i2;
        pVar.f62892a |= 2;
        cVar.copyOnWrite();
        C22845p pVar2 = (C22845p) cVar.instance;
        pVar2.f62892a |= 1;
        pVar2.f62893b = (long) i2;
        return (C22845p) cVar.build();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo102461a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo102462b(List list);
}
