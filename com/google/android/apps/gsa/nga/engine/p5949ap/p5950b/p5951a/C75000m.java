package com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.p5951a;

import com.google.android.apps.gsa.nga.d.a.j;
import com.google.android.apps.gsa.nga.d.a.s;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.android.apps.gsa.nga.shared.p6274a.C80053ag;
import com.google.assistant.p3838ao.p3839a.p3845e.C49588cr;
import com.google.assistant.p3838ao.p3839a.p3845e.C49589cs;
import com.google.assistant.p3838ao.p3839a.p3845e.C49590ct;
import com.google.assistant.p3838ao.p3839a.p3845e.C49591cu;

@Deprecated
/* renamed from: com.google.android.apps.gsa.nga.engine.ap.b.a.m */
/* compiled from: PG */
public final class C75000m {
    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.ap.b.a.m.a(com.google.android.apps.gsa.nga.d.a.j):com.google.assistant.ao.a.e.bo, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public static com.google.assistant.p3838ao.p3839a.p3845e.C49558bo m121239a(com.google.android.apps.gsa.nga.d.a.j r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.nga.engine.ap.b.a.m.a(com.google.android.apps.gsa.nga.d.a.j):com.google.assistant.ao.a.e.bo, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p5949ap.p5950b.p5951a.C75000m.m121239a(com.google.android.apps.gsa.nga.d.a.j):com.google.assistant.ao.a.e.bo");
    }

    /* renamed from: b */
    public static C49589cs m121240b(j jVar) {
        C80047aa aaVar;
        String str;
        if (jVar.a == 1) {
            aaVar = (C80047aa) jVar.b;
        } else {
            aaVar = C80047aa.f219655i;
        }
        C49588cr crVar = (C49588cr) C49589cs.f127959d.createBuilder();
        if (aaVar.f219657a == 10) {
            str = ((C80053ag) aaVar.f219658b).f219678b;
        } else {
            str = aaVar.f219662f;
        }
        crVar.copyOnWrite();
        C49589cs csVar = (C49589cs) crVar.instance;
        str.getClass();
        csVar.f127961a = 1 | csVar.f127961a;
        csVar.f127962b = str;
        C49591cu c = m121241c(jVar);
        crVar.copyOnWrite();
        C49589cs csVar2 = (C49589cs) crVar.instance;
        c.getClass();
        csVar2.f127963c = c;
        csVar2.f127961a |= 2;
        return (C49589cs) crVar.build();
    }

    /* renamed from: c */
    private static C49591cu m121241c(j jVar) {
        C49590ct ctVar = (C49590ct) C49591cu.f127964c.createBuilder();
        s a = s.a(jVar.d);
        if (a == null) {
            a = s.e;
        }
        double d = 1.0E-10d;
        if (a == s.b) {
            d = Math.max(1.0E-10d, jVar.e);
        }
        ctVar.copyOnWrite();
        C49591cu cuVar = (C49591cu) ctVar.instance;
        cuVar.f127966a |= 1;
        cuVar.f127967b = d;
        return (C49591cu) ctVar.build();
    }
}
