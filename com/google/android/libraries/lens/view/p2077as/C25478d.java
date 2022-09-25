package com.google.android.libraries.lens.view.p2077as;

import android.text.TextUtils;
import android.widget.TextView;
import androidx.lifecycle.C2333ah;
import com.google.android.libraries.lens.view.filters.p2099c.C25940e;

/* renamed from: com.google.android.libraries.lens.view.as.d */
/* compiled from: PG */
public final /* synthetic */ class C25478d implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C25479e f69426a;

    public /* synthetic */ C25478d(C25479e eVar) {
        this.f69426a = eVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C25479e eVar = this.f69426a;
        eVar.mo30512a().setText(((C25940e) obj).mo31103a());
        TextView a = eVar.mo30512a();
        if (TextUtils.isEmpty(a.getText())) {
            a.setVisibility(4);
        } else {
            a.setVisibility(0);
        }
    }
}
