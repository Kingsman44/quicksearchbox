package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.view.KeyEvent;
import android.widget.TextView;
import com.google.assistant.p3861at.C49826ak;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ck */
/* compiled from: PG */
public final /* synthetic */ class C10292ck implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C10301ct f34879a;

    /* renamed from: b */
    public final /* synthetic */ C49826ak f34880b;

    public /* synthetic */ C10292ck(C10301ct ctVar, C49826ak akVar) {
        this.f34879a = ctVar;
        this.f34880b = akVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C10301ct ctVar = this.f34879a;
        C49826ak akVar = this.f34880b;
        if (i != 6) {
            return false;
        }
        ctVar.mo18400c(akVar);
        return true;
    }
}
