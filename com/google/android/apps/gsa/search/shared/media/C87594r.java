package com.google.android.apps.gsa.search.shared.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.support.p031v4.media.RatingCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.permissions.C91077d;
import com.google.android.apps.gsa.staticplugins.p7884dz.C100321a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.search.shared.media.r */
/* compiled from: PG */
public final class C87594r {

    /* renamed from: a */
    public static final C59071e f236647a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.media.r");

    /* renamed from: f */
    private static final C58495hd f236648f;

    /* renamed from: b */
    public final Context f236649b;

    /* renamed from: c */
    public final C0310l f236650c = new C87588l(this);

    /* renamed from: d */
    SettableFuture f236651d;

    /* renamed from: e */
    public C87593q f236652e;

    /* renamed from: g */
    private final C22871g f236653g;

    /* renamed from: h */
    private final C22871g f236654h;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, C87596t.NONE);
        gzVar.mo55429h(6, C87596t.BUFFERING);
        gzVar.mo55429h(7, C87596t.ERROR);
        gzVar.mo55429h(4, C87596t.FAST_FORWARDING);
        gzVar.mo55429h(2, C87596t.PAUSED);
        gzVar.mo55429h(3, C87596t.PLAYING);
        gzVar.mo55429h(5, C87596t.REWINDING);
        gzVar.mo55429h(10, C87596t.SKIPPING_TO_NEXT);
        gzVar.mo55429h(9, C87596t.SKIPPING_TO_PREVIOUS);
        gzVar.mo55429h(1, C87596t.STOPPED);
        f236648f = gzVar.mo55427f(false);
    }

    public C87594r(Context context, C22871g gVar, C22871g gVar2) {
        this.f236649b = context;
        this.f236653g = gVar;
        this.f236654h = gVar2;
    }

    /* renamed from: i */
    public static void m142385i(String str, C52174hz hzVar, String str2, C58833ax axVar) {
        String str3;
        if (axVar.mo56113h()) {
            if (str2 == null) {
                str2 = "Not found";
            }
            if (hzVar == null) {
                str3 = "No metadata";
            } else {
                Object[] objArr = new Object[2];
                C52568wo woVar = hzVar.f136897d;
                if (woVar == null) {
                    woVar = C52568wo.f137992v;
                }
                C52567wn b = C52567wn.m86649b(woVar.f138003j);
                if (b == null) {
                    b = C52567wn.UNKNOWN;
                }
                objArr[0] = b.name();
                C52568wo woVar2 = hzVar.f136897d;
                if (woVar2 == null) {
                    woVar2 = C52568wo.f137992v;
                }
                objArr[1] = woVar2.f137998e;
                str3 = String.format("%s=%s", objArr);
            }
            C100321a aVar = (C100321a) axVar.mo56107c();
            String format = String.format("MediaOp=%s, %s, Package=%s", new Object[]{str, str3, str2});
            if (aVar.f280539a) {
                aVar.mo91878b().mo91885a("MEDIA_REQUEST", format);
            }
        }
    }

    /* renamed from: a */
    public final MediaController mo81722a(String str, boolean z, boolean z2) {
        Bundle extras;
        List<MediaController> g = mo81728g();
        if (g.isEmpty()) {
            return null;
        }
        MediaController mediaController = (MediaController) g.get(0);
        Iterator it = g.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            MediaController mediaController2 = (MediaController) it.next();
            if (mediaController2.getPlaybackState() != null) {
                PlaybackState playbackState = mediaController2.getPlaybackState();
                playbackState.getClass();
                if (playbackState.getState() == 3 && mediaController2.getPlaybackInfo() != null) {
                    MediaController.PlaybackInfo playbackInfo = mediaController2.getPlaybackInfo();
                    playbackInfo.getClass();
                    if (playbackInfo.getPlaybackType() == 1) {
                        mediaController = mediaController2;
                        break;
                    }
                }
            }
        }
        if (z) {
            mediaController.getTransportControls().pause();
        }
        if (!TextUtils.isEmpty(str)) {
            for (MediaController mediaController3 : g) {
                if (mediaController3.getPackageName().equals(str) && ((extras = mediaController3.getExtras()) == null || !extras.getBoolean("android.media.session.extra.NEED_CONNECT", false))) {
                    ((C59052c) ((C59052c) f236647a.mo56224b()).mo56372aa(9633)).mo56389s("Execute command with the active media controller: %s", str);
                    return mediaController3;
                }
            }
            return null;
        } else if (!z2) {
            return null;
        } else {
            ((C59052c) ((C59052c) f236647a.mo56224b()).mo56372aa(9632)).mo56389s("Execute command with the most active media controller because there's no provider or component name. MediaController package: %s", mediaController.getPackageName());
            return mediaController;
        }
    }

    /* renamed from: b */
    public final RatingCompat mo81723b(C0320v vVar) {
        int a = vVar.mo1033a();
        switch (a) {
            case 1:
                return RatingCompat.m607c(false);
            case 2:
                return RatingCompat.m610f(false);
            case 3:
            case 4:
            case 5:
                return RatingCompat.m609e(a, 0.0f);
            case 6:
                return RatingCompat.m608d(0.0f);
            default:
                ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9634)).mo56386p("#getTargetNegativeRating: Unknown ratingType in current media controller.");
                return null;
        }
    }

    /* renamed from: c */
    public final RatingCompat mo81724c(C0320v vVar) {
        int a = vVar.mo1033a();
        switch (a) {
            case 1:
                return RatingCompat.m607c(true);
            case 2:
                return RatingCompat.m610f(true);
            case 3:
                return RatingCompat.m609e(a, 3.0f);
            case 4:
                return RatingCompat.m609e(a, 4.0f);
            case 5:
                return RatingCompat.m609e(a, 5.0f);
            case 6:
                return RatingCompat.m608d(100.0f);
            default:
                ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9635)).mo56386p("#getTargetPositiveRating: Unknown ratingType in current media controller.");
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C0320v mo81725d(ComponentName componentName, String str) {
        if (componentName == null) {
            return null;
        }
        this.f236651d = new SettableFuture();
        this.f236653g.mo28212l("Connect to MediaBrowserServiceCompat", new C87587k(this, componentName));
        try {
            return (C0320v) C90877ak.m148473g(this.f236651d, 5000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            ((C59052c) ((C59052c) f236647a.mo56225c()).mo56372aa(9636)).mo56351D("The wait for getting media controller has timed out %d from package: %s", System.currentTimeMillis(), str);
            mo81729h();
            return null;
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f236647a.mo56225c()).mo56382g(th)).mo56372aa(9637)).mo56386p("Unexpected exception while waiting for execution result");
            mo81729h();
            return null;
        }
    }

    /* renamed from: e */
    public final Pair mo81726e(ComponentName componentName, String str, boolean z) {
        MediaController a = mo81722a(str, z, componentName == null);
        if (a != null) {
            this.f236651d = new SettableFuture();
            this.f236653g.mo28212l("Convert to MediaControllerCompat", new C87585i(this, a));
            C0320v vVar = null;
            try {
                vVar = (C0320v) C90877ak.m148473g(this.f236651d, 1200, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                ((C59052c) ((C59052c) ((C59052c) f236647a.mo56225c()).mo56382g(e)).mo56372aa(9638)).mo56386p("The wait for converting to MediaControllerCompat timed out.");
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) f236647a.mo56225c()).mo56382g(th)).mo56372aa(9639)).mo56386p("Unexpected exception while converting to MediaControllerCompat");
            }
            if (vVar != null) {
                return Pair.create(vVar, true);
            }
        }
        return Pair.create(mo81725d(componentName, str), false);
    }

    /* renamed from: f */
    public final PlaybackStatus mo81727f() {
        MediaController a = mo81722a((String) null, false, true);
        if (a == null) {
            return null;
        }
        PlaybackState playbackState = a.getPlaybackState();
        if (playbackState == null) {
            ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9642)).mo56389s("MediaController's PlaybackState is null for package: %s", a.getPackageName());
            return null;
        }
        MediaMetadata metadata = a.getMetadata();
        if (metadata == null) {
            ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9641)).mo56389s("MediaController's metadata is null for package: %s", a.getPackageName());
            return null;
        }
        C87596t tVar = (C87596t) f236648f.get(Integer.valueOf(playbackState.getState()));
        if (tVar == null) {
            tVar = C87596t.NONE;
        }
        if (tVar == C87596t.NONE) {
            ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9640)).mo56386p("PlaybackState.getState() is null");
            return null;
        }
        PlaybackStatus playbackStatus = new PlaybackStatus();
        playbackStatus.f236604a = tVar;
        playbackStatus.f236611h = playbackState.getActions();
        playbackStatus.f236609f = a.getPackageName();
        playbackStatus.f236605b = metadata.getString("android.media.metadata.ARTIST");
        playbackStatus.f236606c = metadata.getString("android.media.metadata.TITLE");
        playbackStatus.f236607d = metadata.getString("android.media.metadata.ALBUM");
        playbackStatus.f236610g = metadata.getString("android.media.metadata.DISPLAY_DESCRIPTION");
        playbackStatus.f236612i = a.getRatingType();
        playbackStatus.f236613j = metadata.getLong("android.media.metadata.DURATION");
        playbackStatus.f236614k = playbackState.getPosition();
        playbackStatus.f236615l = metadata.getLong("assistant.api.params.MediaParams.MediaSession.SessionId");
        return playbackStatus;
    }

    /* renamed from: g */
    public final List mo81728g() {
        if (!C91077d.m148794e(this.f236649b, "android.permission.MEDIA_CONTENT_CONTROL")) {
            ((C59052c) ((C59052c) f236647a.mo56225c()).mo56372aa(9644)).mo56386p("Failed to get active media sessions, missing permission of MEDIA_CONTENT_CONTROL.");
            return Collections.emptyList();
        }
        MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f236649b.getSystemService("media_session");
        if (mediaSessionManager != null) {
            return mediaSessionManager.getActiveSessions((ComponentName) null);
        }
        ((C59052c) ((C59052c) f236647a.mo56225c()).mo56372aa(9643)).mo56386p("Failed to get MediaSessionManager");
        return Collections.emptyList();
    }

    /* renamed from: h */
    public final void mo81729h() {
        if (!this.f236651d.isDone() && !(this.f236651d.value instanceof C60873d.C60875b)) {
            this.f236651d.cancel(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo81730j(C0320v vVar) {
        C87589m mVar = new C87589m(this, vVar);
        C60856cj.m92911t(this.f236651d, new C87590n(vVar, mVar), C60826bg.f164896a);
        vVar.mo1040h(mVar, (Handler) null);
        this.f236654h.mo28213m("Timeout runnable to set MediaControllerCompat.", 1000, new C87586j(this, vVar));
    }

    /* renamed from: k */
    public final boolean mo81731k(C0320v vVar, long j) {
        PlaybackStateCompat f = vVar.mo1038f();
        if (f == null) {
            ((C59052c) ((C59052c) f236647a.mo56226d()).mo56372aa(9647)).mo56386p("#isActionSupported: PlaybackState is null.");
            return false;
        } else if ((f.f998e & j) == j) {
            return true;
        } else {
            return false;
        }
    }
}
