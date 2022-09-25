package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.au */
/* compiled from: PG */
public final class C13139au {
    /* renamed from: a */
    public static int m29358a(int i, List list, boolean z, String str) {
        C51058ev evVar;
        int i2 = i + 1;
        while (i2 < list.size()) {
            C52560wg wgVar = (C52560wg) list.get(i2);
            C51098gh ghVar = wgVar.f137949e;
            if (ghVar == null) {
                ghVar = C51098gh.f133009e;
            }
            if (ghVar.f133012b == 1) {
                evVar = (C51058ev) ghVar.f133013c;
            } else {
                evVar = C51058ev.f132941o;
            }
            boolean equals = evVar.f132944b.equals(str);
            if (m29359b(wgVar) && z == equals) {
                break;
            }
            i2++;
        }
        return i2;
    }

    /* renamed from: b */
    public static boolean m29359b(C52560wg wgVar) {
        C52567wn wnVar = C52567wn.UNKNOWN;
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52567wn b = C52567wn.m86649b(woVar.f138003j);
        if (b == null) {
            b = C52567wn.UNKNOWN;
        }
        int ordinal = b.ordinal();
        return ordinal == 0 || ordinal == 10 || ordinal == 14;
    }
}
