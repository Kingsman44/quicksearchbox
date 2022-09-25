package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.m */
/* compiled from: PG */
public final class C36030m {

    /* renamed from: a */
    public static final C59071e f94252a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.g.a.m");

    /* renamed from: b */
    public final Context f94253b;

    public C36030m(Context context) {
        this.f94253b = context;
    }

    /* renamed from: a */
    public final boolean mo39947a() {
        return this.f94253b.checkSelfPermission("android.permission.MEDIA_CONTENT_CONTROL") == 0;
    }

    /* renamed from: b */
    public final MediaController mo39948b() {
        if (!mo39947a()) {
            ((C59052c) ((C59052c) f94252a.mo56226d()).mo56372aa(52163)).mo56386p("Do not have MEDIA_CONTENT_CONTROL permission.");
            return null;
        }
        MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f94253b.getSystemService("media_session");
        if (mediaSessionManager == null) {
            ((C59052c) ((C59052c) f94252a.mo56226d()).mo56372aa(52162)).mo56386p("Could not find MEDIA_SESSION_SERVICE.");
            return null;
        }
        List<MediaController> activeSessions = mediaSessionManager.getActiveSessions((ComponentName) null);
        if (activeSessions.isEmpty()) {
            ((C59052c) ((C59052c) f94252a.mo56224b()).mo56372aa(52161)).mo56386p("There are no active sessions.");
            return null;
        }
        MediaController mediaController = activeSessions.get(0);
        for (MediaController next : activeSessions) {
            if (next.getPlaybackState() != null) {
                PlaybackState playbackState = next.getPlaybackState();
                playbackState.getClass();
                if (playbackState.getState() == 3 && next.getPlaybackInfo() != null) {
                    MediaController.PlaybackInfo playbackInfo = next.getPlaybackInfo();
                    playbackInfo.getClass();
                    if (playbackInfo.getPlaybackType() == 1) {
                        return next;
                    }
                }
            }
        }
        return mediaController;
    }
}
