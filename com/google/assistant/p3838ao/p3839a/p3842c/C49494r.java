package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49562bs;
import com.google.assistant.p3838ao.p3839a.p3846f.C49642f;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58485gu;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.r */
/* compiled from: PG */
public final class C49494r implements C49486j {
    /* renamed from: a */
    public final /* synthetic */ C58485gu mo53273a(C49692r rVar, Object obj) {
        C49642f fVar;
        C49381a aVar = (C49381a) rVar;
        Instant minus = aVar.f127644j.mo57444a().minus(Duration.ofMinutes(((C49562bs) obj).f127890a));
        C58485gu guVar = aVar.f127637c.mo53309f().f128182a;
        int size = guVar.size();
        int i = 0;
        while (true) {
            fVar = null;
            if (i >= size) {
                break;
            }
            C49642f fVar2 = (C49642f) guVar.get(i);
            if (!fVar2.mo53280a().isBefore(minus)) {
                i++;
                if (fVar2.mo53285f()) {
                    fVar = fVar2;
                    break;
                }
            } else {
                break;
            }
        }
        if (fVar == null) {
            return C58485gu.m89845m();
        }
        Optional d = fVar.mo53283d();
        if (!d.isPresent()) {
            return C58485gu.m89845m();
        }
        return C49681l.m85671d(rVar.mo53333t(R.string.nga_suggestion_chip_navigate_to, d.get()));
    }
}
