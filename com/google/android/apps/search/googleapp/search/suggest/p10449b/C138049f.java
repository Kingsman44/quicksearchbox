package com.google.android.apps.search.googleapp.search.suggest.p10449b;

import com.google.common.p4552o.amt;
import com.google.common.p4552o.ane;
import java.util.Map;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.b.f */
/* compiled from: PG */
public final class C138049f implements C138048e {

    /* renamed from: a */
    public int f375617a;

    /* renamed from: b */
    public int f375618b;

    /* renamed from: a */
    public final void mo114093a() {
        this.f375617a = 0;
        this.f375618b = 0;
    }

    /* renamed from: b */
    public final void mo114094b(C138047d dVar) {
        m224353d(dVar, ane.MANAGE_ACTIVITY_BUTTON_IMPRESSION_COUNT, this.f375617a);
        m224353d(dVar, ane.MANAGE_ACTIVITY_BUTTON_TAP_COUNT, this.f375618b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo114095c(amt amt) {
    }

    /* renamed from: d */
    private static void m224353d(C138047d dVar, ane ane, int i) {
        Map map = dVar.f375615a;
        if (i != 0) {
            map.put(ane, Integer.valueOf(i));
        } else {
            map.remove(ane);
        }
    }
}
