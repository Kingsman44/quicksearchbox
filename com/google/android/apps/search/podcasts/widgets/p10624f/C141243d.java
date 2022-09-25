package com.google.android.apps.search.podcasts.widgets.p10624f;

import android.content.Intent;
import android.os.Bundle;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.SparseArray;
import androidx.activity.OnBackPressedDispatcher;
import androidx.navigation.fragment.C3884h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47693a;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3711b.C47694b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.f.d */
/* compiled from: PG */
public final class C141243d {

    /* renamed from: a */
    public final C46485f f383453a;

    /* renamed from: b */
    public final C47770dh f383454b;

    /* renamed from: c */
    public final BottomNavigationView f383455c;

    /* renamed from: d */
    public final Fragment f383456d;

    /* renamed from: e */
    public final FragmentManager f383457e;

    /* renamed from: f */
    public final AtomicReference f383458f = new AtomicReference((Object) null);

    /* renamed from: g */
    public final SparseArray f383459g = new SparseArray();

    /* renamed from: h */
    public int f383460h;

    /* renamed from: i */
    private final C47694b f383461i;

    public C141243d(C46485f fVar, C47770dh dhVar, C47694b bVar, BottomNavigationView bottomNavigationView, List list, Fragment fragment, Bundle bundle) {
        C0167am activity;
        Intent intent;
        OnBackPressedDispatcher onBackPressedDispatcher;
        this.f383453a = fVar;
        this.f383454b = dhVar;
        this.f383461i = bVar;
        this.f383455c = bottomNavigationView;
        this.f383456d = fragment;
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        C69664n.m101060f(childFragmentManager, "parentFragment.childFragmentManager");
        this.f383457e = childFragmentManager;
        C58485gu guVar = (C58485gu) list;
        int i = 0;
        C58801sm G = guVar.listIterator(0);
        int i2 = 0;
        while (G.hasNext()) {
            Object next = G.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                C69540x.m100952j();
            }
            int intValue = ((Number) next).intValue();
            String a = C141245f.m229263a(i2);
            C3884h a2 = m229262a(this.f383457e, C141245f.m229263a(i2), intValue);
            int i4 = a2.mo8129a().mo8047g().f12360i;
            this.f383459g.put(i4, a);
            if (i2 == 0) {
                this.f383460h = i4;
            }
            if ((bundle != null ? bundle.getInt("saved_state_selected_tab_id", this.f383455c.f116865b.f116936e) : this.f383455c.f116865b.f116936e) == i4) {
                this.f383458f.set(a2.mo8129a());
                C0154a aVar = new C0154a(this.f383457e);
                aVar.mo687t(a2);
                aVar.mo509f();
            } else {
                C0154a aVar2 = new C0154a(this.f383457e);
                aVar2.mo514k(a2);
                aVar2.mo509f();
            }
            i2 = i3;
        }
        BottomNavigationView bottomNavigationView2 = this.f383455c;
        bottomNavigationView2.f116867d = new C47693a(this.f383461i, bottomNavigationView2, new C141242c(this));
        bottomNavigationView2.f116868e = new C141241b(this);
        C0167am activity2 = this.f383456d.getActivity();
        if (!(activity2 == null || (onBackPressedDispatcher = activity2.f2707h) == null)) {
            onBackPressedDispatcher.mo3339b(this.f383456d, new C141240a(this));
        }
        if (bundle == null && (activity = this.f383456d.getActivity()) != null && (intent = activity.getIntent()) != null) {
            C58801sm G2 = guVar.listIterator(0);
            while (G2.hasNext()) {
                Object next2 = G2.next();
                int i5 = i + 1;
                if (i < 0) {
                    C69540x.m100952j();
                }
                C3884h a3 = m229262a(this.f383457e, C141245f.m229263a(i), ((Number) next2).intValue());
                if (!a3.mo8129a().mo8060t(intent)) {
                    i = i5;
                } else if (this.f383455c.f116865b.f116936e != a3.mo8129a().mo8047g().f12360i) {
                    this.f383455c.mo48182d(a3.mo8129a().mo8047g().f12360i);
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final C3884h m229262a(FragmentManager fragmentManager, String str, int i) {
        C3884h hVar = (C3884h) fragmentManager.f634a.mo671c(str);
        if (hVar != null) {
            return hVar;
        }
        C3884h b = this.f383453a.mo50481b(i, new Bundle());
        C0154a aVar = new C0154a(fragmentManager);
        aVar.mo511h(R.id.podcasts_nav_host_container, b, str, 1);
        aVar.mo509f();
        return b;
    }
}
