package com.google.mediapipe.framework;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
public class Graph {

    /* renamed from: a */
    private long f169352a = nativeCreateGraph();

    /* renamed from: b */
    private final List f169353b = new ArrayList();

    /* renamed from: c */
    private Map f169354c = new HashMap();

    /* renamed from: d */
    private Map f169355d = new HashMap();

    /* renamed from: e */
    private Map f169356e = new HashMap();

    /* renamed from: f */
    private final Object f169357f = new Object();

    private native void nativeAddMultiStreamCallback(long j, List list, PacketListCallback packetListCallback, boolean z);

    private native void nativeAddPacketCallback(long j, String str, PacketCallback packetCallback);

    private native void nativeAddPacketToInputStream(long j, String str, long j2, long j3);

    private native long nativeAddSurfaceOutput(long j, String str);

    private native void nativeCancelGraph(long j);

    private native void nativeCloseAllInputStreams(long j);

    private native void nativeCloseAllPacketSources(long j);

    private native void nativeCloseInputStream(long j, String str);

    private native long nativeCreateGraph();

    private native byte[] nativeGetCalculatorGraphConfig(long j);

    private native long nativeGetProfiler(long j);

    private native void nativeLoadBinaryGraph(long j, String str);

    private native void nativeLoadBinaryGraphBytes(long j, byte[] bArr);

    private native void nativeLoadBinaryGraphTemplate(long j, byte[] bArr);

    private native void nativeMovePacketToInputStream(long j, String str, long j2, long j3);

    private native void nativeReleaseGraph(long j);

    private native void nativeRunGraphUntilClose(long j, String[] strArr, long[] jArr);

    private native void nativeSetGraphInputStreamBlockingMode(long j, boolean z);

    private native void nativeSetGraphOptions(long j, byte[] bArr);

    private native void nativeSetGraphType(long j, String str);

    private native void nativeSetParentGlContext(long j, long j2);

    private native void nativeStartRunningGraph(long j, String[] strArr, long[] jArr, String[] strArr2, long[] jArr2);

    private native void nativeUpdatePacketReference(long j, long j2);

    private native void nativeWaitUntilGraphDone(long j);

    private native void nativeWaitUntilGraphIdle(long j);

    /* renamed from: a */
    public final synchronized long mo58605a() {
        return this.f169352a;
    }

    /* renamed from: b */
    public final synchronized void mo58606b(long j) {
        C58838bb.m90884s(this.f169352a != 0, "Invalid context, tearDown() might have been called already.");
        nativeSetParentGlContext(this.f169352a, j);
    }

    /* renamed from: c */
    public final synchronized void mo58607c() {
        C58838bb.m90884s(this.f169352a != 0, "Invalid context, tearDown() might have been called already.");
        for (Map.Entry value : this.f169354c.entrySet()) {
            ((Packet) value.getValue()).release();
        }
        this.f169354c.clear();
        for (Map.Entry entry : this.f169355d.entrySet()) {
            if (entry.getValue() != null) {
                ((Packet) entry.getValue()).release();
            }
        }
        this.f169355d.clear();
        for (Map.Entry value2 : this.f169356e.entrySet()) {
            ArrayList arrayList = (ArrayList) value2.getValue();
            if (arrayList.size() > 0) {
                Packet packet = ((C62717b) arrayList.get(0)).f169372a;
                throw null;
            }
        }
        this.f169356e.clear();
        synchronized (this.f169357f) {
            long j = this.f169352a;
            if (j != 0) {
                nativeReleaseGraph(j);
                this.f169352a = 0;
            }
        }
        this.f169353b.clear();
    }
}
