package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCard */
/* compiled from: PG */
public class ReceiptCard extends C11407n {

    /* renamed from: a */
    private ImageComponent f37022a;

    /* renamed from: b */
    private TextView f37023b;

    /* renamed from: c */
    private TextView f37024c;

    /* renamed from: d */
    private View f37025d;

    /* renamed from: e */
    private LinearLayout f37026e;

    /* renamed from: f */
    private ImageComponent f37027f;

    /* renamed from: g */
    private TextView f37028g;

    public ReceiptCard(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51119hb hbVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 26) {
                hbVar = (C51119hb) euVar.f136278f;
            } else {
                hbVar = C51119hb.f133058f;
            }
            if ((hbVar.f133060a & 4) != 0) {
                ImageComponent imageComponent = this.f37022a;
                imageComponent.f36858e = true;
                C51012dc dcVar = hbVar.f133063d;
                if (dcVar == null) {
                    dcVar = C51012dc.f132813k;
                }
                imageComponent.mo19786b(dcVar, (Drawable) null);
                C51012dc dcVar2 = hbVar.f133063d;
                if (dcVar2 == null) {
                    dcVar2 = C51012dc.f132813k;
                }
                if ((dcVar2.f132815a & 32) != 0) {
                    this.f37022a.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.fluid_action_receipt_card_image_size_image_loaded_by_app_icon_identifier);
                    this.f37022a.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.fluid_action_receipt_card_image_size_image_loaded_by_app_icon_identifier);
                    this.f37022a.requestLayout();
                }
                this.f37022a.setVisibility(0);
            }
            if ((hbVar.f133060a & 1) != 0) {
                this.f37023b.setText(hbVar.f133061b);
                this.f37023b.setVisibility(0);
            }
            if ((hbVar.f133060a & 2) != 0) {
                this.f37024c.setText(hbVar.f133062c);
                this.f37024c.setVisibility(0);
            }
            if ((hbVar.f133060a & 8) != 0) {
                this.f37025d.setVisibility(0);
                this.f37026e.setVisibility(0);
                C51118ha haVar = hbVar.f133064e;
                if (haVar == null) {
                    haVar = C51118ha.f133049g;
                }
                LinearLayout linearLayout = this.f37026e;
                C28292j jVar = new C28292j((haVar.f133051a & 16) != 0 ? haVar.f133056f : 78263);
                jVar.mo33795i(5);
                jVar.mo33795i(4);
                C28295m.m52919e(linearLayout, jVar);
                if ((haVar.f133051a & 2) != 0) {
                    ImageComponent imageComponent2 = this.f37027f;
                    imageComponent2.f36858e = true;
                    C51012dc dcVar3 = haVar.f133055e;
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    imageComponent2.mo19786b(dcVar3, (Drawable) null);
                    this.f37027f.setVisibility(0);
                }
                if ((haVar.f133051a & 1) != 0) {
                    this.f37028g.setText(haVar.f133054d);
                    this.f37028g.setVisibility(0);
                }
                int i = haVar.f133052b;
                if (i == 4 || i == 3) {
                    this.f37026e.setOnClickListener(new C11382bo(this, haVar));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37022a = (ImageComponent) findViewById(R.id.receipt_card_image);
        this.f37023b = (TextView) findViewById(R.id.receipt_card_title);
        this.f37024c = (TextView) findViewById(R.id.receipt_card_description);
        this.f37025d = findViewById(R.id.receipt_card_divider);
        this.f37026e = (LinearLayout) findViewById(R.id.follow_on_action_view);
        this.f37027f = (ImageComponent) findViewById(R.id.follow_on_action_image_view);
        this.f37028g = (TextView) findViewById(R.id.follow_on_action_name_view);
    }

    public ReceiptCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReceiptCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReceiptCard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
