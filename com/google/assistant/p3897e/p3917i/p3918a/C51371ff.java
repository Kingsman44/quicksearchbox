package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import com.google.protos.p4850an.C63642z;
import java.util.List;

/* renamed from: com.google.assistant.e.i.a.ff */
/* compiled from: PG */
public final class C51371ff extends C62934bn implements C63001dt {
    public C51371ff() {
        super(C51372fg.f133792g);
    }

    /* renamed from: a */
    public final C68014d mo53600a(int i) {
        return (C68014d) ((C51372fg) this.instance).f133797d.get(i);
    }

    /* renamed from: b */
    public final void mo53601b(Iterable iterable) {
        copyOnWrite();
        C51372fg fgVar = (C51372fg) this.instance;
        C51372fg fgVar2 = C51372fg.f133792g;
        fgVar.mo53604a();
        C62947c.addAll(iterable, (List) fgVar.f133797d);
    }

    /* renamed from: c */
    public final void mo53602c(C63642z zVar) {
        copyOnWrite();
        C51372fg fgVar = (C51372fg) this.instance;
        C51372fg fgVar2 = C51372fg.f133792g;
        zVar.getClass();
        fgVar.mo53605b();
        fgVar.f133798e.add(zVar);
    }

    /* renamed from: d */
    public final void mo53603d(int i, C68013c cVar) {
        copyOnWrite();
        C51372fg fgVar = (C51372fg) this.instance;
        C68014d dVar = (C68014d) cVar.build();
        C51372fg fgVar2 = C51372fg.f133792g;
        dVar.getClass();
        fgVar.mo53604a();
        fgVar.f133797d.set(i, dVar);
    }
}
