package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.az */
/* compiled from: PG */
public final /* synthetic */ class C11366az implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FamilyInfoField f37095a;

    public /* synthetic */ C11366az(FamilyInfoField familyInfoField) {
        this.f37095a = familyInfoField;
    }

    public final void onClick(View view) {
        FamilyInfoField familyInfoField = this.f37095a;
        if (familyInfoField.f36993d) {
            ((C59052c) ((C59052c) FamilyInfoField.f36990a.mo56224b()).mo56372aa(43258)).mo56386p("Clicked to show family member avatars");
            familyInfoField.f36992c.setVisibility(0);
            familyInfoField.f36991b.mo19770c("https://fonts.gstatic.com/s/i/googlematerialicons/expand_less/v6/gm_grey-24dp/1x/gm_expand_less_gm_grey_24dp.png", 1);
            familyInfoField.f36991b.setContentDescription(familyInfoField.getResources().getString(R.string.fluid_action_uncollapse_button));
            familyInfoField.f36993d = false;
            return;
        }
        ((C59052c) ((C59052c) FamilyInfoField.f36990a.mo56224b()).mo56372aa(43257)).mo56386p("Clicked to hide family member avatars");
        familyInfoField.f36992c.setVisibility(8);
        familyInfoField.f36991b.mo19770c("https://fonts.gstatic.com/s/i/googlematerialicons/expand_more/v6/gm_grey-24dp/1x/gm_expand_more_gm_grey_24dp.png", 1);
        familyInfoField.f36991b.setContentDescription(familyInfoField.getResources().getString(R.string.fluid_action_collapse_button));
        familyInfoField.f36993d = true;
    }
}
