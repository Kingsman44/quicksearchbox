package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.protobuf.C62995dn;
import p001a.p014d.p015a.p016a.C0043af;
import p001a.p014d.p015a.p016a.C0048ak;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.hm */
/* compiled from: PG */
public final /* synthetic */ class C123494hm implements Function {

    /* renamed from: a */
    public final /* synthetic */ C123501ht f341292a;

    public /* synthetic */ C123494hm(C123501ht htVar) {
        this.f341292a = htVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C0043af afVar;
        C123501ht htVar = this.f341292a;
        String str = (String) obj;
        if (htVar.f341300b.mo22b(str)) {
            C0048ak akVar = htVar.f341300b;
            afVar = C0043af.f114m;
            str.getClass();
            C62995dn dnVar = akVar.f134b;
            if (dnVar.containsKey(str)) {
                return (C0043af) dnVar.get(str);
            }
        } else {
            C0048ak akVar2 = htVar.f341300b;
            afVar = C0043af.f114m;
            C62995dn dnVar2 = akVar2.f134b;
            if (dnVar2.containsKey("generic")) {
                return (C0043af) dnVar2.get("generic");
            }
        }
        return afVar;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
