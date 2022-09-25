package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ActionEditText;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.EditableTextField */
/* compiled from: PG */
public class EditableTextField extends C11407n {

    /* renamed from: a */
    public ActionEditText f36983a;

    /* renamed from: b */
    public boolean f36984b;

    /* renamed from: c */
    private TextView f36985c;

    /* renamed from: d */
    private TextView f36986d;

    /* renamed from: e */
    private TextView f36987e;

    /* renamed from: f */
    private ImageComponent f36988f;

    /* renamed from: g */
    private boolean f36989g;

    public EditableTextField(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo19849a() {
        if (this.f36989g) {
            this.f36985c.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19809b() {
        /*
            r9 = this;
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r0 = r9.f37153l
            if (r0 == 0) goto L_0x0171
            com.google.android.libraries.assistant.assistantactions.rendering.c.d r1 = r9.f37154m
            if (r1 != 0) goto L_0x000a
            goto L_0x0171
        L_0x000a:
            com.google.assistant.e.j.e.eu r0 = r0.f36729a
            int r1 = r0.f136277e
            r2 = 4
            if (r1 != r2) goto L_0x0016
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x0018
        L_0x0016:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0018:
            java.lang.String r1 = r0.f132762b
            boolean r1 = r1.isEmpty()
            r3 = 1
            if (r1 != 0) goto L_0x0029
            android.widget.TextView r1 = r9.f36985c
            java.lang.String r4 = r0.f132762b
            r1.setText(r4)
            goto L_0x0030
        L_0x0029:
            r9.f36989g = r3
            r1 = 8
            r9.mo19851d(r1)
        L_0x0030:
            java.lang.String r1 = r0.f132763c
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x003a
            java.lang.String r1 = r0.f132762b
        L_0x003a:
            com.google.android.libraries.assistant.assistantactions.b.a r4 = r9.f37155n
            if (r4 == 0) goto L_0x0065
            r5 = 37
            boolean r4 = r4.mo19521b(r5)
            if (r4 == 0) goto L_0x0065
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r4 = r9.f36983a
            java.lang.String r5 = r4.getPrivateImeOptions()
            java.lang.String r6 = "com.google.android.inputmethod.latin.canary.darkMode,com.google.android.inputmethod.latin.darkMode"
            if (r5 == 0) goto L_0x0061
            boolean r7 = r5.contains(r6)
            if (r7 != 0) goto L_0x0062
            java.lang.String r7 = ","
            java.lang.String r5 = r5.concat(r7)
            java.lang.String r5 = r5.concat(r6)
            goto L_0x0062
        L_0x0061:
            r5 = r6
        L_0x0062:
            r4.setPrivateImeOptions(r5)
        L_0x0065:
            java.lang.String r4 = r0.f132764d
            boolean r4 = r4.isEmpty()
            java.lang.String r5 = ""
            r6 = 0
            if (r4 == 0) goto L_0x0081
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r4 = r9.f36983a
            boolean r4 = r4.hasFocus()
            if (r4 != 0) goto L_0x0081
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r4 = r9.f36983a
            r4.setHint(r1)
            r9.mo19851d(r2)
            goto L_0x0090
        L_0x0081:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            java.lang.String r4 = r0.f132764d
            r2.setText(r4)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            r2.setHint(r5)
            r9.mo19851d(r6)
        L_0x0090:
            int r2 = r0.f132761a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x00aa
            int r2 = r0.f132765e
            int r2 = com.google.assistant.p3897e.p3902c.p3907c.C50996cn.m86005a(r2)
            if (r2 != 0) goto L_0x009f
            r2 = 1
        L_0x009f:
            int r2 = r2 + -1
            if (r2 == r3) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            r4 = 3
            r2.setInputType(r4)
        L_0x00aa:
            int r2 = r0.f132761a
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00ba
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.au r4 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.au
            r4.<init>(r9, r0)
            r2.setOnClickListener(r4)
        L_0x00ba:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ax r4 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ax
            r4.<init>(r9)
            r2.addTextChangedListener(r4)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r2 = r9.f36983a
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.av r4 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.av
            r4.<init>(r9)
            r2.setOnFocusChangeListener(r4)
            int r2 = r0.f132761a
            r2 = r2 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x012c
            com.google.assistant.e.c.c.hx r2 = r0.f132767g
            if (r2 != 0) goto L_0x00da
            com.google.assistant.e.c.c.hx r2 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x00da:
            int r2 = r2.f133121a
            r2 = r2 & 16
            if (r2 == 0) goto L_0x0109
            com.google.assistant.e.c.c.hx r2 = r0.f132767g
            if (r2 != 0) goto L_0x00e6
            com.google.assistant.e.c.c.hx r2 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x00e6:
            com.google.assistant.e.c.c.dc r2 = r2.f133126f
            if (r2 != 0) goto L_0x00ec
            com.google.assistant.e.c.c.dc r2 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x00ec:
            int r4 = r2.f132815a
            r4 = r4 & 2048(0x800, float:2.87E-42)
            if (r4 == 0) goto L_0x00fe
            com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a r4 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.b.a
            android.content.Context r7 = r9.getContext()
            java.lang.String r8 = r2.f132824j
            r4.<init>(r7, r8, r8)
            goto L_0x00ff
        L_0x00fe:
            r4 = 0
        L_0x00ff:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r7 = r9.f36988f
            r7.mo19786b(r2, r4)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ImageComponent r2 = r9.f36988f
            r2.setVisibility(r6)
        L_0x0109:
            com.google.assistant.e.c.c.hx r2 = r0.f132767g
            if (r2 != 0) goto L_0x0110
            com.google.assistant.e.c.c.hx r4 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            goto L_0x0111
        L_0x0110:
            r4 = r2
        L_0x0111:
            int r4 = r4.f133122b
            if (r4 != r3) goto L_0x012c
            android.widget.TextView r4 = r9.f36986d
            if (r2 != 0) goto L_0x011b
            com.google.assistant.e.c.c.hx r2 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
        L_0x011b:
            int r7 = r2.f133122b
            if (r7 != r3) goto L_0x0124
            java.lang.Object r2 = r2.f133123c
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0124:
            r4.setText(r5)
            android.widget.TextView r2 = r9.f36986d
            r2.setVisibility(r6)
        L_0x012c:
            r9.mo19849a()
            com.google.android.libraries.assistant.assistantactions.rendering.c.c r2 = r9.f37153l
            if (r2 == 0) goto L_0x0171
            com.google.assistant.e.j.e.eu r2 = r2.f36729a
            int r2 = r2.f136275c
            r3 = 22
            if (r2 != r3) goto L_0x016c
            java.lang.String r2 = r0.f132764d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x014b
            android.widget.TextView r1 = r9.f36987e
            java.lang.String r0 = r0.f132764d
            r1.setText(r0)
            goto L_0x015e
        L_0x014b:
            android.widget.TextView r0 = r9.f36987e
            r0.setText(r1)
            android.widget.TextView r0 = r9.f36987e
            android.content.Context r1 = r9.f37159r
            r2 = 2130969911(0x7f040537, float:1.7548517E38)
            int r1 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e.m26908a(r1, r2)
            r0.setTextColor(r1)
        L_0x015e:
            android.widget.TextView r0 = r9.f36987e
            r0.setVisibility(r6)
            com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aw r0 = new com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.aw
            r0.<init>(r9)
            r9.setOnClickListener(r0)
            return
        L_0x016c:
            com.google.android.libraries.assistant.assistantactions.rendering.ui.components.ActionEditText r0 = r9.f36983a
            r0.setVisibility(r6)
        L_0x0171:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.EditableTextField.mo19809b():void");
    }

    /* renamed from: c */
    public final void mo19850c(String str) {
        this.f36984b = true;
        this.f36983a.setText(str);
    }

    /* renamed from: d */
    public final void mo19851d(int i) {
        if (this.f37160s == 2) {
            this.f36985c.setVisibility(8);
        } else {
            this.f36985c.setVisibility(i);
        }
    }

    /* renamed from: o */
    public final void mo19841o() {
        this.f36983a.requestFocus();
        this.f36983a.requestFocusFromTouch();
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36985c = (TextView) findViewById(R.id.editable_text_field_title);
        this.f36986d = (TextView) findViewById(R.id.editable_text_field_label);
        this.f36983a = (ActionEditText) findViewById(R.id.edit_text);
        this.f36987e = (TextView) findViewById(R.id.edit_text_display);
        this.f36983a.setFocusableInTouchMode(true);
        mo19853q(this.f37151j);
        this.f36988f = (ImageComponent) findViewById(R.id.editable_text_field_icon);
    }

    /* renamed from: p */
    public final void mo19843p() {
        this.f36983a.clearFocus();
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

    /* renamed from: q */
    public final void mo19853q(boolean z) {
        this.f37151j = z;
        if (this.f37160s == 2) {
            int a = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_edit_text_view_hint_iris_color);
            int a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_edit_text_view_text_iris_color);
            this.f36983a.setHintTextColor(a);
            this.f36983a.setTextColor(a2);
            this.f36983a.setBackgroundTintList((ColorStateList) null);
            if (this.f37151j || TextUtils.isEmpty(this.f36983a.getText())) {
                this.f36983a.setBackground(getContext().getDrawable(R.drawable.editable_text_field_background));
            } else {
                this.f36983a.setBackground(getContext().getDrawable(R.drawable.editable_text_field_background_confirmation));
            }
        } else if (z) {
            int a3 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_highlight_field_color);
            this.f36985c.setTextColor(a3);
            this.f36983a.setHintTextColor(a3);
            this.f36983a.setTextColor(a3);
            this.f36983a.setBackgroundTintList(ColorStateList.valueOf(a3));
        } else {
            int a4 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_nonhighlight_field_title_color);
            this.f36985c.setTextColor(a4);
            this.f36983a.setHintTextColor(a4);
            int a5 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_nonhighlight_field_color);
            this.f36983a.setTextColor(a5);
            this.f36983a.setBackgroundTintList(ColorStateList.valueOf(a5));
        }
    }
}
