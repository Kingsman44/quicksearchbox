package com.google.android.libraries.search.logging.p3043f.p3045b;

import android.content.Intent;
import com.google.android.libraries.search.logging.p3043f.C39193b;
import com.google.android.libraries.search.logging.p3043f.p3044a.C39192a;
import com.google.common.p4552o.C59744ea;
import com.google.common.p4552o.C59745eb;
import com.google.common.p4552o.C59746ec;
import com.google.common.p4552o.C59747ed;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.Collections;
import java.util.Locale;
import java.util.Random;

/* renamed from: com.google.android.libraries.search.logging.f.b.a */
/* compiled from: PG */
public final class C39194a {

    /* renamed from: a */
    static final float f103146a = new Random().nextFloat();

    /* renamed from: a */
    public static C59745eb m68626a(String str) {
        if (str == null) {
            return C59745eb.f161422d;
        }
        C59744ea eaVar = (C59744ea) C59745eb.f161422d.createBuilder();
        if (f103146a < C39192a.FOR_RELEASE.f103145d) {
            if (str.length() > 100) {
                str = str.substring(0, 100);
            }
            eaVar.copyOnWrite();
            C59745eb ebVar = (C59745eb) eaVar.instance;
            str.getClass();
            ebVar.f161424a |= 2;
            ebVar.f161426c = str;
        }
        int hashCode = str.hashCode();
        eaVar.copyOnWrite();
        C59745eb ebVar2 = (C59745eb) eaVar.instance;
        ebVar2.f161424a |= 1;
        ebVar2.f161425b = hashCode;
        return (C59745eb) eaVar.build();
    }

    /* renamed from: b */
    public static C59747ed m68627b(Intent intent) {
        String str;
        String str2;
        C59746ec ecVar = (C59746ec) C59747ed.f161427h.createBuilder();
        C59745eb a = m68626a(intent.getAction());
        int i = a.f161425b;
        String str3 = a.f161426c;
        ecVar.copyOnWrite();
        C59747ed edVar = (C59747ed) ecVar.instance;
        a.getClass();
        edVar.f161430b = a;
        edVar.f161429a |= 1;
        C59745eb a2 = m68626a(intent.getType());
        int i2 = a2.f161425b;
        String str4 = a2.f161426c;
        ecVar.copyOnWrite();
        C59747ed edVar2 = (C59747ed) ecVar.instance;
        a2.getClass();
        edVar2.f161431c = a2;
        edVar2.f161429a |= 2;
        if (intent.getCategories() != null) {
            for (String a3 : intent.getCategories()) {
                C59745eb a4 = m68626a(a3);
                ecVar.copyOnWrite();
                C59747ed edVar3 = (C59747ed) ecVar.instance;
                a4.getClass();
                C62971cq cqVar = edVar3.f161432d;
                if (!cqVar.mo58948c()) {
                    edVar3.f161432d = C62942bv.mutableCopy(cqVar);
                }
                edVar3.f161432d.add(a4);
            }
        }
        for (C59745eb ebVar : Collections.unmodifiableList(((C59747ed) ecVar.instance).f161432d)) {
            String.format(Locale.US, "%d -> %s ", new Object[]{Integer.valueOf(ebVar.f161425b), ebVar.f161426c});
        }
        if (intent.getComponent() != null) {
            str2 = intent.getComponent().getPackageName();
            str = intent.getComponent().getClassName();
        } else {
            str2 = null;
            str = null;
        }
        C59745eb a5 = m68626a(str2);
        C59745eb a6 = m68626a(str);
        int i3 = a5.f161425b;
        String str5 = a5.f161426c;
        int i4 = a6.f161425b;
        String str6 = a6.f161426c;
        ecVar.copyOnWrite();
        C59747ed edVar4 = (C59747ed) ecVar.instance;
        a6.getClass();
        edVar4.f161434f = a6;
        edVar4.f161429a |= 8;
        ecVar.copyOnWrite();
        C59747ed edVar5 = (C59747ed) ecVar.instance;
        a5.getClass();
        edVar5.f161433e = a5;
        edVar5.f161429a |= 4;
        C59745eb a7 = m68626a(C39193b.m68624a(intent));
        int i5 = a7.f161425b;
        String str7 = a7.f161426c;
        ecVar.copyOnWrite();
        C59747ed edVar6 = (C59747ed) ecVar.instance;
        a7.getClass();
        edVar6.f161435g = a7;
        edVar6.f161429a |= 16;
        return (C59747ed) ecVar.build();
    }
}
