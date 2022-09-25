package com.google.android.apps.gsa.speech.p7270c;

import android.accounts.Account;
import com.google.android.apps.gsa.assistant.settings.devices.p522c.p524b.C9684l;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.C9855w;
import com.google.android.apps.gsa.assistant.settings.features.p538ad.p539a.C9799ae;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.contacts.cl;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6491a.C84376v;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.speech.c.c */
/* compiled from: PG */
public final class C92220c {

    /* renamed from: a */
    private static final C58974d f257100a = C58974d.m91134h("SpeechContextPolicy");

    /* renamed from: b */
    private final C86124t f257101b;

    /* renamed from: c */
    private final C86054o f257102c;

    /* renamed from: d */
    private final C9684l f257103d;

    /* renamed from: e */
    private final C85664bo f257104e;

    /* renamed from: f */
    private final C68214a f257105f;

    /* renamed from: g */
    private final C84516aa f257106g;

    /* renamed from: h */
    private final C68214a f257107h;

    /* renamed from: i */
    private final C68214a f257108i;

    /* renamed from: j */
    private final C68214a f257109j;

    /* renamed from: k */
    private final C58833ax f257110k;

    public C92220c(C86124t tVar, C86054o oVar, C85664bo boVar, C9684l lVar, C68214a aVar, C84516aa aaVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C58833ax axVar) {
        this.f257101b = tVar;
        this.f257102c = oVar;
        this.f257104e = boVar;
        this.f257103d = lVar;
        this.f257105f = aVar;
        this.f257106g = aaVar;
        this.f257107h = aVar2;
        this.f257108i = aVar3;
        this.f257109j = aVar4;
        this.f257110k = axVar;
    }

    /* renamed from: a */
    public final boolean mo86898a() {
        C60870cx cxVar;
        Account a;
        if (!this.f257101b.mo79746e(C90014bt.f247391gK)) {
            cxVar = C60856cj.m92898g();
        } else if (!this.f257110k.mo56113h()) {
            cxVar = C60856cj.m92898g();
        } else {
            cxVar = ((C9799ae) this.f257110k.mo56107c()).mo18041a();
        }
        if ((!cl.e(this.f257104e) && !this.f257101b.mo79746e(C90014bt.f247635kq)) || (a = this.f257102c.mo79668a()) == null || !this.f257103d.mo17959h(a)) {
            return false;
        }
        boolean isDeviceLocked = this.f257106g.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        if (isDeviceLocked && mo86899b(cxVar)) {
            Query h = ((C87541c) this.f257107h.mo27525b()).mo81646h();
            if (h != null && h.mo84412cs() && C84376v.m134657a(h, this.f257108i) == 5) {
                return true;
            }
            return ((C89994f) this.f257105f.mo27525b()).mo83835A();
        } else if (!((bm) this.f257109j.mo27525b()).u() || !((bm) this.f257109j.mo27525b()).w()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo86899b(C60870cx cxVar) {
        if (!this.f257101b.mo79746e(C90014bt.f247391gK)) {
            return true;
        }
        C91018d.m148680c();
        try {
            return ((C9855w) cxVar.get()).equals(C9855w.STANDBY);
        } catch (InterruptedException | NullPointerException | CancellationException | ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f257100a.mo56226d()).mo56382g(e)).mo56372aa(12247)).mo56386p("AOL Future failed");
            return true;
        }
    }
}
