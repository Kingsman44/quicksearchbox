package com.google.android.libraries.onegoogle.p2380c.p2382b;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30313v;

/* renamed from: com.google.android.libraries.onegoogle.c.b.h */
/* compiled from: PG */
final class C30879h {

    /* renamed from: a */
    public final C30253a f83274a;

    /* renamed from: b */
    public final C30313v f83275b;

    /* renamed from: c */
    private final C30897z f83276c;

    /* renamed from: d */
    private final C30158c f83277d;

    /* renamed from: e */
    private final C30868aa f83278e;

    public C30879h(C30897z zVar, C30868aa aaVar, C30158c cVar, C30253a aVar, C30313v vVar) {
        this.f83276c = zVar;
        this.f83278e = aaVar;
        this.f83277d = cVar;
        this.f83274a = aVar;
        this.f83275b = vVar;
    }

    /* renamed from: a */
    static void m57655a(C30897z zVar, View view) {
        if (view instanceof C30872ae) {
            ((C30872ae) view).mo35630b(zVar);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m57655a(zVar, viewGroup.getChildAt(i));
            }
        }
    }

    /* renamed from: c */
    static void m57656c(C30897z zVar, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m57656c(zVar, viewGroup.getChildAt(i));
            }
        }
        if (view instanceof C30872ae) {
            ((C30872ae) view).mo35632lk(zVar);
        }
    }

    /* renamed from: b */
    public final void mo36570b(View view, int i, Object obj) {
        C30861a b = C30861a.m57616b(this.f83277d, this.f83275b, obj);
        C30861a aVar = (C30861a) view.getTag(R.id.view_bound_account_tag);
        if (!b.equals(aVar)) {
            if (aVar == null) {
                this.f83278e.mo36553a(view, i, b);
                view.setTag(R.id.view_bound_account_tag, b);
            } else if (C2043bi.m5569aw(view)) {
                m57656c(this.f83276c, view);
                this.f83278e.f83250b.mo35825e(view);
                this.f83278e.mo36553a(view, i, b);
                m57655a(this.f83276c, view);
                view.setTag(R.id.view_bound_account_tag, b);
            }
        }
    }
}
