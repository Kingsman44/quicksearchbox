package com.google.android.libraries.lens.view.vision.p2175a;

import android.os.StrictMode;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.lens.p4707j.C62420ax;
import com.google.lens.p4707j.C62422az;
import com.google.lens.p4707j.C62424ba;
import com.google.lens.p4707j.C62425bb;
import com.google.lens.p4707j.C62516el;
import com.google.lens.p4707j.C62517em;
import com.google.lens.p4707j.C62530ez;
import com.google.lens.p4707j.C62532fa;
import com.google.lens.p4707j.C62533fb;
import com.google.lens.p4707j.C62536fe;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.vision.a.d */
/* compiled from: PG */
public final /* synthetic */ class C28150d implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C28156j f76582a;

    /* renamed from: b */
    public final /* synthetic */ C21370a f76583b;

    /* renamed from: c */
    public final /* synthetic */ C28147a f76584c;

    public /* synthetic */ C28150d(C28156j jVar, C21370a aVar, C28147a aVar2) {
        this.f76582a = jVar;
        this.f76583b = aVar;
        this.f76584c = aVar2;
    }

    /* JADX INFO: finally extract failed */
    public final Object call() {
        C28156j jVar = this.f76582a;
        C21370a aVar = this.f76583b;
        C28147a aVar2 = this.f76584c;
        long e = aVar.mo26873e();
        synchronized (jVar.f76594i) {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
                C62420ax axVar = (C62420ax) C62422az.f168500d.createBuilder();
                axVar.copyOnWrite();
                C62422az azVar = (C62422az) axVar.instance;
                azVar.f168503b = 0;
                azVar.f168502a |= 1;
                axVar.copyOnWrite();
                C62422az azVar2 = (C62422az) axVar.instance;
                azVar2.f168504c = 0;
                azVar2.f168502a |= 2;
                jVar.f76592g = aVar2.mo33593a((C62422az) axVar.build());
                StrictMode.setThreadPolicy(threadPolicy);
                long e2 = aVar.mo26873e();
                jVar.f76576d = TimeUnit.NANOSECONDS.toMicros(e2 - e);
                C62424ba a = C28148b.m52458a();
                C62533fb fbVar = (C62533fb) C62536fe.f168839e.createBuilder();
                fbVar.copyOnWrite();
                C62536fe feVar = (C62536fe) fbVar.instance;
                feVar.f168844d = 0;
                feVar.f168841a |= 1;
                C62530ez ezVar = (C62530ez) C62532fa.f168834c.createBuilder();
                C62516el elVar = (C62516el) C62517em.f168785q.createBuilder();
                elVar.copyOnWrite();
                C62517em emVar = (C62517em) elVar.instance;
                emVar.f168787a |= 2048;
                emVar.f168796j = true;
                elVar.copyOnWrite();
                C62517em emVar2 = (C62517em) elVar.instance;
                emVar2.f168787a |= 4096;
                emVar2.f168797k = 2;
                elVar.copyOnWrite();
                C62517em emVar3 = (C62517em) elVar.instance;
                emVar3.f168787a |= 16;
                emVar3.f168790d = true;
                elVar.copyOnWrite();
                C62517em emVar4 = (C62517em) elVar.instance;
                emVar4.f168787a |= 32;
                emVar4.f168791e = true;
                elVar.copyOnWrite();
                C62517em emVar5 = (C62517em) elVar.instance;
                emVar5.f168787a |= 64;
                emVar5.f168792f = true;
                elVar.copyOnWrite();
                C62517em emVar6 = (C62517em) elVar.instance;
                emVar6.f168787a |= 16384;
                emVar6.f168799m = 5;
                elVar.copyOnWrite();
                C62517em emVar7 = (C62517em) elVar.instance;
                emVar7.f168787a |= 2;
                emVar7.f168788b = true;
                elVar.copyOnWrite();
                C62517em emVar8 = (C62517em) elVar.instance;
                emVar8.f168787a |= 4;
                emVar8.f168789c = true;
                elVar.copyOnWrite();
                C62517em emVar9 = (C62517em) elVar.instance;
                emVar9.f168787a |= 32768;
                emVar9.f168800n = false;
                elVar.copyOnWrite();
                C62517em emVar10 = (C62517em) elVar.instance;
                emVar10.f168787a |= 65536;
                emVar10.f168801o = false;
                elVar.copyOnWrite();
                C62517em emVar11 = (C62517em) elVar.instance;
                emVar11.f168787a |= C89885b.S3REQUEST_VALUE;
                emVar11.f168802p = true;
                elVar.copyOnWrite();
                C62517em emVar12 = (C62517em) elVar.instance;
                emVar12.f168787a |= 512;
                emVar12.f168795i = false;
                elVar.copyOnWrite();
                C62517em emVar13 = (C62517em) elVar.instance;
                emVar13.f168787a |= 128;
                emVar13.f168793g = true;
                elVar.copyOnWrite();
                C62517em emVar14 = (C62517em) elVar.instance;
                emVar14.f168787a |= 256;
                emVar14.f168794h = 0.1f;
                elVar.copyOnWrite();
                C62517em emVar15 = (C62517em) elVar.instance;
                emVar15.f168787a |= 8192;
                emVar15.f168798l = 1;
                C62517em emVar16 = (C62517em) elVar.build();
                ezVar.copyOnWrite();
                C62532fa faVar = (C62532fa) ezVar.instance;
                emVar16.getClass();
                faVar.f168837b = emVar16;
                faVar.f168836a |= 2;
                fbVar.copyOnWrite();
                C62536fe feVar2 = (C62536fe) fbVar.instance;
                C62532fa faVar2 = (C62532fa) ezVar.build();
                faVar2.getClass();
                feVar2.f168843c = faVar2;
                feVar2.f168842b = 2;
                a.copyOnWrite();
                C62425bb bbVar = (C62425bb) a.instance;
                C62536fe feVar3 = (C62536fe) fbVar.build();
                C62425bb bbVar2 = C62425bb.f168506e;
                feVar3.getClass();
                bbVar.f168510c = feVar3;
                bbVar.f168509b = 2;
                jVar.mo33610z((C62425bb) a.build(), (ByteBuffer) null);
                jVar.f76577e = TimeUnit.NANOSECONDS.toMicros(aVar.mo26873e() - e2);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th;
            }
        }
        return null;
    }
}
