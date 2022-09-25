package com.google.android.libraries.assistant.gallium.framework;

import com.google.android.libraries.assistant.gallium.framework.ipc.internal.C18306g;
import com.google.common.base.C58889cz;
import java.util.List;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* compiled from: PG */
public class GalliumCoreso extends GalliumIpc {

    /* renamed from: b */
    public static final /* synthetic */ int f51687b = 0;

    public GalliumCoreso(C18208al alVar, C18207ak akVar, long j, C18306g gVar, C18307j jVar, Executor executor, List list, Optional optional, C58889cz czVar) {
        super(alVar, akVar, j, gVar, jVar, executor, list, optional, czVar);
    }

    public static native byte[] nativeSetupGallium(byte[] bArr, long j, byte[] bArr2, String str, String str2, long j2, long j3, boolean z, boolean z2);
}
