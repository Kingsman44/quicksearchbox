package com.google.android.apps.gsa.staticplugins.p7611bv;

import com.google.android.apps.gsa.search.core.p6519al.p6586bf.C84827a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p10923ac.p10947c.C147206h;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62974ct;
import com.google.protos.p4895aw.p4902b.C64024cg;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bv.ae */
/* compiled from: PG */
final class C97275ae implements C58817ah {
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null || !axVar.mo56113h()) {
            return new C84827a(3, C58833ax.m90834k(-1L));
        }
        try {
            if (!((C64024cg) ((C147206h) axVar.mo56107c()).mo124033a()).f173129a) {
                return new C84827a(7, C58833ax.m90834k(-1L));
            }
            return new C84827a(2, C58833ax.m90834k(Long.valueOf(TimeUnit.MICROSECONDS.toMillis(((C147206h) axVar.mo56107c()).f397422a))));
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C97276af.f271682a.mo56226d()).mo56382g(e)).mo56372aa(20923)).mo56386p("Something went wrong in MDH footprint read result.");
            int i = C90755l.f253831a;
            return new C84827a(4, C58833ax.m90834k(-1L));
        }
    }
}
