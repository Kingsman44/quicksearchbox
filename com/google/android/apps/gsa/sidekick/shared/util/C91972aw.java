package com.google.android.apps.gsa.sidekick.shared.util;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.apps.gsa.shared.util.C90734ar;
import com.google.android.apps.gsa.sidekick.shared.monet.p7247c.C91788al;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7682ga;
import com.google.p375ai.p378b.C7718hj;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.util.aw */
/* compiled from: PG */
public final class C91972aw {
    /* renamed from: a */
    public static C58833ax m150926a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return C58836b.f156633a;
        }
        return C58833ax.m90833j((C57315dp) C90734ar.m148199b(extras, "notification_pinned_content_token", C57315dp.f152986c.getParserForType()));
    }

    /* renamed from: b */
    public static C58833ax m150927b(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return C58836b.f156633a;
        }
        C91788al alVar = (C91788al) C90734ar.m148199b(extras, "notification_survey_info", C91788al.f255957d.getParserForType());
        if (alVar != null) {
            C7682ga gaVar = alVar.f255960b;
            if (gaVar == null) {
                gaVar = C7682ga.f26836d;
            }
            if ((gaVar.f26838a & 1) != 0) {
                return C58833ax.m90834k(alVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static List m150928c(Intent intent) {
        ArrayList arrayList = new ArrayList();
        if (intent.hasExtra("notification_entries")) {
            for (C7718hj pair : C91978bb.m150939e(intent, "notification_entries")) {
                arrayList.add(new Pair(pair, C7681g.CLICK_NOTIFICATION));
            }
        }
        return arrayList;
    }
}
