package com.google.android.libraries.lens.view.p2054ae;

import androidx.p104d.p105a.C2164c;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.lens.view.ae.p */
/* compiled from: PG */
public final /* synthetic */ class C25017p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25021t f68216a;

    /* renamed from: b */
    public final /* synthetic */ C54040cu f68217b;

    /* renamed from: c */
    public final /* synthetic */ C2164c f68218c;

    public /* synthetic */ C25017p(C25021t tVar, C54040cu cuVar, C2164c cVar) {
        this.f68216a = tVar;
        this.f68217b = cuVar;
        this.f68218c = cVar;
    }

    public final void run() {
        C25021t tVar = this.f68216a;
        C54040cu cuVar = this.f68217b;
        C2164c cVar = this.f68218c;
        HashMap hashMap = tVar.f68227e;
        C56244ay ayVar = cuVar.f141792b;
        if (ayVar == null) {
            ayVar = C56244ay.f149802e;
        }
        hashMap.put(ayVar, cVar);
    }
}
