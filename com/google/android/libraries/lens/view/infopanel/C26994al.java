package com.google.android.libraries.lens.view.infopanel;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.p031v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2096f.C25802e;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.synthetic.C28452b;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import com.google.android.material.p3515l.C44782m;
import com.google.android.material.p3515l.C44783n;
import com.google.android.material.p3515l.C44784o;
import com.google.android.material.p3515l.C44785p;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.lens.view.infopanel.al */
/* compiled from: PG */
public final class C26994al implements C26960a {

    /* renamed from: a */
    public final C28443m f73606a;

    /* renamed from: b */
    public final C27063bq f73607b;

    /* renamed from: c */
    public final C28452b f73608c;

    /* renamed from: d */
    private final MultimodalHeaderView f73609d;

    /* renamed from: e */
    private final ImageView f73610e;

    /* renamed from: f */
    private final MaterialCardView f73611f;

    /* renamed from: g */
    private final Chip f73612g;

    /* renamed from: h */
    private final C47770dh f73613h;

    /* renamed from: i */
    private final C28310af f73614i;

    /* renamed from: j */
    private final C28306ab f73615j;

    /* renamed from: k */
    private boolean f73616k = true;

    /* renamed from: l */
    private int f73617l;

    public C26994al(MultimodalHeaderView multimodalHeaderView, C47770dh dhVar, C28310af afVar, C28306ab abVar, C28443m mVar, boolean z, C27063bq bqVar) {
        this.f73609d = multimodalHeaderView;
        this.f73613h = dhVar;
        this.f73614i = afVar;
        this.f73615j = abVar;
        this.f73606a = mVar;
        this.f73607b = bqVar;
        MaterialCardView materialCardView = (MaterialCardView) multimodalHeaderView.findViewById(R.id.header_multimodal_add_query_chip);
        materialCardView.getClass();
        this.f73611f = materialCardView;
        Chip chip = (Chip) multimodalHeaderView.findViewById(R.id.header_multimodal_modify_query_chip);
        chip.getClass();
        this.f73612g = chip;
        if (z) {
            View findViewById = materialCardView.findViewById(R.id.multimodal_query_chip_divider);
            findViewById.getClass();
            findViewById.setVisibility(0);
            View findViewById2 = materialCardView.findViewById(R.id.multimodal_query_chip_mic_button);
            findViewById2.getClass();
            findViewById2.setVisibility(0);
            abVar.mo33801b(findViewById2, afVar.mo33805a(C28427h.m53115a(159027)));
            findViewById2.setOnClickListener(new C47591co(dhVar, "chip mic button clicked", new C26993ak(this, findViewById2)));
            bqVar.mo32511b(C25802e.RECOGNIZE_SPEECH_CHIP, (Fragment) null, multimodalHeaderView);
        }
        ImageView imageView = (ImageView) multimodalHeaderView.findViewById(R.id.header_thumbnail);
        imageView.getClass();
        this.f73610e = imageView;
        imageView.setClipToOutline(true);
        this.f73617l = 4;
        abVar.mo33801b(imageView, afVar.mo33805a(C28427h.m53115a(109330)));
        abVar.mo33801b(materialCardView, afVar.mo33805a(C28427h.m53115a(141427)));
        C44784o oVar = new C44784o(materialCardView.f116031g.f116048m);
        oVar.mo48148g(new C44783n());
        oVar.mo48147f(new C44782m(0.5f));
        materialCardView.mo47555l(new C44785p(oVar));
        C28452b bVar = new C28452b(abVar.mo33801b(chip, afVar.mo33805a(C28427h.m53115a(141428))));
        this.f73608c = bVar;
        bVar.mo33907a(1, afVar.mo33805a(C28427h.m53115a(144313)));
        chip.f116094e = new C47591co(dhVar, "clear multimodal query", new C26992aj(this));
        chip.mo47665E();
    }

    /* renamed from: i */
    private final void m50086i(int i) {
        this.f73617l = i;
        m50087j(this.f73612g.getText().length() > 0);
    }

    /* renamed from: j */
    private final void m50087j(boolean z) {
        if (z) {
            this.f73612g.setVisibility(this.f73616k ? this.f73617l : 8);
            this.f73611f.setVisibility(8);
            return;
        }
        this.f73611f.setVisibility(this.f73616k ? this.f73617l : 8);
        this.f73612g.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo32386b(float f) {
        this.f73609d.setAlpha(f);
        this.f73609d.setVisibility(f > 0.0f ? 0 : 4);
    }

    /* renamed from: c */
    public final void mo32387c(int i) {
        ViewGroup.LayoutParams layoutParams = this.f73609d.getLayoutParams();
        layoutParams.height = i;
        this.f73609d.setLayoutParams(layoutParams);
        ImageView imageView = this.f73610e;
        int i2 = i == 0 ? 4 : 0;
        imageView.setVisibility(i2);
        m50086i(i2);
    }

    /* renamed from: d */
    public final void mo32388d(boolean z) {
        this.f73616k = z;
        m50086i(this.f73617l);
    }

    /* renamed from: e */
    public final void mo32389e(C58833ax axVar) {
        String str = (String) axVar.mo56109e(BuildConfig.FLAVOR);
        this.f73612g.setText(str);
        m50087j(!str.isEmpty());
    }

    /* renamed from: f */
    public final void mo32390f(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f73609d.getLayoutParams();
        if (this.f73609d.getResources().getConfiguration().getLayoutDirection() == 1) {
            layoutParams.rightMargin = i;
        } else {
            layoutParams.leftMargin = i;
        }
        this.f73609d.setLayoutParams(layoutParams);
    }

    /* renamed from: g */
    public final void mo32391g(Bitmap bitmap) {
        this.f73610e.setImageBitmap(bitmap);
    }

    /* renamed from: h */
    public final void mo32392h(boolean z) {
    }

    /* renamed from: a */
    public final Rect mo32385a() {
        int[] iArr = new int[2];
        ImageView imageView = this.f73610e;
        imageView.getClass();
        imageView.getLocationInWindow(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], this.f73610e.getWidth() + i, iArr[1] + this.f73610e.getHeight());
    }
}
