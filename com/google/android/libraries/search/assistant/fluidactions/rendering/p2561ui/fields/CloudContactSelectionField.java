package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ButtonComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50961bf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.CloudContactSelectionField */
/* compiled from: PG */
public final class CloudContactSelectionField extends LinearLayout implements C33177b {

    /* renamed from: d */
    private static final C59071e f89053d = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.CloudContactSelectionField");

    /* renamed from: a */
    public C51941eu f89054a;

    /* renamed from: b */
    public C33184i f89055b;

    /* renamed from: c */
    public C33182g f89056c;

    /* renamed from: e */
    private LinearLayout f89057e = null;

    public CloudContactSelectionField(Context context) {
        super(context);
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
        C50961bf bfVar;
        C51941eu euVar = this.f89054a;
        if (euVar == null || this.f89056c == null || this.f89055b == null || this.f89057e == null) {
            ((C59052c) ((C59052c) f89053d.mo56226d()).mo56372aa(51031)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89054a = euVar2;
            this.f89056c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89054a;
        if (euVar3.f136277e == 32) {
            bfVar = (C50961bf) euVar3.f136278f;
        } else {
            bfVar = C50961bf.f132664b;
        }
        C50936ah ahVar = bfVar.f132666a;
        if (ahVar == null) {
            ahVar = C50936ah.f132593m;
        }
        ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(getContext()).inflate(R.layout.fa_button_component, (ViewGroup) null);
        buttonComponent.mo38638a(ahVar, this.f89055b, false);
        buttonComponent.setBackgroundResource(0);
        buttonComponent.setVisibility(0);
        this.f89057e.addView(buttonComponent);
        this.f89057e.setVisibility(0);
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
        this.f89057e = (LinearLayout) findViewById(R.id.fa_cloud_contact_selection_field_pick_contact_container);
    }

    public CloudContactSelectionField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CloudContactSelectionField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CloudContactSelectionField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
