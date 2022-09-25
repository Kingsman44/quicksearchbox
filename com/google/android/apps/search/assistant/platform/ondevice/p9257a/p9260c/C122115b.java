package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c;

import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122098g;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122100i;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122101j;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.protobuf.C62917ay;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.c.b */
/* compiled from: PG */
public final class C122115b extends C122119d {

    /* renamed from: a */
    public final C62917ay f338768a;

    /* renamed from: c */
    private final C62917ay f338769c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C122115b(com.google.protobuf.C62917ay r5, com.google.protobuf.C62917ay r6) {
        /*
            r4 = this;
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r0 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o.f338758c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.m r0 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122104m) r0
            r1 = r6
            com.google.protobuf.bt r1 = (com.google.protobuf.C62940bt) r1
            com.google.protobuf.bs r1 = r1.f169971d
            int r1 = r1.f169964b
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r2 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o) r2
            r3 = 2
            r2.f338760a = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.f338761b = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.o r0 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o) r0
            r4.<init>(r0)
            r4.f338768a = r5
            r4.f338769c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.C122115b.<init>(com.google.protobuf.ay, com.google.protobuf.ay):void");
    }

    /* renamed from: a */
    public final C122099h mo105534a(MessageLite messageLite) {
        C122098g gVar = (C122098g) C122099h.f338744c.createBuilder();
        C122106o oVar = this.f338773b;
        gVar.copyOnWrite();
        C122099h hVar = (C122099h) gVar.instance;
        oVar.getClass();
        hVar.f338747b = oVar;
        hVar.f338746a |= 1;
        gVar.mo58885m(this.f338768a, messageLite);
        return (C122099h) gVar.build();
    }

    /* renamed from: b */
    public final C122101j mo105535b(MessageLite messageLite) {
        C122100i iVar = (C122100i) C122101j.f338749c.createBuilder();
        iVar.mo58885m(this.f338769c, messageLite);
        return (C122101j) iVar.build();
    }

    /* renamed from: c */
    public final MessageLite mo105536c(C122101j jVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(this.f338769c);
        jVar.mo58887l(r0);
        Object l = jVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        return (MessageLite) obj;
    }
}
