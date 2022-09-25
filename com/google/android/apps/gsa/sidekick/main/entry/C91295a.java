package com.google.android.apps.gsa.sidekick.main.entry;

import com.google.android.apps.gsa.sidekick.shared.util.C91978bb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C8113w;
import com.google.p375ai.p378b.C8140x;
import com.google.p375ai.p378b.C8194z;

/* renamed from: com.google.android.apps.gsa.sidekick.main.entry.a */
/* compiled from: PG */
public final class C91295a implements C91326bd {

    /* renamed from: a */
    private final C7718hj f254802a;

    public C91295a(C7718hj hjVar) {
        this.f254802a = hjVar;
    }

    /* renamed from: a */
    public final C58833ax mo85522a(C7718hj hjVar) {
        if (C91978bb.m150941g(hjVar, this.f254802a)) {
            C8140x xVar = hjVar.f26931C;
            if (xVar == null) {
                xVar = C8140x.f28619f;
            }
            if ((xVar.f28621a & 4) != 0) {
                C8140x xVar2 = hjVar.f26931C;
                if (xVar2 == null) {
                    xVar2 = C8140x.f28619f;
                }
                if ((xVar2.f28621a & 8) != 0) {
                    C7711hc hcVar = (C7711hc) hjVar.toBuilder();
                    C8140x xVar3 = ((C7718hj) hcVar.instance).f26931C;
                    if (xVar3 == null) {
                        xVar3 = C8140x.f28619f;
                    }
                    C8194z zVar = xVar3.f28625e;
                    if (zVar == null) {
                        zVar = C8194z.f28777k;
                    }
                    C8140x xVar4 = ((C7718hj) hcVar.instance).f26931C;
                    C8194z zVar2 = (xVar4 == null ? C8140x.f28619f : xVar4).f28624d;
                    if (zVar2 == null) {
                        zVar2 = C8194z.f28777k;
                    }
                    if (xVar4 == null) {
                        xVar4 = C8140x.f28619f;
                    }
                    C8113w wVar = (C8113w) xVar4.toBuilder();
                    wVar.copyOnWrite();
                    C8140x xVar5 = (C8140x) wVar.instance;
                    zVar.getClass();
                    xVar5.f28624d = zVar;
                    xVar5.f28621a |= 4;
                    wVar.copyOnWrite();
                    C8140x xVar6 = (C8140x) wVar.instance;
                    zVar2.getClass();
                    xVar6.f28625e = zVar2;
                    xVar6.f28621a |= 8;
                    hcVar.copyOnWrite();
                    C7718hj hjVar2 = (C7718hj) hcVar.instance;
                    C8140x xVar7 = (C8140x) wVar.build();
                    xVar7.getClass();
                    hjVar2.f26931C = xVar7;
                    hjVar2.f26955a |= 8388608;
                    return C58833ax.m90834k((C7718hj) hcVar.build());
                }
            }
        }
        return C58836b.f156633a;
    }
}
