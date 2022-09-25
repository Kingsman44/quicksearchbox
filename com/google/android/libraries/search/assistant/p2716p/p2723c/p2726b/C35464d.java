package com.google.android.libraries.search.assistant.p2716p.p2723c.p2726b;

import com.google.android.libraries.assistant.gallium.framework.p1509c.p1510a.C18230a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62995dn;
import com.google.protos.p4985f.p5030q.C65123co;
import com.google.protos.p4985f.p5030q.C65124cp;
import com.google.protos.p4985f.p5030q.C65126cr;
import com.google.protos.p4985f.p5030q.C65128ct;
import com.google.protos.p4985f.p5030q.C65129cu;

/* renamed from: com.google.android.libraries.search.assistant.p.c.b.d */
/* compiled from: PG */
public final class C35464d implements C65129cu {

    /* renamed from: b */
    private static final C59071e f93156b = C59071e.m91332i("com.google.android.libraries.search.assistant.p.c.b.d");

    /* renamed from: c */
    private final C18230a f93157c;

    public C35464d(C18230a aVar) {
        this.f93157c = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo39650a(C65128ct ctVar) {
        C65124cp cpVar = (C65124cp) C65126cr.f176289b.createBuilder();
        for (Integer intValue : ctVar.f176294a) {
            int intValue2 = intValue.intValue();
            try {
                C65123co a = this.f93157c.mo23733a(intValue2);
                a.getClass();
                cpVar.copyOnWrite();
                C65126cr crVar = (C65126cr) cpVar.instance;
                C62995dn dnVar = crVar.f176291a;
                if (!dnVar.f170058b) {
                    crVar.f176291a = dnVar.mo58980a();
                }
                crVar.f176291a.put(Integer.valueOf(intValue2), a);
            } catch (IllegalArgumentException e) {
                ((C59052c) ((C59052c) ((C59052c) f93156b.mo56225c()).mo56382g(e)).mo56372aa(51215)).mo56387q("Flag ID %d requested, but not present in Flags passed into the service", intValue2);
                return C60856cj.m92899h(e);
            }
        }
        return C60856cj.m92900i((C65126cr) cpVar.build());
    }
}
