package com.google.android.apps.gsa.tasks;

/* renamed from: com.google.android.apps.gsa.tasks.bb */
/* compiled from: PG */
public final /* synthetic */ class C118499bb implements C118502be {

    /* renamed from: a */
    public static final /* synthetic */ C118499bb f328903a = new C118499bb();

    private /* synthetic */ C118499bb() {
    }

    /* renamed from: a */
    public final C118474ai mo103725a(C118474ai aiVar, String str) {
        C118473ah ahVar = (C118473ah) aiVar.toBuilder();
        boolean parseBoolean = Boolean.parseBoolean(str);
        ahVar.copyOnWrite();
        C118474ai aiVar2 = (C118474ai) ahVar.instance;
        aiVar2.f328832a |= 4;
        aiVar2.f328835d = parseBoolean;
        return (C118474ai) ahVar.build();
    }
}
