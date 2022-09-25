package com.google.android.gms.usonia.p10881d.p10882a;

import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.metrics.internal.C146293a;
import com.google.android.gms.usonia.metrics.internal.C146298f;
import com.google.android.gms.usonia.p10881d.C146202f;
import com.google.common.p4526f.C59052c;
import p5488io.grpc.Status;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.gms.usonia.d.a.i */
/* compiled from: PG */
final class C146181i implements C70862aj {

    /* renamed from: a */
    private final String f394966a;

    /* renamed from: b */
    private final PeerAddress f394967b;

    /* renamed from: c */
    private final Runnable f394968c;

    /* renamed from: d */
    private final C146202f f394969d;

    /* renamed from: e */
    private final C146298f f394970e;

    /* renamed from: f */
    private final long f394971f;

    /* renamed from: g */
    private boolean f394972g = false;

    public C146181i(String str, PeerAddress peerAddress, C146202f fVar, Runnable runnable, C146298f fVar2, long j) {
        this.f394966a = str;
        this.f394967b = peerAddress;
        this.f394968c = runnable;
        this.f394969d = fVar;
        this.f394970e = fVar2;
        this.f394971f = j;
    }

    /* renamed from: a */
    public final void mo20121a() {
        ((C59052c) ((C59052c) C146183k.f394975a.mo56224b()).mo56372aa(42075)).mo56354G("Subscription to %s for %s is completed!", this.f394967b.mo122618a(), this.f394966a);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        Status d = Status.m102100d(th);
        ((C59052c) ((C59052c) ((C59052c) C146183k.f394975a.mo56226d()).mo56382g(th)).mo56372aa(42076)).mo56359L("Error occurred in subscription to %s for %s: %s", this.f394966a, this.f394967b.mo122618a(), d.getDescription());
        if (!this.f394972g) {
            this.f394970e.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_FIRST_STATUS_CODE, this.f394966a, (long) d.getCode().value());
            this.f394972g = true;
        }
        this.f394970e.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_STATUS_CODE, this.f394966a, (long) d.getCode().value());
        this.f394969d.mo122745e();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo20123c(Object obj) {
        C146178f fVar = (C146178f) obj;
        if (!this.f394972g) {
            long currentTimeMillis = System.currentTimeMillis() - this.f394971f;
            if (currentTimeMillis > 0) {
                this.f394970e.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_RTT, this.f394966a, currentTimeMillis);
            } else {
                ((C59052c) ((C59052c) C146183k.f394975a.mo56226d()).mo56372aa(42081)).mo56388r("Got an invalid round trip time of %d", currentTimeMillis);
            }
            this.f394970e.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_FIRST_STATUS_CODE, this.f394966a, (long) Status.f186902OK.getCode().value());
            this.f394972g = true;
        }
        ((C59052c) ((C59052c) C146183k.f394975a.mo56224b()).mo56372aa(42077)).mo56389s("Got a response from subscribing to %s", this.f394967b.mo122618a());
        this.f394970e.mo122862c(C146293a.TRAIT_SUBSCRIBE_CLIENT_RESPONSE_COUNT, this.f394966a, 1);
        if (fVar.f394960a != null) {
            C59052c cVar = (C59052c) ((C59052c) C146183k.f394975a.mo56226d()).mo56372aa(42080);
            C146174b bVar = fVar.f394960a;
            if (bVar == null) {
                bVar = C146174b.f394952c;
            }
            int i = bVar.f394954a;
            C146174b bVar2 = fVar.f394960a;
            if (bVar2 == null) {
                bVar2 = C146174b.f394952c;
            }
            cVar.mo56395y("Subscribe error: code:%s (%s)", i, bVar2.f394955b);
            return;
        }
        C146202f fVar2 = this.f394969d;
        if (!fVar2.f395016a) {
            fVar2.f395016a = true;
            ((C146191s) this.f394968c).f394992a.mo122744d();
        }
        C146180h hVar = fVar.f394961b;
        if (hVar != null) {
            ((C59052c) ((C59052c) C146183k.f394975a.mo56224b()).mo56372aa(42078)).mo56353F("Got %s trait, version: %d", this.f394966a, hVar.f394964a);
            this.f394969d.mo53140d(hVar.f394965b, hVar.f394964a);
            return;
        }
        ((C59052c) ((C59052c) C146183k.f394975a.mo56226d()).mo56372aa(42079)).mo56386p("Received response without Trait.");
    }
}
