package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.fields;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p639c.C11295c;
import com.google.assistant.p3897e.p3902c.p3907c.C50986cd;
import com.google.assistant.p3897e.p3902c.p3907c.C50987ce;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.fields.DividerField */
/* compiled from: PG */
public class DividerField extends C11407n {

    /* renamed from: a */
    View f36976a;

    public DividerField(Context context) {
        super(context);
    }

    /* renamed from: b */
    public final void mo19809b() {
        C50987ce ceVar;
        super.mo19809b();
        C11295c cVar = this.f37153l;
        if (cVar != null) {
            C51941eu euVar = cVar.f36729a;
            if (euVar.f136277e == 30) {
                ceVar = (C50987ce) euVar.f136278f;
            } else {
                ceVar = C50987ce.f132736c;
            }
            int a = C50986cd.m86002a(ceVar.f132739b);
            if (a != 0 && a == 2) {
                this.f36976a.setBackground(this.f37159r.getDrawable(R.drawable.divider_solid_line));
            } else {
                this.f36976a.setBackgroundColor(this.f37159r.getResources().getColor(R.color.agsa_color_transparent, this.f37159r.getTheme()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f36976a = findViewById(R.id.divider);
    }

    public DividerField(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DividerField(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DividerField(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
