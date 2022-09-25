package com.google.android.apps.gsa.assistant.handoff;

import android.net.Uri;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.l */
/* compiled from: PG */
final class C9479l implements C91043j {

    /* renamed from: a */
    final /* synthetic */ BrowserControlActivity f32914a;

    public C9479l(BrowserControlActivity browserControlActivity) {
        this.f32914a = browserControlActivity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17709a(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            BrowserControlActivity browserControlActivity = this.f32914a;
            if (browserControlActivity.f32852b.mo65444a(browserControlActivity, uri)) {
                return;
            }
        } else {
            ((C59052c) ((C59052c) BrowserControlActivity.f32851a.mo56225c()).mo56372aa(234)).mo56386p("The auto-login URI is null");
        }
        this.f32914a.runOnUiThread(new C9478k(this));
    }
}
