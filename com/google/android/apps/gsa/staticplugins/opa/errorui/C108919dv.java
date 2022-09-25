package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dv */
/* compiled from: PG */
final class C108919dv extends ClickableSpan {

    /* renamed from: a */
    private final Context f302843a;

    /* renamed from: b */
    private final C108920dw f302844b;

    public C108919dv(Context context, C108920dw dwVar) {
        this.f302843a = context;
        this.f302844b = dwVar;
    }

    public final void onClick(View view) {
        C108920dw dwVar = this.f302844b;
        if (dwVar != null) {
            dwVar.mo97277a();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        try {
            textPaint.setColor(C19391a.m36980a(this.f302843a, R.attr.colorPrimary));
        } catch (IllegalArgumentException e) {
            C59104x c = C108925ea.f302853b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PersonalResponseFrag");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24432)).mo56386p("Not able to find color from AssistantColor");
            textPaint.setColor(this.f302843a.getResources().getColor(R.color.quantum_googblue500));
        }
    }
}
