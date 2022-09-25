package com.google.android.libraries.assistant.hotword;

import android.os.Build;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82315aq;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82544jc;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82545jd;
import com.google.android.libraries.search.p2904c.C37561eb;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.C37656hc;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.assistant.hotword.aj */
/* compiled from: PG */
final class C18337aj implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C18339al f51994a;

    public C18337aj(C18339al alVar) {
        this.f51994a = alVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C18339al.f51996a.mo56226d()).mo56382g(th)).mo56372aa(47241)).mo56386p("Failed to get mic status");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C37563ed edVar;
        C18339al alVar = this.f51994a;
        C82544jc j = C82545jd.m131436j();
        C82315aq aqVar = (C82315aq) j;
        aqVar.f224852b = "OPEN";
        C37561eb ebVar = ((C37656hc) obj).mo41049a().f100041b;
        if (ebVar == null) {
            ebVar = C37561eb.f99800c;
        }
        if (ebVar.f99802a == 1) {
            edVar = C37563ed.m66571a(((Integer) ebVar.f99803b).intValue());
            if (edVar == null) {
                edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
            }
        } else {
            edVar = C37563ed.UNKNOWN_OPENING_SUCCESS;
        }
        j.mo75665e(edVar.name());
        aqVar.f224853c = "BISTO_DSP_HOTWORD";
        j.mo75664d(false);
        j.mo75663c();
        j.mo75662b(Build.VERSION.SDK_INT);
        alVar.mo23803t(j.mo75661a());
    }
}
