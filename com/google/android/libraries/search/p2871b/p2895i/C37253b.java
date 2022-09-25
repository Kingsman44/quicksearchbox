package com.google.android.libraries.search.p2871b.p2895i;

import com.google.android.libraries.search.p2871b.p2887b.C37216a;
import com.google.android.libraries.search.p2871b.p2890e.C37232a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4419bx.C57860a;
import com.google.p4419bx.C57861b;
import com.google.p4419bx.C57862c;
import com.google.p4419bx.C57863d;
import com.google.p4438c.p4439a.C57912a;
import com.google.p4438c.p4439a.C57913b;
import com.google.p4438c.p4439a.C57914c;
import com.google.p4438c.p4439a.C57915d;
import com.google.p4438c.p4439a.C57916e;
import com.google.p4438c.p4439a.C57917f;
import com.google.p4438c.p4439a.C57918g;
import com.google.p4438c.p4439a.C57920i;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.b.i.b */
/* compiled from: PG */
public final class C37253b implements C37252a {

    /* renamed from: a */
    public final C37216a f98999a;

    /* renamed from: b */
    public final C57912a f99000b = ((C57912a) C57913b.f154898e.createBuilder());

    /* renamed from: c */
    public boolean f99001c;

    /* renamed from: d */
    public long f99002d;

    /* renamed from: e */
    private final Map f99003e = new HashMap();

    /* renamed from: f */
    private final Set f99004f = new HashSet();

    /* renamed from: g */
    private C58833ax f99005g;

    /* renamed from: h */
    private C58833ax f99006h;

    /* renamed from: i */
    private C58833ax f99007i;

    /* renamed from: j */
    private C58833ax f99008j;

    public C37253b(C37216a aVar) {
        C58836b bVar = C58836b.f156633a;
        this.f99005g = bVar;
        this.f99006h = bVar;
        this.f99007i = bVar;
        this.f99008j = bVar;
        this.f99001c = false;
        this.f98999a = aVar;
    }

    /* renamed from: a */
    public final long mo40777a() {
        return this.f99002d;
    }

    /* renamed from: b */
    public final C37232a mo40778b() {
        return this.f98999a.f98876a;
    }

    /* renamed from: c */
    public final C37252a mo40779c() {
        return this;
    }

    /* renamed from: d */
    public final C37252a mo40780d(int i, String str) {
        this.f99005g = C58833ax.m90834k(Integer.valueOf(i));
        this.f99006h = C58833ax.m90834k(str);
        return this;
    }

    /* renamed from: e */
    public final C37252a mo40781e(C62722b bVar) {
        this.f99005g = C58833ax.m90834k(Integer.valueOf(bVar.f169415s));
        this.f99006h = C58836b.f156633a;
        return this;
    }

