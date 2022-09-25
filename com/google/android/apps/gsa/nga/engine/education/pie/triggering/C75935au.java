package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import com.google.android.apps.gsa.nga.engine.education.pie.C75910k;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80202aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80203ax;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80226bt;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80227bu;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.au */
/* compiled from: PG */
public final /* synthetic */ class C75935au implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C75936av f210684a;

    public /* synthetic */ C75935au(C75936av avVar) {
        this.f210684a = avVar;
    }

    public final void run() {
        C75910k kVar = this.f210684a.f210686a;
        C80202aw awVar = (C80202aw) C80203ax.f220047c.createBuilder();
        C80226bt btVar = (C80226bt) C80227bu.f220106d.createBuilder();
        btVar.copyOnWrite();
        C80227bu buVar = (C80227bu) btVar.instance;
        buVar.f220108a |= 1;
        buVar.f220109b = "YouTube";
        btVar.copyOnWrite();
        C80227bu buVar2 = (C80227bu) btVar.instance;
        buVar2.f220108a |= 2;
        buVar2.f220110c = "com.google.android.youtube";
        awVar.copyOnWrite();
        C80203ax axVar = (C80203ax) awVar.instance;
        C80227bu buVar3 = (C80227bu) btVar.build();
        buVar3.getClass();
        axVar.f220050b = buVar3;
        axVar.f220049a = 4;
        kVar.mo71910b(new ProtoLiteParcelable((MessageLite) awVar.build()));
    }
}
