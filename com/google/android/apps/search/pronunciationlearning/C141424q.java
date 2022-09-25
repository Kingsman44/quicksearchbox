package com.google.android.apps.search.pronunciationlearning;

import android.view.View;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.pronunciationlearning.q */
/* compiled from: PG */
final class C141424q implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141419n f383885a;

    public C141424q(C141419n nVar) {
        this.f383885a = nVar;
    }

    public final void onClick(View view) {
        C141419n nVar = this.f383885a;
        View view2 = nVar.f383868d.getView();
        view2.getClass();
        EditText editText = (EditText) view2.findViewById(R.id.pronunciationlearning_content_input_box);
        editText.getText().clear();
        editText.clearFocus();
        View view3 = nVar.f383868d.getView();
        view3.getClass();
        nVar.mo116420a(view3);
    }
}
