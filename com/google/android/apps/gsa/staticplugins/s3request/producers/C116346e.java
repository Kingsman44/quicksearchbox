package com.google.android.apps.gsa.staticplugins.s3request.producers;

import com.google.android.apps.gsa.p6487s3.producers.C84305d;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66575ba;
import com.google.speech.p5208h.C66576bb;
import com.google.speech.p5208h.C66577bc;
import com.google.speech.p5208h.C66580bf;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5224k.p5225a.C67244v;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.producers.e */
/* compiled from: PG */
public final class C116346e extends C84305d {

    /* renamed from: a */
    private final String f322570a;

    /* renamed from: c */
    private final C67244v f322571c;

    /* renamed from: d */
    private final boolean f322572d;

    /* renamed from: e */
    private final int f322573e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C116346e(com.google.speech.p5224k.p5225a.C67244v r15, com.google.speech.p5208h.C66678l r16, java.util.concurrent.Future r17, java.util.concurrent.Future r18, com.google.speech.p5208h.C66550ag r19, long r20, java.lang.String r22, int r23, com.google.android.apps.gsa.search.core.p6805i.C86124t r24) {
        /*
            r14 = this;
            r10 = r14
            r11 = r23
            r12 = r24
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249072ai
            boolean r0 = r12.mo79746e(r0)
            r13 = 4
            if (r0 == 0) goto L_0x0013
            if (r11 != r13) goto L_0x0013
            java.lang.String r0 = "pron-learning-v2"
            goto L_0x0015
        L_0x0013:
            java.lang.String r0 = "pron-learning-tts"
        L_0x0015:
            r8 = r0
            r1 = 0
            r0 = r14
            r2 = r17
            r3 = r18
            r4 = r16
            r5 = r19
            r6 = r20
            r9 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9)
            r0 = r22
            r10.f322570a = r0
            r0 = r15
            r10.f322571c = r0
            r10.f322573e = r11
            com.google.android.apps.gsa.shared.m.d r0 = com.google.android.apps.gsa.shared.p7066m.C90059dk.f249072ai
            boolean r0 = r12.mo79746e(r0)
            r1 = 0
            if (r0 == 0) goto L_0x003c
            if (r11 != r13) goto L_0x003c
            r1 = 1
        L_0x003c:
            r10.f322572d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.s3request.producers.C116346e.<init>(com.google.speech.k.a.v, com.google.speech.h.l, java.util.concurrent.Future, java.util.concurrent.Future, com.google.speech.h.ag, long, java.lang.String, int, com.google.android.apps.gsa.search.core.i.t):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C66606cd mo77837a() {
        C66606cd a = super.mo77837a();
        if (this.f322572d) {
            C62940bt btVar = C66580bf.f181102g;
            C66577bc bcVar = (C66577bc) C66580bf.f181101f.createBuilder();
            String str = this.f322570a;
            bcVar.copyOnWrite();
            C66580bf bfVar = (C66580bf) bcVar.instance;
            str.getClass();
            bfVar.f181104a |= 1;
            bfVar.f181105b = str;
            bcVar.copyOnWrite();
            C66580bf bfVar2 = (C66580bf) bcVar.instance;
            bfVar2.f181104a |= 16;
            bfVar2.f181108e = true;
            int i = this.f322573e;
            bcVar.copyOnWrite();
            C66580bf bfVar3 = (C66580bf) bcVar.instance;
            bfVar3.f181107d = i - 1;
            bfVar3.f181104a |= 8;
            a.mo58885m(btVar, (C66580bf) bcVar.build());
        } else {
            C62940bt btVar2 = C66576bb.f181094f;
            C66575ba baVar = (C66575ba) C66576bb.f181093e.createBuilder();
            String str2 = this.f322570a;
            baVar.copyOnWrite();
            C66576bb bbVar = (C66576bb) baVar.instance;
            str2.getClass();
            bbVar.f181096a |= 1;
            bbVar.f181097b = str2;
            baVar.copyOnWrite();
            C66576bb bbVar2 = (C66576bb) baVar.instance;
            bbVar2.f181096a |= 2;
            bbVar2.f181099d = true;
            a.mo58885m(btVar2, (C66576bb) baVar.build());
        }
        a.mo58885m(C67244v.f182772t, this.f322571c);
        return a;
    }

    /* renamed from: b */
    public final boolean mo77850b() {
        return true;
    }
}
