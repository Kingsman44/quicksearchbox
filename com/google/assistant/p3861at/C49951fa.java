package com.google.assistant.p3861at;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.at.fa */
/* compiled from: PG */
public final class C49951fa extends C62934bn implements C63001dt {
    public C49951fa() {
        super(C49952fb.f129857j);
    }

    /* renamed from: a */
    public final void mo53375a(Iterable iterable) {
        copyOnWrite();
        C49952fb fbVar = (C49952fb) this.instance;
        C49952fb fbVar2 = C49952fb.f129857j;
        fbVar.mo53377a();
        C62947c.addAll(iterable, (List) fbVar.f129862d);
    }

    /* renamed from: b */
    public final void mo53376b(String str) {
        copyOnWrite();
        C49952fb fbVar = (C49952fb) this.instance;
        C49952fb fbVar2 = C49952fb.f129857j;
        str.getClass();
        fbVar.mo53377a();
        fbVar.f129862d.add(str);
    }
}
