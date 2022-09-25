package com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.gsa.shared.monet.C90165af;
import com.google.android.apps.gsa.shared.monet.p7070b.p7091j.C90246a;
import com.google.android.apps.gsa.shared.monet.p7112d.C90314b;
import com.google.android.apps.gsa.shared.monet.p7113e.C90320d;
import com.google.android.apps.gsa.shared.monet.p7114f.C90326d;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.p8151c.C105442l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.renderers.cf */
/* compiled from: PG */
public final class C105532cf extends C105488ap {

    /* renamed from: t */
    private FrameLayout f294419t;

    /* renamed from: u */
    private boolean f294420u;

    public C105532cf(C22945j jVar, C105442l lVar, Context context, C90326d dVar, C90320d dVar2, C90314b bVar, C91142g gVar, C90165af afVar) {
        super(jVar, lVar, context, dVar, dVar2, bVar, gVar, afVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo94837e() {
        return R.layout.no_searchbar_minus_one_header;
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        super.mo28299iw();
        FrameLayout frameLayout = (FrameLayout) this.f294242i.findViewById(R.id.action_menu_container);
        frameLayout.getClass();
        this.f294419t = frameLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo94842l(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        super.mo94842l(z);
        int i7 = 0;
        this.f294420u = z && !((Boolean) ((C23249a) ((C105442l) this.f294234a).mo94608d()).mo28725a()).booleanValue();
        super.mo94839h();
        if (this.f294420u) {
            this.f294240g.setVisibility(8);
        }
        int i8 = -2;
        if (this.f294420u) {
            C90246a aVar = this.f294248o;
            aVar.getClass();
            i = aVar.mo83953a();
        } else {
            i = -2;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        if (this.f294250q && this.f294420u) {
            layoutParams.topMargin = this.f294235b.getResources().getDimensionPixelSize(R.dimen.no_searchbar_logo_top_margin);
        }
        this.f294238e.setLayoutParams(layoutParams);
        ImageView imageView = this.f294239f;
        if (this.f294420u) {
            C90246a aVar2 = this.f294248o;
            aVar2.getClass();
            imageView.setColorFilter(aVar2.mo83954b());
        } else {
            imageView.clearColorFilter();
        }
        View view = this.f294241h;
        if (view != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.f294250q && !this.f294420u) {
                i6 = this.f294235b.getResources().getDimensionPixelSize(R.dimen.no_searchbar_particle_disc_small_margin);
            } else if (this.f294420u) {
                i6 = this.f294235b.getResources().getDimensionPixelSize(R.dimen.no_searchbar_logo_top_margin);
            } else {
                i6 = this.f294235b.getResources().getDimensionPixelSize(R.dimen.no_searchbar_icons_top_margin);
            }
            layoutParams2.topMargin = i6;
            view.setLayoutParams(layoutParams2);
        }
        Resources resources = this.f294235b.getResources();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f294419t.getLayoutParams();
        if (this.f294420u) {
            C90246a aVar3 = this.f294248o;
            i8 = aVar3 != null ? aVar3.mo83960h() : 0;
        }
        layoutParams3.height = i8;
        if (z) {
            i2 = 0;
        } else {
            i2 = resources.getDimensionPixelSize(R.dimen.no_searchbar_icons_top_margin);
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = resources.getDimensionPixelSize(R.dimen.no_searchbar_action_menu_icon_short_horizontal_margin);
        }
        C91115n.m148873e(layoutParams3, 0, i2, i3, 0);
        this.f294419t.setLayoutParams(layoutParams3);
        FrameLayout frameLayout = this.f294419t;
        if (this.f294420u) {
            C90246a aVar4 = this.f294248o;
            aVar4.getClass();
            i4 = aVar4.mo83955c();
        } else {
            i4 = 0;
        }
        C91115n.m148874f(frameLayout, 1, i4);
        ViewGroup viewGroup = this.f294243j;
        if (this.f294420u) {
            i5 = 0;
        } else {
            i5 = resources.getDimensionPixelSize(R.dimen.no_searchbar_logo_bottom_margin);
        }
        C91115n.m148874f(viewGroup, 1, i5);
        View view2 = this.f294249p;
        if (view2 != null) {
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) view2.getLayoutParams();
            if (z && !this.f294420u) {
                int dimensionPixelSize = this.f294235b.getResources().getDimensionPixelSize(R.dimen.minus_one_header_action_size);
                C90246a aVar5 = this.f294248o;
                aVar5.getClass();
                i7 = dimensionPixelSize - aVar5.mo83955c();
            }
            layoutParams4.topMargin = i7;
            view2.setLayoutParams(layoutParams4);
        }
        mo94846r();
    }
}
