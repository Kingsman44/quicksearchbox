package com.google.android.apps.gsa.staticplugins.bisto.util;

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.view.KeyEvent;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.an */
/* compiled from: PG */
public final class C96456an implements MediaSessionManager.OnActiveSessionsChangedListener {

    /* renamed from: a */
    public static final C59071e f269836a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.an");

    /* renamed from: b */
    public final ConcurrentHashMap f269837b = new ConcurrentHashMap();

    /* renamed from: c */
    public final AtomicReference f269838c = new AtomicReference();

    /* renamed from: d */
    public C60870cx f269839d;

    /* renamed from: e */
    private final Context f269840e;

    /* renamed from: f */
    private final C22871g f269841f;

    /* renamed from: g */
    private final AudioManager f269842g;

    /* renamed from: h */
    private final boolean f269843h;

    /* renamed from: i */
    private final AtomicBoolean f269844i = new AtomicBoolean();

    /* renamed from: j */
    private final String f269845j;

    public C96456an(Context context, C22871g gVar, boolean z, String str) {
        this.f269840e = context;
        this.f269841f = gVar;
        this.f269842g = (AudioManager) context.getSystemService("audio");
        this.f269843h = z;
        this.f269845j = str;
    }

    /* renamed from: h */
    public static boolean m159805h(PlaybackState playbackState) {
        if (playbackState == null) {
            return false;
        }
        int state = playbackState.getState();
        return state == 6 || state == 8 || state == 4 || state == 5 || state == 10 || state == 9 || state == 3 || state == 11;
    }

    /* renamed from: k */
    private final KeyEvent m159806k(int i, int i2) {
        KeyEvent keyEvent = new KeyEvent(i, i2);
        return this.f269843h ? KeyEvent.changeFlags(keyEvent, 1073741824) : keyEvent;
    }

    /* renamed from: l */
    private final void m159807l() {
        this.f269841f.mo28212l("cancel-pause", new C96453ak(this));
    }

    /* renamed from: m */
    private final void m159808m(int i) {
        C58976aa aaVar = C58975e.f156826a;
        KeyEvent.keyCodeToString(i);
        this.f269842g.dispatchMediaKeyEvent(m159806k(0, i));
        this.f269842g.dispatchMediaKeyEvent(m159806k(1, i));
    }

    /* renamed from: n */
    private final boolean m159809n(MediaController mediaController, int i) {
        C58976aa aaVar = C58975e.f156826a;
        KeyEvent.keyCodeToString(i);
        if (!mediaController.dispatchMediaButtonEvent(m159806k(0, i)) || !mediaController.dispatchMediaButtonEvent(m159806k(1, i))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final Boolean mo90140a() {
        Integer num = null;
        if (!this.f269844i.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return null;
        }
        MediaController mediaController = (MediaController) this.f269838c.get();
        if (mediaController == null) {
            C59104x b = f269836a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17155)).mo56386p("No active session");
            return false;
        }
        PlaybackState playbackState = mediaController.getPlaybackState();
        C59104x b2 = f269836a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "MediaHandler");
        C59052c cVar = (C59052c) ((C59052c) b2).mo56372aa(17154);
        if (playbackState != null) {
            num = Integer.valueOf(playbackState.getState());
        }
        cVar.mo56389s("Current state: %d", num);
        return Boolean.valueOf(m159805h(playbackState));
    }

    /* renamed from: b */
    public final void mo90141b() {
        m159807l();
        if (!this.f269844i.getAndSet(false)) {
            this.f269838c.set((Object) null);
            this.f269837b.clear();
            return;
        }
        ((MediaSessionManager) this.f269840e.getSystemService("media_session")).removeOnActiveSessionsChangedListener(this);
        this.f269838c.set((Object) null);
        for (C96454al alVar : this.f269837b.values()) {
            alVar.f269832a.unregisterCallback(alVar);
        }
        this.f269837b.clear();
    }

    /* renamed from: c */
    public final void mo90142c() {
        MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f269840e.getSystemService("media_session");
        List<MediaController> list = null;
        if (C1882h.m5137c(this.f269840e, "android.permission.MEDIA_CONTENT_CONTROL") == 0) {
            mediaSessionManager.addOnActiveSessionsChangedListener(this, (ComponentName) null);
        } else if (C36619a.m65148d(this.f269840e)) {
            mediaSessionManager.addOnActiveSessionsChangedListener(this, C83395k.m132730a(this.f269845j));
        } else {
            C59104x b = f269836a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17158)).mo56386p("No media permission");
            this.f269844i.set(false);
            return;
        }
        this.f269844i.set(true);
        Context context = this.f269840e;
        String str = this.f269845j;
        MediaSessionManager mediaSessionManager2 = (MediaSessionManager) context.getSystemService("media_session");
        if (C1882h.m5137c(context, "android.permission.MEDIA_CONTENT_CONTROL") == 0) {
            list = mediaSessionManager2.getActiveSessions((ComponentName) null);
        } else if (C36619a.m65148d(context)) {
            list = mediaSessionManager2.getActiveSessions(C83395k.m132730a(str));
        }
        onActiveSessionsChanged(list);
    }

    /* renamed from: d */
    public final void mo90143d() {
        m159808m(126);
        m159807l();
    }

    /* renamed from: e */
    public final void mo90144e() {
        if (this.f269844i.get()) {
            MediaController mediaController = (MediaController) this.f269838c.get();
            if (mediaController == null || m159805h(mediaController.getPlaybackState())) {
                C58976aa aaVar = C58975e.f156826a;
                return;
            }
            m159809n(mediaController, 126);
            m159807l();
        }
    }

    /* renamed from: f */
    public final void mo90145f() {
        m159808m(87);
        m159807l();
    }

    /* renamed from: g */
    public final void mo90146g() {
        m159808m(88);
        m159807l();
    }

    /* renamed from: i */
    public final boolean mo90147i() {
        if (!this.f269844i.get()) {
            return false;
        }
        MediaController mediaController = (MediaController) this.f269838c.get();
        if (mediaController != null && m159805h(mediaController.getPlaybackState())) {
            return m159809n(mediaController, 127);
        }
        C58976aa aaVar = C58975e.f156826a;
        return false;
    }

    /* renamed from: j */
    public final boolean mo90148j(int i, boolean z) {
        MediaController mediaController;
        if (!z) {
            m159808m(i);
            return true;
        }
        if (this.f269844i.get() && (mediaController = (MediaController) this.f269838c.get()) != null && m159805h(mediaController.getPlaybackState())) {
            C59104x b = f269836a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaHandler");
            ((C59052c) ((C59052c) b).mo56372aa(17165)).mo56386p("Session was paused but is active");
            this.f269839d = this.f269841f.mo28208h("check-session", 1000, new C96452aj(this, mediaController));
        }
        return false;
    }

    public final void onActiveSessionsChanged(List list) {
        C58976aa aaVar = C58975e.f156826a;
        if (list != null) {
            list.size();
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaController mediaController = (MediaController) it.next();
                C96455am amVar = new C96455am(mediaController);
                if (!this.f269837b.containsKey(amVar)) {
                    C96454al alVar = new C96454al(this, mediaController);
                    mediaController.registerCallback(alVar);
                    alVar.onPlaybackStateChanged(mediaController.getPlaybackState());
                    this.f269837b.put(amVar, alVar);
                }
            }
        }
    }
}
