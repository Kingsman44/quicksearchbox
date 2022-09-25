package com.google.android.apps.gsa.staticplugins.accl.performers.communication;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.gsa.assistant.shared.C73846br;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6727dt.C85455a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.staticplugins.accl.performers.communication.ChatPerformer;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.communication.l */
/* compiled from: PG */
public final /* synthetic */ class C93040l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatPerformer f259531a;

    /* renamed from: b */
    public final /* synthetic */ String f259532b;

    /* renamed from: c */
    public final /* synthetic */ String f259533c;

    /* renamed from: d */
    public final /* synthetic */ String f259534d;

    /* renamed from: e */
    public final /* synthetic */ C51098gh f259535e;

    /* renamed from: f */
    public final /* synthetic */ C52321nk f259536f;

    public /* synthetic */ C93040l(ChatPerformer chatPerformer, String str, String str2, String str3, C51098gh ghVar, C52321nk nkVar) {
        this.f259531a = chatPerformer;
        this.f259532b = str;
        this.f259533c = str2;
        this.f259534d = str3;
        this.f259535e = ghVar;
        this.f259536f = nkVar;
    }

    public final C60870cx apply(Object obj) {
        ChatPerformer chatPerformer = this.f259531a;
        String str = this.f259532b;
        String str2 = this.f259533c;
        String str3 = this.f259534d;
        C51098gh ghVar = this.f259535e;
        C52321nk nkVar = this.f259536f;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            ((C89859i) chatPerformer.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_NO_IMAGE_URI);
            throw new RuntimeException("Image uri missing.");
        } else if (str.isEmpty()) {
            ((C59052c) ((C59052c) ChatPerformer.f259389a.mo56224b()).mo56372aa(13165)).mo56386p("Empty provider, send MMS message");
            C85455a aVar = new C85455a();
            aVar.f231280a = ((C73846br) axVar.mo56107c()).mo65332b();
            aVar.f231283d = new String[]{str2};
            aVar.f231281b = str3;
            aVar.f231282c = C58485gu.m89846n(((C73846br) axVar.mo56107c()).mo65331a());
            return chatPerformer.mo87501d(aVar.mo78984a(), true);
        } else {
            ChatPerformer.ResultReceiverCallback resultReceiverCallback = new ChatPerformer.ResultReceiverCallback();
            chatPerformer.f259398j = resultReceiverCallback;
            if (chatPerformer.mo87506j(ghVar, str2, str3, axVar, C58833ax.m90834k(resultReceiverCallback), nkVar.f137335h)) {
                return chatPerformer.f259398j.f259412a;
            }
            if (chatPerformer.mo87508l(ghVar, str2, str3, axVar)) {
                return C60856cj.m92900i(C118826c.f331422a);
            }
            new Handler(Looper.getMainLooper()).post(new C92993ad(chatPerformer));
            ((C89859i) chatPerformer.f259394f.mo27525b()).mo83702b(C89849ae.OPA_CHAT_PERFORMER_SEND_MSG_FAILED);
            throw new RuntimeException("Failed to send screenshot via private or public API.");
        }
    }
}
