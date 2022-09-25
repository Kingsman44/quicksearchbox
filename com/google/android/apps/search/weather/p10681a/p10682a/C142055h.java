package com.google.android.apps.search.weather.p10681a.p10682a;

import android.content.Context;
import com.google.android.apps.gsa.h.b.b;
import com.google.android.apps.search.weather.p10688g.C142092a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.features.C30631n;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30463d;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.monitoring.feedback.C47477n;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.weather.a.a.h */
/* compiled from: PG */
public final class C142055h {

    /* renamed from: a */
    public static final C59071e f385417a = C59071e.m91332i("com.google.android.apps.search.weather.a.a.h");

    /* renamed from: b */
    public final Context f385418b;

    /* renamed from: c */
    public final C46175b f385419c;

    /* renamed from: d */
    public final C46801dp f385420d;

    /* renamed from: e */
    public final b f385421e;

    /* renamed from: f */
    public final C47449e f385422f;

    /* renamed from: g */
    public final C30158c f385423g = new C46355c(C58833ax.m90834k("google"));

    /* renamed from: h */
    public final C142092a f385424h;

    /* renamed from: i */
    public final C28421h f385425i;

    /* renamed from: j */
    public final C47477n f385426j;

    /* renamed from: k */
    public final ScheduledExecutorService f385427k;

    /* renamed from: l */
    public final C47770dh f385428l;

    /* renamed from: m */
    public C30631n f385429m;

    /* renamed from: n */
    public boolean f385430n;

    /* renamed from: com.google.android.apps.search.weather.a.a.h$a */
    /* compiled from: PG */
    public final class C142056a implements C46792di {

        /* renamed from: a */
        public final AccountId f385431a;

        /* renamed from: b */
        private final C30306o f385432b;

        public C142056a(C30306o oVar, AccountId accountId) {
            this.f385432b = oVar;
            this.f385431a = accountId;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C142055h.f385417a.mo56225c()).mo56382g(th)).mo56372aa(42030)).mo56386p("Error while subscribing to account data service");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C142053f.f385415a).collect(C58370cn.f155946a);
            this.f385432b.f81934a.mo35795d(guVar);
            Optional findFirst = Collection.EL.stream(guVar).filter(new C142054g(this)).findFirst();
            if (findFirst.isPresent()) {
                this.f385432b.f81934a.mo35796e((C46108a) findFirst.get());
                return;
            }
            this.f385432b.f81934a.mo35796e((Object) null);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C142055h(Context context, C46175b bVar, C46801dp dpVar, b bVar2, C47449e eVar, C142092a aVar, C28421h hVar, C47477n nVar, C47770dh dhVar, ScheduledExecutorService scheduledExecutorService) {
        this.f385418b = context;
        this.f385419c = bVar;
        this.f385420d = dpVar;
        this.f385421e = bVar2;
        this.f385422f = eVar;
        this.f385426j = nVar;
        this.f385424h = aVar;
        this.f385425i = hVar;
        this.f385428l = dhVar;
        this.f385427k = scheduledExecutorService;
    }

    /* renamed from: a */
    public final void mo116993a(C30631n nVar, boolean z) {
        if (nVar != null) {
            C30931r.m57728a(nVar.mo36323e(), C58833ax.m90834k(C30463d.m56757a(this.f385418b.getString(true != z ? R.string.weather_fahrenheit : R.string.weather_celsius))));
        }
    }
}
