package com.google.android.apps.search.webglide.p10704f;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.search.webglide.defaultviewer.C142206e;
import com.google.android.apps.search.webglide.p10698a.C142166e;
import com.google.android.apps.search.webglide.p10698a.C142169h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.C46459k;

/* renamed from: com.google.android.apps.search.webglide.f.c */
/* compiled from: PG */
public final class C142225c {

    /* renamed from: a */
    public final String f385832a;

    /* renamed from: b */
    public final View f385833b;

    /* renamed from: c */
    public final View f385834c;

    /* renamed from: d */
    public final View.OnClickListener f385835d;

    /* renamed from: e */
    public final View f385836e;

    /* renamed from: f */
    public boolean f385837f;

    /* renamed from: g */
    private final int f385838g;

    /* renamed from: h */
    private final C142206e f385839h;

    public C142225c() {
        this.f385832a = null;
        this.f385833b = null;
        this.f385834c = null;
        this.f385839h = null;
        this.f385838g = -1;
        this.f385835d = null;
        this.f385836e = null;
    }

    /* renamed from: a */
    public final void mo117063a() {
        this.f385837f = false;
        View view = this.f385836e;
        if (view != null) {
            view.setVisibility(8);
        }
        C142206e eVar = this.f385839h;
        if (eVar != null) {
            C142169h hVar = eVar.f385785a.f385807n;
            C46459k.m82829b(hVar.f385673c.mo46039a(new C142166e(), hVar.f385672b), "Failed to store key for tutorial: %s", "bottomNavNextButton");
        }
    }

    public C142225c(C142224b bVar) {
        View view = bVar.f385828b;
        this.f385833b = view;
        this.f385834c = bVar.f385829c;
        this.f385832a = bVar.f385827a;
        this.f385835d = new C142223a(this);
        this.f385839h = bVar.f385831e;
        int i = bVar.f385830d;
        this.f385838g = i;
        view.getClass();
        View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.webglide_tutorial_bottom_indicator, (ViewGroup) view, false);
        this.f385836e = inflate;
        inflate.setId(i);
    }
}
