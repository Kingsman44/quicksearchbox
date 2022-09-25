package com.google.android.libraries.lens.view.p2087ay;

import com.google.android.libraries.lens.view.gleam.C26504ci;
import com.google.android.libraries.lens.view.p2113h.p2114a.C26644e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.ay.aa */
/* compiled from: PG */
final class C25618aa {

    /* renamed from: a */
    public static final C58974d f69683a = C58974d.m91135i("PendingMergeOperation");

    /* renamed from: b */
    public final List f69684b = new ArrayList();

    /* renamed from: c */
    public final List f69685c = new ArrayList();

    /* renamed from: d */
    public long f69686d = 0;

    /* renamed from: e */
    public long f69687e = 0;

    /* renamed from: f */
    public long f69688f;

    /* renamed from: g */
    public C58833ax f69689g = C58836b.f156633a;

    /* renamed from: h */
    public final C26644e f69690h = new C26644e();

    /* renamed from: i */
    public final C26644e f69691i = new C26644e();

    /* renamed from: j */
    private final C21370a f69692j;

    /* renamed from: k */
    private final Consumer f69693k;

    public C25618aa(C21370a aVar, Consumer consumer) {
        this.f69692j = aVar;
        this.f69693k = consumer;
    }

    /* renamed from: a */
    public static void m47256a(List list, List list2) {
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C26504ci ciVar = (C26504ci) it.next();
            if (!list.contains(ciVar)) {
                list.add(ciVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo30729b() {
        if (this.f69689g.mo56113h()) {
            long e = this.f69692j.mo26873e();
            float f = ((float) (e - this.f69688f)) / 1000000.0f;
            float longValue = ((float) (e - ((Long) this.f69689g.mo56107c()).longValue())) / 1000000.0f;
            ((C58970a) ((C58970a) f69683a.mo56224b()).mo56372aa(50232)).mo56359L("***** MergeLatency[%d]: %.3f %.3f", Long.valueOf(this.f69686d), Float.valueOf(f), Float.valueOf(longValue));
            this.f69690h.mo31932b(f);
            this.f69691i.mo31932b(longValue);
        }
        this.f69693k.accept(this.f69685c);
        for (C26504ci ciVar : this.f69684b) {
            ciVar.f72221o = false;
        }
        this.f69685c.clear();
        this.f69684b.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo30730c() {
        return !this.f69684b.isEmpty() || !this.f69685c.isEmpty();
    }
}
