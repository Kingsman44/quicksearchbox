package com.google.android.libraries.componentview.components.base;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.p4271bq.C56429h;
import java.util.Map;

/* renamed from: com.google.android.libraries.componentview.components.base.bo */
/* compiled from: PG */
final class C20057bo extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C20058bp f56233a;

    public C20057bo(C20058bp bpVar) {
        this.f56233a = bpVar;
    }

    public final void onClick(View view) {
        if (view instanceof TextView) {
            ((TextView) view).setMaxLines(Integer.MAX_VALUE);
            C56429h H = this.f56233a.mo25419H();
            if (H != null) {
                this.f56233a.f56236c.mo25489d(H.f150556h, (String) null, H.f150557i, (Map) null);
            }
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
    }
}
