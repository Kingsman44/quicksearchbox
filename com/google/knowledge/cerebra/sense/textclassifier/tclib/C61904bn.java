package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.libraries.mdi.C28595b;
import com.google.android.libraries.mdi.C29690f;
import com.google.android.libraries.storage.p3304a.C42797g;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3312f.C42778b;
import com.google.android.libraries.storage.p3304a.p3312f.C42785i;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.bn */
/* compiled from: PG */
public final class C61904bn {

    /* renamed from: a */
    public static final C61904bn f167378a = new C61904bn(new C42778b(), new C42785i());

    /* renamed from: b */
    private final C42797g f167379b;

    /* renamed from: c */
    private final C42797g f167380c;

    public C61904bn(C42797g gVar, C42797g gVar2) {
        this.f167379b = gVar;
        this.f167380c = gVar2;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor mo58338a(C29690f fVar, C42813k kVar, String str) {
        C28595b bVar = null;
        for (C28595b bVar2 : fVar.f80416g) {
            if (true == bVar2.f77798b.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            return (ParcelFileDescriptor) kVar.mo45889c(Uri.parse(bVar.f77799c), this.f167380c);
        }
        throw new C61906bp("Could not find " + str + " in MDD file group.");
    }

    /* renamed from: b */
    public final CloseableAssetFileDescriptor mo58339b(String str, C29690f fVar, C42813k kVar) {
        C28595b bVar = null;
        for (C28595b bVar2 : fVar.f80416g) {
            if (true == bVar2.f77798b.equals(str)) {
                bVar = bVar2;
            }
        }
        if (bVar != null) {
            return CloseableAssetFileDescriptor.m94502a((AssetFileDescriptor) kVar.mo45889c(Uri.parse(bVar.f77799c), this.f167379b));
        }
        throw new C61906bp("Could not find " + str + " in MDD file group.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.knowledge.cerebra.sense.textclassifier.tclib.C61961dq mo58340c(com.google.android.libraries.mdi.C29690f r12, com.google.android.libraries.storage.p3304a.C42813k r13) {
        /*
            r11 = this;
            com.google.protobuf.cq r0 = r12.f80416g
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0138
            com.google.knowledge.cerebra.sense.textclassifier.tclib.t r0 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.t
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.google.protobuf.cq r12 = r12.f80416g
            java.util.Iterator r12 = r12.iterator()
        L_0x0018:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r12.next()
            com.google.android.libraries.mdi.b r2 = (com.google.android.libraries.mdi.C28595b) r2
            java.lang.String r3 = r2.f77799c
            android.net.Uri r3 = android.net.Uri.parse(r3)
            com.google.android.libraries.storage.a.g r4 = r11.f167380c
            java.lang.Object r3 = r13.mo45889c(r3, r4)
            android.os.ParcelFileDescriptor r3 = (android.os.ParcelFileDescriptor) r3
            java.lang.String r4 = r2.f77798b
            int r5 = r4.hashCode()
            r6 = -1
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r5) {
                case -115764134: goto L_0x005f;
                case 37832785: goto L_0x0055;
                case 246874212: goto L_0x004b;
                case 2125373691: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0069
        L_0x0041:
            java.lang.String r5 = "model_metadata.pb"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0069
            r5 = 0
            goto L_0x006a
        L_0x004b:
            java.lang.String r5 = "RefNet.tflite"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0069
            r5 = 2
            goto L_0x006a
        L_0x0055:
            java.lang.String r5 = "word_embeddings"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0069
            r5 = 1
            goto L_0x006a
        L_0x005f:
            java.lang.String r5 = "Topicality.tflite"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0069
            r5 = 3
            goto L_0x006a
        L_0x0069:
            r5 = -1
        L_0x006a:
            if (r5 == 0) goto L_0x0109
            if (r5 == r10) goto L_0x0105
            if (r5 == r9) goto L_0x0101
            if (r5 == r8) goto L_0x00fd
            r5 = 58
            int r4 = r4.indexOf(r5)
            if (r4 >= 0) goto L_0x007e
            r3.close()
            goto L_0x0018
        L_0x007e:
            java.lang.String r5 = r2.f77798b
            java.lang.String r5 = r5.substring(r7, r4)
            java.lang.String r2 = r2.f77798b
            int r4 = r4 + 1
            java.lang.String r2 = r2.substring(r4)
            boolean r4 = r1.containsKey(r5)
            if (r4 != 0) goto L_0x00a7
            com.google.knowledge.cerebra.sense.textclassifier.tclib.v r4 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.v
            r4.<init>()
            if (r5 == 0) goto L_0x009f
            r4.f167509a = r5
            r1.put(r5, r4)
            goto L_0x00a7
        L_0x009f:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null sliceId"
            r12.<init>(r13)
            throw r12
        L_0x00a7:
            java.lang.Object r4 = r1.get(r5)
            com.google.knowledge.cerebra.sense.textclassifier.tclib.do r4 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61959do) r4
            int r5 = r2.hashCode()
            switch(r5) {
                case -1138979347: goto L_0x00d3;
                case 174928909: goto L_0x00c9;
                case 269348170: goto L_0x00bf;
                case 1586350425: goto L_0x00b5;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            goto L_0x00dc
        L_0x00b5:
            java.lang.String r5 = "entities_prefixes_filter"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00dc
            r6 = 3
            goto L_0x00dc
        L_0x00bf:
            java.lang.String r5 = "entities_names"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00dc
            r6 = 0
            goto L_0x00dc
        L_0x00c9:
            java.lang.String r5 = "entities_names_filter"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00dc
            r6 = 2
            goto L_0x00dc
        L_0x00d3:
            java.lang.String r5 = "entities_metadata"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x00dc
            r6 = 1
        L_0x00dc:
            if (r6 == 0) goto L_0x00f8
            if (r6 == r10) goto L_0x00f3
            if (r6 == r9) goto L_0x00ee
            if (r6 == r8) goto L_0x00e9
            r3.close()
            goto L_0x0018
        L_0x00e9:
            r4.mo58429h(r3)
            goto L_0x0018
        L_0x00ee:
            r4.mo58427f(r3)
            goto L_0x0018
        L_0x00f3:
            r4.mo58426e(r3)
            goto L_0x0018
        L_0x00f8:
            r4.mo58428g(r3)
            goto L_0x0018
        L_0x00fd:
            r0.f167501d = r3
            goto L_0x0018
        L_0x0101:
            r0.f167500c = r3
            goto L_0x0018
        L_0x0105:
            r0.f167499b = r3
            goto L_0x0018
        L_0x0109:
            r0.f167498a = r3
            goto L_0x0018
        L_0x010d:
            java.util.Set r12 = r1.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L_0x0115:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0133
            java.lang.Object r13 = r12.next()
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13
            java.lang.Object r13 = r13.getValue()
            com.google.knowledge.cerebra.sense.textclassifier.tclib.do r13 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61959do) r13
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dp r13 = r13.mo58430i()
            com.google.common.b.gp r1 = r0.mo58420a()
            r1.mo55395g(r13)
            goto L_0x0115
        L_0x0133:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dq r12 = r0.mo58421b()
            return r12
        L_0x0138:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bp r12 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.bp
            java.lang.String r13 = "Webref MDD file group is empty."
            r12.<init>(r13)
            goto L_0x0141
        L_0x0140:
            throw r12
        L_0x0141:
            goto L_0x0140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61904bn.mo58340c(com.google.android.libraries.mdi.f, com.google.android.libraries.storage.a.k):com.google.knowledge.cerebra.sense.textclassifier.tclib.dq");
    }
}
