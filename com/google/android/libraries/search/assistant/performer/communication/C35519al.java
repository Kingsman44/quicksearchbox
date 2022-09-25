package com.google.android.libraries.search.assistant.performer.communication;

import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52321nk;
import com.google.common.base.C58894dd;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.net.p4726a.p4727a.C62722b;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.al */
/* compiled from: PG */
public final /* synthetic */ class C35519al implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ ChatMessageExecutor f93267a;

    /* renamed from: b */
    public final /* synthetic */ String f93268b;

    /* renamed from: c */
    public final /* synthetic */ String f93269c;

    /* renamed from: d */
    public final /* synthetic */ String f93270d;

    /* renamed from: e */
    public final /* synthetic */ C52321nk f93271e;

    /* renamed from: f */
    public final /* synthetic */ C51098gh f93272f;

    /* renamed from: g */
    public final /* synthetic */ String f93273g;

    public /* synthetic */ C35519al(ChatMessageExecutor chatMessageExecutor, String str, String str2, String str3, C52321nk nkVar, C51098gh ghVar, String str4) {
        this.f93267a = chatMessageExecutor;
        this.f93268b = str;
        this.f93269c = str2;
        this.f93270d = str3;
        this.f93271e = nkVar;
        this.f93272f = ghVar;
        this.f93273g = str4;
    }

    public final C60870cx apply(Object obj) {
        ChatMessageExecutor chatMessageExecutor = this.f93267a;
        String str = this.f93268b;
        String str2 = this.f93269c;
        String str3 = this.f93270d;
        C52321nk nkVar = this.f93271e;
        C51098gh ghVar = this.f93272f;
        String str4 = this.f93273g;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            chatMessageExecutor.f93204e.mo19974a(C37176a.f97078ek.mo40805c(C62722b.INVALID_ARGUMENT));
            throw new C58894dd("Image uri missing.");
        } else if (str.isEmpty()) {
            ((C59052c) ((C59052c) ChatMessageExecutor.f93200a.mo56224b()).mo56372aa(51618)).mo56386p("Empty provider, send MMS message");
            C35667db e = C35668dc.m64073e();
            e.mo39787c(((C35545bd) optional.get()).mo39696b());
            e.mo39788d(C58485gu.m89846n(str2));
            e.mo39789e(str3);
            e.mo39786b(C58485gu.m89846n(((C35545bd) optional.get()).mo39695a()));
            return chatMessageExecutor.mo39661f(e.mo39790f(), true);
        } else if (!nkVar.f137335h || !"com.whatsapp".equals(str)) {
            return C2169h.m6027a(new C35522ao(chatMessageExecutor, ghVar, str4, str2, str3, nkVar, optional));
        } else {
            return chatMessageExecutor.mo39660e(ghVar, str4, str2, str3, optional);
        }
    }
}
