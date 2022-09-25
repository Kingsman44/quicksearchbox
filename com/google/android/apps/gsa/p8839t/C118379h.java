package com.google.android.apps.gsa.p8839t;

import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123747bn;
import com.google.android.libraries.gsa.p1876k.C22864c;

/* renamed from: com.google.android.apps.gsa.t.h */
/* compiled from: PG */
public final /* synthetic */ class C118379h implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118451i f328589a;

    /* renamed from: b */
    public final /* synthetic */ int f328590b;

    public /* synthetic */ C118379h(C118451i iVar, int i) {
        this.f328589a = iVar;
        this.f328590b = i;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118451i iVar = this.f328589a;
        Boolean bool = (Boolean) obj;
        Object[] objArr = new Object[4];
        int b = C123747bn.m203106b(this.f328590b);
        String a = C123747bn.m203105a(b);
        if (b != 0) {
            objArr[0] = a;
            objArr[1] = iVar.f328784a.mo79659F();
            objArr[2] = ((bm) iVar.f328785b.mo27525b()).b();
            objArr[3] = bool;
            return String.format("pcp_%s_last_updated_time_millis_%s_%s_%s.pb", objArr);
        }
        throw null;
    }
}
