package com.google.android.libraries.p10923ac.p10925b.p10934e;

import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146804a;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146815l;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146818o;
import com.google.android.libraries.p10923ac.p10925b.p10930c.p10932b.C146819p;
import com.google.protos.p4895aw.p4902b.C63985av;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.ac.b.e.bo */
/* compiled from: PG */
public final class C146912bo implements C146844an {
    /* renamed from: e */
    public static final boolean m239461e(C146815l lVar, C63985av avVar) {
        return lVar.mo123710c(avVar.f173044d.mo59174N());
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo123744a(Object obj, Object obj2) {
        C146815l lVar = (C146815l) obj2;
        return (C146815l) obj;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo123745b(Object obj, Object obj2) {
        ArrayList arrayList = new ArrayList(((C146815l) obj).mo123679a());
        ArrayList arrayList2 = new ArrayList(((C146815l) obj2).mo123679a());
        Collections.sort(arrayList, C146818o.f396379a);
        Collections.sort(arrayList2, C146818o.f396379a);
        Iterator it = arrayList.iterator();
        Iterator it2 = arrayList2.iterator();
        if (!it.hasNext()) {
            return !it2.hasNext();
        }
        C146819p pVar = (C146819p) it.next();
        while (it2.hasNext()) {
            C146819p pVar2 = (C146819p) it2.next();
            while (C146818o.f396379a.compare(pVar, pVar2) <= 0) {
                if (!C146804a.m239222a(pVar.mo123695b(), pVar2.mo123695b()) || !(pVar.mo123694a() == 2 || (pVar.mo123695b().length == pVar2.mo123695b().length && pVar2.mo123694a() == 1))) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    pVar = (C146819p) it.next();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ boolean mo123746c(Object obj, Object obj2) {
        return m239461e((C146815l) obj, (C63985av) obj2);
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo123747d(Object obj) {
        return m239461e((C146815l) null, (C63985av) obj);
    }
}
