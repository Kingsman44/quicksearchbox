package com.google.android.libraries.lens.ondevice.p2034k;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.nativeapi.LodeResourceHolder;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24271c;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24272d;
import com.google.android.libraries.lens.ondevice.p2018b.p2019a.C24273e;
import com.google.android.libraries.lens.ondevice.p2026f.p2029b.C24473a;
import com.google.android.libraries.lens.ondevice.p2037n.C24778ak;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.ondevice.p2037n.C24803n;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27813aa;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.p4172bg.C55763x;
import com.google.p4172bg.C55764y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62974ct;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.ondevice.k.cw */
/* compiled from: PG */
public class C24612cw implements C24650eg {

    /* renamed from: a */
    private final String f67340a;

    /* renamed from: b */
    public final C26243ad f67341b;

    /* renamed from: c */
    private final C58974d f67342c;

    /* renamed from: d */
    private final C24623dg f67343d;

    /* renamed from: e */
    private C58833ax f67344e = C58836b.f156633a;

    public C24612cw(C24623dg dgVar, C26243ad adVar) {
        String b = C24657en.m45762b(getClass());
        this.f67340a = b;
        this.f67342c = C58974d.m91135i(b);
        this.f67343d = dgVar;
        this.f67341b = adVar;
    }

    /* renamed from: a */
    public final C58833ax mo29949a(C24795f fVar) {
        return C24617da.m45705a(fVar, this.f67340a).mo56106b(new C24610cu(this));
    }

    /* renamed from: b */
    public final void mo29950b(Context context, LodeResourceHolder lodeResourceHolder, C24803n nVar, C24795f fVar) {
        C58833ax a = C24617da.m45705a(fVar, this.f67340a);
        if (a.mo56113h()) {
            String f = C24473a.m45547f(nVar, ((C24778ak) a.mo56107c()).f67709c);
            if (!TextUtils.isEmpty(f)) {
                C24778ak akVar = (C24778ak) a.mo56107c();
                C58833ax a2 = C27813aa.m51829a(f);
                C55763x xVar = (C55763x) C55764y.f147153c.createBuilder();
                String str = akVar.f67708b;
                xVar.copyOnWrite();
                str.getClass();
                ((C55764y) xVar.instance).f147155a = str;
                Iterable iterable = (Iterable) Collection.EL.stream(akVar.f67711e).map(new C24613cx(f, a2)).collect(C58370cn.f155946a);
                xVar.copyOnWrite();
                C55764y yVar = (C55764y) xVar.instance;
                C62971cq cqVar = yVar.f147156b;
                if (!cqVar.mo58948c()) {
                    yVar.f147156b = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll(iterable, (List) yVar.f147156b);
                C58833ax j = C58833ax.m90833j((C55764y) xVar.build());
                this.f67344e = j;
                if (j.mo56113h()) {
                    try {
                        this.f67343d.mo29970c(context, lodeResourceHolder, (C55764y) this.f67344e.mo56107c(), (C24778ak) a.mo56107c());
                    } catch (C24273e | C62974ct e) {
                        throw new C24271c(C24657en.m45762b(getClass()), e);
                    }
                } else {
                    throw new C24271c("Could not load mutator configs at: ".concat(String.valueOf(f)));
                }
            } else {
                throw new C24272d(((C24778ak) a.mo56107c()).f67709c);
            }
        } else {
            throw new C24271c("Missing primitive load config: ".concat(String.valueOf(this.f67340a)));
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo29951c() {
    }

    /* renamed from: d */
    public final boolean mo29952d(C24795f fVar) {
        C58833ax a = C24617da.m45705a(fVar, this.f67340a);
        if (!a.mo56113h()) {
            ((C58970a) ((C58970a) this.f67342c.mo56225c()).mo56372aa(48851)).mo56389s("Missing primitive load config: %s", this.f67340a);
            return true;
        }
        C24623dg dgVar = this.f67343d;
        return ((Boolean) C58833ax.m90833j((C24778ak) dgVar.f67367c.get(this.f67340a)).mo56106b(new C24611cv(a)).mo56109e(true)).booleanValue();
    }
}
