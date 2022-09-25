package com.google.apps.tiktok.experiments.phenotype;

import android.util.Log;
import com.google.apps.tiktok.experiments.C46896h;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bs */
/* compiled from: PG */
final class C46952bs extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C46896h f122443a;

    /* renamed from: b */
    final /* synthetic */ C46904p f122444b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46952bs(C46896h hVar, C46904p pVar) {
        super(0);
        this.f122443a = hVar;
        this.f122444b = pVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C63088z zVar;
        try {
            C46896h hVar = this.f122443a;
            if (hVar.f122363b == 5) {
                zVar = (C63088z) hVar.f122364c;
            } else {
                zVar = C63088z.f170246b;
            }
            C69664n.m101060f(zVar, "{\n            flag.bytesValue\n          }");
            return zVar;
        } catch (RuntimeException e) {
            Log.e("MendelPackageState", "Failed to parse flag", e);
            return this.f122444b.mo50904c();
        }
    }
}
