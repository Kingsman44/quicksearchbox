package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8080a;

import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.a.bv */
/* compiled from: PG */
public final class C103517bv extends C68247h {

    /* renamed from: a */
    private final C68283d f288430a;

    /* renamed from: c */
    private final C68283d f288431c;

    public C103517bv(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C103517bv.class), aVar);
        this.f288430a = C68236af.m98549d(dVar);
        this.f288431c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        C58833ax axVar;
        List list = (List) obj;
        ae aeVar = (ae) list.get(1);
        String F = ((C86054o) list.get(0)).mo79659F();
        if (C58837ba.m90859h(F)) {
            axVar = C58833ax.m90834k(Locale.getDefault().toLanguageTag());
        } else {
            axVar = C58833ax.m90834k(aeVar.d(F).toLanguageTag());
        }
        return C60856cj.m92900i(axVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f288430a.mo60297gq(), this.f288431c.mo60297gq());
    }
}
