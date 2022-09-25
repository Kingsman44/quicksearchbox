package com.google.android.apps.gsa.staticplugins.opa.worker.proactive;

import com.google.assistant.p3897e.p3921j.p3926e.C51962fo;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.proactive.da */
/* compiled from: PG */
final class C114463da extends Exception {

    /* renamed from: a */
    public final C51962fo f317371a;

    /* renamed from: b */
    public final String f317372b;

    /* renamed from: c */
    public final int f317373c;

    public C114463da(C51962fo foVar) {
        super("Notification suppressed: ".concat(String.valueOf(foVar.name())));
        this.f317371a = foVar;
        this.f317372b = null;
        this.f317373c = 0;
    }

    public C114463da(C51962fo foVar, int i) {
        super("Notification suppressed: ".concat(String.valueOf(foVar.name())));
        this.f317371a = foVar;
        this.f317372b = null;
        this.f317373c = i;
    }

    public C114463da(C51962fo foVar, String str) {
        super("Notification suppressed: ".concat(String.valueOf(foVar.name())));
        this.f317371a = foVar;
        this.f317372b = str;
        this.f317373c = 0;
    }
}
