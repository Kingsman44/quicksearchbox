package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119836cd;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119843ck;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33457k;
import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.net.p4726a.p4727a.C62722b;
import kotlinx.coroutines.C71422aw;
import p5462h.C69677g;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConnectionManagerApaCallbacks$onInteractionFinished$1", mo61344c = "ConnectionManagerApaCallbacks.kt", mo61345d = "invokeSuspend", mo61346e = {163, 164})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.l */
/* compiled from: PG */
final class C126959l extends C69572j implements C69630p {

    /* renamed from: a */
    int f349584a;

    /* renamed from: b */
    final /* synthetic */ C126962o f349585b;

    /* renamed from: c */
    final /* synthetic */ C119844cl f349586c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126959l(C126962o oVar, C119844cl clVar, C69577g gVar) {
        super(2, gVar);
        this.f349585b = oVar;
        this.f349586c = clVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126959l) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        C119843ck ckVar;
        C119843ck ckVar2;
        C37252a aVar;
        C119840ch chVar;
        C119840ch chVar2;
        C119840ch chVar3;
        C69554a aVar2 = C69554a.COROUTINE_SUSPENDED;
        int i = this.f349584a;
        if (i == 0) {
            C69714l.m101134b(obj);
            C126948ah ahVar = this.f349585b.f349596d;
            C119834cb cbVar = this.f349586c.f333792c;
            if (cbVar == null) {
                cbVar = C119834cb.f333765b;
            }
            C69664n.m101060f(cbVar, "interactionResult.id");
            this.f349584a = 1;
            obj = ahVar.mo107866a(cbVar, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else if (i != 1) {
            C69714l.m101134b(obj);
            return C69788q.f186170a;
        } else {
            C69714l.m101134b(obj);
        }
        C127050h hVar = (C127050h) obj;
        C126949b bVar = this.f349585b.f349595c;
        C119844cl clVar = this.f349586c;
        this.f349584a = 2;
        C119834cb cbVar2 = clVar.f333792c;
        if (cbVar2 == null) {
            cbVar2 = C119834cb.f333765b;
        }
        String str = cbVar2.f333767a;
        C69664n.m101060f(str, "interactionResult.id.id");
        C37259h hVar2 = new C37259h(C37176a.f97098fD.f99010a);
        ((C37253b) hVar2.f99012a).mo40794r(str);
        ((C37253b) hVar2.f99012a).mo40795s("interaction", str);
        int b = C119841ci.m198738b(clVar.f333790a);
        int i2 = b - 1;
        C119836cd cdVar = C119836cd.UNKNOWN;
        C127050h hVar3 = C127050h.UNSPECIFIED;
        if (b != 0) {
            if (i2 == 0) {
                C59052c cVar = (C59052c) C126949b.f349545a.mo56224b();
                cVar.mo56379ah(new C59094n(37304));
                cVar.mo56389s("Interaction succeeds for id:%s.", str);
                if (clVar.f333790a == 2) {
                    ckVar = (C119843ck) clVar.f333791b;
                } else {
                    ckVar = C119843ck.f333783d;
                }
                if (ckVar.f333786b) {
                    obj2 = bVar.mo107868a(hVar2.mo40780d(3, "main_assistant_interaction"), this);
                    if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                        obj2 = C69788q.f186170a;
                    }
                } else {
                    if (clVar.f333790a == 2) {
                        ckVar2 = (C119843ck) clVar.f333791b;
                    } else {
                        ckVar2 = C119843ck.f333783d;
                    }
                    C33457k kVar = ckVar2.f333787c;
                    if (kVar == null) {
                        kVar = C33457k.f89561b;
                    }
                    if (kVar.f89563a.size() > 0) {
                        obj2 = bVar.mo107868a(hVar2.mo40780d(4, "main_assistant_interaction"), this);
                        if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                            obj2 = C69788q.f186170a;
                        }
                    } else {
                        obj2 = bVar.mo107868a(hVar2.mo40781e(C62722b.OK), this);
                        if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                            obj2 = C69788q.f186170a;
                        }
                    }
                }
            } else if (i2 == 1) {
                C59052c cVar2 = (C59052c) C126949b.f349545a.mo56224b();
                cVar2.mo56379ah(new C59094n(37303));
                cVar2.mo56354G("Interaction cancelled for id:%s with cancellationReason:%s.", str, hVar);
                if (hVar != null) {
                    switch (hVar.ordinal()) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 12:
                            break;
                        case 8:
                            aVar = hVar2.mo40780d(3, "main_assistant_interaction");
                            break;
                        case 9:
                            aVar = hVar2.mo40780d(5, "main_assistant_interaction");
                            break;
                        case 10:
                            aVar = hVar2.mo40780d(6, "main_assistant_interaction");
                            break;
                        case 11:
                            aVar = hVar2.mo40780d(7, "main_assistant_interaction");
                            break;
                        default:
                            throw new C69677g();
                    }
                }
                aVar = hVar2.mo40781e(C62722b.CANCELLED);
                obj2 = bVar.mo107868a(aVar, this);
                C69554a aVar3 = C69554a.COROUTINE_SUSPENDED;
                if (obj2 != aVar3) {
                    obj2 = C69788q.f186170a;
                }
                if (obj2 != aVar3) {
                    obj2 = C69788q.f186170a;
                }
            } else if (i2 == 2) {
                C59052c cVar3 = (C59052c) C126949b.f349545a.mo56226d();
                if (clVar.f333790a == 4) {
                    chVar = (C119840ch) clVar.f333791b;
                } else {
                    chVar = C119840ch.f333779b;
                }
                C34822b bVar2 = chVar.f333781a;
                if (bVar2 == null) {
                    bVar2 = C34822b.f92358d;
                }
                C34834b bVar3 = bVar2.f92362c;
                if (bVar3 == null) {
                    bVar3 = C34834b.f92401c;
                }
                Integer num = new Integer(bVar3.f92404b);
                if (clVar.f333790a == 4) {
                    chVar2 = (C119840ch) clVar.f333791b;
                } else {
                    chVar2 = C119840ch.f333779b;
                }
                C34822b bVar4 = chVar2.f333781a;
                if (bVar4 == null) {
                    bVar4 = C34822b.f92358d;
                }
                String str2 = bVar4.f92361b;
                cVar3.mo56379ah(new C59094n(37302));
                cVar3.mo56359L("Interaction failed for id:%s  errorSpace:%s  message:%s ", str, num, str2);
                if (clVar.f333790a == 4) {
                    chVar3 = (C119840ch) clVar.f333791b;
                } else {
                    chVar3 = C119840ch.f333779b;
                }
                C34822b bVar5 = chVar3.f333781a;
                if (bVar5 == null) {
                    bVar5 = C34822b.f92358d;
                }
                C34834b bVar6 = bVar5.f92362c;
                if (bVar6 == null) {
                    bVar6 = C34834b.f92401c;
                }
                C34819a b2 = C34819a.m63579b(bVar6);
                obj2 = bVar.mo107868a(hVar2.mo40780d(b2.mo39520a(), b2.mo39522e()), this);
                if (obj2 != C69554a.COROUTINE_SUSPENDED) {
                    obj2 = C69788q.f186170a;
                }
            } else if (i2 == 3) {
                C59052c cVar4 = (C59052c) C126949b.f349545a.mo56226d();
                cVar4.mo56379ah(new C59094n(37305));
                cVar4.mo56389s("Undefined result for id:%s.", str);
                obj2 = C69788q.f186170a;
            } else {
                throw new C69677g();
            }
            if (obj2 == aVar2) {
                return aVar2;
            }
            return C69788q.f186170a;
        }
        throw null;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126959l(this.f349585b, this.f349586c, gVar);
    }
}
