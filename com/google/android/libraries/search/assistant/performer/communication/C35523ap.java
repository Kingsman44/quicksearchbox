package com.google.android.libraries.search.assistant.performer.communication;

import android.content.Intent;
import android.net.Uri;
import android.provider.Telephony;
import com.evernote.android.state.BuildConfig;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ap */
/* compiled from: PG */
public final /* synthetic */ class C35523ap implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93288a;

    /* renamed from: b */
    public final /* synthetic */ boolean f93289b;

    /* renamed from: c */
    public final /* synthetic */ C35668dc f93290c;

    public /* synthetic */ C35523ap(ChatMessageExecutor chatMessageExecutor, boolean z, C35668dc dcVar) {
        this.f93288a = chatMessageExecutor;
        this.f93289b = z;
        this.f93290c = dcVar;
    }

    public final C60870cx apply(Object obj) {
        ChatMessageExecutor chatMessageExecutor = this.f93288a;
        boolean z = this.f93289b;
        C35668dc dcVar = this.f93290c;
        Void voidR = (Void) obj;
        if (!z) {
            return C60866ct.f164955a;
        }
        return chatMessageExecutor.f93201b.mo20101f(new Intent("android.intent.action.SENDTO", Uri.fromParts("sms", (String) dcVar.mo39792b().get(0), (String) null)).setPackage(Telephony.Sms.getDefaultSmsPackage(chatMessageExecutor.f93202c)).putExtra("android.intent.extra.TEXT", BuildConfig.FLAVOR).addFlags(32768).addFlags(268435456));
    }
}
