package com.google.android.libraries.search.video.p3196f;

import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.search.video.p3191a.C41454m;
import com.google.android.libraries.search.video.players.C41591v;
import com.google.android.libraries.search.video.players.C41592w;
import com.google.apps.tiktok.media.C47449e;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.video.f.n */
/* compiled from: PG */
public final class C41520n implements C41591v {

    /* renamed from: a */
    public static final C59071e f108503a = C59071e.m91332i("com.google.android.libraries.search.video.f.n");

    /* renamed from: b */
    public static final Character f108504b = 183;

    /* renamed from: c */
    public final Fragment f108505c;

    /* renamed from: d */
    public final C47449e f108506d;

    /* renamed from: e */
    public final C41512f f108507e;

    /* renamed from: f */
    public View f108508f;

    /* renamed from: g */
    public C41511e f108509g;

    /* renamed from: h */
    public ViewGroup f108510h;

    /* renamed from: i */
    public ViewGroup f108511i;

    /* renamed from: j */
    public C41592w f108512j;

    /* renamed from: k */
    public TextView f108513k;

    /* renamed from: l */
    public TextView f108514l;

    /* renamed from: m */
    public ImageView f108515m;

    /* renamed from: n */
    public LinearLayout f108516n;

    /* renamed from: o */
    public TextView f108517o;

    /* renamed from: p */
    public ViewGroup f108518p;

    /* renamed from: q */
    private final C41454m f108519q;

    public C41520n(Fragment fragment, C41454m mVar, C47449e eVar, C41512f fVar) {
        this.f108505c = fragment;
        this.f108519q = mVar;
        this.f108506d = eVar;
        this.f108507e = fVar;
    }

    /* renamed from: a */
    public final void mo42106a(C41592w wVar, int i, int i2) {
        if (i != i2) {
            mo44046b(i);
            C41511e eVar = this.f108509g;
            if (eVar != null) {
                eVar.mo44038d(i);
            }
        }
    }

    /* renamed from: b */
    public final void mo44046b(int i) {
        if (!this.f108519q.mo43985d()) {
            ViewGroup viewGroup = this.f108510h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                return;
            }
            return;
        }
        int i2 = i - 1;
        if (i != 0) {
            switch (i2) {
                case 1:
                    View view = this.f108508f;
                    if (view != null) {
                        view.setVisibility(0);
                        return;
                    }
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    ViewGroup viewGroup2 = this.f108510h;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                    }
                    View view2 = this.f108508f;
                    if (view2 != null) {
                        view2.setVisibility(8);
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            throw null;
        }
    }
}
