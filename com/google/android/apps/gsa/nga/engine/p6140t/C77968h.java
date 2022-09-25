package com.google.android.apps.gsa.nga.engine.p6140t;

import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.understanding.p6241h.p6242a.C79149g;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6287i.C80456d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82370cr;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82371cs;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.t.h */
/* compiled from: PG */
final class C77968h implements C77970j, C77966f {

    /* renamed from: a */
    public final Object f214725a = new Object();

    /* renamed from: b */
    public boolean f214726b = false;

    /* renamed from: c */
    private final AtomicReference f214727c;

    /* renamed from: d */
    private final C76455a f214728d;

    /* renamed from: e */
    private final C77976p f214729e;

    /* renamed from: f */
    private final C83305i f214730f;

    public C77968h(C77976p pVar, C76455a aVar, C83305i iVar) {
        this.f214729e = pVar;
        this.f214727c = new AtomicReference(C77982v.f214744c);
        this.f214728d = aVar;
        this.f214730f = iVar;
    }

    /* renamed from: a */
    public final C77975o mo72927a() {
        return (C77975o) this.f214727c.get();
    }

    /* renamed from: b */
    public final C60870cx mo72928b(Locale locale) {
        synchronized (this.f214725a) {
            this.f214726b = true;
        }
        return C60922j.m93044g(C60838bs.m92859i(this.f214728d.mo72191b()), new C77967g(this, locale), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final void mo72929c() {
        synchronized (this.f214725a) {
            this.f214726b = false;
        }
        this.f214727c.set(C77982v.f214744c);
    }

    /* renamed from: d */
    public final void mo72930d(C80456d dVar, Locale locale) {
        mo72931e(dVar.f220822a, locale);
    }

    /* renamed from: e */
    public final void mo72931e(List list, Locale locale) {
        C77976p pVar = this.f214729e;
        long max = Math.max(pVar.f214738b.mo85399d(C90126fx.f251556kz), 0);
        C79149g gVar = pVar.f214737a;
        int a = C60757n.m92740a(max);
        if (a >= 0) {
            C58528ij ijVar = (C58528ij) Collection.EL.stream(list).map(new C77979s(gVar, locale)).filter(C77980t.f214742a).collect(C58370cn.f155947b);
            C58480gp f = C58485gu.m89838f(ijVar.size());
            C58800sl lA = ijVar.iterator();
            int i = 0;
            while (true) {
                if (!lA.hasNext()) {
                    break;
                }
                C58528ij ijVar2 = (C58528ij) lA.next();
                int i2 = a - i;
                if (i2 < ijVar2.size()) {
                    C58528ij ijVar3 = (C58528ij) Collection.EL.stream(ijVar2).limit((long) i2).collect(C58370cn.f155947b);
                    f.mo55395g(ijVar3);
                    ijVar3.size();
                    break;
                }
                f.mo55395g(ijVar2);
                i += ijVar2.size();
            }
            C58485gu f2 = f.mo55394f();
            Locale locale2 = locale;
            C77953a aVar = new C77953a(gVar, f2, locale2, Collection.EL.stream(f2).mapToInt(C77981u.f214743a).sum(), Collection.EL.stream(ijVar).mapToInt(C77981u.f214743a).sum());
            this.f214727c.set(aVar);
            this.f214730f.mo75579d(new C82371cs("NGA_ICING_EMAIL_KEYWORDS_COUNT", Double.valueOf((double) aVar.f214702a)));
            this.f214730f.mo75579d(new C82370cr("NGA_ICING_EMAIL_AVAILABLE_KEYWORDS_COUNT", Double.valueOf((double) aVar.f214703b)));
            list.size();
            return;
        }
        throw new IllegalArgumentException("maxKeywordsCount should be greater or equal zero");
    }
}
