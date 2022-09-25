package com.google.android.libraries.social.populous.p3296e.p3299c;

import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55817b;
import com.google.p4181bi.C55847i;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.social.populous.e.c.ai */
/* compiled from: PG */
public final /* synthetic */ class C42458ai implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C42458ai f111373a = new C42458ai();

    private /* synthetic */ C42458ai() {
    }

    public final int compare(Object obj, Object obj2) {
        C55815ay ayVar;
        C55815ay ayVar2;
        C42405ab abVar = (C42405ab) obj;
        C55847i iVar = (C55847i) ((C42405ab) obj2).f111226a.mo56107c();
        if (iVar.f147360a == 1) {
            ayVar = (C55815ay) iVar.f147361b;
        } else {
            ayVar = C55815ay.f147275f;
        }
        C55817b bVar = ayVar.f147278b;
        if (bVar == null) {
            bVar = C55817b.f147283d;
        }
        double d = bVar.f147287c;
        C55847i iVar2 = (C55847i) abVar.f111226a.mo56107c();
        if (iVar2.f147360a == 1) {
            ayVar2 = (C55815ay) iVar2.f147361b;
        } else {
            ayVar2 = C55815ay.f147275f;
        }
        C55817b bVar2 = ayVar2.f147278b;
        if (bVar2 == null) {
            bVar2 = C55817b.f147283d;
        }
        return Double.compare(d, bVar2.f147287c);
    }
}
