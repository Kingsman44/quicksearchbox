package com.google.android.libraries.gsa.monet.tools.p1905c.p1906a.p1907a;

import com.google.android.libraries.gsa.monet.shared.C23118n;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1905c.p1909c.p1910a.C23179b;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.libraries.gsa.monet.tools.c.a.a.a */
/* compiled from: PG */
public final /* synthetic */ class C23175a implements C23118n {

    /* renamed from: a */
    public final /* synthetic */ C23176b f63558a;

    /* renamed from: b */
    public final /* synthetic */ C23123s f63559b;

    public /* synthetic */ C23175a(C23176b bVar, C23123s sVar) {
        this.f63558a = bVar;
        this.f63559b = sVar;
    }

    /* renamed from: a */
    public final void mo28563a(C23120p pVar) {
        Object obj;
        C23176b bVar = this.f63558a;
        C23123s sVar = this.f63559b;
        if (pVar.f63472a.containsKey(bVar.f63561b)) {
            C23120p e = bVar.f63560a.mo28336e();
            ProtoParcelable protoParcelable = (ProtoParcelable) e.f63472a.getParcelable(bVar.f63561b);
            protoParcelable.getClass();
            C23179b bVar2 = (C23179b) C23245b.m43557b(protoParcelable, C23179b.f63565a.getParserForType(), bVar.f63563d, true);
            bVar2.getClass();
            C62940bt r0 = C62942bv.checkIsLite(bVar.f63562c);
            bVar2.mo58887l(r0);
            Object l = bVar2.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            sVar.mo28366a(obj);
        }
    }
}
