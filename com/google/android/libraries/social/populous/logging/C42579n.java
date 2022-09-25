package com.google.android.libraries.social.populous.logging;

import android.database.sqlite.SQLiteException;
import com.google.net.p4726a.p4727a.C62722b;
import p5602o.p5604b.p5605a.C71881g;
import p5602o.p5604b.p5605a.C71886l;
import p5602o.p5604b.p5605a.C71887m;
import p5602o.p5604b.p5605a.C71894t;
import p5602o.p5604b.p5605a.p5606a.C71863a;
import p5602o.p5604b.p5605a.p5606a.C71865c;
import p5602o.p5604b.p5605a.p5606a.C71868f;
import p5602o.p5604b.p5605a.p5606a.C71869g;

/* renamed from: com.google.android.libraries.social.populous.logging.n */
/* compiled from: PG */
public final class C42579n {

    /* renamed from: a */
    private final C42591z f111740a;

    /* renamed from: b */
    private final C42576k f111741b;

    /* renamed from: c */
    private boolean f111742c;

    /* renamed from: d */
    private boolean f111743d;

    /* renamed from: e */
    private C62722b f111744e = C62722b.OK;

    /* renamed from: f */
    private int f111745f = 1;

    /* renamed from: g */
    private int f111746g = 1;

    /* renamed from: h */
    private int f111747h = 1;

    /* renamed from: i */
    private int f111748i = 1;

    public C42579n(C42591z zVar, C42576k kVar) {
        this.f111740a = zVar;
        this.f111741b = kVar;
    }

    /* renamed from: a */
    public final synchronized void mo45666a() {
        this.f111742c = true;
        mo45667b();
    }

    /* renamed from: b */
    public final synchronized void mo45667b() {
        if (!mo45669d()) {
            C42591z zVar = this.f111740a;
            C71886l lVar = (C71886l) C71887m.f191455g.createBuilder();
            int i = this.f111745f;
            if (i != 1) {
                lVar.copyOnWrite();
                C71887m mVar = (C71887m) lVar.instance;
                int i2 = i - 1;
                if (i != 0) {
                    mVar.f191461e = i2;
                    mVar.f191457a |= 64;
                } else {
                    throw null;
                }
            }
            int i3 = this.f111746g;
            if (i3 != 1) {
                lVar.copyOnWrite();
                C71887m mVar2 = (C71887m) lVar.instance;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    mVar2.f191462f = i4;
                    mVar2.f191457a |= 128;
                } else {
                    throw null;
                }
            }
            if (this.f111744e != C62722b.OK) {
                C62722b bVar = this.f111744e;
                lVar.copyOnWrite();
                C71887m mVar3 = (C71887m) lVar.instance;
                mVar3.f191460d = bVar.f169415s;
                mVar3.f191457a |= 1;
            }
            if (!(this.f111748i == 1 && this.f111747h == 1)) {
                C71863a aVar = (C71863a) C71865c.f191409e.createBuilder();
                int i5 = this.f111747h;
                if (i5 != 1) {
                    aVar.copyOnWrite();
                    C71865c cVar = (C71865c) aVar.instance;
                    int i6 = i5 - 1;
                    if (i5 != 0) {
                        cVar.f191414d = i6;
                        cVar.f191411a |= 1;
                    } else {
                        throw null;
                    }
                }
                if (this.f111748i != 1) {
                    C71868f fVar = (C71868f) C71869g.f191417c.createBuilder();
                    int i7 = this.f111748i;
                    int i8 = i7 - 1;
                    if (i7 != 0) {
                        fVar.copyOnWrite();
                        C71869g gVar = (C71869g) fVar.instance;
                        gVar.f191419a |= 1;
                        gVar.f191420b = i8;
                        aVar.copyOnWrite();
                        C71865c cVar2 = (C71865c) aVar.instance;
                        C71869g gVar2 = (C71869g) fVar.build();
                        gVar2.getClass();
                        cVar2.f191413c = gVar2;
                        cVar2.f191412b = 2;
                    } else {
                        throw null;
                    }
                }
                lVar.copyOnWrite();
                C71887m mVar4 = (C71887m) lVar.instance;
                C71865c cVar3 = (C71865c) aVar.build();
                cVar3.getClass();
                mVar4.f191459c = cVar3;
                mVar4.f191458b = 7;
            }
            C71887m mVar5 = (C71887m) lVar.build();
            C71881g l = ((C42563aa) zVar).mo45642l(4, this.f111741b);
            l.copyOnWrite();
            C71894t tVar = (C71894t) l.instance;
            C71894t tVar2 = C71894t.f191480m;
            mVar5.getClass();
            tVar.f191489h = mVar5;
            tVar.f191482a |= 128;
            ((C42563aa) zVar).mo45641k((C71894t) l.build());
            this.f111743d = true;
            this.f111742c = true;
        }
    }

    /* renamed from: c */
    public final synchronized boolean mo45668c() {
        return this.f111742c;
    }

    /* renamed from: d */
    public final synchronized boolean mo45669d() {
        return this.f111743d;
    }

    /* renamed from: e */
    public final void mo45670e(Throwable th) {
        if (!mo45668c()) {
            this.f111746g = C42578m.m75141a(th);
            this.f111744e = C42577l.m75140a(th);
            if (th instanceof SQLiteException) {
                this.f111748i = C42565ac.m75121a((SQLiteException) th);
            }
        }
    }

    /* renamed from: f */
    public final void mo45671f(C62722b bVar) {
        if (!mo45668c()) {
            this.f111744e = bVar;
        }
    }

    /* renamed from: g */
    public final void mo45672g(int i) {
        if (!mo45668c()) {
            this.f111746g = i;
        }
    }

    /* renamed from: h */
    public final void mo45673h(int i) {
        if (!mo45668c()) {
            this.f111747h = i;
        }
    }

    /* renamed from: i */
    public final void mo45674i(int i) {
        if (!mo45668c()) {
            this.f111745f = i;
        }
    }
}
