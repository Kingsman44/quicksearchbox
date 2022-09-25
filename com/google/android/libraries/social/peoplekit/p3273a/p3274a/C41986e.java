package com.google.android.libraries.social.peoplekit.p3273a.p3274a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.analytics.Stopwatch;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42094d;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42095e;
import com.google.android.libraries.social.peoplekit.common.dataservice.C42102l;
import com.google.android.libraries.social.peoplekit.common.dataservice.Channel;
import com.google.android.libraries.social.peoplekit.common.dataservice.CoalescedChannels;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.p3279a.C42070a;
import com.google.android.libraries.social.peoplekit.common.p3281c.C42087a;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42089b;
import com.google.android.libraries.social.peoplekit.common.p3282d.C42090c;
import com.google.android.libraries.social.peoplekit.common.p3283e.C42131a;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.android.libraries.social.peoplekit.configs.C42141b;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfigImpl;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58597ky;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import p5602o.p5607c.p5608a.p5609a.C71909h;
import p5602o.p5607c.p5608a.p5609a.C71910i;
import p5602o.p5607c.p5608a.p5609a.C71912k;
import p5602o.p5607c.p5608a.p5609a.C71913l;
import p5602o.p5607c.p5608a.p5609a.C71919r;
import p5602o.p5607c.p5608a.p5609a.C71920s;

/* renamed from: com.google.android.libraries.social.peoplekit.a.a.e */
/* compiled from: PG */
public final class C41986e implements C42102l, C42090c {

    /* renamed from: a */
    public final View f109625a;

    /* renamed from: b */
    public final RecyclerView f109626b;

    /* renamed from: c */
    public final C42000s f109627c;

    /* renamed from: d */
    public final C42089b f109628d;

    /* renamed from: e */
    public final C42075e f109629e;

    /* renamed from: f */
    public PeopleKitVisualElementPath f109630f;

    /* renamed from: g */
    public boolean f109631g = false;

    /* renamed from: h */
    public List f109632h;

    /* renamed from: i */
    public C42090c f109633i;

    /* renamed from: j */
    public C42141b f109634j;

    /* renamed from: k */
    private final Activity f109635k;

    /* renamed from: l */
    private final PeopleKitDataLayer f109636l;

    /* renamed from: m */
    private final PeopleKitConfig f109637m;

    /* renamed from: n */
    private final AnimatorSet f109638n;

