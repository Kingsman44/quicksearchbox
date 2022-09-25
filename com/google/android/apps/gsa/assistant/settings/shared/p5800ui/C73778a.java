package com.google.android.apps.gsa.assistant.settings.shared.p5800ui;

import android.app.Activity;
import android.support.p031v4.app.Fragment;
import android.support.p033v7.app.C0356aq;
import android.support.p033v7.app.C0383d;
import android.support.p033v7.app.C0395p;

/* renamed from: com.google.android.apps.gsa.assistant.settings.shared.ui.a */
/* compiled from: PG */
public final class C73778a {
    /* renamed from: a */
    public static void m108338a(Fragment fragment) {
        C0383d c = m108340c(fragment.getActivity());
        if (c != null) {
            c.mo1236g();
        }
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.ui.a.b(android.support.v4.app.Fragment):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public static void m108339b(android.support.p031v4.app.Fragment r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.shared.ui.a.b(android.support.v4.app.Fragment):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.shared.p5800ui.C73778a.m108339b(android.support.v4.app.Fragment):void");
    }

    /* renamed from: c */
    private static C0383d m108340c(Activity activity) {
        if (!(activity instanceof C0395p)) {
            return null;
        }
        C0356aq aqVar = (C0356aq) ((C0395p) activity).mo1322k();
        aqVar.mo1163P();
        return aqVar.f1215o;
    }
}
