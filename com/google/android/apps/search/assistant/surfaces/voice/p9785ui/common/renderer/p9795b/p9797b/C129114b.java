package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9795b.p9797b;

import android.databinding.C0118a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3902c.p3907c.C51038eb;
import com.google.assistant.p3897e.p3902c.p3907c.C51043eg;
import com.google.assistant.p3897e.p3902c.p3907c.C51044eh;
import com.google.assistant.p3897e.p3902c.p3907c.C51045ei;
import com.google.assistant.p3897e.p3902c.p3907c.C51046ej;
import com.google.assistant.p3897e.p3902c.p3907c.C51047ek;
import com.google.assistant.p3897e.p3902c.p3907c.C51055es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51097gg;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.aco;
import com.google.assistant.p3897e.p3921j.aeo;
import com.google.assistant.p3897e.p3921j.afd;
import com.google.assistant.p3897e.p3921j.aff;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63010eb;
import com.google.protobuf.MessageLite;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.b.b.b */
/* compiled from: PG */
public final /* synthetic */ class C129114b implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C129123k f354702a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f354703b;

    public /* synthetic */ C129114b(C129123k kVar, C51809dy dyVar) {
        this.f354702a = kVar;
        this.f354703b = dyVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Optional empty;
        aeo aeo;
        int i;
        C129123k kVar = this.f354702a;
        C51809dy dyVar = this.f354703b;
        if (dyVar.f135936b.equals("notification.SHOW_CARD")) {
            C63010eb parserForType = afd.f134990d.getParserForType();
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            Iterator it = dwVar.f135932a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    empty = Optional.empty();
                    break;
                }
                C52232kc kcVar = (C52232kc) it.next();
                if ("notification_show_card_args".equals(kcVar.f137065b)) {
                    try {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        empty = Optional.m71637of((MessageLite) parserForType.mo59008g(kaVar.f137061c));
                    } catch (C62974ct unused) {
                        empty = Optional.empty();
                    }
                }
            }
            if (!empty.isEmpty()) {
                afd afd = (afd) empty.get();
                if (!afd.equals(kVar.f354720g)) {
                    kVar.f354720g = afd;
                    if (afd.f134992a == 3) {
                        C58976aa aaVar = C58975e.f156826a;
                        kVar.f354718e.clear();
                        C129126n nVar = kVar.f354719f;
                        nVar.f354727c = 1;
                        nVar.f354726b = -1;
                    }
                    C60870cx cxVar = C60866ct.f164955a;
                    C129126n nVar2 = kVar.f354719f;
                    int i2 = nVar2.f354727c;
                    int i3 = i2 - 1;
                    if (i2 != 0) {
                        if (i3 != 0) {
                            if (i3 == 1) {
                                C59104x c = C129126n.f354725a.mo56225c();
                                c.mo56378ag(C58975e.f156826a, "ReadNotiStateMachine");
                                C0118a.m96d(c, "Unable to transition out of ERROR state", 38218, C58979ad.SMALL);
                            } else if (i3 == 2) {
                                int i4 = afd.f134992a;
                                if (i4 == 2) {
                                    int i5 = ((aff) afd.f134993b).f134998b;
                                    if (i5 >= nVar2.f354726b) {
                                        nVar2.f354726b = i5;
                                    }
                                } else if (i4 == 1) {
                                    nVar2.f354727c = 4;
                                    nVar2.f354726b = ((aeo) afd.f134993b).f134945b;
                                } else {
                                    nVar2.mo108857b(afd);
                                }
                            } else if (i3 == 3) {
                                if (afd.f134992a != 2 || (i = ((aff) afd.f134993b).f134998b) < nVar2.f354726b) {
                                    nVar2.mo108857b(afd);
                                } else {
                                    nVar2.f354727c = 3;
                                    nVar2.f354726b = i;
                                }
                            }
                        } else if (afd.f134992a == 3) {
                            nVar2.f354727c = 3;
                            nVar2.f354726b = 0;
                        } else {
                            nVar2.mo108857b(afd);
                        }
                        int i6 = nVar2.f354727c;
                        int i7 = i6 - 1;
                        if (i6 == 0) {
                            throw null;
                        } else if (i7 == 0) {
                            throw new IllegalStateException("State machine should never transition back to INITIAL state");
                        } else if (i7 != 1) {
                            if (i7 != 2) {
                                if (i7 == 3) {
                                    int a = kVar.f354719f.mo108856a();
                                    C51045ei a2 = kVar.f354718e.mo53508a(a);
                                    C51046ej ejVar = kVar.f354718e;
                                    ejVar.copyOnWrite();
                                    C51047ek ekVar = (C51047ek) ejVar.instance;
                                    C51047ek ekVar2 = C51047ek.f132921d;
                                    ekVar.f132923a |= 1;
                                    ekVar.f132925c = a;
                                    if (a2.f132915b != 5) {
                                        C51046ej ejVar2 = kVar.f354718e;
                                        aco aco = a2.f132918e;
                                        if (aco == null) {
                                            aco = aco.f134821t;
                                        }
                                        C51038eb ebVar = (C51038eb) C51045ei.f132912g.createBuilder();
                                        int i8 = aco.f134824b;
                                        ebVar.copyOnWrite();
                                        C51045ei eiVar = (C51045ei) ebVar.instance;
                                        eiVar.f132914a |= 1;
                                        eiVar.f132917d = i8;
                                        ebVar.copyOnWrite();
                                        C51045ei eiVar2 = (C51045ei) ebVar.instance;
                                        aco.getClass();
                                        eiVar2.f132918e = aco;
                                        eiVar2.f132914a |= 2;
                                        C51097gg ggVar = (C51097gg) C51098gh.f133009e.createBuilder();
                                        C51055es esVar = (C51055es) C51058ev.f132941o.createBuilder();
                                        String str = aco.f134828f;
                                        esVar.copyOnWrite();
                                        C51058ev evVar = (C51058ev) esVar.instance;
                                        str.getClass();
                                        evVar.f132943a |= 1;
                                        evVar.f132944b = str;
                                        ggVar.copyOnWrite();
                                        C51098gh ghVar = (C51098gh) ggVar.instance;
                                        C51058ev evVar2 = (C51058ev) esVar.build();
                                        evVar2.getClass();
                                        ghVar.f133013c = evVar2;
                                        ghVar.f133012b = 1;
                                        ebVar.copyOnWrite();
                                        C51045ei eiVar3 = (C51045ei) ebVar.instance;
                                        C51098gh ghVar2 = (C51098gh) ggVar.build();
                                        ghVar2.getClass();
                                        eiVar3.f132919f = ghVar2;
                                        eiVar3.f132914a |= 4;
                                        C51043eg egVar = (C51043eg) C51044eh.f132906d.createBuilder();
                                        if (afd.f134992a == 1) {
                                            aeo = (aeo) afd.f134993b;
                                        } else {
                                            aeo = aeo.f134942d;
                                        }
                                        String str2 = aeo.f134946c;
                                        egVar.copyOnWrite();
                                        C51044eh ehVar = (C51044eh) egVar.instance;
                                        str2.getClass();
                                        ehVar.f132908a |= 2;
                                        ehVar.f132910c = str2;
                                        ebVar.copyOnWrite();
                                        C51045ei eiVar4 = (C51045ei) ebVar.instance;
                                        C51044eh ehVar2 = (C51044eh) egVar.build();
                                        ehVar2.getClass();
                                        eiVar4.f132916c = ehVar2;
                                        eiVar4.f132915b = 5;
                                        ejVar2.mo53509b(a, (C51045ei) ebVar.build());
                                    }
                                }
                            } else if (i2 == 1) {
                                cxVar = C47633f.m84733g(kVar.f354716c.mo39738a()).mo51516i(new C129117e(kVar), kVar.f354715b).mo51515h(new C129118f(kVar, afd), kVar.f354715b);
                            } else {
                                int a3 = kVar.f354719f.mo108856a();
                                C51045ei a4 = kVar.f354718e.mo53508a(a3);
                                C51046ej ejVar3 = kVar.f354718e;
                                ejVar3.copyOnWrite();
                                C51047ek ekVar3 = (C51047ek) ejVar3.instance;
                                C51047ek ekVar4 = C51047ek.f132921d;
                                ekVar3.f132923a = 1 | ekVar3.f132923a;
                                ekVar3.f132925c = a3;
                                if (a4.f132915b != 4) {
                                    C51046ej ejVar4 = kVar.f354718e;
                                    aco aco2 = a4.f132918e;
                                    if (aco2 == null) {
                                        aco2 = aco.f134821t;
                                    }
                                    ejVar4.mo53509b(a3, C129123k.m210764a(aco2));
                                }
                                for (int i9 = 0; i9 < ((C51047ek) kVar.f354718e.instance).f132924b.size(); i9++) {
                                    C51045ei a5 = kVar.f354718e.mo53508a(i9);
                                    if (a5.f132915b == 5) {
                                        C59104x b = C129123k.f354714a.mo56224b();
                                        b.mo56378ag(C58975e.f156826a, "FAReadNotiAdapter");
                                        ((C59052c) ((C59052c) b).mo56372aa(38217)).mo56387q("onPreviewState, update reply MessageCard#%d to preview card", i9);
                                        C51046ej ejVar5 = kVar.f354718e;
                                        aco aco3 = a5.f132918e;
                                        if (aco3 == null) {
                                            aco3 = aco.f134821t;
                                        }
                                        ejVar5.mo53509b(i9, C129123k.m210764a(aco3));
                                    }
                                }
                            }
                            C59104x b2 = C129123k.f354714a.mo56224b();
                            b2.mo56378ag(C58975e.f156826a, "FAReadNotiAdapter");
                            C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(38211);
                            String a6 = C129125m.m210766a(i2);
                            int i10 = kVar.f354719f.f354727c;
                            String a7 = C129125m.m210766a(i10);
                            if (i10 != 0) {
                                cVar.mo56354G("State transition: %s -> %s", a6, a7);
                                return C60922j.m93044g(cxVar, C47810es.m84963c(new C129119g(kVar)), kVar.f354715b);
                            }
                            throw null;
                        } else {
                            throw new IllegalStateException("State machine transitioned to ERROR state");
                        }
                    } else {
                        throw null;
                    }
                } else {
                    throw new C129122j("Duplicate notification.SHOW_CARD ClientOp");
                }
            } else {
                throw new IllegalArgumentException("Failed to parse notification_show_card_args");
            }
        } else {
            throw new IllegalArgumentException(String.format("Unsupported ClientOp to adapt: %s", new Object[]{dyVar.f135936b}));
        }
    }
}
