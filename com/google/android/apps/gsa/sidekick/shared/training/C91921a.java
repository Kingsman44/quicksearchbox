package com.google.android.apps.gsa.sidekick.shared.training;

import com.google.common.base.C58832aw;
import com.google.p375ai.p378b.C7917ot;
import com.google.p375ai.p378b.C8093vg;
import com.google.p375ai.p378b.C8095vi;
import com.google.p375ai.p378b.C8110vx;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.training.a */
/* compiled from: PG */
public final class C91921a {

    /* renamed from: a */
    private final C7917ot f256346a;

    public C91921a(C7917ot otVar) {
        otVar.getClass();
        this.f256346a = otVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91921a)) {
            return false;
        }
        C91921a aVar = (C91921a) obj;
        C7917ot otVar = this.f256346a;
        int i = otVar.f27820a;
        int i2 = i & 4;
        boolean z = i2 != 0;
        C7917ot otVar2 = aVar.f256346a;
        int i3 = otVar2.f27820a;
        if (z != ((i3 & 4) != 0)) {
            return false;
        }
        if (i2 != 0) {
            C8093vg vgVar = otVar.f27821b;
            if (vgVar == null) {
                vgVar = C8093vg.f28461c;
            }
            C8093vg vgVar2 = aVar.f256346a.f27821b;
            if (vgVar2 == null) {
                vgVar2 = C8093vg.f28461c;
            }
            if (C58832aw.m90831a(vgVar.f28464b, vgVar2.f28464b)) {
                C8110vx a = C8110vx.m22949a(vgVar.f28463a);
                if (a == null) {
                    a = C8110vx.BASKETBALL;
                }
                C8110vx a2 = C8110vx.m22949a(vgVar2.f28463a);
                if (a2 == null) {
                    a2 = C8110vx.BASKETBALL;
                }
                if (a == a2) {
                    return true;
                }
            }
            return false;
        }
        int i4 = i & 8;
        if ((i4 != 0) != ((i3 & 8) != 0)) {
            return false;
        }
        if (i4 == 0) {
            return otVar.equals(otVar2);
        }
        C8095vi viVar = otVar.f27822c;
        if (viVar == null) {
            viVar = C8095vi.f28467b;
        }
        long j = viVar.f28469a;
        C8095vi viVar2 = aVar.f256346a.f27822c;
        if (viVar2 == null) {
            viVar2 = C8095vi.f28467b;
        }
        return j == viVar2.f28469a;
    }

    public final int hashCode() {
        C7917ot otVar = this.f256346a;
        int i = otVar.f27820a;
        if ((i & 4) != 0) {
            Object[] objArr = new Object[2];
            C8093vg vgVar = otVar.f27821b;
            if (vgVar == null) {
                vgVar = C8093vg.f28461c;
            }
            objArr[0] = vgVar.f28464b;
            C8093vg vgVar2 = this.f256346a.f27821b;
            if (vgVar2 == null) {
                vgVar2 = C8093vg.f28461c;
            }
            C8110vx a = C8110vx.m22949a(vgVar2.f28463a);
            if (a == null) {
                a = C8110vx.BASKETBALL;
            }
            objArr[1] = Integer.valueOf(a.f28524l);
            return Arrays.hashCode(objArr);
        } else if ((i & 8) == 0) {
            return otVar.hashCode();
        } else {
            Object[] objArr2 = new Object[1];
            C8095vi viVar = otVar.f27822c;
            if (viVar == null) {
                viVar = C8095vi.f28467b;
            }
            objArr2[0] = Long.valueOf(viVar.f28469a);
            return Arrays.hashCode(objArr2);
        }
    }
}
