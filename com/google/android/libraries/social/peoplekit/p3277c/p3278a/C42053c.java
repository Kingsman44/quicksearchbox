package com.google.android.libraries.social.peoplekit.p3277c.p3278a;

import android.text.Editable;
import android.text.TextWatcher;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.c.a.c */
/* compiled from: PG */
final class C42053c implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ C42075e f109904a;

    /* renamed from: b */
    final /* synthetic */ C42054d f109905b;

    public C42053c(C42054d dVar, C42075e eVar) {
        this.f109905b = dVar;
        this.f109904a = eVar;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (i == 0 && i2 == 0 && i3 > 0) {
            C42075e eVar = this.f109904a;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144461b));
            peopleKitVisualElementPath.mo44564a(this.f109905b.f109910e.f109973a);
            eVar.mo44577c(16, peopleKitVisualElementPath);
        }
    }
}
