package com.google.android.apps.gsa.nga.engine.p5972aw;

import com.google.android.apps.gsa.nga.engine.p5897ae.C74799n;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.nga.engine.aw.j */
/* compiled from: PG */
public final class C75167j {

    /* renamed from: a */
    private final C74799n f209605a;

    /* renamed from: b */
    private long f209606b = 0;

    /* renamed from: c */
    private SettableFuture f209607c;

    public C75167j(C74799n nVar) {
        this.f209605a = nVar;
    }

    /* renamed from: a */
    public final synchronized C60870cx mo71515a() {
        SettableFuture settableFuture;
        this.f209606b++;
        settableFuture = new SettableFuture();
        this.f209607c = settableFuture;
        this.f209605a.mo71182c(this.f209606b);
        return settableFuture;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.aw.j.b(com.google.android.apps.gsa.opa.f.a.aa, android.os.Bundle):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public final synchronized void mo71516b(com.google.android.apps.gsa.opa.p6441f.p6442a.C83612aa r1, android.os.Bundle r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.aw.j.b(com.google.android.apps.gsa.opa.f.a.aa, android.os.Bundle):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5972aw.C75167j.mo71516b(com.google.android.apps.gsa.opa.f.a.aa, android.os.Bundle):void");
    }
}
