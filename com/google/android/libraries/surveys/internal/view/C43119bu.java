package com.google.android.libraries.surveys.internal.view;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import com.google.p4281bu.p4282a.C56585k;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.internal.view.bu */
/* compiled from: PG */
final class C43119bu implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ List f112775a;

    /* renamed from: b */
    final /* synthetic */ int f112776b;

    /* renamed from: c */
    final /* synthetic */ C43122bx f112777c;

    public C43119bu(C43122bx bxVar, List list, int i) {
        this.f112777c = bxVar;
        this.f112775a = list;
        this.f112776b = i;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String trim = charSequence.toString().trim();
        if (!TextUtils.isEmpty(trim)) {
            this.f112777c.f112783a.mo46130a(new C43121bw(4, trim, ((C56585k) this.f112775a.get(this.f112776b)).f151079b));
        }
    }
}
