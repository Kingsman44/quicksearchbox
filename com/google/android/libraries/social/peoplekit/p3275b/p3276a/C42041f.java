package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.gsa.assistant.settings.features.people.C73435fe;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.p3275b.C42046c;
import com.google.p4140ba.p4150c.p4151a.C54941a;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.f */
/* compiled from: PG */
public final class C42041f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C42044i f109842a;

    public C42041f(C42044i iVar) {
        this.f109842a = iVar;
    }

    public final void onClick(View view) {
        C42046c cVar = this.f109842a.f109859o;
        if (cVar != null) {
            ((InputMethodManager) cVar.f109863a.f109875b.getSystemService("input_method")).hideSoftInputFromWindow(cVar.f109863a.f109874a.getWindowToken(), 0);
            C73435fe feVar = cVar.f109863a.f109883j;
            if (feVar != null) {
                feVar.f194425a.getActivity().finish();
            }
        }
        C42075e eVar = this.f109842a.f109850f;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144477r));
        peopleKitVisualElementPath.mo44564a(this.f109842a.f109854j.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
    }
}
