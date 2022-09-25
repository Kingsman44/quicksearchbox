package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C143839k;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.internal.C143943r;
import com.google.android.gms.common.internal.C143944s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.ao */
/* compiled from: PG */
final class C143740ao extends C143744as {

    /* renamed from: a */
    final /* synthetic */ C143745at f389666a;

    /* renamed from: c */
    private final ArrayList f389667c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C143740ao(C143745at atVar, ArrayList arrayList) {
        super(atVar);
        this.f389666a = atVar;
        this.f389667c = arrayList;
    }

    /* renamed from: a */
    public final void mo119146a() {
        Set set;
        C143745at atVar = this.f389666a;
        C143750ay ayVar = atVar.f389673a.f389736m;
        C143944s sVar = atVar.f389682j;
        if (sVar == null) {
            set = Collections.emptySet();
        } else {
            HashSet hashSet = new HashSet(sVar.f390170b);
            Map map = atVar.f389682j.f390172d;
            for (C143841m mVar : map.keySet()) {
                if (!atVar.f389673a.f389730g.containsKey(mVar.f389917b)) {
                    Set set2 = ((C143943r) map.get(mVar)).f390168a;
                    hashSet.addAll((Collection) null);
                }
            }
            set = hashSet;
        }
        ayVar.f389704h = set;
        ArrayList arrayList = this.f389667c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C143745at atVar2 = this.f389666a;
            ((C143839k) arrayList.get(i)).mo119241E(atVar2.f389683k, atVar2.f389673a.f389736m.f389704h);
        }
    }
}
