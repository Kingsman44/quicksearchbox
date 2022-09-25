package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.protobuf.C62995dn;
import p001a.p014d.p015a.p016a.C0039ab;
import p001a.p014d.p015a.p016a.C0048ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hk */
/* compiled from: PG */
public final /* synthetic */ class C123492hk implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123501ht f341290a;

    public /* synthetic */ C123492hk(C123501ht htVar) {
        this.f341290a = htVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0039ab abVar;
        C123501ht htVar = this.f341290a;
        String str = (String) obj;
        if (htVar.f341300b.mo23c(str)) {
            C0048ak akVar = htVar.f341300b;
            abVar = C0039ab.f104e;
            str.getClass();
            C62995dn dnVar = akVar.f135c;
            if (dnVar.containsKey(str)) {
                return (C0039ab) dnVar.get(str);
            }
        } else {
            C0048ak akVar2 = htVar.f341300b;
            abVar = C0039ab.f104e;
            C62995dn dnVar2 = akVar2.f135c;
            if (dnVar2.containsKey("generic")) {
                return (C0039ab) dnVar2.get("generic");
            }
        }
        return abVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
