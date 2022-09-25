package com.google.android.libraries.search.assistant.performer.communication;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.ay */
/* compiled from: PG */
public final /* synthetic */ class C35532ay implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93306a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f93307b;

    /* renamed from: c */
    public final /* synthetic */ C52321nk f93308c;

    /* renamed from: d */
    public final /* synthetic */ String f93309d;

    /* renamed from: e */
    public final /* synthetic */ String f93310e;

    /* renamed from: f */
    public final /* synthetic */ C58485gu f93311f;

    /* renamed from: g */
    public final /* synthetic */ String f93312g;

    public /* synthetic */ C35532ay(ChatMessageExecutor chatMessageExecutor, C51098gh ghVar, C52321nk nkVar, String str, String str2, C58485gu guVar, String str3) {
        this.f93306a = chatMessageExecutor;
        this.f93307b = ghVar;
        this.f93308c = nkVar;
        this.f93309d = str;
        this.f93310e = str2;
        this.f93311f = guVar;
        this.f93312g = str3;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ChatMessageExecutor chatMessageExecutor = this.f93306a;
        C51098gh ghVar = this.f93307b;
        C52321nk nkVar = this.f93308c;
        String str = this.f93309d;
        String str2 = this.f93310e;
        C58485gu guVar = this.f93311f;
        String str3 = this.f93312g;
        ChatMessageExecutor.m63831h(chatMessageExecutor.mo39659d(ghVar, C35547bf.m63904b(nkVar), str, str2, guVar, str3, new ChatMessageExecutor.ResultReceiverCallback(chatMessageExecutor.f93203d, cVar), nkVar.f137335h, true), cVar);
        return "sendMessageViaPrivateApiV2";
    }
}
