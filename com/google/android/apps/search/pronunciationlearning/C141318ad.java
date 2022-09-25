package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ad */
/* compiled from: PG */
final class C141318ad implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141308aa f383662a;

    public C141318ad(C141308aa aaVar) {
        this.f383662a = aaVar;
    }

    public final void onClick(View view) {
        C141308aa aaVar = this.f383662a;
        View view2 = aaVar.f383631e.getView();
        view2.getClass();
        aaVar.mo116339d(((TextView) view2.findViewById(R.id.pronunciationlearning_expected_text)).getText().toString());
    }
}
