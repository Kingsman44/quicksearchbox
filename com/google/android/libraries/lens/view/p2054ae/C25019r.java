package com.google.android.libraries.lens.view.p2054ae;

import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.p4017at.p4056g.p4057a.p4058a.C54042cw;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56244ay;
import java.util.HashMap;

/* renamed from: com.google.android.libraries.lens.view.ae.r */
/* compiled from: PG */
public final /* synthetic */ class C25019r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C25020s f68220a;

    /* renamed from: b */
    public final /* synthetic */ C54042cw f68221b;

    public /* synthetic */ C25019r(C25020s sVar, C54042cw cwVar) {
        this.f68220a = sVar;
        this.f68221b = cwVar;
    }

    public final void run() {
        C25020s sVar = this.f68220a;
        C54042cw cwVar = this.f68221b;
        HashMap hashMap = sVar.f68222a.f68227e;
        C56244ay ayVar = cwVar.f141797b;
        if (ayVar == null) {
            ayVar = C56244ay.f149802e;
        }
        if (!hashMap.containsKey(ayVar)) {
            C58970a aVar = (C58970a) ((C58970a) C25021t.f68224b.mo56226d()).mo56372aa(49626);
            C56244ay ayVar2 = cwVar.f141797b;
            long j = (ayVar2 == null ? C56244ay.f149802e : ayVar2).f149805b;
            if (ayVar2 == null) {
                ayVar2 = C56244ay.f149802e;
            }
            aVar.mo56350C("Request no longer awaits response (EyesSessionId: %s, PayloadId: %s)", j, ayVar2.f149807d);
            return;
        }
        HashMap hashMap2 = sVar.f68222a.f68227e;
        C56244ay ayVar3 = cwVar.f141797b;
        if (ayVar3 == null) {
            ayVar3 = C56244ay.f149802e;
        }
        C2164c cVar = (C2164c) hashMap2.get(ayVar3);
        cVar.getClass();
        cVar.mo5437b(cwVar);
        HashMap hashMap3 = sVar.f68222a.f68227e;
        C56244ay ayVar4 = cwVar.f141797b;
        if (ayVar4 == null) {
            ayVar4 = C56244ay.f149802e;
        }
        hashMap3.remove(ayVar4);
    }
}
