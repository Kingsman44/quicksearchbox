package com.google.android.apps.search.googleapp.launcher.p10341b.p10342a;

import android.content.Context;
import android.util.LruCache;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37253b;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59706cu;
import com.google.common.p4552o.C59708cw;
import com.google.common.p4552o.C59710cy;
import com.google.common.p4552o.C59711cz;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import java.util.UUID;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.a.b */
/* compiled from: PG */
public final class C136425b {

    /* renamed from: a */
    public final LruCache f371398a = new LruCache(10);

    /* renamed from: b */
    public final boolean f371399b;

    /* renamed from: c */
    public final Context f371400c;

    /* renamed from: d */
    public Optional f371401d = Optional.empty();

    /* renamed from: e */
    private final C37215b f371402e;

    /* renamed from: f */
    private final C21370a f371403f;

    /* renamed from: com.google.android.apps.search.googleapp.launcher.b.a.b$a */
    /* compiled from: PG */
    public interface C136426a {
        /* renamed from: ge */
        C38780c mo113015ge();
    }

    public C136425b(boolean z, Context context, C38780c cVar, C21370a aVar) {
        this.f371402e = cVar.mo41619a(C38828b.GOOGLE_APP);
        this.f371399b = z;
        this.f371400c = context;
        this.f371403f = aVar;
    }

    /* renamed from: a */
    public final C136428d mo113007a(UUID uuid) {
        C136428d dVar = new C136428d(uuid);
        this.f371398a.put(uuid, dVar);
        return dVar;
    }

    /* renamed from: b */
    public final void mo113008b(C136428d dVar, C37252a aVar) {
        C37253b bVar = (C37253b) aVar;
        bVar.mo40795s("internal_flow_id", dVar.f371404a.toString());
        aVar.mo40787k();
        bVar.mo40791o(this.f371403f.mo26872d());
        dVar.f371406c.add(aVar);
    }

    /* renamed from: c */
    public final void mo113009c(UUID uuid) {
        C136428d dVar;
        if (this.f371399b && (dVar = (C136428d) this.f371398a.get(uuid)) != null) {
            mo113013h(dVar, C37182a.f97746E.mo40806d(), C62722b.OK);
        }
    }

    /* renamed from: d */
    public final void mo113010d(UUID uuid) {
        C136428d dVar;
        if (this.f371399b && (dVar = (C136428d) this.f371398a.get(uuid)) != null) {
            mo113013h(dVar, C37182a.f97749H.mo40806d(), C62722b.CANCELLED);
        }
    }

    /* renamed from: f */
    public final void mo113011f(UUID uuid, int i) {
        C136428d dVar;
        if (this.f371399b && (dVar = (C136428d) this.f371398a.get(uuid)) != null) {
            mo113013h(dVar, C37182a.f97746E.mo40806d(), m221675e(i));
        }
    }

    /* renamed from: g */
    public final void mo113012g(UUID uuid, int i) {
        C136428d dVar;
        if (this.f371399b && (dVar = (C136428d) this.f371398a.get(uuid)) != null) {
            mo113013h(dVar, C37182a.f97820az.mo40806d(), m221675e(i));
        }
    }

    /* renamed from: h */
    public final void mo113013h(C136428d dVar, C37259h hVar, C62722b bVar) {
        C37215b bVar2 = (C37215b) this.f371401d.map(new C136424a(this)).orElse(this.f371402e);
        C58485gu j = C58485gu.m89842j(dVar.f371406c);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            bVar2.mo19974a((C37252a) j.get(i));
        }
        ((C37253b) hVar.f99012a).mo40795s("internal_flow_id", dVar.f371404a.toString());
        C62940bt btVar = C59711cz.f160208s;
        C59710cy cyVar = dVar.f371405b;
        C59706cu cuVar = dVar.f371407d;
        cyVar.copyOnWrite();
        C59711cz czVar = (C59711cz) cyVar.instance;
        C59708cw cwVar = (C59708cw) cuVar.build();
        cwVar.getClass();
        czVar.f160211b = cwVar;
        czVar.f160210a |= 4;
        ((C37253b) hVar.f99012a).mo40792p(btVar, (C59711cz) cyVar.build());
        bVar2.mo19974a(hVar.mo40781e(bVar));
        this.f371398a.remove(dVar.f371404a);
    }

    /* renamed from: i */
    public final void mo113014i(UUID uuid, C37259h hVar) {
        C136428d dVar = (C136428d) this.f371398a.get(uuid);
        if (dVar != null) {
            mo113013h(dVar, hVar, C62722b.CANCELLED);
        }
    }

    /* renamed from: e */
    public static C62722b m221675e(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return C62722b.FAILED_PRECONDITION;
            }
            if (i2 == 2) {
                return C62722b.UNAVAILABLE;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return C62722b.UNKNOWN;
                }
                return C62722b.NOT_FOUND;
            }
        }
        return C62722b.INVALID_ARGUMENT;
    }
}
