package com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs;

import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2391v;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.search.googleapp.p10117aa.C133103au;
import com.google.android.apps.search.googleapp.p10117aa.C133130o;
import com.google.android.apps.search.googleapp.p10117aa.C133131p;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.apps.search.googleapp.p10335j.C136370a;
import com.google.android.libraries.search.p3025k.C38553h;
import com.google.android.libraries.web.base.C43262m;
import com.google.android.libraries.web.base.C43269t;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.local.C46852f;
import com.google.apps.tiktok.dataservice.local.C46855i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62912at;
import com.google.protobuf.C63077o;

/* compiled from: PG */
public final class TabsFragmentPeer {

    /* renamed from: a */
    public static final C59071e f370252a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.tabs.TabsFragmentPeer");

    /* renamed from: b */
    public final C135948d f370253b;

    /* renamed from: c */
    public final C46401p f370254c;

    /* renamed from: d */
    public final C43269t f370255d;

    /* renamed from: e */
    public final C133103au f370256e;

    /* renamed from: f */
    public final C46855i f370257f;

    /* renamed from: g */
    public final C136370a f370258g;

    /* renamed from: h */
    public final C133118a f370259h;

    /* renamed from: i */
    public final RootFragmentLifecycleObserver f370260i;

    /* renamed from: j */
    public final C46852f f370261j = new C135950f(this);

    /* renamed from: k */
    public String f370262k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public final C38553h f370263l;

    /* renamed from: m */
    private final boolean f370264m;

    public TabsFragmentPeer(C135948d dVar, InstanceStateStoreFactory instanceStateStoreFactory, C43269t tVar, C133103au auVar, C46855i iVar, C136370a aVar, C38553h hVar, boolean z, C133118a aVar2, C43262m mVar) {
        this.f370253b = dVar;
        this.f370254c = instanceStateStoreFactory.mo50325a("is_opened_from_tabs_manager", C63077o.f170228b);
        this.f370255d = tVar;
        this.f370256e = auVar;
        this.f370257f = iVar;
        this.f370258g = aVar;
        this.f370263l = hVar;
        this.f370264m = z;
        this.f370259h = aVar2;
        RootFragmentLifecycleObserver rootFragmentLifecycleObserver = new RootFragmentLifecycleObserver(auVar);
        this.f370260i = rootFragmentLifecycleObserver;
        mVar.mo46332a().getLifecycle().mo5790b(rootFragmentLifecycleObserver);
    }

    /* renamed from: a */
    public final void mo112643a(String str) {
        if (this.f370264m || !this.f370262k.isEmpty()) {
            this.f370260i.f370265a = str;
        }
    }

    /* renamed from: b */
    public final boolean mo112644b() {
        C46370ah a = this.f370254c.mo50378a(C62912at.f169862a);
        return a != null && ((C63077o) a.f121384a).f170230a;
    }

    /* compiled from: PG */
    public final class RootFragmentLifecycleObserver implements C2376g {

        /* renamed from: a */
        public String f370265a;

        /* renamed from: b */
        private final C133103au f370266b;

        public RootFragmentLifecycleObserver(C133103au auVar) {
            this.f370266b = auVar;
        }

        /* renamed from: g */
        public final boolean mo112645g() {
            return this.f370265a != null;
        }

        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            if (mo112645g()) {
                C133103au auVar = this.f370266b;
                String str = this.f370265a;
                str.getClass();
                C60870cx a = auVar.f362876b.mo46039a(new C133130o(str), C60826bg.f164896a);
                auVar.f362879e.mo50787a(a, C133103au.f362875a);
                C46459k.m82829b(C47638k.m84753d(a).mo51521b(new C133131p(auVar, str), C60826bg.f164896a), "Could not remove tab's web history.", new Object[0]);
            }
        }
    }
}
