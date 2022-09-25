package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ga */
/* compiled from: PG */
final class C108979ga extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ C108980gb f303026a;

    /* renamed from: b */
    private final Context f303027b;

    /* renamed from: c */
    private final Uri f303028c;

    public C108979ga(C108980gb gbVar, Context context, Uri uri) {
        this.f303026a = gbVar;
        this.f303027b = context;
        this.f303028c = uri;
    }

    public final void onClick(View view) {
        this.f303026a.startActivity(new Intent("android.intent.action.VIEW", this.f303028c));
    }

    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        try {
            textPaint.setColor(C19391a.m36980a(this.f303027b, R.attr.colorPrimary));
        } catch (IllegalArgumentException e) {
            C59104x c = C108980gb.f303029b.mo56225c();
            c.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24477)).mo56386p("Not able to find color from AssistantColor");
            textPaint.setColor(this.f303027b.getResources().getColor(R.color.quantum_googblue500));
        }
    }
}
