package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.search.core.p6513aj.C84556p;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.d */
/* compiled from: PG */
final class C110847d extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ SmartspaceOOBEActivity f308835a;

    public C110847d(SmartspaceOOBEActivity smartspaceOOBEActivity) {
        this.f308835a = smartspaceOOBEActivity;
    }

    public final void onClick(View view) {
        this.f308835a.f308825q.mo86704i(this);
        SmartspaceOOBEActivity smartspaceOOBEActivity = this.f308835a;
        String x = smartspaceOOBEActivity.f308819k.mo79758x(C90017bw.f247961bW);
        String x2 = smartspaceOOBEActivity.f308819k.mo79758x(C90017bw.f247962bX);
        if (x.isEmpty()) {
            C59104x c = SmartspaceOOBEActivity.f308818j.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ssIntroAct");
            ((C59052c) ((C59052c) c).mo56372aa(26688)).mo56386p("The fallback link is empty!");
        } else if (x2.isEmpty()) {
            C58976aa aaVar = C58975e.f156826a;
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(x));
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.addFlags(C89885b.S3REQUEST_VALUE);
            smartspaceOOBEActivity.startActivity(intent);
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            Intent a = C84556p.m135246a(R.string.learn_more, Uri.parse(x), false, x2, "velvet");
            a.addFlags(C89885b.S3REQUEST_VALUE);
            smartspaceOOBEActivity.startActivity(a);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.f308835a.getResources().getColor(R.color.aa_link_text_color));
        textPaint.setUnderlineText(false);
    }
}
