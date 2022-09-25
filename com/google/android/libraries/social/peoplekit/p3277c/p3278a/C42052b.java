package com.google.android.libraries.social.peoplekit.p3277c.p3278a;

import android.view.View;
import android.widget.EditText;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.c.a.b */
/* compiled from: PG */
final class C42052b implements View.OnFocusChangeListener {

    /* renamed from: a */
    final /* synthetic */ EditText f109901a;

    /* renamed from: b */
    final /* synthetic */ C42075e f109902b;

    /* renamed from: c */
    final /* synthetic */ C42054d f109903c;

    public C42052b(C42054d dVar, EditText editText, C42075e eVar) {
        this.f109903c = dVar;
        this.f109901a = editText;
        this.f109902b = eVar;
    }

    public final void onFocusChange(View view, boolean z) {
        if (view == this.f109901a && z) {
            C42075e eVar = this.f109902b;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144461b));
            peopleKitVisualElementPath.mo44564a(this.f109903c.f109910e.f109973a);
            eVar.mo44577c(4, peopleKitVisualElementPath);
        }
    }
}
