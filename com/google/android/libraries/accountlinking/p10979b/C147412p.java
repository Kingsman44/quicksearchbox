package com.google.android.libraries.accountlinking.p10979b;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.libraries.accountlinking.C147433k;
import com.google.android.libraries.phenotype.client.C31656al;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.p3562ao.p3563a.p3564a.p3565a.C45521a;
import com.google.p3562ao.p3563a.p3566b.C45522a;
import com.google.p3562ao.p3563a.p3568d.C45529a;
import com.google.p3562ao.p3563a.p3568d.C45530aa;
import com.google.p3562ao.p3563a.p3568d.C45556b;
import com.google.p3562ao.p3563a.p3568d.C45557ba;
import com.google.p3562ao.p3563a.p3568d.C45558bb;
import com.google.p3562ao.p3563a.p3568d.C45559bc;
import com.google.p3562ao.p3563a.p3568d.C45560bd;
import com.google.p3562ao.p3563a.p3568d.C45561be;
import com.google.p3562ao.p3563a.p3568d.C45562bf;
import com.google.p3562ao.p3563a.p3568d.C45572j;
import com.google.p3562ao.p3563a.p3568d.C45573k;
import com.google.p3562ao.p3563a.p3568d.C45584v;
import com.google.p3562ao.p3563a.p3568d.C45585w;
import com.google.p3562ao.p3563a.p3568d.C45588z;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;
import p5488io.grpc.C70286co;
import p5488io.grpc.C70851i;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;
import p5488io.grpc.p5533i.C70864c;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.libraries.accountlinking.b.p */
/* compiled from: PG */
public final class C147412p {

    /* renamed from: a */
    public static final C58495hd f397927a;

    /* renamed from: b */
    private final Context f397928b;

    /* renamed from: c */
    private final C70286co f397929c;

    /* renamed from: d */
    private final C60887da f397930d;

    /* renamed from: e */
    private final C58833ax f397931e;

    /* renamed from: f */
    private final C58833ax f397932f;

    /* renamed from: g */
    private final Object f397933g = new Object();

