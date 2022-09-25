package com.google.android.libraries.appdoctor.p574b;

import com.google.android.gms.p10747b.p10748a.C142954b;
import com.google.android.libraries.appdoctor.p573a.C10448e;

/* renamed from: com.google.android.libraries.appdoctor.b.e */
/* compiled from: PG */
public final class C10467e extends C10448e {
    public C10467e() {
        super(C142954b.SEND_BROADCAST, 10);
    }

    /* renamed from: a */
    public final String mo18487a() {
        return "SEND_BROADCAST_FIX";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v13, types: [int] */
    /* JADX WARNING: type inference failed for: r8v15, types: [int] */
    /* JADX WARNING: type inference failed for: r8v17, types: [int] */
    /* JADX WARNING: type inference failed for: r8v19, types: [int] */
    /* JADX WARNING: type inference failed for: r8v21, types: [int] */
    /* JADX WARNING: type inference failed for: r8v23, types: [int] */
    /* JADX WARNING: type inference failed for: r8v25, types: [int] */
    /* JADX WARNING: type inference failed for: r8v27, types: [int] */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r8v32 */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r8v34 */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: type inference failed for: r8v36 */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r8v38 */
    /* JADX WARNING: type inference failed for: r8v39 */
    /* JADX WARNING: type inference failed for: r8v40 */
    /* JADX WARNING: type inference failed for: r8v41 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18489c(com.google.android.libraries.appdoctor.p573a.C10454k r17, com.google.common.base.C58833ax r18) {
        /*
            r16 = this;
            r0 = r17
            boolean r1 = r18.mo56113h()
            if (r1 == 0) goto L_0x02b7
            java.lang.Object r1 = r18.mo56107c()
            com.google.android.gms.b.a.o r1 = (com.google.android.gms.p10747b.p10748a.C142967o) r1
            int r1 = r1.f387918a
            r2 = 3
            if (r1 != r2) goto L_0x02b7
            java.lang.Object r1 = r18.mo56107c()
            com.google.android.gms.b.a.o r1 = (com.google.android.gms.p10747b.p10748a.C142967o) r1
            int r3 = r1.f387918a
            if (r3 != r2) goto L_0x0022
            java.lang.Object r1 = r1.f387919b
            com.google.android.gms.b.a.l r1 = (com.google.android.gms.p10747b.p10748a.C142964l) r1
            goto L_0x0024
        L_0x0022:
            com.google.android.gms.b.a.l r1 = com.google.android.gms.p10747b.p10748a.C142964l.f387907f
        L_0x0024:
            android.content.Context r3 = r0.f35203b
            java.lang.String r3 = r3.getPackageName()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.content.Intent r4 = r4.setPackage(r3)
            int r5 = r1.f387909a
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x003e
            java.lang.String r5 = r1.f387910b
            r4.setAction(r5)
        L_0x003e:
            int r5 = r1.f387909a
            r7 = 2
            r5 = r5 & r7
            if (r5 == 0) goto L_0x004e
            android.content.ComponentName r5 = new android.content.ComponentName
            java.lang.String r8 = r1.f387911c
            r5.<init>(r3, r8)
            r4.setComponent(r5)
        L_0x004e:
            int r3 = r1.f387909a
            r5 = 4
            r3 = r3 & r5
            if (r3 == 0) goto L_0x005d
            java.lang.String r3 = r1.f387912d
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r4.setData(r3)
        L_0x005d:
            com.google.protobuf.cq r1 = r1.f387913e
            java.util.Iterator r1 = r1.iterator()
        L_0x0063:
            boolean r3 = r1.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x0278
            java.lang.Object r3 = r1.next()
            com.google.android.gms.b.a.k r3 = (com.google.android.gms.p10747b.p10748a.C142963k) r3
            int r9 = r3.f387898d
            r10 = 10
            r11 = 9
            r12 = 8
            r13 = 7
            r14 = 6
            r15 = 5
            switch(r9) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x00a9;
                case 2: goto L_0x00a7;
                case 3: goto L_0x00a5;
                case 4: goto L_0x00a3;
                case 5: goto L_0x00a1;
                case 6: goto L_0x009e;
                case 7: goto L_0x009b;
                case 8: goto L_0x0098;
                case 9: goto L_0x0095;
                case 10: goto L_0x0092;
                case 11: goto L_0x008f;
                case 12: goto L_0x008c;
                case 13: goto L_0x0089;
                case 14: goto L_0x0086;
                case 15: goto L_0x0083;
                case 16: goto L_0x0080;
                default: goto L_0x007e;
            }
        L_0x007e:
            r9 = 0
            goto L_0x00ac
        L_0x0080:
            r9 = 18
            goto L_0x00ac
        L_0x0083:
            r9 = 17
            goto L_0x00ac
        L_0x0086:
            r9 = 16
            goto L_0x00ac
        L_0x0089:
            r9 = 15
            goto L_0x00ac
        L_0x008c:
            r9 = 14
            goto L_0x00ac
        L_0x008f:
            r9 = 13
            goto L_0x00ac
        L_0x0092:
            r9 = 12
            goto L_0x00ac
        L_0x0095:
            r9 = 11
            goto L_0x00ac
        L_0x0098:
            r9 = 10
            goto L_0x00ac
        L_0x009b:
            r9 = 9
            goto L_0x00ac
        L_0x009e:
            r9 = 8
            goto L_0x00ac
        L_0x00a1:
            r9 = 7
            goto L_0x00ac
        L_0x00a3:
            r9 = 6
            goto L_0x00ac
        L_0x00a5:
            r9 = 5
            goto L_0x00ac
        L_0x00a7:
            r9 = 4
            goto L_0x00ac
        L_0x00a9:
            r9 = 3
            goto L_0x00ac
        L_0x00ab:
            r9 = 2
        L_0x00ac:
            if (r9 != 0) goto L_0x00af
            r9 = 1
        L_0x00af:
            int r9 = r9 + -2
            switch(r9) {
                case 0: goto L_0x0270;
                case 1: goto L_0x025e;
                case 2: goto L_0x024a;
                case 3: goto L_0x0236;
                case 4: goto L_0x0223;
                case 5: goto L_0x020d;
                case 6: goto L_0x01f8;
                case 7: goto L_0x01e2;
                case 8: goto L_0x01cf;
                case 9: goto L_0x01ab;
                case 10: goto L_0x0188;
                case 11: goto L_0x0165;
                case 12: goto L_0x0143;
                case 13: goto L_0x0121;
                case 14: goto L_0x00ff;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00bc;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unrecognized extra type"
            r0.<init>(r1)
            throw r0
        L_0x00bc:
            com.google.protobuf.cb r9 = r3.f387906l
            int r9 = r9.size()
            boolean[] r9 = new boolean[r9]
        L_0x00c4:
            com.google.protobuf.cb r10 = r3.f387906l
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x00d7
            com.google.protobuf.cb r10 = r3.f387906l
            boolean r10 = r10.mo58924g(r8)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x00c4
        L_0x00d7:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x00dd:
            com.google.protobuf.cc r9 = r3.f387905k
            int r9 = r9.size()
            double[] r9 = new double[r9]
        L_0x00e5:
            com.google.protobuf.cc r10 = r3.f387905k
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x00f8
            com.google.protobuf.cc r10 = r3.f387905k
            double r10 = r10.mo58797d(r8)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x00e5
        L_0x00f8:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x00ff:
            com.google.protobuf.cg r9 = r3.f387904j
            int r9 = r9.size()
            float[] r9 = new float[r9]
        L_0x0107:
            com.google.protobuf.cg r10 = r3.f387904j
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x011a
            com.google.protobuf.cg r10 = r3.f387904j
            float r10 = r10.mo58859d(r8)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x0107
        L_0x011a:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x0121:
            com.google.protobuf.ck r9 = r3.f387903i
            int r9 = r9.size()
            long[] r9 = new long[r9]
        L_0x0129:
            com.google.protobuf.ck r10 = r3.f387903i
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x013c
            com.google.protobuf.ck r10 = r3.f387903i
            long r10 = r10.mo58927a(r8)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x0129
        L_0x013c:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x0143:
            com.google.protobuf.ch r9 = r3.f387902h
            int r9 = r9.size()
            int[] r9 = new int[r9]
        L_0x014b:
            com.google.protobuf.ch r10 = r3.f387902h
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x015e
            com.google.protobuf.ch r10 = r3.f387902h
            int r10 = r10.mo58914d(r8)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x014b
        L_0x015e:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x0165:
            com.google.protobuf.ch r9 = r3.f387901g
            int r9 = r9.size()
            short[] r9 = new short[r9]
        L_0x016d:
            com.google.protobuf.ch r10 = r3.f387901g
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x0181
            com.google.protobuf.ch r10 = r3.f387901g
            int r10 = r10.mo58914d(r8)
            short r10 = (short) r10
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x016d
        L_0x0181:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x0188:
            com.google.protobuf.ch r9 = r3.f387900f
            int r9 = r9.size()
            byte[] r9 = new byte[r9]
        L_0x0190:
            com.google.protobuf.ch r10 = r3.f387900f
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x01a4
            com.google.protobuf.ch r10 = r3.f387900f
            int r10 = r10.mo58914d(r8)
            byte r10 = (byte) r10
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x0190
        L_0x01a4:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x01ab:
            com.google.protobuf.cq r9 = r3.f387899e
            int r9 = r9.size()
            java.lang.String[] r9 = new java.lang.String[r9]
        L_0x01b3:
            com.google.protobuf.cq r10 = r3.f387899e
            int r10 = r10.size()
            if (r8 >= r10) goto L_0x01c8
            com.google.protobuf.cq r10 = r3.f387899e
            java.lang.Object r10 = r10.get(r8)
            java.lang.String r10 = (java.lang.String) r10
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x01b3
        L_0x01c8:
            java.lang.String r3 = r3.f387897c
            r4.putExtra(r3, r9)
            goto L_0x0063
        L_0x01cf:
            java.lang.String r9 = r3.f387897c
            int r11 = r3.f387895a
            if (r11 != r10) goto L_0x01dd
            java.lang.Object r3 = r3.f387896b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r8 = r3.booleanValue()
        L_0x01dd:
            r4.putExtra(r9, r8)
            goto L_0x0063
        L_0x01e2:
            java.lang.String r8 = r3.f387897c
            int r9 = r3.f387895a
            if (r9 != r11) goto L_0x01f1
            java.lang.Object r3 = r3.f387896b
            java.lang.Double r3 = (java.lang.Double) r3
            double r9 = r3.doubleValue()
            goto L_0x01f3
        L_0x01f1:
            r9 = 0
        L_0x01f3:
            r4.putExtra(r8, r9)
            goto L_0x0063
        L_0x01f8:
            java.lang.String r8 = r3.f387897c
            int r9 = r3.f387895a
            if (r9 != r12) goto L_0x0207
            java.lang.Object r3 = r3.f387896b
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x0208
        L_0x0207:
            r3 = 0
        L_0x0208:
            r4.putExtra(r8, r3)
            goto L_0x0063
        L_0x020d:
            java.lang.String r8 = r3.f387897c
            int r9 = r3.f387895a
            if (r9 != r13) goto L_0x021c
            java.lang.Object r3 = r3.f387896b
            java.lang.Long r3 = (java.lang.Long) r3
            long r9 = r3.longValue()
            goto L_0x021e
        L_0x021c:
            r9 = 0
        L_0x021e:
            r4.putExtra(r8, r9)
            goto L_0x0063
        L_0x0223:
            java.lang.String r9 = r3.f387897c
            int r10 = r3.f387895a
            if (r10 != r14) goto L_0x0231
            java.lang.Object r3 = r3.f387896b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r8 = r3.intValue()
        L_0x0231:
            r4.putExtra(r9, r8)
            goto L_0x0063
        L_0x0236:
            java.lang.String r9 = r3.f387897c
            int r10 = r3.f387895a
            if (r10 != r15) goto L_0x0244
            java.lang.Object r3 = r3.f387896b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r8 = r3.intValue()
        L_0x0244:
            short r3 = (short) r8
            r4.putExtra(r9, r3)
            goto L_0x0063
        L_0x024a:
            java.lang.String r9 = r3.f387897c
            int r10 = r3.f387895a
            if (r10 != r5) goto L_0x0258
            java.lang.Object r3 = r3.f387896b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r8 = r3.intValue()
        L_0x0258:
            byte r3 = (byte) r8
            r4.putExtra(r9, r3)
            goto L_0x0063
        L_0x025e:
            java.lang.String r8 = r3.f387897c
            int r9 = r3.f387895a
            if (r9 != r2) goto L_0x0269
            java.lang.Object r3 = r3.f387896b
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x026b
        L_0x0269:
            java.lang.String r3 = ""
        L_0x026b:
            r4.putExtra(r8, r3)
            goto L_0x0063
        L_0x0270:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't assign unknown extra"
            r0.<init>(r1)
            throw r0
        L_0x0278:
            android.content.Context r1 = r0.f35203b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.List r1 = r1.queryBroadcastReceivers(r4, r8)
            if (r1 == 0) goto L_0x02a3
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x02a3
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Broadcasting: intent="
            java.lang.String r1 = r2.concat(r1)
            java.lang.String r2 = "SEND_BROADCAST_FIX"
            android.util.Log.d(r2, r1)
            android.content.Context r0 = r0.f35203b
            r0.sendBroadcast(r4)
            return
        L_0x02a3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "No receiver for intent. "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x02b7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            goto L_0x02be
        L_0x02bd:
            throw r0
        L_0x02be:
            goto L_0x02bd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.appdoctor.p574b.C10467e.mo18489c(com.google.android.libraries.appdoctor.a.k, com.google.common.base.ax):void");
    }

    /* renamed from: d */
    public final boolean mo18490d() {
        return true;
    }
}
