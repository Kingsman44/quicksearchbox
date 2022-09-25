package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p031v4.app.Fragment;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2535a.C32942a;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardField */
/* compiled from: PG */
public final class ReceiptCardField extends LinearLayout implements C33177b {

    /* renamed from: a */
    public static final C59071e f89153a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardField");

    /* renamed from: b */
    public C51941eu f89154b;

    /* renamed from: c */
    public C33182g f89155c;

    /* renamed from: d */
    public C32942a f89156d;

    /* renamed from: e */
    public Fragment f89157e;

    /* renamed from: f */
    private ImageComponent f89158f = null;

    /* renamed from: g */
    private TextView f89159g = null;

    /* renamed from: h */
    private TextView f89160h = null;

    /* renamed from: i */
    private View f89161i = null;

    /* renamed from: j */
    private LinearLayout f89162j = null;

    /* renamed from: k */
    private ImageComponent f89163k = null;

    /* renamed from: l */
    private TextView f89164l = null;

    public ReceiptCardField(Context context) {
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
        C51119hb hbVar;
        ImageComponent imageComponent;
        C51941eu euVar = this.f89154b;
        if (euVar == null || this.f89155c == null || this.f89158f == null || this.f89159g == null || this.f89160h == null || this.f89161i == null || this.f89162j == null || this.f89163k == null || this.f89164l == null) {
            ((C59052c) ((C59052c) f89153a.mo56226d()).mo56372aa(51131)).mo56386p("Unable to update FormField UI due to invalid args");
            return;
        }
        C51941eu euVar2 = eVar.f88747a;
        if (euVar2 != null && !euVar2.equals(euVar)) {
            this.f89154b = euVar2;
            this.f89155c.mo38581f(euVar2);
        }
        C51941eu euVar3 = this.f89154b;
        if (euVar3.f136277e == 26) {
            hbVar = (C51119hb) euVar3.f136278f;
        } else {
            hbVar = C51119hb.f133058f;
        }
        if ((hbVar.f133060a & 4) != 0) {
            ImageComponent imageComponent2 = this.f89158f;
            imageComponent2.f88960e = true;
            C51012dc dcVar = hbVar.f133063d;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent2.mo38649b(dcVar, (Drawable) null);
            C51012dc dcVar2 = hbVar.f133063d;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            if (!((dcVar2.f132815a & 32) == 0 || (imageComponent = this.f89158f) == null)) {
                imageComponent.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.fa_receipt_card_field_image_size_loaded_by_app_icon_identifier);
                this.f89158f.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.fa_receipt_card_field_image_size_loaded_by_app_icon_identifier);
                this.f89158f.requestLayout();
            }
            this.f89158f.setVisibility(0);
        }
        if ((hbVar.f133060a & 1) != 0) {
            this.f89159g.setText(hbVar.f133061b);
            this.f89159g.setVisibility(0);
        }
        if ((hbVar.f133060a & 2) != 0) {
            this.f89160h.setText(hbVar.f133062c);
            this.f89160h.setVisibility(0);
        }
        if ((hbVar.f133060a & 8) != 0) {
            this.f89161i.setVisibility(0);
            this.f89162j.setVisibility(0);
            C51118ha haVar = hbVar.f133064e;
            if (haVar == null) {
                haVar = C51118ha.f133049g;
            }
            if ((haVar.f133051a & 2) != 0) {
                ImageComponent imageComponent3 = this.f89163k;
                imageComponent3.f88960e = true;
                C51012dc dcVar3 = haVar.f133055e;
                if (dcVar3 == null) {
                    dcVar3 = C51012dc.f132813k;
                }
                imageComponent3.mo38649b(dcVar3, (Drawable) null);
                this.f89163k.setVisibility(0);
            }
            if ((haVar.f133051a & 1) != 0) {
                this.f89164l.setText(haVar.f133054d);
                this.f89164l.setVisibility(0);
            }
            int i = haVar.f133052b;
            if (i == 4 || i == 3) {
                this.f89162j.setOnClickListener(new C33345cx(this, haVar));
            }
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
        this.f89158f = (ImageComponent) findViewById(R.id.fa_receipt_card_field_image);
        this.f89159g = (TextView) findViewById(R.id.fa_receipt_card_field_title);
        this.f89160h = (TextView) findViewById(R.id.fa_receipt_card_field_description);
        this.f89161i = findViewById(R.id.fa_receipt_card_field_divider);
        this.f89162j = (LinearLayout) findViewById(R.id.fa_receipt_card_field_follow_on_action_view);
        this.f89163k = (ImageComponent) findViewById(R.id.fa_receipt_card_field_follow_on_action_image_view);
        this.f89164l = (TextView) findViewById(R.id.fa_receipt_card_field_follow_on_action_name_view);
    }

    public ReceiptCardField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReceiptCardField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReceiptCardField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
