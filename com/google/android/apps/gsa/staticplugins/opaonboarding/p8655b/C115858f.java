package com.google.android.apps.gsa.staticplugins.opaonboarding.p8655b;

import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53790bu;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.b.f */
/* compiled from: PG */
final class C115858f {
    /* renamed from: a */
    public static C53791bv m192037a(C45595b bVar) {
        C53790bu buVar = (C53790bu) C53791bv.f141184e.createBuilder();
        buVar.copyOnWrite();
        C53791bv bvVar = (C53791bv) buVar.instance;
        bvVar.f141187b = bVar.f119929nK;
        bvVar.f141186a |= 1;
        String languageTag = Locale.getDefault().toLanguageTag();
        buVar.copyOnWrite();
        C53791bv bvVar2 = (C53791bv) buVar.instance;
        languageTag.getClass();
        bvVar2.f141186a |= 2;
        bvVar2.f141188c = languageTag;
        return (C53791bv) buVar.build();
    }
}
