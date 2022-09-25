package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122761a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9286c.C122762b;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.p9293a.C122899af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123033c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123047cn;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123051cr;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123167g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5129p.p5131b.C65753ak;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ay */
/* compiled from: PG */
public final class C123111ay implements C123167g, C122761a {

    /* renamed from: a */
    public static final C59071e f340742a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.ay");

    /* renamed from: b */
    public final Context f340743b;

    /* renamed from: c */
    private final C123033c f340744c;

    /* renamed from: d */
    private final Executor f340745d;

    /* renamed from: e */
    private C123051cr f340746e;

    /* renamed from: f */
    private C123051cr f340747f;

    /* renamed from: g */
    private final C122959k f340748g;

    public C123111ay(Context context, C123033c cVar, C122762b bVar, C122899af afVar, Executor executor) {
        this.f340743b = context;
        this.f340744c = cVar;
        this.f340745d = executor;
        C122959k e = afVar.f340378a.mo105802e();
        this.f340748g = e;
        e.mo105795d(new C123104ar(this));
        bVar.mo105733a(this);
    }

    /* JADX WARNING: type inference failed for: r14v15, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.protos.p4985f.p5030q.C65202fi m202450b(com.google.android.libraries.mdi.C29690f r14, android.content.Context r15) {
        /*
            java.lang.String r0 = r15.getPackageName()     // Catch:{ IOException -> 0x0204 }
            java.io.File r15 = r15.getFilesDir()     // Catch:{ IOException -> 0x0204 }
            java.lang.String r15 = r15.toString()     // Catch:{ IOException -> 0x0204 }
            r1 = 0
            if (r14 != 0) goto L_0x0011
            goto L_0x0201
        L_0x0011:
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0204 }
            r4 = 0
            r3[r4] = r0     // Catch:{ IOException -> 0x0204 }
            java.lang.String r0 = "android://%s/files"
            java.lang.String r0 = java.lang.String.format(r0, r3)     // Catch:{ IOException -> 0x0204 }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0204 }
            r3[r4] = r15     // Catch:{ IOException -> 0x0204 }
            java.lang.String r15 = "file://%s"
            java.lang.String r15 = java.lang.String.format(r15, r3)     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r3 = com.google.protos.p4985f.p5030q.C65201fh.f176474e     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fe r3 = (com.google.protos.p4985f.p5030q.C65198fe) r3     // Catch:{ IOException -> 0x0204 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ IOException -> 0x0204 }
            r5.<init>()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.cq r14 = r14.f80416g     // Catch:{ IOException -> 0x0204 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ IOException -> 0x0204 }
        L_0x003a:
            boolean r6 = r14.hasNext()     // Catch:{ IOException -> 0x0204 }
            r7 = 3
            if (r6 == 0) goto L_0x01ae
            java.lang.Object r6 = r14.next()     // Catch:{ IOException -> 0x0204 }
            com.google.android.libraries.mdi.b r6 = (com.google.android.libraries.mdi.C28595b) r6     // Catch:{ IOException -> 0x0204 }
            com.google.common.base.m r8 = new com.google.common.base.m     // Catch:{ IOException -> 0x0204 }
            r9 = 58
            r8.<init>(r9)     // Catch:{ IOException -> 0x0204 }
            com.google.common.base.cf r8 = com.google.common.base.C58869cf.m90936b(r8)     // Catch:{ IOException -> 0x0204 }
            java.lang.String r9 = r6.f77798b     // Catch:{ IOException -> 0x0204 }
            java.util.List r8 = r8.mo56155i(r9)     // Catch:{ IOException -> 0x0204 }
            int r9 = r8.size()     // Catch:{ IOException -> 0x0204 }
            r10 = 2
            if (r9 != r2) goto L_0x0067
            java.lang.Object r8 = r8.get(r4)     // Catch:{ IOException -> 0x0204 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0204 }
            r9 = r1
            goto L_0x0079
        L_0x0067:
            int r9 = r8.size()     // Catch:{ IOException -> 0x0204 }
            if (r9 != r10) goto L_0x0195
            java.lang.Object r9 = r8.get(r4)     // Catch:{ IOException -> 0x0204 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ IOException -> 0x0204 }
            java.lang.Object r8 = r8.get(r2)     // Catch:{ IOException -> 0x0204 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0204 }
        L_0x0079:
            if (r8 != 0) goto L_0x007d
            goto L_0x0201
        L_0x007d:
            java.lang.String r6 = r6.f77799c     // Catch:{ IOException -> 0x0204 }
            java.lang.String r6 = r6.replace(r0, r15)     // Catch:{ IOException -> 0x0204 }
            r11 = -1
            if (r9 != 0) goto L_0x00f7
            int r9 = r8.hashCode()     // Catch:{ IOException -> 0x0204 }
            switch(r9) {
                case 37832785: goto L_0x00ac;
                case 246874212: goto L_0x00a2;
                case 311832811: goto L_0x0098;
                case 2125373691: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x00b5
        L_0x008e:
            java.lang.String r9 = "model_metadata.pb"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00b5
            r11 = 0
            goto L_0x00b5
        L_0x0098:
            java.lang.String r9 = "collections.pb"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00b5
            r11 = 3
            goto L_0x00b5
        L_0x00a2:
            java.lang.String r9 = "RefNet.tflite"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00b5
            r11 = 2
            goto L_0x00b5
        L_0x00ac:
            java.lang.String r9 = "word_embeddings"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x00b5
            r11 = 1
        L_0x00b5:
            if (r11 == 0) goto L_0x00e9
            if (r11 == r2) goto L_0x00db
            if (r11 == r10) goto L_0x00cd
            if (r11 == r7) goto L_0x003a
            com.google.common.f.a.d r14 = com.google.p4273bs.p4277b.p4278a.C56483w.f150872a     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ IOException -> 0x0204 }
            java.lang.String r15 = "Invalid global file: %s"
            r0 = 54903(0xd677, float:7.6935E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r14).mo56372aa(r0)).mo56389s(r15, r8)     // Catch:{ IOException -> 0x0204 }
            goto L_0x0201
        L_0x00cd:
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r7 = (com.google.protos.p4985f.p5030q.C65201fh) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176479d = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x003a
        L_0x00db:
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r7 = (com.google.protos.p4985f.p5030q.C65201fh) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176478c = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x003a
        L_0x00e9:
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r3.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r7 = (com.google.protos.p4985f.p5030q.C65201fh) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176477b = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x003a
        L_0x00f7:
            com.google.protos.f.q.fg r12 = com.google.protos.p4985f.p5030q.C65200fg.f176467f     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bn r12 = r12.createBuilder()     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.ff r12 = (com.google.protos.p4985f.p5030q.C65199ff) r12     // Catch:{ IOException -> 0x0204 }
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r13 = r12.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fg r13 = (com.google.protos.p4985f.p5030q.C65200fg) r13     // Catch:{ IOException -> 0x0204 }
            r13.f176469a = r9     // Catch:{ IOException -> 0x0204 }
            java.lang.Object r12 = p3186j$.util.Map.EL.getOrDefault(r5, r9, r12)     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.ff r12 = (com.google.protos.p4985f.p5030q.C65199ff) r12     // Catch:{ IOException -> 0x0204 }
            int r13 = r8.hashCode()     // Catch:{ IOException -> 0x0204 }
            switch(r13) {
                case -1138979347: goto L_0x0134;
                case 174928909: goto L_0x012a;
                case 269348170: goto L_0x0120;
                case 1586350425: goto L_0x0116;
                default: goto L_0x0115;
            }
        L_0x0115:
            goto L_0x013d
        L_0x0116:
            java.lang.String r13 = "entities_prefixes_filter"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x013d
            r11 = 3
            goto L_0x013d
        L_0x0120:
            java.lang.String r13 = "entities_names"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x013d
            r11 = 0
            goto L_0x013d
        L_0x012a:
            java.lang.String r13 = "entities_names_filter"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x013d
            r11 = 2
            goto L_0x013d
        L_0x0134:
            java.lang.String r13 = "entities_metadata"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x013d
            r11 = 1
        L_0x013d:
            if (r11 == 0) goto L_0x0184
            if (r11 == r2) goto L_0x0177
            if (r11 == r10) goto L_0x016a
            if (r11 == r7) goto L_0x015d
            com.google.common.f.a.d r14 = com.google.p4273bs.p4277b.p4278a.C56483w.f150872a     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.a.a r14 = (com.google.common.p4526f.p4527a.C58970a) r14     // Catch:{ IOException -> 0x0204 }
            r15 = 54902(0xd676, float:7.6934E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r15)     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.a.a r14 = (com.google.common.p4526f.p4527a.C58970a) r14     // Catch:{ IOException -> 0x0204 }
            java.lang.String r15 = "Invalid file %s in slice %s"
            r14.mo56354G(r15, r8, r9)     // Catch:{ IOException -> 0x0204 }
            goto L_0x0201
        L_0x015d:
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fg r7 = (com.google.protos.p4985f.p5030q.C65200fg) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176473e = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x0190
        L_0x016a:
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fg r7 = (com.google.protos.p4985f.p5030q.C65200fg) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176472d = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x0190
        L_0x0177:
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fg r7 = (com.google.protos.p4985f.p5030q.C65200fg) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176471c = r6     // Catch:{ IOException -> 0x0204 }
            goto L_0x0190
        L_0x0184:
            r12.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r7 = r12.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fg r7 = (com.google.protos.p4985f.p5030q.C65200fg) r7     // Catch:{ IOException -> 0x0204 }
            r6.getClass()     // Catch:{ IOException -> 0x0204 }
            r7.f176470b = r6     // Catch:{ IOException -> 0x0204 }
        L_0x0190:
            r5.put(r9, r12)     // Catch:{ IOException -> 0x0204 }
            goto L_0x003a
        L_0x0195:
            com.google.common.f.a.d r14 = com.google.p4273bs.p4277b.p4278a.C56483w.f150872a     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.x r14 = r14.mo56225c()     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.a.a r14 = (com.google.common.p4526f.p4527a.C58970a) r14     // Catch:{ IOException -> 0x0204 }
            r15 = 54901(0xd675, float:7.6933E-41)
            com.google.common.f.x r14 = r14.mo56372aa(r15)     // Catch:{ IOException -> 0x0204 }
            com.google.common.f.a.a r14 = (com.google.common.p4526f.p4527a.C58970a) r14     // Catch:{ IOException -> 0x0204 }
            java.lang.String r15 = "Invalid fileId %s"
            java.lang.String r0 = r6.f77798b     // Catch:{ IOException -> 0x0204 }
            r14.mo56389s(r15, r0)     // Catch:{ IOException -> 0x0204 }
            goto L_0x0201
        L_0x01ae:
            java.util.Collection r14 = r5.values()     // Catch:{ IOException -> 0x0204 }
            j$.util.stream.Stream r14 = p3186j$.util.Collection.EL.stream(r14)     // Catch:{ IOException -> 0x0204 }
            com.google.bs.b.a.v r15 = com.google.p4273bs.p4277b.p4278a.C56482v.f150871a     // Catch:{ IOException -> 0x0204 }
            j$.util.stream.Stream r14 = r14.map(r15)     // Catch:{ IOException -> 0x0204 }
            j$.util.stream.Collector r15 = com.google.common.p4522b.C58370cn.f155947b     // Catch:{ IOException -> 0x0204 }
            java.lang.Object r14 = r14.collect(r15)     // Catch:{ IOException -> 0x0204 }
            java.lang.Iterable r14 = (java.lang.Iterable) r14     // Catch:{ IOException -> 0x0204 }
            r3.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r15 = r3.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r15 = (com.google.protos.p4985f.p5030q.C65201fh) r15     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.cq r0 = r15.f176476a     // Catch:{ IOException -> 0x0204 }
            boolean r1 = r0.mo58948c()     // Catch:{ IOException -> 0x0204 }
            if (r1 != 0) goto L_0x01d9
            com.google.protobuf.cq r0 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r0)     // Catch:{ IOException -> 0x0204 }
            r15.f176476a = r0     // Catch:{ IOException -> 0x0204 }
        L_0x01d9:
            com.google.protobuf.cq r15 = r15.f176476a     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r14, (java.util.List) r15)     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fi r14 = com.google.protos.p4985f.p5030q.C65202fi.f176480c     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fd r14 = (com.google.protos.p4985f.p5030q.C65197fd) r14     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r15 = r3.build()     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fh r15 = (com.google.protos.p4985f.p5030q.C65201fh) r15     // Catch:{ IOException -> 0x0204 }
            r14.copyOnWrite()     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r0 = r14.instance     // Catch:{ IOException -> 0x0204 }
            com.google.protos.f.q.fi r0 = (com.google.protos.p4985f.p5030q.C65202fi) r0     // Catch:{ IOException -> 0x0204 }
            r15.getClass()     // Catch:{ IOException -> 0x0204 }
            r0.f176483b = r15     // Catch:{ IOException -> 0x0204 }
            r0.f176482a = r7     // Catch:{ IOException -> 0x0204 }
            com.google.protobuf.bv r14 = r14.build()     // Catch:{ IOException -> 0x0204 }
            r1 = r14
            com.google.protos.f.q.fi r1 = (com.google.protos.p4985f.p5030q.C65202fi) r1     // Catch:{ IOException -> 0x0204 }
        L_0x0201:
            if (r1 == 0) goto L_0x0213
            return r1
        L_0x0204:
            r14 = move-exception
            com.google.common.f.e r15 = f340742a
            com.google.common.f.x r15 = r15.mo56226d()
            java.lang.String r0 = "Exception in building WebrefAnnotatorSpec!"
            r1 = 35080(0x8908, float:4.9158E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56382g(r14)).mo56372aa(r1)).mo56386p(r0)
        L_0x0213:
            com.google.common.f.e r14 = f340742a
            com.google.common.f.x r14 = r14.mo56226d()
            java.lang.String r15 = "Returning empty WebrefAnnotatorSpec."
            r0 = 35079(0x8907, float:4.9156E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r14).mo56372aa(r0)).mo56386p(r15)
            com.google.protos.f.q.fi r14 = com.google.protos.p4985f.p5030q.C65202fi.f176480c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a.C123111ay.m202450b(com.google.android.libraries.mdi.f, android.content.Context):com.google.protos.f.q.fi");
    }

    /* renamed from: a */
    public final synchronized C60870cx mo105888a() {
        if (this.f340746e == null) {
            this.f340746e = new C123051cr(C47633f.m84733g(this.f340748g.mo105792a()).mo51515h(C123109aw.f340740a, C60826bg.f164896a).mo51513e(Throwable.class, C123110ax.f340741a, C60826bg.f164896a));
        }
        if (this.f340747f == null) {
            C60870cx j = C60856cj.m92901j(this.f340746e.f340614a);
            C60870cx a = this.f340744c.mo105841a();
            this.f340747f = new C123051cr(C47638k.m84753d(a, j).mo51520a(new C123105as(this, j, a), this.f340745d));
        }
        return C60856cj.m92901j(this.f340747f.f340614a);
    }

    /* renamed from: c */
    public final synchronized void mo105889c() {
        this.f340746e = null;
        this.f340747f = null;
        C123047cn.m202382b(mo105888a(), C123106at.f340737a, C60826bg.f164896a);
    }

    /* renamed from: d */
    public final void mo105718d(C65753ak akVar) {
        if (akVar.equals(C65753ak.PKG_ENTITIES)) {
            synchronized (this) {
                this.f340747f = null;
            }
        }
    }
}
