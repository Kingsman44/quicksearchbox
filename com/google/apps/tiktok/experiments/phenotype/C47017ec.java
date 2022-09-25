package com.google.apps.tiktok.experiments.phenotype;

import android.net.Uri;
import com.google.apps.tiktok.account.p3606d.C46092j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ec */
/* compiled from: PG */
final class C47017ec extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C46092j f122563a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47017ec(C46092j jVar) {
        super(1);
        this.f122563a = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        String str = (String) obj;
        C69664n.m101061g(str, "packageName");
        Uri c = this.f122563a.mo50201a(C46092j.f120967a, "phenotype/".concat(String.valueOf(str))).mo50187c();
        C69664n.m101060f(c, "accountStorageService\n  …iSync(I_AM_THE_FRAMEWORK)");
        return c;
    }
}
