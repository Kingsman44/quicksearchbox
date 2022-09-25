package com.google.apps.tiktok.experiments.phenotype;

import android.net.Uri;
import java.util.concurrent.Callable;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.ai */
/* compiled from: PG */
final class C46915ai implements Callable {

    /* renamed from: a */
    final /* synthetic */ C69626l f122393a;

    /* renamed from: b */
    final /* synthetic */ C69626l f122394b;

    /* renamed from: c */
    final /* synthetic */ String f122395c;

    public C46915ai(C69626l lVar, C69626l lVar2, String str) {
        this.f122393a = lVar;
        this.f122394b = lVar2;
        this.f122395c = str;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C69626l lVar = this.f122393a;
        C69626l lVar2 = this.f122394b;
        String str = this.f122395c;
        C69664n.m101060f(str, "strippedPackageName");
        return (Uri) lVar.mo5761a(lVar2.mo5761a(str));
    }
}
