package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3902c.p3907c.C51118ha;
import com.google.assistant.p3897e.p3902c.p3907c.C51119hb;
import com.google.assistant.p3897e.p3902c.p3907c.C51121hd;
import com.google.assistant.p3897e.p3902c.p3907c.C51123hf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.ReceiptCardTimerField */
/* compiled from: PG */
public class ReceiptCardTimerField extends C11407n {

    /* renamed from: a */
    private ImageComponent f37030a;

    /* renamed from: b */
    private TextView f37031b;

    /* renamed from: c */
    private Chronometer f37032c;

    /* renamed from: d */
    private Button f37033d;

    /* renamed from: e */
    private final AtomicBoolean f37034e = new AtomicBoolean(false);

    public ReceiptCardTimerField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C51121hd hdVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 36) {
                hdVar = (C51121hd) euVar.f136278f;
            } else {
                hdVar = C51121hd.f133066c;
            }
            ImageComponent imageComponent = this.f37030a;
            imageComponent.f36858e = true;
            C51119hb hbVar = hdVar.f133068a;
            if (hbVar == null) {
                hbVar = C51119hb.f133058f;
            }
            C51012dc dcVar = hbVar.f133063d;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo19786b(dcVar, (Drawable) null);
            TextView textView = this.f37031b;
            C51119hb hbVar2 = hdVar.f133068a;
            if (hbVar2 == null) {
                hbVar2 = C51119hb.f133058f;
            }
            textView.setText(hbVar2.f133061b);
            C51123hf hfVar = hdVar.f133069b;
            if (hfVar == null) {
                hfVar = C51123hf.f133072c;
            }
            int i = hfVar.f133075b;
            String str = hfVar.f133074a;
            this.f37032c.setCountDown(true);
            this.f37032c.setBase(SystemClock.elapsedRealtime() + (((long) hfVar.f133075b) * 1000));
            this.f37032c.start();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f37030a = (ImageComponent) findViewById(R.id.receipt_card_timer_field_image);
        this.f37031b = (TextView) findViewById(R.id.receipt_card_timer_field_title);
        this.f37032c = (Chronometer) findViewById(R.id.receipt_card_timer_field_countdown);
        this.f37033d = (Button) findViewById(R.id.receipt_card_timer_field_button);
    }

    public final void onWindowFocusChanged(boolean z) {
        C11295c cVar;
        C51121hd hdVar;
        C51098gh ghVar;
        super.onWindowFocusChanged(z);
        if (this.f37034e.get() && this.f37033d.getVisibility() == 8 && (cVar = this.f37153l) != null && cVar.f36729a != null) {
            this.f37032c.setVisibility(8);
            C51941eu euVar = this.f37153l.f36729a;
            if (euVar.f136277e == 36) {
                hdVar = (C51121hd) euVar.f136278f;
            } else {
                hdVar = C51121hd.f133066c;
            }
            C51119hb hbVar = hdVar.f133068a;
            if (hbVar == null) {
                hbVar = C51119hb.f133058f;
            }
            C51118ha haVar = hbVar.f133064e;
            if (haVar == null) {
                haVar = C51118ha.f133049g;
            }
            if (haVar.f133052b == 4) {
                ghVar = (C51098gh) haVar.f133053c;
            } else {
                ghVar = C51098gh.f133009e;
            }
            this.f37033d.setOnClickListener(new C11385br(this, ghVar));
            this.f37033d.setText(haVar.f133054d);
            this.f37033d.setVisibility(0);
        }
        this.f37034e.set(true);
    }

    public ReceiptCardTimerField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReceiptCardTimerField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReceiptCardTimerField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
