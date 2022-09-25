package com.google.apps.tiktok.experiments.phenotype;

import android.util.Base64;
import com.google.protobuf.C63088z;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.z */
/* compiled from: PG */
final class C47072z extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ String f122666a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47072z(String str) {
        super(0);
        this.f122666a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        return C63088z.m96139A(Base64.decode(this.f122666a, 3));
    }
}
