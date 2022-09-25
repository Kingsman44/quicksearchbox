package com.google.android.libraries.onegoogle.accountmenu.p2351a;

import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30439g;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30461b;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58426ep;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58586kn;
import com.google.common.p4522b.C58662ni;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.a.c */
/* compiled from: PG */
public final class C30288c {

    /* renamed from: a */
    public static final /* synthetic */ int f81916a = 0;

    /* renamed from: b */
    private static final C58710pc f81917b = new C58426ep(C58662ni.m90344c(new C58586kn(C30461b.INCOGNITO, new C30461b[]{C30461b.PRIVACY_ADVISOR, C30461b.SETTINGS, C30461b.HELP_AND_FEEDBACK})));

    /* renamed from: a */
    public static final C58485gu m56359a(C30305n nVar, boolean z) {
        C58480gp gpVar = new C58480gp(4);
        ArrayList arrayList = new ArrayList();
        C58485gu q = nVar.mo35860k().mo36184q();
        int size = q.size();
        for (int i = 0; i < size; i++) {
            C30464e eVar = (C30464e) q.get(i);
            C30461b f = eVar.mo36066f();
            C58838bb.m90883r(!f.equals(C30461b.CUSTOM));
            if (!z || !f.equals(C30461b.PRIVACY_ADVISOR)) {
                arrayList.add(eVar);
            }
        }
        C58485gu F = C58485gu.m89836F(new C30287b(f81917b), arrayList);
        int i2 = ((C58724pq) F).f156474d;
        for (int i3 = 0; i3 < i2; i3++) {
            gpVar.mo55395g(new C30439g(new C30286a((C30464e) F.get(i3))));
        }
        return gpVar.mo55394f();
    }
}
