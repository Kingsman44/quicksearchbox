package com.google.android.apps.search.assistant.verticals.ambient.feedback;

import android.view.View;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.p */
/* compiled from: PG */
final class C130657p implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C130653m f357812a;

    public C130657p(C130653m mVar) {
        this.f357812a = mVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            com.google.android.apps.search.assistant.verticals.ambient.feedback.m r13 = r12.f357812a
            j$.util.Optional r0 = r13.f357807h
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0019
            com.google.common.f.e r13 = com.google.android.apps.search.assistant.verticals.ambient.feedback.C130653m.f357800a
            com.google.common.f.x r13 = r13.mo56226d()
            java.lang.String r0 = "UserContext is null."
            r1 = 38943(0x981f, float:5.4571E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r1)).mo56386p(r0)
            return
        L_0x0019:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.i r0 = r13.f357802c
            android.view.View r0 = r0.requireView()
            r1 = 2131427965(0x7f0b027d, float:1.8477561E38)
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioGroup r1 = (android.widget.RadioGroup) r1
            int r1 = r1.getCheckedRadioButtonId()
            r2 = -1
            if (r1 != r2) goto L_0x003a
            r13 = 2132083346(0x7f150292, float:1.9806832E38)
            com.google.android.material.snackbar.Snackbar r13 = com.google.android.material.snackbar.Snackbar.m79660p(r0, r13, r2)
            r13.mo48343h()
            return
        L_0x003a:
            android.view.View r1 = r0.findViewById(r1)
            android.widget.RadioButton r1 = (android.widget.RadioButton) r1
            j$.util.Optional r2 = r13.f357807h
            java.lang.Object r2 = r2.get()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r2 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h) r2
            com.google.protobuf.cq r2 = r2.f297214i
            boolean r2 = r2.isEmpty()
            r3 = 0
            r4 = 2131427963(0x7f0b027b, float:1.8477557E38)
            r5 = 2131427962(0x7f0b027a, float:1.8477555E38)
            if (r2 == 0) goto L_0x0067
            int r2 = r1.getId()
            r6 = 2131427970(0x7f0b0282, float:1.8477571E38)
            if (r2 != r6) goto L_0x00ad
            com.google.assistant.z.ap r2 = com.google.assistant.p4016z.C53691ap.NO_PLACE
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x00ca
        L_0x0067:
            int r2 = r1.getId()
            if (r2 != r5) goto L_0x0074
            com.google.assistant.z.ap r2 = com.google.assistant.p4016z.C53691ap.NO_PLACE
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x00ca
        L_0x0074:
            int r2 = r1.getId()
            if (r2 == r4) goto L_0x00ad
            java.util.Map r2 = r13.f357808i
            int r6 = r1.getId()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r2 = r2.get(r6)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x00a8
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0093
            goto L_0x00a8
        L_0x0093:
            java.lang.Object r2 = r2.get(r3)
            com.google.assistant.z.aq r2 = (com.google.assistant.p4016z.C53692aq) r2
            int r2 = r2.f140943e
            com.google.assistant.z.ap r2 = com.google.assistant.p4016z.C53691ap.m86884a(r2)
            if (r2 != 0) goto L_0x00a3
            com.google.assistant.z.ap r2 = com.google.assistant.p4016z.C53691ap.UNSPECIFIED
        L_0x00a3:
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x00ca
        L_0x00a8:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
            goto L_0x00ca
        L_0x00ad:
            com.google.android.apps.search.assistant.verticals.ambient.feedback.i r2 = r13.f357802c
            android.view.View r2 = r2.requireView()
            r6 = 2131427966(0x7f0b027e, float:1.8477563E38)
            android.view.View r2 = r2.findViewById(r6)
            android.widget.Spinner r2 = (android.widget.Spinner) r2
            com.google.assistant.z.ap[] r6 = com.google.assistant.p4016z.C53691ap.values()
            int r2 = r2.getSelectedItemPosition()
            r2 = r6[r2]
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
        L_0x00ca:
            j$.util.Optional r6 = r13.f357807h
            java.lang.Object r6 = r6.get()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r6 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h) r6
            com.google.protobuf.cq r6 = r6.f297214i
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x00df
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x010d
        L_0x00df:
            int r6 = r1.getId()
            if (r6 == r5) goto L_0x0109
            int r5 = r1.getId()
            if (r5 != r4) goto L_0x00ec
            goto L_0x0109
        L_0x00ec:
            java.util.Map r4 = r13.f357808i
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r4.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0104
            boolean r4 = r1.isEmpty()
            if (r4 == 0) goto L_0x010d
        L_0x0104:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
            goto L_0x010d
        L_0x0109:
            com.google.common.b.gu r1 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x010d:
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x03b9
            j$.util.Optional r4 = r13.f357807h
            java.lang.Object r4 = r4.get()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r4 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h) r4
            com.google.assistant.ad.a.a.c r5 = com.google.assistant.p3781ad.p3782a.p3783a.C48477c.f125220d
            com.google.protobuf.bn r5 = r5.createBuilder()
            com.google.assistant.ad.a.a.b r5 = (com.google.assistant.p3781ad.p3782a.p3783a.C48476b) r5
            p3186j$.util.Objects.requireNonNull(r5)
            com.google.android.apps.search.assistant.verticals.ambient.feedback.u r6 = new com.google.android.apps.search.assistant.verticals.ambient.feedback.u
            r6.<init>(r5)
            r2.ifPresent(r6)
            r5.copyOnWrite()
            com.google.protobuf.bv r2 = r5.instance
            com.google.assistant.ad.a.a.c r2 = (com.google.assistant.p3781ad.p3782a.p3783a.C48477c) r2
            com.google.protobuf.cq r6 = r2.f125224c
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x0143
            com.google.protobuf.cq r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r6)
            r2.f125224c = r6
        L_0x0143:
            com.google.protobuf.cq r2 = r2.f125224c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)
            com.google.assistant.ad.a.a.d r1 = com.google.assistant.p3781ad.p3782a.p3783a.C48478d.f125226f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.ad.a.a.a r1 = (com.google.assistant.p3781ad.p3782a.p3783a.C48475a) r1
            com.google.protobuf.cq r2 = r4.f297214i
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.ad.a.a.d r6 = (com.google.assistant.p3781ad.p3782a.p3783a.C48478d) r6
            com.google.protobuf.cq r7 = r6.f125230c
            boolean r8 = r7.mo58948c()
            if (r8 != 0) goto L_0x0167
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f125230c = r7
        L_0x0167:
            com.google.protobuf.cq r6 = r6.f125230c
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r2, (java.util.List) r6)
            com.google.protobuf.cq r2 = r4.f297214i
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.search.assistant.verticals.ambient.feedback.t r6 = com.google.android.apps.search.assistant.verticals.ambient.feedback.C130661t.f357816a
            j$.util.stream.Stream r2 = r2.map(r6)
            com.google.android.apps.search.assistant.verticals.ambient.feedback.v r6 = com.google.android.apps.search.assistant.verticals.ambient.feedback.C130663v.f357818a
            j$.util.stream.Stream r2 = r2.map(r6)
            j$.util.Optional r2 = r2.findFirst()
            com.google.assistant.z.ap r6 = com.google.assistant.p4016z.C53691ap.NO_PLACE
            java.lang.Object r2 = r2.orElse(r6)
            com.google.assistant.z.ap r2 = (com.google.assistant.p4016z.C53691ap) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r6 = r1.instance
            com.google.assistant.ad.a.a.d r6 = (com.google.assistant.p3781ad.p3782a.p3783a.C48478d) r6
            int r2 = r2.f140936l
            r6.f125231d = r2
            int r2 = r6.f125228a
            r2 = r2 | 2
            r6.f125228a = r2
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.assistant.ad.a.a.d r2 = (com.google.assistant.p3781ad.p3782a.p3783a.C48478d) r2
            com.google.protobuf.bv r5 = r5.build()
            com.google.assistant.ad.a.a.c r5 = (com.google.assistant.p3781ad.p3782a.p3783a.C48477c) r5
            r5.getClass()
            r2.f125232e = r5
            int r5 = r2.f125228a
            r5 = r5 | 4
            r2.f125228a = r5
            int r2 = r4.f297206a
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x01f1
            com.google.assistant.z.w r2 = com.google.assistant.p4016z.C53738w.f141079d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.z.v r2 = (com.google.assistant.p4016z.C53737v) r2
            com.google.cg.k r4 = r4.f297216k
            if (r4 != 0) goto L_0x01c7
            com.google.cg.k r4 = com.google.p4479cg.C58079k.f155250c
        L_0x01c7:
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.z.w r5 = (com.google.assistant.p4016z.C53738w) r5
            r4.getClass()
            r5.f141082b = r4
            int r4 = r5.f141081a
            r4 = r4 | 1
            r5.f141081a = r4
            r1.copyOnWrite()
            com.google.protobuf.bv r4 = r1.instance
            com.google.assistant.ad.a.a.d r4 = (com.google.assistant.p3781ad.p3782a.p3783a.C48478d) r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.z.w r2 = (com.google.assistant.p4016z.C53738w) r2
            r2.getClass()
            r4.f125229b = r2
            int r2 = r4.f125228a
            r2 = r2 | 1
            r4.f125228a = r2
        L_0x01f1:
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.ad.a.a.d r1 = (com.google.assistant.p3781ad.p3782a.p3783a.C48478d) r1
            com.google.assistant.ad.a.a.c r2 = r1.f125232e
            if (r2 != 0) goto L_0x01fd
            com.google.assistant.ad.a.a.c r2 = com.google.assistant.p3781ad.p3782a.p3783a.C48477c.f125220d
        L_0x01fd:
            int r4 = r2.f125222a
            r4 = r4 & 1
            if (r4 == 0) goto L_0x0236
            com.google.assistant.z.ba r4 = com.google.assistant.p4016z.C53703ba.f140978d
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.assistant.z.az r4 = (com.google.assistant.p4016z.C53701az) r4
            int r5 = r2.f125223b
            com.google.assistant.z.ap r5 = com.google.assistant.p4016z.C53691ap.m86884a(r5)
            if (r5 != 0) goto L_0x0215
            com.google.assistant.z.ap r5 = com.google.assistant.p4016z.C53691ap.UNSPECIFIED
        L_0x0215:
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.assistant.z.ba r6 = (com.google.assistant.p4016z.C53703ba) r6
            int r5 = r5.f140936l
            r6.f140982c = r5
            int r5 = r6.f140980a
            r5 = r5 | 1
            r6.f140980a = r5
            com.google.protobuf.cq r2 = r2.f125224c
            r4.mo54006a(r2)
            com.google.protobuf.bv r2 = r4.build()
            com.google.assistant.z.ba r2 = (com.google.assistant.p4016z.C53703ba) r2
            j$.util.Optional r2 = p3186j$.util.Optional.m71637of(r2)
            goto L_0x023a
        L_0x0236:
            j$.util.Optional r2 = p3186j$.util.Optional.empty()
        L_0x023a:
            boolean r4 = r2.isPresent()
            if (r4 == 0) goto L_0x02e0
            j$.util.Optional r4 = r13.f357807h
            java.lang.Object r4 = r4.get()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r4 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h) r4
            int r4 = r4.f297206a
            r4 = r4 & 512(0x200, float:7.175E-43)
            if (r4 == 0) goto L_0x02e0
            com.google.android.apps.search.assistant.verticals.ambient.u.f r4 = r13.f357805f
            java.lang.Object r2 = r2.get()
            com.google.assistant.z.ba r2 = (com.google.assistant.p4016z.C53703ba) r2
            j$.util.Optional r5 = r13.f357807h
            java.lang.Object r5 = r5.get()
            com.google.android.apps.gsa.staticplugins.opa.ambient.b.h r5 = (com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h) r5
            long r5 = r5.f297215j
            com.google.android.apps.search.assistant.verticals.ambient.u.i r7 = r4.f360045b
            com.google.assistant.z.ak r8 = com.google.assistant.p4016z.C53686ak.f140913f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.z.aj r8 = (com.google.assistant.p4016z.C53685aj) r8
            com.google.protobuf.fg r4 = r4.mo110336c()
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.assistant.z.ak r9 = (com.google.assistant.p4016z.C53686ak) r9
            r4.getClass()
            r9.f140918d = r4
            int r4 = r9.f140915a
            r4 = r4 | 1
            r9.f140915a = r4
            com.google.protobuf.cq r4 = r2.f140981b
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x02b8
            com.google.protobuf.cq r4 = r2.f140981b
            j$.util.stream.Stream r4 = p3186j$.util.Collection.EL.stream(r4)
            com.google.android.apps.search.assistant.verticals.ambient.u.c r9 = com.google.android.apps.search.assistant.verticals.ambient.p10017u.C131831c.f360041a
            j$.util.stream.Stream r4 = r4.map(r9)
            j$.util.stream.Collector r9 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r4 = r4.collect(r9)
            com.google.common.b.gu r4 = (com.google.common.p4522b.C58485gu) r4
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.z.az r2 = (com.google.assistant.p4016z.C53701az) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r9 = r2.instance
            com.google.assistant.z.ba r9 = (com.google.assistant.p4016z.C53703ba) r9
            com.google.protobuf.cq r10 = com.google.assistant.p4016z.C53703ba.emptyProtobufList()
            r9.f140981b = r10
            r2.mo54006a(r4)
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.z.ba r2 = (com.google.assistant.p4016z.C53703ba) r2
        L_0x02b8:
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.z.ak r4 = (com.google.assistant.p4016z.C53686ak) r4
            r2.getClass()
            r4.f140917c = r2
            r2 = 9
            r4.f140916b = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.z.ak r2 = (com.google.assistant.p4016z.C53686ak) r2
            int r4 = r2.f140915a
            r4 = r4 | 2
            r2.f140915a = r4
            r2.f140919e = r5
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.z.ak r2 = (com.google.assistant.p4016z.C53686ak) r2
            r7.mo110321e(r2)
        L_0x02e0:
            com.google.apps.tiktok.concurrent.futuresmixin.e r2 = r13.f357803d
            com.google.android.libraries.search.i.m r4 = r13.f357804e
            com.google.protos.p.b.ak r5 = com.google.protos.p5129p.p5131b.C65753ak.AMBIENT_ASSISTANT_LOCATION_FEEDBACK
            com.google.protos.p.b.az r6 = com.google.protos.p5129p.p5131b.C65768az.f178793f
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.protos.p.b.ay r6 = (com.google.protos.p5129p.p5131b.C65767ay) r6
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.protos.p.b.az r7 = (com.google.protos.p5129p.p5131b.C65768az) r7
            int r8 = r7.f178795a
            r8 = r8 | 4
            r7.f178795a = r8
            java.lang.String r8 = ""
            r7.f178798d = r8
            com.google.protos.f.q.d.a.d r7 = com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d.f176307e
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protos.f.q.d.a.c r7 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c) r7
            com.google.android.libraries.f.a r8 = r13.f357806g
            long r8 = r8.mo26870b()
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r8)
            long r8 = com.google.common.p4580v.C60944c.m93089b(r8)
            r7.copyOnWrite()
            com.google.protobuf.bv r10 = r7.instance
            com.google.protos.f.q.d.a.d r10 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r10
            int r11 = r10.f176309a
            r11 = r11 | 1
            r10.f176309a = r11
            r10.f176310b = r8
            r6.copyOnWrite()
            com.google.protobuf.bv r8 = r6.instance
            com.google.protos.p.b.az r8 = (com.google.protos.p5129p.p5131b.C65768az) r8
            com.google.protobuf.bv r7 = r7.build()
            com.google.protos.f.q.d.a.d r7 = (com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d) r7
            r7.getClass()
            r8.f178796b = r7
            int r7 = r8.f178795a
            r7 = r7 | 1
            r8.f178795a = r7
            com.google.protobuf.h r7 = com.google.protobuf.C63070h.f170215c
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.protobuf.g r7 = (com.google.protobuf.C63062g) r7
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.protobuf.h r8 = (com.google.protobuf.C63070h) r8
            java.lang.String r9 = "type.googleapis.com/geller.oneplatform.AmbientAssistantElement"
            r8.f170217a = r9
            com.google.protos.p.b.b r8 = com.google.protos.p5129p.p5131b.C65769b.f178801c
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.protos.p.b.a r8 = (com.google.protos.p5129p.p5131b.C65742a) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r9 = r8.instance
            com.google.protos.p.b.b r9 = (com.google.protos.p5129p.p5131b.C65769b) r9
            r1.getClass()
            r9.f178804b = r1
            int r1 = r9.f178803a
            r1 = r1 | 1
            r9.f178803a = r1
            com.google.protobuf.bv r1 = r8.build()
            com.google.protos.p.b.b r1 = (com.google.protos.p5129p.p5131b.C65769b) r1
            com.google.protobuf.z r1 = r1.toByteString()
            r7.copyOnWrite()
            com.google.protobuf.bv r8 = r7.instance
            com.google.protobuf.h r8 = (com.google.protobuf.C63070h) r8
            r1.getClass()
            r8.f170218b = r1
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.protos.p.b.az r1 = (com.google.protos.p5129p.p5131b.C65768az) r1
            com.google.protobuf.bv r7 = r7.build()
            com.google.protobuf.h r7 = (com.google.protobuf.C63070h) r7
            r7.getClass()
            r1.f178799e = r7
            int r7 = r1.f178795a
            r7 = r7 | 8
            r1.f178795a = r7
            com.google.protobuf.bv r1 = r6.build()
            com.google.protos.p.b.az r1 = (com.google.protos.p5129p.p5131b.C65768az) r1
            com.google.common.util.concurrent.cx r1 = r4.mo41434e(r5, r1)
            com.google.apps.tiktok.concurrent.futuresmixin.d r1 = com.google.apps.tiktok.concurrent.futuresmixin.C46438d.m82810b(r1)
            com.google.apps.tiktok.concurrent.futuresmixin.f r13 = r13.f357809j
            com.google.common.util.concurrent.cx r1 = r1.f121541a
            r4 = 0
            r2.mo50428h(r1, r4, r13)
            r13 = 2131427968(0x7f0b0280, float:1.8477567E38)
            android.view.View r13 = r0.findViewById(r13)
            android.widget.Button r13 = (android.widget.Button) r13
            r13.setEnabled(r3)
        L_0x03b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.feedback.C130657p.onClick(android.view.View):void");
    }
}
