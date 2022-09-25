package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.ex */
/* compiled from: PG */
public final /* synthetic */ class C80776ex implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C80776ex f221688a = new C80776ex();

    private /* synthetic */ C80776ex() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r1.equals("HOMESCREEN_ENTRY_POINT") != false) goto L_0x00f1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b A[SYNTHETIC, Splitter:B:18:0x006b] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x010e A[SYNTHETIC, Splitter:B:68:0x010e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            android.os.Bundle r12 = (android.os.Bundle) r12
            com.google.android.apps.gsa.nga.shared.aj.a.a.fb r0 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80784fe.m128648i()
            java.lang.String r1 = "label"
            java.lang.String r2 = ""
            java.lang.String r1 = r12.getString(r1, r2)
            r0.mo74602d(r1)
            java.lang.String r1 = "id"
            java.lang.String r1 = r12.getString(r1, r2)
            if (r1 == 0) goto L_0x0125
            r2 = r0
            com.google.android.apps.gsa.nga.shared.aj.a.a.bq r2 = (com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80688bq) r2
            r2.f221538b = r1
            java.lang.String r1 = "icon"
            boolean r3 = r12.containsKey(r1)
            r4 = 0
            if (r3 == 0) goto L_0x0036
            android.os.Parcelable r1 = r12.getParcelable(r1)
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            if (r1 != 0) goto L_0x0031
        L_0x002f:
            r1 = r4
            goto L_0x0059
        L_0x0031:
            com.google.android.apps.gsa.nga.shared.aj.a.a.fg r1 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80652ah.m128312a(r1)
            goto L_0x0059
        L_0x0036:
            java.lang.String r1 = "tintable_icon"
            boolean r3 = r12.containsKey(r1)
            if (r3 == 0) goto L_0x004c
            android.os.Parcelable r1 = r12.getParcelable(r1)
            android.graphics.drawable.Icon r1 = (android.graphics.drawable.Icon) r1
            if (r1 != 0) goto L_0x0047
            goto L_0x002f
        L_0x0047:
            com.google.android.apps.gsa.nga.shared.aj.a.a.fg r1 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80652ah.m128313b(r1)
            goto L_0x0059
        L_0x004c:
            java.lang.String r1 = "icon_url"
            java.lang.String r1 = r12.getString(r1)
            if (r1 != 0) goto L_0x0055
            goto L_0x002f
        L_0x0055:
            com.google.android.apps.gsa.nga.shared.aj.a.a.fg r1 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80652ah.m128314c(r1)
        L_0x0059:
            r2.f221539c = r1
            com.google.android.apps.gsa.nga.shared.aj.a.b.aj r1 = com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80745dt.m128611b(r12)
            r0.mo74600b(r1)
            java.lang.String r1 = "logging_info"
            byte[] r1 = r12.getByteArray(r1)
            if (r1 != 0) goto L_0x006b
            goto L_0x007a
        L_0x006b:
            com.google.protobuf.ba r3 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0079 }
            com.google.android.apps.gsa.nga.shared.af.a.w r5 = com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w.f221220i     // Catch:{ ct -> 0x0079 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (byte[]) r1, (com.google.protobuf.C62921ba) r3)     // Catch:{ ct -> 0x0079 }
            com.google.android.apps.gsa.nga.shared.af.a.w r1 = (com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w) r1     // Catch:{ ct -> 0x0079 }
            r4 = r1
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            r2.f221540d = r4
            java.lang.String r1 = "style_type"
            java.lang.String r1 = r12.getString(r1)
            r3 = 0
            java.lang.String r4 = "DEFAULT"
            r5 = -1
            r6 = -2032180703(0xffffffff86df6221, float:-8.4027464E-35)
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x00b8
            int r9 = r1.hashCode()
            if (r9 == r6) goto L_0x00a3
            r10 = 2041946(0x1f285a, float:2.861376E-39)
            if (r9 == r10) goto L_0x0099
            goto L_0x00ab
        L_0x0099:
            java.lang.String r9 = "BLUE"
            boolean r1 = r1.equals(r9)
            if (r1 == 0) goto L_0x00ab
            r1 = 1
            goto L_0x00ac
        L_0x00a3:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00ab
            r1 = 0
            goto L_0x00ac
        L_0x00ab:
            r1 = -1
        L_0x00ac:
            if (r1 == 0) goto L_0x00b8
            if (r1 != r8) goto L_0x00b2
            r1 = 2
            goto L_0x00b9
        L_0x00b2:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L_0x00b8:
            r1 = 1
        L_0x00b9:
            r2.f221542f = r1
            java.lang.String r1 = "suggestion_type"
            java.lang.String r1 = r12.getString(r1)
            r9 = 3
            if (r1 == 0) goto L_0x0100
            int r10 = r1.hashCode()
            if (r10 == r6) goto L_0x00e8
            r4 = -948529096(0xffffffffc7769838, float:-63128.22)
            if (r10 == r4) goto L_0x00de
            r4 = 318025487(0x12f4af0f, float:1.544172E-27)
            if (r10 == r4) goto L_0x00d5
            goto L_0x00f0
        L_0x00d5:
            java.lang.String r4 = "HOMESCREEN_ENTRY_POINT"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00f0
            goto L_0x00f1
        L_0x00de:
            java.lang.String r3 = "VOICE_MATCH"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00f0
            r3 = 1
            goto L_0x00f1
        L_0x00e8:
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x00f0
            r3 = 2
            goto L_0x00f1
        L_0x00f0:
            r3 = -1
        L_0x00f1:
            if (r3 == 0) goto L_0x00fe
            if (r3 == r8) goto L_0x0101
            if (r3 != r7) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L_0x00fe:
            r7 = 1
            goto L_0x0101
        L_0x0100:
            r7 = 3
        L_0x0101:
            r2.f221543g = r7
            java.lang.String r1 = "debug_data"
            byte[] r12 = r12.getByteArray(r1)
            if (r12 != 0) goto L_0x010e
            com.google.protos.f.u.d r12 = com.google.protos.p4985f.p5042u.C65342d.f176699e
            goto L_0x011d
        L_0x010e:
            com.google.protobuf.ba r1 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x011b }
            com.google.protos.f.u.d r2 = com.google.protos.p4985f.p5042u.C65342d.f176699e     // Catch:{ ct -> 0x011b }
            com.google.protobuf.bv r12 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (byte[]) r12, (com.google.protobuf.C62921ba) r1)     // Catch:{ ct -> 0x011b }
            com.google.protos.f.u.d r12 = (com.google.protos.p4985f.p5042u.C65342d) r12     // Catch:{ ct -> 0x011b }
            goto L_0x011d
        L_0x011b:
            com.google.protos.f.u.d r12 = com.google.protos.p4985f.p5042u.C65342d.f176699e
        L_0x011d:
            r0.mo74601c(r12)
            com.google.android.apps.gsa.nga.shared.aj.a.a.fe r12 = r0.mo74599a()
            return r12
        L_0x0125:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r0 = "Null id"
            r12.<init>(r0)
            goto L_0x012e
        L_0x012d:
            throw r12
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80776ex.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
