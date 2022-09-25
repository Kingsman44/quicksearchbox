package com.google.android.libraries.lens.ondevice.p2034k;

import com.google.common.base.C58833ax;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.ondevice.k.cx */
/* compiled from: PG */
public final /* synthetic */ class C24613cx implements Function {

    /* renamed from: a */
    public final /* synthetic */ String f67345a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f67346b;

    public /* synthetic */ C24613cx(String str, C58833ax axVar) {
        this.f67345a = str;
        this.f67346b = axVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f67345a
            com.google.common.base.ax r1 = r7.f67346b
            com.google.android.libraries.lens.ondevice.n.ai r8 = (com.google.android.libraries.lens.ondevice.p2037n.C24776ai) r8
            com.google.bg.w r2 = com.google.p4172bg.C55762w.f147146f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.bg.v r2 = (com.google.p4172bg.C55761v) r2
            java.lang.String r3 = r8.f67702b
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bg.w r4 = (com.google.p4172bg.C55762w) r4
            r3.getClass()
            r4.f147150c = r3
            java.lang.String r3 = r8.f67703c
            r2.copyOnWrite()
            com.google.protobuf.bv r4 = r2.instance
            com.google.bg.w r4 = (com.google.p4172bg.C55762w) r4
            r3.getClass()
            r4.f147151d = r3
            int r3 = r8.f67701a
            r4 = 4
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0105
            java.lang.String r8 = r8.f67704d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "/"
            r3.append(r0)
            r3.append(r8)
            java.lang.String r8 = r3.toString()
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r0.f147148a = r4
            r0.f147149b = r8
            boolean r8 = r1.mo56113h()
            if (r8 == 0) goto L_0x0105
            java.lang.Object r8 = r1.mo56107c()
            com.google.android.libraries.lens.view.session.ondevice.a.a.aa r8 = (com.google.android.libraries.lens.view.session.ondevice.p2164a.p2165a.C27813aa) r8
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            java.lang.String r0 = r0.f147150c
            int r1 = r0.hashCode()
            r3 = 3
            r5 = 2
            r6 = 1
            switch(r1) {
                case -1458041814: goto L_0x0096;
                case -948099967: goto L_0x008c;
                case -139123722: goto L_0x0082;
                case 1385233277: goto L_0x0078;
                case 1851064297: goto L_0x006e;
                default: goto L_0x006d;
            }
        L_0x006d:
            goto L_0x00a0
        L_0x006e:
            java.lang.String r1 = "MultiPassLineRecognitionMutator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a0
            r1 = 0
            goto L_0x00a1
        L_0x0078:
            java.lang.String r1 = "PhotoOcrScriptIdentificationMutator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a0
            r1 = 1
            goto L_0x00a1
        L_0x0082:
            java.lang.String r1 = "PhotoOcrTextDetectionMutator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a0
            r1 = 2
            goto L_0x00a1
        L_0x008c:
            java.lang.String r1 = "PhotoOcrPageLayoutAnalysisMutator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a0
            r1 = 4
            goto L_0x00a1
        L_0x0096:
            java.lang.String r1 = "LineSelectionMutator"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x00a0
            r1 = 3
            goto L_0x00a1
        L_0x00a0:
            r1 = -1
        L_0x00a1:
            if (r1 == 0) goto L_0x00f7
            if (r1 == r6) goto L_0x00e8
            if (r1 == r5) goto L_0x00d9
            if (r1 == r3) goto L_0x00ca
            if (r1 != r4) goto L_0x00ba
            com.google.protobuf.z r8 = r8.f75878e
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r8.getClass()
            r0.f147152e = r8
            goto L_0x0105
        L_0x00ba:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown config: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.concat(r0)
            r8.<init>(r0)
            throw r8
        L_0x00ca:
            com.google.protobuf.z r8 = r8.f75877d
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r8.getClass()
            r0.f147152e = r8
            goto L_0x0105
        L_0x00d9:
            com.google.protobuf.z r8 = r8.f75875b
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r8.getClass()
            r0.f147152e = r8
            goto L_0x0105
        L_0x00e8:
            com.google.protobuf.z r8 = r8.f75876c
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r8.getClass()
            r0.f147152e = r8
            goto L_0x0105
        L_0x00f7:
            com.google.protobuf.z r8 = r8.f75874a
            r2.copyOnWrite()
            com.google.protobuf.bv r0 = r2.instance
            com.google.bg.w r0 = (com.google.p4172bg.C55762w) r0
            r8.getClass()
            r0.f147152e = r8
        L_0x0105:
            com.google.protobuf.bv r8 = r2.build()
            com.google.bg.w r8 = (com.google.p4172bg.C55762w) r8
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.ondevice.p2034k.C24613cx.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
