package com.google.android.libraries.lens.view.infopanel;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import androidx.core.content.C1878d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.infopanel.p2138a.C26980p;
import com.google.android.libraries.lens.view.session.C27766bb;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.C44920aa;
import com.google.android.material.textfield.TextInputLayout;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bm */
/* compiled from: PG */
public final class C27051bm {

    /* renamed from: a */
    public final Activity f73721a;

    /* renamed from: b */
    public final C47449e f73722b;

    /* renamed from: c */
    public final C26980p f73723c;

    /* renamed from: d */
    public final C28443m f73724d;

    /* renamed from: e */
    public final C27001as f73725e;

    /* renamed from: f */
    public final Rect f73726f;

    /* renamed from: g */
    public final C27766bb f73727g;

    /* renamed from: h */
    public final C47770dh f73728h;

    /* renamed from: i */
    public final C28306ab f73729i;

    /* renamed from: j */
    public final C28310af f73730j;

    /* renamed from: k */
    public final C27063bq f73731k;

    /* renamed from: l */
    public final boolean f73732l;

    /* renamed from: m */
    public boolean f73733m;

    /* renamed from: n */
    public C27050bl f73734n = null;

    /* renamed from: o */
    private boolean f73735o;

    public C27051bm(Activity activity, C47449e eVar, C26980p pVar, C28443m mVar, C27001as asVar, C27766bb bbVar, C47770dh dhVar, C28306ab abVar, C28310af afVar, C27005aw awVar, C27063bq bqVar, boolean z) {
        this.f73721a = activity;
        this.f73722b = eVar;
        this.f73723c = pVar;
        this.f73724d = mVar;
        this.f73725e = asVar;
        this.f73727g = bbVar;
        this.f73728h = dhVar;
        this.f73729i = abVar;
        this.f73730j = afVar;
        C27004av avVar = awVar.f73635a;
        avVar = avVar == null ? C27004av.f73627e : avVar;
        this.f73726f = new Rect(avVar.f73630b, avVar.f73632d, avVar.f73631c, avVar.f73629a);
        this.f73731k = bqVar;
        this.f73732l = z;
    }

    /* renamed from: a */
    public final void mo32493a(View view) {
        this.f73733m = true;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.multimodal_panel_input_layout);
        textInputLayout.f117308b.mo48598h(R.drawable.quantum_gm_ic_clear_vd_theme_24);
        textInputLayout.f117308b.mo48600j(ColorStateList.valueOf(C1878d.m5128a(this.f73725e.requireContext(), R.color.multimodal_search_box_close_icon_color)));
        textInputLayout.f117308b.mo48596f(R.string.lens_info_panel_multimodal_clear_text_button_description);
        View findViewById = textInputLayout.findViewById(R.id.text_input_end_icon);
        C47591co coVar = new C47591co(this.f73728h, "click clear text icon", new C27041bc(this, findViewById, textInputLayout));
        CheckableImageButton checkableImageButton = textInputLayout.f117308b.f117445d;
        checkableImageButton.setOnClickListener(coVar);
        C44920aa.m79801d(checkableImageButton);
        if (this.f73735o) {
            C28306ab.m52929e(findViewById);
        }
        this.f73729i.mo33801b(findViewById, this.f73730j.mo33805a(C28427h.m53115a(159031)));
        this.f73735o = true;
    }

    /* renamed from: b */
    public final void mo32494b(View view) {
        this.f73733m = false;
        TextInputLayout textInputLayout = (TextInputLayout) view.findViewById(R.id.multimodal_panel_input_layout);
        textInputLayout.f117308b.mo48598h(R.drawable.ic_mic_color);
        textInputLayout.f117308b.mo48600j((ColorStateList) null);
        textInputLayout.f117308b.mo48596f(R.string.lens_info_panel_multimodal_mic_button_description);
        View findViewById = textInputLayout.findViewById(R.id.text_input_end_icon);
        C47591co coVar = new C47591co(this.f73728h, "click voice search icon", new C27040bb(this, findViewById));
        CheckableImageButton checkableImageButton = textInputLayout.f117308b.f117445d;
        checkableImageButton.setOnClickListener(coVar);
        C44920aa.m79801d(checkableImageButton);
        if (this.f73735o) {
            C28306ab.m52929e(findViewById);
        }
        this.f73729i.mo33801b(findViewById, this.f73730j.mo33805a(C28427h.m53115a(159027)));
        this.f73735o = true;
        findViewById.setBackgroundColor(C1878d.m5128a(this.f73725e.requireContext(), 17170445));
    }
}
