package com.google.android.apps.search.assistant.surfaces.dictation.service.p9434e;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a.C126290c;
import com.google.common.p4526f.C59052c;
import com.google.protobuf.C63088z;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.e.au */
/* compiled from: PG */
public final /* synthetic */ class C125393au implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C125396ax f345835a;

    /* renamed from: b */
    public final /* synthetic */ Integer f345836b;

    public /* synthetic */ C125393au(C125396ax axVar, Integer num) {
        this.f345835a = axVar;
        this.f345836b = num;
    }

    public final void run() {
        FileInputStream createInputStream;
        C125396ax axVar = this.f345835a;
        int intValue = this.f345836b.intValue();
        try {
            createInputStream = axVar.f345840b.getResources().openRawResourceFd(intValue).createInputStream();
            byte[] N = C63088z.m96144F(createInputStream).mo59174N();
            if (createInputStream != null) {
                createInputStream.close();
            }
            AudioFormat build = new AudioFormat.Builder().setChannelMask(4).setEncoding(2).setSampleRate(16000).build();
            AudioAttributes build2 = new AudioAttributes.Builder().setContentType(4).setUsage(16).build();
            int length = N.length;
            C125395aw awVar = new C125395aw(build2, build, length);
            awVar.write(N, 0, length);
            awVar.setNotificationMarkerPosition(awVar.getBufferSizeInFrames());
            awVar.setPlaybackPositionUpdateListener(new C125394av(axVar, awVar));
            ((C59052c) ((C59052c) C125396ax.f345839a.mo56224b()).mo56372aa(36532)).mo56354G("Playing beep %s (size %s bytes) [SD]", C126290c.m206496a(axVar.f345840b.getResources().getResourceName(intValue)), C126290c.m206496a(Integer.valueOf(length)));
            awVar.play();
            return;
        } catch (IOException e) {
            ((C59052c) ((C59052c) ((C59052c) C125396ax.f345839a.mo56225c()).mo56382g(e)).mo56372aa(36533)).mo56386p("Could not play beep [SD]");
            return;
        } catch (Throwable th) {
            C125392at.m205371a(th, th);
        }
        throw th;
    }
}
