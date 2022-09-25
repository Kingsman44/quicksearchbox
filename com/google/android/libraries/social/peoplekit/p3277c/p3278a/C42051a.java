package com.google.android.libraries.social.peoplekit.p3277c.p3278a;

import android.view.View;
import com.google.android.libraries.social.p3269d.p3270a.C41944s;
import com.google.android.libraries.social.p3269d.p3270a.C41945t;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResultImpl;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.c.a.a */
/* compiled from: PG */
final class C42051a implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C42054d f109900a;

    public C42051a(C42054d dVar) {
        this.f109900a = dVar;
    }

    public final void onClick(View view) {
        C42054d dVar = this.f109900a;
        PeopleKitSelectionModel peopleKitSelectionModel = dVar.f109911f;
        if (peopleKitSelectionModel != null) {
            dVar.f109913h.mo44670o(peopleKitSelectionModel.mo44746c());
            List b = dVar.f109911f.mo44745b(dVar.f109906a);
            C41944s sVar = (C41944s) C41945t.f109486d.createBuilder();
            sVar.mo44386a(b);
            String a = dVar.mo44538a();
            sVar.copyOnWrite();
            C41945t tVar = (C41945t) sVar.instance;
            a.getClass();
            tVar.f109488a |= 1;
            tVar.f109490c = a;
            new PeopleKitPickerResultImpl(dVar.f109913h, (C41945t) sVar.build(), dVar.f109911f.mo44746c());
            dVar.f109912g.mo44410b();
            C42075e eVar = dVar.f109914i;
            PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
            peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144449L));
            peopleKitVisualElementPath.mo44564a(dVar.f109910e.f109973a);
            eVar.mo44577c(4, peopleKitVisualElementPath);
        }
    }
}
