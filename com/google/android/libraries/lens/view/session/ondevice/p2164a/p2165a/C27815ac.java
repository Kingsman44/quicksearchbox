package com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a;

import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.lens.view.p2069am.C25347w;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.a.a.ac */
/* compiled from: PG */
public final class C27815ac {

    /* renamed from: b */
    private static final C25347w f75879b = C25347w.PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V6;

    /* renamed from: a */
    public final int f75880a;

    /* renamed from: c */
    private final C26243ad f75881c;

    /* renamed from: d */
    private final int f75882d;

    public C27815ac(C26243ad adVar, long j, long j2) {
        this.f75881c = adVar;
        this.f75880a = (int) j;
        this.f75882d = (int) j2;
    }

    /* renamed from: a */
    public static C25347w m51832a(long j) {
        if (j == 0) {
            return f75879b;
        }
        return (C25347w) C58833ax.m90833j(C25347w.m46666a((int) j)).mo56109e(f75879b);
    }

    /* renamed from: b */
    public final C27814ab mo33318b(C25347w wVar) {
        if (!this.f75881c.mo31464k(C26242ac.ENABLE_GDD_LENS_TEXT_GELLER_SYNC) || wVar != C25347w.PAGE_LAYOUT_MUTATOR_CASCADE_VERSION_LOTS_V6) {
            return C27818af.m51835a(wVar);
        }
        if (C27818af.f75885a.containsKey(wVar)) {
            return (C27814ab) C27818af.f75885a.get(wVar);
        }
        int number = wVar.getNumber();
        throw new IllegalArgumentException("Unknown GDD cascade version: " + number);
    }

    /* renamed from: c */
    public final C27814ab mo33319c() {
        return mo33318b(m51832a((long) this.f75882d));
    }
}
