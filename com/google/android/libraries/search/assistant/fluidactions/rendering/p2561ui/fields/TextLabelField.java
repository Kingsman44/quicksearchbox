package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33184i;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2560e.C33234l;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51140hw;
import com.google.assistant.p3897e.p3902c.p3907c.C51141hx;
import com.google.assistant.p3897e.p3921j.alf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51950fc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TextLabelField */
/* compiled from: PG */
public final class TextLabelField extends LinearLayout implements C33177b {

    /* renamed from: e */
    private static final C59071e f89183e = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.TextLabelField");

    /* renamed from: a */
    public C51941eu f89184a;

    /* renamed from: b */
    public C33184i f89185b;

    /* renamed from: c */
    public C33182g f89186c;

    /* renamed from: d */
    ImageComponent f89187d = null;

    /* renamed from: f */
    private TextView f89188f = null;

    /* renamed from: g */
    private TextView f89189g = null;

    public TextLabelField(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final void m61847a(TextView textView, int i) {
        textView.setTextAppearance(i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(i, new int[]{16843287, 16843551});
        textView.setLineSpacing((float) ((int) obtainStyledAttributes.getDimension(0, 20.0f)), 1.0f);
        textView.setAlpha(obtainStyledAttributes.getFloat(1, 1.0f));
        obtainStyledAttributes.recycle();
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
        C51941eu euVar;
        C51141hx hxVar;
        if (this.f89188f == null || this.f89189g == null || this.f89187d == null || (euVar = this.f89184a) == null || this.f89185b == null || this.f89186c == null) {
            ((C59052c) ((C59052c) f89183e.mo56226d()).mo56372aa(51147)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89184a = euVar2;
            this.f89186c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89184a;
        if (euVar3.f136277e == 3) {
            hxVar = (C51141hx) euVar3.f136278f;
        } else {
            hxVar = C51141hx.f133119h;
        }
        if ((hxVar.f133121a & 32) != 0) {
            this.f89188f.setText(hxVar.f133127g);
            this.f89188f.setVisibility(0);
        }
        int i = hxVar.f133122b;
        if (i == 1) {
            this.f89189g.setText((String) hxVar.f133123c);
            this.f89189g.setVisibility(0);
        } else if (i == 6) {
            this.f89189g.setText(C33234l.m61648f((alf) hxVar.f133123c));
            this.f89189g.setVisibility(0);
        }
        if (this.f89185b.f88751a == C51950fc.FORM_UI_THEME_DEFAULT) {
            C51140hw a = C51140hw.m86041a(hxVar.f133125e);
            if (a == null) {
                a = C51140hw.DEFAULT;
            }
            TextView textView = this.f89189g;
            if (!(textView == null || this.f89187d == null)) {
                int currentTextColor = textView.getCurrentTextColor();
                switch (a.ordinal()) {
                    case 1:
                        m61847a(this.f89189g, 2132152273);
                        currentTextColor = this.f89189g.getCurrentTextColor();
                        break;
                    case 2:
                        m61847a(this.f89189g, 2132152269);
                        currentTextColor = this.f89189g.getCurrentTextColor();
                        break;
                    case 3:
                        m61847a(this.f89189g, R.style.fa_text_label_field_text_confirmation_title_type);
                        break;
                    case 4:
                        m61847a(this.f89189g, R.style.fa_text_label_field_text_confirmation_primary_type);
                        currentTextColor = this.f89189g.getCurrentTextColor();
                        break;
                    case 5:
                        m61847a(this.f89189g, R.style.fa_text_label_field_text_confirmation_secondary_type);
                        currentTextColor = this.f89189g.getCurrentTextColor();
                        break;
                    case 6:
                        m61847a(this.f89189g, R.style.fa_text_label_field_text_cancel_title_type);
                        break;
                    case 7:
                        m61847a(this.f89189g, 2132152270);
                        break;
                    case 8:
                        m61847a(this.f89189g, 2132152271);
                        currentTextColor = this.f89189g.getCurrentTextColor();
                        break;
                }
                this.f89187d.mo38650c(currentTextColor);
            }
        }
        C51012dc dcVar = hxVar.f133126f;
        if (dcVar == null) {
            dcVar = C51012dc.f132813k;
        }
        if ((dcVar.f132815a & 2) != 0) {
            ImageComponent imageComponent = this.f89187d;
            C51012dc dcVar2 = hxVar.f133126f;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            imageComponent.mo38649b(dcVar2, (Drawable) null);
            this.f89187d.setVisibility(0);
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
        this.f89188f = (TextView) findViewById(R.id.text_label_title);
        this.f89189g = (TextView) findViewById(R.id.text_label);
        this.f89187d = (ImageComponent) findViewById(R.id.text_label_image_component);
    }

    public TextLabelField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TextLabelField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
