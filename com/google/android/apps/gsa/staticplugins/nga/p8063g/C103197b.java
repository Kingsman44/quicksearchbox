package com.google.android.apps.gsa.staticplugins.nga.p8063g;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.p5129p.p5131b.C65806cj;
import java.util.ArrayList;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.g.b */
/* compiled from: PG */
public final /* synthetic */ class C103197b implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C103206k f287947a;

    /* renamed from: b */
    public final /* synthetic */ String f287948b;

    public /* synthetic */ C103197b(C103206k kVar, String str) {
        this.f287947a = kVar;
        this.f287948b = str;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C103206k kVar = this.f287947a;
        String str = this.f287948b;
        C58485gu guVar = (C58485gu) obj;
        Optional a = C103206k.m171099a(guVar, C65806cj.SEARCH_AND_ASSISTANT);
        a.isPresent();
        a.orElse(true);
        Optional a2 = C103206k.m171099a(guVar, C65806cj.EECC_CROSS_PRODUCT_DATA_USE);
        a2.isPresent();
        a2.orElse(true);
        boolean booleanValue = ((Boolean) C103206k.m171099a(guVar, C65806cj.DASHER_POLICY).orElse(false)).booleanValue();
        Optional a3 = C103206k.m171099a(guVar, C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE);
        Optional a4 = C103206k.m171099a(guVar, C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_PRIVATE_DEVICE);
        Optional a5 = C103206k.m171099a(guVar, C65806cj.SEARCH_AND_ASSISTANT_WORKSPACE_ANY_DEVICE);
        ArrayList arrayList = new ArrayList();
        boolean booleanValue2 = ((Boolean) a.orElse(true)).booleanValue();
        boolean booleanValue3 = ((Boolean) a2.orElse(false)).booleanValue();
        Boolean valueOf = Boolean.valueOf(!booleanValue);
        arrayList.add(kVar.f287967e.mo46039a(new C103198c(str, booleanValue2, booleanValue3, ((Boolean) a3.orElse(valueOf)).booleanValue(), ((Boolean) a4.orElse(valueOf)).booleanValue(), ((Boolean) a5.orElse(valueOf)).booleanValue()), C60826bg.f164896a));
        new C90873ag(kVar.f287968f.mo28210j(C60856cj.m92906o(arrayList), "[NGA] Notify Geller privacy corpus changes", new C103202g(kVar)), kVar.f287968f, "[NGA] Invalidate NGA state after corpus change", new C103203h(kVar)).mo85223a(C103204i.f287960a);
        return null;
    }
}
