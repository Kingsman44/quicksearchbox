package com.google.android.apps.gsa.nga.engine.p6042l;

import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6096p.C77435ab;
import com.google.android.apps.gsa.nga.engine.p6096p.C77446c;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p2476a.C32150a;
import com.google.android.libraries.search.p2476a.C32160b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.l.m */
/* compiled from: PG */
public final class C76244m extends C79360j implements C77446c, C32150a {

    /* renamed from: a */
    public static final C58974d f211257a = C58974d.m91136j();

    /* renamed from: b */
    public Geller f211258b;

    /* renamed from: c */
    public final C32160b f211259c;

    /* renamed from: d */
    public final C22871g f211260d;

    /* renamed from: e */
    public final Object f211261e = new Object();

    /* renamed from: f */
    public C58528ij f211262f = C58733pz.f156496a;

    /* renamed from: g */
    private final C77435ab f211263g;

    /* renamed from: h */
    private final C22871g f211264h;

    /* renamed from: i */
    private final C60836bq f211265i = new C60836bq();

    /* renamed from: j */
    private final Object f211266j = new Object();

    /* renamed from: k */
    private int f211267k = 0;

    public C76244m(C77435ab abVar, C32160b bVar, C22871g gVar, C22871g gVar2, C76092h hVar, C79359i iVar) {
        super(iVar, hVar);
        this.f211263g = abVar;
        this.f211259c = bVar;
        this.f211264h = gVar;
        this.f211260d = gVar2;
    }

    /* renamed from: e */
    private final void m122815e() {
        synchronized (this.f211266j) {
            int i = this.f211267k;
            if (i < 2) {
                this.f211267k = i + 1;
                this.f211265i.mo57305b(new C76239h(this), C60826bg.f164896a);
            }
        }
    }

    /* renamed from: b */
    public final void mo71995b() {
        m122815e();
    }

    /* renamed from: d */
    public final void mo72145d() {
        synchronized (this.f211266j) {
            this.f211267k--;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C60870cx mo71202h() {
        return this.f211264h.mo28209i(this.f211263g.mo72570b(), "[NGA] AssistantDevicesCache.onNgaCreate", new C76237f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C60870cx mo71203i() {
        return this.f211264h.mo28201a("[NGA] AssistantDevicesCache.onNgaCreate", new C76232a(this));
    }

    /* renamed from: j */
    public final void mo37969j() {
        m122815e();
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "AssistantDevicesCache";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 10;
    }
}
