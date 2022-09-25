package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33170a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ButtonComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51004cv;
import com.google.assistant.p3897e.p3902c.p3907c.C51005cw;
import com.google.assistant.p3897e.p3902c.p3907c.C51011db;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.FamilyInfoField */
/* compiled from: PG */
public final class FamilyInfoField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89102a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.FamilyInfoField");

    /* renamed from: b */
    public ButtonComponent f89103b = null;

    /* renamed from: c */
    public LinearLayout f89104c = null;

    /* renamed from: d */
    public boolean f89105d = true;

    /* renamed from: e */
    public C51941eu f89106e;

    /* renamed from: f */
    public C33184i f89107f;

    /* renamed from: g */
    public C33182g f89108g;

    /* renamed from: h */
    public C33170a f89109h;

    /* renamed from: i */
    private LinearLayout f89110i = null;

    /* renamed from: j */
    private ImageComponent f89111j = null;

    /* renamed from: k */
    private TextView f89112k = null;

    /* renamed from: l */
    private ButtonComponent f89113l = null;

    /* renamed from: m */
    private LinearLayout f89114m = null;

    /* renamed from: n */
    private TextView f89115n = null;

    public FamilyInfoField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m61780a(View view) {
        if (view != null) {
            view.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo38563d(boolean z) {
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C51005cw cwVar;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        C51941eu euVar = this.f89106e;
        if (euVar == null || this.f89108g == null) {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51080)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89106e = euVar2;
            this.f89108g.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89106e;
        if (euVar3.f136277e == 31) {
            cwVar = (C51005cw) euVar3.f136278f;
        } else {
            cwVar = C51005cw.f132789e;
        }
        if (this.f89107f == null || (linearLayout2 = this.f89110i) == null || this.f89112k == null || this.f89111j == null || this.f89113l == null) {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51083)).mo56386p("Unable to update FormField UI due to invalid args");
        } else if ((cwVar.f132791a & 1) != 0) {
            linearLayout2.setVisibility(0);
            this.f89111j.setVisibility(0);
            ImageComponent imageComponent = this.f89111j;
            imageComponent.f88959d = true;
            C51011db dbVar = (C51011db) C51012dc.f132813k.createBuilder();
            dbVar.copyOnWrite();
            C51012dc dcVar = (C51012dc) dbVar.instance;
            dcVar.f132815a |= 2;
            dcVar.f132817c = "https://www.gstatic.com/assistant/verticals/communication/family_broadcast_48px.png";
            imageComponent.mo38649b((C51012dc) dbVar.build(), (Drawable) null);
            this.f89112k.setVisibility(0);
            this.f89112k.setText(cwVar.f132792b);
            this.f89113l.setVisibility(0);
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
            this.f89113l.mo38638a((C50936ah) aaVar.build(), this.f89107f, false);
            this.f89113l.setOnClickListener(new C33303bi(this));
        } else {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51084)).mo56386p("Skip title line.");
        }
        if (this.f89107f == null || (linearLayout = this.f89114m) == null || this.f89115n == null || this.f89103b == null) {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51081)).mo56386p("Unable to update FormField UI due to invalid args");
        } else if ((cwVar.f132791a & 2) != 0) {
            linearLayout.setVisibility(0);
            this.f89115n.setVisibility(0);
            this.f89115n.setText(cwVar.f132793c);
            this.f89103b.setVisibility(0);
            String str = true != this.f89105d ? "https://fonts.gstatic.com/s/i/googlematerialicons/expand_less/v6/gm_grey-24dp/1x/gm_expand_less_gm_grey_24dp.png" : "https://fonts.gstatic.com/s/i/googlematerialicons/expand_more/v6/gm_grey-24dp/1x/gm_expand_more_gm_grey_24dp.png";
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
            this.f89103b.mo38638a((C50936ah) aaVar2.build(), this.f89107f, false);
            this.f89103b.setOnClickListener(new C33305bk(this));
        } else {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51082)).mo56386p("Missing text family information");
        }
        LinearLayout linearLayout3 = this.f89104c;
        if (linearLayout3 == null) {
            ((C59052c) ((C59052c) f89102a.mo56226d()).mo56372aa(51079)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        if (this.f89105d) {
            linearLayout3.setVisibility(8);
        } else {
            linearLayout3.setVisibility(0);
        }
        for (C51004cv cvVar : cwVar.f132794d) {
            ImageComponent imageComponent2 = new ImageComponent(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(R.dimen.fa_family_info_field_tell_my_family_avatars_image_size), getResources().getDimensionPixelSize(R.dimen.fa_family_info_field_tell_my_family_avatars_image_size));
            layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.fa_family_info_field_tell_my_family_avatars_image_margin), 0, getResources().getDimensionPixelSize(R.dimen.fa_family_info_field_tell_my_family_avatars_image_margin), 0);
            imageComponent2.setLayoutParams(layoutParams);
            imageComponent2.setVisibility(0);
            imageComponent2.f88959d = true;
            C51012dc dcVar6 = cvVar.f132787c;
            if (dcVar6 == null) {
                dcVar6 = C51012dc.f132813k;
            }
            imageComponent2.mo38649b(dcVar6, (Drawable) null);
            imageComponent2.setFocusable(true);
            if ((cvVar.f132785a & 1) != 0) {
                imageComponent2.setContentDescription(cvVar.f132786b);
            }
            this.f89104c.addView(imageComponent2);
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo38565f() {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo38566g() {
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89110i = (LinearLayout) findViewById(R.id.fa_family_info_field_title_line);
        this.f89111j = (ImageComponent) findViewById(R.id.fa_family_info_field_feature_icon);
        this.f89112k = (TextView) findViewById(R.id.fa_family_info_field_feature_title);
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(R.layout.fa_button_component, (ViewGroup) null);
        this.f89113l = buttonComponent;
        buttonComponent.setFocusable(true);
        this.f89113l.setContentDescription(getResources().getString(R.string.fa_family_info_broadcast_settings_button));
        LinearLayout linearLayout = this.f89110i;
        if (linearLayout != null) {
            linearLayout.addView(this.f89113l);
        }
        this.f89114m = (LinearLayout) findViewById(R.id.fa_family_info_field_text_line);
        this.f89115n = (TextView) findViewById(R.id.fa_family_info_field_text_info);
        ButtonComponent buttonComponent2 = (ButtonComponent) LayoutInflater.from(getContext()).inflate(R.layout.fa_button_component, (ViewGroup) null);
        this.f89103b = buttonComponent2;
        buttonComponent2.setFocusable(true);
        this.f89103b.setContentDescription(getResources().getString(R.string.fa_family_info_collapse_button));
        LinearLayout linearLayout2 = this.f89114m;
        if (linearLayout2 != null) {
            linearLayout2.addView(this.f89103b);
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.fa_family_info_field_avatar_list);
        this.f89104c = linearLayout3;
        if (linearLayout3 != null) {
            linearLayout3.setFocusable(true);
        }
        m61780a(this.f89110i);
        m61780a(this.f89111j);
        m61780a(this.f89112k);
        m61780a(this.f89113l);
        m61780a(this.f89114m);
        m61780a(this.f89115n);
        m61780a(this.f89103b);
        m61780a(this.f89104c);
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
