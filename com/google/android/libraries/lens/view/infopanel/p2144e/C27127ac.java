package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.utils.C28123l;
import com.google.android.libraries.lens.view.utils.C28128q;
import com.google.android.libraries.logging.p2185ve.C28427h;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.ac */
/* compiled from: PG */
public final class C27127ac implements C27131ag {

    /* renamed from: a */
    private final C28128q f74126a;

    public C27127ac(C28128q qVar) {
        this.f74126a = qVar;
    }

    /* renamed from: a */
    public final /* synthetic */ View mo32451a(C27129ae aeVar) {
        return C27130af.m50335a(this, aeVar);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ View mo32452b(C27129ae aeVar) {
        if (!((C27126ab) aeVar).mo32562b()) {
            return this.f74126a.mo33575a();
        }
        C28128q qVar = this.f74126a;
        View inflate = LayoutInflater.from(qVar.f76538a).inflate(R.layout.results_feedback_card, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(R.id.send_report);
        qVar.f76543f.mo33801b(button, qVar.f76541d.mo33805a(C28427h.m53115a(54630)));
        button.setOnClickListener(new C28123l(qVar, button));
        return inflate;
    }
}
