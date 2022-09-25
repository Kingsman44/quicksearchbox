package com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.libraries.assistant.p1535p.C18509a;
import com.google.android.libraries.assistant.p1535p.C18522b;
import com.google.android.libraries.assistant.p1535p.C18523c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.oobe.c */
/* compiled from: PG */
public final /* synthetic */ class C110846c implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SmartspaceOOBEActivity f308833a;

    /* renamed from: b */
    public final /* synthetic */ TextView f308834b;

    public /* synthetic */ C110846c(SmartspaceOOBEActivity smartspaceOOBEActivity, TextView textView) {
        this.f308833a = smartspaceOOBEActivity;
        this.f308834b = textView;
    }

    public final void onClick(View view) {
        SmartspaceOOBEActivity smartspaceOOBEActivity = this.f308833a;
        smartspaceOOBEActivity.f308825q.mo86704i(this.f308834b);
        if (smartspaceOOBEActivity.f308819k.mo79746e(C90059dk.f249170h)) {
            C18509a c = C18522b.m35986c();
            ((C18523c) c).f52492a = "ambient_assistant";
            smartspaceOOBEActivity.startActivityForResult(c.mo24020b().mo24031a(), 0);
            return;
        }
        smartspaceOOBEActivity.startActivity(new Intent("com.google.android.apps.gsa.smartspace.SETTINGS").setPackage("com.google.android.googlequicksearchbox").setFlags(1342701568));
    }
}
