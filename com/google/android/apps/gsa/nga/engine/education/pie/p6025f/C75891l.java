package com.google.android.apps.gsa.nga.engine.education.pie.p6025f;

import com.google.android.apps.gsa.nga.engine.education.pie.C75913n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4553a.C59486bj;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.f.l */
/* compiled from: PG */
public abstract class C75891l {

    /* renamed from: a */
    private static final Duration f210568a = Duration.ofMinutes(3);

    /* renamed from: b */
    private static final C58974d f210569b = C58974d.m91136j();

    /* renamed from: c */
    private final C75892m f210570c;

    /* renamed from: d */
    private final AtomicBoolean f210571d = new AtomicBoolean(false);

    protected C75891l(C75892m mVar) {
        this.f210570c = mVar;
    }

    /* renamed from: d */
    public C80244ck mo71937d() {
        return C80244ck.f220137i;
    }

    /* renamed from: e */
    public void mo71938e() {
        this.f210571d.set(false);
    }

    /* renamed from: f */
    public abstract int mo71939f();

    /* renamed from: g */
    public C59486bj mo71944g() {
        return C59486bj.f157824d;
    }

    /* renamed from: gJ */
    public Duration mo71947gJ() {
        return f210568a;
    }

    /* renamed from: h */
    public final C75913n mo71949h() {
        return this.f210570c.mo71877i();
    }

    /* renamed from: i */
    public void mo71940i() {
        this.f210571d.set(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo71950j(C80265t tVar) {
        if (!this.f210571d.getAndSet(false)) {
            ((C58970a) ((C58970a) f210569b.mo56225c()).mo56372aa(3410)).mo56386p("Cannot fail state, not active");
        } else {
            this.f210570c.mo71885q(tVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo71951k() {
        if (!this.f210571d.getAndSet(false)) {
            ((C58970a) ((C58970a) f210569b.mo56225c()).mo56372aa(3411)).mo56386p("Cannot progress state, not active");
        } else {
            this.f210570c.mo71886r();
        }
    }
}
