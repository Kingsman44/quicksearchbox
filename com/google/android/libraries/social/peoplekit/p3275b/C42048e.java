package com.google.android.libraries.social.peoplekit.p3275b;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.people.C73435fe;
import com.google.android.gms.phenotype.C145738p;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.social.p3269d.p3270a.C41944s;
import com.google.android.libraries.social.p3269d.p3270a.C41945t;
import com.google.android.libraries.social.p3269d.p3270a.C41948w;
import com.google.android.libraries.social.p3269d.p3270a.C41949x;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResult;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResultImpl;
import com.google.android.libraries.social.peoplekit.autocomplete.viewcontrollers.C42023p;
import com.google.android.libraries.social.peoplekit.common.analytics.C42071a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42096f;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42103m;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42090c;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42132b;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42135e;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42136f;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41979ar;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C41986e;
import com.google.android.libraries.social.peoplekit.p3273a.p3274a.C42000s;
import com.google.android.libraries.social.peoplekit.p3275b.p3276a.C42044i;
import com.google.android.libraries.social.peoplekit.p3277c.p3278a.C42054d;
import com.google.android.libraries.social.populous.core.C42354o;
import com.google.common.p4575r.C60757n;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60895di;
import com.google.common.util.concurrent.C60908dv;
import com.google.common.util.concurrent.C60922j;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import p5602o.p5607c.p5608a.p5609a.C71909h;
import p5602o.p5607c.p5608a.p5609a.C71910i;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.b.e */
/* compiled from: PG */
public final class C42048e {

    /* renamed from: a */
    public final ViewGroup f109874a;

    /* renamed from: b */
    public final Activity f109875b;

    /* renamed from: c */
    public C42044i f109876c;

    /* renamed from: d */
    public PeopleKitSelectionModel f109877d;

    /* renamed from: e */
    public PeopleKitDataLayer f109878e;

    /* renamed from: f */
    public C42075e f109879f;

    /* renamed from: g */
    public final PeopleKitVisualElementPath f109880g;

    /* renamed from: h */
    public boolean f109881h = false;

    /* renamed from: i */
    public final C42050g f109882i;

    /* renamed from: j */
    public final C73435fe f109883j;

    /* renamed from: k */
    private final PeopleKitConfig f109884k;

