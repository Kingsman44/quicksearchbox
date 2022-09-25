package com.google.android.libraries.search.p2871b.p2895i;

import com.google.android.libraries.search.p2871b.p2887b.C37216a;
import com.google.common.base.C58827ar;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4419bx.C57862c;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57912a;
import com.google.p4438c.p4439a.C57913b;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.libraries.search.b.i.e */
/* compiled from: PG */
public abstract class C37256e {

    /* renamed from: a */
    private static final AtomicLong f99009a = new AtomicLong();

    /* renamed from: d */
    static C37255d m66155d() {
        C37261j jVar = new C37261j();
        jVar.f99013a = f99009a.getAndIncrement();
        jVar.f99019g = 1;
        jVar.f99017e = C58495hd.m89898l(C58729pv.f156485a);
        jVar.f99018f = C58528ij.m90006F(C58733pz.f156496a);
        return jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo40796a();

    /* renamed from: b */
    public abstract C57912a mo40797b();

    /* renamed from: c */
    public abstract C37216a mo40798c();

    /* renamed from: e */
    public abstract C58833ax mo40799e();

    /* renamed from: f */
    public abstract C58495hd mo40800f();

    /* renamed from: g */
    public abstract C58528ij mo40801g();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(mo40798c().f98877b);
        sb.append("> (ID:");
        sb.append(mo40798c().f98876a.f98906a);
        sb.append(") ");
        sb.append(mo40798c().f98876a.f98907b);
        C57863d dVar = ((C57913b) mo40797b().instance).f154902c;
        if (dVar == null) {
            dVar = C57863d.f154580d;
        }
        if ((dVar.f154582a & 2) != 0) {
            sb.append(" Status: ");
            C57863d dVar2 = ((C57913b) mo40797b().instance).f154902c;
            if (dVar2 == null) {
                dVar2 = C57863d.f154580d;
            }
            C57862c cVar = dVar2.f154584c;
            if (cVar == null) {
                cVar = C57862c.f154575d;
            }
            if ((cVar.f154577a & 2) != 0) {
                C57863d dVar3 = ((C57913b) mo40797b().instance).f154902c;
                if (dVar3 == null) {
                    dVar3 = C57863d.f154580d;
                }
                C57862c cVar2 = dVar3.f154584c;
                if (cVar2 == null) {
                    cVar2 = C57862c.f154575d;
                }
                sb.append(cVar2.f154579c);
                sb.append(":");
                C57863d dVar4 = ((C57913b) mo40797b().instance).f154902c;
                if (dVar4 == null) {
                    dVar4 = C57863d.f154580d;
                }
                C57862c cVar3 = dVar4.f154584c;
                if (cVar3 == null) {
                    cVar3 = C57862c.f154575d;
                }
                sb.append(cVar3.f154578b);
            } else {
                C57863d dVar5 = ((C57913b) mo40797b().instance).f154902c;
                if (dVar5 == null) {
                    dVar5 = C57863d.f154580d;
                }
                C57862c cVar4 = dVar5.f154584c;
                if (cVar4 == null) {
                    cVar4 = C57862c.f154575d;
                }
                C62722b a = C62722b.m94931a(cVar4.f154578b);
                if (a == null) {
                    a = C62722b.UNKNOWN;
                }
                sb.append(a.name());
            }
        }
        sb.append(" Timestamp");
        if (mo40799e().mo56113h()) {
            sb.append(" [Custom]: ");
            sb.append(mo40799e().mo56107c());
        } else {
            sb.append(": ");
            C57863d dVar6 = ((C57913b) mo40797b().instance).f154902c;
            if (dVar6 == null) {
                dVar6 = C57863d.f154580d;
            }
            C63042fg fgVar = dVar6.f154583b;
            if (fgVar == null) {
                fgVar = C63042fg.f170152c;
            }
            sb.append(C62953e.m95479d(fgVar));
        }
        sb.append("ns. ");
        if (!mo40800f().isEmpty()) {
            sb.append(", Tags: [");
            C58800sl lA = mo40800f().keySet().iterator();
            boolean z = true;
            while (lA.hasNext()) {
                String str = (String) lA.next();
                if (!z) {
                    sb.append("; ");
                }
                sb.append(str);
                sb.append(":");
                Set set = (Set) mo40800f().get(str);
                if (set == null) {
                    sb.append("<null>");
                } else {
                    new C58827ar(",").mo56100g(sb, set);
                }
                z = false;
            }
            sb.append("]");
        }
        sb.append("}");
        return sb.toString();
    }
}
