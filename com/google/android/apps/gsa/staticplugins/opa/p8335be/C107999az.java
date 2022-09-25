package com.google.android.apps.gsa.staticplugins.opa.p8335be;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opa.C83582am;
import com.google.android.apps.gsa.opa.p6434b.C83586a;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3994s.p3995a.C53271hs;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.be.az */
/* compiled from: PG */
public final /* synthetic */ class C107999az implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C108013bm f300468a;

    /* renamed from: b */
    public final /* synthetic */ C53422nh f300469b;

    public /* synthetic */ C107999az(C108013bm bmVar, C53422nh nhVar) {
        this.f300468a = bmVar;
        this.f300469b = nhVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C60870cx cxVar;
        C108013bm bmVar = this.f300468a;
        C53422nh nhVar = this.f300469b;
        String str = (String) obj;
        if ((nhVar.f140184a & 2) == 0) {
            long b = bmVar.f300489e.mo26870b();
            C53271hs a = C83586a.m133156a(bmVar.f300492h, bmVar.f300488d, bmVar.f300490f, (bm) bmVar.f300495k.mo27525b());
            C22871g gVar = bmVar.f300486b;
            if (bmVar.f300491g.mo56113h()) {
                cxVar = ((C83582am) bmVar.f300491g.mo56107c()).mo76944a(a, b);
            } else {
                cxVar = C60856cj.m92900i(false);
            }
            gVar.mo28211k(cxVar, "Storing last synced timestamp for ZeroState client sync", new C108012bl());
            SharedPreferences.Editor edit = bmVar.f300488d.edit();
            CharSequence[] charSequenceArr = new CharSequence[6];
            charSequenceArr[0] = "opa_zero_state_last_updated_time_millis_";
            charSequenceArr[1] = bmVar.f300490f.mo79659F();
            charSequenceArr[2] = "_";
            charSequenceArr[3] = ((bm) bmVar.f300495k.mo27525b()).b();
            charSequenceArr[4] = "_";
            C53306j a2 = C53306j.m86809a(nhVar.f140193j);
            if (a2 == null) {
                a2 = C53306j.UNKNOWNN;
            }
            charSequenceArr[5] = a2.name();
            edit.putLong(TextUtils.concat(charSequenceArr).toString(), b);
            edit.putBoolean(TextUtils.concat(new CharSequence[]{"opa_zero_state_last_update_has_fine_grain_location_", bmVar.f300490f.mo79659F(), "_", ((bm) bmVar.f300495k.mo27525b()).b()}).toString(), nhVar.f140192i);
            edit.apply();
        }
    }
}
