package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.widget.RemoteViews;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133707a;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.p10154a.C133708b;
import com.google.android.apps.search.googleapp.urlhandler.p10529b.C139787a;
import com.google.android.libraries.p1703d.C20670z;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.p3034a.C38750am;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Iterator;
import java.util.Set;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.q */
/* compiled from: PG */
public final class C133731q {

    /* renamed from: a */
    public final C60888db f364232a;

    /* renamed from: b */
    public final C20670z f364233b;

    /* renamed from: c */
    public final Integer f364234c;

    /* renamed from: d */
    public final int f364235d;

    /* renamed from: e */
    public final C133707a f364236e;

    /* renamed from: f */
    public final C47770dh f364237f;

    /* renamed from: g */
    public final C58485gu f364238g;

    /* renamed from: h */
    public final Context f364239h;

    /* renamed from: i */
    public volatile C133714af f364240i;

    /* renamed from: j */
    public volatile boolean f364241j = false;

    /* renamed from: k */
    public volatile boolean f364242k = true;

    /* renamed from: l */
    public volatile boolean f364243l = false;

    /* renamed from: m */
    public final C133737w f364244m;

    /* renamed from: n */
    public final C133738x f364245n;

    public C133731q(C60888db dbVar, C133708b bVar, C47770dh dhVar, Set set, Context context, C20670z zVar, int i, Integer num, C133737w wVar, C133738x xVar) {
        C133708b bVar2 = bVar;
        C20670z zVar2 = zVar;
        this.f364232a = dbVar;
        this.f364233b = zVar2;
        this.f364235d = i;
        this.f364234c = num;
        this.f364244m = wVar;
        this.f364245n = xVar;
        C21370a aVar = (C21370a) bVar2.f364197a.mo17428b();
        aVar.getClass();
        C89859i iVar = (C89859i) bVar2.f364198b.mo17428b();
        iVar.getClass();
        C38750am amVar = (C38750am) bVar2.f364199c.mo17428b();
        amVar.getClass();
        C139787a aVar2 = (C139787a) bVar2.f364200d.mo17428b();
        aVar2.getClass();
        Boolean bool = (Boolean) bVar2.f364201e.mo17428b();
        bool.getClass();
        this.f364236e = new C133707a(aVar, iVar, amVar, aVar2, bool.booleanValue());
        this.f364237f = dhVar;
        this.f364239h = context;
        C58480gp e = C58485gu.m89837e();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e.mo55395g(((C133733s) it.next()).mo111365a(this));
        }
        this.f364238g = e.mo55394f();
        zVar2.f57940c.f57883a = new C133730p(this);
    }

    /* renamed from: a */
    public final Uri mo111358a() {
        C133712ad adVar = mo111359b().f364211c;
        if (adVar == null) {
            adVar = C133712ad.f364202d;
        }
        return Uri.parse(adVar.f364205b);
    }

    /* renamed from: b */
    public final C133714af mo111359b() {
        C58838bb.m90884s(this.f364241j, "Session has not been prepared yet");
        C133714af afVar = this.f364240i;
        C58893dc.m90996a(afVar);
        return afVar;
    }

    /* renamed from: c */
    public final C60870cx mo111360c() {
        C20670z zVar = this.f364233b;
        Objects.requireNonNull(zVar);
        C133716b bVar = new C133716b(zVar);
        return C60856cj.m92904m(C47810es.m84978r(bVar), this.f364232a);
    }

    /* renamed from: d */
    public final C60870cx mo111361d() {
        C133719e eVar = new C133719e(this);
        return C60856cj.m92904m(C47810es.m84978r(eVar), this.f364232a);
    }

    /* renamed from: e */
    public final C60870cx mo111362e(RemoteViews remoteViews, int[] iArr, PendingIntent pendingIntent) {
        C133718d dVar = new C133718d(this, remoteViews, iArr, pendingIntent);
        return C60856cj.m92904m(C47810es.m84978r(dVar), this.f364232a);
    }

    /* renamed from: f */
    public final void mo111363f(Consumer consumer) {
        C58485gu guVar = this.f364238g;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            consumer.accept((C133734t) guVar.get(i2));
        }
    }

    /* renamed from: g */
    public final void mo111364g(Consumer consumer, Class cls) {
        C58485gu guVar = this.f364238g;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C133734t tVar = (C133734t) guVar.get(i2);
            if (cls.isInstance(tVar)) {
                consumer.accept(cls.cast(tVar));
            }
        }
    }
}
