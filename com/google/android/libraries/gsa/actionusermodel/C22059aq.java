package com.google.android.libraries.gsa.actionusermodel;

import com.google.protos.p4985f.p5030q.C64992ae;
import com.google.protos.p4985f.p5030q.C64993af;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.aq */
/* compiled from: PG */
public final /* synthetic */ class C22059aq implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C64992ae f60786a;

    public /* synthetic */ C22059aq(C64992ae aeVar) {
        this.f60786a = aeVar;
    }

    public final void accept(Object obj) {
        C64992ae aeVar = this.f60786a;
        String str = (String) obj;
        aeVar.copyOnWrite();
        C64993af afVar = (C64993af) aeVar.instance;
        C64993af afVar2 = C64993af.f176001j;
        str.getClass();
        afVar.f176003a |= 16;
        afVar.f176009g = str;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
