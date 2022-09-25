package com.google.android.libraries.p11016ak.p11019c.p11021b;

import android.os.Bundle;
import android.os.StrictMode;
import android.speech.tts.TextToSpeech;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5285d.p5290b.p5291a.p5292a.C68193f;

/* renamed from: com.google.android.libraries.ak.c.b.u */
/* compiled from: PG */
public final class C147673u {

    /* renamed from: b */
    private static final C59071e f398534b = C59071e.m91332i("com.google.android.libraries.ak.c.b.u");

    /* renamed from: a */
    public final C68193f f398535a;

    /* renamed from: c */
    private final TextToSpeech f398536c;

    /* renamed from: d */
    private final Map f398537d;

    public C147673u(TextToSpeech textToSpeech, C68193f fVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f398537d = concurrentHashMap;
        this.f398536c = textToSpeech;
        Objects.requireNonNull(concurrentHashMap);
        textToSpeech.setOnUtteranceProgressListener(new C147678z(new C147666n(concurrentHashMap)));
        this.f398535a = fVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C60870cx mo124408a(int i, int i2) {
        C147650ad adVar = (C147650ad) this.f398537d.get(Integer.toString(i));
        if (adVar == null) {
            return C60856cj.m92899h(new IllegalStateException(String.format("Synthesis for paragraph index %s did not start.", new Object[]{Integer.valueOf(i)})));
        }
        return adVar.mo124397a(i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C60870cx mo124409b(String str, int i) {
        SettableFuture settableFuture;
        C147669q qVar;
        String num = Integer.toString(i);
        settableFuture = new SettableFuture();
        C147650ad adVar = new C147650ad(settableFuture);
        this.f398537d.put(num, adVar);
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            File createTempFile = File.createTempFile("readaloud-", ".tmp");
            adVar.mo124401e(createTempFile.toPath());
            TextToSpeech textToSpeech = this.f398536c;
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.tts:Mode", "LocalOnly");
            bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
            int synthesizeToFile = textToSpeech.synthesizeToFile(str, bundle, createTempFile, num);
            if (synthesizeToFile != 0) {
                adVar.mo124399c(new IllegalStateException(String.format("Error queuing TTS: %s", new Object[]{Integer.valueOf(synthesizeToFile)})));
            }
        } catch (IOException e) {
            try {
                ((C59052c) ((C59052c) ((C59052c) f398534b.mo56225c()).mo56382g(e)).mo56372aa(50527)).mo56386p("Error starting local tts!");
                adVar.mo124399c(e);
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
                throw th;
            }
        }
        StrictMode.setThreadPolicy(allowThreadDiskWrites);
        qVar = new C147669q(this);
        return C60922j.m93044g(settableFuture, C47810es.m84963c(qVar), C60826bg.f164896a);
    }
}
