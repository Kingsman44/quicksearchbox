package com.google.android.libraries.assistant.contexttrigger.p1466j;

import android.content.Context;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.j.i */
/* compiled from: PG */
public final class C17793i {

    /* renamed from: a */
    public static final C59071e f51060a = C59071e.m91332i("com.google.android.libraries.assistant.contexttrigger.j.i");

    /* renamed from: b */
    public final C42876ab f51061b;

    /* renamed from: c */
    public final C21370a f51062c;

    /* renamed from: d */
    public final Executor f51063d;

    /* renamed from: e */
    public final Context f51064e;

    /* renamed from: f */
    public final C46175b f51065f;

    /* renamed from: g */
    public final C17801q f51066g;

    public C17793i(C42876ab abVar, C21370a aVar, Executor executor, Context context, C46175b bVar, C17801q qVar) {
        this.f51061b = abVar;
        this.f51062c = aVar;
        this.f51063d = executor;
        this.f51064e = context;
        this.f51065f = bVar;
        this.f51066g = qVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (com.google.protobuf.p4750c.C62953e.m95476a(r9, r10) == 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f9, code lost:
        if (com.google.protobuf.p4750c.C62953e.m95476a(r10, r9) == 0) goto L_0x00fb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w mo23462a(com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w r9, java.lang.String r10) {
        /*
            r8 = this;
            com.google.protobuf.bn r0 = r9.toBuilder()
            com.google.android.libraries.assistant.contexttrigger.j.v r0 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17806v) r0
            r1 = 0
        L_0x0007:
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r2 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r2
            com.google.protobuf.cq r2 = r2.f51110d
            int r2 = r2.size()
            r3 = 2
            r4 = -1
            if (r1 >= r2) goto L_0x003f
            com.google.android.libraries.assistant.contexttrigger.j.u r2 = r0.mo23468a(r1)
            int r5 = r2.f51100b
            java.lang.String r6 = ""
            r7 = 1
            if (r5 != r7) goto L_0x0025
            java.lang.Object r5 = r2.f51101c
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0026
        L_0x0025:
            r5 = r6
        L_0x0026:
            boolean r5 = r5.equals(r10)
            if (r5 != 0) goto L_0x0040
            int r5 = r2.f51100b
            if (r5 != r3) goto L_0x0035
            java.lang.Object r2 = r2.f51101c
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
        L_0x0035:
            boolean r2 = r6.equals(r10)
            if (r2 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003f:
            r1 = -1
        L_0x0040:
            if (r1 != r4) goto L_0x0058
            com.google.common.f.e r10 = f51060a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r1 = "TimeContextManager"
            r10.mo56378ag(r0, r1)
            java.lang.String r0 = "No time trigger found to remove"
            r1 = 47041(0xb7c1, float:6.5918E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r1)).mo56386p(r0)
            return r9
        L_0x0058:
            com.google.android.libraries.assistant.contexttrigger.j.u r9 = r0.mo23468a(r1)
            int r10 = r9.f51102d
            r2 = 3
            if (r10 != r2) goto L_0x0066
            java.lang.Object r10 = r9.f51103e
            com.google.assistant.ag.c.z r10 = (com.google.assistant.p3803ag.p3809c.C49156z) r10
            goto L_0x0068
        L_0x0066:
            com.google.assistant.ag.c.z r10 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x0068:
            r0.mo23469b(r1)
            int r1 = r9.f51104f
            int r1 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17803s.m35057a(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0075
            goto L_0x00b3
        L_0x0075:
            if (r1 != r3) goto L_0x00b3
            com.google.protobuf.bv r9 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.fg r9 = r9.f51109c
            if (r9 != 0) goto L_0x0081
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x0081:
            com.google.protobuf.fg r1 = r10.f127114b
            if (r1 != 0) goto L_0x0087
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x0087:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r9, r1)
            if (r9 == 0) goto L_0x00a3
            com.google.protobuf.bv r9 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.fg r9 = r9.f51109c
            if (r9 != 0) goto L_0x0097
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x0097:
            com.google.protobuf.fg r10 = r10.f127115c
            if (r10 != 0) goto L_0x009d
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x009d:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r9, r10)
            if (r9 != 0) goto L_0x010a
        L_0x00a3:
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            r9.f51109c = r2
            int r10 = r9.f51107a
            r10 = r10 & -3
            r9.f51107a = r10
            goto L_0x010a
        L_0x00b3:
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r1 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r1
            com.google.protobuf.fg r1 = r1.f51108b
            if (r1 != 0) goto L_0x00bd
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x00bd:
            com.google.protobuf.fg r3 = r10.f127114b
            if (r3 != 0) goto L_0x00c3
            com.google.protobuf.fg r3 = com.google.protobuf.C63042fg.f170152c
        L_0x00c3:
            int r1 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r3)
            if (r1 == 0) goto L_0x00fb
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r1 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r1
            com.google.protobuf.fg r1 = r1.f51108b
            if (r1 != 0) goto L_0x00d3
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x00d3:
            com.google.protobuf.fg r10 = r10.f127115c
            if (r10 != 0) goto L_0x00d9
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x00d9:
            int r10 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r10)
            if (r10 == 0) goto L_0x00fb
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r10 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r10
            com.google.protobuf.fg r10 = r10.f51108b
            if (r10 != 0) goto L_0x00e9
            com.google.protobuf.fg r10 = com.google.protobuf.C63042fg.f170152c
        L_0x00e9:
            int r1 = r9.f51102d
            r3 = 4
            if (r1 != r3) goto L_0x00f3
            java.lang.Object r9 = r9.f51103e
            com.google.protobuf.fg r9 = (com.google.protobuf.C63042fg) r9
            goto L_0x00f5
        L_0x00f3:
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x00f5:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r10, r9)
            if (r9 != 0) goto L_0x010a
        L_0x00fb:
            r0.copyOnWrite()
            com.google.protobuf.bv r9 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            r9.f51108b = r2
            int r10 = r9.f51107a
            r10 = r10 & -2
            r9.f51107a = r10
        L_0x010a:
            com.google.protobuf.bv r9 = r0.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.cq r9 = r9.f51110d
            int r9 = r9.size()
            if (r9 == 0) goto L_0x011b
            com.google.android.libraries.assistant.contexttrigger.j.q r9 = r8.f51066g
            r9.mo23466b(r0)
        L_0x011b:
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i.mo23462a(com.google.android.libraries.assistant.contexttrigger.j.w, java.lang.String):com.google.android.libraries.assistant.contexttrigger.j.w");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a0, code lost:
        if (com.google.protobuf.p4750c.C62953e.m95476a(r1, r0) <= 0) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0101, code lost:
        if (com.google.protobuf.p4750c.C62953e.m95476a(r1, r0) <= 0) goto L_0x0103;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0106  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w mo23463b(com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w r8, com.google.android.libraries.assistant.contexttrigger.p1466j.C17805u r9) {
        /*
            r7 = this;
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.android.libraries.assistant.contexttrigger.j.v r8 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17806v) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r0 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r0
            r9.getClass()
            r0.mo23470a()
            com.google.protobuf.cq r0 = r0.f51110d
            r0.add(r9)
            com.google.android.libraries.f.a r0 = r7.f51062c
            long r0 = r0.mo26870b()
            com.google.protobuf.fg r0 = com.google.protobuf.p4750c.C62953e.m95484i(r0)
            int r1 = r9.f51102d
            r2 = 3
            if (r1 != r2) goto L_0x0045
            java.lang.Object r1 = r9.f51103e
            com.google.assistant.ag.c.z r1 = (com.google.assistant.p3803ag.p3809c.C49156z) r1
            com.google.protobuf.fg r1 = r1.f127114b
            if (r1 != 0) goto L_0x0033
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x0033:
            int r3 = r9.f51102d
            if (r3 != r2) goto L_0x003c
            java.lang.Object r2 = r9.f51103e
            com.google.assistant.ag.c.z r2 = (com.google.assistant.p3803ag.p3809c.C49156z) r2
            goto L_0x003e
        L_0x003c:
            com.google.assistant.ag.c.z r2 = com.google.assistant.p3803ag.p3809c.C49156z.f127111d
        L_0x003e:
            com.google.protobuf.fg r2 = r2.f127115c
            if (r2 != 0) goto L_0x005a
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
            goto L_0x005a
        L_0x0045:
            r2 = 4
            if (r1 != r2) goto L_0x004d
            java.lang.Object r1 = r9.f51103e
            com.google.protobuf.fg r1 = (com.google.protobuf.C63042fg) r1
            goto L_0x004f
        L_0x004d:
            com.google.protobuf.fg r1 = com.google.protobuf.C63042fg.f170152c
        L_0x004f:
            int r3 = r9.f51102d
            if (r3 != r2) goto L_0x0058
            java.lang.Object r2 = r9.f51103e
            com.google.protobuf.fg r2 = (com.google.protobuf.C63042fg) r2
            goto L_0x005a
        L_0x0058:
            com.google.protobuf.fg r2 = com.google.protobuf.C63042fg.f170152c
        L_0x005a:
            int r9 = r9.f51104f
            int r9 = com.google.android.libraries.assistant.contexttrigger.p1466j.C17803s.m35057a(r9)
            r3 = 1
            r4 = 0
            if (r9 != 0) goto L_0x0065
            goto L_0x00c9
        L_0x0065:
            r5 = 2
            if (r9 != r5) goto L_0x00c9
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            int r6 = r9.f51107a
            r6 = r6 & r5
            if (r6 == 0) goto L_0x009c
            com.google.protobuf.fg r9 = r9.f51109c
            if (r9 != 0) goto L_0x0077
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x0077:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r9)
            if (r9 >= 0) goto L_0x0083
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r0)
            if (r9 > 0) goto L_0x00a3
        L_0x0083:
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.fg r9 = r9.f51109c
            if (r9 != 0) goto L_0x008d
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x008d:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r2, r9)
            if (r9 >= 0) goto L_0x009a
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r2, r0)
            if (r9 <= 0) goto L_0x009a
            goto L_0x00a2
        L_0x009a:
            r1 = r4
            goto L_0x00a3
        L_0x009c:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r0)
            if (r9 > 0) goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            if (r1 == 0) goto L_0x011a
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.fg r9 = r9.f51109c
            if (r9 != 0) goto L_0x00af
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x00af:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r9)
            if (r9 == 0) goto L_0x011a
            com.google.android.libraries.assistant.contexttrigger.j.q r9 = r7.f51066g
            r9.mo23467c(r1, r3)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            r9.f51109c = r1
            int r0 = r9.f51107a
            r0 = r0 | r5
            r9.f51107a = r0
            goto L_0x011a
        L_0x00c9:
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            int r5 = r9.f51107a
            r5 = r5 & r3
            if (r5 == 0) goto L_0x00fd
            com.google.protobuf.fg r9 = r9.f51108b
            if (r9 != 0) goto L_0x00d8
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x00d8:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r9)
            if (r9 >= 0) goto L_0x00e4
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r0)
            if (r9 > 0) goto L_0x0104
        L_0x00e4:
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            com.google.protobuf.fg r9 = r9.f51108b
            if (r9 != 0) goto L_0x00ee
            com.google.protobuf.fg r9 = com.google.protobuf.C63042fg.f170152c
        L_0x00ee:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r2, r9)
            if (r9 >= 0) goto L_0x00fb
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r2, r0)
            if (r9 <= 0) goto L_0x00fb
            goto L_0x0103
        L_0x00fb:
            r1 = r4
            goto L_0x0104
        L_0x00fd:
            int r9 = com.google.protobuf.p4750c.C62953e.m95476a(r1, r0)
            if (r9 > 0) goto L_0x0104
        L_0x0103:
            r1 = r2
        L_0x0104:
            if (r1 == 0) goto L_0x011a
            com.google.android.libraries.assistant.contexttrigger.j.q r9 = r7.f51066g
            r0 = 0
            r9.mo23467c(r1, r0)
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.android.libraries.assistant.contexttrigger.j.w r9 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r9
            r9.f51108b = r1
            int r0 = r9.f51107a
            r0 = r0 | r3
            r9.f51107a = r0
        L_0x011a:
            com.google.protobuf.bv r8 = r8.build()
            com.google.android.libraries.assistant.contexttrigger.j.w r8 = (com.google.android.libraries.assistant.contexttrigger.p1466j.C17807w) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.contexttrigger.p1466j.C17793i.mo23463b(com.google.android.libraries.assistant.contexttrigger.j.w, com.google.android.libraries.assistant.contexttrigger.j.u):com.google.android.libraries.assistant.contexttrigger.j.w");
    }
}
