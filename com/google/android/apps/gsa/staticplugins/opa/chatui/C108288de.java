package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.text.format.DateUtils;
import android.util.SparseArray;
import androidx.p060c.C0983m;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105930ak;
import com.google.android.apps.gsa.staticplugins.opa.p8173aa.C105952bf;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.de */
/* compiled from: PG */
public final /* synthetic */ class C108288de implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108303dt f301241a;

    /* renamed from: b */
    public final /* synthetic */ int f301242b;

    /* renamed from: c */
    public final /* synthetic */ int f301243c;

    public /* synthetic */ C108288de(C108303dt dtVar, int i, int i2) {
        this.f301241a = dtVar;
        this.f301242b = i;
        this.f301243c = i2;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        String str;
        C108303dt dtVar = this.f301241a;
        int i = this.f301242b;
        int i2 = this.f301243c;
        Map map = (Map) obj;
        for (Integer intValue : map.keySet()) {
            int intValue2 = intValue.intValue();
            try {
                Integer valueOf = Integer.valueOf(intValue2);
                C105930ak akVar = (C105930ak) map.get(valueOf);
                SparseArray sparseArray = dtVar.f301277h;
                C108267ck ckVar = dtVar.f301292w;
                ckVar.getClass();
                C108265ci ciVar = new C108265ci(intValue2, akVar, sparseArray, ckVar);
                if (!dtVar.f301276g.mo79746e(C90014bt.f247145bd)) {
                    ciVar.mo96720a();
                }
                dtVar.f301280k.mo3691e(valueOf, ciVar);
            } catch (Exception e) {
                C59104x c = C108303dt.f301260a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HistoryManager");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(23976)).mo56387q("#loadItemsToCache: unable build element at index=%d", intValue2);
                dtVar.f301281l.remove(Integer.valueOf(intValue2));
            }
        }
        int max = Math.max(0, i);
        int min = Math.min(i2, ((C105952bf) dtVar.f301271b.mo27525b()).f295816l);
        while (max < min) {
            C0983m mVar = dtVar.f301280k;
            Integer valueOf2 = Integer.valueOf(max);
            C108265ci ciVar2 = (C108265ci) mVar.mo3690d(valueOf2);
            int i3 = max + 1;
            C108265ci ciVar3 = (C108265ci) dtVar.f301280k.mo3690d(Integer.valueOf(i3));
            if (ciVar2 == null || (ciVar3 == null && max != ((C105952bf) dtVar.f301271b.mo27525b()).f295816l - 1)) {
                dtVar.f301281l.remove(valueOf2);
            } else {
                long j = ciVar2.f301179a.f295759d;
                if (ciVar3 == null || !C90769bm.m148270b(j, ciVar3.f301179a.f295759d)) {
                    if (C90769bm.m148270b(j, System.currentTimeMillis())) {
                        str = dtVar.f301274e.getResources().getString(R.string.today);
                    } else if (C90769bm.m148271c(dtVar.f301275f.mo26870b(), j)) {
                        str = dtVar.f301274e.getResources().getString(R.string.yesterday);
                    } else {
                        str = DateUtils.formatDateTime(dtVar.f301274e, j, C89885b.S3_CREATE_INPUT_STREAM_FAILED_VALUE);
                    }
                    ciVar2.f301180b = str;
                    C108232bc bcVar = ciVar2.f301181c;
                    if (bcVar != null) {
                        bcVar.f301036r = str;
                    }
                }
                dtVar.f301281l.put(valueOf2, C108296dm.READY);
                C108297dn dnVar = dtVar.f301284o;
                if (dnVar != null && dtVar.f301288s) {
                    dnVar.mo96728a(max);
                }
            }
            max = i3;
        }
        dtVar.mo96751n();
        C58976aa aaVar = C58975e.f156826a;
    }
}
