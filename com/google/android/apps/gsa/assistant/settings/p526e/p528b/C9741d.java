package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.handoff.AssistantHandoffActivity;
import com.google.android.apps.gsa.assistant.settings.p526e.C9751c;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.d */
/* compiled from: PG */
public final class C9741d implements C73740a {

    /* renamed from: a */
    public final C9751c f33635a;

    /* renamed from: b */
    private final h f33636b;

    /* renamed from: c */
    private final C91097g f33637c;

    /* renamed from: d */
    private final Context f33638d;

    public C9741d(h hVar, C91097g gVar, Context context, C9751c cVar) {
        this.f33636b = hVar;
        this.f33637c = gVar;
        this.f33638d = context;
        this.f33635a = cVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "casProviderNativeInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public void linkAccount(String str) {
        Intent putExtra = new Intent(this.f33638d, AssistantHandoffActivity.class).putExtra("return_url_param", "end_uri").putExtra("result_message_param", "status").putExtra("uri", str);
        Account a = this.f33636b.a();
        String str2 = a != null ? a.name : null;
        if (str2 != null) {
            putExtra.putExtra("account_name", str2);
        }
        this.f33637c.mo65090b(putExtra, new C9740c(this));
    }
}
