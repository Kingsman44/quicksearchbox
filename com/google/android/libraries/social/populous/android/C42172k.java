package com.google.android.libraries.social.populous.android;

import com.google.android.libraries.social.populous.C42160an;
import com.google.android.libraries.social.populous.C42193az;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3289c.C42211b;
import com.google.android.libraries.social.populous.p3295d.C42372f;
import com.google.android.libraries.social.populous.p3295d.C42377k;
import com.google.android.libraries.social.populous.p3295d.C42383q;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58495hd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60887da;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.social.populous.android.k */
/* compiled from: PG */
public final /* synthetic */ class C42172k implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42181t f110448a;

    /* renamed from: b */
    public final /* synthetic */ ClientVersion f110449b;

    /* renamed from: c */
    public final /* synthetic */ C58495hd f110450c;

    /* renamed from: d */
    public final /* synthetic */ ExecutorService f110451d;

    /* renamed from: e */
    public final /* synthetic */ C42160an f110452e;

    /* renamed from: f */
    public final /* synthetic */ C42211b f110453f;

    public /* synthetic */ C42172k(C42181t tVar, C42211b bVar, ClientVersion clientVersion, C58495hd hdVar, ExecutorService executorService, C42160an anVar) {
        this.f110448a = tVar;
        this.f110453f = bVar;
        this.f110449b = clientVersion;
        this.f110450c = hdVar;
        this.f110451d = executorService;
        this.f110452e = anVar;
    }

    public final Object call() {
        C42181t tVar = this.f110448a;
        C42211b bVar = this.f110453f;
        ClientVersion clientVersion = this.f110449b;
        C58495hd hdVar = this.f110450c;
        ExecutorService executorService = this.f110451d;
        C42160an anVar = this.f110452e;
        C58833ax axVar = (C58833ax) C60856cj.m92909r(tVar.f110484r);
        ClientConfigInternal clientConfigInternal = tVar.f110469c;
        C42372f fVar = new C42372f(bVar.f110538c, tVar.f110480n, tVar.f110470d, tVar.f110478l, axVar);
        C60887da daVar = tVar.f110470d;
        C42591z zVar = tVar.f110478l;
        return new C42193az(clientConfigInternal, fVar, new C42383q(clientVersion, bVar, (C42352m) C60856cj.m92909r(tVar.f110473g), daVar, zVar, new C42377k(bVar.f110538c, tVar.f110480n, zVar), axVar), hdVar, executorService, tVar.f110478l, anVar);
    }
}
