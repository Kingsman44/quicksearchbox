package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.gsa.nga.engine.aw.e;
import com.google.android.apps.gsa.nga.engine.p5972aw.C75170o;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6044n.C76467g;
import com.google.android.apps.gsa.nga.engine.p6044n.p6054f.C76455a;
import com.google.android.apps.gsa.nga.engine.p6056o.C76536ad;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6260x.C79853ak;
import com.google.android.apps.gsa.nga.shared.android.C80955k;
import com.google.android.apps.gsa.nga.shared.android.C80958n;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80081a;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80281ac;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.bd */
/* compiled from: PG */
public final class C76374bd extends C76467g {

    /* renamed from: a */
    public static final C58974d f211497a = C58974d.m91136j();

    /* renamed from: b */
    public final C76455a f211498b;

    /* renamed from: c */
    public final C76536ad f211499c;

    /* renamed from: d */
    public final C22871g f211500d;

    /* renamed from: e */
    private final Context f211501e;

    /* renamed from: f */
    private final C80958n f211502f;

    /* renamed from: g */
    private final C79853ak f211503g;

    /* renamed from: h */
    private final C91142g f211504h;

    /* renamed from: i */
    private final C75170o f211505i;

    /* renamed from: j */
    private final e f211506j;

    /* renamed from: k */
    private final C76092h f211507k;

    public C76374bd(C76455a aVar, Context context, C91142g gVar, C79853ak akVar, C76536ad adVar, C75170o oVar, e eVar, C22871g gVar2, C76092h hVar, C79359i iVar) {
        super(iVar);
        this.f211501e = context;
        this.f211498b = aVar;
        this.f211503g = akVar;
        this.f211504h = gVar;
        this.f211505i = oVar;
        this.f211499c = adVar;
        this.f211506j = eVar;
        this.f211500d = gVar2;
        this.f211507k = hVar;
        this.f211502f = new C80958n(C76366aw.f211485a, gVar, C90126fx.f251116cj);
    }

    /* renamed from: a */
    public final Intent mo71200a() {
        return C80955k.m128812b(this, C76373bc.f211496a).setAction("com.google.android.apps.googlequicksearchbox.nga.action.REPORT_FEEDBACK").setPackage(this.f211501e.getPackageName());
    }

    /* renamed from: b */
    public final void mo72179b(C80281ac acVar) {
        C80081a aVar = (C80081a) C80112b.f219825d.createBuilder();
        String str = acVar.f220300a;
        aVar.copyOnWrite();
        C80112b bVar = (C80112b) aVar.instance;
        str.getClass();
        bVar.f219827a |= 1;
        bVar.f219828b = str;
        String g = this.f211503g.mo74222g();
        aVar.copyOnWrite();
        C80112b bVar2 = (C80112b) aVar.instance;
        g.getClass();
        bVar2.f219827a |= 512;
        bVar2.f219829c = g;
        C80112b bVar3 = (C80112b) aVar.build();
        C58480gp e = C58485gu.m89837e();
        if (this.f211504h.mo85405j(C90126fx.f251519kO)) {
            e.mo55396h(this.f211506j.a());
        }
        new C90873ag(this.f211500d.mo28210j(this.f211505i.mo71519b(), "[NGA] take shared answer card screenshot", new C76365av(this)), this.f211500d, "[NGA] FeedbackExecution.takeScreenshot", new C76369az(this, e, bVar3)).mo85223a(new C76371ba(this, bVar3, e));
    }

    /* renamed from: gC */
    public final boolean mo71201gC() {
        return this.f211507k.mo72021b().mo72041f();
    }

    /* renamed from: h */
    public final C60870cx mo71202h() {
        this.f211501e.registerReceiver(this.f211502f, new IntentFilter("com.google.android.apps.googlequicksearchbox.nga.action.REPORT_FEEDBACK"));
        return C118826c.f331423b;
    }

    /* renamed from: i */
    public final C60870cx mo71203i() {
        this.f211501e.unregisterReceiver(this.f211502f);
        return C118826c.f331423b;
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "FeedbackExecution";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 18;
    }
}
