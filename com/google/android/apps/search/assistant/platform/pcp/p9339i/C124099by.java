package com.google.android.apps.search.assistant.platform.pcp.p9339i;

import android.content.Context;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123623b;
import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123624c;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131655e;
import com.google.android.apps.search.assistant.verticals.ambient.smartspace.p9998d.C131656f;
import com.google.android.libraries.storage.p3315b.C42850e;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46175b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3994s.p3995a.C53190es;
import com.google.assistant.p3994s.p3995a.C53250gy;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53370lj;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.assistant.p3994s.p3995a.C53422nh;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4345d.p4350b.p4353c.C57017i;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.i.by */
/* compiled from: PG */
public final class C124099by {

    /* renamed from: a */
    public final Context f342756a;

    /* renamed from: b */
    public final Optional f342757b;

    /* renamed from: c */
    public final C124109ch f342758c;

    /* renamed from: d */
    public final C46175b f342759d;

    /* renamed from: e */
    private final Executor f342760e;

    /* renamed from: f */
    private final C58974d f342761f;

    public C124099by(Context context, Optional optional, Executor executor, C130603a aVar, C124109ch chVar, C46175b bVar) {
        this.f342756a = context;
        this.f342757b = optional;
        this.f342760e = executor;
        this.f342761f = aVar.mo109740b(this);
        this.f342758c = chVar;
        this.f342759d = bVar;
    }

    /* renamed from: b */
    private final C60870cx m203519b(AccountId accountId, C58485gu guVar, int i, C58480gp gpVar) {
        ArrayList arrayList = new ArrayList();
        C123623b a = C123624c.m202992a(this.f342756a, accountId);
        int size = guVar.size();
        int i2 = 0;
        while (i2 < size) {
            C53190es esVar = (C53190es) guVar.get(i2);
            Optional b = C131656f.m214100b(C131655e.m214096e(esVar));
            if (b.isEmpty()) {
                ((C58970a) ((C58970a) this.f342761f.mo56226d()).mo56372aa(35408)).mo56386p("No departure time is flight status data, drop the update");
            } else {
                Instant ofEpochMilli = Instant.ofEpochMilli(((Long) b.get()).longValue());
                ((C58970a) ((C58970a) this.f342761f.mo56224b()).mo56372aa(35407)).mo56389s("build flight with start time: %s", ofEpochMilli);
                C42850e eVar = a.f341550b;
                C124097bw bwVar = r0;
                C124097bw bwVar2 = new C124097bw(this, a, i, esVar, accountId, ofEpochMilli, gpVar);
                arrayList.add(eVar.mo45938b(bwVar));
            }
            i2++;
            AccountId accountId2 = accountId;
        }
        return C47638k.m84752c(arrayList).mo51521b(C124098bx.f342755a, this.f342760e);
    }

    /* renamed from: a */
    public final C60870cx mo106281a(C53422nh nhVar, C57017i iVar, AccountId accountId) {
        C58485gu guVar;
        C58485gu guVar2;
        C53420nf nfVar;
        C53420nf nfVar2;
        C53190es esVar;
        C53420nf nfVar3;
        C58480gp e = C58485gu.m89837e();
        C58480gp e2 = C58485gu.m89837e();
        if ((nhVar.f140184a & 16) != 0) {
            C53370lj ljVar = nhVar.f140188e;
            if (ljVar == null) {
                ljVar = C53370lj.f140047c;
            }
            C58480gp e3 = C58485gu.m89837e();
            for (C53366lf lfVar : ljVar.f140050b) {
                if (lfVar.f140037b == 4) {
                    nfVar = (C53420nf) lfVar.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                C53250gy gyVar = nfVar.f140176j;
                if (gyVar == null) {
                    gyVar = C53250gy.f139586c;
                }
                if (gyVar.f139588a == 2) {
                    if (lfVar.f140037b == 4) {
                        nfVar2 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar2 = C53420nf.f140165o;
                    }
                    C53250gy gyVar2 = nfVar2.f140176j;
                    if (gyVar2 == null) {
                        gyVar2 = C53250gy.f139586c;
                    }
                    if (gyVar2.f139588a == 2) {
                        esVar = (C53190es) gyVar2.f139589b;
                    } else {
                        esVar = C53190es.f139393s;
                    }
                    C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
                    C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
                    aiVar.copyOnWrite();
                    C83738aj ajVar = (C83738aj) aiVar.instance;
                    esVar.getClass();
                    ajVar.f228229b = esVar;
                    ajVar.f228228a = 4;
                    C83738aj ajVar2 = (C83738aj) aiVar.build();
                    abVar.copyOnWrite();
                    C83739ak akVar = (C83739ak) abVar.instance;
                    ajVar2.getClass();
                    akVar.f228233b = ajVar2;
                    akVar.f228232a |= 1;
                    if (lfVar.f140037b == 4) {
                        nfVar3 = (C53420nf) lfVar.f140038c;
                    } else {
                        nfVar3 = C53420nf.f140165o;
                    }
                    String str = nfVar3.f140175i;
                    abVar.copyOnWrite();
                    C83739ak akVar2 = (C83739ak) abVar.instance;
                    str.getClass();
                    akVar2.f228232a |= 1024;
                    akVar2.f228242k = str;
                    e3.mo55395g((C83739ak) abVar.build());
                }
            }
            C58485gu f = e3.mo55394f();
            if (!f.isEmpty()) {
                C83738aj ajVar3 = ((C83739ak) f.get(0)).f228233b;
                if (ajVar3 == null) {
                    ajVar3 = C83738aj.f228226c;
                }
                if (ajVar3.f228228a == 4) {
                    guVar = (C58485gu) Collection.EL.stream(f).map(C124092br.f342737a).collect(C58370cn.f155946a);
                }
            }
            guVar = C58485gu.m89845m();
        } else {
            guVar = e2.mo55394f();
        }
        C60870cx b = m203519b(accountId, guVar, 18, e);
        C58485gu a = C131656f.m214099a(iVar);
        if (!a.isEmpty()) {
            C83738aj ajVar4 = ((C83739ak) a.get(0)).f228233b;
            if (ajVar4 == null) {
                ajVar4 = C83738aj.f228226c;
            }
            if (ajVar4.f228228a == 4) {
                guVar2 = (C58485gu) Collection.EL.stream(a).map(C124095bu.f342746a).collect(C58370cn.f155946a);
                C60870cx b2 = m203519b(accountId, guVar2, 112, e);
                return C47638k.m84751b(b, b2).mo51521b(new C124093bs(this, b2, b, e), this.f342760e);
            }
        }
        guVar2 = C58485gu.m89845m();
        C60870cx b22 = m203519b(accountId, guVar2, 112, e);
        return C47638k.m84751b(b, b22).mo51521b(new C124093bs(this, b22, b, e), this.f342760e);
    }
}
