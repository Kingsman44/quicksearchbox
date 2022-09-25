package com.google.android.apps.gsa.staticplugins.p7371ae;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.location.ImproveLocationRequest;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60578vb;
import com.google.common.p4552o.C60580vd;
import com.google.common.p4552o.C60583vg;
import com.google.common.p4552o.C60584vh;
import com.google.common.p4552o.C60585vi;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.ae.ao */
/* compiled from: PG */
public final /* synthetic */ class C93729ao implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C93731aq f261575a;

    /* renamed from: b */
    public final /* synthetic */ boolean f261576b;

    /* renamed from: c */
    public final /* synthetic */ ImproveLocationRequest.ImproveLocationDialogMetrics f261577c;

    public /* synthetic */ C93729ao(C93731aq aqVar, boolean z, ImproveLocationRequest.ImproveLocationDialogMetrics improveLocationDialogMetrics) {
        this.f261575a = aqVar;
        this.f261576b = z;
        this.f261577c = improveLocationDialogMetrics;
    }

    public final void run() {
        long j;
        C93731aq aqVar = this.f261575a;
        boolean z = this.f261576b;
        ImproveLocationRequest.ImproveLocationDialogMetrics improveLocationDialogMetrics = this.f261577c;
        aqVar.mo88164a().edit().putLong("last_prompt_display_time_millis", aqVar.f261584d.mo26870b()).putBoolean("last_prompt_was_accepted", z).apply();
        if (z) {
            aqVar.mo88164a().edit().remove("backoff_period_millis").apply();
        } else {
            SharedPreferences a = aqVar.mo88164a();
            SharedPreferences.Editor edit = a.edit();
            long j2 = a.getLong("backoff_period_millis", 0);
            if (j2 != 0) {
                j = Math.min(j2 + j2, C93731aq.f261582b);
            } else {
                j = C93731aq.f261583c;
            }
            if (true != improveLocationDialogMetrics.mo71001i()) {
                j2 = j;
            }
            edit.putLong("backoff_period_millis", j2);
            edit.apply();
        }
        long a2 = improveLocationDialogMetrics.mo70992a();
        if (a2 == 0) {
            ((C59052c) ((C59052c) C93731aq.f261581a.mo56226d()).mo56372aa(19049)).mo56386p("No client ID associated to resolved ImproveLocationDialogMetrics.");
            int i = C90755l.f253831a;
            a2 = 0;
        }
        aqVar.f261585e.mo28212l("ImproveLocationManager.resolvePendingLocationPrompt", new C93730ap(aqVar, a2, z));
        Long f = improveLocationDialogMetrics.mo70998f();
        long c = improveLocationDialogMetrics.mo70994c();
        long b = improveLocationDialogMetrics.mo70993b();
        long c2 = aqVar.f261584d.mo26871c();
        boolean j3 = improveLocationDialogMetrics.mo71002j();
        C60584vh vhVar = (C60584vh) C60585vi.f164348h.createBuilder();
        vhVar.copyOnWrite();
        C60585vi viVar = (C60585vi) vhVar.instance;
        viVar.f164350a |= 16;
        viVar.f164355f = z;
        long longValue = f != null ? c - f.longValue() : 0;
        vhVar.copyOnWrite();
        C60585vi viVar2 = (C60585vi) vhVar.instance;
        viVar2.f164350a |= 1;
        viVar2.f164351b = longValue;
        vhVar.copyOnWrite();
        C60585vi viVar3 = (C60585vi) vhVar.instance;
        viVar3.f164350a |= 2;
        viVar3.f164352c = 0;
        vhVar.copyOnWrite();
        C60585vi viVar4 = (C60585vi) vhVar.instance;
        viVar4.f164350a |= 4;
        viVar4.f164353d = b - c;
        vhVar.copyOnWrite();
        C60585vi viVar5 = (C60585vi) vhVar.instance;
        viVar5.f164350a |= 8;
        viVar5.f164354e = c2 - b;
        vhVar.copyOnWrite();
        C60585vi viVar6 = (C60585vi) vhVar.instance;
        viVar6.f164350a |= 32;
        viVar6.f164356g = j3;
        C60585vi viVar7 = (C60585vi) vhVar.build();
        String h = improveLocationDialogMetrics.mo71000h();
        C60578vb vbVar = (C60578vb) C60583vg.f164342e.createBuilder();
        int k = improveLocationDialogMetrics.mo71003k();
        vbVar.copyOnWrite();
        C60583vg vgVar = (C60583vg) vbVar.instance;
        int i2 = k - 1;
        if (k != 0) {
            vgVar.f164347d = i2;
            vgVar.f164344a |= 4;
            C60580vd e = improveLocationDialogMetrics.mo70997e();
            vbVar.copyOnWrite();
            C60583vg vgVar2 = (C60583vg) vbVar.instance;
            vgVar2.f164345b = e.f164340m;
            vgVar2.f164344a |= 1;
            vbVar.copyOnWrite();
            C60583vg vgVar3 = (C60583vg) vbVar.instance;
            viVar7.getClass();
            vgVar3.f164346c = viVar7;
            vgVar3.f164344a |= 2;
            C60583vg vgVar4 = (C60583vg) vbVar.build();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 636;
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            vgVar4.getClass();
            ufVar2.f164108aO = vgVar4;
            ufVar2.f164251f |= 8;
            if (h != null) {
                tzVar.copyOnWrite();
                C60555uf ufVar3 = (C60555uf) tzVar.instance;
                ufVar3.f164093a |= 4;
                ufVar3.f164259n = h;
            }
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            return;
        }
        throw null;
    }
}
