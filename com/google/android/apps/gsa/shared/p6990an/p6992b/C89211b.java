package com.google.android.apps.gsa.shared.p6990an.p6992b;

import android.os.Bundle;
import com.google.android.apps.gsa.searchbox.p6960ui.C88710k;
import com.google.android.libraries.searchbox.shared.suggestion.C41672al;
import com.google.android.libraries.searchbox.shared.suggestion.C41674an;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4552o.aou;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.protobuf.C62961ch;

/* renamed from: com.google.android.apps.gsa.shared.an.b.b */
/* compiled from: PG */
public final class C89211b {
    /* renamed from: a */
    public static Suggestion m145115a(String str, C41674an anVar, C88710k kVar) {
        CharSequence d;
        CharSequence charSequence;
        C41674an anVar2 = anVar;
        C88710k kVar2 = kVar;
        C41672al alVar = anVar2.f108989b;
        if (alVar == null) {
            alVar = C41672al.f108976i;
        }
        String str2 = alVar.f108979b;
        int a = aou.m92448a(anVar2.f108991d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        int i2 = alVar.f108980c;
        String str3 = anVar2.f108992e;
        Integer valueOf = Integer.valueOf(alVar.f108983f);
        int i3 = alVar.f108984g;
        int i4 = alVar.f108985h;
        C62961ch chVar = alVar.f108981d;
        C54228aq aqVar = anVar2.f108990c;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54228aq aqVar2 = aqVar;
        C41679e eVar = alVar.f108982e;
        if (eVar == null) {
            eVar = C41679e.f109005p;
        }
        C41679e eVar2 = eVar;
        String obj = str2.toString();
        boolean contains = chVar.contains(39);
        if ((anVar2.f108988a & 2) != 0) {
            d = kVar2.mo44239f(obj, false, contains);
        } else {
            if (i2 != 0) {
                if (i2 == 35) {
                    i2 = 35;
                } else {
                    charSequence = obj;
                    return new Suggestion(charSequence, i, i2, chVar, new Bundle(), str3, i3, valueOf, i4, aqVar2, eVar2);
                }
            }
            d = kVar2.mo44237d(obj, str, contains);
        }
        charSequence = d;
        return new Suggestion(charSequence, i, i2, chVar, new Bundle(), str3, i3, valueOf, i4, aqVar2, eVar2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x005c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.libraries.searchbox.shared.suggestion.C41674an m145116b(com.google.android.libraries.searchbox.shared.suggestion.Suggestion r5) {
        /*
            com.google.android.libraries.searchbox.shared.suggestion.al r0 = com.google.android.libraries.searchbox.shared.suggestion.C41672al.f108976i
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.ak r0 = (com.google.android.libraries.searchbox.shared.suggestion.C41671ak) r0
            boolean r1 = r5.mo44265s()
            if (r1 == 0) goto L_0x002b
            com.google.at.h.d.a.aq r1 = r5.f108906A
            int r2 = r1.f142330a
            r2 = r2 & 1
            if (r2 == 0) goto L_0x002b
            java.lang.String r1 = r1.f142331b
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            r1.getClass()
            int r3 = r2.f108978a
            r3 = r3 | 1
            r2.f108978a = r3
            r2.f108979b = r1
            goto L_0x0043
        L_0x002b:
            java.lang.CharSequence r1 = r5.f108908i
            java.lang.String r1 = r1.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            r1.getClass()
            int r3 = r2.f108978a
            r3 = r3 | 1
            r2.f108978a = r3
            r2.f108979b = r1
        L_0x0043:
            int r1 = r5.f108910k
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            int r3 = r2.f108978a
            r3 = r3 | 2
            r2.f108978a = r3
            r2.f108980c = r1
            com.google.common.b.gu r1 = r5.f108925z
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0078
            com.google.common.b.gu r1 = r5.f108925z
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            com.google.protobuf.ch r3 = r2.f108981d
            boolean r4 = r3.mo58948c()
            if (r4 != 0) goto L_0x0073
            com.google.protobuf.ch r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r3)
            r2.f108981d = r3
        L_0x0073:
            com.google.protobuf.ch r2 = r2.f108981d
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)
        L_0x0078:
            java.lang.Integer r1 = r5.f108915p
            int r1 = r1.intValue()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            int r3 = r2.f108978a
            r3 = r3 | 8
            r2.f108978a = r3
            r2.f108983f = r1
            com.google.android.libraries.searchbox.shared.suggestion.e r1 = r5.f108907B
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            r1.getClass()
            r2.f108982e = r1
            int r1 = r2.f108978a
            r1 = r1 | 4
            r2.f108978a = r1
            int r1 = r5.f108916q
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            int r3 = r2.f108978a
            r3 = r3 | 16
            r2.f108978a = r3
            r2.f108984g = r1
            int r1 = r5.f108917r
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.searchbox.shared.suggestion.al r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r2
            int r3 = r2.f108978a
            r3 = r3 | 32
            r2.f108978a = r3
            r2.f108985h = r1
            com.google.android.libraries.searchbox.shared.suggestion.an r1 = com.google.android.libraries.searchbox.shared.suggestion.C41674an.f108986f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.searchbox.shared.suggestion.am r1 = (com.google.android.libraries.searchbox.shared.suggestion.C41673am) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.searchbox.shared.suggestion.al r0 = (com.google.android.libraries.searchbox.shared.suggestion.C41672al) r0
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.searchbox.shared.suggestion.an r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41674an) r2
            r0.getClass()
            r2.f108989b = r0
            int r0 = r2.f108988a
            r0 = r0 | 1
            r2.f108988a = r0
            boolean r0 = r5.mo44265s()
            if (r0 == 0) goto L_0x00fd
            com.google.at.h.d.a.aq r0 = r5.f108906A
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.searchbox.shared.suggestion.an r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41674an) r2
            r0.getClass()
            r2.f108990c = r0
            int r0 = r2.f108988a
            r0 = r0 | 2
            r2.f108988a = r0
        L_0x00fd:
            int r0 = r5.f108909j
            int r0 = com.google.common.p4552o.aou.m92448a(r0)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.searchbox.shared.suggestion.an r2 = (com.google.android.libraries.searchbox.shared.suggestion.C41674an) r2
            int r3 = r0 + -1
            if (r0 == 0) goto L_0x0131
            r2.f108991d = r3
            int r0 = r2.f108988a
            r0 = r0 | 4
            r2.f108988a = r0
            java.lang.String r5 = r5.f108913n
            r1.copyOnWrite()
            com.google.protobuf.bv r0 = r1.instance
            com.google.android.libraries.searchbox.shared.suggestion.an r0 = (com.google.android.libraries.searchbox.shared.suggestion.C41674an) r0
            r5.getClass()
            int r2 = r0.f108988a
            r2 = r2 | 8
            r0.f108988a = r2
            r0.f108992e = r5
            com.google.protobuf.bv r5 = r1.build()
            com.google.android.libraries.searchbox.shared.suggestion.an r5 = (com.google.android.libraries.searchbox.shared.suggestion.C41674an) r5
            return r5
        L_0x0131:
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.p6990an.p6992b.C89211b.m145116b(com.google.android.libraries.searchbox.shared.suggestion.Suggestion):com.google.android.libraries.searchbox.shared.suggestion.an");
    }
}
