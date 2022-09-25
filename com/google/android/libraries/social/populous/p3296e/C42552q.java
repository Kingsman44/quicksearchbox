package com.google.android.libraries.social.populous.p3296e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.common.p4535g.C59203do;
import com.google.p4181bi.C55810at;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55856r;
import com.google.p4181bi.C55858t;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.social.populous.e.q */
/* compiled from: PG */
public final /* synthetic */ class C42552q implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C42552q f111634a = new C42552q();

    private /* synthetic */ C42552q() {
    }

    public final int compare(Object obj, Object obj2) {
        C55815ay ayVar;
        C55815ay ayVar2;
        C55815ay ayVar3;
        String str;
        C55815ay ayVar4;
        C55815ay ayVar5;
        C55815ay ayVar6;
        C42405ab abVar = (C42405ab) obj;
        C42405ab abVar2 = (C42405ab) obj2;
        if (!abVar.mo45410l() || !abVar2.mo45410l()) {
            return 0;
        }
        C55847i iVar = (C55847i) abVar.f111226a.mo56107c();
        C55847i iVar2 = (C55847i) abVar2.f111226a.mo56107c();
        if (iVar.f147360a == 1) {
            ayVar = (C55815ay) iVar.f147361b;
        } else {
            ayVar = C55815ay.f147275f;
        }
        boolean isEmpty = ayVar.f147279c.isEmpty();
        double d = C59203do.f157270a;
        double a = !isEmpty ? C42553r.m75010a(abVar) : 0.0d;
        if (iVar2.f147360a == 1) {
            ayVar2 = (C55815ay) iVar2.f147361b;
        } else {
            ayVar2 = C55815ay.f147275f;
        }
        if (!ayVar2.f147279c.isEmpty()) {
            d = C42553r.m75010a(abVar2);
        }
        if (a != d) {
            return a <= d ? 1 : -1;
        }
        if (iVar.f147360a == 1) {
            ayVar3 = (C55815ay) iVar.f147361b;
        } else {
            ayVar3 = C55815ay.f147275f;
        }
        boolean isEmpty2 = ayVar3.f147279c.isEmpty();
        String str2 = BuildConfig.FLAVOR;
        if (!isEmpty2) {
            if (iVar.f147360a == 1) {
                ayVar6 = (C55815ay) iVar.f147361b;
            } else {
                ayVar6 = C55815ay.f147275f;
            }
            C55858t tVar = ((C55856r) ayVar6.f147279c.get(0)).f147385d;
            if (tVar == null) {
                tVar = C55858t.f147392f;
            }
            C55810at atVar = tVar.f147396c;
            if (atVar == null) {
                atVar = C55810at.f147265f;
            }
            str = atVar.f147268b;
        } else {
            str = str2;
        }
        if (iVar2.f147360a == 1) {
            ayVar4 = (C55815ay) iVar2.f147361b;
        } else {
            ayVar4 = C55815ay.f147275f;
        }
        if (!ayVar4.f147279c.isEmpty()) {
            if (iVar2.f147360a == 1) {
                ayVar5 = (C55815ay) iVar2.f147361b;
            } else {
                ayVar5 = C55815ay.f147275f;
            }
            C55858t tVar2 = ((C55856r) ayVar5.f147279c.get(0)).f147385d;
            if (tVar2 == null) {
                tVar2 = C55858t.f147392f;
            }
            C55810at atVar2 = tVar2.f147396c;
            if (atVar2 == null) {
                atVar2 = C55810at.f147265f;
            }
            str2 = atVar2.f147268b;
        }
        if (str.equals(str2)) {
            return 0;
        }
        return str.compareTo(str2);
    }
}
