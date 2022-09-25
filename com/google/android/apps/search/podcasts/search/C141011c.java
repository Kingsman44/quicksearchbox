package com.google.android.apps.search.podcasts.search;

import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.podcasts.search.c */
/* compiled from: PG */
final class C141011c implements DialogInterface.OnShowListener {

    /* renamed from: a */
    final /* synthetic */ C141001b f382826a;

    public C141011c(C141001b bVar) {
        this.f382826a = bVar;
    }

    public final void onShow(DialogInterface dialogInterface) {
        EditText editText;
        View view = this.f382826a.f382804c.getView();
        if (view != null && (editText = (EditText) view.findViewById(R.id.podcasts_search_input_edittext)) != null) {
            C141001b bVar = this.f382826a;
            if (!C69764m.m101229h(bVar.f382803b)) {
                Editable text = editText.getText();
                C69664n.m101060f(text, "text");
                if (text.length() == 0) {
                    editText.append(bVar.f382803b);
                }
            }
            editText.requestFocus();
        }
    }
}
