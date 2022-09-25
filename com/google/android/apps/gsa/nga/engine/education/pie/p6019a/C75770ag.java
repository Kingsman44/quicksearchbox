package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.google.android.apps.gsa.nga.engine.education.pie.C75862d;
import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75891l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import java.util.ArrayList;
import java.util.UUID;
import p3186j$.util.Optional;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.ag */
/* compiled from: PG */
public abstract class C75770ag implements C75788q {

    /* renamed from: a */
    private static final C60836bq f210263a = new C60836bq();

    /* renamed from: d */
    public static final C58974d f210264d = C58974d.m91136j();

    /* renamed from: b */
    private final C80267v f210265b;

    /* renamed from: c */
    private C58485gu f210266c;

    /* renamed from: e */
    protected final Bundle f210267e;

    /* renamed from: f */
    public final ArrayList f210268f = new ArrayList();

    /* renamed from: g */
    public int f210269g = 0;

    /* renamed from: h */
    private C75913n f210270h = C75913n.m122414f(1).mo71870a();

    /* renamed from: i */
    private final String f210271i;

    public C75770ag(Bundle bundle, C80267v vVar) {
        this.f210267e = bundle;
        this.f210265b = vVar;
        this.f210271i = UUID.randomUUID().toString();
    }

    /* renamed from: g */
    private final void m122110g(Consumer consumer) {
        C60856cj.m92911t(f210263a.mo57304a(new C75796y(this, consumer), C60826bg.f164896a), new C75769af(), C60826bg.f164896a);
    }

    /* renamed from: s */
    private final void m122111s(C80265t tVar) {
        mo71876h();
        int i = this.f210269g;
        this.f210269g = -1;
        m122110g(new C75797z(this, i, tVar));
    }

    /* renamed from: t */
    private final void m122112t() {
        C58485gu guVar = this.f210266c;
        if (guVar != null && this.f210269g >= guVar.size()) {
            mo71875f();
            m122110g(new C75764aa(this));
        }
        Optional p = mo71884p();
        if (p.isPresent()) {
            int f = ((C75891l) p.get()).mo71939f();
            int i = f - 1;
            if (f == 0) {
                throw null;
            } else if (i == 0) {
                ((C75891l) p.get()).mo71940i();
                m122110g(new C75765ab(this, p));
            } else if (i == 1) {
                m122111s(C80265t.PRECONDITIONS_FAILED);
            } else if (i == 2) {
                m122110g(new C75766ac(this, p));
                this.f210269g++;
                m122112t();
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ C75862d mo71872a() {
        return C75862d.STANDARD;
    }

    /* renamed from: b */
    public /* synthetic */ C80244ck mo71873b() {
        return C80244ck.f220137i;
    }

    /* renamed from: c */
    public abstract C58485gu mo71874c();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo71875f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo71876h() {
    }

    /* renamed from: i */
    public final C75913n mo71877i() {
        return this.f210270h;
    }

    /* renamed from: j */
    public final C80267v mo71878j() {
        return this.f210265b;
    }

    /* renamed from: k */
    public final String mo71879k() {
        return this.f210271i;
    }

    /* renamed from: l */
    public final void mo71880l(C75786o oVar) {
        synchronized (this.f210268f) {
            this.f210268f.add(oVar);
        }
    }

    /* renamed from: m */
    public final void mo71881m(C75913n nVar) {
        this.f210270h = nVar;
    }

    /* renamed from: n */
    public final synchronized void mo71882n() {
        if (mo71883o()) {
            m122110g(new C75767ad(this));
            return;
        }
        C58485gu c = mo71874c();
        this.f210266c = c;
        if (c.isEmpty()) {
            m122110g(new C75768ae(this));
            return;
        }
        mo71887u();
        m122112t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        return false;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo71883o() {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.common.b.gu r0 = r4.f210266c     // Catch:{ all -> 0x0030 }
            r1 = 0
            if (r0 != 0) goto L_0x0021
            com.google.common.f.a.d r0 = f210264d     // Catch:{ all -> 0x0030 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ all -> 0x0030 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0030 }
            r2 = 3352(0xd18, float:4.697E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0030 }
            com.google.common.f.a.a r0 = (com.google.common.p4526f.p4527a.C58970a) r0     // Catch:{ all -> 0x0030 }
            java.lang.String r2 = "States are not present for flow %d"
            com.google.android.apps.gsa.nga.shared.aa.d.a.v r3 = r4.f210265b     // Catch:{ all -> 0x0030 }
            int r3 = r3.f220269g     // Catch:{ all -> 0x0030 }
            r0.mo56387q(r2, r3)     // Catch:{ all -> 0x0030 }
            monitor-exit(r4)
            return r1
        L_0x0021:
            int r2 = r4.f210269g     // Catch:{ all -> 0x0030 }
            if (r2 < 0) goto L_0x002e
            int r0 = r0.size()     // Catch:{ all -> 0x0030 }
            if (r2 >= r0) goto L_0x002e
            monitor-exit(r4)
            r0 = 1
            return r0
        L_0x002e:
            monitor-exit(r4)
            return r1
        L_0x0030:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.education.pie.p6019a.C75770ag.mo71883o():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Optional mo71884p() {
        if (this.f210266c == null) {
            return Optional.empty();
        }
        if (!mo71883o()) {
            return Optional.empty();
        }
        return Optional.m71637of((C75891l) this.f210266c.get(this.f210269g));
    }

    /* renamed from: q */
    public final synchronized void mo71885q(C80265t tVar) {
        mo71884p().ifPresent(C75795x.f210354a);
        m122111s(tVar);
    }

    /* renamed from: r */
    public final synchronized void mo71886r() {
        mo71884p().ifPresent(C75795x.f210354a);
        this.f210269g++;
        m122112t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo71887u() {
    }
}
