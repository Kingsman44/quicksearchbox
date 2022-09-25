package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.assistant.p3861at.C50160mu;
import com.google.assistant.p3861at.C50161mv;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.w */
/* compiled from: PG */
final class C96437w extends C84036z {

    /* renamed from: a */
    final /* synthetic */ String f269786a;

    /* renamed from: b */
    final /* synthetic */ Account f269787b;

    /* renamed from: c */
    final /* synthetic */ C96439y f269788c;

    public C96437w(C96439y yVar, String str, Account account) {
        this.f269788c = yVar;
        this.f269786a = str;
        this.f269787b = account;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        if (!this.f269788c.f269798f) {
            C59104x b = C96439y.f269793a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AccLinkSeq");
            ((C59052c) ((C59052c) b).mo56372aa(16933)).mo56386p("Link not completed");
            return C58485gu.m89846n(C83875ai.f228524a);
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        C50160mu muVar = (C50160mu) C50161mv.f130401c.createBuilder();
        muVar.copyOnWrite();
        ((C50161mv) muVar.instance).f130403a = 3;
        String str = this.f269786a;
        muVar.copyOnWrite();
        str.getClass();
        ((C50161mv) muVar.instance).f130404b = str;
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C50161mv mvVar = (C50161mv) muVar.build();
        mvVar.getClass();
        acx.f128973A = mvVar;
        acx.f128985b |= 2048;
        C60870cx d = ((l) this.f269788c.f269797e.mo27525b()).d(this.f269787b, (acx) acw.build(), 5, TimeUnit.SECONDS, getClass().getSimpleName());
        C84026u uVar = this.f269788c.f269795c;
        C90877ak.m148481o(d, "AccLinkSeq", "provider update success", "provider update failure");
        return C58485gu.m89846n(uVar.mo77487a(d, this.f269788c.f269796d));
    }
}
