package com.google.android.libraries.assistant.gallium.framework;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.ac */
/* compiled from: PG */
public final class C18199ac implements C18217au {

    /* renamed from: a */
    public final C18217au f51724a;

    /* renamed from: b */
    final /* synthetic */ GalliumIpc f51725b;

    /* renamed from: c */
    private long f51726c;

    public C18199ac(GalliumIpc galliumIpc, C18217au auVar, long j) {
        this.f51725b = galliumIpc;
        this.f51724a = auVar;
        this.f51726c = j;
    }

    /* renamed from: a */
    public final long mo23676a() {
        return ((C18215as) this.f51724a).f51737a;
    }

    public final void close() {
        this.f51724a.close();
        long j = this.f51726c;
        if (j != 0) {
            this.f51725b.nativeDestroyCppSpanScope(j);
            this.f51726c = 0;
        }
    }
}
