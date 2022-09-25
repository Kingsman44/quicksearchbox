package com.google.android.libraries.search.p2871b.p2902o.p2903a;

import com.google.android.apps.gsa.shared.logger.p7051b.p7052a.C89843c;
import com.google.android.apps.gsa.shared.logger.p7051b.p7052a.C89844d;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.search.p2871b.p2891f.C37236a;
import com.google.android.libraries.search.p2871b.p2902o.C37309b;
import com.google.android.libraries.search.p2871b.p2902o.C37313f;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protobuf.MessageLite;
import java.util.concurrent.Callable;
import p5535j.p5536a.p5562i.p5563a.p5566b.p5567a.C71189f;

/* renamed from: com.google.android.libraries.search.b.o.a.a */
/* compiled from: PG */
public final /* synthetic */ class C37307a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C37308b f99130a;

    /* renamed from: b */
    public final /* synthetic */ C37309b f99131b;

    public /* synthetic */ C37307a(C37308b bVar, C37309b bVar2) {
        this.f99130a = bVar;
        this.f99131b = bVar2;
    }

    public final Object call() {
        C37308b bVar = this.f99130a;
        C71189f d = this.f99131b.mo40862d();
        MessageLite messageLite = d;
        if (((C37313f) bVar.f99132a).f99145b.mo56113h()) {
            C89843c cVar = (C89843c) ((C37313f) bVar.f99132a).f99145b.mo56107c();
            messageLite = C89844d.m146275b(d);
        }
        C143657j d2 = ((C143658k) bVar.f99134c.mo27525b()).mo118999d(messageLite);
        if (((C37313f) bVar.f99132a).f99146c.mo56113h()) {
            int intValue = ((Integer) ((C37313f) bVar.f99132a).f99146c.mo56107c()).intValue();
            C58149a aVar = d2.f389461c;
            aVar.copyOnWrite();
            C58150b bVar2 = (C58150b) aVar.instance;
            C58150b bVar3 = C58150b.f155459k;
            bVar2.f155461a |= 16;
            bVar2.f155464d = intValue;
        }
        d2.mo118992a();
        for (C37236a c : bVar.f99133b) {
            c.mo40740c();
        }
        return null;
    }
}
