package com.google.apps.tiktok.account.data.manager.p3615a;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.apps.tiktok.account.data.manager.a.b */
/* compiled from: PG */
public final class C46221b extends C62934bn implements C63001dt {
    public C46221b() {
        super(C46222c.f121173d);
    }

    /* renamed from: a */
    public final void mo50269a(int i, C46227h hVar) {
        hVar.getClass();
        copyOnWrite();
        C46222c cVar = C46222c.f121173d;
        ((C46222c) this.instance).mo50271a().put(Integer.valueOf(i), hVar);
    }

    /* renamed from: b */
    public final void mo50270b(int i) {
        copyOnWrite();
        C46222c cVar = C46222c.f121173d;
        ((C46222c) this.instance).mo50271a().remove(Integer.valueOf(i));
    }
}
