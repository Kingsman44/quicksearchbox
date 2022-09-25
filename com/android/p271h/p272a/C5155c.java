package com.android.p271h.p272a;

import android.util.Log;

/* renamed from: com.android.h.a.c */
/* compiled from: PG */
final class C5155c {

    /* renamed from: a */
    public C5153a f16370a;

    /* renamed from: a */
    public final C5153a mo10228a() {
        C5153a aVar = this.f16370a;
        if (aVar != null) {
            this.f16370a = aVar.f16365n;
        }
        return aVar;
    }

    /* renamed from: b */
    public final boolean mo10229b(C5153a aVar) {
        C5153a aVar2 = this.f16370a;
        while (true) {
            boolean z = false;
            if (aVar2 == null) {
                C5153a aVar3 = this.f16370a;
                if (aVar3 == null) {
                    z = true;
                }
                aVar.f16365n = aVar3;
                this.f16370a = aVar;
                return z;
            } else if (aVar2 == aVar) {
                Log.w("TiledImageRenderer", "Attempting to add a tile already in the queue!");
                return false;
            } else {
                aVar2 = aVar2.f16365n;
            }
        }
    }
}
