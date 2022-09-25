package com.google.android.apps.gsa.assistant.settings.features.p540ae;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.apps.gsa.assistant.settings.search.k;
import com.google.android.apps.gsa.assistant.settings.search.p;
import com.google.android.apps.gsa.assistant.settings.search.v;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ae.br */
/* compiled from: PG */
final class C9934br implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ k f34040a;

    public C9934br(k kVar) {
        this.f34040a = kVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        List list;
        v j = this.f34040a.j();
        C46755l lVar = j.b;
        if (charSequence == null || charSequence.length() == 0) {
            list = C58485gu.m89845m();
        } else {
            list = (List) Collection.EL.stream(j.e).filter(new p(charSequence)).collect(Collectors.toList());
        }
        lVar.mo50772a(list);
    }
}
