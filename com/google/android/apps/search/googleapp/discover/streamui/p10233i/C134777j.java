package com.google.android.apps.search.googleapp.discover.streamui.p10233i;

import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47231d;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.i.j */
/* compiled from: PG */
public final class C134777j {

    /* renamed from: a */
    public final Fragment f366971a;

    /* renamed from: b */
    public final AccountId f366972b;

    /* renamed from: c */
    public final View f366973c;

    /* renamed from: d */
    private final ViewGroup f366974d;

    public C134777j(Fragment fragment, AccountId accountId, ViewGroup viewGroup) {
        this.f366971a = fragment;
        this.f366972b = accountId;
        this.f366974d = viewGroup;
        View inflate = LayoutInflater.from(fragment.getContext()).inflate(R.layout.googleapp_discover_toolbar, viewGroup, false);
        C69664n.m101060f(inflate, "from(fragment.getContext…* attachToRoot= */ false)");
        this.f366973c = inflate;
    }

    /* renamed from: a */
    public final C134776i mo112000a() {
        Fragment b = this.f366971a.getChildFragmentManager().f634a.mo670b(R.id.googleapp_discover_toolbar);
        C134770c cVar = null;
        C47231d dVar = b instanceof C47231d ? (C47231d) b : null;
        Object z = dVar != null ? dVar.mo17754z() : null;
        if (z instanceof C134770c) {
            cVar = (C134770c) z;
        }
        return cVar != null ? new C134774g(cVar.f366963a) : C134775h.f366970a;
    }

    /* renamed from: b */
    public final void mo112001b() {
        if (!C134775h.f366970a.equals(mo112000a())) {
            FragmentManager childFragmentManager = this.f366971a.getChildFragmentManager();
            C69664n.m101060f(childFragmentManager, "fragment.getChildFragmentManager()");
            Fragment b = childFragmentManager.f634a.mo670b(R.id.googleapp_discover_toolbar);
            if (b != null) {
                C0154a aVar = new C0154a(childFragmentManager);
                aVar.mo516m(b);
                aVar.mo509f();
            }
            this.f366973c.setVisibility(8);
        }
    }
}
