package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.mdi.download.d.kw */
/* compiled from: PG */
public final /* synthetic */ class C29270kw implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29290lp f79316a;

    public /* synthetic */ C29270kw(C29290lp lpVar) {
        this.f79316a = lpVar;
    }

    public final C60870cx apply(Object obj) {
        C29290lp lpVar = this.f79316a;
        List<C29398ev> list = (List) obj;
        ArrayList arrayList = new ArrayList();
        try {
            for (C29398ev a : list) {
                arrayList.add(lpVar.mo34637a(a));
            }
        } catch (Exception e) {
            lpVar.f79386b.mo34497a(e, "Failed to cancel all downloads during clear", new Object[0]);
        }
        return C29672d.m54726a(arrayList).mo34824b(new C29271kx(lpVar), lpVar.f79395k);
    }
}
