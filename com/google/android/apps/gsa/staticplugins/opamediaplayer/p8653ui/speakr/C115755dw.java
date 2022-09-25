package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import android.content.Intent;
import android.view.View;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.io.UnsupportedEncodingException;
import p3186j$.net.URLEncoder;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.dw */
/* compiled from: PG */
public final /* synthetic */ class C115755dw implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C115791fe f321023a;

    public /* synthetic */ C115755dw(C115791fe feVar) {
        this.f321023a = feVar;
    }

    public final void onClick(View view) {
        String str;
        C115791fe feVar = this.f321023a;
        if (feVar.f321113x == null) {
            C59104x d = C115791fe.f321068e.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
            ((C59052c) ((C59052c) d).mo56372aa(30060)).mo56386p("No URL initialized.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        if (!feVar.f321082N) {
            str = feVar.f321113x;
        } else {
            try {
                str = String.format("https://www.google.com/readit?url=%s", new Object[]{URLEncoder.encode(feVar.f321113x, "utf-8")});
            } catch (UnsupportedEncodingException unused) {
                C59104x d2 = C115791fe.f321068e.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "SpeakrMediaItemPageR");
                ((C59052c) ((C59052c) d2).mo56372aa(30051)).mo56389s("Unable to encode URL %s", feVar.f321113x);
                str = feVar.f321113x;
            }
        }
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        feVar.f321208b.startActivity(Intent.createChooser(intent, (CharSequence) null));
    }
}