    public C41986e(Activity activity, ExecutorService executorService, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C42075e eVar, PeopleKitConfig peopleKitConfig, PeopleKitVisualElementPath peopleKitVisualElementPath, C42141b bVar) {
        Activity activity2 = activity;
        PeopleKitDataLayer peopleKitDataLayer2 = peopleKitDataLayer;
        C42075e eVar2 = eVar;
        PeopleKitConfig peopleKitConfig2 = peopleKitConfig;
        this.f109635k = activity2;
        this.f109636l = peopleKitDataLayer2;
        this.f109629e = eVar2;
        this.f109637m = peopleKitConfig2;
        C42087a.m73675a(bVar);
        C42141b bVar2 = bVar;
        this.f109634j = bVar2;
        PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144463d));
        peopleKitVisualElementPath2.mo44564a(peopleKitVisualElementPath.f109973a);
        this.f109630f = peopleKitVisualElementPath2;
        eVar2.mo44577c(-1, peopleKitVisualElementPath2);
        C42087a.m73676b(this.f109634j);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.peoplekit_top_suggestions_container, (ViewGroup) null);
        this.f109625a = inflate;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.peoplekit_top_suggestions_recyclerview);
        this.f109626b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(activity2));
        C42089b bVar3 = new C42089b(activity2, this, ((PeopleKitConfigImpl) peopleKitConfig2).f110246m, eVar2);
        this.f109628d = bVar3;
        bVar3.mo44599a(new C41961a(this));
        C42000s sVar = new C42000s(activity2, executorService, peopleKitDataLayer, peopleKitSelectionModel, bVar3, eVar2, peopleKitConfig2, this.f109630f, bVar2);
        this.f109627c = sVar;
        recyclerView.setAdapter(sVar);
        mo44455f();
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.peoplekit_top_suggestions_loading);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < linearLayout.getChildCount(); i++) {
            arrayList.add(linearLayout.getChildAt(i));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        int i2 = 200;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            View view = (View) arrayList.get(i3);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.5f});
            ofFloat.setDuration(300);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "alpha", new float[]{0.5f, 1.0f});
            ofFloat2.setDuration(300);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofFloat2).after(ofFloat);
            animatorSet2.setStartDelay((long) i2);
            i2 += 50;
            animatorSet.play(animatorSet2);
        }
        animatorSet.addListener(new C42070a(animatorSet));
        animatorSet.start();
        this.f109638n = animatorSet;
        peopleKitDataLayer2.mo44662g(this);
    }

    /* renamed from: a */
    public final void mo44450a(String[] strArr) {
        C42090c cVar = this.f109633i;
        if (cVar != null) {
            cVar.mo44450a(strArr);
        } else {
            this.f109635k.requestPermissions(strArr, 1234);
        }
    }

    /* renamed from: b */
    public final boolean mo44451b() {
        C42090c cVar = this.f109633i;
        if (cVar != null) {
            return cVar.mo44451b();
        }
        return this.f109635k.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS");
    }

    /* renamed from: c */
    public final void mo44452c() {
        List list = this.f109632h;
        if (list != null) {
            list.clear();
        }
        Stopwatch a = this.f109629e.mo44575a("ListViewTopSuggestionsTime");
        a.mo44570b();
        a.mo44571c();
        this.f109636l.mo44665j();
    }

    /* renamed from: d */
    public final void mo44453d(List list, C42094d dVar) {
    }

    /* renamed from: e */
    public final void mo44454e() {
        this.f109638n.cancel();
        this.f109625a.findViewById(R.id.peoplekit_top_suggestions_loading).setVisibility(8);
        this.f109625a.findViewById(R.id.peoplekit_top_suggestions_recyclerview).setVisibility(0);
    }

    /* renamed from: f */
    public final void mo44455f() {
        int i = this.f109634j.f110282a;
        if (i != 0) {
            this.f109625a.setBackgroundColor(C1878d.m5128a(this.f109635k, i));
        }
        if (this.f109634j.f110286e != 0) {
            ((TextView) this.f109625a.findViewById(R.id.peoplekit_listview_main_header)).setTextColor(C1878d.m5128a(this.f109635k, this.f109634j.f110286e));
        }
    }

    /* renamed from: g */
    public final void mo44456g(List list, C42094d dVar) {
        List list2 = this.f109632h;
        if (list2 == null || dVar.f110050a == 0) {
            this.f109632h = new ArrayList(list);
        } else {
            list2.addAll(list);
        }
        if (dVar.f110051b) {
            if (this.f109631g) {
                List<CoalescedChannels> list3 = this.f109632h;
                ArrayList arrayList = new ArrayList();
                for (CoalescedChannels coalescedChannels : list3) {
                    if (coalescedChannels.mo44646a() != 1) {
                        arrayList.add(coalescedChannels);
                    }
                }
                this.f109632h = arrayList;
            }
            if (C42131a.m73927j()) {
                this.f109632h = C58597ky.m90211b(C58557jl.m90124e(this.f109632h, C42095e.f110054a));
            }
            int i = 0;
            if (this.f109632h.size() > 8) {
                this.f109632h = this.f109632h.subList(0, 8);
            }
            Stopwatch stopwatch = new Stopwatch();
            stopwatch.mo44571c();
            C42000s sVar = this.f109627c;
            sVar.f109672g = this.f109632h;
            sVar.mObservable.mo2879a();
            if (!C42089b.m73679c(this.f109635k) || !((PeopleKitConfigImpl) this.f109637m).f110246m) {
                mo44454e();
            } else {
                Stopwatch a = this.f109629e.mo44575a("ListViewDeviceSuggestionsTime");
                a.mo44570b();
                a.mo44571c();
                this.f109636l.mo44664i();
            }
            for (CoalescedChannels c : this.f109632h) {
                for (Channel C : c.mo44648c()) {
                    if (C.mo44611C()) {
                        i++;
                    }
                }
            }
            if (!this.f109632h.isEmpty()) {
                C42075e eVar = this.f109629e;
                PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144455R));
                peopleKitVisualElementPath.mo44564a(this.f109630f.f109973a);
                eVar.mo44577c(-1, peopleKitVisualElementPath);
                C42075e eVar2 = this.f109629e;
                PeopleKitVisualElementPath peopleKitVisualElementPath2 = new PeopleKitVisualElementPath();
                peopleKitVisualElementPath2.f109973a.mo44369a(new C41952a(C54941a.f144458U));
                peopleKitVisualElementPath2.mo44564a(this.f109630f.f109973a);
                eVar2.mo44577c(-1, peopleKitVisualElementPath2);
            }
            C42075e eVar3 = this.f109629e;
            C71912k kVar = (C71912k) C71913l.f191523f.createBuilder();
            kVar.copyOnWrite();
            C71913l lVar = (C71913l) kVar.instance;
            lVar.f191526b = 3;
            lVar.f191525a |= 1;
            C71909h hVar = (C71909h) C71910i.f191517d.createBuilder();
            hVar.copyOnWrite();
            C71910i iVar = (C71910i) hVar.instance;
            iVar.f191520b = 2;
            iVar.f191519a |= 1;
            hVar.copyOnWrite();
            C71910i iVar2 = (C71910i) hVar.instance;
            iVar2.f191519a |= 2;
            iVar2.f191521c = (long) i;
            kVar.copyOnWrite();
            C71913l lVar2 = (C71913l) kVar.instance;
            C71910i iVar3 = (C71910i) hVar.build();
            iVar3.getClass();
            lVar2.f191528d = iVar3;
            lVar2.f191525a |= 4;
            C71919r rVar = (C71919r) C71920s.f191539e.createBuilder();
            int f = this.f109629e.mo44580f();
            rVar.copyOnWrite();
            C71920s sVar2 = (C71920s) rVar.instance;
            int i2 = f - 1;
            if (f != 0) {
                sVar2.f191542b = i2;
                sVar2.f191541a |= 1;
                rVar.copyOnWrite();
                C71920s sVar3 = (C71920s) rVar.instance;
                sVar3.f191543c = 1;
                sVar3.f191541a |= 2;
                kVar.copyOnWrite();
                C71913l lVar3 = (C71913l) kVar.instance;
                C71920s sVar4 = (C71920s) rVar.build();
                sVar4.getClass();
                lVar3.f191527c = sVar4;
                lVar3.f191525a |= 2;
                eVar3.mo44576b((C71913l) kVar.build());
                this.f109626b.post(new C41984c(this, stopwatch, dVar));
                return;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public final void mo44457s(List list) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.mo44571c();
        this.f109635k.runOnUiThread(new C41983b(this, list, stopwatch));
    }
}
