package com.google.apps.tiktok.tracing;

import android.media.MediaPlayer;

/* renamed from: com.google.apps.tiktok.tracing.ck */
/* compiled from: PG */
public final /* synthetic */ class C47587ck implements MediaPlayer.OnCompletionListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123496a;

    /* renamed from: b */
    public final /* synthetic */ String f123497b = "Speakr onParagraphFinished";

    /* renamed from: c */
    public final /* synthetic */ MediaPlayer.OnCompletionListener f123498c;

    public /* synthetic */ C47587ck(C47770dh dhVar, MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f123496a = dhVar;
        this.f123498c = onCompletionListener;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        C47770dh dhVar = this.f123496a;
        String str = this.f123497b;
        MediaPlayer.OnCompletionListener onCompletionListener = this.f123498c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            onCompletionListener.onCompletion(mediaPlayer);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
