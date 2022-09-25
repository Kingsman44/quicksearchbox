package com.google.research.xeno.effect;

import android.util.Log;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketGetter;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.p4722a.C62709k;
import com.google.research.xeno.effect.ProcessorBase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.research.xeno.effect.r */
/* compiled from: PG */
public final /* synthetic */ class C66415r implements ProcessorBase.PacketCallback {

    /* renamed from: a */
    public final /* synthetic */ ProcessorBase f180595a;

    public /* synthetic */ C66415r(ProcessorBase processorBase) {
        this.f180595a = processorBase;
    }

    public final void process(Packet packet) {
        ProcessorBase processorBase = this.f180595a;
        Iterator it = processorBase.f180570j.iterator();
        while (it.hasNext()) {
            packet.nativeGetTimestamp(packet.f169364a);
            ((C66416s) it.next()).mo59620b();
        }
        HashMap hashMap = new HashMap();
        Iterator it2 = processorBase.f180568h.iterator();
        while (it2.hasNext()) {
            hashMap.put((C62709k) it2.next(), new GraphTextureFrame(PacketGetter.nativeGetGpuBuffer(packet.getNativeHandle(), true), packet.nativeGetTimestamp(packet.f169364a)));
        }
        Iterator it3 = processorBase.f180568h.iterator();
        while (it3.hasNext()) {
            C62709k kVar = (C62709k) it3.next();
            TextureFrame textureFrame = (TextureFrame) hashMap.remove(kVar);
            if (textureFrame != null) {
                kVar.mo18643a(textureFrame);
                if (Log.isLoggable(ProcessorBase.f180563c, 2)) {
                    Log.v(ProcessorBase.f180563c, String.format("Output tex: %d width: %d height: %d to consumer %h", new Object[]{Integer.valueOf(textureFrame.getTextureName()), Integer.valueOf(textureFrame.getWidth()), Integer.valueOf(textureFrame.getHeight()), kVar}));
                }
            }
        }
        for (Map.Entry value : hashMap.entrySet()) {
            ((TextureFrame) value.getValue()).release();
        }
    }
}
