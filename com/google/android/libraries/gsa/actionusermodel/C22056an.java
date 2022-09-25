package com.google.android.libraries.gsa.actionusermodel;

import com.google.assistant.p3897e.p3912f.C51218m;
import com.google.assistant.p3897e.p3912f.C51220o;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.an */
/* compiled from: PG */
public final /* synthetic */ class C22056an implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C51218m f60783a;

    public /* synthetic */ C22056an(C51218m mVar) {
        this.f60783a = mVar;
    }

    public final void accept(Object obj) {
        C51218m mVar = this.f60783a;
        String str = (String) obj;
        mVar.copyOnWrite();
        C51220o oVar = (C51220o) mVar.instance;
        C51220o oVar2 = C51220o.f133350m;
        str.getClass();
        oVar.f133352a |= 64;
        oVar.f133359h = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
