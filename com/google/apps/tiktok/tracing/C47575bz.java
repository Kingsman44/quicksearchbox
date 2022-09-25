package com.google.apps.tiktok.tracing;

import android.media.MediaPlayer;

/* renamed from: com.google.apps.tiktok.tracing.bz */
/* compiled from: PG */
public final /* synthetic */ class C47575bz implements MediaPlayer.OnErrorListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123461a;

    /* renamed from: b */
    public final /* synthetic */ String f123462b = "Speakr onPlayerError";

    /* renamed from: c */
    public final /* synthetic */ MediaPlayer.OnErrorListener f123463c;

    public /* synthetic */ C47575bz(C47770dh dhVar, MediaPlayer.OnErrorListener onErrorListener) {
        this.f123461a = dhVar;
        this.f123463c = onErrorListener;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C47770dh dhVar = this.f123461a;
        String str = this.f123462b;
        MediaPlayer.OnErrorListener onErrorListener = this.f123463c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onError = onErrorListener.onError(mediaPlayer, i, i2);
            if (c != null) {
                c.close();
            }
            return onError;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
