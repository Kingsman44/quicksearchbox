package com.google.android.libraries.gsa.conversation.p1837a;

import android.media.AudioManager;
import android.media.MediaPlayer;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.conversation.a.x */
/* compiled from: PG */
public final class C22343x {

    /* renamed from: a */
    public static final C59071e f61678a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.a.x");

    /* renamed from: b */
    public final AudioManager f61679b;

    /* renamed from: c */
    public final Object f61680c = new Object();

    /* renamed from: d */
    public AudioManager.OnAudioFocusChangeListener f61681d;

    /* renamed from: e */
    public MediaPlayer f61682e;

    /* renamed from: f */
    public C2164c f61683f;

    /* renamed from: g */
    public boolean f61684g;

    /* renamed from: h */
    public boolean f61685h;

    public C22343x(AudioManager audioManager) {
        this.f61679b = audioManager;
    }

    /* renamed from: a */
    public final void mo27568a() {
        synchronized (this.f61680c) {
            MediaPlayer mediaPlayer = this.f61682e;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                this.f61682e = null;
                AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f61681d;
                if (onAudioFocusChangeListener != null) {
                    this.f61679b.abandonAudioFocus(onAudioFocusChangeListener);
                }
            }
            C2164c cVar = this.f61683f;
            if (cVar != null) {
                cVar.mo5437b((Object) null);
                this.f61683f = null;
            }
        }
    }
}
