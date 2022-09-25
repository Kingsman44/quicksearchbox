package com.google.android.apps.gsa.assistant.settings.features.calls;

import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.assistant.p3861at.C50018hn;
import com.google.assistant.p3861at.C50021hq;
import com.google.assistant.p3861at.C50461xy;
import com.google.assistant.p3861at.C50465yb;
import com.google.assistant.p3861at.C50466yc;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.bf */
/* compiled from: PG */
public final /* synthetic */ class C73018bf implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ bw f193659a;

    /* renamed from: b */
    public final /* synthetic */ C50461xy f193660b;

    public /* synthetic */ C73018bf(bw bwVar, C50461xy xyVar) {
        this.f193659a = bwVar;
        this.f193660b = xyVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        bw bwVar = this.f193659a;
        String str = this.f193660b.f131319c;
        C50465yb ybVar = (C50465yb) C50466yc.f131339f.createBuilder();
        ybVar.copyOnWrite();
        C50466yc ycVar = (C50466yc) ybVar.instance;
        str.getClass();
        ycVar.f131341a |= 2;
        ycVar.f131343c = str;
        C50466yc ycVar2 = (C50466yc) ybVar.build();
        acw acw = (acw) acx.f128971H.createBuilder();
        C50018hn hnVar = (C50018hn) C50021hq.f130044d.createBuilder();
        hnVar.copyOnWrite();
        C50021hq hqVar = (C50021hq) hnVar.instance;
        ycVar2.getClass();
        hqVar.f130047b = ycVar2;
        hqVar.f130046a |= 2;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50021hq hqVar2 = (C50021hq) hnVar.build();
        hqVar2.getClass();
        acx.f129002s = hqVar2;
        acx.f128984a |= C89885b.NOW_VALUE;
        bwVar.mo17814y((acx) acw.build(), new bq(bwVar));
        return true;
    }
}
