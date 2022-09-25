package com.google.android.apps.gsa.nga.engine.warmactions.p6248a;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import androidx.core.content.C1882h;
import com.google.android.apps.gsa.assistant.settings.features.p545ag.p547b.C10026c;
import com.google.android.apps.gsa.nga.engine.ag.b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6254f.C79564a;
import com.google.android.apps.gsa.nga.engine.warmactions.p6254f.C79565b;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.gsa.nga.shared.p6328ap.C80987g;
import com.google.android.apps.gsa.nga.shared.p6331aq.p6333b.C81013d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128459c;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128460d;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9722a.C128461e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.a.bj */
/* compiled from: PG */
public final class C79441bj extends C79455m implements MediaSessionManager.OnActiveSessionsChangedListener, C79565b, b {

    /* renamed from: c */
    public static final /* synthetic */ int f218111c = 0;

    /* renamed from: d */
    private static final C58974d f218112d = C58974d.m91136j();

    /* renamed from: b */
    public final ConcurrentHashMap f218113b = new ConcurrentHashMap();

    /* renamed from: e */
    private final Context f218114e;

    /* renamed from: f */
    private final C22871g f218115f;

    /* renamed from: g */
    private final C68214a f218116g;

    public C79441bj(Context context, C68214a aVar, C81013d dVar, C22871g gVar, C68214a aVar2) {
        super(aVar, dVar);
        this.f218114e = context;
        this.f218115f = gVar;
        this.f218116g = aVar2;
    }

    /* renamed from: g */
    private final Optional m127500g() {
        Optional d = ((C80987g) this.f218116g.mo27525b()).mo74767d();
        if (d.isPresent()) {
            d.get();
            for (C79440bi biVar : this.f218113b.keySet()) {
                if (biVar.mo74061b().equals(d.get())) {
                    return Optional.m71637of(biVar);
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: a */
    public final void mo74062a(C79564a aVar) {
        Optional g = m127500g();
        if (!g.isPresent()) {
            ((C58970a) ((C58970a) f218112d.mo56226d()).mo56372aa(5662)).mo56386p("#MWW There are no active media sessions, ignoring action");
            return;
        }
        int i = C79438bg.f218107d;
        MediaController mediaController = ((C79438bg) Objects.requireNonNull((C79438bg) this.f218113b.get(g.get()))).f218109b;
        C79564a aVar2 = C79564a.PLAY;
        switch (aVar.ordinal()) {
            case 0:
                mediaController.getTransportControls().play();
                return;
            case 1:
                mediaController.getTransportControls().pause();
                return;
            case 2:
                mediaController.getTransportControls().skipToNext();
                return;
            case 3:
                mediaController.getTransportControls().skipToPrevious();
                mediaController.getTransportControls().skipToPrevious();
                return;
            case 4:
                mediaController.getTransportControls().stop();
                return;
            case 5:
                mediaController.adjustVolume(1, 1);
                mediaController.adjustVolume(1, 1);
                return;
            case 6:
                mediaController.adjustVolume(-1, 1);
                mediaController.adjustVolume(-1, 1);
                return;
            case 7:
                mediaController.adjustVolume(-100, 1);
                return;
            default:
                throw new IllegalStateException("Unknown action: ".concat(String.valueOf(String.valueOf(aVar))));
        }
    }

    /* renamed from: b */
    public final void mo74063b() {
        mo74064c();
    }

    /* renamed from: c */
    public final synchronized void mo74064c() {
        C128460d dVar = C128460d.STOP;
        Optional g = m127500g();
        if (g.isPresent()) {
            C79438bg bgVar = (C79438bg) Objects.requireNonNull((C79438bg) this.f218113b.get(g.get()));
            PlaybackState playbackState = bgVar.f218109b.getPlaybackState();
            if (playbackState == null || !bgVar.f218108a.contains(Integer.valueOf(playbackState.getState()))) {
                dVar = C128460d.STOP;
            } else {
                dVar = C128460d.START;
            }
        }
        C128459c f = C128461e.m209629f();
        f.mo108446d(C79570b.MEDIA);
        f.mo108445c(dVar);
        mo74077e(f.mo108443a());
    }

    /* renamed from: d */
    public final void mo74053d(C10026c cVar) {
        List list;
        super.mo74053d(cVar);
        MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f218114e.getSystemService("media_session");
        int c = C1882h.m5137c(this.f218114e, "android.permission.MEDIA_CONTENT_CONTROL");
        if (mediaSessionManager == null || c != 0) {
            ((C58970a) ((C58970a) f218112d.mo56225c()).mo56372aa(5657)).mo56386p("#MWW No MEDIA_CONTENT_CONTROL permission.");
            return;
        }
        this.f218115f.mo28212l("Setup MediaSession listener", new C79437bf(this, mediaSessionManager));
        Context context = this.f218114e;
        MediaSessionManager mediaSessionManager2 = (MediaSessionManager) context.getSystemService("media_session");
        int c2 = C1882h.m5137c(context, "android.permission.MEDIA_CONTENT_CONTROL");
        if (mediaSessionManager2 == null || c2 != 0) {
            ((C58970a) ((C58970a) f218112d.mo56225c()).mo56372aa(5656)).mo56386p("#MWW No MEDIA_CONTENT_CONTROL permission.");
            list = C58485gu.m89845m();
        } else {
            list = mediaSessionManager2.getActiveSessions((ComponentName) null);
        }
        if (!list.isEmpty()) {
            onActiveSessionsChanged(list);
        }
    }

    /* renamed from: f */
    public final void mo74065f() {
        if (!this.f218113b.isEmpty()) {
            this.f218113b.clear();
            mo74064c();
        }
        super.mo74065f();
    }

    public final void onActiveSessionsChanged(List list) {
        if (list != null) {
            list.size();
        }
        if (list == null) {
            ((C58970a) ((C58970a) f218112d.mo56225c()).mo56372aa(5661)).mo56386p("#MWW Null instead of list of objects.");
            C128459c f = C128461e.m209629f();
            f.mo108446d(C79570b.MEDIA);
            f.mo108445c(C128460d.STOP);
            mo74077e(f.mo108443a());
            return;
        }
        int size = this.f218113b.size();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaController mediaController = (MediaController) it.next();
            C79451i iVar = new C79451i();
            iVar.mo74059d(mediaController);
            C79440bi a = iVar.mo74056a();
            if (((Boolean) Optional.m71637of(a.mo74061b()).map(C79435bd.f218102a).orElse(false)).booleanValue() && !this.f218113b.containsKey(a)) {
                ((C58970a) ((C58970a) f218112d.mo56224b()).mo56372aa(5660)).mo56354G("#MWW New session: %s/%s", mediaController.getPackageName(), mediaController.getTag());
                C79438bg bgVar = new C79438bg(this, mediaController);
                this.f218115f.mo28212l("Register MediaController callback", new C79436be(mediaController, bgVar));
                this.f218113b.put(a, bgVar);
            }
        }
        if (size != this.f218113b.size()) {
            mo74064c();
        }
    }

    /* renamed from: p */
    public final void mo74067p(Optional optional) {
        if (this.f218133a.get()) {
            mo74064c();
        }
    }
}
