package com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8074c;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103413b;
import com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.p8073b.C103416e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.monet.halfshelf.c.j */
/* compiled from: PG */
final class C103427j extends C22939d {

    /* renamed from: a */
    public final C103413b f288277a;

    /* renamed from: b */
    private final C103416e f288278b;

    /* renamed from: c */
    private final Context f288279c;

    public C103427j(C22945j jVar, C103416e eVar, C103413b bVar, Context context) {
        super(jVar);
        this.f288278b = eVar;
        this.f288277a = bVar;
        this.f288279c = context;
    }

    /* renamed from: e */
    static /* synthetic */ void m171362e(View view) {
        int height = view.getHeight();
        float applyDimension = TypedValue.applyDimension(1, (float) view.getHeight(), view.getContext().getResources().getDisplayMetrics());
        view.setTranslationY((float) height);
        view.animate().translationY(0.0f).setDuration((long) (applyDimension / 0.85f)).setInterpolator(new DecelerateInterpolator());
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        View inflate = LayoutInflater.from(this.f288279c).inflate(R.layout.nga_half_shelf_container, (ViewGroup) null, false);
        mo28295iC(inflate);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.nga_half_shelf_feature_container);
        ((C103431n) this.f288278b).f288286a.mo28685c(new C103425h(viewGroup));
        viewGroup.setOnClickListener(new C103423f(this));
        inflate.setOnClickListener(new C103424g(this));
    }
}
