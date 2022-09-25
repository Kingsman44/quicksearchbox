package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C50931ac;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52475tc;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C52056o;
import com.google.common.p4522b.C58733pz;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.features.productivity.AlarmFeatureFormInputProcessor$progressCreateAlarmDialog$cancelResponse$1", mo61344c = "AlarmFeatureFormInputProcessor.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.i */
/* compiled from: PG */
final class C33087i extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C33092n f88594a;

    /* renamed from: b */
    final /* synthetic */ C33080b f88595b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33087i(C33092n nVar, C33080b bVar, C69577g gVar) {
        super(1, gVar);
        this.f88594a = nVar;
        this.f88595b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33087i(this.f88594a, this.f88595b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C50936ah ahVar;
        String str;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C33080b bVar = this.f88595b;
        C52490tr trVar = bVar.f88559a;
        if (trVar.f137798b != 9 || (trVar.f137797a & 1) == 0 || !((C52475tc) trVar.f137799c).f137747b) {
            return null;
        }
        Optional g = C33136x.m61490g(trVar.f137800d, bVar.f88560b);
        if (!g.isPresent()) {
            return null;
        }
        C51941eu euVar = (C51941eu) g.get();
        if (euVar.f136277e == 17) {
            ahVar = (C50936ah) euVar.f136278f;
        } else {
            ahVar = C50936ah.f132593m;
        }
        C50931ac a = C50931ac.m85981a(ahVar.f132602h);
        if (a == null) {
            a = C50931ac.DEFAULT;
        }
        if (a != C50931ac.CANCEL) {
            return null;
        }
        C52091ex a2 = C33119g.m61465a(bVar.f88563e);
        C69664n.m101060f(a2, "updatedConversationParams");
        C33080b h = C33092n.m61386h(bVar, a2);
        Context context = h.f88562d;
        String str2 = h.f88560b.f136321e;
        C69664n.m101060f(str2, "formState.showNativeFormArgs.id");
        if (C69664n.m101066l(str2, "CreateAlarm")) {
            str = context.getString(R.string.assistantactions_create_alarm_cancel_card_text);
            C69664n.m101060f(str, "context.getString(R.stri…e_alarm_cancel_card_text)");
        } else if (C69664n.m101066l(str2, "DeleteAlarm")) {
            str = context.getString(R.string.assistantactions_delete_alarm_cancel_card_text);
            C69664n.m101060f(str, "context.getString(R.stri…e_alarm_cancel_card_text)");
        } else {
            str = context.getString(R.string.assistantactions_confirmation_card_cancel_text);
            C69664n.m101060f(str, "context.getString(R.stri…rmation_card_cancel_text)");
        }
        C69469c cVar = new C69469c(10);
        cVar.add(C33116d.m61444c(str, h.f88561c, C51936ep.ALARM));
        cVar.add(C33116d.m61448g(C52056o.f136624a));
        C52081en b = C33118f.m61461b(C69540x.m100943a(cVar), C58733pz.f156496a, h.f88563e);
        C69664n.m101060f(b, "createConversationDeltaW…State.conversationParams)");
        return b;
    }
}
