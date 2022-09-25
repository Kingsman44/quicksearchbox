package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p837d;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.C12717a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p855d.p856a.C12874g;
import com.google.android.libraries.gsa.conversation.clientop.C22371a;
import com.google.android.libraries.gsa.conversation.clientop.C22401b;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22534k;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import java.util.Map;
import p3186j$.util.Optional;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a */
/* compiled from: PG */
public final class C12758a {

    /* renamed from: a */
    private static final C59071e f39909a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.d.a");

    /* renamed from: b */
    private final Map f39910b;

    public C12758a(Map map) {
        this.f39910b = map;
    }

    /* renamed from: a */
    public final C60870cx mo20773a(C52076ei eiVar, Optional optional) {
        C51809dy dyVar = eiVar.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        C69464a aVar = (C69464a) this.f39910b.get(dyVar.f135936b);
        if (aVar == null) {
            return C60856cj.m92900i(C12788a.f39967b);
        }
        C22401b g = C22434e.m41866g();
        g.mo27589b(eiVar.f136669d.mo59174N());
        if (optional.isPresent()) {
            g.f61888c = C58833ax.m90834k(new C12717a((C12874g) optional.get()));
        }
        try {
            return ((C22538o) aVar.mo17428b()).mo20765a(dyVar, g.mo27588a());
        } catch (C22371a | C22428d | C22534k | C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) f39909a.mo56225c()).mo56382g(e)).mo56372aa(44449)).mo56389s("ClientOp execution failed, name: %s", dyVar.f135936b);
            return C60856cj.m92900i(C12788a.f39966a);
        }
    }
}
