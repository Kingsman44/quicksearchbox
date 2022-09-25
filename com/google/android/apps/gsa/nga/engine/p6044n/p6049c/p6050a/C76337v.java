package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.am.d.g;
import com.google.android.apps.gsa.nga.engine.am.s.q;
import com.google.android.apps.gsa.nga.engine.p5913am.p5937r.C74951b;
import com.google.android.apps.gsa.nga.engine.p6044n.C76342d;
import com.google.android.apps.gsa.nga.engine.p6044n.p6049c.C76288a;
import com.google.android.apps.gsa.nga.engine.p6144ui.C78018a;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78038ak;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78070i;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78071j;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6145a.p6146a.C78024f;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80301aw;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80302ax;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C89988b;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import dagger.C68214a;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.v */
/* compiled from: PG */
public final class C76337v implements C76288a {

    /* renamed from: a */
    public static final C58974d f211419a = C58974d.m91136j();

    /* renamed from: b */
    public final q f211420b;

    /* renamed from: c */
    public final C81515c f211421c;

    /* renamed from: d */
    private final C78018a f211422d;

    /* renamed from: e */
    private final C91142g f211423e;

    /* renamed from: f */
    private final g f211424f;

    /* renamed from: g */
    private final C83334w f211425g;

    /* renamed from: h */
    private final C74951b f211426h;

    /* renamed from: i */
    private final C68214a f211427i;

    public C76337v(C78018a aVar, C91142g gVar, q qVar, g gVar2, C83334w wVar, C74951b bVar, C68214a aVar2, C81515c cVar) {
        this.f211422d = aVar;
        this.f211423e = gVar;
        this.f211420b = qVar;
        this.f211424f = gVar2;
        this.f211425g = wVar;
        this.f211426h = bVar;
        this.f211427i = aVar2;
        this.f211421c = cVar;
    }

    /* renamed from: c */
    private final C60870cx m122956c(C65475b bVar, boolean z) {
        C83334w wVar = this.f211425g;
        C82887ec ecVar = C82887ec.EXECUTION_FAILED;
        C82885ea eaVar = C82885ea.f225977c;
        C83320io ioVar = bVar.f177980a;
        if (ioVar == null) {
            ioVar = C83320io.f227132d;
        }
        wVar.mo75545c(ecVar, eaVar, ioVar);
        if (z) {
            return ((C76342d) this.f211427i.mo27525b()).mo72169b(this.f211424f.c(true), bVar.f177981b);
        }
        Locale forLanguageTag = Locale.forLanguageTag(bVar.f177982c);
        this.f211422d.mo72966e(this.f211421c.mo75121a(forLanguageTag).getString(R.string.nga_executors_reply_to_notification_failed_to_reply, new Object[0]));
        return C118826c.f331423b;
    }

    /* renamed from: a */
    public final C60870cx mo72159a(C80295aq aqVar, C65475b bVar) {
        C80302ax axVar;
        boolean contains = C89988b.m146551d(this.f211423e.mo85403h(C90126fx.f251139dF)).contains("ReplyNotification");
        if (aqVar.f220359a == 5) {
            axVar = (C80302ax) aqVar.f220360b;
        } else {
            axVar = C80302ax.f220374c;
        }
        C74951b bVar2 = this.f211426h;
        C80301aw awVar = axVar.f220377b;
        if (awVar == null) {
            awVar = C80301aw.f220371b;
        }
        Optional b = bVar2.mo71319b(awVar);
        if (b.isEmpty()) {
            ((C58970a) ((C58970a) f211419a.mo56225c()).mo56372aa(3516)).mo56386p("Execution failed - invalid notification key");
            return m122956c(bVar, contains);
        }
        StatusBarNotification statusBarNotification = (StatusBarNotification) b.get();
        if (!((Boolean) this.f211420b.c(statusBarNotification).map(new C76335t(this, axVar.f220376a)).orElseGet(C76336u.f211418a)).booleanValue()) {
            return m122956c(bVar, contains);
        }
        if (contains) {
            return ((C76342d) this.f211427i.mo27525b()).mo72169b(this.f211424f.d(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, statusBarNotification.getPackageName(), axVar.f220376a), bVar.f177981b);
        }
        Locale forLanguageTag = Locale.forLanguageTag(bVar.f177982c);
        C78018a aVar = this.f211422d;
        String str = axVar.f220376a;
        C78024f fVar = new C78024f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("notification", statusBarNotification);
        bundle.putString("message", str);
        bundle.putBoolean("successful", true);
        bundle.putSerializable("locale", forLanguageTag);
        fVar.setArguments(bundle);
        C78070i d = C78071j.m125368d();
        C78038ak akVar = (C78038ak) d;
        akVar.f214960e = fVar;
        akVar.f214959d = (String) q.b(statusBarNotification.getNotification()).map(new C76333r(this, forLanguageTag, str)).orElseGet(new C76334s(this, forLanguageTag, str));
        aVar.mo72967f(d.mo73005a());
        return C118826c.f331423b;
    }

    /* renamed from: b */
    public final int mo72160b() {
        return 60005;
    }
}
