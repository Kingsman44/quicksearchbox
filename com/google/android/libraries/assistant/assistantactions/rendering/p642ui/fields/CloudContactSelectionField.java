package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ButtonComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C50961bf;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.CloudContactSelectionField */
/* compiled from: PG */
public class CloudContactSelectionField extends C11407n {

    /* renamed from: a */
    private LinearLayout f36948a;

    public CloudContactSelectionField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50961bf bfVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 32) {
                bfVar = (C50961bf) euVar.f136278f;
            } else {
                bfVar = C50961bf.f132664b;
            }
            C50936ah ahVar = bfVar.f132666a;
            if (ahVar == null) {
                ahVar = C50936ah.f132593m;
            }
            ButtonComponent buttonComponent = (ButtonComponent) LayoutInflater.from(this.f37159r).inflate(R.layout.button_component, (ViewGroup) null);
            buttonComponent.mo19768a(ahVar, false, false);
            buttonComponent.setBackgroundResource(0);
            buttonComponent.setVisibility(0);
            this.f36948a.addView(buttonComponent);
            this.f36948a.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36948a = (LinearLayout) findViewById(R.id.pick_cloud_contact_container_view);
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
