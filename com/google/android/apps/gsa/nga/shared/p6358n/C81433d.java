package com.google.android.apps.gsa.nga.shared.p6358n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80364u;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82984hs;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82988hw;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.n.d */
/* compiled from: PG */
public final /* synthetic */ class C81433d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82984hs f222842a;

    public /* synthetic */ C81433d(C82984hs hsVar) {
        this.f222842a = hsVar;
    }

    public final void accept(Object obj) {
        C82984hs hsVar = this.f222842a;
        C80364u uVar = (C80364u) obj;
        C60870cx cxVar = C81442m.f222851a;
        hsVar.copyOnWrite();
        C82988hw hwVar = (C82988hw) hsVar.instance;
        C82988hw hwVar2 = C82988hw.f226443y;
        uVar.getClass();
        hwVar.f226454h = uVar;
        hwVar.f226447a |= 64;
        String str = uVar.f220518a == 1 ? (String) uVar.f220519b : BuildConfig.FLAVOR;
        hsVar.copyOnWrite();
        C82988hw hwVar3 = (C82988hw) hsVar.instance;
        str.getClass();
        hwVar3.f226447a |= 32;
        hwVar3.f226453g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
