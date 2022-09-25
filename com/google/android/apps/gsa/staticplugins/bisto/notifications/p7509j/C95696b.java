package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7509j;

import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90427h;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b */
/* compiled from: PG */
public final class C95696b {

    /* renamed from: e */
    private static final C59071e f267918e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.notifications.j.b");

    /* renamed from: a */
    public final C21370a f267919a;

    /* renamed from: b */
    public int f267920b;

    /* renamed from: c */
    public Long f267921c;

    /* renamed from: d */
    public Long f267922d;

    /* renamed from: f */
    private final C95706l f267923f;

    /* renamed from: g */
    private final C90427h f267924g;

    /* renamed from: h */
    private final C89656k f267925h;

    public C95696b(C95706l lVar, C90427h hVar, C21370a aVar, C89656k kVar, int i, Long l, Long l2) {
        this.f267923f = lVar;
        this.f267924g = hVar;
        this.f267919a = aVar;
        this.f267925h = kVar;
        this.f267920b = i;
        this.f267922d = l;
        this.f267921c = l2;
    }

    /* renamed from: a */
    public final void mo89650a(int i, Long l) {
        long j;
        this.f267920b = i;
        if (i != 2) {
            this.f267922d = null;
            if (i == 1) {
                this.f267921c = null;
                this.f267923f.mo89664f(this.f267924g, this.f267920b, this.f267922d, this.f267921c);
            }
        } else if (l == null) {
            C59104x d = f267918e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Engagement");
            ((C59052c) ((C59052c) d).mo56372aa(16459)).mo56386p("Notification ID is needed when entering pending demotion state.");
            int i2 = C90755l.f253831a;
            return;
        } else {
            this.f267922d = l;
        }
        long b = this.f267919a.mo26870b();
        if (this.f267920b == 0) {
            j = C95706l.f267943b.toMillis();
        } else {
            j = C95706l.f267944c;
        }
        this.f267921c = Long.valueOf(b + j);
        this.f267923f.mo89664f(this.f267924g, this.f267920b, this.f267922d, this.f267921c);
    }

    public final String toString() {
        String str = "state=" + this.f267920b + ", notificationId=" + this.f267922d + ", expirationTimestamp=" + this.f267921c;
        Long l = this.f267921c;
        if (l != null) {
            long longValue = l.longValue();
            long b = this.f267919a.mo26870b();
            str = str + ", secondsToExpiration=" + (longValue - b);
        }
        if (!this.f267925h.mo83556k()) {
            return str;
        }
        return "identifier=" + String.valueOf(this.f267924g) + ", " + str;
    }
}
