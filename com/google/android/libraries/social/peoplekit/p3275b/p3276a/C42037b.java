package com.google.android.libraries.social.peoplekit.p3275b.p3276a;

import android.app.Activity;
import android.view.View;
import com.google.android.libraries.social.p3269d.p3270a.C41944s;
import com.google.android.libraries.social.p3269d.p3270a.C41945t;
import com.google.android.libraries.social.p3271e.p3272a.C41952a;
import com.google.android.libraries.social.peoplekit.C41960a;
import com.google.android.libraries.social.peoplekit.PeopleKitPickerResultImpl;
import com.google.android.libraries.social.peoplekit.common.analytics.C42075e;
import com.google.android.libraries.social.peoplekit.common.analytics.PeopleKitVisualElementPath;
import com.google.android.libraries.social.peoplekit.common.dataservice.PeopleKitDataLayer;
import com.google.android.libraries.social.peoplekit.common.selectionmodel.PeopleKitSelectionModel;
import com.google.p4140ba.p4150c.p4151a.C54941a;
import java.util.List;

/* renamed from: com.google.android.libraries.social.peoplekit.b.a.b */
/* compiled from: PG */
final class C42037b implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ PeopleKitDataLayer f109830a;

    /* renamed from: b */
    final /* synthetic */ PeopleKitSelectionModel f109831b;

    /* renamed from: c */
    final /* synthetic */ C41960a f109832c;

    /* renamed from: d */
    final /* synthetic */ Activity f109833d;

    /* renamed from: e */
    final /* synthetic */ C42075e f109834e;

    /* renamed from: f */
    final /* synthetic */ C42044i f109835f;

    public C42037b(C42044i iVar, PeopleKitDataLayer peopleKitDataLayer, PeopleKitSelectionModel peopleKitSelectionModel, C41960a aVar, Activity activity, C42075e eVar) {
        this.f109835f = iVar;
        this.f109830a = peopleKitDataLayer;
        this.f109831b = peopleKitSelectionModel;
        this.f109832c = aVar;
        this.f109833d = activity;
        this.f109834e = eVar;
    }

    public final void onClick(View view) {
        this.f109830a.mo44670o(this.f109831b.mo44746c());
        List b = this.f109831b.mo44745b(this.f109833d);
        String a = this.f109835f.f109853i.mo44538a();
        C41944s sVar = (C41944s) C41945t.f109486d.createBuilder();
        sVar.mo44386a(b);
        sVar.copyOnWrite();
        C41945t tVar = (C41945t) sVar.instance;
        a.getClass();
        tVar.f109488a |= 1;
        tVar.f109490c = a;
        new PeopleKitPickerResultImpl(this.f109830a, (C41945t) sVar.build(), this.f109831b.mo44746c());
        this.f109832c.mo44410b();
        C42075e eVar = this.f109834e;
        PeopleKitVisualElementPath peopleKitVisualElementPath = new PeopleKitVisualElementPath();
        peopleKitVisualElementPath.f109973a.mo44369a(new C41952a(C54941a.f144449L));
        peopleKitVisualElementPath.mo44564a(this.f109835f.f109854j.f109973a);
        eVar.mo44577c(4, peopleKitVisualElementPath);
    }
}
