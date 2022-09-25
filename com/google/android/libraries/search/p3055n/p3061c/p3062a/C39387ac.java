package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import com.google.android.libraries.search.p3055n.C39356be;
import com.google.android.libraries.search.p3055n.C39357bf;
import com.google.android.libraries.search.p3055n.C39677db;
import com.google.android.libraries.search.p3055n.C39767h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.n.c.a.ac */
/* compiled from: PG */
public final class C39387ac {

    /* renamed from: a */
    public static final C59071e f103702a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.ac");

    /* renamed from: b */
    private final boolean f103703b;

    public C39387ac(boolean z) {
        this.f103703b = z;
    }

    /* renamed from: b */
    public static boolean m68782b(C39425bb bbVar) {
        ((C59052c) ((C59052c) f103702a.mo56224b()).mo56372aa(53521)).mo56358K("isHotwordAvailable():  %b, isHotwordEnabled() %b ", bbVar.mo41840a().f395880a, bbVar.mo41840a().f395881b);
        return bbVar.mo41840a().f395880a && bbVar.mo41840a().f395881b;
    }

    /* renamed from: c */
    public static boolean m68783c(C39425bb bbVar) {
        boolean z = bbVar.mo41840a().f395898s == 1;
        boolean z2 = bbVar.mo41840a().f395887h != null;
        ((C59052c) ((C59052c) f103702a.mo56224b()).mo56372aa(53522)).mo56358K("hotword enrollment state is enrolled:  %b, speakerId model exist: %b ", z, z2);
        return m68782b(bbVar) && z && z2;
    }

    /* renamed from: a */
    public final boolean mo41798a(C39767h hVar) {
        if (!this.f103703b) {
            C39357bf bfVar = hVar.f104599c;
            if (bfVar == null) {
                bfVar = C39357bf.f103644d;
            }
            if ((bfVar.f103646a & 2) == 0) {
                return false;
            }
            C39357bf bfVar2 = hVar.f104599c;
            if (bfVar2 == null) {
                bfVar2 = C39357bf.f103644d;
            }
            C39677db dbVar = bfVar2.f103648c;
            if (dbVar == null) {
                dbVar = C39677db.f104438c;
            }
            if (!dbVar.f104441b) {
                return false;
            }
            ((C59052c) ((C59052c) f103702a.mo56224b()).mo56372aa(53519)).mo56386p("by pass voice match in test");
        }
        ((C59052c) ((C59052c) f103702a.mo56224b()).mo56372aa(53518)).mo56389s("bypassVoiceMatchInTestFlagEnabled: %b", Boolean.valueOf(this.f103703b));
        return true;
    }

    /* renamed from: d */
    public final boolean mo41799d(C39767h hVar) {
        if (mo41798a(hVar)) {
            return false;
        }
        C39356be beVar = C39356be.DEFAULT_PERSONAL;
        C39357bf bfVar = hVar.f104599c;
        if (bfVar == null) {
            bfVar = C39357bf.f103644d;
        }
        C39356be a = C39356be.m68761a(bfVar.f103647b);
        if (a == null) {
            a = C39356be.DEFAULT_PERSONAL;
        }
        int ordinal = a.ordinal();
        if (ordinal == 1 || ordinal == 3 || ordinal == 4) {
            return false;
        }
        return true;
    }
}
