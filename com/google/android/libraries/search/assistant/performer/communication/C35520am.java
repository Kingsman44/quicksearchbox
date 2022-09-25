package com.google.android.libraries.search.assistant.performer.communication;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.search.assistant.performer.communication.ChatMessageExecutor;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52309mz;
import com.google.assistant.p3897e.p3921j.C52321nk;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.am */
/* compiled from: PG */
public final /* synthetic */ class C35520am implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93274a;

    /* renamed from: b */
    public final /* synthetic */ C51098gh f93275b;

    /* renamed from: c */
    public final /* synthetic */ C52321nk f93276c;

    /* renamed from: d */
    public final /* synthetic */ String f93277d;

    /* renamed from: e */
    public final /* synthetic */ String f93278e;

    /* renamed from: f */
    public final /* synthetic */ boolean f93279f;

    public /* synthetic */ C35520am(ChatMessageExecutor chatMessageExecutor, C51098gh ghVar, C52321nk nkVar, String str, String str2, boolean z) {
        this.f93274a = chatMessageExecutor;
        this.f93275b = ghVar;
        this.f93276c = nkVar;
        this.f93277d = str;
        this.f93278e = str2;
        this.f93279f = z;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        ChatMessageExecutor chatMessageExecutor = this.f93274a;
        C51098gh ghVar = this.f93275b;
        C52321nk nkVar = this.f93276c;
        String str = this.f93277d;
        String str2 = this.f93278e;
        boolean z = this.f93279f;
        String b = C35547bf.m63904b(nkVar);
        int a = C52309mz.m86567a(nkVar.f137336i);
        if (a == 0) {
            a = 1;
        }
        ChatMessageExecutor.m63831h(chatMessageExecutor.mo39658c(ghVar, b, str, str2, ChatMessageExecutor.m63830g(a), Optional.empty(), new ChatMessageExecutor.ResultReceiverCallback(chatMessageExecutor.f93203d, cVar), z), cVar);
        return "sendMessageViaPrivateApi";
    }
}
