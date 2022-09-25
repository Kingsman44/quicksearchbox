package com.google.android.libraries.appactions.p11035a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58486gv;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4522b.C58546ja;
import com.google.common.p4522b.C58769rh;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.appactions.a.ad */
/* compiled from: PG */
public final class C147828ad {

    /* renamed from: a */
    public final C58487gw f398830a;

    /* renamed from: b */
    public final C58546ja f398831b;

    /* renamed from: c */
    private final C58546ja f398832c;

    /* renamed from: d */
    private final C58546ja f398833d;

    public C147828ad(C58546ja jaVar, C58546ja jaVar2, C58546ja jaVar3, C58487gw gwVar) {
        C58546ja jaVar4 = C58769rh.f156540a;
        this.f398832c = jaVar;
        this.f398833d = jaVar2;
        this.f398831b = jaVar3;
        this.f398830a = gwVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.google.protobuf.ga} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m240952d(java.lang.String r3, com.google.protobuf.C63037fb r4, java.lang.String r5) {
        /*
            boolean r0 = r5.isEmpty()
            r1 = 3
            if (r0 == 0) goto L_0x000a
            com.google.protobuf.ga r5 = com.google.protobuf.C63063ga.f170179c
            goto L_0x0023
        L_0x000a:
            com.google.protobuf.ga r0 = com.google.protobuf.C63063ga.f170179c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protobuf.fy r0 = (com.google.protobuf.C63060fy) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protobuf.ga r2 = (com.google.protobuf.C63063ga) r2
            r2.f170181a = r1
            r2.f170182b = r5
            com.google.protobuf.bv r5 = r0.build()
            com.google.protobuf.ga r5 = (com.google.protobuf.C63063ga) r5
        L_0x0023:
            com.google.protobuf.dn r4 = r4.f170146a
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x0032
            java.lang.Object r3 = r4.get(r3)
            r5 = r3
            com.google.protobuf.ga r5 = (com.google.protobuf.C63063ga) r5
        L_0x0032:
            int r3 = r5.f170181a
            if (r3 != r1) goto L_0x003b
            java.lang.Object r3 = r5.f170182b
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L_0x003b:
            java.lang.String r3 = ""
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appactions.p11035a.C147828ad.m240952d(java.lang.String, com.google.protobuf.fb, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final C58485gu mo124502a(String str, String str2) {
        C58485gu guVar = (C58485gu) this.f398833d.mo55009a(str, str2);
        return guVar == null ? C58485gu.m89845m() : guVar;
    }

    /* renamed from: b */
    public final C58487gw mo124503b() {
        C58486gv gvVar = new C58486gv();
        Collection.EL.stream(this.f398831b.mo55198p().keySet()).forEach(new C147855w(this, gvVar));
        return gvVar.mo55417a();
    }

    /* renamed from: c */
    public final Optional mo124504c(String str, String str2) {
        return Optional.ofNullable((C147833ai) this.f398832c.mo55009a(str, str2));
    }

    /* renamed from: e */
    public final List mo124505e(String str) {
        return this.f398832c.mo55543v(str).keySet().mo55229u();
    }
}
