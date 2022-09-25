package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22078bh;
import com.google.android.libraries.gsa.actionusermodel.C22079bi;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.g */
/* compiled from: PG */
public final /* synthetic */ class C22028g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22078bh f60750a;

    public /* synthetic */ C22028g(C22078bh bhVar) {
        this.f60750a = bhVar;
    }

    public final void accept(Object obj) {
        C22078bh bhVar = this.f60750a;
        String str = (String) obj;
        bhVar.copyOnWrite();
        C22079bi biVar = (C22079bi) bhVar.instance;
        C22079bi biVar2 = C22079bi.f60866l;
        str.getClass();
        biVar.f60868a |= 8;
        biVar.f60873f = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
