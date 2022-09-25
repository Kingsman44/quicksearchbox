package com.google.android.libraries.p579ar.faceviewer.runtime;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni */
/* compiled from: PG */
public final class ExperienceJni {

    /* renamed from: a */
    public static final C59071e f35574a = C59071e.m91332i("com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni");

    /* renamed from: b */
    public long f35575b;

    public ExperienceJni(long j) {
        this.f35575b = j;
    }

    private native List nativeGetActiveItemIds(long j);

    private native List nativeGetAllItemIds(long j);

    private native List nativeGetInitialItemIds(long j);

    private native void nativeLoadItems(long j, List list, NativeCallback nativeCallback);

    /* access modifiers changed from: protected */
    public final void finalize() {
        if (this.f35575b != 0) {
            ((C59052c) ((C59052c) f35574a.mo56225c()).mo56372aa(42306)).mo56386p("ExperienceJni finalized with non-null nativeHandle.");
        }
    }

    public native void nativeActivateItems(long j, List list, long j2, NativeCallback nativeCallback);

    public native void nativeDestroy(long j);

    public native byte[] nativeGetWebConfigProto(long j);

    public native void nativePreloadAllItems(long j, NativeCallback nativeCallback);
}
