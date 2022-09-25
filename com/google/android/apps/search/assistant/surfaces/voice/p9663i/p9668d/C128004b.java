package com.google.android.apps.search.assistant.surfaces.voice.p9663i.p9668d;

import com.google.assistant.p3897e.p3917i.p3918a.C51347ei;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.i.d.b */
/* compiled from: PG */
public final class C128004b extends C62934bn implements C63001dt {
    public C128004b() {
        super(C128005c.f352273e);
    }

    /* renamed from: a */
    public final void mo108302a(Iterable iterable) {
        copyOnWrite();
        C128005c cVar = (C128005c) this.instance;
        C62962ci ciVar = C128005c.f352272c;
        C62961ch chVar = cVar.f352276b;
        if (!chVar.mo58948c()) {
            cVar.f352276b = C62942bv.mutableCopy(chVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            cVar.f352276b.mo58916g(((C51347ei) it.next()).f133743i);
        }
    }
}
