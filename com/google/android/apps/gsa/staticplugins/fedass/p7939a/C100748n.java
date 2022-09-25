package com.google.android.apps.gsa.staticplugins.fedass.p7939a;

import com.google.android.apps.search.fedora.p10099e.C132798f;
import com.google.android.apps.search.fedora.p10099e.C132800h;
import com.google.android.apps.search.fedora.p10099e.C132803k;
import com.google.android.apps.search.fedora.p10099e.C132804l;
import com.google.android.apps.search.fedora.p10099e.C132818z;
import com.google.common.base.C58817ah;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.a.n */
/* compiled from: PG */
public final /* synthetic */ class C100748n implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f281636a;

    /* renamed from: b */
    public final /* synthetic */ Function f281637b;

    public /* synthetic */ C100748n(String str, Function function) {
        this.f281636a = str;
        this.f281637b = function;
    }

    public final Object apply(Object obj) {
        String str = this.f281636a;
        C132804l lVar = (C132804l) obj;
        C132800h hVar = (C132800h) this.f281637b.apply(C100719ab.m166911a(str, lVar));
        C132803k kVar = (C132803k) lVar.toBuilder();
        C132818z zVar = hVar.f362336d;
        if (zVar == null) {
            zVar = C132818z.f362393h;
        }
        kVar.mo110906a(str, zVar);
        C132798f fVar = hVar.f362335c;
        if (fVar == null) {
            fVar = C132798f.f362315o;
        }
        kVar.mo110907b(str, fVar);
        return (C132804l) kVar.build();
    }
}
