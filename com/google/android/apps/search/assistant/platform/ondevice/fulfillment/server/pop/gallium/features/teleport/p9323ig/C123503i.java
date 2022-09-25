package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.p9323ig;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.gallium.features.teleport.ig.i */
/* compiled from: PG */
abstract class C123503i {
    /* renamed from: a */
    public abstract C123481h mo105917a();

    /* renamed from: b */
    public abstract String mo105918b();

    /* renamed from: c */
    public abstract String mo105922c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final String mo106026d() {
        C123481h hVar = C123481h.APP;
        int ordinal = mo105917a().ordinal();
        if (ordinal == 0) {
            return mo105918b();
        }
        if (ordinal == 1) {
            return mo105922c();
        }
        throw new AssertionError(mo105917a());
    }
}
