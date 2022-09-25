package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18240h;

/* renamed from: com.google.android.libraries.assistant.portable.n */
/* compiled from: PG */
public final /* synthetic */ class C19106n implements C18240h {

    /* renamed from: a */
    public final /* synthetic */ PortableAssistant f53569a;

    public /* synthetic */ C19106n(PortableAssistant portableAssistant) {
        this.f53569a = portableAssistant;
    }

    /* renamed from: a */
    public final long mo23737a() {
        return PopLifecycleScopedInterfaceRegistryProvider.nativeSetupPopNativeInterfaces(this.f53569a.f53436f);
    }
}
