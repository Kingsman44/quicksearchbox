package com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1124c;

import com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.C15537a;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.a.c.a */
/* compiled from: PG */
public final /* synthetic */ class C15554a implements Function {

    /* renamed from: a */
    public final /* synthetic */ C15537a f46552a;

    public /* synthetic */ C15554a(C15537a aVar) {
        this.f46552a = aVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.libraries.assistant.auto.tng.r.a.b.a r0 = r6.f46552a
            com.google.protos.o.a.f r7 = (com.google.protos.p5127o.p5128a.C65625f) r7
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.libraries.assistant.auto.tng.r.a.b.a.p r0 = (com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a.C15553p) r0
            android.content.Context r1 = r0.f46544d
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            boolean r1 = com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a.m29571a(r2, r1)
            r2 = 2
            r3 = 1
            if (r1 != 0) goto L_0x0036
            com.google.protos.o.a.j r7 = com.google.protos.p5127o.p5128a.C65629j.f178340d
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.o.a.g r7 = (com.google.protos.p5127o.p5128a.C65626g) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r0 = r7.instance
            com.google.protos.o.a.j r0 = (com.google.protos.p5127o.p5128a.C65629j) r0
            r0.f178344c = r3
            int r1 = r0.f178342a
            r1 = r1 | r2
            r0.f178342a = r1
            com.google.protobuf.bv r7 = r7.build()
            com.google.protos.o.a.j r7 = (com.google.protos.p5127o.p5128a.C65629j) r7
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00aa
        L_0x0036:
            int r1 = r7.f178335b
            if (r1 != r3) goto L_0x003f
            java.lang.Object r7 = r7.f178336c
            com.google.bb.a.fp r7 = (com.google.p4152bb.p4153a.C55093fp) r7
            goto L_0x0041
        L_0x003f:
            com.google.bb.a.fp r7 = com.google.p4152bb.p4153a.C55093fp.f144965l
        L_0x0041:
            java.lang.String r1 = r7.f144968b
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 0
            if (r4 != 0) goto L_0x004b
            goto L_0x0065
        L_0x004b:
            com.google.bb.a.fl r7 = r7.f144970d
            if (r7 != 0) goto L_0x0051
            com.google.bb.a.fl r7 = com.google.p4152bb.p4153a.C55089fl.f144954j
        L_0x0051:
            com.google.protobuf.cq r1 = r7.f144957b
            int r1 = r1.size()
            if (r1 != r3) goto L_0x0063
            com.google.protobuf.cq r7 = r7.f144957b
            java.lang.Object r7 = r7.get(r5)
            r1 = r7
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0065
        L_0x0063:
            java.lang.String r1 = ""
        L_0x0065:
            boolean r7 = android.text.TextUtils.isEmpty(r1)
            if (r7 == 0) goto L_0x0087
            com.google.common.f.e r7 = com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1122b.p1123a.C15553p.f46541a
            com.google.common.f.x r7 = r7.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "ContactsProviderImpl"
            r7.mo56378ag(r0, r1)
            java.lang.String r0 = "#lookupContact: No name specified"
            r1 = 46153(0xb449, float:6.4674E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56372aa(r1)).mo56386p(r0)
            com.google.protos.o.a.j r7 = com.google.protos.p5127o.p5128a.C65629j.f178340d
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)
            goto L_0x00aa
        L_0x0087:
            com.google.apps.tiktok.account.data.b r7 = r0.f46547g
            com.google.apps.tiktok.account.AccountId r4 = r0.f46548h
            com.google.common.util.concurrent.cx r7 = r7.mo50246c(r4)
            com.google.android.libraries.assistant.auto.tng.v.e.a.b r4 = r0.f46549i
            com.google.common.util.concurrent.cx r4 = r4.mo23069d()
            com.google.common.util.concurrent.cx[] r2 = new com.google.common.util.concurrent.C60870cx[r2]
            r2[r5] = r7
            r2[r3] = r4
            com.google.apps.tiktok.tracing.contrib.b.j r2 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84753d(r2)
            com.google.android.libraries.assistant.auto.tng.r.a.b.a.j r3 = new com.google.android.libraries.assistant.auto.tng.r.a.b.a.j
            r3.<init>(r0, r7, r4, r1)
            java.util.concurrent.Executor r7 = r0.f46545e
            com.google.common.util.concurrent.cx r7 = r2.mo51521b(r3, r7)
        L_0x00aa:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.p1118r.p1119a.p1124c.C15554a.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
