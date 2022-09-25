package com.google.android.apps.gsa.staticplugins.p7806dj.p7810d;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageButton;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99606a;
import com.google.android.apps.gsa.staticplugins.p7806dj.p7809c.C99607b;

/* renamed from: com.google.android.apps.gsa.staticplugins.dj.d.g */
/* compiled from: PG */
final class C99616g implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ ImageButton f278763a;

    /* renamed from: b */
    final /* synthetic */ C99619j f278764b;

    public C99616g(C99619j jVar, ImageButton imageButton) {
        this.f278764b = jVar;
        this.f278763a = imageButton;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence.toString().isEmpty()) {
            this.f278763a.setVisibility(4);
        } else {
            this.f278763a.setVisibility(0);
        }
        C99606a aVar = this.f278764b.f278767a;
        String obj = charSequence.toString();
        Bundle bundle = new Bundle();
        bundle.putString("query", obj);
        ((C99607b) aVar).f278751a.mo28345s("onQueryChanged_java.lang.String", "SettingsSearchEventsDispatcher", bundle);
    }
}
