package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1089a;

import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14132bf;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14145o;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14291du;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15352z;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.a.bf */
/* compiled from: PG */
public final class C15024bf extends C0640fb {

    /* renamed from: a */
    public final C14132bf f45047a;

    /* renamed from: b */
    public final C15346t f45048b;

    /* renamed from: c */
    public final SparseArray f45049c;

    /* renamed from: d */
    private final C86124t f45050d;

    /* renamed from: e */
    private final ContextThemeWrapper f45051e;

    /* renamed from: f */
    private final List f45052f;

    /* renamed from: g */
    private final boolean f45053g;

    /* renamed from: h */
    private final boolean f45054h;

    /* renamed from: i */
    private final C15014aw f45055i;

    /* renamed from: j */
    private final C15015ax f45056j;

    /* renamed from: k */
    private final int f45057k;

    public C15024bf(C86124t tVar, ContextThemeWrapper contextThemeWrapper, int i, List list, C15014aw awVar, C15015ax axVar, C14132bf bfVar, boolean z, boolean z2, C15346t tVar2) {
        this.f45050d = tVar;
        this.f45051e = contextThemeWrapper;
        this.f45057k = i;
        this.f45052f = list;
        this.f45055i = awVar;
        this.f45056j = axVar;
        this.f45047a = bfVar;
        this.f45053g = z;
        this.f45054h = z2;
        this.f45048b = tVar2;
        this.f45049c = new SparseArray(list.size() + 1);
    }

    public final int getItemCount() {
        int i = this.f45057k - 2;
        if (i == 1) {
            return 6;
        }
        if (i != 2) {
            return 0;
        }
        return this.f45052f.size() + 1;
    }

    public final int getItemViewType(int i) {
        int i2 = this.f45057k - 2;
        if (i2 == 1) {
            return i % 2 == 0 ? 3 : 4;
        }
        if (i2 != 2) {
            return 3;
        }
        return i == this.f45052f.size() ? 2 : 1;
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        int a;
        if (this.f45049c.size() > 0 && i > 0) {
            C2043bi.m5526T(ghVar.itemView, new C15019ba(this, i));
        }
        this.f45049c.put(i, ghVar.itemView);
        if (getItemViewType(i) == 1) {
            C15023be beVar = (C15023be) ghVar;
            C14292dv dvVar = (C14292dv) this.f45052f.get(i);
            beVar.f45044g = Optional.m71637of(dvVar);
            beVar.f45045h.f45048b.mo22220j(beVar.f45039b, dvVar);
            beVar.f45038a.setText(dvVar.f43241g);
            if (!beVar.f45043f || ((a = C14291du.m30597a(dvVar.f43250p)) != 0 && a == 6)) {
                beVar.f45040c.setVisibility(8);
            } else {
                beVar.f45045h.f45048b.mo22222l(beVar.f45040c, dvVar);
            }
            C63204j jVar = dvVar.f43248n;
            if (jVar == null) {
                jVar = C63204j.f170749e;
            }
            beVar.f45042e = jVar;
            beVar.f45045h.f45048b.mo22217g(beVar.f45041d, dvVar, beVar.f45043f);
        }
        if (ghVar instanceof C14145o) {
            ((C14145o) ghVar).mo21470a();
        }
    }

    public final void onViewRecycled(C0673gh ghVar) {
        if (ghVar instanceof C14145o) {
            ((C14145o) ghVar).mo21471b();
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0673gh ghVar;
        CardView cardView;
        if (i == 1) {
            ghVar = new C15023be(this, (CardView) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_media_item_card, viewGroup, false), this.f45055i, this.f45054h);
        } else if (i == 2) {
            boolean e = this.f45050d.mo79746e(C90051dc.f248821ac);
            if (e) {
                cardView = (CardView) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_assistant_query_card_vertical, viewGroup, false);
            } else {
                cardView = (CardView) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_assistant_query_card, viewGroup, false);
            }
            C15020bb bbVar = new C15020bb(this, cardView, this.f45056j);
            if (this.f45052f.size() % 2 == 1) {
                cardView.setLayoutParams(new ViewGroup.LayoutParams(this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_width), this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_height)));
            } else if (e) {
                int dimensionPixelSize = this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_width);
                int dimensionPixelSize2 = this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_start_margin);
                cardView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize + dimensionPixelSize + dimensionPixelSize2 + this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_end_margin), this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_height) / 2));
            } else {
                int dimensionPixelSize3 = this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_height);
                int dimensionPixelSize4 = this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_top_margin);
                cardView.setLayoutParams(new ViewGroup.LayoutParams(this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_assistant_query_card_width), dimensionPixelSize3 + dimensionPixelSize3 + dimensionPixelSize4 + this.f45051e.getResources().getDimensionPixelSize(R.dimen.media_browse_fullscreen_media_item_card_bottom_margin)));
            }
            ghVar = bbVar;
        } else if (i == 3) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_loading_card, viewGroup, false);
            C15352z.m31953e(frameLayout, 0);
            ghVar = new C15021bc(frameLayout);
        } else if (i != 4) {
            ghVar = new C15021bc((FrameLayout) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_loading_card, viewGroup, false));
        } else {
            FrameLayout frameLayout2 = (FrameLayout) LayoutInflater.from(this.f45051e).inflate(R.layout.media_browse_loading_card, viewGroup, false);
            C15352z.m31953e(frameLayout2, C15352z.f46062c.toMillis());
            ghVar = new C15021bc(frameLayout2);
        }
        if (this.f45053g) {
            ghVar.itemView.startAnimation(C15352z.m31955g(this.f45051e, 2));
        }
        return ghVar;
    }
}
