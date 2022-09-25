package com.google.android.libraries.geller.portable.p1821a;

import android.content.Context;
import com.google.android.libraries.p1635au.C19566c;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58869cf;
import com.google.common.base.C58881cr;
import com.google.common.base.C58903m;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65768az;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.geller.portable.a.bb */
/* compiled from: PG */
public final class C21910bb implements C21907az {

    /* renamed from: a */
    public final C21905ax f60483a;

    /* renamed from: b */
    public final String f60484b;

    /* renamed from: c */
    public final String f60485c;

    /* renamed from: d */
    private final C58881cr f60486d;

    private C21910bb(C58881cr crVar, C21905ax axVar, String str, String str2) {
        this.f60486d = crVar;
        this.f60483a = axVar;
        this.f60484b = str;
        this.f60485c = str2;
    }

    /* renamed from: c */
    public static C21907az m41036c(C21370a aVar, Context context, ScheduledExecutorService scheduledExecutorService, C21906ay ayVar, C58833ax axVar, boolean z) {
        Objects.requireNonNull(aVar);
        C21909ba baVar = new C21909ba(aVar);
        C21905ax axVar2 = new C21905ax(scheduledExecutorService, new C19566c(context, "STREAMZ_GELLER_LIBRARY", (String) null));
        String name = ayVar.name();
        String str = "UNKNOWN_VERSION";
        if (axVar.mo56113h()) {
            if (z) {
                str = "OUTDATED_VERSION";
            } else {
                List i = C58869cf.m90936b(new C58903m('.')).mo56155i((String) axVar.mo56107c());
                if (i.size() >= 2) {
                    str = ((String) i.get(0)) + "." + ((String) i.get(1));
                }
            }
        }
        return new C21910bb(baVar, axVar2, name, str);
    }

    /* renamed from: a */
    public final void mo27214a() {
        C21905ax axVar = this.f60483a;
        ((C19567d) axVar.f60433G.mo6453a()).mo24822a(1, this.f60484b);
    }

    /* renamed from: b */
    public final long mo27215b(C65768az azVar) {
        C65139d dVar = azVar.f178796b;
        if (dVar == null) {
            dVar = C65139d.f176307e;
        }
        long j = dVar.f176310b;
        return TimeUnit.MILLISECONDS.toSeconds(((Long) this.f60486d.mo6453a()).longValue() - TimeUnit.MICROSECONDS.toMillis(j));
    }
}
