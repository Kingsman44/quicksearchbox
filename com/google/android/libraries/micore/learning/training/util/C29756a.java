package com.google.android.libraries.micore.learning.training.util;

import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.internal.p10827a.C144762b;
import com.google.android.gms.learning.internal.p10827a.C144763c;
import com.google.android.libraries.micore.learning.base.C29720l;
import com.google.android.libraries.micore.learning.base.C29721m;
import com.google.android.libraries.micore.learning.base.C29724p;
import com.google.common.p4552o.p4554b.p4555a.C59604a;
import com.google.common.p4552o.p4554b.p4555a.C59611ag;
import com.google.common.p4552o.p4554b.p4555a.C59612ah;
import com.google.common.p4552o.p4554b.p4555a.C59613ai;
import com.google.common.p4552o.p4554b.p4555a.C59618an;
import com.google.common.p4552o.p4554b.p4555a.C59619ao;
import com.google.common.p4552o.p4554b.p4555a.C59623c;
import com.google.common.p4552o.p4554b.p4555a.C59625e;
import com.google.common.p4552o.p4554b.p4555a.C59626f;
import com.google.common.p4552o.p4554b.p4555a.C59627g;
import com.google.common.p4552o.p4554b.p4555a.C59628h;

/* renamed from: com.google.android.libraries.micore.learning.training.util.a */
/* compiled from: PG */
public final class C29756a implements C29759d {

    /* renamed from: a */
    private final Context f80620a;

    /* renamed from: b */
    private final C144573b f80621b;

    /* renamed from: c */
    private final C144827n f80622c;

    /* renamed from: d */
    private final C144762b f80623d;

    /* renamed from: e */
    private final C29724p f80624e;

    /* renamed from: f */
    private final C29720l f80625f;

    public C29756a(Context context, C144573b bVar, C144827n nVar, C144762b bVar2, C29724p pVar, C29720l lVar) {
        this.f80620a = context;
        this.f80621b = bVar;
        this.f80622c = nVar;
        this.f80623d = bVar2;
        this.f80624e = pVar;
        this.f80625f = lVar;
    }

