package com.google.android.libraries.assistant.portable;

import com.google.android.libraries.assistant.gallium.framework.C18307j;
import com.google.android.libraries.assistant.gallium.framework.p1507b.C18225c;

/* compiled from: PG */
public final class PopCppDeploymentConfigProvider extends C18225c {

    /* renamed from: a */
    private final C18307j f53430a;

    public PopCppDeploymentConfigProvider(C18307j jVar) {
        this.f53430a = jVar;
    }

    private native long nativeSetupPopDeploymentConfig(long j);

    /* renamed from: a */
    public final long mo23728a() {
        long a = this.f53430a.mo23655a();
        if (a == 0) {
            return 0;
        }
        return nativeSetupPopDeploymentConfig(a);
    }
}
