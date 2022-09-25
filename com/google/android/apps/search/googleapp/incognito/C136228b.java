package com.google.android.apps.search.googleapp.incognito;

import com.google.android.apps.search.googleapp.incognito.p10327f.C136272a;
import com.google.android.apps.search.googleapp.incognito.p10327f.C136276c;
import com.google.android.libraries.search.p3025k.C38562p;
import com.google.android.libraries.search.p3025k.C38563q;
import com.google.android.libraries.search.p3025k.C38564r;
import com.google.android.libraries.search.p3025k.C38565s;
import com.google.android.libraries.search.p3025k.C38566t;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4552o.C60558ui;
import com.google.common.p4552o.C60559uj;
import com.google.common.p4552o.p4559e.C59743a;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.incognito.b */
/* compiled from: PG */
public final class C136228b {

    /* renamed from: a */
    private final C136272a f371007a;

    /* renamed from: b */
    private final C38566t f371008b;

    public C136228b(C136272a aVar, C38566t tVar) {
        this.f371007a = aVar;
        this.f371008b = tVar;
    }

    /* renamed from: b */
    public final C60870cx mo112855b(int i) {
        C136276c cVar = (C136276c) this.f371007a;
        if (cVar.f371095c) {
            C59743a aVar = C59743a.INCOGNITO_ENTER;
            C60558ui uiVar = (C60558ui) C60559uj.f164278d.createBuilder();
            uiVar.copyOnWrite();
            C60559uj ujVar = (C60559uj) uiVar.instance;
            ujVar.f164281b = i - 1;
            ujVar.f164280a |= 1;
            cVar.mo112878a(aVar, (C60559uj) uiVar.build());
        }
        C38566t tVar = this.f371008b;
        C47633f g = C47633f.m84733g(tVar.f101947b.mo41485a());
        C46325t tVar2 = tVar.f101946a;
        Objects.requireNonNull(tVar2);
        return g.mo51516i(new C38564r(tVar2), tVar.f101948c).mo51515h(C38565s.f101945a, C60826bg.f164896a);
    }

    /* renamed from: a */
    public final C60870cx mo112854a(int i) {
        C136276c cVar = (C136276c) this.f371007a;
        if (cVar.f371095c) {
            C59743a aVar = C59743a.INCOGNITO_EXIT;
            C60558ui uiVar = (C60558ui) C60559uj.f164278d.createBuilder();
            uiVar.copyOnWrite();
            C60559uj ujVar = (C60559uj) uiVar.instance;
            int i2 = i - 1;
            if (i != 0) {
                ujVar.f164282c = i2;
                ujVar.f164280a |= 2;
                cVar.mo112878a(aVar, (C60559uj) uiVar.build());
            } else {
                throw null;
            }
        }
        C38566t tVar = this.f371008b;
        C47633f g = C47633f.m84733g(tVar.f101947b.mo41485a());
        C46325t tVar2 = tVar.f101946a;
        Objects.requireNonNull(tVar2);
        return g.mo51516i(new C38562p(tVar2), tVar.f101948c).mo51515h(C38563q.f101943a, C60826bg.f164896a);
    }
}
