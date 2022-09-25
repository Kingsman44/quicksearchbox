package com.google.android.gms.cast.framework.p10772a;

import android.content.Context;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.internal.C143437ac;
import com.google.android.gms.cast.framework.internal.C143438b;
import com.google.android.gms.cast.internal.C143584j;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.p10723g.C142647a;
import com.google.android.p10723g.p10724a.C142649b;
import com.google.common.p4552o.p4566l.C60207g;
import com.google.common.p4552o.p4566l.C60208h;
import java.util.UUID;

/* renamed from: com.google.android.gms.cast.framework.a.c */
/* compiled from: PG */
public final class C143392c {

    /* renamed from: a */
    public final Context f388891a;

    /* renamed from: b */
    public final C143584j f388892b;

    /* renamed from: c */
    public final C143410ar f388893c;

    /* renamed from: d */
    public final C143437ac f388894d;

    /* renamed from: e */
    public final C143438b f388895e;

    /* renamed from: f */
    public int f388896f = 1;

    /* renamed from: g */
    public C142649b f388897g;

    /* renamed from: h */
    private final String f388898h = UUID.randomUUID().toString();

    public C143392c(Context context, C143584j jVar, C143410ar arVar, C143437ac acVar, C143438b bVar) {
        this.f388891a = context;
        this.f388892b = jVar;
        this.f388893c = arVar;
        this.f388894d = acVar;
        this.f388895e = bVar;
    }

    /* renamed from: a */
    public final void mo118567a(C60208h hVar, int i) {
        C60207g gVar = (C60207g) C60208h.f162890l.createBuilder(hVar);
        String str = this.f388898h;
        gVar.copyOnWrite();
        C60208h hVar2 = (C60208h) gVar.instance;
        str.getClass();
        hVar2.f162892a |= 16384;
        hVar2.f162896e = str;
        String str2 = this.f388898h;
        gVar.copyOnWrite();
        C60208h hVar3 = (C60208h) gVar.instance;
        str2.getClass();
        hVar3.f162892a |= 32768;
        hVar3.f162897f = str2;
        C60208h hVar4 = (C60208h) gVar.build();
        int i2 = this.f388896f;
        int i3 = i2 - 1;
        C142647a aVar = null;
        if (i2 != 0) {
            if (i3 == 0) {
                aVar = new C142647a(Integer.valueOf(i - 1), hVar4, 2);
            } else if (i3 == 1) {
                aVar = new C142647a(Integer.valueOf(i - 1), hVar4, 1);
            }
            C143919bh.m233958a(aVar);
            C142649b bVar = this.f388897g;
            if (bVar != null) {
                bVar.mo117432a(aVar);
                return;
            }
            return;
        }
        throw null;
    }
}
