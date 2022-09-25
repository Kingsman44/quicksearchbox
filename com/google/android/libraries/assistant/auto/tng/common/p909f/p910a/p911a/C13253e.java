package com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p911a;

import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13255a;
import com.google.android.libraries.assistant.auto.tng.common.p909f.p910a.p912b.C13256b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import java.util.Set;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.assistant.auto.tng.common.f.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C13253e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f40918a;

    /* renamed from: b */
    public final /* synthetic */ Set f40919b;

    /* renamed from: c */
    public final /* synthetic */ String f40920c;

    public /* synthetic */ C13253e(String str, Set set, String str2) {
        this.f40918a = str;
        this.f40919b = set;
        this.f40920c = str2;
    }

    public final Object apply(Object obj) {
        String str = this.f40918a;
        Set set = this.f40919b;
        String str2 = this.f40920c;
        Map map = (Map) obj;
        if (map.containsKey("_id")) {
            String str3 = (String) map.get("_id");
            C58976aa aaVar = C58975e.f156826a;
            if (set.contains(Long.valueOf(Long.parseLong(str3)))) {
                String str4 = (String) Map.EL.getOrDefault(map, "display_name", str2);
                C13255a aVar = (C13255a) C13256b.f40927g.createBuilder();
                aVar.copyOnWrite();
                C13256b bVar = (C13256b) aVar.instance;
                bVar.f40929a |= 2;
                bVar.f40931c = str;
                aVar.copyOnWrite();
                C13256b bVar2 = (C13256b) aVar.instance;
                str4.getClass();
                bVar2.f40929a |= 1;
                bVar2.f40930b = str4;
                aVar.copyOnWrite();
                C13256b bVar3 = (C13256b) aVar.instance;
                str3.getClass();
                bVar3.f40929a |= 16;
                bVar3.f40934f = str3;
                return C58833ax.m90834k((C13256b) aVar.build());
            }
        }
        return C58836b.f156633a;
    }
}
