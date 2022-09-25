package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2814a;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.a.a */
/* compiled from: PG */
public final /* synthetic */ class C36685a implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C36686b f95572a;

    public /* synthetic */ C36685a(C36686b bVar) {
        this.f95572a = bVar;
    }

    public final void onClick(View view) {
        C36686b bVar = this.f95572a;
        if (bVar.f95573a) {
            bVar.f95574b.setImageResource(R.drawable.quantum_ic_keyboard_arrow_down_grey600_24);
            ((TextView) bVar.findViewById(R.id.consent_ui_additional_description)).setVisibility(8);
        } else {
            bVar.f95574b.setImageResource(R.drawable.quantum_ic_keyboard_arrow_up_grey600_24);
            ((TextView) bVar.findViewById(R.id.consent_ui_additional_description)).setVisibility(0);
        }
        bVar.f95573a = !bVar.f95573a;
    }
}
