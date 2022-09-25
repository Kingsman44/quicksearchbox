package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8108d.p8109a;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.p375ai.p378b.C7846mc;
import com.google.p375ai.p378b.C7851mh;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.d.a.j */
/* compiled from: PG */
public final /* synthetic */ class C104667j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C104535ac f291491a;

    /* renamed from: b */
    public final /* synthetic */ C7846mc f291492b;

    /* renamed from: c */
    public final /* synthetic */ List f291493c;

    /* renamed from: d */
    public final /* synthetic */ int f291494d;

    public /* synthetic */ C104667j(C104535ac acVar, C7846mc mcVar, List list, int i) {
        this.f291491a = acVar;
        this.f291492b = mcVar;
        this.f291493c = list;
        this.f291494d = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C104535ac acVar = this.f291491a;
        C7846mc mcVar = this.f291492b;
        List list = this.f291493c;
        int i = this.f291494d;
        int i2 = true != ((Boolean) obj).booleanValue() ? 1 : 2;
        mcVar.copyOnWrite();
        C7851mh mhVar = (C7851mh) mcVar.instance;
        C7851mh mhVar2 = C7851mh.f27519f;
        mhVar.f27522b = i2 - 1;
        mhVar.f27521a |= 1;
        C7851mh mhVar3 = (C7851mh) mcVar.build();
        list.set(i, mhVar3);
        acVar.mo94238G(list);
        acVar.mo94240I(mhVar3);
    }
}
