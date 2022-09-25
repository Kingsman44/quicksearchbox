package com.google.android.apps.gsa.eventlogger;

import com.google.android.apps.gsa.shared.util.p7159c.C90908be;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.eventlogger.q */
/* compiled from: PG */
public final class C74521q {

    /* renamed from: a */
    private final C90929bz f208667a;

    /* renamed from: b */
    private final C90908be f208668b;

    /* renamed from: c */
    private C60870cx f208669c;

    public C74521q(C90908be beVar, C90929bz bzVar) {
        this.f208668b = beVar;
        this.f208667a = bzVar;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.eventlogger.q.a():void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    final synchronized void mo70827a() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.eventlogger.q.a():void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.eventlogger.C74521q.mo70827a():void");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo70828b() {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.common.util.concurrent.cx r0 = r1.f208669c     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0011 }
            if (r0 != 0) goto L_0x000e
            monitor-exit(r1)
            r0 = 1
            return r0
        L_0x000e:
            monitor-exit(r1)
            r0 = 0
            return r0
        L_0x0011:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.eventlogger.C74521q.mo70828b():boolean");
    }
}
