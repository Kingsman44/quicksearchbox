package com.google.android.libraries.search.p2904c.p2966s;

import android.media.AudioManager;
import android.media.AudioPlaybackConfiguration;
import android.os.Build;
import android.os.Handler;
import com.google.android.libraries.search.p2904c.C37410bo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.libraries.search.c.s.c */
/* compiled from: PG */
public final class C37970c {

    /* renamed from: a */
    public final AtomicBoolean f100599a = new AtomicBoolean();

    /* renamed from: b */
    private final AudioManager f100600b;

    /* renamed from: c */
    private final boolean f100601c;

    /* renamed from: d */
    private AudioManager.AudioPlaybackCallback f100602d;

    public C37970c(C37410bo boVar, AudioManager audioManager) {
        this.f100600b = audioManager;
        this.f100601c = boVar.f99339h;
    }

    /* renamed from: d */
    private final synchronized void m67028d() {
        if (this.f100602d == null) {
            C37969b bVar = new C37969b(this);
            this.f100602d = bVar;
            this.f100600b.registerAudioPlaybackCallback(bVar, (Handler) null);
            mo41183c(this.f100600b.getActivePlaybackConfigurations());
        }
    }

    /* renamed from: e */
    private final synchronized void m67029e() {
        this.f100599a.set(false);
        AudioManager.AudioPlaybackCallback audioPlaybackCallback = this.f100602d;
        if (audioPlaybackCallback != null) {
            this.f100600b.unregisterAudioPlaybackCallback(audioPlaybackCallback);
            this.f100602d = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41181a() {
        m67029e();
    }

    /* renamed from: b */
    public final synchronized void mo41182b() {
        if (this.f100601c) {
            m67028d();
        }
    }

    /* renamed from: c */
    public final void mo41183c(List list) {
        if (Build.VERSION.SDK_INT < 30) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((AudioPlaybackConfiguration) it.next()).getAudioAttributes().getUsage() == 11) {
                    this.f100599a.set(true);
                    return;
                }
            }
        } else {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AudioPlaybackConfiguration audioPlaybackConfiguration = (AudioPlaybackConfiguration) it2.next();
                if (audioPlaybackConfiguration.getAudioAttributes().getUsage() == 11 && C37968a.m67027a(audioPlaybackConfiguration)) {
                    this.f100599a.set(true);
                    return;
                }
            }
        }
        this.f100599a.set(false);
    }
}
