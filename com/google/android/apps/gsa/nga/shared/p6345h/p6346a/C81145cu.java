package com.google.android.apps.gsa.nga.shared.p6345h.p6346a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6345h.C81240ae;
import com.google.android.apps.gsa.nga.shared.p6345h.C81241af;
import com.google.android.apps.gsa.nga.shared.p6345h.C81253ar;
import com.google.android.apps.gsa.nga.shared.p6345h.C81270ba;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62995dn;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.nga.shared.h.a.cu */
/* compiled from: PG */
public final /* synthetic */ class C81145cu implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f222266a;

    public /* synthetic */ C81145cu(C58833ax axVar) {
        this.f222266a = axVar;
    }

    public final Object apply(Object obj) {
        C81241af afVar = (C81241af) obj;
        String str = (String) this.f222266a.mo56109e(BuildConfig.FLAVOR);
        C81270ba baVar = afVar.f222415d;
        if (baVar == null) {
            baVar = C81270ba.f222463g;
        }
        C81253ar arVar = (C81253ar) baVar.toBuilder();
        str.getClass();
        Map unmodifiableMap = Collections.unmodifiableMap(((C81270ba) arVar.instance).f222468d);
        int intValue = unmodifiableMap.containsKey(str) ? ((Integer) unmodifiableMap.get(str)).intValue() : 0;
        C81240ae aeVar = (C81240ae) afVar.toBuilder();
        int i = intValue + 1;
        str.getClass();
        arVar.copyOnWrite();
        C81270ba baVar2 = (C81270ba) arVar.instance;
        C62995dn dnVar = baVar2.f222468d;
        if (!dnVar.f170058b) {
            baVar2.f222468d = dnVar.mo58980a();
        }
        baVar2.f222468d.put(str, Integer.valueOf(i));
        C81270ba baVar3 = (C81270ba) arVar.build();
        aeVar.copyOnWrite();
        C81241af afVar2 = (C81241af) aeVar.instance;
        baVar3.getClass();
        afVar2.f222415d = baVar3;
        afVar2.f222412a |= 8;
        return (C81241af) aeVar.build();
    }
}
