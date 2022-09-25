package com.google.knowledge.cerebra.sense.textclassifier.tclib;

import com.google.common.base.C58817ah;

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.tclib.da */
/* compiled from: PG */
public final /* synthetic */ class C61945da implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ TextClassifierLibImpl f167423a;

    public /* synthetic */ C61945da(TextClassifierLibImpl textClassifierLibImpl) {
        this.f167423a = textClassifierLibImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f4 A[SYNTHETIC, Splitter:B:39:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9 A[SYNTHETIC, Splitter:B:42:0x00f9] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r0 = "Loaded actions model: "
            com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLibImpl r1 = r11.f167423a
            java.util.List r12 = (java.util.List) r12
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r12 = r1.f167274d     // Catch:{ bp -> 0x0122 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r12 = r12.mo58400c()     // Catch:{ bp -> 0x0122 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bq r12 = r12.mo58311a()     // Catch:{ bp -> 0x0122 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dg r2 = r1.f167274d     // Catch:{ all -> 0x0116 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.br r2 = r2.mo58403f()     // Catch:{ all -> 0x0116 }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bq r2 = r2.mo58311a()     // Catch:{ all -> 0x0116 }
            boolean r3 = r12.mo58343c()     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "TextClassifierLibImpl"
            if (r3 != 0) goto L_0x0030
            boolean r3 = r2.mo58343c()     // Catch:{ all -> 0x010a }
            if (r3 == 0) goto L_0x0029
            goto L_0x0030
        L_0x0029:
            java.lang.String r0 = "Skipping asynchronous actions model reload. No model change."
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x010a }
            goto L_0x00f2
        L_0x0030:
            java.lang.Object r3 = r12.mo58341a()     // Catch:{ all -> 0x010a }
            android.content.res.AssetFileDescriptor r3 = (android.content.res.AssetFileDescriptor) r3     // Catch:{ all -> 0x010a }
            java.lang.Object r5 = r2.mo58341a()     // Catch:{ all -> 0x010a }
            com.google.knowledge.cerebra.sense.textclassifier.tclib.ax r5 = (com.google.knowledge.cerebra.sense.textclassifier.tclib.C61887ax) r5     // Catch:{ all -> 0x010a }
            r6 = 0
            if (r5 != 0) goto L_0x0041
            r5 = r6
            goto L_0x0083
        L_0x0041:
            com.google.knowledge.cerebra.sense.textclassifier.c.b r7 = com.google.knowledge.cerebra.sense.textclassifier.p4679c.C61848b.f167133d     // Catch:{ all -> 0x010a }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x010a }
            com.google.knowledge.cerebra.sense.textclassifier.c.a r7 = (com.google.knowledge.cerebra.sense.textclassifier.p4679c.C61847a) r7     // Catch:{ all -> 0x010a }
            android.os.ParcelFileDescriptor r8 = r5.mo58329b()     // Catch:{ all -> 0x010a }
            java.lang.String r8 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61917c.m94582b(r8)     // Catch:{ all -> 0x010a }
            r7.copyOnWrite()     // Catch:{ all -> 0x010a }
            com.google.protobuf.bv r9 = r7.instance     // Catch:{ all -> 0x010a }
            com.google.knowledge.cerebra.sense.textclassifier.c.b r9 = (com.google.knowledge.cerebra.sense.textclassifier.p4679c.C61848b) r9     // Catch:{ all -> 0x010a }
            r8.getClass()     // Catch:{ all -> 0x010a }
            int r10 = r9.f167135a     // Catch:{ all -> 0x010a }
            r10 = r10 | 1
            r9.f167135a = r10     // Catch:{ all -> 0x010a }
            r9.f167136b = r8     // Catch:{ all -> 0x010a }
            android.os.ParcelFileDescriptor r5 = r5.mo58328a()     // Catch:{ all -> 0x010a }
            java.lang.String r5 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61917c.m94582b(r5)     // Catch:{ all -> 0x010a }
            r7.copyOnWrite()     // Catch:{ all -> 0x010a }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x010a }
            com.google.knowledge.cerebra.sense.textclassifier.c.b r8 = (com.google.knowledge.cerebra.sense.textclassifier.p4679c.C61848b) r8     // Catch:{ all -> 0x010a }
            r5.getClass()     // Catch:{ all -> 0x010a }
            int r9 = r8.f167135a     // Catch:{ all -> 0x010a }
            r9 = r9 | 2
            r8.f167135a = r9     // Catch:{ all -> 0x010a }
            r8.f167137c = r5     // Catch:{ all -> 0x010a }
            com.google.protobuf.bv r5 = r7.build()     // Catch:{ all -> 0x010a }
            com.google.knowledge.cerebra.sense.textclassifier.c.b r5 = (com.google.knowledge.cerebra.sense.textclassifier.p4679c.C61848b) r5     // Catch:{ all -> 0x010a }
        L_0x0083:
            if (r3 == 0) goto L_0x00b2
            com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel r6 = new com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel     // Catch:{ IllegalArgumentException -> 0x00a1 }
            r6.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            if (r5 == 0) goto L_0x00b2
            byte[] r5 = r5.toByteArray()     // Catch:{ IllegalArgumentException -> 0x00a1 }
            long r7 = r6.f167177a     // Catch:{ IllegalArgumentException -> 0x00a1 }
            boolean r5 = r6.nativeInitializeConversationIntentDetection(r7, r5)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            if (r5 == 0) goto L_0x0099
            goto L_0x00b2
        L_0x0099:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00a1 }
            java.lang.String r1 = "Couldn't initialize conversation intent detection"
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x00a1 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            com.google.knowledge.cerebra.sense.textclassifier.tclib.bp r1 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.bp     // Catch:{ all -> 0x010a }
            java.lang.String r4 = "Could not load actions model from "
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x010a }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ all -> 0x010a }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x010a }
            throw r1     // Catch:{ all -> 0x010a }
        L_0x00b2:
            com.google.knowledge.cerebra.sense.textclassifier.lib3.GuardedNativeModels r5 = r1.f167281k     // Catch:{ all -> 0x010a }
            r5.mo58284b(r6)     // Catch:{ all -> 0x010a }
            java.util.concurrent.locks.ReadWriteLock r5 = r1.f167279i     // Catch:{ all -> 0x010a }
            java.util.concurrent.locks.Lock r5 = r5.writeLock()     // Catch:{ all -> 0x010a }
            r5.lock()     // Catch:{ all -> 0x010a }
            r1.mo58308i()     // Catch:{ all -> 0x00ff }
            if (r6 == 0) goto L_0x00e9
            int r5 = com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel.m94493a(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = com.google.knowledge.cerebra.sense.textclassifier.lib3.ActionsSuggestionsModel.m94494b(r3)     // Catch:{ all -> 0x00ff }
            r1.f167286p = r6     // Catch:{ all -> 0x00ff }
            com.google.knowledge.cerebra.sense.textclassifier.a.c.b r6 = new com.google.knowledge.cerebra.sense.textclassifier.a.c.b     // Catch:{ all -> 0x00ff }
            r6.<init>(r5, r3)     // Catch:{ all -> 0x00ff }
            r1.f167287q = r6     // Catch:{ all -> 0x00ff }
            com.google.knowledge.cerebra.sense.textclassifier.a.c.b r3 = r1.f167287q     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = r3.f167103a     // Catch:{ all -> 0x00ff }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r5.<init>(r0)     // Catch:{ all -> 0x00ff }
            r5.append(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x00ff }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00ff }
        L_0x00e9:
            java.util.concurrent.locks.ReadWriteLock r0 = r1.f167279i     // Catch:{ all -> 0x010a }
            java.util.concurrent.locks.Lock r0 = r0.writeLock()     // Catch:{ all -> 0x010a }
            r0.unlock()     // Catch:{ all -> 0x010a }
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r2.close()     // Catch:{ all -> 0x0116 }
        L_0x00f7:
            if (r12 == 0) goto L_0x00fc
            r12.close()     // Catch:{ bp -> 0x0122 }
        L_0x00fc:
            com.google.knowledge.cerebra.sense.textclassifier.tclib.dc r12 = com.google.knowledge.cerebra.sense.textclassifier.tclib.C61947dc.f167425a
            return r12
        L_0x00ff:
            r0 = move-exception
            java.util.concurrent.locks.ReadWriteLock r1 = r1.f167279i     // Catch:{ all -> 0x010a }
            java.util.concurrent.locks.Lock r1 = r1.writeLock()     // Catch:{ all -> 0x010a }
            r1.unlock()     // Catch:{ all -> 0x010a }
            throw r0     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0115
            r2.close()     // Catch:{ all -> 0x0111 }
            goto L_0x0115
        L_0x0111:
            r1 = move-exception
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61926ci.m94609a(r0, r1)     // Catch:{ all -> 0x0116 }
        L_0x0115:
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            if (r12 == 0) goto L_0x0121
            r12.close()     // Catch:{ all -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r12 = move-exception
            com.google.knowledge.cerebra.sense.textclassifier.tclib.C61926ci.m94609a(r0, r12)     // Catch:{ bp -> 0x0122 }
        L_0x0121:
            throw r0     // Catch:{ bp -> 0x0122 }
        L_0x0122:
            r12 = move-exception
            com.google.knowledge.cerebra.sense.textclassifier.tclib.by r0 = new com.google.knowledge.cerebra.sense.textclassifier.tclib.by
            java.lang.String r1 = "Failed to load the native actions model."
            r0.<init>(r1, r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.cerebra.sense.textclassifier.tclib.C61945da.apply(java.lang.Object):java.lang.Object");
    }
}
