package com.google.android.libraries.gsa.actionusermodel;

import com.google.assistant.p3897e.p3912f.C51218m;
import com.google.assistant.p3897e.p3912f.C51220o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.am */
/* compiled from: PG */
public final /* synthetic */ class C22055am implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51218m f60782a;

    public /* synthetic */ C22055am(C51218m mVar) {
        this.f60782a = mVar;
    }

    public final void accept(Object obj) {
        C51218m mVar = this.f60782a;
        String str = (String) obj;
        mVar.copyOnWrite();
        C51220o oVar = (C51220o) mVar.instance;
        C51220o oVar2 = C51220o.f133350m;
        str.getClass();
        oVar.f133352a |= 8;
        oVar.f133356e = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
