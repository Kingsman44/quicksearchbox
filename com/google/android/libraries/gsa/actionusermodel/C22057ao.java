package com.google.android.libraries.gsa.actionusermodel;

import com.google.assistant.p3897e.p3912f.C51218m;
import com.google.assistant.p3897e.p3912f.C51220o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.ao */
/* compiled from: PG */
public final /* synthetic */ class C22057ao implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51218m f60784a;

    public /* synthetic */ C22057ao(C51218m mVar) {
        this.f60784a = mVar;
    }

    public final void accept(Object obj) {
        C51218m mVar = this.f60784a;
        String str = (String) obj;
        mVar.copyOnWrite();
        C51220o oVar = (C51220o) mVar.instance;
        C51220o oVar2 = C51220o.f133350m;
        str.getClass();
        oVar.f133352a |= 128;
        oVar.f133360i = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
