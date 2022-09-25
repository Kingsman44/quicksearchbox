package com.google.android.apps.gsa.shared.p7010ba;

import com.google.android.apps.gsa.shared.p7010ba.p7011a.C89339b;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.time.temporal.Temporal;

/* renamed from: com.google.android.apps.gsa.shared.ba.b */
/* compiled from: PG */
public final /* synthetic */ class C89340b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Duration f242212a;

    /* renamed from: b */
    public final /* synthetic */ Instant f242213b;

    /* renamed from: c */
    public final /* synthetic */ int f242214c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f242215d;

    public /* synthetic */ C89340b(Duration duration, Instant instant, int i, C58833ax axVar) {
        this.f242212a = duration;
        this.f242213b = instant;
        this.f242214c = i;
        this.f242215d = axVar;
    }

    public final Object apply(Object obj) {
        Duration duration = this.f242212a;
        Instant instant = this.f242213b;
        int i = this.f242214c;
        C58833ax axVar = this.f242215d;
        C89339b bVar = (C89339b) obj;
        if (C89341c.m145294d(bVar, duration)) {
            C89339b b = C89341c.m145292b(instant, duration, i);
            C89341c.m145295e(b, Duration.ZERO);
            return b;
        }
        Duration duration2 = Duration.ZERO;
        if (axVar.mo56113h()) {
            Instant instant2 = (Instant) axVar.mo56107c();
            C63042fg fgVar = bVar.f242208c;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            if (instant2.isAfter(C62950b.m95474e(fgVar))) {
                C63042fg fgVar2 = bVar.f242208c;
                if (fgVar2 == null) {
                    fgVar2 = C63042fg.f170152c;
                }
                duration2 = Duration.between(C62950b.m95474e(fgVar2), (Temporal) axVar.mo56107c());
            }
        }
        C89339b c = C89341c.m145293c(instant, duration, duration2, i, bVar);
        C89341c.m145295e(c, duration2);
        return c;
    }
}
