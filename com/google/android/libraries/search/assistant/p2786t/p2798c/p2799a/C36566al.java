package com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36536h;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36539k;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36542n;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36544p;
import com.google.android.libraries.search.assistant.p2786t.p2798c.p2799a.p2800a.C36550v;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.t.c.a.al */
/* compiled from: PG */
public final /* synthetic */ class C36566al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36568an f95365a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f95366b;

    /* renamed from: c */
    public final /* synthetic */ int f95367c;

    public /* synthetic */ C36566al(C36568an anVar, C58485gu guVar, int i) {
        this.f95365a = anVar;
        this.f95366b = guVar;
        this.f95367c = i;
    }

    public final C60870cx apply(Object obj) {
        C36550v vVar;
        C36568an anVar = this.f95365a;
        C58485gu guVar = this.f95366b;
        int i = this.f95367c;
        C36544p pVar = (C36544p) obj;
        C36536h b = anVar.mo40222b((C36476g) guVar.get(i));
        C36539k kVar = (C36539k) C36542n.f95319e.createBuilder();
        if (pVar.f95327a == 1) {
            vVar = (C36550v) pVar.f95328b;
        } else {
            vVar = C36550v.f95335c;
        }
        kVar.copyOnWrite();
        C36542n nVar = (C36542n) kVar.instance;
        vVar.getClass();
        nVar.f95323c = vVar;
        nVar.f95322b = 2;
        boolean z = i + 1 == guVar.size();
        kVar.copyOnWrite();
        C36542n nVar2 = (C36542n) kVar.instance;
        nVar2.f95321a |= 1;
        nVar2.f95324d = z;
        return b.mo40215b((C36542n) kVar.build());
    }
}
