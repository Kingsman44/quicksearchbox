package com.google.android.libraries.web.lifecycle.p3427c;

/* renamed from: com.google.android.libraries.web.lifecycle.c.a */
/* compiled from: PG */
public final /* synthetic */ class C43883a {
    /* renamed from: a */
    public static Object m77457a(C43888f fVar) {
        if (fVar instanceof C43886d) {
            return ((C43886d) fVar).f114338a;
        }
        return null;
    }

    /* renamed from: b */
    public static Object m77458b(C43888f fVar) {
        Object a = fVar.mo46880a();
        if (a != null) {
            return a;
        }
        throw new IllegalStateException("Expected LifecycledSnapshot to have a value.");
    }

    /* renamed from: c */
    public static boolean m77459c(C43888f fVar) {
        return (fVar instanceof C43886d) || (fVar instanceof C43887e);
    }
}
