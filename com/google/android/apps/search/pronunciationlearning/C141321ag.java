package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ag */
/* compiled from: PG */
final class C141321ag implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141308aa f383665a;

    public C141321ag(C141308aa aaVar) {
        this.f383665a = aaVar;
    }

    public final void onClick(View view) {
        C141308aa aaVar = this.f383665a;
        boolean z = !aaVar.f383649w;
        aaVar.f383649w = z;
        ImageView imageView = (ImageView) view;
        if (z) {
            View view2 = aaVar.f383631e.getView();
            view2.getClass();
            C60870cx a = aaVar.f383634h.mo116408a(((TextView) view2.findViewById(R.id.pronunciationlearning_expected_text)).getText().toString());
            aaVar.f383633g.mo50428h(C46438d.m82810b(a).f121541a, (Object) null, aaVar.f383636j);
            imageView.setImageResource(R.drawable.quantum_ic_stop_vd_theme_24);
            aaVar.f383641o.mo116363c();
            return;
        }
        aaVar.f383634h.mo116411d();
        imageView.setImageResource(R.drawable.quantum_ic_volume_up_vd_theme_24);
        aaVar.f383641o.mo116364d();
    }
}
