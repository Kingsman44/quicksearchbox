package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bk */
/* compiled from: PG */
public final /* synthetic */ class C33305bk implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ FamilyInfoField f89293a;

    public /* synthetic */ C33305bk(FamilyInfoField familyInfoField) {
        this.f89293a = familyInfoField;
    }

    public final void onClick(View view) {
        FamilyInfoField familyInfoField = this.f89293a;
        ((C59052c) ((C59052c) FamilyInfoField.f89102a.mo56224b()).mo56372aa(51074)).mo56386p("Clicked to show/hide family member avatars");
        LinearLayout linearLayout = familyInfoField.f89104c;
        if (linearLayout == null || familyInfoField.f89103b == null) {
            ((C59052c) ((C59052c) FamilyInfoField.f89102a.mo56226d()).mo56372aa(51075)).mo56386p("Failed to update family member avatars UI, invalid args");
        } else if (familyInfoField.f89105d) {
            linearLayout.setVisibility(0);
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            dcVar.f132815a |= 2;
            dcVar.f132817c = "https://fonts.gstatic.com/s/i/googlematerialicons/expand_less/v6/gm_grey-24dp/1x/gm_expand_less_gm_grey_24dp.png";
            dbVar.copyOnWrite();
            C51012dc dcVar2 = (C51012dc) dbVar.instance;
            dcVar2.f132816b = 0;
            dcVar2.f132815a = 1 | dcVar2.f132815a;
            familyInfoField.f89103b.mo38639b((C51012dc) dbVar.build(), (Drawable) null);
            familyInfoField.f89103b.setContentDescription(familyInfoField.getResources().getString(R.string.fa_family_info_uncollapse_button));
            familyInfoField.f89105d = false;
        } else {
            linearLayout.setVisibility(8);
            C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar2.copyOnWrite();
            C51012dc dcVar3 = (C51012dc) dbVar2.instance;
            dcVar3.f132815a |= 2;
            dcVar3.f132817c = "https://fonts.gstatic.com/s/i/googlematerialicons/expand_more/v6/gm_grey-24dp/1x/gm_expand_more_gm_grey_24dp.png";
            dbVar2.copyOnWrite();
            C51012dc dcVar4 = (C51012dc) dbVar2.instance;
            dcVar4.f132816b = 0;
            dcVar4.f132815a |= 1;
            familyInfoField.f89103b.mo38639b((C51012dc) dbVar2.build(), (Drawable) null);
            familyInfoField.f89103b.setContentDescription(familyInfoField.getResources().getString(R.string.fa_family_info_collapse_button));
            familyInfoField.f89105d = true;
        }
    }
}
