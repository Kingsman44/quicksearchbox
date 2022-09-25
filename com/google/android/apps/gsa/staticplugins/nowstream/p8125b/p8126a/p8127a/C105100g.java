package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a;

import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105140a;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b.C105143d;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105148b;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8132c.C105152f;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.a.a.g */
/* compiled from: PG */
public final class C105100g extends C23056g implements C105140a {

    /* renamed from: a */
    public final C105098e f293014a;

    /* renamed from: b */
    public final C105097d f293015b;

    /* renamed from: c */
    public final C105099f f293016c;

    /* renamed from: d */
    private final C105143d f293017d;

    public C105100g(C23052c cVar, C105143d dVar, C105098e eVar, C105097d dVar2, C105099f fVar) {
        super(cVar);
        this.f293017d = dVar;
        this.f293014a = eVar;
        this.f293015b = dVar2;
        this.f293016c = fVar;
    }

    /* renamed from: e */
    public final void mo94565e() {
        throw null;
    }

    /* renamed from: iD */
    public final void mo28439iD(ProtoParcelable protoParcelable) {
        C105148b bVar = (C105148b) C23245b.m43557b(protoParcelable, C105148b.f293111f.getParserForType(), C62921ba.m95368a(), true);
        if (bVar != null) {
            ((C105094a) this.f293017d).f292977a.mo28730f(Integer.valueOf(bVar.f293115c), false);
            ((C105094a) this.f293017d).f292978b.mo28730f(bVar.f293114b, false);
            C23251a aVar = ((C105094a) this.f293017d).f292980d;
            C105152f fVar = bVar.f293116d;
            if (fVar == null) {
                fVar = C105152f.f293123b;
            }
            aVar.mo28730f(fVar, false);
            ((C105094a) this.f293017d).f292979c.mo28730f(Boolean.valueOf(bVar.f293117e), false);
        }
    }
}
