package com.google.android.apps.search.podcasts.widgets.p10619a;

import android.content.Context;
import com.google.android.apps.gsa.h.b.b;
import com.google.android.apps.search.podcasts.widgets.feedback.FeedbackHelper;
import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.account.p3616e.p3623f.C46355c;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
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

/* renamed from: com.google.android.apps.search.podcasts.widgets.a.i */
/* compiled from: PG */
public final class C141193i {

    /* renamed from: a */
    public static final C59071e f383320a = C59071e.m91332i("com.google.android.apps.search.podcasts.widgets.a.i");

    /* renamed from: b */
    public final Context f383321b;

    /* renamed from: c */
    public final C46175b f383322c;

    /* renamed from: d */
    public final C46801dp f383323d;

    /* renamed from: e */
    public final b f383324e;

    /* renamed from: f */
    public final C47449e f383325f;

    /* renamed from: g */
    public final C30158c f383326g = new C46355c(C58833ax.m90834k("google"));

    /* renamed from: h */
    public final C28421h f383327h;

    /* renamed from: i */
    public final ScheduledExecutorService f383328i;

    /* renamed from: j */
    public final C47770dh f383329j;

    /* renamed from: k */
    public final C46485f f383330k;

    /* renamed from: l */
    public final FeedbackHelper f383331l;

    /* renamed from: m */
    public final boolean f383332m;

    /* renamed from: com.google.android.apps.search.podcasts.widgets.a.i$a */
    /* compiled from: PG */
    public final class C141194a implements C46792di {

        /* renamed from: a */
        public final AccountId f383333a;

        /* renamed from: b */
        private final C30306o f383334b;

        public C141194a(C30306o oVar, AccountId accountId) {
            this.f383334b = oVar;
            this.f383333a = accountId;
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C141193i.f383320a.mo56225c()).mo56382g(th)).mo56372aa(41657)).mo56386p("Error while subscribing to account data service");
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C58485gu guVar = (C58485gu) Collection.EL.stream((List) obj).filter(C141191g.f383318a).collect(C58370cn.f155946a);
            this.f383334b.f81934a.mo35795d(guVar);
            Optional findFirst = Collection.EL.stream(guVar).filter(new C141192h(this)).findFirst();
            if (findFirst.isPresent()) {
                this.f383334b.f81934a.mo35796e((C46108a) findFirst.get());
                return;
            }
            this.f383334b.f81934a.mo35796e((Object) null);
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    public C141193i(Context context, C46175b bVar, C46801dp dpVar, b bVar2, C47449e eVar, C28421h hVar, ScheduledExecutorService scheduledExecutorService, C47770dh dhVar, C46485f fVar, FeedbackHelper feedbackHelper, boolean z) {
        this.f383321b = context;
        this.f383322c = bVar;
        this.f383323d = dpVar;
        this.f383324e = bVar2;
        this.f383325f = eVar;
        this.f383327h = hVar;
        this.f383328i = scheduledExecutorService;
        this.f383329j = dhVar;
        this.f383330k = fVar;
        this.f383331l = feedbackHelper;
        this.f383332m = z;
    }
}
