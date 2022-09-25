package com.google.android.libraries.lens.view.p2065ai;

import android.widget.ImageView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.apps.tiktok.tracing.C47770dh;

/* renamed from: com.google.android.libraries.lens.view.ai.e */
/* compiled from: PG */
public final class C25167e {

    /* renamed from: a */
    public final C28310af f68561a;

    /* renamed from: b */
    public final C28443m f68562b;

    /* renamed from: c */
    public final C28306ab f68563c;

    /* renamed from: d */
    public final C47770dh f68564d;

    /* renamed from: e */
    public ImageView f68565e;

    /* renamed from: f */
    private final C25165c f68566f;

    public C25167e(C25165c cVar, C28310af afVar, C28443m mVar, C28306ab abVar, C47770dh dhVar) {
        this.f68566f = cVar;
        this.f68561a = afVar;
        this.f68562b = mVar;
        this.f68563c = abVar;
        this.f68564d = dhVar;
    }

    /* renamed from: a */
    public final void mo30313a(int i) {
        ImageView imageView = this.f68565e;
        if (imageView != null) {
            int i2 = i - 1;
            if (i2 == 0) {
                imageView.setVisibility(0);
                this.f68565e.setImageDrawable(this.f68566f.getContext().getDrawable(R.drawable.quantum_ic_arrow_back_white_24));
                this.f68565e.setContentDescription(this.f68566f.getContext().getString(R.string.lens_back));
            } else if (i2 == 2) {
                imageView.setVisibility(0);
                this.f68565e.setImageDrawable(this.f68566f.getContext().getDrawable(R.drawable.quantum_ic_close_white_24));
                this.f68565e.setContentDescription(this.f68566f.getContext().getString(R.string.lens_close_button_description));
            } else if (i2 != 3) {
                if (i2 == 4) {
                    imageView.setVisibility(8);
                } else if (imageView.getVisibility() != 0) {
                    this.f68565e.setImageDrawable(this.f68566f.getContext().getDrawable(R.drawable.quantum_ic_arrow_back_white_24));
                    this.f68565e.setContentDescription(this.f68566f.getContext().getString(R.string.lens_back));
                    C25185w.m46542a(this.f68565e);
                }
            } else if (imageView.getVisibility() != 0) {
                this.f68565e.setImageDrawable(this.f68566f.getContext().getDrawable(R.drawable.quantum_ic_close_white_24));
                this.f68565e.setContentDescription(this.f68566f.getContext().getString(R.string.lens_close_button_description));
                C25185w.m46542a(this.f68565e);
            }
        }
    }
}
