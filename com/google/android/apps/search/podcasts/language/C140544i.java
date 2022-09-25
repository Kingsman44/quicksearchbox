package com.google.android.apps.search.podcasts.language;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.search.podcasts.language.p10578b.C140523c;
import com.google.android.apps.search.podcasts.language.p10578b.C140532l;
import com.google.android.apps.search.podcasts.p10559c.C140192a;
import com.google.common.util.concurrent.C60826bg;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.language.i */
/* compiled from: PG */
public final class C140544i implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C140539e f381714a;

    public C140544i(C140539e eVar) {
        this.f381714a = eVar;
    }

    public final void afterTextChanged(Editable editable) {
        C69664n.m101061g(editable, "editable");
        C140532l lVar = this.f381714a.f381702d;
        String obj = editable.toString();
        C69664n.m101061g(obj, "newConstraint");
        lVar.f381681d.mo50787a(lVar.f381685h.mo51511a(new C140523c(lVar, obj), C60826bg.f164896a), C140192a.f380885a);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C69664n.m101061g(charSequence, "charSequence");
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C69664n.m101061g(charSequence, "charSequence");
    }
}
