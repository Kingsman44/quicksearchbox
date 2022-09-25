package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29098l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.gs */
/* compiled from: PG */
public final /* synthetic */ class C29158gs implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29170hd f79071a;

    /* renamed from: b */
    public final /* synthetic */ C29098l f79072b;

    /* renamed from: c */
    public final /* synthetic */ Comparator f79073c;

    public /* synthetic */ C29158gs(C29170hd hdVar, C29098l lVar, Comparator comparator) {
        this.f79071a = hdVar;
        this.f79072b = lVar;
        this.f79073c = comparator;
    }

    public final C60870cx apply(Object obj) {
        C29170hd hdVar = this.f79071a;
        C29098l lVar = this.f79072b;
        Comparator comparator = this.f79073c;
        C29098l lVar2 = (C29098l) obj;
        int m = hdVar.f79098e.mo34433m();
        if (C29045l.m53929a((long) m)) {
            if (C29098l.m54001g(lVar, lVar2, comparator)) {
                hdVar.f79094a.mo34542g(1106, m);
            } else {
                hdVar.f79094a.mo34542g(1103, m);
            }
        }
        if (lVar.f78953a) {
            List list = (List) lVar.mo34569c();
            list.getClass();
            return C60856cj.m92900i(list);
        }
        Object d = lVar.mo34570d();
        d.getClass();
        return C60856cj.m92899h((Throwable) d);
    }
}
