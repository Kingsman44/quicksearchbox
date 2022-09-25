package com.google.common.p4522b;

import java.util.Iterator;

/* renamed from: com.google.common.b.ot */
/* compiled from: PG */
public final class C58700ot {
    /* renamed from: a */
    static Iterator m90437a(C58692ol olVar) {
        return new C58698or(olVar, olVar.mo54975m().iterator());
    }

    /* renamed from: b */
    static boolean m90438b(C58692ol olVar, Object obj) {
        if (obj == olVar) {
            return true;
        }
        if (obj instanceof C58692ol) {
            C58692ol olVar2 = (C58692ol) obj;
            if (olVar.size() == olVar2.size() && olVar.mo54975m().size() == olVar2.mo54975m().size()) {
                for (C58691ok okVar : olVar2.mo54975m()) {
                    if (olVar.mo54932lv(okVar.mo55768b()) != okVar.mo55767a()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}
