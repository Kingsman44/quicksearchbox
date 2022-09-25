package com.google.android.libraries.search.assistant.proactive.surveys;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.surveys.C43170k;
import com.google.android.libraries.surveys.C43171l;

/* renamed from: com.google.android.libraries.search.assistant.proactive.surveys.j */
/* compiled from: PG */
public final /* synthetic */ class C36349j implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C36357r f94935a;

    /* renamed from: b */
    public final /* synthetic */ String f94936b;

    /* renamed from: c */
    public final /* synthetic */ Account f94937c;

    public /* synthetic */ C36349j(C36357r rVar, String str, Account account) {
        this.f94935a = rVar;
        this.f94936b = str;
        this.f94937c = account;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C36357r rVar = this.f94935a;
        String str = this.f94936b;
        Account account = this.f94937c;
        C36350k kVar = new C36350k(rVar, cVar, str);
        Context context = rVar.f94955a;
        if (context == null) {
            throw new IllegalArgumentException("Client context is not set.");
        } else if (!TextUtils.isEmpty(str)) {
            C43171l.m75930b(new C43170k(context, str, kVar, (String) null, account, false));
            return "downloadSurveyData";
        } else {
            throw new IllegalArgumentException("Trigger ID cannot be null or empty.");
        }
    }
}
