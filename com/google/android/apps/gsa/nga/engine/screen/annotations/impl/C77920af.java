package com.google.android.apps.gsa.nga.engine.screen.annotations.impl;

import com.google.android.apps.gsa.nga.d.a.p;
import com.google.android.apps.gsa.nga.d.a.r;
import com.google.android.apps.gsa.nga.d.a.w;
import com.google.android.apps.gsa.nga.engine.annotators.ak;
import com.google.android.apps.gsa.nga.engine.p6034i.C76150a;
import com.google.android.apps.gsa.nga.engine.p6034i.p6037c.C76160e;
import com.google.android.apps.gsa.nga.engine.p6034i.p6037c.C76161f;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.screen.annotations.C77913b;
import com.google.android.apps.gsa.nga.engine.screen.p6139a.C77911a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58370cn;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.screen.annotations.impl.af */
/* compiled from: PG */
public final class C77920af implements C77913b, C76150a, C90991b {

    /* renamed from: a */
    public final ak f214650a;

    /* renamed from: b */
    public final C77911a f214651b;

    /* renamed from: c */
    private final C58881cr f214652c;

    /* renamed from: d */
    private final AtomicLong f214653d = new AtomicLong(-1);

    /* renamed from: e */
    private final AtomicBoolean f214654e = new AtomicBoolean(false);

    public C77920af(ak akVar, C77911a aVar, C78007b bVar) {
        this.f214650a = akVar;
        this.f214651b = aVar;
        this.f214652c = C58886cw.m90973a(new C77945y(bVar));
    }

    /* renamed from: a */
    public final void mo72092a() {
        if (this.f214654e.get()) {
            this.f214654e.set(false);
            ((C76161f) this.f214652c.mo6453a()).mo72106c(new NativeScreenAnnotator(), C77918ad.f214647a);
        }
    }

    /* renamed from: b */
    public final r mo72896b(p pVar, long j) {
        this.f214651b.f214626a.mo74271b(C89849ae.NGA_SCREEN_ANNOTATION_START);
        C76160e a = ((C76161f) this.f214652c.mo6453a()).mo72104a();
        try {
            Optional flatMap = a.f211137a.flatMap(new C77919ae(pVar, j));
            if (flatMap.isPresent()) {
                this.f214651b.f214626a.mo74271b(C89849ae.NGA_SCREEN_ANNOTATION_SUCCESS);
            } else {
                this.f214651b.f214626a.mo74271b(C89849ae.NGA_SCREEN_ANNOTATION_FAILURE);
            }
            r rVar = (r) flatMap.orElse(r.b);
            if (a != null) {
                a.close();
            }
            return rVar;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }

    /* renamed from: c */
    public final C60870cx mo72897c(w wVar, Optional optional) {
        this.f214651b.f214626a.mo74271b(C89849ae.NGA_SCREEN_PRE_ANNOTATION_START);
        return C60922j.m93044g(C60856cj.m92896e((Iterable) Collection.EL.stream(wVar.a).map(new C77916ab(this, optional)).collect(C58370cn.f155946a)), new C77917ac(this), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        ((C76161f) this.f214652c.mo6453a()).mo72105b();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NGA Screen Annotator");
        fVar.mo85278b("NGA Screen Annotator version").mo85276a(C90752i.m148230d(Long.valueOf(this.f214653d.longValue())));
        fVar.mo85278b("NGA Screen Annotator initialized").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f214654e.get())));
    }
}