    /* renamed from: h */
    private final Map f397934h = new HashMap();

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C147433k.LINKING_INFO, C45522a.DATA_USAGE_NOTICE_TYPE_LINKING_INFO);
        gzVar.mo55429h(C147433k.CAPABILITY_CONSENT, C45522a.DATA_USAGE_NOTICE_TYPE_CAPABILITY_CONSENT);
        f397927a = gzVar.mo55427f(true);
    }

    /* renamed from: a */
    public final C60870cx mo124155a(int i, Account account, String str, int i2) {
        C45572j jVar = (C45572j) C45573k.f119105d.createBuilder();
        C45558bb d = mo124158d(i);
        jVar.copyOnWrite();
        d.getClass();
        ((C45573k) jVar.instance).f119107a = d;
        C45588z zVar = (C45588z) C45530aa.f119006d.createBuilder();
        zVar.copyOnWrite();
        str.getClass();
        ((C45530aa) zVar.instance).f119008a = str;
        jVar.copyOnWrite();
        C45530aa aaVar = (C45530aa) zVar.build();
        aaVar.getClass();
        ((C45573k) jVar.instance).f119108b = aaVar;
        jVar.copyOnWrite();
        ((C45573k) jVar.instance).f119109c = i2;
        return mo124156b(account, new C147408l((C45573k) jVar.build()));
    }

    /* renamed from: b */
    public final C60870cx mo124156b(Account account, C147411o oVar) {
        return C60846c.m92879h(mo124157c(account, oVar), Throwable.class, C147405i.f397921a, C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo124157c(Account account, C147411o oVar) {
        C45556b bVar;
        synchronized (this.f397933g) {
            if (!this.f397934h.containsKey(account)) {
                C70286co coVar = this.f397929c;
                Context context = this.f397928b;
                C45556b bVar2 = (C45556b) C70864c.m103731e(new C45529a(), C70903r.m103829a(coVar, Arrays.asList(new C70899n[]{new C147398b(context, account), new C147414r(context)})), C70851i.f189015a);
                if (this.f397932f.mo56113h() && !((List) this.f397932f.mo56107c()).isEmpty()) {
                    bVar2 = (C45556b) bVar2.mo62576o(new C70879r(C31656al.m58996b((List) this.f397932f.mo56107c())));
                }
                this.f397934h.put(account, bVar2);
            }
            bVar = (C45556b) ((C45556b) this.f397934h.get(account)).mo62575n(12, TimeUnit.SECONDS);
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return oVar.mo124154a(bVar);
        }
        C60870cx i = C60856cj.m92900i(bVar);
        Objects.requireNonNull(oVar);
        return C60922j.m93045h(i, new C147404h(oVar), this.f397930d);
    }

    /* renamed from: d */
    public final C45558bb mo124158d(int i) {
        C45557ba baVar = (C45557ba) C45558bb.f119057e.createBuilder();
        baVar.copyOnWrite();
        ((C45558bb) baVar.instance).f119060b = i;
        baVar.copyOnWrite();
        ((C45558bb) baVar.instance).f119062d = 1;
        if (this.f397931e.mo56113h()) {
            String str = (String) this.f397931e.mo56107c();
            baVar.copyOnWrite();
            str.getClass();
            ((C45558bb) baVar.instance).f119059a = str;
        }
        C45584v vVar = (C45584v) C45585w.f119130b.createBuilder();
        String str2 = this.f397928b.getApplicationInfo().packageName;
        vVar.copyOnWrite();
        str2.getClass();
        ((C45585w) vVar.instance).f119132a = str2;
        baVar.copyOnWrite();
        C45585w wVar = (C45585w) vVar.build();
        wVar.getClass();
        ((C45558bb) baVar.instance).f119061c = wVar;
        return (C45558bb) baVar.build();
    }

    /* renamed from: e */
    public final C60870cx mo124159e(int i, Account account, String str, List list, List list2, String str2, boolean z, List list3, Set set) {
        C45559bc bcVar = (C45559bc) C45562bf.f119067i.createBuilder();
        C45558bb d = mo124158d(i);
        bcVar.copyOnWrite();
        d.getClass();
        ((C45562bf) bcVar.instance).f119069a = d;
        bcVar.copyOnWrite();
        str.getClass();
        ((C45562bf) bcVar.instance).f119070b = str;
        bcVar.copyOnWrite();
        C45562bf bfVar = (C45562bf) bcVar.instance;
        C62971cq cqVar = bfVar.f119071c;
        if (!cqVar.mo58948c()) {
            bfVar.f119071c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) list, (List) bfVar.f119071c);
        bcVar.copyOnWrite();
        C45562bf bfVar2 = (C45562bf) bcVar.instance;
        C62961ch chVar = bfVar2.f119072d;
        if (!chVar.mo58948c()) {
            bfVar2.f119072d = C62942bv.mutableCopy(chVar);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            bfVar2.f119072d.mo58916g(((C45521a) it.next()).getNumber());
        }
        bcVar.copyOnWrite();
        ((C45562bf) bcVar.instance).f119074f = z;
        bcVar.copyOnWrite();
        ((C45562bf) bcVar.instance).f119075g = 0;
        if (str2 != null) {
            bcVar.copyOnWrite();
            ((C45562bf) bcVar.instance).f119073e = str2;
        }
        C45560bd bdVar = (C45560bd) C45561be.f119063c.createBuilder();
        if (z && list3 != null) {
            bdVar.copyOnWrite();
            C45561be beVar = (C45561be) bdVar.instance;
            C62971cq cqVar2 = beVar.f119065a;
            if (!cqVar2.mo58948c()) {
                beVar.f119065a = C62942bv.mutableCopy(cqVar2);
            }
            C62947c.addAll((Iterable) list3, (List) beVar.f119065a);
        }
        if (set != null) {
            C58485gu<C45522a> i2 = C58485gu.m89841i(C58431eu.m89654f(set).mo55247g(C147406j.f397922a).mo55248h());
            bdVar.copyOnWrite();
            C45561be beVar2 = (C45561be) bdVar.instance;
            C62961ch chVar2 = beVar2.f119066b;
            if (!chVar2.mo58948c()) {
                beVar2.f119066b = C62942bv.mutableCopy(chVar2);
            }
            for (C45522a number : i2) {
                beVar2.f119066b.mo58916g(number.getNumber());
            }
        }
        bcVar.copyOnWrite();
        C45561be beVar3 = (C45561be) bdVar.build();
        beVar3.getClass();
        ((C45562bf) bcVar.instance).f119076h = beVar3;
        return mo124156b(account, new C147407k(bcVar));
    }

    public C147412p(Context context, C70286co coVar, C60887da daVar, C58833ax axVar, C58833ax axVar2) {
        context.getClass();
        coVar.getClass();
        this.f397928b = context;
        this.f397929c = coVar;
        this.f397930d = daVar;
        this.f397931e = axVar;
        this.f397932f = axVar2;
    }
}
