package com.google.android.apps.gsa.shared.monet.p7069a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.shared.monet.a.h */
/* compiled from: PG */
public final class C90156h implements C22871g {

    /* renamed from: a */
    public final String f251914a;

    /* renamed from: b */
    public final AtomicBoolean f251915b = new AtomicBoolean(true);

    /* renamed from: c */
    public final Set f251916c = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: d */
    private final C22871g f251917d;

    public C90156h(C22871g gVar, String str) {
        this.f251917d = gVar;
        this.f251914a = str;
    }

    /* renamed from: a */
    public final C60870cx mo28201a(String str, C22862b bVar) {
        return this.f251917d.mo28201a(str, new C90150b(this, str, bVar));
    }

    /* renamed from: b */
    public final C60870cx mo28202b(String str, C22862b bVar) {
        return this.f251917d.mo28202b(str, new C90150b(this, str, bVar));
    }

    /* renamed from: c */
    public final C60870cx mo28203c(String str, long j, C22862b bVar) {
        return this.f251917d.mo28203c(str, j, new C90150b(this, str, bVar));
    }

    /* renamed from: d */
    public final C60870cx mo28204d(String str, long j, C22862b bVar) {
        return this.f251917d.mo28204d(str, j, new C90150b(this, str, bVar));
    }

    /* renamed from: e */
    public final C60870cx mo28205e(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        return this.f251917d.mo28205e(cxVar, str, cls, new C90151c(this, str, cVar));
    }

    /* renamed from: f */
    public final C60870cx mo28206f(C60870cx cxVar, String str, Class cls, C22864c cVar) {
        return this.f251917d.mo28206f(cxVar, str, cls, new C90151c(this, str, cVar));
    }

    /* renamed from: g */
    public final C60870cx mo28207g(String str, C22870f fVar) {
        return this.f251917d.mo28207g(str, new C90155g(this, str, fVar));
    }

    /* renamed from: h */
    public final C60870cx mo28208h(String str, long j, C22870f fVar) {
        return this.f251917d.mo28208h(str, j, new C90155g(this, str, fVar));
    }

    /* renamed from: i */
    public final C60870cx mo28209i(C60870cx cxVar, String str, C22864c cVar) {
        return this.f251917d.mo28209i(cxVar, str, new C90151c(this, str, cVar));
    }

    /* renamed from: j */
    public final C60870cx mo28210j(C60870cx cxVar, String str, C22864c cVar) {
        return this.f251917d.mo28210j(cxVar, str, new C90151c(this, str, cVar));
    }

    /* renamed from: k */
    public final void mo28211k(C60870cx cxVar, String str, C22868d dVar) {
        this.f251917d.mo28211k(cxVar, str, new C90152d(this, dVar));
    }

    /* renamed from: l */
    public final void mo28212l(String str, C22869e eVar) {
        this.f251917d.mo28212l(str, new C90153e(this, eVar));
    }

    /* renamed from: m */
    public final void mo28213m(String str, long j, C22869e eVar) {
        this.f251917d.mo28213m(str, j, new C90153e(this, eVar));
    }

    /* renamed from: n */
    public final void mo83908n() {
        this.f251915b.set(false);
        for (C90154f b : this.f251916c) {
            b.mo83907b();
        }
        this.f251916c.clear();
    }
}
