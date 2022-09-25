package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import com.google.common.p4522b.C58528ij;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.bh */
/* compiled from: PG */
public final /* synthetic */ class C110763bh implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ Map f308591a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f308592b;

    /* renamed from: c */
    public final /* synthetic */ ArrayList f308593c;

    /* renamed from: d */
    public final /* synthetic */ ArrayList f308594d;

    public /* synthetic */ C110763bh(Map map, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f308591a = map;
        this.f308592b = arrayList;
        this.f308593c = arrayList2;
        this.f308594d = arrayList3;
    }

    public final void accept(Object obj, Object obj2) {
        Map map = this.f308591a;
        ArrayList arrayList = this.f308592b;
        ArrayList arrayList2 = this.f308593c;
        ArrayList arrayList3 = this.f308594d;
        Long l = (Long) obj;
        C58528ij ijVar = (C58528ij) obj2;
        C58528ij ijVar2 = (C58528ij) map.get(l);
        if (ijVar2 == null) {
            arrayList.add(l);
        } else if (ijVar.size() > 1 || ijVar2.size() > 1 || !ijVar.equals(ijVar2)) {
            arrayList2.add(l);
        } else {
            arrayList3.add(l);
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
