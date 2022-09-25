package com.google.android.libraries.assistant.pcp.p1557g.p1561c.p1562a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.media.p1053d.C13990a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1244a.C16222a;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.pcp.g.c.a.u */
/* compiled from: PG */
public final /* synthetic */ class C18747u implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C18727ah f52853a;

    public /* synthetic */ C18747u(C18727ah ahVar) {
        this.f52853a = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C18727ah ahVar = this.f52853a;
        C12989g a = C16222a.m33264a((C53306j) ((Optional) obj).orElse(C53306j.UNKNOWNN));
        if (ahVar.f52809c.containsKey(a)) {
            return ((C13990a) ahVar.f52809c.get(a)).mo21382b();
        }
        ((C59052c) ((C59052c) C18727ah.f52807a.mo56226d()).mo56372aa(47347)).mo56389s("StickyAppFetcher not provided for EntrySurface: %s", a.name());
        return C60856cj.m92900i(C58836b.f156633a);
    }
}
