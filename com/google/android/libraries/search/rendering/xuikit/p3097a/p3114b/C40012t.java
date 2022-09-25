package com.google.android.libraries.search.rendering.xuikit.p3097a.p3114b;

import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.p4283bv.p4380j.p4385b.C57681a;
import com.google.p4283bv.p4380j.p4385b.C57830c;
import com.google.protobuf.C62995dn;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;
import java.util.Map;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.b.t */
/* compiled from: PG */
public final /* synthetic */ class C40012t implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ C21311r f105162a;

    public /* synthetic */ C40012t(C21311r rVar) {
        this.f105162a = rVar;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        Map map = (Map) obj;
        SenderStateOuterClass$SenderState h = this.f105162a.mo26739h();
        C57681a aVar = (C57681a) C57830c.f154511d.createBuilder();
        aVar.copyOnWrite();
        C57830c cVar = (C57830c) aVar.instance;
        C62995dn dnVar = cVar.f154514b;
        if (!dnVar.f170058b) {
            cVar.f154514b = dnVar.mo58980a();
        }
        cVar.f154514b.putAll(map);
        if (h != null) {
            aVar.copyOnWrite();
            C57830c cVar2 = (C57830c) aVar.instance;
            cVar2.f154515c = h;
            cVar2.f154513a |= 1;
        }
        return (C57830c) aVar.build();
    }
}
