package com.google.android.libraries.search.assistant.performer.communication;

import android.net.Uri;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.as */
/* compiled from: PG */
public final /* synthetic */ class C35526as implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93294a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f93295b;

    /* renamed from: c */
    public final /* synthetic */ String f93296c;

    /* renamed from: d */
    public final /* synthetic */ String f93297d;

    /* renamed from: e */
    public final /* synthetic */ Uri f93298e;

    public /* synthetic */ C35526as(ChatMessageExecutor chatMessageExecutor, C51098gh ghVar, String str, String str2, Uri uri) {
        this.f93294a = chatMessageExecutor;
        this.f93295b = ghVar;
        this.f93296c = str;
        this.f93297d = str2;
        this.f93298e = uri;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ChatMessageExecutor chatMessageExecutor = this.f93294a;
        ChatMessageExecutor.m63831h(chatMessageExecutor.mo39659d(this.f93295b, this.f93296c, this.f93297d, BuildConfig.FLAVOR, C58485gu.m89846n(this.f93298e), "audio/*", new ChatMessageExecutor.ResultReceiverCallback(chatMessageExecutor.f93203d, cVar), false, false), cVar);
        return "sendMessageViaPrivateApiV2";
    }
}
