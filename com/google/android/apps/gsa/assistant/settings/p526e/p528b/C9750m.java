package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.m */
/* compiled from: PG */
public final class C9750m implements C73740a {

    /* renamed from: a */
    private final Context f33660a;

    /* renamed from: b */
    private final C87568k f33661b;

    public C9750m(Context context, C87568k kVar) {
        this.f33661b = kVar;
        this.f33660a = context;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "assistantSettingsOpaStarter";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public void startWithQuery(String str) {
        C87568k kVar = this.f33661b;
        Context context = this.f33660a;
        C87565h hVar = new C87565h();
        hVar.f236497A = true;
        hVar.f236509M = true;
        hVar.f236560f = 1;
        hVar.f236568n = str;
        kVar.mo81688b(context, hVar.mo81685a());
    }

    @JavascriptInterface
    public void startWithQuery(String str, int i) {
        C87568k kVar = this.f33661b;
        Context context = this.f33660a;
        C87565h hVar = new C87565h();
        hVar.f236497A = true;
        hVar.f236509M = true;
        hVar.f236560f = i;
        hVar.f236568n = str;
        kVar.mo81688b(context, hVar.mo81685a());
    }
}
