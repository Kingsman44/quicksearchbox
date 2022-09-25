package com.youtube.android.libraries.elements.templates;

import com.google.android.libraries.blocks.Container;
import com.google.android.libraries.elements.C20697c;
import com.google.android.libraries.elements.interfaces.DebuggerClient;
import java.util.concurrent.atomic.AtomicBoolean;
import p5488io.grpc.Status;

/* compiled from: PG */
public class UnifiedTemplateResolver {

    /* renamed from: a */
    public static final byte[] f184334a = new byte[0];

    /* renamed from: d */
    private static final AtomicBoolean f184335d = new AtomicBoolean(false);

    /* renamed from: b */
    public final boolean f184336b;

    /* renamed from: c */
    public final int f184337c;

    static {
        C20697c.m38871a();
    }

    public UnifiedTemplateResolver() {
        this((Container) null, false, (String) null, (DebuggerClient) null, false, 0);
    }

    private native void jni_init(boolean z, DebuggerClient debuggerClient, String str);

    private native void jni_setBlocksContainer(Container container);

    public native Status jni_resolveFlat(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, String str, boolean z, int i3, byte[][] bArr4, long[] jArr);

    public native Status jni_setTemplateConfig(String str, byte[] bArr);

    public UnifiedTemplateResolver(Container container, boolean z, String str, DebuggerClient debuggerClient, boolean z2, int i) {
        this.f184336b = z2;
        this.f184337c = i;
        if (f184335d.compareAndSet(false, true)) {
            jni_init(z, debuggerClient, str == null ? "localhost:5001" : str);
            if (container != null) {
                jni_setBlocksContainer(container);
            }
        }
    }
}
