package com.google.android.apps.gsa.staticplugins.accl.performers.p7349j;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.search.assistant.p2828y.p2845h.p2847b.C36972g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.assistant.p3897e.p3917i.p3918a.C51594nm;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.j.f */
/* compiled from: PG */
public final class C93197f extends C22538o {

    /* renamed from: a */
    public static final C59071e f259906a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.j.f");

    /* renamed from: b */
    private final C35472h f259907b;

    /* renamed from: c */
    private final C86124t f259908c;

    /* renamed from: d */
    private final C36972g f259909d;

    public C93197f(C35472h hVar, C36972g gVar, C86124t tVar) {
        this.f259907b = hVar;
        this.f259909d = gVar;
        this.f259908c = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Optional optional;
        Optional empty;
        if (this.f259908c.mo79746e(C90126fx.f251739oW)) {
            if (dyVar == null) {
                ((C59052c) ((C59052c) f259906a.mo56225c()).mo56372aa(13441)).mo56386p("ClientOp is null.");
                optional = Optional.empty();
            } else if (!dyVar.f135936b.equals("timer.CREATE_TIMER")) {
                ((C59052c) ((C59052c) f259906a.mo56225c()).mo56372aa(13440)).mo56354G("Expected ClientOp name: %s, actual ClientOp name: %s", "timer.CREATE_TIMER", dyVar.f135936b);
                optional = Optional.empty();
            } else {
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
                    if (kcVar.f137065b.equals("timer_params")) {
                        try {
                            C52230ka kaVar = kcVar.f137066c;
                            if (kaVar == null) {
                                kaVar = C52230ka.f137057d;
                            }
                            empty = Optional.m71637of((C51594nm) C62942bv.parseFrom((C62942bv) C51594nm.f134474f, kaVar.f137061c, C62921ba.m95368a()));
                        } catch (C62974ct unused) {
                            empty = Optional.empty();
                        }
                    }
                }
                if (empty.isEmpty()) {
                    ((C59052c) ((C59052c) f259906a.mo56225c()).mo56372aa(13439)).mo56386p("No args named timer_params found");
                    optional = Optional.empty();
                } else if ((((C51594nm) empty.get()).f134476a & 4) != 0) {
                    optional = Optional.m71637of(((C51594nm) empty.get()).f134480e);
                } else {
                    optional = Optional.empty();
                }
            }
            if (optional.isPresent()) {
                C60856cj.m92911t(this.f259909d.mo40498d((String) optional.get()), new C93196e(), C60826bg.f164896a);
            }
        }
        return this.f259907b.mo20766a(dyVar);
    }
}
