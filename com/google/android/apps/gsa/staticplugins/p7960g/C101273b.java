package com.google.android.apps.gsa.staticplugins.p7960g;

import android.app.assist.AssistContent;
import android.app.assist.AssistStructure;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.assist.p501a.C9321i;
import com.google.android.apps.gsa.assist.p503c.C9389b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.p7960g.p7961a.C101270h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import dagger.C68214a;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.staticplugins.g.b */
/* compiled from: PG */
public final class C101273b implements C9389b {

    /* renamed from: c */
    private final C90929bz f282652c;

    /* renamed from: d */
    private final C86124t f282653d;

    /* renamed from: e */
    private final C9321i f282654e;

    /* renamed from: f */
    private final C9313a f282655f;

    /* renamed from: g */
    private final C68214a f282656g;

    /* renamed from: h */
    private final C22871g f282657h;

    public C101273b(C90929bz bzVar, C86124t tVar, C9321i iVar, C9313a aVar, C68214a aVar2, C22871g gVar) {
        this.f282652c = bzVar;
        this.f282653d = tVar;
        this.f282654e = iVar;
        this.f282655f = aVar;
        this.f282656g = aVar2;
        this.f282657h = gVar;
    }

    /* renamed from: a */
    public final C90888av mo17586a(Bundle bundle, Parcelable parcelable, Parcelable parcelable2, Context context, Future future, C9318f fVar, int i) {
        return new C101270h(bundle, (AssistStructure) parcelable, (AssistContent) parcelable2, context, this.f282653d, this.f282654e, future, this.f282655f, fVar, this.f282652c, i, this.f282656g, this.f282657h);
    }
}
