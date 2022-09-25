package com.google.apps.tiktok.account.data.p3611a;

import com.google.apps.tiktok.account.data.C46214i;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.account.data.a.r */
/* compiled from: PG */
public final /* synthetic */ class C46140r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Map f121040a;

    /* renamed from: b */
    public final /* synthetic */ boolean f121041b;

    public /* synthetic */ C46140r(Map map, boolean z) {
        this.f121040a = map;
        this.f121041b = z;
    }

    public final Object apply(Object obj) {
        Object obj2;
        Map map = this.f121040a;
        boolean z = this.f121041b;
        String str = (String) obj;
        str.getClass();
        if (!map.containsKey(str)) {
            ((C59052c) ((C59052c) C46144v.f121047a.mo56225c()).mo56372aa(54691)).mo56386p("the primary email address for the duplicate gaia id does not match any of the corresponding accounts on device.");
            return null;
        }
        C46215j jVar = (C46215j) map.get(str);
        if (!z) {
            return jVar;
        }
        ArrayList arrayList = new ArrayList(map.size() - 1);
        for (String str2 : map.keySet()) {
            if (!str.equals(str2)) {
                arrayList.add(str2);
            }
        }
        C62940bt r6 = C62942bv.checkIsLite(C46123ad.f121013a);
        jVar.mo58887l(r6);
        Object l = jVar.f169962ag.mo58854l(r6.f169971d);
        if (l == null) {
            obj2 = r6.f169969b;
        } else {
            obj2 = r6.mo58889c(l);
        }
        C46145w wVar = (C46145w) ((C46148z) obj2).toBuilder();
        wVar.copyOnWrite();
        C46148z zVar = (C46148z) wVar.instance;
        C62971cq cqVar = zVar.f121059c;
        if (!cqVar.mo58948c()) {
            zVar.f121059c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) zVar.f121059c);
        C46214i iVar = (C46214i) jVar.toBuilder();
        iVar.mo58885m(C46123ad.f121013a, (C46148z) wVar.build());
        return (C46215j) iVar.build();
    }
}
