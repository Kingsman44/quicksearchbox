package com.google.apps.tiktok.experiments.phenotype;

import android.util.Base64;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.aa */
/* compiled from: PG */
final class C46907aa extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C46904p f122379a;

    /* renamed from: b */
    final /* synthetic */ String f122380b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46907aa(C46904p pVar, String str) {
        super(0);
        this.f122379a = pVar;
        this.f122380b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        MessageLite build = this.f122379a.mo50905d().newBuilderForType().mergeFrom(Base64.decode(this.f122380b, 3)).build();
        C69664n.m101060f(build, "defaultValue\n           …\n                .build()");
        return build;
    }
}