    /* renamed from: f */
    public final C37256e mo40782f() {
        C37216a aVar;
        C57912a aVar2;
        C58495hd hdVar;
        C58528ij ijVar;
        C37255d d = C37256e.m66155d();
        C57912a aVar3 = (C57912a) C57913b.f154898e.createBuilder((C57913b) this.f99000b.build());
        C37261j jVar = (C37261j) d;
        jVar.f99017e = C58495hd.m89898l(this.f99003e);
        jVar.f99015c = this.f98999a;
        jVar.f99018f = C58528ij.m90006F(this.f99004f);
        C57918g gVar = (C57918g) C57920i.f154916f.createBuilder();
        C57916e eVar = (C57916e) C57917f.f154908f.createBuilder();
        int i = this.f98999a.f98876a.f98906a;
        eVar.copyOnWrite();
        C57917f fVar = (C57917f) eVar.instance;
        fVar.f154910a |= 2;
        fVar.f154912c = i;
        gVar.copyOnWrite();
        C57920i iVar = (C57920i) gVar.instance;
        C57917f fVar2 = (C57917f) eVar.build();
        fVar2.getClass();
        iVar.f154922e = fVar2;
        iVar.f154918a |= 16;
        gVar.copyOnWrite();
        C57920i iVar2 = (C57920i) gVar.instance;
        iVar2.f154921d = 1;
        iVar2.f154918a |= 1;
        if (this.f99007i.mo56113h()) {
            long longValue = ((Long) this.f99007i.mo56107c()).longValue();
            gVar.copyOnWrite();
            C57920i iVar3 = (C57920i) gVar.instance;
            iVar3.f154919b = 4;
            iVar3.f154920c = Long.valueOf(longValue);
        }
        if (this.f99008j.mo56113h()) {
            String str = (String) this.f99008j.mo56107c();
            gVar.copyOnWrite();
            C57920i iVar4 = (C57920i) gVar.instance;
            str.getClass();
            iVar4.f154919b = 5;
            iVar4.f154920c = str;
        }
        aVar3.copyOnWrite();
        C57913b bVar = (C57913b) aVar3.instance;
        C57920i iVar5 = (C57920i) gVar.build();
        iVar5.getClass();
        bVar.f154901b = iVar5;
        bVar.f154900a |= 1;
        if (this.f99005g.mo56113h()) {
            C57861b bVar2 = (C57861b) C57862c.f154575d.createBuilder();
            int intValue = ((Integer) this.f99005g.mo56107c()).intValue();
            bVar2.copyOnWrite();
            C57862c cVar = (C57862c) bVar2.instance;
            cVar.f154577a |= 1;
            cVar.f154578b = intValue;
            if (this.f99006h.mo56113h()) {
                String str2 = (String) this.f99006h.mo56107c();
                bVar2.copyOnWrite();
                C57862c cVar2 = (C57862c) bVar2.instance;
                str2.getClass();
                cVar2.f154577a |= 2;
                cVar2.f154579c = str2;
            }
            C57860a aVar4 = (C57860a) C57863d.f154580d.createBuilder();
            aVar4.copyOnWrite();
            C57863d dVar = (C57863d) aVar4.instance;
            C57862c cVar3 = (C57862c) bVar2.build();
            cVar3.getClass();
            dVar.f154584c = cVar3;
            dVar.f154582a |= 2;
            aVar3.copyOnWrite();
            C57913b bVar3 = (C57913b) aVar3.instance;
            C57863d dVar2 = (C57863d) aVar4.build();
            dVar2.getClass();
            bVar3.f154902c = dVar2;
            bVar3.f154900a |= 2;
        }
        if (this.f99001c) {
            jVar.f99014b = C58833ax.m90834k(Long.valueOf(this.f99002d));
            C57860a aVar5 = (C57860a) C57863d.f154580d.createBuilder();
            C63042fg j = C62953e.m95485j(this.f99002d);
            aVar5.copyOnWrite();
            C57863d dVar3 = (C57863d) aVar5.instance;
            j.getClass();
            dVar3.f154583b = j;
            dVar3.f154582a |= 1;
            aVar3.mo54538a((C57863d) aVar5.build());
        }
        if (aVar3 != null) {
            jVar.f99016d = aVar3;
            if (jVar.f99019g == 1 && (aVar = jVar.f99015c) != null && (aVar2 = jVar.f99016d) != null && (hdVar = jVar.f99017e) != null && (ijVar = jVar.f99018f) != null) {
                return new C37262k(jVar.f99013a, jVar.f99014b, aVar, aVar2, hdVar, ijVar);
            }
            StringBuilder sb = new StringBuilder();
            if (jVar.f99019g == 0) {
                sb.append(" sequenceNo");
            }
            if (jVar.f99015c == null) {
                sb.append(" event");
            }
            if (jVar.f99016d == null) {
                sb.append(" appEventBuilder");
            }
            if (jVar.f99017e == null) {
                sb.append(" tags");
            }
            if (jVar.f99018f == null) {
                sb.append(" testCodes");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null appEventBuilder");
    }

    /* renamed from: g */
    public final boolean mo40783g() {
        return this.f99001c;
    }

    /* renamed from: h */
    public final boolean mo40784h() {
        return this.f99007i.mo56113h() || this.f99008j.mo56113h();
    }

    /* renamed from: i */
    public final void mo40791o(long j) {
        this.f99002d = j;
        this.f99001c = true;
    }

    /* renamed from: j */
    public final void mo40792p(C62940bt btVar, Object obj) {
        C57912a aVar = this.f99000b;
        C57915d dVar = ((C57913b) aVar.instance).f154903d;
        if (dVar == null) {
            dVar = C57915d.f154905a;
        }
        C57914c cVar = (C57914c) dVar.toBuilder();
        cVar.mo58885m(btVar, obj);
        aVar.copyOnWrite();
        C57913b bVar = (C57913b) aVar.instance;
        C57915d dVar2 = (C57915d) cVar.build();
        dVar2.getClass();
        bVar.f154903d = dVar2;
        bVar.f154900a |= 4;
    }

    /* renamed from: k */
    public final void mo40787k() {
        C58836b bVar = C58836b.f156633a;
        this.f99005g = bVar;
        this.f99006h = bVar;
    }

    /* renamed from: l */
    public final void mo40793q(long j) {
        this.f99007i = C58833ax.m90834k(Long.valueOf(j));
        this.f99008j = C58836b.f156633a;
    }

    /* renamed from: m */
    public final void mo40794r(String str) {
        this.f99008j = C58833ax.m90834k(str);
        this.f99007i = C58836b.f156633a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40795s(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            java.util.Map r0 = r2.f99003e
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x0013
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Map r1 = r2.f99003e
            r1.put(r3, r0)
            goto L_0x001c
        L_0x0013:
            java.util.Map r0 = r2.f99003e
            java.lang.Object r3 = r0.get(r3)
            r0 = r3
            java.util.Set r0 = (java.util.Set) r0
        L_0x001c:
            r0.add(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2871b.p2895i.C37253b.mo40795s(java.lang.String, java.lang.String):void");
    }
}
