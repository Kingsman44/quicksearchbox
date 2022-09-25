package com.google.android.libraries.search.assistant.p2497ab;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.libraries.search.assistant.ab.t */
/* compiled from: PG */
public final /* synthetic */ class C32425t implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f86888a;

    public /* synthetic */ C32425t(Map map) {
        this.f86888a = map;
    }

    public final Object apply(Object obj) {
        int a;
        Map map = this.f86888a;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((C58485gu) obj);
        arrayList.addAll((List) Collection.EL.stream(map.values()).filter(C32427v.f86891a).map(C32428w.f86892a).collect(Collectors.toCollection(C32429x.f86893a)));
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C32398bm bmVar = (C32398bm) arrayList.get(i);
            int i2 = bmVar.f86834b;
            int a2 = C32396bk.m60186a(i2);
            if ((a2 != 0 && a2 == 2) || ((a = C32396bk.m60186a(i2)) != 0 && a == 4)) {
                String str = bmVar.f86844l;
                if (hashMap.containsKey(str)) {
                    C32397bl blVar = (C32397bl) ((C32398bm) hashMap.get(str)).toBuilder();
                    if ((bmVar.f86833a & 512) != 0) {
                        boolean z = true;
                        if (!bmVar.f86843k && !((C32398bm) blVar.instance).f86843k) {
                            z = false;
                        }
                        blVar.copyOnWrite();
                        C32398bm bmVar2 = (C32398bm) blVar.instance;
                        bmVar2.f86833a |= 512;
                        bmVar2.f86843k = z;
                    }
                    if ((bmVar.f86833a & 4) != 0) {
                        double d = bmVar.f86836d;
                        double d2 = ((C32398bm) blVar.instance).f86836d;
                        blVar.copyOnWrite();
                        C32398bm bmVar3 = (C32398bm) blVar.instance;
                        bmVar3.f86833a = 4 | bmVar3.f86833a;
                        bmVar3.f86836d = d + d2;
                    }
                    if ((bmVar.f86833a & 16) != 0) {
                        double d3 = bmVar.f86838f;
                        double d4 = ((C32398bm) blVar.instance).f86838f;
                        blVar.copyOnWrite();
                        C32398bm bmVar4 = (C32398bm) blVar.instance;
                        bmVar4.f86833a |= 16;
                        bmVar4.f86838f = d3 + d4;
                    }
                    if ((bmVar.f86833a & 32) != 0) {
                        double d5 = bmVar.f86839g;
                        double d6 = ((C32398bm) blVar.instance).f86839g;
                        blVar.copyOnWrite();
                        C32398bm bmVar5 = (C32398bm) blVar.instance;
                        bmVar5.f86833a |= 32;
                        bmVar5.f86839g = d5 + d6;
                    }
                    if ((bmVar.f86833a & 64) != 0) {
                        double d7 = bmVar.f86840h;
                        double d8 = ((C32398bm) blVar.instance).f86840h;
                        blVar.copyOnWrite();
                        C32398bm bmVar6 = (C32398bm) blVar.instance;
                        bmVar6.f86833a |= 64;
                        bmVar6.f86840h = d7 + d8;
                    }
                    if ((bmVar.f86833a & 128) != 0) {
                        double d9 = bmVar.f86841i;
                        double d10 = ((C32398bm) blVar.instance).f86841i;
                        blVar.copyOnWrite();
                        C32398bm bmVar7 = (C32398bm) blVar.instance;
                        bmVar7.f86833a |= 128;
                        bmVar7.f86841i = d9 + d10;
                    }
                    hashMap.put(str, (C32398bm) blVar.build());
                } else {
                    hashMap.put(str, bmVar);
                }
            }
        }
        return C58485gu.m89842j(hashMap.values());
    }
}
