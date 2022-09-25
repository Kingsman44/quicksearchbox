package com.google.android.libraries.search.assistant.performer.communication;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52309mz;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ao */
/* compiled from: PG */
public final /* synthetic */ class C35522ao implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93281a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f93282b;

    /* renamed from: c */
    public final /* synthetic */ String f93283c;

    /* renamed from: d */
    public final /* synthetic */ String f93284d;

    /* renamed from: e */
    public final /* synthetic */ String f93285e;

    /* renamed from: f */
    public final /* synthetic */ C52321nk f93286f;

    /* renamed from: g */
    public final /* synthetic */ Optional f93287g;

    public /* synthetic */ C35522ao(ChatMessageExecutor chatMessageExecutor, C51098gh ghVar, String str, String str2, String str3, C52321nk nkVar, Optional optional) {
        this.f93281a = chatMessageExecutor;
        this.f93282b = ghVar;
        this.f93283c = str;
        this.f93284d = str2;
        this.f93285e = str3;
        this.f93286f = nkVar;
        this.f93287g = optional;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ChatMessageExecutor chatMessageExecutor = this.f93281a;
        C51098gh ghVar = this.f93282b;
        String str = this.f93283c;
        String str2 = this.f93284d;
        String str3 = this.f93285e;
        C52321nk nkVar = this.f93286f;
        Optional optional = this.f93287g;
        int a = C52309mz.m86567a(nkVar.f137336i);
        if (a == 0) {
            a = 1;
        }
        ChatMessageExecutor.m63831h(chatMessageExecutor.mo39658c(ghVar, str, str2, str3, ChatMessageExecutor.m63830g(a), optional, new ChatMessageExecutor.ResultReceiverCallback(chatMessageExecutor.f93203d, cVar), nkVar.f137335h), cVar);
        return "sendMessageViaPrivateApi";
    }
}
