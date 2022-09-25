package com.google.android.libraries.lens.view.p2113h.p2123f;

import com.google.android.libraries.lens.ImagingSession;
import com.google.android.libraries.lens.view.vision.p2175a.C28147a;
import com.google.lens.p4707j.C62420ax;
import com.google.lens.p4707j.C62422az;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.h.f.f */
/* compiled from: PG */
public final /* synthetic */ class C26824f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C26827i f73103a;

    public /* synthetic */ C26824f(C26827i iVar) {
        this.f73103a = iVar;
    }

    public final Object call() {
        C26827i iVar = this.f73103a;
        int i = 1;
        boolean z = iVar.f73109c.mo30941b() || iVar.f73109c.mo30940a();
        C28147a aVar = iVar.f73127u;
        C62420ax axVar = (C62420ax) C62422az.f168500d.createBuilder();
        axVar.copyOnWrite();
        C62422az azVar = (C62422az) axVar.instance;
        azVar.f168503b = 2;
        azVar.f168502a |= 1;
        if (true == z) {
            i = 4;
        }
        axVar.copyOnWrite();
        C62422az azVar2 = (C62422az) axVar.instance;
        azVar2.f168504c = i - 1;
        azVar2.f168502a |= 2;
        ImagingSession a = aVar.mo33593a((C62422az) axVar.build());
        synchronized (iVar.f73108b) {
            try {
                a.mo29450a(C26832n.m49676c(C26832n.m49674a(iVar.f73122p)));
            } catch (C62974ct e) {
                throw new IllegalArgumentException("Unable to send request due to proto parsing error.", e);
            }
        }
        return a;
    }
}
