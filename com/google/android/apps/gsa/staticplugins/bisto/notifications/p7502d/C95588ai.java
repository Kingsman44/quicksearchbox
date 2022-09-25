package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.ai */
/* compiled from: PG */
final class C95588ai {

    /* renamed from: a */
    public Long f267498a;

    /* renamed from: b */
    private boolean f267499b;

    /* renamed from: c */
    private final C21370a f267500c;

    public C95588ai(C21370a aVar) {
        this.f267500c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo89526a(C95587ah ahVar) {
        if (!this.f267499b) {
            if (ahVar.mo89524d(this.f267500c)) {
                this.f267499b = true;
                return;
            }
            Long a = ahVar.mo89521a();
            if (a == null) {
                C59104x d = C95589aj.f267501a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "NotificationStaging");
                ((C59052c) ((C59052c) d).mo56372aa(16220)).mo56386p("no expiry time");
                int i = C90755l.f253831a;
            } else if (a.longValue() <= this.f267500c.mo26871c()) {
                this.f267499b = true;
            } else {
                Long l = this.f267498a;
                if (l == null) {
                    this.f267498a = a;
                } else {
                    this.f267498a = Long.valueOf(Math.min(l.longValue(), a.longValue()));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo89527b() {
        if (this.f267499b) {
            return true;
        }
        Long l = this.f267498a;
        return l != null && l.longValue() <= this.f267500c.mo26871c();
    }
}
