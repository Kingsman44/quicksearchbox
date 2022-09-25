package com.google.android.apps.search.fedora.p10100f;

import com.google.android.apps.search.fedora.p10099e.C132772ac;
import com.google.android.apps.search.fedora.p10099e.C132773ad;
import com.google.android.apps.search.fedora.p10099e.C132774ae;
import com.google.android.apps.search.fedora.p10099e.C132775af;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.search.fedora.f.f */
/* compiled from: PG */
public final /* synthetic */ class C132839f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ boolean f362443a;

    public /* synthetic */ C132839f(boolean z) {
        this.f362443a = z;
    }

    public final Object apply(Object obj) {
        boolean z = this.f362443a;
        C132773ad adVar = (C132773ad) obj;
        C132775af afVar = adVar.f362228b;
        if (afVar == null) {
            afVar = C132775af.f362231g;
        }
        C132774ae aeVar = (C132774ae) afVar.toBuilder();
        aeVar.copyOnWrite();
        C132775af afVar2 = (C132775af) aeVar.instance;
        afVar2.f362233a |= 1;
        afVar2.f362234b = z;
        C132775af afVar3 = (C132775af) aeVar.build();
        C132772ac acVar = (C132772ac) adVar.toBuilder();
        acVar.copyOnWrite();
        C132773ad adVar2 = (C132773ad) acVar.instance;
        afVar3.getClass();
        adVar2.f362228b = afVar3;
        adVar2.f362227a |= 1;
        return (C132773ad) acVar.build();
    }
}
