package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.protobuf.C62995dn;
import p001a.p014d.p015a.p016a.C0041ad;
import p001a.p014d.p015a.p016a.C0043af;
import p001a.p014d.p015a.p016a.C0048ak;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.ht */
/* compiled from: PG */
public final class C123501ht {

    /* renamed from: a */
    public static final C123501ht f341299a;

    /* renamed from: b */
    public final C0048ak f341300b;

    /* renamed from: c */
    public final C58495hd f341301c;

    /* renamed from: d */
    public final C58495hd f341302d;

    /* renamed from: e */
    public final C58495hd f341303e;

    /* renamed from: f */
    public final C58495hd f341304f;

    static {
        C0048ak akVar = C0048ak.f131d;
        C58495hd hdVar = C58729pv.f156485a;
        f341299a = new C123501ht(akVar, hdVar, hdVar, hdVar, hdVar);
    }

    public C123501ht(C0048ak akVar, C58495hd hdVar, C58495hd hdVar2, C58495hd hdVar3, C58495hd hdVar4) {
        this.f341300b = akVar;
        this.f341301c = hdVar;
        this.f341302d = hdVar2;
        this.f341303e = hdVar3;
        this.f341304f = hdVar4;
    }

    /* renamed from: a */
    public final C0041ad mo106021a(String str) {
        if (this.f341300b.mo21a(str)) {
            C0048ak akVar = this.f341300b;
            C0041ad adVar = C0041ad.f110c;
            str.getClass();
            C62995dn dnVar = akVar.f133a;
            return dnVar.containsKey(str) ? (C0041ad) dnVar.get(str) : adVar;
        }
        C0048ak akVar2 = this.f341300b;
        C0041ad adVar2 = C0041ad.f110c;
        C62995dn dnVar2 = akVar2.f133a;
        return dnVar2.containsKey("generic") ? (C0041ad) dnVar2.get("generic") : adVar2;
    }

    /* renamed from: b */
    public final C0041ad mo106022b(String str, C123331bl blVar) {
        if (this.f341300b.mo21a(str)) {
            C0048ak akVar = this.f341300b;
            C0041ad adVar = C0041ad.f110c;
            str.getClass();
            C62995dn dnVar = akVar.f133a;
            return dnVar.containsKey(str) ? (C0041ad) dnVar.get(str) : adVar;
        }
        String a = blVar.mo105989a(str);
        if (this.f341300b.mo21a(a)) {
            C0048ak akVar2 = this.f341300b;
            C0041ad adVar2 = C0041ad.f110c;
            a.getClass();
            C62995dn dnVar2 = akVar2.f133a;
            return dnVar2.containsKey(a) ? (C0041ad) dnVar2.get(a) : adVar2;
        }
        C0048ak akVar3 = this.f341300b;
        C0041ad adVar3 = C0041ad.f110c;
        C62995dn dnVar3 = akVar3.f133a;
        return dnVar3.containsKey("generic") ? (C0041ad) dnVar3.get("generic") : adVar3;
    }

    /* renamed from: c */
    public final C0043af mo106023c(String str) {
        return (C0043af) Collection.EL.stream(mo106021a(str).f112a).map(new C123494hm(this)).reduce(C0043af.f114m, C123495hn.f341293a);
    }

    /* renamed from: d */
    public final C0043af mo106024d(String str, C123331bl blVar) {
        return (C0043af) Collection.EL.stream(mo106022b(str, blVar).f112a).map(new C123494hm(this)).reduce(C0043af.f114m, C123495hn.f341293a);
    }

    /* renamed from: e */
    public final C58485gu mo106025e(String str) {
        return (C58485gu) Collection.EL.stream(mo106021a(str).f112a).flatMap(new C123496ho(this)).collect(C58370cn.f155946a);
    }
}
