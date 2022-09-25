package com.google.android.apps.gsa.nga.api.p5883a;

/* renamed from: com.google.android.apps.gsa.nga.api.a.dm */
/* compiled from: PG */
public final class C74679dm {
    /* renamed from: a */
    public static /* synthetic */ String m120751a(int i) {
        switch (i) {
            case 2:
                return "UNKNOWN";
            case 3:
                return "MISSING_INVOCATION_TOKEN";
            case 4:
                return "ATTENTION_HANDLER_REJECTED";
            case 5:
                return "UNEXPECTED_EXCEPTION";
            case 6:
                return "MISSING_ROHAN_TOKEN";
            case 7:
                return "HOTWORD_EVENT_REJECTED";
            default:
                return "UNRECOGNIZED";
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.api.a.dm.b(int):int, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public static int m120752b(int r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.api.a.dm.b(int):int, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.api.p5883a.C74679dm.m120752b(int):int");
    }

    /* renamed from: c */
    public static int m120753c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }
}
