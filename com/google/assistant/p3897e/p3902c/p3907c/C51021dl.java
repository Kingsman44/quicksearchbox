package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.protobuf.C62934bn;
import com.google.protobuf.C62947c;
import com.google.protobuf.C63001dt;
import java.util.List;

/* renamed from: com.google.assistant.e.c.c.dl */
/* compiled from: PG */
public final class C51021dl extends C62934bn implements C63001dt {
    public C51021dl() {
        super(C51030du.f132868g);
    }

    /* renamed from: a */
    public final C51027dr mo53500a(int i) {
        return (C51027dr) ((C51030du) this.instance).f132875f.get(i);
    }

    /* renamed from: b */
    public final void mo53501b(Iterable iterable) {
        copyOnWrite();
        C51030du duVar = (C51030du) this.instance;
        C51030du duVar2 = C51030du.f132868g;
        duVar.mo53506a();
        C62947c.addAll(iterable, (List) duVar.f132875f);
    }

    /* renamed from: c */
    public final void mo53502c(C51027dr drVar) {
        copyOnWrite();
        C51030du duVar = (C51030du) this.instance;
        C51030du duVar2 = C51030du.f132868g;
        drVar.getClass();
        duVar.mo53506a();
        duVar.f132875f.add(0, drVar);
    }

    /* renamed from: d */
    public final void mo53503d(C51024do doVar) {
        copyOnWrite();
        C51030du duVar = (C51030du) this.instance;
        C51027dr drVar = (C51027dr) doVar.build();
        C51030du duVar2 = C51030du.f132868g;
        drVar.getClass();
        duVar.mo53506a();
        duVar.f132875f.add(drVar);
    }

    /* renamed from: e */
    public final void mo53504e(int i, C51024do doVar) {
        copyOnWrite();
        C51030du duVar = (C51030du) this.instance;
        C51027dr drVar = (C51027dr) doVar.build();
        C51030du duVar2 = C51030du.f132868g;
        drVar.getClass();
        duVar.mo53506a();
        duVar.f132875f.set(i, drVar);
    }

    /* renamed from: f */
    public final void mo53505f(int i, C51027dr drVar) {
        copyOnWrite();
        C51030du duVar = (C51030du) this.instance;
        C51030du duVar2 = C51030du.f132868g;
        drVar.getClass();
        duVar.mo53506a();
        duVar.f132875f.set(i, drVar);
    }
}
