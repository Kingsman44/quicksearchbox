package com.google.android.apps.gsa.speech.p7271d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.util.p7159c.C90886at;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.speech.d.i */
/* compiled from: PG */
public final class C92232i {

    /* renamed from: a */
    public final C89859i f257144a;

    /* renamed from: b */
    public final Runnable f257145b;

    /* renamed from: c */
    public final Runnable f257146c;

    /* renamed from: d */
    public Set f257147d;

    /* renamed from: e */
    public boolean f257148e;

    /* renamed from: f */
    private final C90929bz f257149f;

    /* renamed from: g */
    private final C90021c f257150g;

    public C92232i(Set set, Runnable runnable, Runnable runnable2, C90929bz bzVar, C90021c cVar, C89859i iVar) {
        this.f257145b = runnable;
        this.f257146c = runnable2;
        this.f257147d = new HashSet(set);
        this.f257149f = bzVar;
        this.f257150g = cVar;
        this.f257144a = iVar;
    }

    /* renamed from: a */
    public final void mo86907a() {
        if (!this.f257148e) {
            this.f257148e = true;
            ArrayList arrayList = new ArrayList();
            for (C92229f d : this.f257147d) {
                arrayList.add(d.mo86904d());
            }
            C60870cx o = C60856cj.m92906o(arrayList);
            C90886at.m148485b(o, this.f257150g.mo79743a(C90082eg.f250087x), this.f257149f);
            this.f257149f.mo85147l(o, new C92230g(this));
        }
    }
}
