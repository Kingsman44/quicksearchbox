package com.google.android.material.textfield;

import android.widget.AutoCompleteTextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1986f;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.m */
/* compiled from: PG */
public final /* synthetic */ class C44950m implements C1986f {

    /* renamed from: a */
    public final /* synthetic */ C44956s f117415a;

    public /* synthetic */ C44950m(C44956s sVar) {
        this.f117415a = sVar;
    }

    /* renamed from: a */
    public final void mo5144a(boolean z) {
        C44956s sVar = this.f117415a;
        AutoCompleteTextView autoCompleteTextView = sVar.f117421a;
        if (autoCompleteTextView != null && !C44957t.m79883a(autoCompleteTextView)) {
            CheckableImageButton checkableImageButton = sVar.f117465h;
            int i = 1;
            if (true == z) {
                i = 2;
            }
            C2043bi.m5551ae(checkableImageButton, i);
        }
    }
}
