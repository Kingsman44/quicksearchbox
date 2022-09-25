package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33177b;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33180e;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.p2556a.C33176f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardTimerField */
/* compiled from: PG */
public final class ReceiptCardTimerField extends LinearLayout implements C33177b {

    /* renamed from: a */
    private static final C59071e f89171a = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ReceiptCardTimerField");

    /* renamed from: b */
    private final AtomicBoolean f89172b = new AtomicBoolean(false);

    public ReceiptCardTimerField(Context context) {
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
        ((C59052c) ((C59052c) f89171a.mo56226d()).mo56372aa(51138)).mo56386p("Unable to update ReceiptCardTimer UI due to invalid args");
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
        ImageComponent imageComponent = (ImageComponent) findViewById(R.id.fa_receipt_card_timer_field_image);
        TextView textView = (TextView) findViewById(R.id.fa_receipt_card_timer_field_title);
        Chronometer chronometer = (Chronometer) findViewById(R.id.fa_receipt_card_timer_field_countdown);
        Button button = (Button) findViewById(R.id.fa_receipt_card_timer_field_button);
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.f89172b.set(true);
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
