package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18240h;
import com.google.protos.p4985f.p5030q.C65191ey;

/* renamed from: com.google.android.libraries.assistant.portable.i */
/* compiled from: PG */
public final /* synthetic */ class C19101i implements C18240h {

    /* renamed from: a */
    public final /* synthetic */ PortableAssistant f53562a;

    /* renamed from: b */
    public final /* synthetic */ C65191ey f53563b;

    public /* synthetic */ C19101i(PortableAssistant portableAssistant, C65191ey eyVar) {
        this.f53562a = portableAssistant;
        this.f53563b = eyVar;
    }

    /* renamed from: a */
    public final long mo23737a() {
        PortableAssistant portableAssistant = this.f53562a;
        C65191ey eyVar = this.f53563b;
        C19053ab e = portableAssistant.mo24259e();
        try {
            if (portableAssistant.f53433c == 0) {
                e.close();
                return 0;
            } else if (portableAssistant.f53434d) {
                long nativeSetupNativeInterfaces = RequestScopedInterfaceRegistryProvider.nativeSetupNativeInterfaces(eyVar.toByteArray(), portableAssistant.f53433c, portableAssistant.f53436f);
                e.close();
                return nativeSetupNativeInterfaces;
            } else {
                long nativeSetupPopScopedNativeInterfaces = PopScopedCppInterfaceRegistryProvider.nativeSetupPopScopedNativeInterfaces(eyVar.toByteArray(), portableAssistant.f53433c);
                e.close();
                return nativeSetupPopScopedNativeInterfaces;
            }
        } catch (Throwable th) {
            C19055b.m36519a(th, th);
        }
        throw th;
    }
}
