package com.google.apps.tiktok.experiments.phenotype;

import android.util.Log;
import com.google.apps.tiktok.experiments.C46896h;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63000ds;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bt */
/* compiled from: PG */
final class C46953bt extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C46904p f122445a;

    /* renamed from: b */
    final /* synthetic */ C46896h f122446b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46953bt(C46904p pVar, C46896h hVar) {
        super(0);
        this.f122445a = pVar;
        this.f122446b = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        C63088z zVar;
        try {
            MessageLite messageLite = this.f122445a.f122374d;
            C69664n.m101058d(messageLite);
            C63000ds newBuilderForType = messageLite.newBuilderForType();
            C46896h hVar = this.f122446b;
            if (hVar.f122363b == 6) {
                zVar = (C63088z) hVar.f122364c;
            } else {
                zVar = C63088z.f170246b;
            }
            MessageLite build = newBuilderForType.mergeFrom(zVar).build();
            C69664n.m101060f(build, "{\n              flagValu…   .build()\n            }");
            return build;
        } catch (C62974ct e) {
            Log.e("MendelPackageState", "Failed to parse flag", e);
            return this.f122445a.mo50905d();
        } catch (RuntimeException e2) {
            Log.e("MendelPackageState", "Failed to parse flag", e2);
            return this.f122445a.mo50905d();
        }
    }
}
