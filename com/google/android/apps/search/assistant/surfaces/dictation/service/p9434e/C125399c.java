package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.android.libraries.search.p2904c.C37344ai;
import com.google.android.libraries.search.p2904c.C37348am;
import com.google.common.p4526f.C59052c;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.c */
/* compiled from: PG */
public final /* synthetic */ class C125399c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C125411o f345846a;

    public /* synthetic */ C125399c(C125411o oVar) {
        this.f345846a = oVar;
    }

    public final void accept(Object obj) {
        C125411o oVar = this.f345846a;
        C37348am amVar = (C37348am) obj;
        C37344ai a = C37344ai.m66353a(amVar.f99208b);
        if (a == null) {
            a = C37344ai.UNKNOWN_RELEASING_STATUS;
        }
        if (!a.equals(C37344ai.RELEASED)) {
            C59052c cVar = (C59052c) ((C59052c) C125411o.f345861a.mo56226d()).mo56372aa(36498);
            C61301b bVar = oVar.f345877q;
            C37344ai a2 = C37344ai.m66353a(amVar.f99208b);
            if (a2 == null) {
                a2 = C37344ai.UNKNOWN_RELEASING_STATUS;
            }
            C69664n.m101061g(a2, "<this>");
            cVar.mo56354G("%s: Failed to release audio focus: %s [SD]", bVar, C126290c.m206496a(Integer.valueOf(a2.f99196g)));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
