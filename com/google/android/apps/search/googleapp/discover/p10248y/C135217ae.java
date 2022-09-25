package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.p10214s.C134544ai;
import com.google.android.apps.search.googleapp.discover.p10214s.C134560ay;
import com.google.android.apps.search.googleapp.discover.p10249z.C135300ag;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135277a;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135278b;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135279c;
import com.google.android.apps.search.googleapp.discover.p10249z.p10250a.C135280d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.p4566l.C60220t;
import java.util.ArrayList;
import java.util.List;
import p5462h.C69677g;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.ae */
/* compiled from: PG */
public final class C135217ae {
    /* renamed from: b */
    public static final C135270u m219322b(C135280d dVar) {
        if (C69664n.m101066l(dVar, C135277a.f368525a)) {
            return C135270u.DISCOVER_IS_DISABLED;
        }
        if (C69664n.m101066l(dVar, C135279c.f368527a)) {
            return C135270u.USER_SIGNED_OUT;
        }
        if (dVar instanceof C135278b) {
            int i = ((C135278b) dVar).f368526a;
            if (i == 1) {
                return C135270u.GMS_CORE_MISSING;
            }
            if (i == 3) {
                return C135270u.GMS_CORE_DISABLED;
            }
            if (i == 9) {
                return C135270u.GMS_CORE_INVALID;
            }
            if (i == 18) {
                return C135270u.GMS_CORE_UPDATING;
            }
            if (i != 19) {
                return C135270u.GMS_CORE_NOT_AVAILABLE_OTHER_REASON;
            }
            return C135270u.GMS_CORE_MISSING_PERMISSION;
        }
        throw new C69677g();
    }

    /* renamed from: a */
    public static final List m219321a(String str, C135300ag agVar, int i, String str2) {
        C134560ay ayVar = agVar.f368581c;
        if (ayVar.f366456b == 3) {
            C134544ai aiVar = (C134544ai) ayVar.f366457c;
            C69664n.m101060f(aiVar, "streamNode.content.content");
            C60220t tVar = agVar.f368581c.f366459e;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            C60220t tVar2 = tVar;
            C69664n.m101060f(tVar2, "streamNode.content.eventId");
            return C69540x.m100944b(new C135254e(aiVar, str, i, tVar2, str2));
        }
        C58485gu<C135300ag> guVar = agVar.f368580b;
        ArrayList arrayList = new ArrayList();
        for (C135300ag a : guVar) {
            C69540x.m100811r(arrayList, m219321a(str, a, i, str2));
        }
        return arrayList;
    }
}
