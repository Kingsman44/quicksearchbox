package com.google.android.libraries.search.assistant.performer.communication;

import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.bw */
/* compiled from: PG */
public final /* synthetic */ class C35564bw implements Function {

    /* renamed from: a */
    public static final /* synthetic */ C35564bw f93382a = new C35564bw();

    private /* synthetic */ C35564bw() {
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.gms.appdatasearch.al r14 = (com.google.android.gms.appdatasearch.C142796al) r14
            java.lang.String r0 = r14.mo117713i()     // Catch:{ NumberFormatException -> 0x02d5 }
            if (r0 != 0) goto L_0x000e
            j$.util.Optional r14 = p3186j$.util.Optional.empty()     // Catch:{ NumberFormatException -> 0x02d5 }
            goto L_0x02ec
        L_0x000e:
            android.net.Uri r1 = android.provider.ContactsContract.Contacts.CONTENT_URI     // Catch:{ NumberFormatException -> 0x02d5 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x02d5 }
            boolean r1 = r0.startsWith(r1)     // Catch:{ NumberFormatException -> 0x02d5 }
            if (r1 == 0) goto L_0x0023
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ NumberFormatException -> 0x02d5 }
            long r0 = android.content.ContentUris.parseId(r0)     // Catch:{ NumberFormatException -> 0x02d5 }
            goto L_0x0027
        L_0x0023:
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02d5 }
        L_0x0027:
            java.nio.ByteBuffer r14 = r14.mo117714j()
            if (r14 == 0) goto L_0x02d0
            boolean r2 = r14.hasRemaining()
            if (r2 != 0) goto L_0x0035
            goto L_0x02d0
        L_0x0035:
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x02bc }
            com.google.cm.a.b.a.f r3 = com.google.p4500cm.p4501a.p4506b.p4507a.C58148f.f155452f     // Catch:{ ct -> 0x02bc }
            com.google.protobuf.bv r14 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r3, (java.nio.ByteBuffer) r14, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x02bc }
            com.google.cm.a.b.a.f r14 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r14     // Catch:{ ct -> 0x02bc }
            java.util.List r2 = com.google.android.libraries.search.assistant.performer.communication.C35686du.m64089a(r14)
            java.lang.String r3 = ""
            java.lang.Object r2 = com.google.common.p4522b.C58557jl.m90130k(r2, r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x0067
            com.google.common.f.e r14 = com.google.android.libraries.search.assistant.performer.communication.C35686du.f93575a
            com.google.common.f.x r14 = r14.mo56224b()
            java.lang.String r0 = "contact has no name"
            r1 = 51699(0xc9f3, float:7.2446E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r1)).mo56386p(r0)
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
            goto L_0x02ec
        L_0x0067:
            com.google.protobuf.cq r14 = r14.f155457d
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)
            com.google.android.libraries.search.assistant.performer.communication.ds r4 = new com.google.android.libraries.search.assistant.performer.communication.ds
            r4.<init>()
            j$.util.stream.Stream r14 = r14.filter(r4)
            j$.util.Optional r14 = r14.findFirst()
            com.google.android.libraries.search.assistant.performer.communication.dt r4 = com.google.android.libraries.search.assistant.performer.communication.C35685dt.f93574a
            j$.util.Optional r14 = r14.map(r4)
            com.google.common.b.gu r4 = com.google.common.p4522b.C58485gu.m89845m()
            java.lang.Object r14 = r14.orElse(r4)
            java.util.List r14 = (java.util.List) r14
            com.google.common.b.fv r4 = new com.google.common.b.fv
            r4.<init>()
            com.google.common.b.fv r5 = new com.google.common.b.fv
            r5.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x0098:
            boolean r6 = r14.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0124
            java.lang.Object r6 = r14.next()
            com.google.cm.a.b.a.f r6 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58148f) r6
            java.util.List r8 = com.google.android.libraries.search.assistant.performer.communication.C35686du.m64089a(r6)
            java.lang.Object r8 = com.google.common.p4522b.C58557jl.m90130k(r8, r3)
            java.lang.String r8 = (java.lang.String) r8
            com.google.protobuf.cq r6 = r6.f155457d
            java.util.Iterator r6 = r6.iterator()
        L_0x00b5:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0098
            java.lang.Object r9 = r6.next()
            com.google.cm.a.b.a.d r9 = (com.google.p4500cm.p4501a.p4506b.p4507a.C58146d) r9
            java.lang.String r10 = r9.f155446b
            int r11 = r10.hashCode()
            r12 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r11 == r12) goto L_0x00dc
            r12 = 783201284(0x2eaeb404, float:7.944581E-11)
            if (r11 == r12) goto L_0x00d2
            goto L_0x00e6
        L_0x00d2:
            java.lang.String r11 = "telephone"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00e6
            r10 = 0
            goto L_0x00e7
        L_0x00dc:
            java.lang.String r11 = "email"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00e6
            r10 = 1
            goto L_0x00e7
        L_0x00e6:
            r10 = -1
        L_0x00e7:
            if (r10 == 0) goto L_0x0108
            if (r10 == r7) goto L_0x00ec
            goto L_0x00b5
        L_0x00ec:
            com.google.protobuf.cq r9 = r9.f155449e
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.libraries.search.assistant.performer.communication.dp r10 = com.google.android.libraries.search.assistant.performer.communication.C35681dp.f93570a
            j$.util.stream.Stream r9 = r9.filter(r10)
            com.google.android.libraries.search.assistant.performer.communication.do r10 = com.google.android.libraries.search.assistant.performer.communication.C35680do.f93569a
            j$.util.stream.Collector r10 = p3186j$.util.stream.Collectors.toCollection(r10)
            java.lang.Object r9 = r9.collect(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r5.mo54957J(r8, r9)
            goto L_0x00b5
        L_0x0108:
            com.google.protobuf.cq r9 = r9.f155449e
            j$.util.stream.Stream r9 = p3186j$.util.Collection.EL.stream(r9)
            com.google.android.libraries.search.assistant.performer.communication.dn r10 = com.google.android.libraries.search.assistant.performer.communication.C35679dn.f93568a
            j$.util.stream.Stream r9 = r9.filter(r10)
            com.google.android.libraries.search.assistant.performer.communication.do r10 = com.google.android.libraries.search.assistant.performer.communication.C35680do.f93569a
            j$.util.stream.Collector r10 = p3186j$.util.stream.Collectors.toCollection(r10)
            java.lang.Object r9 = r9.collect(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r4.mo54957J(r8, r9)
            goto L_0x00b5
        L_0x0124:
            com.google.assistant.e.j.yp r14 = com.google.assistant.p3897e.p3921j.C52623yp.f138162g
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.yo r14 = (com.google.assistant.p3897e.p3921j.C52622yo) r14
            com.google.assistant.e.j.yn r3 = com.google.assistant.p3897e.p3921j.C52621yn.f138154g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.assistant.e.j.ym r3 = (com.google.assistant.p3897e.p3921j.C52620ym) r3
            r3.copyOnWrite()
            com.google.protobuf.bv r6 = r3.instance
            com.google.assistant.e.j.yn r6 = (com.google.assistant.p3897e.p3921j.C52621yn) r6
            r2.getClass()
            int r8 = r6.f138156a
            r8 = r8 | 2
            r6.f138156a = r8
            r6.f138158c = r2
            r14.mo53892e(r3)
            java.util.Set r2 = r5.mo54951D()
            java.util.Iterator r2 = r2.iterator()
        L_0x0151:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01a1
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Set r6 = r5.mo54986h(r3)
            java.util.Iterator r6 = r6.iterator()
        L_0x0165:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0151
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            com.google.assistant.e.j.yl r9 = com.google.assistant.p3897e.p3921j.C52619yl.f138149d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.yk r9 = (com.google.assistant.p3897e.p3921j.C52618yk) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.yl r10 = (com.google.assistant.p3897e.p3921j.C52619yl) r10
            r3.getClass()
            int r11 = r10.f138151a
            r11 = r11 | 4
            r10.f138151a = r11
            r10.f138153c = r3
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.yl r10 = (com.google.assistant.p3897e.p3921j.C52619yl) r10
            r8.getClass()
            int r11 = r10.f138151a
            r11 = r11 | 2
            r10.f138151a = r11
            r10.f138152b = r8
            r14.mo53891d(r9)
            goto L_0x0165
        L_0x01a1:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r3 = r4.mo54951D()
            java.util.Iterator r3 = r3.iterator()
        L_0x01ae:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0270
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            java.util.Set r6 = r4.mo54986h(r5)
            java.util.Iterator r6 = r6.iterator()
        L_0x01c2:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x01ae
            java.lang.Object r8 = r6.next()
            java.lang.String r8 = (java.lang.String) r8
            com.google.assistant.e.j.yv r9 = com.google.assistant.p3897e.p3921j.C52629yv.f138180g
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.assistant.e.j.yu r9 = (com.google.assistant.p3897e.p3921j.C52628yu) r9
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.yv r10 = (com.google.assistant.p3897e.p3921j.C52629yv) r10
            r5.getClass()
            int r11 = r10.f138182a
            r11 = r11 | 4
            r10.f138182a = r11
            r10.f138185d = r5
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.yv r10 = (com.google.assistant.p3897e.p3921j.C52629yv) r10
            r8.getClass()
            int r11 = r10.f138182a
            r11 = r11 | 2
            r10.f138182a = r11
            r10.f138184c = r8
            java.lang.String r8 = android.telephony.PhoneNumberUtils.stripSeparators(r8)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x0209
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x023a
        L_0x0209:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r11 = "US"
            if (r10 != 0) goto L_0x0212
            goto L_0x0227
        L_0x0212:
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.getCountry()
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 == 0) goto L_0x0221
            goto L_0x0227
        L_0x0221:
            java.util.Locale r11 = java.util.Locale.US
            java.lang.String r11 = r10.toUpperCase(r11)
        L_0x0227:
            java.lang.String r8 = android.telephony.PhoneNumberUtils.formatNumberToE164(r8, r11)
            boolean r10 = android.text.TextUtils.isEmpty(r8)
            if (r10 == 0) goto L_0x0236
            j$.util.Optional r8 = p3186j$.util.Optional.empty()
            goto L_0x023a
        L_0x0236:
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
        L_0x023a:
            boolean r10 = r8.isPresent()
            if (r10 == 0) goto L_0x026b
            java.lang.Object r10 = r8.get()
            boolean r10 = r2.contains(r10)
            if (r10 != 0) goto L_0x01c2
            java.lang.Object r10 = r8.get()
            java.lang.String r10 = (java.lang.String) r10
            r2.add(r10)
            java.lang.Object r8 = r8.get()
            java.lang.String r8 = (java.lang.String) r8
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.assistant.e.j.yv r10 = (com.google.assistant.p3897e.p3921j.C52629yv) r10
            r8.getClass()
            int r11 = r10.f138182a
            r11 = r11 | 8
            r10.f138182a = r11
            r10.f138186e = r8
        L_0x026b:
            r14.mo53894g(r9)
            goto L_0x01c2
        L_0x0270:
            com.google.assistant.e.j.yt r2 = com.google.assistant.p3897e.p3921j.C52627yt.f138176c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.ys r2 = (com.google.assistant.p3897e.p3921j.C52626ys) r2
            r2.mo53900b(r0)
            r14.copyOnWrite()
            com.google.protobuf.bv r0 = r14.instance
            com.google.assistant.e.j.yp r0 = (com.google.assistant.p3897e.p3921j.C52623yp) r0
            com.google.protobuf.bv r1 = r2.build()
            com.google.assistant.e.j.yt r1 = (com.google.assistant.p3897e.p3921j.C52627yt) r1
            r1.getClass()
            r0.f138165b = r1
            int r1 = r0.f138164a
            r1 = r1 | r7
            r0.f138164a = r1
            com.google.assistant.e.j.adm r0 = com.google.assistant.p3897e.p3921j.adm.f134889h
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.adf r0 = (com.google.assistant.p3897e.p3921j.adf) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.e.j.adm r1 = (com.google.assistant.p3897e.p3921j.adm) r1
            com.google.protobuf.bv r14 = r14.build()
            com.google.assistant.e.j.yp r14 = (com.google.assistant.p3897e.p3921j.C52623yp) r14
            r14.getClass()
            r1.f134892b = r14
            int r14 = r1.f134891a
            r14 = r14 | r7
            r1.f134891a = r14
            com.google.protobuf.bv r14 = r0.build()
            com.google.assistant.e.j.adm r14 = (com.google.assistant.p3897e.p3921j.adm) r14
            j$.util.Optional r14 = p3186j$.util.Optional.m71637of(r14)
            goto L_0x02ec
        L_0x02bc:
            r14 = move-exception
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.performer.communication.C35686du.f93575a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Invalid thing_proto section: %s"
            r2 = 51700(0xc9f4, float:7.2447E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r14)).mo56372aa(r2)).mo56389s(r1, r14)
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
            goto L_0x02ec
        L_0x02d0:
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
            goto L_0x02ec
        L_0x02d5:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.libraries.search.assistant.performer.communication.C35686du.f93575a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r14 = r14.mo117713i()
            r2 = 51701(0xc9f5, float:7.2449E-41)
            java.lang.String r3 = "Could not parse contact ID: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r2)).mo56389s(r3, r14)
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
        L_0x02ec:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.communication.C35564bw.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
