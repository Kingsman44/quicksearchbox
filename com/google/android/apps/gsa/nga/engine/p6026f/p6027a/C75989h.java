package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.nga.engine.p6096p.C77446c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.h */
/* compiled from: PG */
public final class C75989h implements C77446c {

    /* renamed from: a */
    public static final C58974d f210798a = C58974d.m91136j();

    /* renamed from: b */
    public final C22871g f210799b;

    /* renamed from: c */
    public final C22871g f210800c;

    /* renamed from: d */
    public final C32160b f210801d;

    /* renamed from: e */
    public final i f210802e;

    /* renamed from: f */
    public final C76005x f210803f;

    /* renamed from: g */
    private final C60836bq f210804g = new C60836bq();

    /* renamed from: h */
    private final Object f210805h = new Object();

    /* renamed from: i */
    private int f210806i = 0;

    public C75989h(i iVar, C32160b bVar, C22871g gVar, C22871g gVar2, C76005x xVar) {
        this.f210801d = bVar;
        this.f210802e = iVar;
        this.f210799b = gVar;
        this.f210800c = gVar2;
        this.f210803f = xVar;
    }

    /* renamed from: a */
    public final void mo71994a() {
        synchronized (this.f210805h) {
            this.f210806i--;
        }
    }

    /* renamed from: b */
    public final void mo71995b() {
        synchronized (this.f210805h) {
            int i = this.f210806i;
            if (i < 2) {
                this.f210806i = i + 1;
                this.f210804g.mo57305b(new C75982a(this), C60826bg.f164896a);
            }
        }
    }
}
