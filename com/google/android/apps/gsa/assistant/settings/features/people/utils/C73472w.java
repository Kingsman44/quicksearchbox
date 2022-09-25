package com.google.android.apps.gsa.assistant.settings.features.people.utils;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.settings.features.people.dl;
import com.google.p4109av.p4110a.p4111a.C54605d;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.people.utils.w */
/* compiled from: PG */
public final class C73472w {

    /* renamed from: a */
    public final dl f194482a;

    /* renamed from: b */
    public final dl f194483b;

    public C73472w(dl dlVar, dl dlVar2) {
        this.f194482a = dlVar;
        this.f194483b = dlVar2;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.people.utils.w.a():com.google.common.b.gu, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final com.google.common.p4522b.C58485gu mo64996a() {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.people.utils.w.a():com.google.common.b.gu, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.people.utils.C73472w.mo64996a():com.google.common.b.gu");
    }

    /* renamed from: b */
    public final String mo64997b() {
        return mo65000e() ? (String) this.f194483b.e.get(0) : BuildConfig.FLAVOR;
    }

    /* renamed from: c */
    public final String mo64998c() {
        dl dlVar = this.f194482a;
        return (dlVar.a & 2) != 0 ? dlVar.d : BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    public final boolean mo64999d() {
        int i = this.f194483b.a;
        return (i & 1024) == 0 && (i & 2048) == 0 && (i & 8192) == 0 && (4194304 & i) == 0 && (16777216 & i) == 0 && (i & 128) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = com.google.p4109av.p4110a.p4111a.C54605d.m87499a(r0.D);
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo65000e() {
        /*
            r3 = this;
            com.google.android.apps.gsa.assistant.settings.features.people.dl r0 = r3.f194483b
            int r1 = r0.a
            r2 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0017
            int r0 = r0.D
            int r0 = com.google.p4109av.p4110a.p4111a.C54605d.m87499a(r0)
            if (r0 != 0) goto L_0x0012
            goto L_0x0017
        L_0x0012:
            r1 = 6
            if (r0 != r1) goto L_0x0017
            r0 = 1
            return r0
        L_0x0017:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.people.utils.C73472w.mo65000e():boolean");
    }

    /* renamed from: f */
    public final boolean mo65001f() {
        dl dlVar = this.f194483b;
        return (dlVar.a & 4194304) != 0 && dlVar.G;
    }

    /* renamed from: g */
    public final boolean mo65002g() {
        dl dlVar = this.f194483b;
        if ((dlVar.a & 524288) == 0) {
            return false;
        }
        int a = C54605d.m87499a(dlVar.D);
        return a == 0 || a == 1;
    }

    /* renamed from: h */
    public final boolean mo65003h() {
        if ((this.f194482a.a & 2) != 0) {
            return false;
        }
        return mo65000e() || mo65001f();
    }
}
