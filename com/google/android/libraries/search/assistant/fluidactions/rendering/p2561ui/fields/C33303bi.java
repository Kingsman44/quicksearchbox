package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bi */
/* compiled from: PG */
public final /* synthetic */ class C33303bi implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FamilyInfoField f89291a;

    public /* synthetic */ C33303bi(FamilyInfoField familyInfoField) {
        this.f89291a = familyInfoField;
    }

    public final void onClick(View view) {
        FamilyInfoField familyInfoField = this.f89291a;
        if (familyInfoField.f89109h == null) {
            ((C59052c) ((C59052c) FamilyInfoField.f89102a.mo56226d()).mo56372aa(51078)).mo56386p("Failed to handle button onClick due to invalid args");
            return;
        }
        ((C59052c) ((C59052c) FamilyInfoField.f89102a.mo56224b()).mo56372aa(51076)).mo56386p("Clicked on settings button");
        ((C59052c) ((C59052c) FamilyInfoField.f89102a.mo56224b()).mo56372aa(51077)).mo56386p("Opening settings page");
        C33170a aVar = familyInfoField.f89109h;
        C18509a c = C18522b.m35986c();
        ((C18523c) c).f52492a = "family_broadcast";
        aVar.mo38560b(c.mo24020b().mo24031a(), C33304bj.f89292a);
    }
}
