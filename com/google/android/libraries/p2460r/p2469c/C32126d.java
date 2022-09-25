package com.google.android.libraries.p2460r.p2469c;

import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: com.google.android.libraries.r.c.d */
/* compiled from: PG */
final class C32126d {

    /* renamed from: a */
    private final Context f86267a;

    /* renamed from: b */
    private final C32127e f86268b;

    /* renamed from: c */
    private final C32057a f86269c;

    /* renamed from: d */
    private final C32125c f86270d;

    /* renamed from: e */
    private final C32092aw f86271e;

    public C32126d(Context context, C32127e eVar, C32057a aVar) {
        this.f86267a = context;
        this.f86268b = eVar;
        this.f86269c = aVar;
        this.f86270d = new C32125c(aVar.mo37840c());
        if (aVar instanceof C32096b) {
            this.f86271e = new C32093ax(C32096b.f86178a);
        } else {
            this.f86271e = new C32075af(10);
        }
    }

    /* renamed from: a */
    public final C32138p mo37928a(Object obj, C32148z zVar) {
        this.f86270d.f86266e++;
        C32138p a = this.f86271e.mo37856a(this.f86269c.mo37839b(zVar, obj));
        if (a == null) {
            C32138p a2 = this.f86269c.mo37838a(this.f86267a, this.f86268b);
            this.f86270d.f86263b++;
            return a2;
        }
        this.f86270d.f86264c++;
        return a;
    }

    /* renamed from: b */
    public final void mo37929b(C32138p pVar) {
        this.f86270d.f86265d++;
        if (pVar.f86304h) {
            pVar.mo37943i();
            FrameLayout frameLayout = pVar.f86305i;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                pVar.f86305i = null;
            }
            pVar.mo37948o(2);
            pVar.f86308l = -3;
            pVar.f86309m = -3;
            pVar.f86304h = false;
        }
        C32091av avVar = pVar.f86303g;
        if (avVar != null) {
            this.f86271e.mo37857b(avVar, pVar);
        }
    }
}
