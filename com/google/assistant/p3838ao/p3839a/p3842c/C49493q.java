package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49381a;
import com.google.assistant.p3838ao.p3839a.C49669i;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49542az;
import com.google.assistant.p3838ao.p3839a.p3845e.C49558bo;
import com.google.assistant.p3838ao.p3839a.p3845e.C49560bq;
import com.google.assistant.p3838ao.p3839a.p3845e.C49591cu;
import com.google.assistant.p3838ao.p3839a.p3845e.C49619j;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.assistant.ao.a.c.q */
/* compiled from: PG */
public final class C49493q implements C49486j {
    /* renamed from: a */
    public final /* synthetic */ C58485gu mo53273a(C49692r rVar, Object obj) {
        String str;
        String str2;
        String str3;
        C49692r rVar2 = rVar;
        C49560bq bqVar = (C49560bq) obj;
        C49381a aVar = (C49381a) rVar2;
        Optional optional = aVar.f127638d;
        if (optional.isEmpty()) {
            return C58485gu.m89845m();
        }
        C62971cq cqVar = ((C49669i) optional.get()).f128189f.f127935d;
        cqVar.isEmpty();
        int size = cqVar.size();
        C58480gp e = C58485gu.m89837e();
        Iterator it = cqVar.iterator();
        while (true) {
            char c = 0;
            if (!it.hasNext()) {
                break;
            }
            C49558bo boVar = (C49558bo) it.next();
            if (bqVar.f127882a && boVar.f127876c.contains("/collection/synthetic_movie_in_theater_".concat(String.valueOf(aVar.f127643i.toLowerCase(Locale.US))))) {
                String t = rVar2.mo53333t(R.string.nga_suggestion_chip_showtimes_entity, boVar.f127875b);
                if (size > 1) {
                    str3 = t;
                } else {
                    str3 = rVar2.mo53333t(R.string.nga_suggestion_chip_showtimes, new Object[0]);
                }
                C49591cu cuVar = boVar.f127878e;
                if (cuVar == null) {
                    cuVar = C49591cu.f127964c;
                }
                e.mo55395g(C49681l.m85670c(str3, t, cuVar.f127967b));
            }
            if (bqVar.f127883b) {
                String t2 = rVar2.mo53333t(R.string.nga_suggestion_chip_watch, new Object[0]);
                for (C49542az azVar : boVar.f127877d) {
                    C49619j jVar = azVar.f127830b;
                    if (jVar == null) {
                        jVar = C49619j.f128058c;
                    }
                    if (aVar.f127646l.a(jVar.f128061b)) {
                        if (size > 1) {
                            Object[] objArr = new Object[1];
                            objArr[c] = boVar.f127875b;
                            str2 = rVar2.mo53333t(R.string.nga_suggestion_chip_watch_entity, objArr);
                        } else {
                            str2 = t2;
                        }
                        C49591cu cuVar2 = boVar.f127878e;
                        if (cuVar2 == null) {
                            cuVar2 = C49591cu.f127964c;
                        }
                        e.mo55395g(C49681l.m85668a(str2, azVar, cuVar2.f127967b));
                        t2 = t2;
                        c = 0;
                    }
                }
            }
            if (bqVar.f127884c) {
                String t3 = rVar2.mo53333t(R.string.nga_suggestion_chip_trailer_entity, boVar.f127875b);
                if (size > 1) {
                    str = t3;
                } else {
                    str = rVar2.mo53333t(R.string.nga_suggestion_chip_trailer, new Object[0]);
                }
                C49591cu cuVar3 = boVar.f127878e;
                if (cuVar3 == null) {
                    cuVar3 = C49591cu.f127964c;
                }
                e.mo55395g(C49681l.m85670c(str, t3, cuVar3.f127967b));
            }
            if (bqVar.f127885d) {
                String t4 = rVar2.mo53333t(R.string.nga_suggestion_chip_about_entity, boVar.f127875b);
                String t5 = rVar2.mo53333t(R.string.nga_suggestion_chip_about_movie_query, boVar.f127875b);
                C49591cu cuVar4 = boVar.f127878e;
                if (cuVar4 == null) {
                    cuVar4 = C49591cu.f127964c;
                }
                e.mo55395g(C49681l.m85670c(t4, t5, cuVar4.f127967b));
            }
        }
        for (C49558bo boVar2 : ((C49669i) optional.get()).f128189f.f127936e) {
            if (bqVar.f127885d) {
                String t6 = rVar2.mo53333t(R.string.nga_suggestion_chip_about_entity, boVar2.f127875b);
                String t7 = rVar2.mo53333t(R.string.nga_suggestion_chip_about_movie_series_query, boVar2.f127875b);
                C49591cu cuVar5 = boVar2.f127878e;
                if (cuVar5 == null) {
                    cuVar5 = C49591cu.f127964c;
                }
                e.mo55395g(C49681l.m85670c(t6, t7, cuVar5.f127967b));
            }
        }
        return e.mo55394f();
    }
}
