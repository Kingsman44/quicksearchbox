package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.base.C58817ah;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.conversation.g.g */
/* compiled from: PG */
public final /* synthetic */ class C22663g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f62431a = "mic.UPDATE";

    public final Object apply(Object obj) {
        C52076ei eiVar;
        C52076ei eiVar2;
        String str = this.f62431a;
        for (C52083ep epVar : (List) obj) {
            if (epVar.f136692b == 4) {
                eiVar = (C52076ei) epVar.f136693c;
            } else {
                eiVar = C52076ei.f136664f;
            }
            if ((eiVar.f136666a & 32) != 0) {
                if (epVar.f136692b == 4) {
                    eiVar2 = (C52076ei) epVar.f136693c;
                } else {
                    eiVar2 = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar2.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (str.equals(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }
}
