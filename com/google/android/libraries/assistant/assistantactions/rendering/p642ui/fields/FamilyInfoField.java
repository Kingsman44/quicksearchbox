package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51004cv;
import com.google.assistant.p3897e.p3902c.p3907c.C51005cw;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.FamilyInfoField */
/* compiled from: PG */
public class FamilyInfoField extends C11407n {

    /* renamed from: a */
    public static final C59071e f36990a = C59071e.m91332i("com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.FamilyInfoField");

    /* renamed from: b */
    public ButtonComponent f36991b;

    /* renamed from: c */
    public LinearLayout f36992c;

    /* renamed from: d */
    public boolean f36993d = true;

    /* renamed from: e */
    private LinearLayout f36994e;

    /* renamed from: f */
    private ImageComponent f36995f;

    /* renamed from: g */
    private TextView f36996g;

    /* renamed from: h */
    private ButtonComponent f36997h;

    /* renamed from: i */
    private LinearLayout f36998i;

    /* renamed from: t */
    private TextView f36999t;

    public FamilyInfoField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51005cw cwVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar == null) {
            ((C59052c) ((C59052c) f36990a.mo56226d()).mo56372aa(43263)).mo56386p("Family Info Field data is null");
            return;
        }
        C51941eu euVar = cVar.f36729a;
        if (euVar.f136277e == 31) {
            cwVar = (C51005cw) euVar.f136278f;
        } else {
            cwVar = C51005cw.f132789e;
        }
        if ((cwVar.f132791a & 1) != 0) {
            this.f36994e.setVisibility(0);
            this.f36995f.setVisibility(0);
            ImageComponent imageComponent = this.f36995f;
            imageComponent.f36857d = true;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            dcVar.f132815a |= 2;
            dcVar.f132817c = "https://www.gstatic.com/assistant/verticals/communication/family_broadcast_48px.png";
            imageComponent.mo19786b((C51012dc) dbVar.build(), (Drawable) null);
            this.f36996g.setVisibility(0);
            this.f36996g.setText(cwVar.f132792b);
            this.f36997h.setVisibility(0);
            C50929aa aaVar = (C50929aa) C50936ah.f132593m.createBuilder();
            aaVar.copyOnWrite();
            C50936ah ahVar = (C50936ah) aaVar.instance;
            ahVar.f132604j = 2;
            ahVar.f132595a |= 256;
            aaVar.copyOnWrite();
            C50936ah ahVar2 = (C50936ah) aaVar.instance;
            ahVar2.f132595a |= 4;
            ahVar2.f132600f = true;
            C51011db dbVar2 = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar2.copyOnWrite();
            C51012dc dcVar2 = (C51012dc) dbVar2.instance;
            dcVar2.f132815a |= 2;
            dcVar2.f132817c = "https://fonts.gstatic.com/s/i/googlematerialicons/settings/v7/gm_grey-24dp/1x/gm_settings_gm_grey_24dp.png";
            C51012dc dcVar3 = (C51012dc) dbVar2.build();
            aaVar.copyOnWrite();
            C50936ah ahVar3 = (C50936ah) aaVar.instance;
            dcVar3.getClass();
            ahVar3.f132601g = dcVar3;
            ahVar3.f132595a |= 32;
            this.f36997h.mo19768a((C50936ah) aaVar.build(), false, false);
            this.f36997h.setOnClickListener(new C11365ay(this));
        } else {
            ((C59052c) ((C59052c) f36990a.mo56226d()).mo56372aa(43262)).mo56386p("Skip title line.");
        }
        if ((cwVar.f132791a & 2) != 0) {
            this.f36998i.setVisibility(0);
            this.f36999t.setVisibility(0);
            this.f36999t.setText(cwVar.f132793c);
            this.f36991b.setVisibility(0);
            String str = true != this.f36993d ? "https://fonts.gstatic.com/s/i/googlematerialicons/expand_less/v6/gm_grey-24dp/1x/gm_expand_less_gm_grey_24dp.png" : "https://fonts.gstatic.com/s/i/googlematerialicons/expand_more/v6/gm_grey-24dp/1x/gm_expand_more_gm_grey_24dp.png";
            C50929aa aaVar2 = (C50929aa) C50936ah.f132593m.createBuilder();
            aaVar2.copyOnWrite();
            C50936ah ahVar4 = (C50936ah) aaVar2.instance;
            ahVar4.f132604j = 2;
            ahVar4.f132595a |= 256;
            aaVar2.copyOnWrite();
            C50936ah ahVar5 = (C50936ah) aaVar2.instance;
            ahVar5.f132595a |= 4;
            ahVar5.f132600f = true;
            C51011db dbVar3 = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar3.copyOnWrite();
            C51012dc dcVar4 = (C51012dc) dbVar3.instance;
            dcVar4.f132815a = 2 | dcVar4.f132815a;
            dcVar4.f132817c = str;
            C51012dc dcVar5 = (C51012dc) dbVar3.build();
            aaVar2.copyOnWrite();
            C50936ah ahVar6 = (C50936ah) aaVar2.instance;
            dcVar5.getClass();
            ahVar6.f132601g = dcVar5;
            ahVar6.f132595a |= 32;
            this.f36991b.mo19768a((C50936ah) aaVar2.build(), false, false);
            this.f36991b.setOnClickListener(new C11366az(this));
        } else {
            ((C59052c) ((C59052c) f36990a.mo56226d()).mo56372aa(43261)).mo56386p("Missing text family information");
        }
        if (this.f36993d) {
            this.f36992c.setVisibility(8);
        } else {
            this.f36992c.setVisibility(0);
        }
        for (C51004cv cvVar : cwVar.f132794d) {
            ImageComponent imageComponent2 = new ImageComponent(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.image_component_size_tell_my_family_avatars), getResources().getDimensionPixelSize(R.dimen.image_component_size_tell_my_family_avatars));
            layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.image_field_margin_tell_my_family_member_avatars), 0, getResources().getDimensionPixelSize(R.dimen.image_field_margin_tell_my_family_member_avatars), 0);
            imageComponent2.setLayoutParams(layoutParams);
            imageComponent2.setVisibility(0);
            imageComponent2.f36857d = true;
            C51012dc dcVar6 = cvVar.f132787c;
            if (dcVar6 == null) {
                dcVar6 = C51012dc.f132813k;
            }
            imageComponent2.mo19786b(dcVar6, (Drawable) null);
            imageComponent2.setFocusable(true);
            if ((cvVar.f132785a & 1) != 0) {
                imageComponent2.setContentDescription(cvVar.f132786b);
            }
            this.f36992c.addView(imageComponent2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36994e = (LinearLayout) findViewById(R.id.family_info_title_line);
        this.f36995f = (ImageComponent) findViewById(R.id.family_info_feature_icon);
        this.f36996g = (TextView) findViewById(R.id.family_info_feature_title);
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
        this.f36997h = buttonComponent;
        buttonComponent.setFocusable(true);
        this.f36997h.setContentDescription(getResources().getString(R.string.fluid_action_broadcast_settings_button));
        this.f36994e.addView(this.f36997h);
        this.f36998i = (LinearLayout) findViewById(R.id.family_info_text_line);
        this.f36999t = (TextView) findViewById(R.id.family_info_text_info);
        ButtonComponent buttonComponent2 = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
        this.f36991b = buttonComponent2;
        buttonComponent2.setFocusable(true);
        this.f36991b.setContentDescription(getResources().getString(R.string.fluid_action_collapse_button));
        this.f36998i.addView(this.f36991b);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.family_avatar_list);
        this.f36992c = linearLayout;
        linearLayout.setFocusable(true);
        this.f36994e.setVisibility(8);
        this.f36995f.setVisibility(8);
        this.f36996g.setVisibility(8);
        this.f36997h.setVisibility(8);
        this.f36998i.setVisibility(8);
        this.f36999t.setVisibility(8);
        this.f36991b.setVisibility(8);
        this.f36992c.setVisibility(8);
    }

    public FamilyInfoField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FamilyInfoField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FamilyInfoField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
