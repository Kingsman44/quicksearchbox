package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11307e;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51014de;
import com.google.assistant.p3897e.p3902c.p3907c.C51140hw;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.TextLabelField */
/* compiled from: PG */
public class TextLabelField extends C11407n {

    /* renamed from: a */
    private TextView f37038a;

    /* renamed from: b */
    private TextView f37039b;

    /* renamed from: c */
    private ImageComponent f37040c;

    public TextLabelField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m27074a(TextView textView, int i) {
        textView.setTextAppearance(i);
        textView.setLineSpacing((float) ((int) getContext().obtainStyledAttributes(i, new int[]{16843287}).getDimension(1, 20.0f)), 1.0f);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51141hx hxVar;
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 3) {
                hxVar = (C51141hx) euVar.f136278f;
            } else {
                hxVar = C51141hx.f133119h;
            }
            if ((hxVar.f133121a & 32) != 0) {
                this.f37038a.setText(hxVar.f133127g);
                this.f37038a.setVisibility(0);
            }
            int i = hxVar.f133122b;
            int i2 = 1;
            if (i == 1) {
                this.f37039b.setText((String) hxVar.f133123c);
                this.f37039b.setVisibility(0);
            } else if (i == 6) {
                this.f37039b.setText(C11307e.m26910c((alf) hxVar.f133123c));
                this.f37039b.setVisibility(0);
            }
            if (this.f37160s == 1) {
                C51140hw a = C51140hw.m86041a(hxVar.f133125e);
                if (a == null) {
                    a = C51140hw.DEFAULT;
                }
                if (!this.f37155n.mo19521b(30)) {
                    switch (a.ordinal()) {
                        case 1:
                            m27074a(this.f37039b, R.style.text_label_default_type_text);
                            this.f37039b.setTextColor(C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_title_color));
                            break;
                        case 2:
                            m27074a(this.f37039b, R.style.text_label_default_type_text);
                            this.f37039b.setTextColor(C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_error_color));
                            break;
                        case 3:
                            m27074a(this.f37039b, R.style.text_label_confirmation_title_type_text);
                            break;
                        case 4:
                            m27074a(this.f37039b, R.style.text_label_confirmation_primary_type_text);
                            break;
                        case 5:
                            m27074a(this.f37039b, R.style.text_label_confirmation_secondary_type_text);
                            break;
                        case 6:
                            m27074a(this.f37039b, R.style.text_label_cancel_title_type_text);
                            break;
                        case 7:
                            m27074a(this.f37039b, R.style.text_label_default_type_text);
                            this.f37039b.setAlpha(getResources().getFloat(R.dimen.text_label_placeholder_alpha));
                            break;
                        case 8:
                            m27074a(this.f37039b, R.style.text_label_table_title_type_text);
                            this.f37039b.setTextColor(C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_table_title_color));
                            break;
                    }
                } else {
                    int a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_default_color);
                    switch (a.ordinal()) {
                        case 1:
                            m27074a(this.f37039b, R.style.material_text_label_default_type_text);
                            a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_title_color);
                            break;
                        case 2:
                            m27074a(this.f37039b, R.style.material_text_label_default_type_text);
                            a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_error_color);
                            break;
                        case 3:
                            m27074a(this.f37039b, R.style.material_text_label_confirmation_title_type_text);
                            break;
                        case 4:
                            m27074a(this.f37039b, R.style.material_text_label_confirmation_primary_type_text);
                            a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_confirmation_primary_color);
                            break;
                        case 5:
                            m27074a(this.f37039b, R.style.material_text_label_confirmation_secondary_type_text);
                            a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_confirmation_secondary_color);
                            break;
                        case 6:
                            m27074a(this.f37039b, R.style.material_text_label_cancel_title_type_text);
                            break;
                        case 7:
                            m27074a(this.f37039b, R.style.material_text_label_default_type_text);
                            this.f37039b.setAlpha(getResources().getFloat(R.dimen.text_label_placeholder_alpha));
                            break;
                        case 8:
                            m27074a(this.f37039b, R.style.material_text_label_table_title_type_text);
                            a2 = C11307e.m26908a(this.f37159r, R.attr.fluid_actions_text_label_field_table_title_color);
                            break;
                    }
                    this.f37039b.setTextColor(a2);
                    this.f37040c.f36859f.setColorFilter(a2);
                }
            }
            C51012dc dcVar = hxVar.f133126f;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            if ((dcVar.f132815a & 2) != 0) {
                ImageComponent imageComponent = this.f37040c;
                C51012dc dcVar2 = hxVar.f133126f;
                String str = (dcVar2 == null ? C51012dc.f132813k : dcVar2).f132817c;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                int a3 = C51014de.m86008a(dcVar2.f132816b);
                if (a3 != 0) {
                    i2 = a3;
                }
                imageComponent.mo19788d(str, i2);
                this.f37040c.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37038a = (TextView) findViewById(R.id.text_label_title);
        this.f37039b = (TextView) findViewById(R.id.text_label);
        this.f37040c = (ImageComponent) findViewById(R.id.text_label_image_component);
    }

    public TextLabelField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextLabelField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TextLabelField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
