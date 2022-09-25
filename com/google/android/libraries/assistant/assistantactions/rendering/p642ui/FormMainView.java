package com.google.android.libraries.assistant.assistantactions.rendering.p642ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11284b;
import com.google.android.libraries.assistant.assistantactions.rendering.p638b.C11286d;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11301i;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields.ButtonField;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.FormMainView */
/* compiled from: PG */
public class FormMainView extends LinearLayout {

    /* renamed from: a */
    public TextView f36752a;

    /* renamed from: b */
    public C11301i f36753b;

    /* renamed from: c */
    public C11284b f36754c;

    public FormMainView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36752a = (TextView) findViewById(R.id.form_main_view_title);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f36753b != null && motionEvent.getAction() == 0) {
            this.f36753b.mo19729l();
        }
        C11284b bVar = this.f36754c;
        if (bVar != null) {
            C11286d dVar = bVar.f36703a;
            if (motionEvent.getAction() == 0) {
                for (ButtonField buttonField : dVar.f36709d) {
                    buttonField.f36920c.mo19777a();
                }
            }
        }
        return false;
    }

    public FormMainView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FormMainView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FormMainView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
