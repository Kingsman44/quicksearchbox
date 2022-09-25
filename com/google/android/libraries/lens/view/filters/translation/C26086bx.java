package com.google.android.libraries.lens.view.filters.translation;

import android.widget.CompoundButton;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.bx */
/* compiled from: PG */
public final /* synthetic */ class C26086bx implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C26104co f70896a;

    public /* synthetic */ C26086bx(C26104co coVar) {
        this.f70896a = coVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C26104co coVar = this.f70896a;
        if (coVar.f70934q.mo31318k() != z) {
            coVar.f70936s.mo33853c(C26104co.m48173a(z, coVar.f70934q.mo31316i()), C28485y.m53234a(compoundButton));
            C26120dc dcVar = coVar.f70934q;
            boolean z2 = coVar.f70943z;
            dcVar.f70975a.mo5708l(Boolean.valueOf(z));
            if (!z2) {
                for (C26119db a : dcVar.f70978d) {
                    a.mo31311a(((Boolean) dcVar.f70975a.mo3842a()).booleanValue());
                }
            }
        }
    }
}
