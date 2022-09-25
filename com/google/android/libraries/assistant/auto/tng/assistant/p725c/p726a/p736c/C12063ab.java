package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p736c;

import android.content.ComponentName;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.C12108a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12109a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p741e.p742a.C12110b;
import com.google.android.libraries.assistant.auto.tng.common.permissions.p932a.C13315a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.ab */
/* compiled from: PG */
public final class C12063ab implements C12108a {

    /* renamed from: c */
    private static final C59071e f38620c = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.c.ab");

    /* renamed from: a */
    public final Executor f38621a;

    /* renamed from: b */
    public final C12062aa f38622b = new C12062aa();

    /* renamed from: d */
    private final Context f38623d;

    public C12063ab(Context context, Executor executor) {
        this.f38623d = context;
        this.f38621a = new C60904dr(executor);
    }

    /* renamed from: d */
    private static C58833ax m27952d(MediaController mediaController) {
        if (mediaController == null) {
            return C58836b.f156633a;
        }
        PlaybackState playbackState = mediaController.getPlaybackState();
        if (playbackState == null) {
            ((C59052c) ((C59052c) f38620c.mo56226d()).mo56372aa(43994)).mo56389s("MediaController's PlaybackState is null for package: %s", mediaController.getPackageName());
            return C58836b.f156633a;
        }
        MediaMetadata metadata = mediaController.getMetadata();
        if (metadata == null) {
            ((C59052c) ((C59052c) f38620c.mo56226d()).mo56372aa(43993)).mo56389s("MediaController's metadata is null for package: %s", mediaController.getPackageName());
            return C58836b.f156633a;
        }
        long actions = playbackState.getActions();
        return C58833ax.m90834k(new C12109a(playbackState, metadata.getString("android.media.metadata.ARTIST"), metadata.getString("android.media.metadata.TITLE"), metadata.getString("android.media.metadata.ALBUM"), metadata.getString("android.media.metadata.DISPLAY_DESCRIPTION"), mediaController.getPackageName(), actions, mediaController.getRatingType(), metadata.getLong("android.media.metadata.DURATION"), playbackState.getPosition(), metadata.getLong("assistant.api.params.MediaParams.MediaSession.SessionId")));
    }

    /* renamed from: e */
    private final List m27953e() {
        if (!C13315a.m29571a("android.permission.MEDIA_CONTENT_CONTROL", this.f38623d)) {
            ((C59052c) ((C59052c) f38620c.mo56226d()).mo56372aa(43999)).mo56386p("Failed to get active media sessions, missing permission of MEDIA_CONTENT_CONTROL.");
            return C58485gu.m89845m();
        }
        MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f38623d.getSystemService("media_session");
        if (mediaSessionManager == null) {
            return C58485gu.m89845m();
        }
        return mediaSessionManager.getActiveSessions((ComponentName) null);
    }

    /* renamed from: a */
    public final C58833ax mo20392a() {
        MediaController mediaController;
        List e = m27953e();
        if (!e.isEmpty()) {
            mediaController = (MediaController) e.get(0);
            Iterator it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MediaController mediaController2 = (MediaController) it.next();
                if (mediaController2.getPlaybackState() != null) {
                    PlaybackState playbackState = mediaController2.getPlaybackState();
                    playbackState.getClass();
                    if (playbackState.getState() == 3) {
                        mediaController = mediaController2;
                        break;
                    }
                }
            }
        } else {
            mediaController = null;
        }
        return m27952d(mediaController);
    }

    /* renamed from: b */
    public final C60870cx mo20393b() {
        C12090x xVar = new C12090x(this);
        return C60856cj.m92904m(C47810es.m84978r(xVar), this.f38621a);
    }

    /* renamed from: c */
    public final List mo20394c() {
        ArrayList arrayList = new ArrayList();
        for (MediaController d : m27953e()) {
            C58833ax d2 = m27952d(d);
            if (d2.mo56113h()) {
                arrayList.add((C12110b) d2.mo56107c());
            }
        }
        return arrayList;
    }
}
