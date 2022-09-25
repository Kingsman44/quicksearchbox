package com.google.android.apps.gsa.shared.logger;

import com.google.common.p4552o.C59744ea;
import com.google.common.p4552o.C59745eb;
import java.util.Random;

/* renamed from: com.google.android.apps.gsa.shared.logger.z */
/* compiled from: PG */
public final class C89958z {
    /* renamed from: a */
    public static C59745eb m146541a(String str) {
        if (str == null) {
            return C59745eb.f161422d;
        }
        C59744ea eaVar = (C59744ea) C59745eb.f161422d.createBuilder();
        if (((double) new Random().nextFloat()) < 9.999999747378752E-5d) {
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
}
