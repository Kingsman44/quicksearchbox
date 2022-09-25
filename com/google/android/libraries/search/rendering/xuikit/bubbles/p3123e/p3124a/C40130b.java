package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a;

import com.google.android.libraries.p10982ad.C147446j;
import com.google.android.libraries.p10982ad.C147454r;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40248b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.a.b */
/* compiled from: PG */
public final class C40130b {

    /* renamed from: a */
    public final List f105402a = new ArrayList();

    /* renamed from: b */
    public final C147446j f105403b;

    /* renamed from: c */
    public final C147446j f105404c;

    /* renamed from: d */
    private C40248b f105405d;

    /* renamed from: e */
    private C40248b f105406e;

    public C40130b() {
        C40248b bVar = C40248b.f105719c;
        this.f105405d = bVar;
        this.f105406e = bVar;
        C147446j jVar = new C147446j(0.0f);
        this.f105403b = jVar;
        C147446j jVar2 = new C147446j(0.0f);
        this.f105404c = jVar2;
        jVar.mo124188n(new C40128a(this));
        jVar2.mo124188n(new C40128a(this));
    }

    /* renamed from: e */
    public static boolean m69694e(float f, C147446j jVar) {
        return f >= jVar.f397998d && f <= jVar.f397999e;
    }

    /* renamed from: a */
    public final C40248b mo42220a() {
        C40248b c = C40248b.m69861c(this.f105403b.mo124175a(), this.f105404c.mo124175a(), this.f105405d);
        this.f105405d = c;
        return c;
    }

    /* renamed from: b */
    public final C40248b mo42221b() {
        C40248b c = C40248b.m69861c(this.f105403b.mo124176b(), this.f105404c.mo124176b(), this.f105406e);
        this.f105406e = c;
        return c;
    }

    /* renamed from: c */
    public final void mo42222c(C40248b bVar) {
        C40247a aVar = (C40247a) bVar;
        this.f105403b.mo124186l(aVar.f105717a);
        this.f105404c.mo124186l(aVar.f105718b);
    }

    /* renamed from: d */
    public final void mo42223d(C147454r rVar, C40248b bVar) {
        this.f105403b.mo124185k(rVar).mo124174a(bVar.mo42347a());
        this.f105404c.mo124185k(rVar).mo124174a(bVar.mo42348b());
    }
}
