package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.common.GroupDataKey;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ah */
/* compiled from: PG */
final class C95587ah {

    /* renamed from: a */
    final C90367af f267488a;

    /* renamed from: b */
    public final boolean f267489b;

    /* renamed from: c */
    public final GroupDataKey f267490c;

    /* renamed from: d */
    final long f267491d;

    /* renamed from: e */
    final boolean f267492e;

    /* renamed from: f */
    final boolean f267493f;

    /* renamed from: g */
    Long f267494g;

    /* renamed from: h */
    boolean f267495h;

    /* renamed from: i */
    boolean f267496i;

    /* renamed from: j */
    final /* synthetic */ C95589aj f267497j;

    public C95587ah(C95589aj ajVar, C90367af afVar, boolean z, long j) {
        this.f267497j = ajVar;
        this.f267488a = afVar;
        this.f267489b = z;
        this.f267491d = j;
        GroupDataKey a = GroupDataKey.m147083a(afVar.f252393a);
        this.f267490c = a;
        boolean z2 = true;
        this.f267493f = a != null && !C95589aj.m158252e(afVar.f252393a);
        this.f267492e = (a == null || !C95589aj.m158252e(afVar.f252393a)) ? false : z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Long mo89521a() {
        Long l = this.f267494g;
        if (l == null) {
            return null;
        }
        return Long.valueOf(this.f267491d + l.longValue());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo89522b() {
        if (this.f267492e && !this.f267495h) {
            this.f267495h = true;
            this.f267494g = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo89523c() {
        if (this.f267493f && !this.f267496i) {
            this.f267496i = true;
            this.f267494g = Long.valueOf(this.f267497j.f267503c.mo83546a("ann_add_delay_time_msec"));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo89524d(C21370a aVar) {
        Long a = mo89521a();
        return a == null || a.longValue() <= aVar.mo26871c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo89525e() {
        return !this.f267489b;
    }
}
