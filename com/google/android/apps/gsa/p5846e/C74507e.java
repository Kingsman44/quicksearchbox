package com.google.android.apps.gsa.p5846e;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.e.e */
/* compiled from: PG */
public final class C74507e {

    /* renamed from: a */
    public static volatile boolean f208643a = true;

    /* renamed from: b */
    public static volatile C118827a f208644b;

    /* renamed from: c */
    public static final List f208645c = new ArrayList(100);

    /* renamed from: a */
    public static void m120465a(C118827a aVar, C118569b bVar, int i) {
        aVar.mo77946i(bVar, C118575h.CLASSIC_USAGE_ANALYSIS, C118575h.CLASSIC_USAGE_ANALYSIS, i).mo104025g(1);
    }

    /* renamed from: b */
    public static void m120466b(int i) {
        m120473i(C118569b.SERVICE_ONCREATE_COUNT, i - 1);
    }

    /* renamed from: c */
    public static void m120467c(int i) {
        int i2 = i - 1;
        C118569b bVar = C118569b.MANIFEST_RECEIVER_ON_RECEIVE_COUNT;
        if (i != 0) {
            m120473i(bVar, i2);
            return;
        }
        throw null;
    }

    /* renamed from: d */
    public static void m120468d(int i) {
        m120473i(C118569b.PROVIDER_DELETE_COUNT, i - 1);
    }

    /* renamed from: e */
    public static void m120469e(int i) {
        m120473i(C118569b.PROVIDER_INSERT_COUNT, i - 1);
    }

    /* renamed from: f */
    public static void m120470f(int i) {
        m120473i(C118569b.PROVIDER_OPEN_FILE_COUNT, i - 1);
    }

    /* renamed from: g */
    public static void m120471g(int i) {
        m120473i(C118569b.PROVIDER_QUERY_COUNT, i - 1);
    }

    /* renamed from: h */
    public static void m120472h(int i) {
        m120473i(C118569b.PROVIDER_UPDATE_COUNT, i - 1);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.e.e.i(com.google.android.apps.gsa.u.b, int):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: i */
    private static void m120473i(com.google.android.apps.gsa.p8852u.C118569b r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.e.e.i(com.google.android.apps.gsa.u.b, int):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p5846e.C74507e.m120473i(com.google.android.apps.gsa.u.b, int):void");
    }
}
