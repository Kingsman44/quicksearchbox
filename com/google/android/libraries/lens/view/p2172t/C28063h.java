package com.google.android.libraries.lens.view.p2172t;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.t.h */
/* compiled from: PG */
public final class C28063h {

    /* renamed from: a */
    public final C28057b f76371a;

    /* renamed from: b */
    public final AnimatorSet f76372b = new AnimatorSet();

    /* renamed from: c */
    public final int f76373c;

    /* renamed from: d */
    public final int f76374d;

    /* renamed from: e */
    public View f76375e;

    /* renamed from: f */
    public View f76376f;

    /* renamed from: g */
    public Point f76377g;

    static {
        C58974d.m91135i("FocusPointFragment");
    }

    public C28063h(C28057b bVar) {
        this.f76371a = bVar;
        Resources resources = bVar.getResources();
        this.f76373c = resources.getDimensionPixelSize(R.dimen.focus_point_animation_stroke_max_width);
        this.f76374d = resources.getDimensionPixelSize(R.dimen.focus_point_animation_fill_max_width);
    }

    /* renamed from: a */
    public static C28057b m52310a(AccountId accountId) {
        C28057b bVar = new C28057b();
        C68324h.m98669f(bVar);
        C47247a.m84047b(bVar, accountId);
        return bVar;
    }

    /* renamed from: b */
    public final void mo33516b(View view, int i) {
        view.setLeft(this.f76377g.x - i);
        view.setRight(this.f76377g.x + i);
        view.setTop(this.f76377g.y - i);
        view.setBottom(this.f76377g.y + i);
    }
}
