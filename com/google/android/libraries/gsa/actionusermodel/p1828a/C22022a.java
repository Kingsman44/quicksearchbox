package com.google.android.libraries.gsa.actionusermodel.p1828a;

import com.google.android.libraries.gsa.actionusermodel.C22074bd;
import com.google.android.libraries.gsa.actionusermodel.C22075be;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.a.a */
/* compiled from: PG */
public final /* synthetic */ class C22022a implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C22074bd f60744a;

    public /* synthetic */ C22022a(C22074bd bdVar) {
        this.f60744a = bdVar;
    }

    public final void accept(Object obj) {
        C22074bd bdVar = this.f60744a;
        String str = (String) obj;
        bdVar.copyOnWrite();
        C22075be beVar = (C22075be) bdVar.instance;
        C22075be beVar2 = C22075be.f60833n;
        str.getClass();
        beVar.f60835a |= 16;
        beVar.f60841g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
