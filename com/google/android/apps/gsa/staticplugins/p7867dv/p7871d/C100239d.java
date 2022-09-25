package com.google.android.apps.gsa.staticplugins.p7867dv.p7871d;

import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.apps.gsa.shared.p6990an.C89227r;
import com.google.android.apps.gsa.shared.p6990an.C89229t;
import com.google.android.apps.gsa.shared.p6990an.p6992b.C89210a;
import com.google.android.libraries.gsa.monet.shared.C23108e;
import com.google.android.libraries.gsa.monet.shared.C23110f;
import com.google.android.libraries.gsa.monet.shared.C23117m;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.searchbox.shared.response.C41658m;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62921ba;

/* renamed from: com.google.android.apps.gsa.staticplugins.dv.d.d */
/* compiled from: PG */
public final /* synthetic */ class C100239d implements C23108e {

    /* renamed from: a */
    public final /* synthetic */ C100244i f280323a;

    public /* synthetic */ C100239d(C100244i iVar) {
        this.f280323a = iVar;
    }

    /* renamed from: a */
    public final void mo28558a(C23117m mVar, C23110f fVar, ProtoParcelable protoParcelable) {
        C100244i iVar = this.f280323a;
        C89229t tVar = (C89229t) C23245b.m43557b(protoParcelable, C89229t.f241959d.getParserForType(), C62921ba.m95368a(), true);
        C100236a aVar = new C100236a(mVar);
        if (!(tVar == null || (tVar.f241961a & 1) == 0)) {
            C41658m mVar2 = tVar.f241962b;
            if (mVar2 == null) {
                mVar2 = C41658m.f108892i;
            }
            if ((tVar.f241961a & 2) != 0) {
                C88710k kVar = iVar.f280333f;
                C89227r rVar = tVar.f241963c;
                if (rVar == null) {
                    rVar = C89227r.f241923I;
                }
                kVar.f239901a = rVar.f241953u;
                C88710k kVar2 = iVar.f280333f;
                C89227r rVar2 = tVar.f241963c;
                if (rVar2 == null) {
                    rVar2 = C89227r.f241923I;
                }
                kVar2.f239902b = rVar2.f241954v;
            }
            aVar.f280310a.mo28730f(C58833ax.m90834k(C89210a.m145113a(mVar2, iVar.f280332e, iVar.f280333f)), false);
        }
        if (tVar != null && (tVar.f241961a & 2) != 0) {
            C89227r rVar3 = tVar.f241963c;
            if (rVar3 == null) {
                rVar3 = C89227r.f241923I;
            }
            aVar.f280311b.mo28730f(C58833ax.m90834k(rVar3), false);
        }
    }
}
