package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6022d.C75864b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80197ar;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80235cb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80236cc;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.aw */
/* compiled from: PG */
public final class C75937aw implements C75864b {

    /* renamed from: a */
    private final C75910k f210689a;

    /* renamed from: b */
    private final C91142g f210690b;

    public C75937aw(C75910k kVar, C91142g gVar) {
        this.f210689a = kVar;
        this.f210690b = gVar;
    }

    /* renamed from: gH */
    public final C60870cx mo71906gH() {
        if (this.f210690b.mo85405j(C90126fx.f251349hD)) {
            C75910k kVar = this.f210689a;
            C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
            C80235cb cbVar = (C80235cb) C80236cc.f220124c.createBuilder();
            C80197ar arVar = C80197ar.f220024c;
            cbVar.copyOnWrite();
            C80236cc ccVar = (C80236cc) cbVar.instance;
            arVar.getClass();
            ccVar.f220127b = arVar;
            ccVar.f220126a = 1;
            awVar.copyOnWrite();
            C80203ax axVar = (C80203ax) awVar.instance;
            C80236cc ccVar2 = (C80236cc) cbVar.build();
            ccVar2.getClass();
            axVar.f220050b = ccVar2;
            axVar.f220049a = 8;
            kVar.mo71910b(new ProtoLiteParcelable((MessageLite) awVar.build()));
        }
        return C118826c.f331423b;
    }

    /* renamed from: gI */
    public final void mo71907gI() {
    }
}
