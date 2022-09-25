package com.google.android.libraries.search.p2904c.p2952o.p2957d.p2958a;

import android.media.AudioManager;
import android.os.Handler;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37918a;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37932e;
import com.google.android.libraries.search.p2904c.p2952o.p2957d.C37933f;
import com.google.android.libraries.search.p2904c.p2964r.C37957a;
import com.google.common.util.concurrent.C60836bq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.c.o.d.a.j */
/* compiled from: PG */
public final class C37928j implements C37933f {

    /* renamed from: a */
    public final Executor f100528a;

    /* renamed from: b */
    public final C37957a f100529b;

    /* renamed from: c */
    public final Object f100530c = new Object();

    /* renamed from: d */
    public final C60836bq f100531d = new C60836bq();

    /* renamed from: e */
    public final Set f100532e = new HashSet();

    /* renamed from: f */
    public C37932e f100533f = C37932e.f100542b;

    /* renamed from: g */
    public final Map f100534g = new HashMap();

    /* renamed from: h */
    private final AudioManager f100535h;

    /* renamed from: i */
    private final Optional f100536i;

    public C37928j(Executor executor, AudioManager audioManager, C37957a aVar) {
        this.f100528a = executor;
        this.f100535h = audioManager;
        this.f100529b = aVar;
        this.f100536i = Optional.m71637of(new C37927i(this));
    }

    /* renamed from: a */
    public final void mo41156a(C37918a aVar) {
        synchronized (this.f100530c) {
            if (this.f100532e.isEmpty() && this.f100536i.isPresent()) {
                this.f100535h.registerAudioRecordingCallback((AudioManager.AudioRecordingCallback) this.f100536i.get(), (Handler) null);
            }
            this.f100532e.add(aVar);
        }
    }

    /* renamed from: b */
    public final void mo41157b(C37918a aVar) {
        synchronized (this.f100530c) {
            this.f100532e.remove(aVar);
            this.f100534g.remove(aVar);
            if (this.f100532e.isEmpty() && this.f100536i.isPresent()) {
                this.f100535h.unregisterAudioRecordingCallback((AudioManager.AudioRecordingCallback) this.f100536i.get());
            }
        }
    }
}
