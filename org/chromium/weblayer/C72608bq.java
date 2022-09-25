package org.chromium.weblayer;

import android.content.Intent;
import com.google.android.googlequicksearchbox.R;
import org.chromium.p5643b.p5644a.C72335bd;
import org.chromium.p5643b.p5644a.C72343bl;

/* renamed from: org.chromium.weblayer.bq */
/* compiled from: PG */
final class C72608bq extends C72335bd {
    /* renamed from: a */
    public final int mo63794a() {
        return 0;
    }

    /* renamed from: b */
    public final int mo63795b() {
        C72343bl.m106991a();
        return R.id.weblayer_media_session_notification;
    }

    /* renamed from: c */
    public final int mo63796c() {
        C72343bl.m106991a();
        return R.id.weblayer_presentation_api_notification;
    }

    /* renamed from: d */
    public final int mo63797d() {
        C72343bl.m106991a();
        return R.id.weblayer_remote_playback_api_notification;
    }

    /* renamed from: e */
    public final long mo63798e() {
        return C72611bt.f193168c;
    }

    /* renamed from: f */
    public final long mo63799f() {
        return C72611bt.f193169d;
    }

    /* renamed from: g */
    public final long mo63800g() {
        return C72611bt.f193170e;
    }

    /* renamed from: h */
    public final Intent mo63801h() {
        C72343bl.m106991a();
        return new Intent(C72611bt.f193166a, ImageDecoderService.class);
    }

    /* renamed from: i */
    public final Intent mo63802i() {
        C72343bl.m106991a();
        return new Intent(C72611bt.f193166a, BroadcastReceiver.class);
    }

    /* renamed from: j */
    public final Intent mo63803j() {
        C72343bl.m106991a();
        return new Intent(C72611bt.f193166a, MediaSessionService.class);
    }

    /* renamed from: k */
    public final Intent mo63804k() {
        C72343bl.m106991a();
        return new Intent(C72611bt.f193166a, RemoteMediaService.class);
    }
}
