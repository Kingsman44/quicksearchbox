package com.google.android.apps.gsa.search.core.udc;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.C86140k;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;

/* compiled from: PG */
public class UdcSettingBroadcastReceiver extends C87222r {

    /* renamed from: d */
    private static final C59071e f235599d = C59071e.m91332i("com.google.android.apps.gsa.search.core.udc.UdcSettingBroadcastReceiver");

    /* renamed from: e */
    private static final C56116b[] f235600e = {C56116b.WEB_AND_APP, C56116b.VOICE_AND_AUDIO, C56116b.SUPPL_WEB_AND_APP, C56116b.SUPPL_WEB_AND_APP_DEVICE_LEVEL};

    /* renamed from: a */
    public C86140k f235601a;

    /* renamed from: b */
    public C87204ah f235602b;

    /* renamed from: c */
    public C118561t f235603c;

    public final void onReceive(Context context, Intent intent) {
        boolean z;
        C56116b[] bVarArr;
        C74507e.m120467c(23);
        C58976aa aaVar = C58975e.f156826a;
        mo80850a(context);
        boolean h = this.f235602b.mo80840h();
        boolean z2 = false;
        if ("com.google.android.gms.location.reporting.SETTINGS_CHANGED".equals(intent.getAction())) {
            z = true;
        } else {
            int[] intArrayExtra = intent.getIntArrayExtra("com.google.android.gms.udc.extra.settingIdList");
            if (intArrayExtra == null) {
                C59104x d = f235599d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "UdcSettingBroadcastRece");
                ((C59052c) ((C59052c) d).mo56372aa(9366)).mo56389s("onReceive() : Missing extra %s", "com.google.android.gms.udc.extra.settingIdList");
                return;
            }
            boolean z3 = false;
            for (int i : intArrayExtra) {
                if (h) {
                    bVarArr = C87204ah.f235612b;
                } else {
                    bVarArr = f235600e;
                }
                int length = bVarArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (i == bVarArr[i2].f149511l) {
                        z3 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            z2 = z3;
            z = false;
        }
        if (z2 || (h && z)) {
            C118561t tVar = this.f235603c;
            C118522by byVar = C118522by.FETCH_OPT_IN_STATUSES;
            C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
            afVar.copyOnWrite();
            C118472ag agVar = (C118472ag) afVar.instance;
            agVar.f328821a |= 1;
            agVar.f328822b = 10000;
            afVar.copyOnWrite();
            C118472ag agVar2 = (C118472ag) afVar.instance;
            agVar2.f328824d = 1;
            agVar2.f328821a |= 4;
            tVar.mo103754e(byVar, (C118472ag) afVar.build());
        }
        if (z && !h) {
            this.f235601a.mo79786a(10000);
        }
    }
}
