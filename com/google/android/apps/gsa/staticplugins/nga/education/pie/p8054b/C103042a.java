package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8054b;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80227bu;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.b.a */
/* compiled from: PG */
public final class C103042a implements C118549h {

    /* renamed from: a */
    private final C103335ap f287659a;

    public C103042a(C103335ap apVar) {
        this.f287659a = apVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C103045d.f287664a);
        akVar.mo58887l(r0);
        Object l = akVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80227bu buVar = ((C103044c) obj).f287663b;
        if (buVar == null) {
            buVar = C80227bu.f220106d;
        }
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        buVar.getClass();
        axVar.f220050b = buVar;
        axVar.f220049a = 4;
        this.f287659a.mo93762u(new ProtoLiteParcelable((MessageLite) (C80203ax) awVar.build()));
        return C118826c.f331423b;
    }
}
