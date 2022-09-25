package com.google.android.libraries.assistant.contexttrigger.p1466j;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C63001dt;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.v */
/* compiled from: PG */
public final class C17806v extends C62934bn implements C63001dt {
    public C17806v() {
        super(C17807w.f51105e);
    }

    /* renamed from: a */
    public final C17805u mo23468a(int i) {
        return (C17805u) ((C17807w) this.instance).f51110d.get(i);
    }

    /* renamed from: b */
    public final void mo23469b(int i) {
        copyOnWrite();
        C17807w wVar = (C17807w) this.instance;
        C17807w wVar2 = C17807w.f51105e;
        wVar.mo23470a();
        wVar.f51110d.remove(i);
    }
}
