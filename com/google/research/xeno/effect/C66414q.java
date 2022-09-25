package com.google.research.xeno.effect;

import android.media.AudioFormat;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.p4722a.C62699a;
import com.google.research.xeno.effect.ProcessorBase;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.research.xeno.effect.q */
/* compiled from: PG */
public final /* synthetic */ class C66414q implements ProcessorBase.PacketCallback {

    /* renamed from: a */
    public final /* synthetic */ ProcessorBase f180594a;

    public /* synthetic */ C66414q(ProcessorBase processorBase) {
        this.f180594a = processorBase;
    }

    public final void process(Packet packet) {
        Iterator it = this.f180594a.f180569i.iterator();
        while (it.hasNext()) {
            ((C62699a) it.next()).mo58576b(ByteBuffer.wrap(PacketGetter.nativeGetAudioData(packet.getNativeHandle())), packet.nativeGetTimestamp(packet.f169364a), new AudioFormat.Builder().setEncoding(2).setChannelMask(PacketGetter.nativeGetMatrixRows(packet.getNativeHandle()) == 2 ? 12 : 16).build());
        }
    }
}
