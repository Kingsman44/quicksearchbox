package com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b;

import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36910d;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2839a.C36911e;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.C59071e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.assistant.y.g.b.y */
/* compiled from: PG */
public final class C36942y implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* renamed from: a */
    public static final C59071e f96199a = C59071e.m91332i("com.google.android.libraries.search.assistant.y.g.b.y");

    /* renamed from: b */
    public final ConcurrentMap f96200b = new ConcurrentHashMap();

    /* renamed from: c */
    public final C36910d f96201c;

    /* renamed from: d */
    public final C36911e f96202d;

    /* renamed from: e */
    public final C46428ao f96203e;

    /* renamed from: f */
    public MediaSessionManager f96204f;

    public C36942y(MediaSessionManager mediaSessionManager, C46428ao aoVar, C36910d dVar, C36911e eVar) {
        this.f96201c = dVar;
        this.f96202d = eVar;
        this.f96204f = mediaSessionManager;
        this.f96203e = aoVar;
    }

    /* renamed from: a */
    public final void mo40487a(MediaController mediaController) {
        if (mediaController != null) {
            C36941x xVar = new C36941x(mediaController);
            if (this.f96200b.containsKey(xVar)) {
                mediaController.getPackageName();
                return;
            }
            C36940w wVar = new C36940w(this, mediaController);
            this.f96200b.put(xVar, wVar);
            mediaController.registerCallback(wVar, this.f96203e);
        }
    }

    /* renamed from: b */
    public final void mo40488b() {
        for (C36940w wVar : this.f96200b.values()) {
            wVar.f96195a.unregisterCallback(wVar);
        }
        this.f96200b.clear();
    }

    public final void onActiveSessionsChanged(List list) {
        if (list != null) {
            mo40488b();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                mo40487a((MediaController) it.next());
            }
        }
    }
}
