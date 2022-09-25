package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ay */
/* compiled from: PG */
public final /* synthetic */ class C11365ay implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FamilyInfoField f37094a;

    public /* synthetic */ C11365ay(FamilyInfoField familyInfoField) {
        this.f37094a = familyInfoField;
    }

    public final void onClick(View view) {
        FamilyInfoField familyInfoField = this.f37094a;
        ((C59052c) ((C59052c) FamilyInfoField.f36990a.mo56224b()).mo56372aa(43259)).mo56386p("Clicked on settings button");
        if (familyInfoField.f37152k != null) {
            ((C59052c) ((C59052c) FamilyInfoField.f36990a.mo56224b()).mo56372aa(43260)).mo56386p("Opening settings page");
            C11301i iVar = familyInfoField.f37152k;
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "family_broadcast";
            iVar.mo19726i(c.mo24020b().mo24031a(), C11368ba.f37097a);
        }
    }
}
