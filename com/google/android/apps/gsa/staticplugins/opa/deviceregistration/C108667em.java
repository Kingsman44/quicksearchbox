package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.em */
/* compiled from: PG */
public final class C108667em extends C0640fb {

    /* renamed from: a */
    private final Context f302241a;

    /* renamed from: b */
    private final C108669eo f302242b;

    /* renamed from: c */
    private final C108664ej f302243c;

    /* renamed from: d */
    private final C83893b f302244d;

    public C108667em(Context context, C108669eo eoVar, C108664ej ejVar, C83893b bVar) {
        this.f302241a = context;
        this.f302242b = eoVar;
        this.f302243c = ejVar;
        this.f302244d = bVar;
    }

    public final int getItemCount() {
        return this.f302243c.f302230c.size();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        if (ghVar instanceof C108666el) {
            C108666el elVar = (C108666el) ghVar;
            C108679ey eyVar = (C108679ey) this.f302243c.f302230c.get(i);
            elVar.f302240h = eyVar;
            if (eyVar.mo97058b()) {
                elVar.f302235c.setImageResource(R.drawable.quantum_ic_check_circle_vd_theme_24);
                ImageView imageView = elVar.f302235c;
                imageView.setColorFilter(C1878d.m5128a(imageView.getContext(), R.color.md_grey_600));
            } else {
                elVar.f302235c.setImageResource(R.drawable.quantum_ic_add_googblue_24);
            }
            elVar.f302235c.setVisibility(0);
            Drawable a = eyVar.mo97057a(elVar.f302233a.getResources());
            if (a != null) {
                elVar.f302236d.setImageDrawable(a);
            }
            elVar.f302237e.setText(eyVar.f302272a.f130921b);
            elVar.f302238f.setText(eyVar.f302272a.f130922c);
        }
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C108666el(this.f302241a, this.f302242b, this.f302244d, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_media_entry, viewGroup, false));
    }
}
