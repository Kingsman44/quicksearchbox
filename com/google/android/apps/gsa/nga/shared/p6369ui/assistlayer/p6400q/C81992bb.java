package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6377e.C81572o;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.bb */
/* compiled from: PG */
final class C81992bb implements View.OnAttachStateChangeListener, View.OnLayoutChangeListener {

    /* renamed from: d */
    public static final /* synthetic */ int f224148d = 0;

    /* renamed from: a */
    public final View f224149a;

    /* renamed from: b */
    public final boolean f224150b;

    /* renamed from: c */
    public final int f224151c;

    /* renamed from: e */
    private final C81993bc f224152e;

    /* renamed from: f */
    private final ViewGroup f224153f;

    /* renamed from: g */
    private int f224154g;

    public C81992bb(int i, View view, C81993bc bcVar, boolean z) {
        this.f224150b = z;
        int i2 = 1;
        if (z) {
            this.f224153f = (ViewGroup) view.getParent();
            this.f224154g = view.getVisibility() != 0 ? 2 : i2;
        } else {
            this.f224154g = 1;
            this.f224153f = null;
        }
        this.f224149a = view;
        this.f224152e = bcVar;
        this.f224151c = i;
        C28292j jVar = new C28292j(i);
        jVar.mo33795i(5);
        jVar.mo33794h(this.f224154g);
        C28295m.m52919e(view, jVar);
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = 2;
        int i10 = this.f224149a.getVisibility() == 0 ? 1 : 2;
        if (i10 != this.f224154g) {
            this.f224154g = i10;
            C81993bc bcVar = this.f224152e;
            View view2 = this.f224149a;
            if (i10 == 2) {
                i9 = 3;
            }
            Optional ofNullable = Optional.ofNullable(C28285c.m52881h(i9, C28295m.m52916b(view2), (View) null));
            C81572o oVar = bcVar.f224155a;
            Objects.requireNonNull(oVar);
            ofNullable.ifPresent(new C81989az(oVar));
        }
    }

    public final void onViewAttachedToWindow(View view) {
        ViewGroup viewGroup = this.f224153f;
        if (viewGroup == null) {
            this.f224149a.addOnLayoutChangeListener(this);
        } else {
            viewGroup.addOnLayoutChangeListener(this);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f224153f;
        if (viewGroup == null) {
            this.f224149a.removeOnLayoutChangeListener(this);
        } else {
            viewGroup.removeOnLayoutChangeListener(this);
        }
    }
}
