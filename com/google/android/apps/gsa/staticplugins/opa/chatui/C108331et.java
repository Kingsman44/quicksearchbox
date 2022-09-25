package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.media.C87594r;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.et */
/* compiled from: PG */
public final class C108331et extends MediaController.Callback {

    /* renamed from: a */
    public static final C59071e f301342a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.et");

    /* renamed from: b */
    public final Context f301343b;

    /* renamed from: c */
    public final C87594r f301344c;

    /* renamed from: d */
    public final C22871g f301345d;

    /* renamed from: e */
    public final List f301346e = new ArrayList();

    /* renamed from: f */
    public MediaController f301347f;

    /* renamed from: g */
    public boolean f301348g;

    /* renamed from: h */
    public C63088z f301349h;

    /* renamed from: i */
    public String f301350i;

    /* renamed from: j */
    public boolean f301351j;

    /* renamed from: k */
    private final C86124t f301352k;

    /* renamed from: l */
    private final C118827a f301353l;

    public C108331et(Context context, C86124t tVar, C118827a aVar, C87594r rVar, C22871g gVar) {
        this.f301343b = context;
        this.f301352k = tVar;
        this.f301353l = aVar;
        this.f301344c = rVar;
        this.f301345d = gVar;
    }

    /* renamed from: a */
    public final synchronized void mo96792a(C108330es esVar) {
        if (this.f301351j) {
            esVar.mo96791c();
            return;
        }
        this.f301346e.add(esVar);
        this.f301347f = null;
        mo96793b(this.f301345d, 0);
        this.f301353l.mo77944g(C118569b.MEDIA_GLANCEABILITY_CARD_IMPRESSION, C118575h.IRIS_GLANCEABILITY).mo104025g(1);
    }

    /* renamed from: b */
    public final void mo96793b(C22871g gVar, int i) {
        if (this.f301352k.mo79746e(C90066dr.f249700w)) {
            C58976aa aaVar = C58975e.f156826a;
            if (((long) i) >= this.f301352k.mo79743a(C90066dr.f249660C)) {
                this.f301353l.mo77944g(C118569b.MEDIA_GLANCEABILITY_TIME_OUT, C118575h.IRIS_GLANCEABILITY).mo104025g(1);
                this.f301351j = true;
                MediaController mediaController = this.f301347f;
                if (mediaController != null) {
                    mediaController.unregisterCallback(this);
                }
                for (C108330es c : this.f301346e) {
                    c.mo96791c();
                }
                this.f301347f = null;
                this.f301346e.clear();
            } else if (!this.f301346e.isEmpty()) {
                MediaController mediaController2 = this.f301347f;
                if (mediaController2 == null) {
                    gVar.mo28213m("media_initializer", this.f301352k.mo79743a(C90066dr.f249661D), new C108329er(this, gVar, i));
                } else if (!this.f301348g) {
                    mediaController2.registerCallback(this);
                    this.f301348g = true;
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo96794c(String str) {
        this.f301350i = str;
    }

    public final void onMetadataChanged(MediaMetadata mediaMetadata) {
        if (mediaMetadata == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        for (C108330es a : this.f301346e) {
            a.mo96789a(mediaMetadata);
        }
    }

    public final void onPlaybackStateChanged(PlaybackState playbackState) {
        C58976aa aaVar = C58975e.f156826a;
        if (playbackState != null) {
            playbackState.getState();
        }
        if (playbackState != null) {
            for (C108330es b : this.f301346e) {
                b.mo96790b(playbackState);
            }
        }
    }

    public final synchronized void onSessionDestroyed() {
        this.f301351j = true;
        C58976aa aaVar = C58975e.f156826a;
        if (!this.f301346e.isEmpty()) {
            this.f301353l.mo77944g(C118569b.MEDIA_GLANCEABILITY_SESSION_DESTROYED, C118575h.IRIS_GLANCEABILITY).mo104025g(1);
        }
        for (C108330es c : this.f301346e) {
            c.mo96791c();
        }
        MediaController mediaController = this.f301347f;
        if (mediaController != null) {
            mediaController.unregisterCallback(this);
        }
        this.f301347f = null;
        this.f301346e.clear();
    }
}