    public C42048e(C42047d dVar) {
        C42047d dVar2 = dVar;
        ViewGroup viewGroup = dVar2.f109865b;
        viewGroup.getClass();
        PeopleKitConfig peopleKitConfig = dVar2.f109869f;
        peopleKitConfig.getClass();
        dVar2.f109866c.getClass();
        this.f109874a = viewGroup;
        this.f109884k = peopleKitConfig;
        this.f109883j = dVar2.f109873j;
        Activity activity = dVar2.f109864a;
        this.f109875b = activity;
        ExecutorService executorService = dVar2.f109868e;
        C41960a aVar = dVar2.f109870g;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144444G));
        peopleKitVisualElementPath.mo44564a(((PeopleKitConfigImpl) peopleKitConfig).f110237d.f109973a);
        this.f109880g = peopleKitVisualElementPath;
        C42050g gVar = dVar2.f109872i;
        if (gVar != null) {
            this.f109882i = gVar;
        } else {
            C42049f fVar = new C42049f();
            fVar.f109885a = activity;
            this.f109882i = new C42050g(fVar);
        }
        this.f109879f = dVar2.f109866c;
        if (!((PeopleKitConfigImpl) peopleKitConfig).f110257x || !C42131a.m73924g()) {
            this.f109879f.mo44578d();
        }
        this.f109879f.mo44581g(peopleKitConfig, 3);
        this.f109879f.mo44583i();
        C42103m mVar = dVar2.f109867d;
        if (mVar != null && !TextUtils.isEmpty(((PeopleKitConfigImpl) peopleKitConfig).f110234a)) {
            PeopleKitDataLayer a = mVar.mo44691a(activity, executorService, peopleKitConfig, this.f109879f);
            this.f109878e = a;
            a.mo44676u();
            PeopleKitSelectionModel peopleKitSelectionModel = new PeopleKitSelectionModel();
            this.f109877d = peopleKitSelectionModel;
            peopleKitSelectionModel.f110230c = this.f109878e;
            Stopwatch a2 = this.f109879f.mo44575a("TotalInitialize");
            if (!((PeopleKitConfigImpl) peopleKitConfig).f110257x || !a2.f109976c || !C42131a.m73924g()) {
                a2.mo44570b();
                a2.mo44571c();
            }
            Stopwatch a3 = this.f109879f.mo44575a("TimeToSend");
            if (!((PeopleKitConfigImpl) peopleKitConfig).f110257x || !a3.f109976c || !C42131a.m73924g()) {
                a3.mo44570b();
                a3.mo44571c();
            }
            Stopwatch a4 = this.f109879f.mo44575a("TimeToFirstSelection");
            if (!((PeopleKitConfigImpl) peopleKitConfig).f110257x || !a4.f109976c || !C42131a.m73924g()) {
                a4.mo44570b();
                a4.mo44571c();
            }
            if (executorService == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                C60908dv dvVar = new C60908dv();
                dvVar.mo57410b("AutocompleteBackground-%d");
                executorService = C42354o.m74607a(C60757n.m92748i(15), timeUnit, C60908dv.m93015a(dvVar));
            }
            ExecutorService executorService2 = executorService;
            C60887da a5 = C60895di.m92995a(executorService2);
            int i = ((PeopleKitConfigImpl) dVar2.f109869f).f110259z;
            String str = ((PeopleKitConfigImpl) peopleKitConfig).f110234a;
            C42136f q = this.f109878e.mo44672q();
            if (Log.isLoggable("PhenotypeUtil", 3)) {
                Log.d("PhenotypeUtil", "Initializing Phenotype registration at CL " + (q == null ? 0 : 475194430));
            }
            C145748z b = C145738p.m237003b(activity);
            String packageName = activity.getPackageName();
            int i2 = i - 1;
            if (i != 0) {
                String num = Integer.toString(i2);
                String a6 = C42135e.m73931a(packageName, num);
                int i3 = q == null ? 0 : 475194430;
                ArrayList arrayList = new ArrayList();
                arrayList.add("PEOPLE_AUTOCOMPLETE");
                arrayList.add("SENDKIT");
                arrayList.add("SOCIAL_AFFINITY");
                int a7 = C42071a.m73638a(i) - 1;
                if (a7 == 131) {
                    arrayList.add("KEEP_ANDROID_PRIMES");
                } else if (a7 == 135) {
                    arrayList.add("GMAIL_ANDROID");
                    arrayList.add("GMAIL_ANDROID_PRIMES");
                } else if (a7 == 137) {
                    arrayList.add("GMM_PRIMES");
                } else if (a7 == 165) {
                    arrayList.add("PHOTOS");
                    arrayList.add("PHOTOS_ANDROID_PRIMES");
                    arrayList.add("SOCIAL_AFFINITY_PHOTOS");
                }
                Activity activity2 = activity;
                C60922j.m93044g(C43205e.m76192b(b.mo121905e(a6, i3, (String[]) arrayList.toArray(new String[0]), (byte[]) null)), new C42132b(activity2, b, packageName, num, str), a5);
                C42131a.m73918a(activity);
                this.f109876c = new C42044i(activity2, executorService2, this.f109878e, this.f109877d, this.f109879f, peopleKitConfig, new C42035a(this, aVar), ((PeopleKitConfigImpl) peopleKitConfig).f110237d, this.f109882i.f109899g);
                C42090c cVar = dVar2.f109871h;
                if (cVar != null) {
                    C42044i iVar = this.f109876c;
                    iVar.f109852h.f109740q = cVar;
                    iVar.f109851g.f109633i = cVar;
                }
                C41986e eVar = this.f109876c.f109851g;
                C42089b bVar = eVar.f109628d;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = eVar.f109630f;
                if (bVar.mo44602e() && !bVar.mo44601d()) {
                    bVar.mo44600b(peopleKitVisualElementPath2);
                }
                C42044i iVar2 = this.f109876c;
                iVar2.f109851g.f109631g = true;
                C42141b bVar2 = this.f109882i.f109899g;
                C42087a.m73675a(bVar2);
                if (!iVar2.f109858n.equals(bVar2)) {
                    iVar2.f109858n = bVar2;
                    iVar2.mo44527b();
                    C42023p pVar = iVar2.f109852h;
                    C42087a.m73675a(bVar2);
                    if (!pVar.f109741r.equals(bVar2)) {
                        pVar.f109741r = bVar2;
                        C41979ar arVar = pVar.f109731h.f109651b;
                        C42087a.m73675a(bVar2);
                        if (!arVar.f109586k.equals(bVar2)) {
                            arVar.f109586k = bVar2;
                            arVar.mObservable.mo2879a();
                        }
                        pVar.mo44495m();
                    }
                    C41986e eVar2 = iVar2.f109851g;
                    C42087a.m73675a(bVar2);
                    if (!eVar2.f109634j.equals(bVar2)) {
                        eVar2.f109634j = bVar2;
                        C42000s sVar = eVar2.f109627c;
                        C42087a.m73675a(bVar2);
                        if (!sVar.f109676k.equals(bVar2)) {
                            sVar.f109676k = bVar2;
                            sVar.mObservable.mo2879a();
                        }
                        eVar2.mo44455f();
                    }
                    C42054d dVar3 = iVar2.f109853i;
                    if (!dVar3.f109915j.equals(bVar2)) {
                        dVar3.f109915j = bVar2;
                        dVar3.mo44539b();
                    }
                }
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    C42044i iVar3 = this.f109876c;
                    C42000s sVar2 = iVar3.f109851g.f109627c;
                    sVar2.f109675j = true;
                    sVar2.mObservable.mo2879a();
                    C42023p pVar2 = iVar3.f109852h;
                    pVar2.f109742s = true;
                    C41979ar arVar2 = pVar2.f109731h.f109651b;
                    arVar2.f109585j = true;
                    arVar2.mObservable.mo2879a();
                }
                this.f109876c.f109852h.f109731h.f109651b.mObservable.mo2879a();
                if (((PeopleKitConfigImpl) peopleKitConfig).f110254u) {
                    this.f109876c.f109857m = true;
                }
                this.f109876c.f109851g.mo44452c();
                Stopwatch a8 = this.f109879f.mo44575a("InitToBindView");
                a8.mo44570b();
                a8.mo44571c();
                this.f109877d.mo44747d(new C42045b(this, aVar));
                return;
            }
            throw null;
        } else if (Log.isLoggable("PeopleKitMaxView", 3)) {
            Log.d("PeopleKitMaxView", "Must initialize with Data Layer and Account Name");
        }
    }

    /* renamed from: a */
    public final PeopleKitPickerResult mo44530a() {
        List b = this.f109877d.mo44745b(this.f109875b);
        String a = this.f109876c.f109853i.mo44538a();
        C41944s sVar = (C41944s) C41945t.f109486d.createBuilder();
        sVar.mo44386a(b);
        sVar.copyOnWrite();
        C41945t tVar = (C41945t) sVar.instance;
        a.getClass();
        tVar.f109488a |= 1;
        tVar.f109490c = a;
        return new PeopleKitPickerResultImpl(this.f109878e, (C41945t) sVar.build(), this.f109877d.mo44746c());
    }

    /* renamed from: b */
    public final void mo44531b(Channel channel) {
        String str;
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(32);
        String l = channel.mo44631l(this.f109875b);
        if (l == null || !l.equals(channel.mo44630k(this.f109875b))) {
            str = channel.mo44630k(this.f109875b);
        } else {
            str = BuildConfig.FLAVOR;
        }
        obtain.getText().add(this.f109875b.getString(true != this.f109877d.mo44751g(channel) ? R.string.peoplekit_contact_removed_description : R.string.peoplekit_contact_added_description, new Object[]{l, str}));
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f109875b.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            accessibilityManager.sendAccessibilityEvent(obtain);
        }
    }

    /* renamed from: c */
    public final void mo44532c(C41949x xVar) {
        Channel channel;
        if (((PeopleKitConfigImpl) this.f109884k).f110250q) {
            channel = null;
            for (Channel channel2 : this.f109877d.mo44746c()) {
                int a = C41948w.m73464a(xVar.f109496b);
                if (a == 0) {
                    a = 1;
                }
                if (C42096f.m73802g(a) == channel2.mo44621b() && xVar.f109497c.equals(channel2.mo44627h())) {
                    channel = channel2;
                }
            }
        } else {
            channel = this.f109878e.mo44674s(xVar);
        }
        if (channel != null) {
            this.f109877d.mo44749e(channel);
            C42075e eVar = this.f109879f;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            lVar.f191526b = 3;
            lVar.f191525a |= 1;
            C71909h hVar = (C71909h) C71910i.f191517d.createBuilder();
            hVar.copyOnWrite();
            C71910i iVar = (C71910i) hVar.instance;
            iVar.f191520b = 13;
            iVar.f191519a |= 1;
            hVar.copyOnWrite();
            C71910i iVar2 = (C71910i) hVar.instance;
            iVar2.f191519a |= 2;
            iVar2.f191521c = 1;
            kVar.copyOnWrite();
            C71913l lVar2 = (C71913l) kVar.instance;
            C71910i iVar3 = (C71910i) hVar.build();
            iVar3.getClass();
            lVar2.f191528d = iVar3;
            lVar2.f191525a |= 4;
            C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
            int f = this.f109879f.mo44580f();
            rVar.copyOnWrite();
            C71920s sVar = (C71920s) rVar.instance;
            int i = f - 1;
            if (f != 0) {
                sVar.f191542b = i;
                sVar.f191541a |= 1;
                kVar.copyOnWrite();
                C71913l lVar3 = (C71913l) kVar.instance;
                C71920s sVar2 = (C71920s) rVar.build();
                sVar2.getClass();
                lVar3.f191527c = sVar2;
                lVar3.f191525a |= 2;
                eVar.mo44576b((C71913l) kVar.build());
                return;
            }
            throw null;
        }
    }
}
