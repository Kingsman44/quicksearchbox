package com.google.android.libraries.phenotype.client.stable;

import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.phenotype.client.stable.be */
/* compiled from: PG */
public final /* synthetic */ class C31713be implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ String f85265a;

    /* renamed from: b */
    public final /* synthetic */ C31691aj f85266b;

    /* renamed from: c */
    public final /* synthetic */ C31760t f85267c;

    /* renamed from: d */
    public final /* synthetic */ C31733by f85268d;

    public /* synthetic */ C31713be(String str, C31691aj ajVar, C31760t tVar, C31733by byVar) {
        this.f85265a = str;
        this.f85266b = ajVar;
        this.f85267c = tVar;
        this.f85268d = byVar;
    }

    public final C60870cx apply(Object obj) {
        String str = this.f85265a;
        C31691aj ajVar = this.f85266b;
        C31760t tVar = this.f85267c;
        C31733by byVar = this.f85268d;
        if (!((String) obj).equals(str)) {
            return C60866ct.f164955a;
        }
        if (C31714bf.f85271c.containsKey(new C58835az(ajVar.f85214a, str))) {
            return C60866ct.f164955a;
        }
        return tVar.mo37365c().mo37287a(byVar.f85308b);
    }
}
