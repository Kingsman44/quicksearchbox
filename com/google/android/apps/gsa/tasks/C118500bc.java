package com.google.android.apps.gsa.tasks;

/* renamed from: com.google.android.apps.gsa.tasks.bc */
/* compiled from: PG */
public final /* synthetic */ class C118500bc implements C118502be {

    /* renamed from: a */
    public static final /* synthetic */ C118500bc f328904a = new C118500bc();

    private /* synthetic */ C118500bc() {
    }

    /* renamed from: a */
    public final C118474ai mo103725a(C118474ai aiVar, String str) {
        C118473ah ahVar = (C118473ah) aiVar.toBuilder();
        boolean parseBoolean = Boolean.parseBoolean(str);
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 8;
        aiVar2.f328836e = parseBoolean;
        return (C118474ai) ahVar.build();
    }
}
