package com.google.android.libraries.search.p3003h.p3004a;

import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137415d;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.common.base.C58838bb;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.h.a.e */
/* compiled from: PG */
public final class C38401e implements C38400d {

    /* renamed from: a */
    private final C38397a f101650a;

    public C38401e(C38397a aVar) {
        this.f101650a = aVar;
    }

    /* renamed from: a */
    public final Intent mo41411a(Intent intent, C38404h hVar) {
        boolean z = false;
        C58838bb.m90868c((hVar.f101654a & 8) == 0 || hVar.f101657d.size() == 0);
        int i = hVar.f101654a;
        if ((i & 8) == 0 || (i & 1) != 0) {
            z = true;
        }
        C58838bb.m90868c(z);
        if ((true != this.f101650a.f101648a.mo78207n() ? 1 : 2) - 1 == 0) {
            return null;
        }
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        l.mo112767b(hVar.f101656c);
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        eVar.mo113713a(Collections.unmodifiableMap(hVar.f101657d));
        if ((hVar.f101654a & 4) != 0) {
            int a = C38399c.m67672a(hVar.f101658e);
            if (a == 0) {
                a = 1;
            }
            int a2 = C137415d.m223276a(a - 1);
            eVar.copyOnWrite();
            C137418g gVar = (C137418g) eVar.instance;
            int i2 = a2 - 1;
            if (a2 != 0) {
                gVar.f373774f = i2;
                gVar.f373769a |= 8;
            } else {
                throw null;
            }
        }
        if ((hVar.f101654a & 1) != 0) {
            String str = hVar.f101655b;
            eVar.copyOnWrite();
            C137418g gVar2 = (C137418g) eVar.instance;
            str.getClass();
            gVar2.f373769a = 1 | gVar2.f373769a;
            gVar2.f373770b = str;
        }
        if ((hVar.f101654a & 8) != 0) {
            String str2 = hVar.f101659f;
            eVar.copyOnWrite();
            C137418g gVar3 = (C137418g) eVar.instance;
            str2.getClass();
            gVar3.f373769a |= 16;
            gVar3.f373775g = str2;
        }
        l.mo112775j(Optional.m71637of((C137418g) eVar.build()));
        C136127h.m221196a(intent, l.mo112766a());
        return intent;
    }
}
