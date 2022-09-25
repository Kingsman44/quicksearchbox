package com.google.android.libraries.lens.view.p2065ai;

import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2113h.p2122e.C26789an;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.ai.ab */
/* compiled from: PG */
public final class C25141ab {

    /* renamed from: a */
    public final C25187y f68452a;

    /* renamed from: b */
    public final C26789an f68453b;

    /* renamed from: c */
    public final C28310af f68454c;

    /* renamed from: d */
    public final C28443m f68455d;

    /* renamed from: e */
    public final C28306ab f68456e;

    /* renamed from: f */
    public final C47770dh f68457f;

    public C25141ab(C25187y yVar, C26789an anVar, C28310af afVar, C28443m mVar, C28306ab abVar, C47770dh dhVar) {
        this.f68452a = yVar;
        this.f68453b = anVar;
        this.f68454c = afVar;
        this.f68455d = mVar;
        this.f68456e = abVar;
        this.f68457f = dhVar;
    }

    /* renamed from: a */
    public final ImageView mo30281a() {
        return (ImageView) this.f68452a.requireView().findViewById(R.id.flash_button);
    }

    /* renamed from: b */
    public final void mo30282b(boolean z) {
        ImageView a = mo30281a();
        if (a.getVisibility() == 0) {
            int i = z ? R.drawable.quantum_ic_flash_on_white_24 : R.drawable.quantum_ic_flash_off_white_24;
            int i2 = true != z ? R.string.lens_flash_button_off_description : R.string.lens_flash_button_on_description;
            a.setImageDrawable(this.f68452a.getContext().getDrawable(i));
            a.setContentDescription(this.f68452a.getString(i2));
        }
    }
}
