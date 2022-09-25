package com.google.android.libraries.silk.p3238b;

import com.google.common.base.C58837ba;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;

/* renamed from: com.google.android.libraries.silk.b.b */
/* compiled from: PG */
public final class C41749b {

    /* renamed from: a */
    public static final C56848d f109097a = m73223b("General Error");

    static {
        m73223b("Not Implemented");
    }

    /* renamed from: a */
    public static C56848d m73222a(String str, String str2) {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = str;
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        str2.getClass();
        dVar2.f151671a |= 2;
        dVar2.f151673c = str2;
        return (C56848d) cVar.build();
    }

    /* renamed from: b */
    public static C56848d m73223b(String str) {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        cVar.copyOnWrite();
        C56848d dVar = (C56848d) cVar.instance;
        dVar.f151671a |= 1;
        dVar.f151672b = "general_error";
        cVar.copyOnWrite();
        C56848d dVar2 = (C56848d) cVar.instance;
        str.getClass();
        dVar2.f151671a |= 2;
        dVar2.f151673c = str;
        return (C56848d) cVar.build();
    }

    /* renamed from: c */
    public static C56848d m73224c(Throwable th) {
        if (th instanceof C41742a) {
            return ((C41742a) th).f109086a;
        }
        String message = th.getMessage();
        if (true == C58837ba.m90859h(message)) {
            message = "General Error";
        }
        return m73223b(message);
    }
}
