package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.as */
/* compiled from: PG */
public abstract class C120923as {
    /* renamed from: b */
    public static C120922ar m200152b() {
        C120930az azVar = new C120930az();
        azVar.mo104992b(0);
        return azVar;
    }

    /* renamed from: a */
    public abstract int mo104993a();

    /* renamed from: c */
    public abstract C120924at mo104994c();

    /* renamed from: d */
    public abstract C120946bo mo104995d();

    /* renamed from: e */
    public final void mo104996e() {
        C120924at c = mo104994c();
        if (c != null) {
            c.deleteAppWidgetId(mo104993a());
            c.stopListening();
            c.deleteHost();
        }
        C120946bo d = mo104995d();
        if (d != null) {
            d.f336267g = true;
        }
    }

    /* renamed from: f */
    public abstract int mo104997f();
}
