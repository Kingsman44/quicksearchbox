package com.google.android.libraries.lens.view;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.C25898ae;
import com.google.android.libraries.lens.view.flags.ConfigFlagsImpl;
import com.google.android.libraries.lens.view.p2053ad.C24981d;
import com.google.android.libraries.lens.view.p2056af.C25050av;
import com.google.android.libraries.lens.view.p2070an.C25454z;
import com.google.android.libraries.lens.view.p2078at.C25543z;
import com.google.android.libraries.lens.view.p2083aw.p2084a.C25590a;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26742ak;
import com.google.android.libraries.lens.view.p2148l.C27230j;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.p2161r.C27655b;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28463g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.C60697zm;
import com.google.common.p4552o.C60700zp;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.x */
/* compiled from: PG */
public final class C28206x {

    /* renamed from: a */
    public static final C58974d f76778a = C58974d.m91135i("LensView");

    /* renamed from: A */
    public final C58833ax f76779A;

    /* renamed from: B */
    public final C25543z f76780B;

    /* renamed from: C */
    public final C25898ae f76781C;

    /* renamed from: D */
    public final C28138v f76782D;

    /* renamed from: E */
    public final C58833ax f76783E;

    /* renamed from: F */
    public final boolean f76784F;

    /* renamed from: G */
    public final C28463g f76785G;

    /* renamed from: H */
    public final C28310af f76786H;

    /* renamed from: I */
    public final C28443m f76787I;

    /* renamed from: J */
    public final boolean f76788J;

    /* renamed from: K */
    public C26742ak f76789K;

    /* renamed from: L */
    public C25590a f76790L;

    /* renamed from: b */
    public final C27458o f76791b;

    /* renamed from: c */
    public final AccountId f76792c;

    /* renamed from: d */
    public final String f76793d;

    /* renamed from: e */
    public final Bundle f76794e;

    /* renamed from: f */
    public final ConfigFlagsImpl f76795f;

    /* renamed from: g */
    public final C27232l f76796g;

    /* renamed from: h */
    public final C60700zp f76797h;

    /* renamed from: i */
    public final C60697zm f76798i;

    /* renamed from: j */
    public final C28055t f76799j;

    /* renamed from: k */
    public final C25454z f76800k;

    /* renamed from: l */
    public final C68214a f76801l;

    /* renamed from: m */
    public final C68214a f76802m;

    /* renamed from: n */
    public final C25797f f76803n;

    /* renamed from: o */
    public final C68214a f76804o;

    /* renamed from: p */
    public final C28224z f76805p;

    /* renamed from: q */
    public final C24967ab f76806q;

    /* renamed from: r */
    public final C25799b f76807r;

    /* renamed from: s */
    public final C37215b f76808s;

    /* renamed from: t */
    public final C25050av f76809t;

    /* renamed from: u */
    public final Set f76810u;

    /* renamed from: v */
    public final C27655b f76811v;

    /* renamed from: w */
    public final C24981d f76812w;

    /* renamed from: x */
    public final C68214a f76813x;

    /* renamed from: y */
    public final C68214a f76814y;

    /* renamed from: z */
    public final C69464a f76815z;

    public C28206x(C27458o oVar, AccountId accountId, C58833ax axVar, Bundle bundle, C28055t tVar, C27232l lVar, C60700zp zpVar, C60697zm zmVar, C58833ax axVar2, ConfigFlagsImpl configFlagsImpl, C25698c cVar, LensConnectivityManager lensConnectivityManager, C25454z zVar, C68214a aVar, C68214a aVar2, C25797f fVar, C28224z zVar2, C24967ab abVar, Set set, C25799b bVar, C37215b bVar2, C25050av avVar, C25543z zVar3, C27655b bVar3, C68214a aVar3, C24981d dVar, C68214a aVar4, C68214a aVar5, C69464a aVar6, C25898ae aeVar, C28138v vVar, C58833ax axVar3, C28463g gVar, C28310af afVar, boolean z, C28443m mVar, boolean z2) {
        C27458o oVar2 = oVar;
        C25698c cVar2 = cVar;
        C27655b bVar4 = bVar3;
        this.f76791b = oVar2;
        this.f76792c = accountId;
        this.f76793d = (String) axVar.mo56111f();
        this.f76788J = z;
        this.f76794e = bundle;
        this.f76795f = configFlagsImpl;
        this.f76796g = lVar;
        this.f76797h = zpVar;
        this.f76798i = zmVar;
        this.f76799j = tVar;
        this.f76779A = axVar2;
        this.f76803n = fVar;
        this.f76800k = zVar;
        this.f76801l = aVar;
        this.f76802m = aVar2;
        this.f76805p = zVar2;
        this.f76806q = abVar;
        this.f76807r = bVar;
        this.f76808s = bVar2;
        this.f76809t = avVar;
        this.f76810u = set;
        this.f76780B = zVar3;
        this.f76811v = bVar4;
        this.f76804o = aVar3;
        this.f76812w = dVar;
        this.f76813x = aVar4;
        this.f76814y = aVar5;
        this.f76815z = aVar6;
        this.f76781C = aeVar;
        this.f76782D = vVar;
        this.f76783E = axVar3;
        this.f76784F = z2;
        this.f76785G = gVar;
        this.f76786H = afVar;
        this.f76787I = mVar;
        bVar4.mo33143a(cVar2);
        if (cVar2.f69871d) {
            C60870cx a = cVar2.f69869b.mo50962a();
            C60870cx a2 = cVar2.f69870c.mo50962a();
            C46459k.m82829b(C47638k.m84751b(a, a2).mo51522c(new C25673b(cVar2, a, a2), C60826bg.f164896a), "Failed to log server tokens", new Object[0]);
        }
        oVar2.f75121a.mo5790b(lensConnectivityManager);
        ((C58970a) ((C58970a) f76778a.mo56224b()).mo56372aa(48979)).mo56389s("***** DeviceTierType: %s", zmVar.name());
    }

    /* renamed from: a */
    public static C27458o m52761a(AccountId accountId) {
        C27458o oVar = new C27458o();
        C68324h.m98669f(oVar);
        C47247a.m84047b(oVar, accountId);
        return oVar;
    }

    /* renamed from: b */
    public static C27232l m52762b(C27232l lVar, Activity activity, C60700zp zpVar) {
        C27230j e = lVar.mo32697e();
        if (!lVar.mo32701h().mo56113h()) {
            e.mo32679b(activity.getPackageName());
        }
        if (lVar.mo32695b() == 0) {
            e.mo32688k(activity.getResources().getConfiguration().orientation);
        }
        if (!lVar.mo32721z()) {
            boolean z = false;
            if (!(zpVar == C60700zp.AGSA_INTENT || zpVar == C60700zp.DIRECT_INTENT)) {
                z = true;
            }
            e.mo32686i(z);
        }
        return e.mo32678a();
    }

    /* renamed from: c */
    public static ConfigFlagsImpl m52763c(Bundle bundle) {
        ConfigFlagsImpl configFlagsImpl = (ConfigFlagsImpl) bundle.getParcelable("lensView_configFlags");
        configFlagsImpl.getClass();
        return configFlagsImpl;
    }

    /* renamed from: d */
    public static boolean m52764d(Bundle bundle) {
        return bundle.containsKey("lensView_configFlags");
    }
}
