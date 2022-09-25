package com.google.android.libraries.assistant.p1535p;

import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.libraries.assistant.p.b */
/* compiled from: PG */
public abstract class C18522b {
    /* renamed from: c */
    public static C18509a m35986c() {
        C18523c cVar = new C18523c();
        cVar.f52495d = "com.google.android.googlequicksearchbox";
        cVar.f52493b = new Bundle();
        return cVar;
    }

    /* renamed from: a */
    public final Intent mo24031a() {
        return new Intent().setPackage(mo24035f()).setAction("com.google.android.googlequicksearchbox.action.ASSISTANT_SETTINGS").putExtra("account_name", mo24033d()).putExtra("assistant_settings_feature", mo24034e()).putExtras(mo24032b());
    }

    /* renamed from: b */
    public abstract Bundle mo24032b();

    /* renamed from: d */
    public abstract String mo24033d();

    /* renamed from: e */
    public abstract String mo24034e();

    /* renamed from: f */
    public abstract String mo24035f();
}
