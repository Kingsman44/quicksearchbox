package com.google.android.gms.usonia.p10881d.p10882a;

import androidx.core.p097i.C1967b;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.metrics.internal.C146293a;
import com.google.android.gms.usonia.metrics.internal.C146298f;
import com.google.android.gms.usonia.p10879c.C146166b;
import com.google.android.gms.usonia.p10879c.C146168d;
import com.google.android.gms.usonia.p10879c.C146171g;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.android.gms.usonia.p10881d.C146204h;
import com.google.android.gms.usonia.p10881d.C146205i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.net.UnknownHostException;
import java.util.LinkedHashSet;
import java.util.Set;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.gms.usonia.d.a.k */
/* compiled from: PG */
public final class C146183k implements C146205i {

    /* renamed from: a */
    public static final C59071e f394975a = C59071e.m91332i("com.google.android.gms.usonia.d.a.k");

    /* renamed from: b */
    public final C146166b f394976b;

    /* renamed from: c */
    private final C146298f f394977c;

    /* renamed from: d */
    private final Set f394978d = new LinkedHashSet();

    public C146183k(C146166b bVar, C146298f fVar) {
        this.f394976b = bVar;
        this.f394977c = fVar;
    }

    /* renamed from: a */
    public final void mo122737a(PeerAddress peerAddress, C146202f fVar, C1967b bVar) {
        fVar.f395016a = false;
        C146182j jVar = new C146182j(peerAddress, fVar);
        if (!this.f394978d.contains(jVar)) {
            ((C59052c) ((C59052c) f394975a.mo56226d()).mo56372aa(42084)).mo56389s("Failed to unsubscribe from %s, already not subscribed.", peerAddress.mo122618a());
            bVar.mo3353a(13);
            return;
        }
        this.f394978d.remove(jVar);
        bVar.mo3353a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo122738b(PeerAddress peerAddress, String str, C146202f fVar, Runnable runnable, C146204h hVar) {
        C70338di diVar;
        PeerAddress peerAddress2 = peerAddress;
        C146202f fVar2 = fVar;
        C146204h hVar2 = hVar;
        String str2 = !hVar2.f395023a.isEmpty() ? hVar2.f395023a : str;
        C146182j jVar = new C146182j(peerAddress2, fVar2);
        if (!this.f394978d.contains(jVar)) {
            fVar2.f395017b = this;
            fVar2.f395018c = peerAddress2;
            C146168d dVar = new C146168d();
            dVar.f394943a = str2;
            C146166b bVar = this.f394976b;
            C146181i iVar = new C146181i(str2, peerAddress, fVar, runnable, this.f394977c, System.currentTimeMillis());
            try {
                C146187o oVar = (C146187o) ((C146187o) bVar.mo122732c(C146185m.f394981a, peerAddress2)).mo62576o(C146171g.m238097c("usonia.TraitPublisher", dVar, bVar));
                this.f394977c.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_REQUEST_COUNT, str2, 1);
                C146176d dVar2 = C146176d.f394956a;
                C70888j jVar2 = oVar.f189039a;
                C70338di diVar2 = C146188p.f394982a;
                if (diVar2 == null) {
                    synchronized (C146188p.class) {
                        diVar = C146188p.f394982a;
                        if (diVar == null) {
                            C70335df d = C70338di.m102603d();
                            d.f187487c = C70337dh.SERVER_STREAMING;
                            d.f187488d = C70338di.m102602c("usonia.TraitPublisher", "Subscribe");
                            d.f187489e = true;
                            d.f187485a = C70850d.m103697c(C146176d.f394956a);
                            d.f187486b = C70850d.m103697c(C146178f.f394958c);
                            diVar = d.mo62040a();
                            C146188p.f394982a = diVar;
                        }
                    }
                    diVar2 = diVar;
                }
                C70876o.m103763d(jVar2.mo39510a(diVar2, oVar.f189040b), dVar2, iVar, true);
                this.f394978d.add(jVar);
            } catch (UnknownHostException e) {
                ((C59052c) ((C59052c) ((C59052c) f394975a.mo56226d()).mo56382g(e)).mo56372aa(42082)).mo56389s("%s is unreachable for subscription.", peerAddress.mo122618a());
            }
        } else {
            ((C59052c) ((C59052c) f394975a.mo56225c()).mo56372aa(42083)).mo56354G("Attempt to subscribe to %s via %s, but already subscribed.", str2, peerAddress.mo122618a());
        }
    }
}
