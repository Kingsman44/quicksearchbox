package com.google.android.libraries.mdi.download.p2236d.p2241e;

import com.google.android.libraries.mdi.download.C29395es;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4575r.C60757n;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.d.e.ad */
/* compiled from: PG */
public final /* synthetic */ class C29015ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C29025an f78775a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f78776b;

    public /* synthetic */ C29015ad(C29025an anVar, AtomicReference atomicReference) {
        this.f78775a = anVar;
        this.f78776b = atomicReference;
    }

    public final Object apply(Object obj) {
        C29025an anVar = this.f78775a;
        AtomicReference atomicReference = this.f78776b;
        C29396et etVar = (C29396et) obj;
        Long valueOf = Long.valueOf(anVar.f78788b.mo34498a());
        C63042fg fgVar = etVar.f79694b;
        if (fgVar == null) {
            fgVar = C63042fg.f170152c;
        }
        Long valueOf2 = Long.valueOf(C62953e.m95478c(fgVar));
        C29395es esVar = (C29395es) etVar.toBuilder();
        C63042fg i = C62953e.m95484i(valueOf.longValue());
        esVar.copyOnWrite();
        C29396et etVar2 = (C29396et) esVar.instance;
        i.getClass();
        etVar2.f79694b = i;
        etVar2.f79693a |= 1;
        C29396et etVar3 = (C29396et) esVar.build();
        if ((etVar.f79693a & 1) != 0) {
            atomicReference.set(C58833ax.m90834k(Integer.valueOf(C60757n.m92748i(TimeUnit.MILLISECONDS.toDays(C29025an.m53899f(valueOf.longValue()) - C29025an.m53899f(valueOf2.longValue()))))));
        }
        return etVar3;
    }
}
