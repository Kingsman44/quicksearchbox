package com.google.android.libraries.assistant.p1363c.p1364a.p1365a.p1366a;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.support.p031v4.media.session.MediaSessionCompat;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16940c;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16941d;
import com.google.android.libraries.assistant.p1363c.p1364a.p1365a.C16943f;
import com.google.android.libraries.assistant.p1363c.p1364a.p1368b.C16946a;
import com.google.android.libraries.assistant.p1363c.p1364a.p1370c.C16992p;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Map;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.c.a.a.a.e */
/* compiled from: PG */
public final class C16937e implements C16943f {

    /* renamed from: b */
    private static final C59071e f49487b = C59071e.m91332i("com.google.android.libraries.assistant.c.a.a.a.e");

    /* renamed from: a */
    public final Map f49488a = new ConcurrentHashMap();

    /* renamed from: c */
    private final Context f49489c;

    /* renamed from: d */
    private final Executor f49490d;

    /* renamed from: e */
    private final C16934b f49491e;

    /* renamed from: f */
    private final NotificationManager f49492f;

    public C16937e(Context context, Executor executor, C16934b bVar, NotificationManager notificationManager) {
        this.f49489c = context;
        this.f49490d = executor;
        this.f49491e = bVar;
        this.f49492f = notificationManager;
    }

    /* renamed from: a */
    public final synchronized C16941d mo23106a(C16940c cVar) {
        C16933a aVar;
        C58838bb.m90869d(cVar.mo23129p() != 2, "Invalid Logging Source");
        String i = cVar.mo23123i();
        String h = cVar.mo23122h();
        String string = this.f49489c.getResources().getString(R.string.assistant_media_player_notification_channel);
        NotificationChannel notificationChannel = this.f49492f.getNotificationChannel(h);
        if (notificationChannel == null || !string.contentEquals(notificationChannel.getName())) {
            NotificationChannel notificationChannel2 = new NotificationChannel(h, string, 2);
            notificationChannel2.enableLights(false);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setLockscreenVisibility(1);
            this.f49492f.createNotificationChannel(notificationChannel2);
        }
        aVar = (C16933a) this.f49488a.get(i);
        if (aVar == null) {
            C59104x b = f49487b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "AMPManager");
            ((C59052c) ((C59052c) b).mo56372aa(42566)).mo56389s("Creating media session with identifier: %s", i);
            MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(cVar.mo23116b(), "AssistantMediaPlayer: ".concat(String.valueOf(cVar.mo23123i())), (ComponentName) null, (PendingIntent) null);
            C16934b bVar = this.f49491e;
            C16935c cVar2 = new C16935c(this, cVar);
            cVar.getClass();
            C16946a aVar2 = (C16946a) bVar.f49482a.mo17428b();
            aVar2.getClass();
            C16933a aVar3 = new C16933a(cVar, mediaSessionCompat, aVar2, cVar2);
            aVar3.mo23103m();
            this.f49488a.put(i, aVar3);
            aVar = aVar3;
        }
        C59071e eVar = f49487b;
        C59104x b2 = eVar.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AMPManager");
        ((C59052c) ((C59052c) b2).mo56372aa(42564)).mo56354G("Media session with identifier: %s, MediaSession: %s", i, aVar);
        int p = cVar.mo23129p();
        int p2 = aVar.f49477a.mo23129p();
        if (p == 0) {
            throw null;
        } else if (p != p2) {
            C59104x c = eVar.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AMPManager");
            C59052c cVar3 = (C59052c) ((C59052c) c).mo56372aa(42565);
            int p3 = cVar.mo23129p();
            String a = C16992p.m34085a(p3);
            if (p3 != 0) {
                int p4 = aVar.f49477a.mo23129p();
                String a2 = C16992p.m34085a(p4);
                if (p4 != 0) {
                    cVar3.mo56354G("Fetching another session however the logging source is different: %s and %s", a, a2);
                    throw new IllegalArgumentException("The session identifier already exist with a different source");
                }
                throw null;
            }
            throw null;
        }
        return aVar;
    }

    /* renamed from: b */
    public final C60870cx mo23107b(C16940c cVar) {
        return C60856cj.m92904m(C47810es.m84978r(new C16936d(this, cVar)), this.f49490d);
    }

    /* renamed from: c */
    public final Optional mo23108c() {
        return Optional.ofNullable((C16941d) this.f49488a.get("AMP-fa-audio-recorder-session-identifier"));
    }
}
