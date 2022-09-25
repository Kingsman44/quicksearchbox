package com.google.android.libraries.lens.ondevice.p2026f;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24444af;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24470y;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.common.base.C58817ah;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.ondevice.f.n */
/* compiled from: PG */
public final /* synthetic */ class C24485n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C24491t f67002a;

    /* renamed from: b */
    public final /* synthetic */ boolean f67003b;

    /* renamed from: c */
    public final /* synthetic */ C24490s f67004c;

    public /* synthetic */ C24485n(C24491t tVar, boolean z, C24490s sVar) {
        this.f67002a = tVar;
        this.f67003b = z;
        this.f67004c = sVar;
    }

    public final Object apply(Object obj) {
        int a;
        C24491t tVar = this.f67002a;
        boolean z = this.f67003b;
        C24490s sVar = this.f67004c;
        List<C24440ab> list = (List) obj;
        if (z) {
            for (C24440ab abVar : list) {
                C24465t tVar2 = abVar.f66920b;
                if (tVar2 == null) {
                    tVar2 = C24465t.f66964f;
                }
                if (!tVar2.f66970e.isEmpty() && (a = C24444af.m45518a(abVar.f66924f)) != 0 && a == 2) {
                    String str = tVar2.f66967b;
                    C24470y yVar = (C24470y) C24471z.f66980d.createBuilder();
                    yVar.copyOnWrite();
                    C24471z zVar = (C24471z) yVar.instance;
                    tVar2.getClass();
                    zVar.f66983b = tVar2;
                    zVar.f66982a |= 1;
                    tVar.f67012c.mo29906b(Arrays.asList(new C24471z[]{(C24471z) yVar.build()}));
                }
            }
        }
        return tVar.mo29915c(C24491t.m45562e(list, ((C24472b) sVar).f66986b), true);
    }
}
