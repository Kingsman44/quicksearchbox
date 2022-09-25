package com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.p9438a.p9440b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125045k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.C125708c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126336m;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126288a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69496am;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.nlu.hardcoded.HardcodedNluFulfillmentHandler$fulfill$2", mo61344c = "HardcodedNluFulfillmentHandler.kt", mo61345d = "invokeSuspend", mo61346e = {86})
/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.fulfillment.a.b.w */
/* compiled from: PG */
public final class C125690w extends C69572j implements C69630p {

    /* renamed from: a */
    int f346420a;

    /* renamed from: b */
    final /* synthetic */ C125691x f346421b;

    /* renamed from: c */
    final /* synthetic */ C51805du f346422c;

    /* renamed from: d */
    final /* synthetic */ C125708c f346423d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C125690w(C125691x xVar, C51805du duVar, C125708c cVar, C69577g gVar) {
        super(2, gVar);
        this.f346421b = xVar;
        this.f346422c = duVar;
        this.f346423d = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C125690w) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Optional optional;
        Optional optional2;
        C125693z zVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f346420a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C51805du duVar = this.f346422c;
            if (!duVar.f135928c.equals("dictation.GBOARD_SUGGESTION_PRESS")) {
                C126290c.m206497b(duVar.f135928c);
                C126290c.m206496a("dictation.GBOARD_SUGGESTION_PRESS");
                optional = Optional.empty();
            } else {
                C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("suggestion_chip_data");
                if (kaVar == null) {
                    ((C59052c) ((C59052c) C126336m.f348024a.mo56226d()).mo56372aa(37005)).mo56389s("Missing ClientInput param %s [SD]", C126290c.m206496a("suggestion_chip_data"));
                    optional = Optional.empty();
                } else {
                    optional = C126336m.m206593d(kaVar);
                }
            }
            C125045k kVar = (C125045k) optional.orElse(null);
            if (kVar != null) {
                C125044j jVar = C125044j.UNKNOWN;
                C125044j a = C125044j.m204969a(kVar.f345014a);
                if (a == null) {
                    a = C125044j.UNRECOGNIZED;
                }
                switch (a.ordinal()) {
                    case 1:
                        optional2 = Optional.m71637of(C125663ap.f346334a);
                        break;
                    case 2:
                        optional2 = Optional.m71637of(C125669b.f346346a);
                        break;
                    case 3:
                        optional2 = Optional.m71637of(C125661an.f346331a);
                        break;
                    case 4:
                        optional2 = Optional.m71637of(C125659al.f346329a);
                        break;
                    case 5:
                        optional2 = Optional.m71637of(C125667at.f346343a);
                        break;
                    case 6:
                        optional2 = Optional.m71637of(C125651ad.f346321a);
                        break;
                    case 7:
                        optional2 = Optional.m71637of(C125652ae.f346322a);
                        break;
                    case 8:
                        optional2 = Optional.m71637of(new C125660am(0));
                        break;
                    case 9:
                        optional2 = Optional.m71637of(new C125650ac(C125666as.SUBJECT));
                        break;
                    case 10:
                        optional2 = Optional.m71637of(new C125650ac(C125666as.BODY));
                        break;
                    case 11:
                        optional2 = Optional.m71637of(new C125533a(C58485gu.m89845m()));
                        break;
                    case 12:
                        optional2 = Optional.m71637of(C125658ak.f346328a);
                        break;
                    case 13:
                        optional2 = Optional.m71637of(C125672e.f346350a);
                        break;
                    case 14:
                        optional2 = Optional.m71637of(new C125648aa("\n"));
                        break;
                    case 15:
                        optional2 = Optional.m71637of(new C125648aa("\n\n"));
                        break;
                    case 16:
                        optional2 = Optional.m71637of(C125675h.f346353a);
                        break;
                    case 17:
                        optional2 = Optional.empty();
                        break;
                    default:
                        C59052c cVar = (C59052c) ((C59052c) C125664aq.f346335a.mo56226d()).mo56372aa(36638);
                        C125044j a2 = C125044j.m204969a(kVar.f345014a);
                        if (a2 == null) {
                            a2 = C125044j.UNRECOGNIZED;
                        }
                        cVar.mo56389s("Unrecognized SuggestionChipData: chip_id=%s [SD]", C126288a.m206492d(a2));
                        optional2 = Optional.empty();
                        break;
                }
                if (!(optional2 == null || (zVar = (C125693z) optional2.orElse(null)) == null)) {
                    C125691x xVar = this.f346421b;
                    C125686s a3 = xVar.f346427d.mo70185a(this.f346423d);
                    this.f346420a = 1;
                    obj = a3.mo107077a(zVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
            }
            return C69496am.f185918a;
        }
        List list = (List) obj;
        if (list != null) {
            return list;
        }
        return C69496am.f185918a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C125690w(this.f346421b, this.f346422c, this.f346423d, gVar);
    }
}
