package com.google.android.apps.gsa.staticplugins.opa;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106378c;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106380e;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106381f;
import com.google.android.apps.gsa.staticplugins.opa.p8205am.C106391p;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.jw */
/* compiled from: PG */
public final class C109332jw {

    /* renamed from: a */
    public final Context f304553a;

    /* renamed from: b */
    public final C68214a f304554b;

    /* renamed from: c */
    public final C86124t f304555c;

    /* renamed from: d */
    private final C106391p f304556d;

    public C109332jw(Context context, C106391p pVar, C68214a aVar, C86124t tVar) {
        this.f304553a = context;
        this.f304556d = pVar;
        this.f304554b = aVar;
        this.f304555c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo97765a() {
        C60870cx g = C60922j.m93044g(this.f304556d.mo95495d(), C106378c.f296730a, C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return C60922j.m93044g(g, new C109331jv(this), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo97766b() {
        C106391p pVar = this.f304556d;
        C60922j.m93044g(((C42876ab) pVar.f296744b.mo27525b()).mo46039a(new C106380e(), C60826bg.f164896a), new C106381f(pVar), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
    }
}
