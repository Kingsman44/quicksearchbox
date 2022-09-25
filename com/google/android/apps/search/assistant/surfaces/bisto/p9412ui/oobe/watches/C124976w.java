package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.watches;

import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9388c.C124532d;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4543n.p4545b.C59365af;
import com.google.protobuf.C63088z;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63139e;
import com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4784c.p4785a.p4786a.p4787a.C63140f;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.watches.w */
/* compiled from: PG */
final class C124976w implements C58881cr {

    /* renamed from: a */
    int f344828a = 0;

    /* renamed from: b */
    final /* synthetic */ C58485gu f344829b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f344830c;

    /* renamed from: d */
    final /* synthetic */ String f344831d;

    /* renamed from: e */
    final /* synthetic */ String f344832e;

    /* renamed from: f */
    final /* synthetic */ byte[] f344833f;

    /* renamed from: g */
    final /* synthetic */ C124977x f344834g;

    public C124976w(C124977x xVar, C58485gu guVar, AtomicReference atomicReference, String str, String str2, byte[] bArr) {
        this.f344834g = xVar;
        this.f344829b = guVar;
        this.f344830c = atomicReference;
        this.f344831d = str;
        this.f344832e = str2;
        this.f344833f = bArr;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo6453a() {
        this.f344828a++;
        Duration duration = C124977x.f344836b;
        int size = this.f344829b.size();
        int i = this.f344828a;
        if (size > i) {
            Duration duration2 = (Duration) this.f344829b.get(i);
            duration2.getClass();
            if (C59365af.m92281a(C124977x.f344836b, duration2)) {
                duration = (Duration) this.f344829b.get(this.f344828a);
            }
        }
        this.f344830c.set(Instant.now());
        C58976aa aaVar = C58975e.f156826a;
        C124977x xVar = this.f344834g;
        String str = this.f344831d;
        String str2 = this.f344832e;
        byte[] bArr = this.f344833f;
        C124532d dVar = xVar.f344845i;
        C63139e eVar = (C63139e) C63140f.f170505f.createBuilder();
        C63088z A = C63088z.m96139A(bArr);
        eVar.copyOnWrite();
        C63140f fVar = (C63140f) eVar.instance;
        fVar.f170507a |= 1;
        fVar.f170508b = A;
        eVar.copyOnWrite();
        C63140f fVar2 = (C63140f) eVar.instance;
        fVar2.f170507a |= 2;
        fVar2.f170509c = true;
        eVar.copyOnWrite();
        C63140f fVar3 = (C63140f) eVar.instance;
        str2.getClass();
        fVar3.f170507a |= 4;
        fVar3.f170510d = str2;
        boolean z = xVar.f344842f;
        eVar.copyOnWrite();
        C63140f fVar4 = (C63140f) eVar.instance;
        fVar4.f170507a |= 8;
        fVar4.f170511e = z;
        return dVar.mo106450a(str, "/assistant/psk", ((C63140f) eVar.build()).toByteArray(), duration);
    }
}
