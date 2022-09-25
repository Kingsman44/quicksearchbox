package com.google.android.apps.gsa.nga.engine.p5907aj;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80320bo;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80321bp;

/* renamed from: com.google.android.apps.gsa.nga.engine.aj.z */
/* compiled from: PG */
public abstract class C74851z {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.aj.z.d(com.google.android.apps.gsa.nga.shared.aa.e.a.bp):com.google.android.apps.gsa.nga.engine.aj.z, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: d */
    public static com.google.android.apps.gsa.nga.engine.p5907aj.C74851z m121022d(com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80321bp r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.aj.z.d(com.google.android.apps.gsa.nga.shared.aa.e.a.bp):com.google.android.apps.gsa.nga.engine.aj.z, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5907aj.C74851z.m121022d(com.google.android.apps.gsa.nga.shared.aa.e.a.bp):com.google.android.apps.gsa.nga.engine.aj.z");
    }

    /* renamed from: a */
    public abstract long mo71241a();

    /* renamed from: b */
    public abstract int mo71243b();

    /* renamed from: c */
    public abstract String mo71242c();

    /* renamed from: e */
    public final C80321bp mo71244e() {
        int b = mo71243b();
        int i = b - 1;
        if (b == 0) {
            throw null;
        } else if (i == 0) {
            C80320bo boVar = (C80320bo) C80321bp.f220412c.createBuilder();
            long a = mo71241a();
            boVar.copyOnWrite();
            C80321bp bpVar = (C80321bp) boVar.instance;
            bpVar.f220414a = 2;
            bpVar.f220415b = Long.valueOf(a);
            return (C80321bp) boVar.build();
        } else if (i == 1) {
            C80320bo boVar2 = (C80320bo) C80321bp.f220412c.createBuilder();
            String c = mo71242c();
            boVar2.copyOnWrite();
            C80321bp bpVar2 = (C80321bp) boVar2.instance;
            c.getClass();
            bpVar2.f220414a = 1;
            bpVar2.f220415b = c;
            return (C80321bp) boVar2.build();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
