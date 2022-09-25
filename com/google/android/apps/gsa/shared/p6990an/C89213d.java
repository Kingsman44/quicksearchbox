package com.google.android.apps.gsa.shared.p6990an;

import com.google.common.p4552o.amt;
import com.google.common.p4552o.aos;
import com.google.common.p4552o.aov;
import com.google.common.p4552o.apd;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.an.d */
/* compiled from: PG */
public final class C89213d {
    /* renamed from: a */
    public static void m145119a(amt amt) {
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd apd2 = apd.f159555aA;
        apd.f159583a &= -2049;
        apd.f159618j = apd.f159555aA.f159618j;
        amt.copyOnWrite();
        ((apd) amt.instance).f159621m = apd.emptyProtobufList();
        apd apd3 = (apd) amt.instance;
        if ((apd3.f159583a & 4096) != 0) {
            aov aov = apd3.f159619k;
            if (aov == null) {
                aov = aov.f159510u;
            }
            aos aos = (aos) aov.toBuilder();
            aos.copyOnWrite();
            aov aov2 = (aov) aos.instance;
            aov2.f159527p = null;
            aov2.f159512a &= -16385;
            amt.copyOnWrite();
            apd apd4 = (apd) amt.instance;
            aov aov3 = (aov) aos.build();
            aov3.getClass();
            apd4.f159619k = aov3;
            apd4.f159583a |= 4096;
        }
        if (((apd) amt.instance).f159620l.size() > 0) {
            List unmodifiableList = Collections.unmodifiableList(((apd) amt.instance).f159620l);
            for (int i = 0; i < unmodifiableList.size(); i++) {
                aos aos2 = (aos) ((aov) unmodifiableList.get(i)).toBuilder();
                aos2.copyOnWrite();
                aov aov4 = (aov) aos2.instance;
                aov4.f159527p = null;
                aov4.f159512a &= -16385;
                aov aov5 = (aov) aos2.build();
                amt.copyOnWrite();
                apd apd5 = (apd) amt.instance;
                aov5.getClass();
                apd5.mo57031a();
                apd5.f159620l.set(i, aov5);
            }
        }
    }
}
