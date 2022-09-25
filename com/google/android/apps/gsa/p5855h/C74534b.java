package com.google.android.apps.gsa.p5855h;

import android.content.Intent;
import android.support.p031v4.app.C0167am;
import android.support.p031v4.app.Fragment;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.h.b */
/* compiled from: PG */
public final class C74534b {

    /* renamed from: a */
    private static final C59071e f208690a = null;

    /* renamed from: b */
    private final Fragment f208691b;

    public C74534b(Fragment fragment) {
        this.f208691b = fragment;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.h.b.a(android.content.Intent):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo70845a(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.h.b.a(android.content.Intent):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.p5855h.C74534b.mo70845a(android.content.Intent):void");
    }

    /* renamed from: b */
    public final void mo70846b(Intent intent) {
        this.f208691b.startActivity(intent);
        C0167am activity = this.f208691b.getActivity();
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }
}
