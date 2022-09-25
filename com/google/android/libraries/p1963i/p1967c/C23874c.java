package com.google.android.libraries.p1963i.p1967c;

import com.google.android.libraries.p1963i.C23865bf;
import com.google.apps.tiktok.tracing.C47822fd;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.i.c.c */
/* compiled from: PG */
public final /* synthetic */ class C23874c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C23875d f65329a;

    /* renamed from: b */
    public final /* synthetic */ Thread f65330b;

    public /* synthetic */ C23874c(C23875d dVar, Thread thread) {
        this.f65329a = dVar;
        this.f65330b = thread;
    }

    public final void run() {
        C23875d dVar = this.f65329a;
        Thread thread = this.f65330b;
        String obj = dVar.f65332b.f65336d ? dVar.f65331a.toString() : dVar.f65331a.getClass().toString();
        String a = C23865bf.m44421a(thread);
        long f = dVar.f65332b.f65335c.mo29260f();
        String valueOf = String.valueOf(dVar.f65332b.f65335c.mo29261g());
        C23884m mVar = new C23884m("On " + a + " task took longer than " + f + " " + valueOf + " so assumed deadlocked: " + obj, thread.getStackTrace());
        RuntimeException b = C47822fd.m84996b(thread);
        if (b.getStackTrace().length > 0) {
            mVar.initCause(b);
        }
        ArrayList a2 = dVar.f65332b.f65333a.mo29278a();
        a2.remove(thread);
        C23881j.m44440b(dVar.f65332b.f65334b, a2, mVar);
    }
}
