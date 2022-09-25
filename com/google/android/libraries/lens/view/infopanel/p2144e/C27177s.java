package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0654fp;
import android.support.p033v7.widget.C0658ft;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.android.libraries.material.progress.C28582h;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.p4017at.p4056g.p4057a.p4058a.C53970ae;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.s */
/* compiled from: PG */
final class C27177s extends C0640fb {

    /* renamed from: a */
    public static final C58974d f74277a = C58974d.m91135i("InfoPanelChipCarousel");

    /* renamed from: b */
    public final List f74278b = new ArrayList();

    /* renamed from: c */
    public final C27179u f74279c;

    /* renamed from: d */
    public final RecyclerView f74280d;

    /* renamed from: e */
    public final C28443m f74281e;

    /* renamed from: f */
    public final C60888db f74282f;

    /* renamed from: g */
    public boolean f74283g;

    /* renamed from: h */
    public int f74284h;

    /* renamed from: i */
    private final C0658ft f74285i;

    /* renamed from: j */
    private final Context f74286j;

    /* renamed from: k */
    private final C28310af f74287k;

    /* renamed from: l */
    private final C28306ab f74288l;

    /* renamed from: m */
    private final C47770dh f74289m;

    /* renamed from: n */
    private final LayoutInflater f74290n;

    public C27177s(Context context, C27179u uVar, LayoutInflater layoutInflater, RecyclerView recyclerView, C28310af afVar, C28443m mVar, C60888db dbVar, C28306ab abVar, C47770dh dhVar) {
        C27170l lVar = new C27170l(this);
        this.f74285i = lVar;
        this.f74284h = 4;
        this.f74286j = context;
        this.f74279c = uVar;
        this.f74290n = layoutInflater;
        this.f74280d = recyclerView;
        this.f74287k = afVar;
        this.f74281e = mVar;
        this.f74282f = dbVar;
        this.f74288l = abVar;
        this.f74289m = dhVar;
        recyclerView.setAdapter(this);
        recyclerView.addOnScrollListener(lVar);
    }

    /* renamed from: b */
    private final int m50388b(int i) {
        return this.f74286j.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: a */
    public final void mo32609a(MaterialButton materialButton, Drawable drawable) {
        double d = 1.0d;
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            double intrinsicWidth = (double) drawable.getIntrinsicWidth();
            double intrinsicHeight = (double) drawable.getIntrinsicHeight();
            Double.isNaN(intrinsicWidth);
            Double.isNaN(intrinsicHeight);
            d = intrinsicWidth / intrinsicHeight;
        }
        int b = m50388b(R.dimen.lens_suggestion_icon_size);
        double d2 = (double) b;
        Double.isNaN(d2);
        drawable.setBounds(0, 0, (int) (d * d2), b);
        materialButton.setCompoundDrawablesRelative(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        materialButton.setPadding(m50388b(R.dimen.lens_suggestion_icon_padding), 0, m50388b(R.dimen.lens_suggestion_text_horizontal_padding), 0);
    }

    public final int getItemCount() {
        return this.f74278b.size();
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C58833ax axVar;
        C27174p pVar = (C27174p) ghVar;
        int i2 = C27174p.f74267c;
        int dimensionPixelSize = pVar.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.lens_suggestion_gap);
        C0654fp fpVar = (C0654fp) pVar.itemView.getLayoutParams();
        fpVar.setMarginStart(i == 0 ? dimensionPixelSize : 0);
        fpVar.setMarginEnd(dimensionPixelSize);
        pVar.itemView.setLayoutParams(fpVar);
        MaterialButton materialButton = pVar.f74268a;
        MaterialButton materialButton2 = pVar.f74269b;
        materialButton.setVisibility(8);
        materialButton2.setVisibility(8);
        C27178t tVar = (C27178t) this.f74278b.get(i);
        if (tVar.mo32613d()) {
            materialButton2.setVisibility(0);
            C28582h hVar = new C28582h(m50388b(R.dimen.lens_suggestion_progress_bar_stroke_width), 0, this.f74286j.getResources().getIntArray(R.array.material_google_colors));
            hVar.setVisible(true);
            mo32609a(materialButton2, hVar);
            materialButton2.setText(tVar.mo32612c());
            materialButton2.setContentDescription(tVar.mo32611b());
            if (tVar.mo32612c().isEmpty()) {
                materialButton2.setMinimumWidth(0);
                materialButton2.setMinWidth(0);
                materialButton2.setPadding(m50388b(R.dimen.lens_suggestion_progress_bar_padding), 0, m50388b(R.dimen.lens_suggestion_progress_bar_padding), 0);
                materialButton2.mo47551i(0);
            } else {
                materialButton2.setPadding(m50388b(R.dimen.lens_suggestion_icon_padding), 0, m50388b(R.dimen.lens_suggestion_text_horizontal_padding), 0);
                materialButton2.mo47551i(m50388b(R.dimen.lens_suggestion_icon_padding));
            }
        } else {
            materialButton.setVisibility(0);
            materialButton.mo28945lq((Drawable) null);
            materialButton.setText(tVar.mo32612c());
            materialButton.setFocusable(true);
            materialButton.setContentDescription(tVar.mo32611b());
            List list = tVar.f74297g;
            if (list.size() >= 2) {
                C60856cj.m92911t(C60856cj.m92896e(list), C47810es.m84974n(new C27172n(this, materialButton)), this.f74282f);
            } else {
                if (tVar.f74298h.mo56113h()) {
                    axVar = tVar.f74298h;
                } else {
                    C53970ae aeVar = tVar.mo32610a().f141824d;
                    if (aeVar == null) {
                        aeVar = C53970ae.f141610b;
                    }
                    String str = aeVar.f141612a;
                    axVar = tVar.f74294d.containsKey(str) ? C58833ax.m90834k((C60870cx) tVar.f74294d.get(str)) : C58836b.f156633a;
                }
                if (axVar.mo56113h()) {
                    C60856cj.m92911t((C60870cx) axVar.mo56107c(), C47810es.m84974n(new C27171m(this, materialButton)), this.f74282f);
                }
            }
            materialButton.addOnLayoutChangeListener(new C27173o(materialButton, m50388b(R.dimen.lens_suggestion_chip_tap_area_height)));
            materialButton.setOnClickListener(new C47591co(this.f74289m, "Click chip", new C27169k(this, tVar)));
        }
        C28306ab abVar = this.f74288l;
        C28313c a = this.f74287k.mo33805a(C28427h.m53115a(tVar.f74293c));
        a.mo33858f(C28449s.m53155a(i));
        abVar.mo33802c(materialButton, a);
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        MaterialButton materialButton = (MaterialButton) this.f74290n.inflate(R.layout.lens_suggestion_button, viewGroup, false);
        int i2 = this.f74284h == 3 ? R.dimen.lens_assisted_chip_corner_radius : R.dimen.lens_suggestion_chip_corner_radius;
        materialButton.mo47550h(m50388b(i2));
        MaterialButton materialButton2 = (MaterialButton) this.f74290n.inflate(R.layout.lens_suggestion_button, viewGroup, false);
        materialButton2.mo47550h(m50388b(i2));
        FrameLayout frameLayout = new FrameLayout(this.f74286j, (AttributeSet) null);
        frameLayout.setLayoutParams(new C0654fp(-2, m50388b(R.dimen.lens_suggestion_chip_tap_area_height)));
        frameLayout.addView(materialButton);
        frameLayout.addView(materialButton2);
        return new C27174p(frameLayout, materialButton, materialButton2);
    }
}
