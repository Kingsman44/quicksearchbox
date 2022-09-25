package com.google.android.apps.gsa.search.shared.p6925c;

import com.google.android.apps.gsa.shared.util.debug.FeedbackData;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.C59796fx;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.shared.c.a */
/* compiled from: PG */
public final class C87508a {
    /* renamed from: a */
    public static FeedbackData m142042a(C90991b bVar, boolean z, boolean z2) {
        C91006f fVar;
        C91006f g;
        if (z2) {
            if (z) {
                fVar = C91006f.m148646g(6);
            } else {
                fVar = C91006f.m148646g(4);
            }
            fVar.mo85292s(C90752i.m148229c("Sensitive Info: Not Redacted"));
        } else {
            if (z) {
                g = C91006f.m148646g(7);
            } else {
                g = C91006f.m148646g(5);
            }
            fVar.mo85292s(C90752i.m148229c("Sensitive Info: Redacted"));
        }
        fVar.mo85286m(bVar);
        String i = fVar.mo85282i();
        C59796fx fxVar = (C59796fx) fVar.f254236a.build();
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : fVar.f254237b.entrySet()) {
            gzVar.mo55429h((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        C58495hd f = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        for (Map.Entry entry2 : fVar.f254238c.entrySet()) {
            gzVar2.mo55429h((String) entry2.getKey(), String.valueOf(entry2.getValue()));
        }
        return new FeedbackData(i, fxVar, f, gzVar2.mo55427f(false));
    }
}
