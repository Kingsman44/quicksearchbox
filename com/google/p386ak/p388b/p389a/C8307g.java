package com.google.p386ak.p388b.p389a;

import com.google.p386ak.C8266aa;
import com.google.p386ak.C8267ab;
import com.google.p386ak.C8393i;
import com.google.p386ak.p387a.C8264a;
import com.google.p386ak.p388b.C8380y;
import com.google.p386ak.p393c.C8383a;

/* renamed from: com.google.ak.b.a.g */
/* compiled from: PG */
public final class C8307g implements C8267ab {

    /* renamed from: a */
    private final C8380y f29096a;

    public C8307g(C8380y yVar) {
        this.f29096a = yVar;
    }

    /* JADX WARNING: type inference failed for: r7v12, types: [com.google.ak.aa] */
    /* JADX WARNING: type inference failed for: r7v13, types: [com.google.ak.aa] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static final com.google.p386ak.C8266aa m23050b(com.google.p386ak.p388b.C8380y r7, com.google.p386ak.C8393i r8, com.google.p386ak.p393c.C8383a r9, com.google.p386ak.p387a.C8264a r10) {
        /*
            java.lang.Class r0 = r10.mo17025a()
            com.google.ak.c.a r1 = new com.google.ak.c.a
            r1.<init>(r0)
            com.google.ak.b.al r7 = r7.mo17104a(r1)
            java.lang.Object r7 = r7.mo17084a()
            boolean r6 = r10.mo17026b()
            boolean r10 = r7 instanceof com.google.p386ak.C8266aa
            if (r10 == 0) goto L_0x001c
            com.google.ak.aa r7 = (com.google.p386ak.C8266aa) r7
            goto L_0x0078
        L_0x001c:
            boolean r10 = r7 instanceof com.google.p386ak.C8267ab
            if (r10 == 0) goto L_0x0027
            com.google.ak.ab r7 = (com.google.p386ak.C8267ab) r7
            com.google.ak.aa r7 = r7.mo17031a(r8, r9)
            goto L_0x0078
        L_0x0027:
            boolean r10 = r7 instanceof com.google.p386ak.C8405u
            r0 = 0
            if (r10 != 0) goto L_0x0061
            boolean r10 = r7 instanceof com.google.p386ak.C8397m
            if (r10 == 0) goto L_0x0032
            r1 = r0
            goto L_0x0065
        L_0x0032:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.Class r7 = r7.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.reflect.Type r9 = r9.f29214b
            java.lang.String r9 = com.google.p386ak.p388b.C8360e.m23135b(r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r10.<init>(r0)
            r10.append(r7)
            java.lang.String r7 = " as a @JsonAdapter for "
            r10.append(r7)
            r10.append(r9)
            java.lang.String r7 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r10.append(r7)
            java.lang.String r7 = r10.toString()
            r8.<init>(r7)
            throw r8
        L_0x0061:
            r10 = r7
            com.google.ak.u r10 = (com.google.p386ak.C8405u) r10
            r1 = r10
        L_0x0065:
            boolean r10 = r7 instanceof com.google.p386ak.C8397m
            if (r10 == 0) goto L_0x006d
            com.google.ak.m r7 = (com.google.p386ak.C8397m) r7
            r2 = r7
            goto L_0x006e
        L_0x006d:
            r2 = r0
        L_0x006e:
            com.google.ak.b.a.s r7 = new com.google.ak.b.a.s
            r5 = 0
            r0 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r6 = 0
        L_0x0078:
            if (r7 == 0) goto L_0x0082
            if (r6 == 0) goto L_0x0082
            com.google.ak.z r8 = new com.google.ak.z
            r8.<init>(r7)
            return r8
        L_0x0082:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p386ak.p388b.p389a.C8307g.m23050b(com.google.ak.b.y, com.google.ak.i, com.google.ak.c.a, com.google.ak.a.a):com.google.ak.aa");
    }

    /* renamed from: a */
    public final C8266aa mo17031a(C8393i iVar, C8383a aVar) {
        C8264a aVar2 = (C8264a) aVar.f29213a.getAnnotation(C8264a.class);
        if (aVar2 == null) {
            return null;
        }
        return m23050b(this.f29096a, iVar, aVar, aVar2);
    }
}
