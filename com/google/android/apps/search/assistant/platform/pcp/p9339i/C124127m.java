package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123787p;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.m */
/* compiled from: PG */
public final /* synthetic */ class C124127m implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ List f342815a;

    public /* synthetic */ C124127m(List list) {
        this.f342815a = list;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        List list = this.f342815a;
        C123787p pVar = (C123787p) obj;
        if (pVar.f341960k.startsWith("SYNC_ERROR")) {
            C59104x d = C124128n.f342816a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PCP.Calendar");
            C0118a.m108p(d, "Calendar event has sync error should be ignored.", 35387, C38505d.f101863a, Integer.valueOf(C89885b.LOCAL_CALENDAR_SYNC_ERROR_EVENTS_VALUE));
            return false;
        }
        long j = pVar.f341959j;
        if (j != 0 && !list.contains(Long.valueOf(j))) {
            C59104x d2 = C124128n.f342816a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "PCP.Calendar");
            ((C59052c) ((C59052c) d2).mo56372aa(35386)).mo56386p("Can not find calendar entry, skip the event.");
            return false;
        } else if (pVar.f341961l) {
            return false;
        } else {
            int i = pVar.f341950a;
            if ((i & 8) != 0) {
                return (i & 16) == 0 || !Duration.ofSeconds(pVar.f341955f - pVar.f341954e).equals(Duration.ofDays(1));
            }
            return false;
        }
    }
}
