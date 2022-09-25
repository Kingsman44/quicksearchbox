package com.google.android.libraries.search.udcdataservice.facs;

import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.android.libraries.search.udcdataservice.C41387c;
import com.google.android.libraries.search.udcdataservice.C41420s;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.p3611a.C46128f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.search.udcdataservice.facs.p */
/* compiled from: PG */
public final class C41406p implements C41396f {

    /* renamed from: a */
    public static final C58495hd f108170a;

    /* renamed from: b */
    public final C68214a f108171b;

    /* renamed from: c */
    public final C60887da f108172c;

    /* renamed from: d */
    public final C46128f f108173d;

    /* renamed from: e */
    public final AccountId f108174e;

    /* renamed from: f */
    public final C39141kp f108175f;

    /* renamed from: g */
    private final C41420s f108176g;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C41387c.AUDIO_HISTORY, C55912b.VOICE_AND_AUDIO_ACTIVITY);
        gzVar.mo55429h(C41387c.DEVICE_APPS, C55912b.DEVICE_APPS);
        gzVar.mo55429h(C41387c.DEVICE_CONTACTS, C55912b.DEVICE_CONTACTS);
        gzVar.mo55429h(C41387c.WEB_HISTORY, C55912b.WEB_AND_APP_ACTIVITY);
        gzVar.mo55429h(C41387c.WEB_AND_APP_HISTORY, C55912b.SUPPLEMENTAL_WEB_AND_APP_ACTIVITY);
        f108170a = gzVar.mo55427f(false);
    }

    public C41406p(C68214a aVar, C46128f fVar, C60887da daVar, AccountId accountId, C39141kp kpVar, C41420s sVar) {
        this.f108171b = aVar;
        this.f108172c = daVar;
        this.f108173d = fVar;
        this.f108174e = accountId;
        this.f108175f = kpVar;
        this.f108176g = sVar;
    }

    /* renamed from: a */
    public final C60870cx mo43942a() {
        C60870cx a = this.f108176g.mo43952a(this.f108174e);
        C41402l lVar = new C41402l(this);
        return C60922j.m93045h(a, C47810es.m84966f(lVar), this.f108172c);
    }
}
