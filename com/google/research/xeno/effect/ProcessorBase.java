package com.google.research.xeno.effect;

import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import com.google.mediapipe.framework.MediaPipeException;
import com.google.mediapipe.framework.Packet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
public abstract class ProcessorBase {

    /* renamed from: c */
    public static final String f180563c = "ProcessorBase";

    /* renamed from: d */
    public final ReentrantReadWriteLock f180564d = new ReentrantReadWriteLock();

    /* renamed from: e */
    public long f180565e;

    /* renamed from: f */
    protected final Graph f180566f;

    /* renamed from: g */
    public final AndroidPacketCreator f180567g;

    /* renamed from: h */
    public final CopyOnWriteArraySet f180568h = new CopyOnWriteArraySet();

    /* renamed from: i */
    public final CopyOnWriteArraySet f180569i = new CopyOnWriteArraySet();

    /* renamed from: j */
    protected final CopyOnWriteArraySet f180570j = new CopyOnWriteArraySet();

    /* compiled from: PG */
    public interface AuxOutputCallback {
        void onOutput(Packet packet, String str);
    }

    /* compiled from: PG */
    public interface Callback {
        void onCompletion(boolean z, String str);
    }

    /* compiled from: PG */
    public interface PacketCallback {
        void process(Packet packet);
    }

    protected ProcessorBase(C66406i iVar) {
        Graph graph = new Graph();
        this.f180566f = graph;
        long j = ((C66399b) iVar).f180573a;
        if (j != 0) {
            try {
                graph.mo58606b(j);
            } catch (MediaPipeException unused) {
            }
        }
        this.f180567g = new AndroidPacketCreator(this.f180566f);
    }

    protected static native void nativeImageProcessorTick(long j, long j2);

    protected static native long nativeNewImageProcessor(long j, long j2, long j3, long j4, long j5, long j6, PacketCallback packetCallback, PacketCallback packetCallback2);

    protected static native long nativeNewVideoProcessor(long j, long j2, long j3, PacketCallback packetCallback, PacketCallback packetCallback2, AuxOutputCallback auxOutputCallback);

    private static native void nativePrepareCurrentEffectToStartRecording(long j);

    public static native void nativeRelease(long j);

    protected static native void nativeSendVideoProcessorAudioPacket(long j, long j2, long j3, Callback callback);

    protected static native void nativeSendVideoProcessorFramePacket(long j, long j2, long j3, Callback callback);

    private static native void nativeSetEffect(long j, long j2, Callback callback);

    protected static native void nativeStartVideoProcessing(long j, int i, long j2, long j3, int i2, int i3, Callback callback);

    protected static native void nativeStopVideoProcessing(long j, Callback callback);

    /* renamed from: c */
    public final void mo59608c(C66417t tVar) {
        this.f180564d.readLock().lock();
        try {
            tVar.mo18708a(this.f180565e);
        } finally {
            this.f180564d.readLock().unlock();
        }
    }
}
