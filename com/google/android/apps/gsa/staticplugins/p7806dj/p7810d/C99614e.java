package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.e */
/* compiled from: PG */
public final /* synthetic */ class C99614e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f278760a;

    /* renamed from: b */
    public final /* synthetic */ ImageButton f278761b;

    public /* synthetic */ C99614e(EditText editText, ImageButton imageButton) {
        this.f278760a = editText;
        this.f278761b = imageButton;
    }

    public final void onClick(View view) {
        EditText editText = this.f278760a;
        ImageButton imageButton = this.f278761b;
        editText.getText().clear();
        imageButton.setVisibility(4);
    }
}
