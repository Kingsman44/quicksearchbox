package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p031v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ActionEditText;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50997co;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.EditableTextField */
/* compiled from: PG */
public final class EditableTextField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89089a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.EditableTextField");

    /* renamed from: b */
    public TextView f89090b = null;

    /* renamed from: c */
    public TextView f89091c = null;

    /* renamed from: d */
    public ActionEditText f89092d = null;

    /* renamed from: e */
    public TextView f89093e = null;

    /* renamed from: f */
    public ImageComponent f89094f = null;

    /* renamed from: g */
    public C51941eu f89095g;

    /* renamed from: h */
    public C32951d f89096h;

    /* renamed from: i */
    public C33184i f89097i;

    /* renamed from: j */
    public Fragment f89098j;

    /* renamed from: k */
    public C33182g f89099k;

    /* renamed from: l */
    public C32942a f89100l;

    /* renamed from: m */
    public boolean f89101m = false;

    public EditableTextField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo38706a() {
        int i;
        int i2;
        int i3;
        C33184i iVar = this.f89097i;
        if (iVar != null && this.f89090b != null && this.f89092d != null) {
            if (!this.f89101m || iVar.f88751a == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
                i3 = C33234l.m61644b(getContext(), R.attr.fa_editable_text_field_title_text_color);
                i = C33234l.m61644b(getContext(), R.attr.fa_editable_text_field_hint_text_color);
                i2 = C33234l.m61644b(getContext(), R.attr.fa_editable_text_field_edit_text_color);
            } else {
                i3 = C19391a.m36980a(getContext(), R.attr.colorPrimary);
                i = C19391a.m36980a(getContext(), R.attr.colorPrimary);
                i2 = C19391a.m36980a(getContext(), R.attr.colorPrimary);
            }
            this.f89090b.setTextColor(i3);
            this.f89092d.setHintTextColor(i);
            this.f89092d.setTextColor(i2);
            if (this.f89097i.f88751a == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY) {
                this.f89092d.setBackgroundTintList((ColorStateList) null);
                if (this.f89101m || TextUtils.isEmpty(this.f89092d.getText())) {
                    this.f89092d.setBackground(getContext().getDrawable(R.drawable.fa_editable_text_field_background_glanceable));
                } else {
                    this.f89092d.setBackground(getContext().getDrawable(R.drawable.fa_editable_text_field_background_glanceable_confirmation));
                }
            } else {
                this.f89092d.setBackgroundTintList(ColorStateList.valueOf(i2));
            }
        }
    }

    /* renamed from: b */
    public final /* synthetic */ void mo38561b(C33176f fVar) {
    }

    /* renamed from: c */
    public final /* synthetic */ void mo38562c() {
    }

    /* renamed from: d */
    public final void mo38563d(boolean z) {
        this.f89101m = z;
        mo38706a();
    }

    /* renamed from: e */
    public final void mo38564e(C33180e eVar) {
        C50997co coVar;
        String str;
        C51941eu euVar = this.f89095g;
        if (euVar == null || this.f89099k == null || this.f89097i == null || this.f89090b == null || this.f89092d == null) {
            ((C59052c) ((C59052c) f89089a.mo56226d()).mo56372aa(51073)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89095g = euVar2;
            this.f89099k.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89095g;
        if (euVar3.f136277e == 4) {
            coVar = (C50997co) euVar3.f136278f;
        } else {
            coVar = C50997co.f132759h;
        }
        if (this.f89097i.f88751a == C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY || coVar.f132762b.isEmpty()) {
            this.f89090b.setVisibility(8);
        } else if (!coVar.f132762b.contentEquals(this.f89090b.getText())) {
            this.f89090b.setText(coVar.f132762b);
            this.f89090b.setVisibility(0);
        }
        if (coVar.f132763c.isEmpty()) {
            str = coVar.f132762b;
        } else {
            str = coVar.f132763c;
        }
        if (!coVar.f132764d.isEmpty() || this.f89092d.hasFocus()) {
            if (!TextUtils.equals(coVar.f132764d, this.f89092d.getText())) {
                this.f89092d.setText(coVar.f132764d);
            }
            if (!TextUtils.isEmpty(this.f89092d.getHint())) {
                this.f89092d.setHint(BuildConfig.FLAVOR);
                return;
            }
            return;
        }
        this.f89092d.setHint(str);
        mo38707h(4);
    }

    /* renamed from: f */
    public final void mo38565f() {
        ActionEditText actionEditText = this.f89092d;
        if (actionEditText != null) {
            actionEditText.requestFocus();
            this.f89092d.requestFocusFromTouch();
        }
    }

    /* renamed from: g */
    public final void mo38566g() {
        ActionEditText actionEditText = this.f89092d;
        if (actionEditText != null) {
            actionEditText.clearFocus();
        }
    }

    /* renamed from: h */
    public final void mo38707h(int i) {
        TextView textView;
        if (this.f89097i != null && (textView = this.f89090b) != null && textView.getVisibility() != 8) {
            this.f89090b.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f89090b = (TextView) findViewById(R.id.fa_editable_text_field_title);
        this.f89091c = (TextView) findViewById(R.id.fa_editable_text_field_label);
        this.f89092d = (ActionEditText) findViewById(R.id.fa_editable_text_field_edit_text);
        this.f89093e = (TextView) findViewById(R.id.fa_editable_text_field_edit_text_display);
        this.f89094f = (ImageComponent) findViewById(R.id.fa_editable_text_field_icon);
        this.f89092d.setFocusableInTouchMode(true);
    }

    public EditableTextField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public EditableTextField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EditableTextField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
