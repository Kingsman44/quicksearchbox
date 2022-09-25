package com.google.android.apps.gsa.staticplugins.opa.p8375l.p8376a;

import com.google.assistant.p4008y.p4009a.C53552al;
import com.google.assistant.p4008y.p4009a.C53566az;
import com.google.common.p4580v.C60948g;
import com.google.p4479cg.C58075g;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.C58081m;
import com.google.p4479cg.C58083o;
import com.google.protobuf.C62963cj;
import p3186j$.time.Instant;
import p3186j$.time.LocalTime;
import p3186j$.time.ZoneId;
import p3186j$.time.ZonedDateTime;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.l.a.k */
/* compiled from: PG */
public final class C109376k implements C109371f {

    /* renamed from: a */
    private final ZonedDateTime f304658a;

    /* renamed from: b */
    private final ZoneId f304659b;

    public C109376k() {
        C60948g gVar = C60948g.f165068a;
        ZoneId systemDefault = ZoneId.systemDefault();
        this.f304658a = Instant.now().atZone(systemDefault);
        this.f304659b = systemDefault;
    }

    /* renamed from: a */
    public final boolean mo97812a(C53552al alVar) {
        C53566az azVar;
        int i;
        int i2;
        int i3;
        ZoneId zoneId;
        C58083o oVar;
        int i4;
        int i5;
        int i6;
        ZoneId zoneId2;
        C58083o oVar2;
        if (alVar.f140542b == 3) {
            azVar = (C53566az) alVar.f140543c;
        } else {
            azVar = C53566az.f140583h;
        }
        ZonedDateTime zonedDateTime = this.f304658a;
        if ((azVar.f140585a & 1) != 0) {
            C58075g gVar = azVar.f140586b;
            if (gVar == null) {
                gVar = C58075g.f155227j;
            }
            if (gVar.f155231c != 0) {
                C58075g gVar2 = azVar.f140586b;
                if (gVar2 == null) {
                    gVar2 = C58075g.f155227j;
                }
                i4 = gVar2.f155231c;
            } else {
                i4 = zonedDateTime.getYear();
            }
            int i7 = i4;
            C58075g gVar3 = azVar.f140586b;
            if ((gVar3 == null ? C58075g.f155227j : gVar3).f155232d != 0) {
                if (gVar3 == null) {
                    gVar3 = C58075g.f155227j;
                }
                i5 = gVar3.f155232d;
            } else {
                i5 = zonedDateTime.getMonthValue();
            }
            int i8 = i5;
            C58075g gVar4 = azVar.f140586b;
            if ((gVar4 == null ? C58075g.f155227j : gVar4).f155233e != 0) {
                if (gVar4 == null) {
                    gVar4 = C58075g.f155227j;
                }
                i6 = gVar4.f155233e;
            } else {
                i6 = zonedDateTime.getDayOfMonth();
            }
            int i9 = i6;
            C58075g gVar5 = azVar.f140586b;
            int i10 = (gVar5 == null ? C58075g.f155227j : gVar5).f155234f;
            int i11 = (gVar5 == null ? C58075g.f155227j : gVar5).f155235g;
            int i12 = (gVar5 == null ? C58075g.f155227j : gVar5).f155236h;
            if ((gVar5 == null ? C58075g.f155227j : gVar5).f155229a == 9) {
                if (gVar5 == null) {
                    gVar5 = C58075g.f155227j;
                }
                if (gVar5.f155229a == 9) {
                    oVar2 = (C58083o) gVar5.f155230b;
                } else {
                    oVar2 = C58083o.f155260b;
                }
                zoneId2 = ZoneId.m71280of(oVar2.f155262a);
            } else {
                zoneId2 = ZoneId.systemDefault();
            }
            if (zonedDateTime.isBefore(ZonedDateTime.m71295of(i7, i8, i9, i10, i11, i12, 0, zoneId2))) {
                return false;
            }
        }
        if ((azVar.f140585a & 2) != 0) {
            C58075g gVar6 = azVar.f140587c;
            if (gVar6 == null) {
                gVar6 = C58075g.f155227j;
            }
            if (gVar6.f155231c != 0) {
                C58075g gVar7 = azVar.f140587c;
                if (gVar7 == null) {
                    gVar7 = C58075g.f155227j;
                }
                i = gVar7.f155231c;
            } else {
                i = zonedDateTime.getYear();
            }
            int i13 = i;
            C58075g gVar8 = azVar.f140587c;
            if ((gVar8 == null ? C58075g.f155227j : gVar8).f155232d != 0) {
                if (gVar8 == null) {
                    gVar8 = C58075g.f155227j;
                }
                i2 = gVar8.f155232d;
            } else {
                i2 = zonedDateTime.getMonthValue();
            }
            int i14 = i2;
            C58075g gVar9 = azVar.f140587c;
            if ((gVar9 == null ? C58075g.f155227j : gVar9).f155233e != 0) {
                if (gVar9 == null) {
                    gVar9 = C58075g.f155227j;
                }
                i3 = gVar9.f155233e;
            } else {
                i3 = zonedDateTime.getDayOfMonth();
            }
            int i15 = i3;
            C58075g gVar10 = azVar.f140587c;
            int i16 = (gVar10 == null ? C58075g.f155227j : gVar10).f155234f;
            int i17 = (gVar10 == null ? C58075g.f155227j : gVar10).f155235g;
            int i18 = (gVar10 == null ? C58075g.f155227j : gVar10).f155236h;
            if ((gVar10 == null ? C58075g.f155227j : gVar10).f155229a == 9) {
                if (gVar10 == null) {
                    gVar10 = C58075g.f155227j;
                }
                if (gVar10.f155229a == 9) {
                    oVar = (C58083o) gVar10.f155230b;
                } else {
                    oVar = C58083o.f155260b;
                }
                zoneId = ZoneId.m71280of(oVar.f155262a);
            } else {
                zoneId = ZoneId.systemDefault();
            }
            if (zonedDateTime.isAfter(ZonedDateTime.m71295of(i13, i14, i15, i16, i17, i18, 0, zoneId))) {
                return false;
            }
        }
        LocalTime localTime = this.f304658a.withZoneSameInstant(this.f304659b).toLocalTime();
        if ((azVar.f140585a & 4) != 0) {
            C58081m mVar = azVar.f140589f;
            if (mVar == null) {
                mVar = C58081m.f155254e;
            }
            int i19 = mVar.f155256a;
            C58081m mVar2 = azVar.f140589f;
            int i20 = (mVar2 == null ? C58081m.f155254e : mVar2).f155257b;
            if (mVar2 == null) {
                mVar2 = C58081m.f155254e;
            }
            if (localTime.isBefore(LocalTime.m71212of(i19, i20, mVar2.f155258c))) {
                return false;
            }
        }
        if ((azVar.f140585a & 8) != 0) {
            C58081m mVar3 = azVar.f140590g;
            if (mVar3 == null) {
                mVar3 = C58081m.f155254e;
            }
            int i21 = mVar3.f155256a;
            C58081m mVar4 = azVar.f140590g;
            int i22 = (mVar4 == null ? C58081m.f155254e : mVar4).f155257b;
            if (mVar4 == null) {
                mVar4 = C58081m.f155254e;
            }
            if (localTime.isAfter(LocalTime.m71212of(i21, i22, mVar4.f155258c))) {
                return false;
            }
        }
        if (azVar.f140588d.size() > 0) {
            if (!new C62963cj(azVar.f140588d, C53566az.f140582e).contains(C58077i.m88832a(zonedDateTime.getDayOfWeek().getValue()))) {
                return false;
            }
        }
        return true;
    }
}
