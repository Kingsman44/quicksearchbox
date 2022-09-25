package com.google.research.xeno.effect;

import android.media.AudioFormat;
import android.util.Log;
import android.util.Size;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.p4722a.C62699a;
import com.google.mediapipe.p4722a.C62709k;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* renamed from: com.google.research.xeno.effect.o */
/* compiled from: PG */
public class C66412o extends ProcessorBase implements C62709k, C62699a {

    /* renamed from: a */
    public static final String f180592a = "o";

    /* renamed from: b */
    public static final Size f180593b = new Size(-1, -1);

    public C66412o(C66406i iVar) {
        super(iVar);
        long nativeNewVideoProcessor = nativeNewVideoProcessor(this.f180566f.mo58605a(), 0, ((C66399b) iVar).f180573a, new C66415r(this), new C66414q(this), new C66413p());
        this.f180564d.writeLock().lock();
        try {
            this.f180565e = nativeNewVideoProcessor;
        } finally {
            this.f180564d.writeLock().unlock();
        }
    }

    /* renamed from: a */
    public final void mo18643a(TextureFrame textureFrame) {
        long timestamp = textureFrame.getTimestamp();
        AndroidPacketCreator androidPacketCreator = this.f180567g;
        Packet create = Packet.create(androidPacketCreator.nativeCreateGpuBuffer(androidPacketCreator.f169365a.mo58605a(), textureFrame.getTextureName(), textureFrame.getWidth(), textureFrame.getHeight(), textureFrame));
        Iterator it = this.f180570j.iterator();
        while (it.hasNext()) {
            ((C66416s) it.next()).mo59619a();
        }
        mo59608c(new C66407j(create, timestamp));
        create.release();
    }

    /* renamed from: b */
    public final void mo58576b(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        Packet packet;
        if (audioFormat.getChannelCount() == 0) {
            Log.e(f180592a, "Current AudioFormat's channel count is 0");
            return;
        }
        int limit = (byteBuffer.limit() / 2) / audioFormat.getChannelCount();
        int channelCount = audioFormat.getChannelCount();
        AndroidPacketCreator androidPacketCreator = this.f180567g;
        int remaining = byteBuffer.remaining();
        int i = channelCount * limit;
        int i2 = i + i;
        if (i2 == remaining) {
            if (byteBuffer.isDirect()) {
                packet = Packet.create(androidPacketCreator.nativeCreateAudioPacketDirect(androidPacketCreator.f169365a.mo58605a(), byteBuffer.slice(), channelCount, limit));
            } else if (byteBuffer.hasArray()) {
                packet = Packet.create(androidPacketCreator.nativeCreateAudioPacket(androidPacketCreator.f169365a.mo58605a(), byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), channelCount, limit));
            } else {
                throw new IllegalArgumentException("Data must be either a direct byte buffer or be backed by a byte array.");
            }
            mo59608c(new C66411n(packet, j));
            packet.release();
            return;
        }
        throw new IllegalArgumentException("Please check the audio data size, has to be num_channels * num_samples * 2 = " + i2 + " but was " + remaining);
    }
}
