package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Intent;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.UnsupportedEncodingException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.aq */
/* compiled from: PG */
public final /* synthetic */ class C115668aq implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115711cf f320860a;

    public /* synthetic */ C115668aq(C115711cf cfVar) {
        this.f320860a = cfVar;
    }

    public final void onClick(View view) {
        String str;
        C115711cf cfVar = this.f320860a;
        if (cfVar.f320952w == null) {
            C59104x d = C115711cf.f320912e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30012)).mo56386p("No URL initialized.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (!cfVar.f320920H) {
            str = cfVar.f320952w;
        } else {
            try {
                str = String.format("https://www.google.com/readit?url=%s", new Object[]{URLEncoder.encode(cfVar.f320952w, "utf-8")});
            } catch (UnsupportedEncodingException unused) {
                C59104x d2 = C115711cf.f320912e.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d2).mo56372aa(30003)).mo56389s("Unable to encode URL %s", cfVar.f320952w);
                str = cfVar.f320952w;
            }
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        cfVar.f321208b.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }
}
