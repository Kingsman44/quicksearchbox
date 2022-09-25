package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8059d;

import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82486gz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82716pm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82717pn;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.C103032a;
import com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.C103087e;
import com.google.apps.tiktok.contrib.work.C46575i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.d.e */
/* compiled from: PG */
public final class C103103e implements C46575i {

    /* renamed from: a */
    private final C86124t f287746a;

    /* renamed from: b */
    private final C68214a f287747b;

    /* renamed from: c */
    private final C103032a f287748c;

    /* renamed from: d */
    private final C83305i f287749d;

    public C103103e(C86124t tVar, C68214a aVar, C103032a aVar2, C83305i iVar) {
        this.f287746a = tVar;
        this.f287747b = aVar;
        this.f287748c = aVar2;
        this.f287749d = iVar;
    }

    /* renamed from: b */
    public final C60870cx mo21393b(WorkerParameters workerParameters) {
        C83305i iVar = this.f287749d;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "TRIGGERING_WORKER_START_WORK";
        iVar.mo75579d(c.mo76438a());
        if (this.f287748c.mo71923b() != C80201av.PIE_ELIGIBLE) {
            C83305i iVar2 = this.f287749d;
            C82716pm c2 = C82717pn.m132233c();
            ((C82486gz) c2).f225387b = "TRIGGERING_WORKER_PIE_INELIGIBLE_NOT_SETTING_UP_SIGNAL_TRACKING";
            iVar2.mo75579d(c2.mo76438a());
            return C60856cj.m92900i(new C4645z(C4632m.f14549a));
        }
        if (this.f287746a.mo79746e(C90126fx.f251353hH)) {
            C83305i iVar3 = this.f287749d;
            C82716pm c3 = C82717pn.m132233c();
            ((C82486gz) c3).f225387b = "TRIGGERING_WORKER_SETTING_UP_SIGNAL_TRACKING";
            iVar3.mo75579d(c3.mo76438a());
            ((C103087e) this.f287747b.mo27525b()).mo93595b();
        } else {
            C83305i iVar4 = this.f287749d;
            C82716pm c4 = C82717pn.m132233c();
            ((C82486gz) c4).f225387b = "TRIGGERING_WORKER_DISABLED_NOT_SETTING_UP_SIGNAL_TRACKING";
            iVar4.mo75579d(c4.mo76438a());
        }
        return C60856cj.m92900i(new C4645z(C4632m.f14549a));
    }
}
