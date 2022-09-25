package com.google.android.apps.gsa.nga.api.p5883a;

/* renamed from: com.google.android.apps.gsa.nga.api.a.br */
/* compiled from: PG */
public final class C74672br {
    /* renamed from: a */
    public static /* synthetic */ String m120739a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 5 ? "null" : "UNEXPECTED_EXCEPTION" : "ATTENTION_HANDLER_REJECTED" : "UNKNOWN" : "UNRECOGNIZED";
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.api.a.br.b(int):int, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public static int m120740b(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.api.a.br.b(int):int, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.api.p5883a.C74672br.m120740b(int):int");
    }

    /* renamed from: c */
    public static int m120741c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 3 ? 0 : 5;
        }
        return 3;
    }
}
