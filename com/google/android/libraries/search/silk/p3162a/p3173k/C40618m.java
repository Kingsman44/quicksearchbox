package com.google.android.libraries.search.silk.p3162a.p3173k;

import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.lens.p2016f.C24239ad;
import com.google.android.libraries.silk.p3205a.p3226o.C41729a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.lens.sdk.C62635a;
import com.google.lens.sdk.LensApi;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56751ae;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56753ag;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56756aj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4310o.C56757ak;
import dagger.C68214a;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.silk.a.k.m */
/* compiled from: PG */
public final class C40618m implements C41729a {

    /* renamed from: a */
    public final Executor f106589a;

    /* renamed from: b */
    public final C68214a f106590b;

    /* renamed from: c */
    private final Executor f106591c;

    public C40618m(Executor executor, Executor executor2, C68214a aVar) {
        this.f106591c = executor;
        this.f106589a = executor2;
        this.f106590b = aVar;
    }

    /* renamed from: d */
    private final C60870cx m70365d(C60931s sVar) {
        C60870cx i = C60856cj.m92900i((LensApi) this.f106590b.mo27525b());
        C60931s f = C47810es.m84966f(sVar);
        return C60922j.m93045h(i, C47810es.m84966f(f), this.f106591c);
    }

    /* renamed from: a */
    public final C60870cx mo42552a() {
        return m70365d(new C40615j(this));
    }

    /* renamed from: b */
    public final C60870cx mo42553b() {
        return C2169h.m6027a(new C40606a(this));
    }

    /* renamed from: c */
    public final C60870cx mo42554c(C56757ak akVar) {
        C62635a aVar = new C62635a();
        if ((akVar.f151471a & 1) != 0) {
            byte[] N = akVar.f151472b.mo59174N();
            aVar.f169114b = BitmapFactory.decodeByteArray(N, 0, N.length);
        }
        int i = akVar.f151471a;
        if ((i & 2) != 0) {
            aVar.f169121i = akVar.f151473c;
        }
        if ((i & 4) != 0) {
            aVar.f169113a = Uri.parse(akVar.f151474d);
        }
        if ((akVar.f151471a & 8) != 0) {
            C56751ae aeVar = akVar.f151475e;
            if (aeVar == null) {
                aeVar = C56751ae.f151454c;
            }
            aVar.f169119g = C24239ad.m45245a(aeVar);
        }
        if ((akVar.f151471a & 16) != 0) {
            C56753ag agVar = akVar.f151476f;
            if (agVar == null) {
                agVar = C56753ag.f151458d;
            }
            aVar.f169115c = agVar.f151461b;
        }
        if ((akVar.f151471a & 32) != 0) {
            aVar.f169120h = C24239ad.m45247c(akVar);
        }
        if ((akVar.f151471a & 64) != 0) {
            C56756aj ajVar = akVar.f151478h;
            if (ajVar == null) {
                ajVar = C56756aj.f151463e;
            }
            int i2 = ajVar.f151465a;
            if (!((i2 & 1) == 0 && (i2 & 2) == 0)) {
                Optional b = C24239ad.m45246b(akVar);
                Objects.requireNonNull(aVar);
                b.ifPresent(new C40612g(aVar));
            }
            if ((ajVar.f151465a & 4) != 0) {
                aVar.f169117e = ajVar.f151468d;
            }
        }
        int i3 = akVar.f151471a;
        if ((i3 & 128) != 0) {
            aVar.f169118f = Long.valueOf((long) akVar.f151479i);
        }
        if ((i3 & 256) != 0) {
            aVar.f169122j = Boolean.valueOf(akVar.f151480j);
        }
        return m70365d(new C40610e(this, aVar.mo58535a()));
    }
}