    /* renamed from: a */
    public final void mo34929a(C59611ag agVar, boolean z, C59628h hVar) {
        C59611ag agVar2 = agVar;
        int a = C59618an.m92468a(((C59619ao) agVar2.instance).f159850b);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (!(i == 0 || i == 7 || i == 11)) {
            C59612ah ahVar = (C59612ah) C59613ai.f159838e.createBuilder();
            C29721m a2 = this.f80625f.mo34857a();
            int i2 = a2.f80488b;
            ahVar.copyOnWrite();
            C59613ai aiVar = (C59613ai) ahVar.instance;
            aiVar.f159840a |= 2;
            aiVar.f159842c = ((long) i2) * 1000;
            int i3 = a2.f80487a;
            ahVar.copyOnWrite();
            C59613ai aiVar2 = (C59613ai) ahVar.instance;
            aiVar2.f159840a |= 1;
            aiVar2.f159841b = ((long) i3) * 1000;
            int i4 = a2.f80489c;
            ahVar.copyOnWrite();
            C59613ai aiVar3 = (C59613ai) ahVar.instance;
            aiVar3.f159840a |= 8;
            aiVar3.f159843d = ((long) i4) * 1000;
            C59613ai aiVar4 = (C59613ai) ahVar.build();
            agVar.copyOnWrite();
            C59619ao aoVar = (C59619ao) agVar2.instance;
            aiVar4.getClass();
            aoVar.f159855g = aiVar4;
            aoVar.f159849a |= 512;
            int a3 = C59618an.m92468a(aoVar.f159850b);
            if (a3 == 0) {
                a3 = 1;
            }
            boolean aL = this.f80621b.mo119978aL();
            boolean aJ = this.f80621b.mo119976aJ();
            if (!aL) {
                if (aJ) {
                    aJ = true;
                }
            }
            C59627g gVar = (C59627g) hVar.toBuilder();
            C59619ao aoVar2 = hVar.f159877c;
            if (aoVar2 == null) {
                aoVar2 = C59619ao.f159847l;
            }
            C59611ag agVar3 = (C59611ag) aoVar2.toBuilder();
            agVar3.copyOnWrite();
            C59619ao aoVar3 = (C59619ao) agVar3.instance;
            aoVar3.f159850b = a3 - 1;
            aoVar3.f159849a |= 1;
            gVar.copyOnWrite();
            C59628h hVar2 = (C59628h) gVar.instance;
            C59619ao aoVar4 = (C59619ao) agVar3.build();
            aoVar4.getClass();
            hVar2.f159877c = aoVar4;
            hVar2.f159875a |= 4;
            C59628h hVar3 = (C59628h) gVar.build();
            if (aL) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) this.f80620a.getSystemService("activity")).getMemoryInfo(memoryInfo);
                long j = memoryInfo.totalMem;
                long j2 = memoryInfo.availMem;
                long j3 = memoryInfo.threshold;
                if (a3 == 2 || a3 == 39) {
                    this.f80622c.mo120052d(9, hVar3, memoryInfo.totalMem);
                }
                this.f80622c.mo120052d(10, hVar3, memoryInfo.availMem);
                this.f80622c.mo120052d(11, hVar3, memoryInfo.threshold);
                this.f80622c.mo120052d(12, hVar3, memoryInfo.availMem - memoryInfo.threshold);
                this.f80622c.mo120052d(13, hVar3, true != memoryInfo.lowMemory ? 0 : 1);
            }
            if (aJ) {
                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                ActivityManager.getMyMemoryState(runningAppProcessInfo);
                int i5 = runningAppProcessInfo.importance;
                int i6 = runningAppProcessInfo.lru;
                long j4 = aiVar4.f159842c;
                long j5 = aiVar4.f159841b;
                long j6 = aiVar4.f159843d;
                this.f80622c.mo120052d(14, hVar3, (long) runningAppProcessInfo.importance);
                this.f80622c.mo120052d(15, hVar3, (long) runningAppProcessInfo.lru);
                this.f80622c.mo120052d(16, hVar3, aiVar4.f159842c);
                this.f80622c.mo120052d(17, hVar3, aiVar4.f159841b);
            }
        }
        int a4 = C59618an.m92468a(((C59619ao) agVar2.instance).f159850b);
        if (a4 == 0) {
            a4 = 1;
        }
        int i7 = a4 - 1;
        if (i7 != 0 && i7 != 7 && i7 != 11) {
            C144763c a5 = this.f80623d.mo120196a();
            if (a5 != null) {
                C59604a aVar = (C59604a) C59626f.f159866f.createBuilder();
                int a6 = C59625e.m92470a(a5.f391610a);
                if (a6 != 0) {
                    aVar.copyOnWrite();
                    C59626f fVar = (C59626f) aVar.instance;
                    fVar.f159871d = a6 - 1;
                    fVar.f159868a |= 4;
                }
                int a7 = C59623c.m92469a(a5.f391611b);
                if (a7 != 0) {
                    aVar.copyOnWrite();
                    C59626f fVar2 = (C59626f) aVar.instance;
                    fVar2.f159872e = a7 - 1;
                    fVar2.f159868a |= 8;
                }
                float f = a5.f391612c;
                aVar.copyOnWrite();
                C59626f fVar3 = (C59626f) aVar.instance;
                fVar3.f159868a = 1 | fVar3.f159868a;
                fVar3.f159869b = f;
                long j7 = a5.f391613d;
                aVar.copyOnWrite();
                C59626f fVar4 = (C59626f) aVar.instance;
                fVar4.f159868a = 2 | fVar4.f159868a;
                fVar4.f159870c = j7;
                agVar.copyOnWrite();
                C59619ao aoVar5 = (C59619ao) agVar2.instance;
                C59626f fVar5 = (C59626f) aVar.build();
                fVar5.getClass();
                aoVar5.f159856h = fVar5;
                aoVar5.f159849a |= 2048;
            }
            if (z) {
                int a8 = this.f80624e.mo34858a();
                agVar.copyOnWrite();
                C59619ao aoVar6 = (C59619ao) agVar2.instance;
                int i8 = a8 - 1;
                if (a8 != 0) {
                    aoVar6.f159858j = i8;
                    aoVar6.f159849a |= 65536;
                    return;
                }
                throw null;
            }
        }
    }
}
