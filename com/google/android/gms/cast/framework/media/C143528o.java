package com.google.android.gms.cast.framework.media;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import androidx.core.app.C1813bc;
import androidx.core.app.C1815be;
import androidx.core.app.C1831r;
import androidx.core.app.C1832s;
import androidx.core.app.C1839z;
import androidx.media.p130a.C2402b;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.internal.C143509b;
import com.google.android.gms.cast.framework.media.internal.C143522o;
import com.google.android.gms.cast.framework.p10772a.p10773a.C143390i;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4552o.p4557d.p4558a.C59715c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.o */
/* compiled from: PG */
public final class C143528o extends Service {

    /* renamed from: a */
    public static Runnable f389191a;

    /* renamed from: c */
    private static final C143566ae f389192c = new C143566ae("MediaNotificationService");

    /* renamed from: b */
    public C143527n f389193b;

    /* renamed from: d */
    private NotificationOptions f389194d;

    /* renamed from: e */
    private C143523j f389195e;

    /* renamed from: f */
    private ComponentName f389196f;

    /* renamed from: g */
    private ComponentName f389197g;

    /* renamed from: h */
    private List f389198h = new ArrayList();

    /* renamed from: i */
    private int[] f389199i;

    /* renamed from: j */
    private long f389200j;

    /* renamed from: k */
    private C143509b f389201k;

    /* renamed from: l */
    private ImageHints f389202l;

    /* renamed from: m */
    private Resources f389203m;

    /* renamed from: n */
    private C143526m f389204n;

    /* renamed from: o */
    private NotificationManager f389205o;

    /* renamed from: p */
    private Notification f389206p;

    /* renamed from: q */
    private C143429e f389207q;

    /* renamed from: b */
    public static boolean m233075b(CastOptions castOptions) {
        NotificationOptions notificationOptions;
        int i;
        int length;
        CastMediaOptions castMediaOptions = castOptions.f388834f;
        if (castMediaOptions == null || (notificationOptions = castMediaOptions.f389033c) == null) {
            return false;
        }
        C143505g gVar = notificationOptions.f389052H;
        if (gVar == null) {
            return true;
        }
        List e = C143522o.m233071e(gVar);
        int[] f = C143522o.m233072f(gVar);
        if (e == null) {
            i = 0;
        } else {
            i = e.size();
        }
        if (e == null || e.isEmpty()) {
            f389192c.mo118886d(String.valueOf(C143540x.class.getSimpleName()).concat(" doesn't provide any action."), new Object[0]);
        } else if (e.size() > 5) {
            f389192c.mo118886d(String.valueOf(C143540x.class.getSimpleName()).concat(" provides more than 5 actions."), new Object[0]);
        } else if (f == null || (length = f.length) == 0) {
            f389192c.mo118886d(String.valueOf(C143540x.class.getSimpleName()).concat(" doesn't provide any actions for compact view."), new Object[0]);
        } else {
            int i2 = 0;
            while (i2 < length) {
                int i3 = f[i2];
                if (i3 < 0 || i3 >= i) {
                    f389192c.mo118886d(String.valueOf(C143540x.class.getSimpleName()).concat("provides a compact view action whose index is out of bounds."), new Object[0]);
                } else {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.core.app.C1832s m233076c(java.lang.String r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.hashCode()
            r3 = 2
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r8 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            java.lang.String r9 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            java.lang.String r10 = "com.google.android.gms.cast.framework.action.REWIND"
            r11 = 1
            r12 = 0
            switch(r2) {
                case -1699820260: goto L_0x004d;
                case -945151566: goto L_0x0045;
                case -945080078: goto L_0x003d;
                case -668151673: goto L_0x0035;
                case -124479363: goto L_0x002d;
                case 235550565: goto L_0x0025;
                case 1362116196: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0055
        L_0x001d:
            boolean r2 = r1.equals(r4)
            if (r2 == 0) goto L_0x0055
            r2 = 3
            goto L_0x0056
        L_0x0025:
            boolean r2 = r1.equals(r5)
            if (r2 == 0) goto L_0x0055
            r2 = 0
            goto L_0x0056
        L_0x002d:
            boolean r2 = r1.equals(r6)
            if (r2 == 0) goto L_0x0055
            r2 = 6
            goto L_0x0056
        L_0x0035:
            boolean r2 = r1.equals(r7)
            if (r2 == 0) goto L_0x0055
            r2 = 5
            goto L_0x0056
        L_0x003d:
            boolean r2 = r1.equals(r8)
            if (r2 == 0) goto L_0x0055
            r2 = 2
            goto L_0x0056
        L_0x0045:
            boolean r2 = r1.equals(r9)
            if (r2 == 0) goto L_0x0055
            r2 = 1
            goto L_0x0056
        L_0x004d:
            boolean r2 = r1.equals(r10)
            if (r2 == 0) goto L_0x0055
            r2 = 4
            goto L_0x0056
        L_0x0055:
            r2 = -1
        L_0x0056:
            r13 = 201326592(0xc000000, float:9.8607613E-32)
            java.lang.String r14 = "googlecast-extra_skip_step_ms"
            r15 = 67108864(0x4000000, float:1.5046328E-36)
            switch(r2) {
                case 0: goto L_0x0170;
                case 1: goto L_0x0144;
                case 2: goto L_0x0118;
                case 3: goto L_0x00e9;
                case 4: goto L_0x00ba;
                case 5: goto L_0x0096;
                case 6: goto L_0x006c;
                default: goto L_0x005f;
            }
        L_0x005f:
            com.google.android.gms.cast.internal.ae r2 = f389192c
            java.lang.Object[] r3 = new java.lang.Object[r11]
            r3[r12] = r1
            java.lang.String r1 = "Action: %s is not a pre-defined action."
            r2.mo118886d(r1, r3)
            r1 = 0
            return r1
        L_0x006c:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6)
            android.content.ComponentName r2 = r0.f389196f
            r1.setComponent(r2)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r15)
            androidx.core.app.r r2 = new androidx.core.app.r
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f389194d
            int r4 = r3.f389071s
            android.content.res.Resources r5 = r0.f389203m
            int r3 = r3.f389051G
            java.lang.Object[] r6 = new java.lang.Object[r11]
            java.lang.String r7 = ""
            r6[r12] = r7
            java.lang.String r3 = r5.getString(r3, r6)
            r2.<init>(r4, r3, r1)
            androidx.core.app.s r1 = r2.mo5008a()
            return r1
        L_0x0096:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7)
            android.content.ComponentName r2 = r0.f389196f
            r1.setComponent(r2)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r15)
            androidx.core.app.r r2 = new androidx.core.app.r
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f389194d
            int r4 = r3.f389071s
            android.content.res.Resources r5 = r0.f389203m
            int r3 = r3.f389051G
            java.lang.String r3 = r5.getString(r3)
            r2.<init>(r4, r3, r1)
            androidx.core.app.s r1 = r2.mo5008a()
            return r1
        L_0x00ba:
            long r1 = r0.f389200j
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r10)
            android.content.ComponentName r4 = r0.f389196f
            r3.setComponent(r4)
            r3.putExtra(r14, r1)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r12, r3, r13)
            com.google.android.gms.cast.framework.media.NotificationOptions r4 = r0.f389194d
            int r4 = com.google.android.gms.cast.framework.media.internal.C143522o.m233069c(r4, r1)
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f389194d
            int r1 = com.google.android.gms.cast.framework.media.internal.C143522o.m233070d(r5, r1)
            androidx.core.app.r r2 = new androidx.core.app.r
            android.content.res.Resources r5 = r0.f389203m
            java.lang.String r1 = r5.getString(r1)
            r2.<init>(r4, r1, r3)
            androidx.core.app.s r1 = r2.mo5008a()
            return r1
        L_0x00e9:
            long r1 = r0.f389200j
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r4)
            android.content.ComponentName r4 = r0.f389196f
            r3.setComponent(r4)
            r3.putExtra(r14, r1)
            android.app.PendingIntent r3 = android.app.PendingIntent.getBroadcast(r0, r12, r3, r13)
            com.google.android.gms.cast.framework.media.NotificationOptions r4 = r0.f389194d
            int r4 = com.google.android.gms.cast.framework.media.internal.C143522o.m233067a(r4, r1)
            com.google.android.gms.cast.framework.media.NotificationOptions r5 = r0.f389194d
            int r1 = com.google.android.gms.cast.framework.media.internal.C143522o.m233068b(r5, r1)
            androidx.core.app.r r2 = new androidx.core.app.r
            android.content.res.Resources r5 = r0.f389203m
            java.lang.String r1 = r5.getString(r1)
            r2.<init>(r4, r1, r3)
            androidx.core.app.s r1 = r2.mo5008a()
            return r1
        L_0x0118:
            com.google.android.gms.cast.framework.media.m r1 = r0.f389204n
            boolean r1 = r1.f389188g
            if (r1 == 0) goto L_0x012d
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8)
            android.content.ComponentName r2 = r0.f389196f
            r1.setComponent(r2)
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r15)
            goto L_0x012e
        L_0x012d:
            r15 = 0
        L_0x012e:
            androidx.core.app.r r1 = new androidx.core.app.r
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f389194d
            int r3 = r2.f389064l
            android.content.res.Resources r4 = r0.f389203m
            int r2 = r2.f389078z
            java.lang.String r2 = r4.getString(r2)
            r1.<init>(r3, r2, r15)
            androidx.core.app.s r1 = r1.mo5008a()
            return r1
        L_0x0144:
            com.google.android.gms.cast.framework.media.m r1 = r0.f389204n
            boolean r1 = r1.f389187f
            if (r1 == 0) goto L_0x0159
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r9)
            android.content.ComponentName r2 = r0.f389196f
            r1.setComponent(r2)
            android.app.PendingIntent r15 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r15)
            goto L_0x015a
        L_0x0159:
            r15 = 0
        L_0x015a:
            androidx.core.app.r r1 = new androidx.core.app.r
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f389194d
            int r3 = r2.f389063k
            android.content.res.Resources r4 = r0.f389203m
            int r2 = r2.f389077y
            java.lang.String r2 = r4.getString(r2)
            r1.<init>(r3, r2, r15)
            androidx.core.app.s r1 = r1.mo5008a()
            return r1
        L_0x0170:
            com.google.android.gms.cast.framework.media.m r1 = r0.f389204n
            int r2 = r1.f389184c
            boolean r1 = r1.f389183b
            if (r2 != r3) goto L_0x017f
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f389194d
            int r3 = r2.f389060h
            int r2 = r2.f389074v
            goto L_0x0185
        L_0x017f:
            com.google.android.gms.cast.framework.media.NotificationOptions r2 = r0.f389194d
            int r3 = r2.f389061i
            int r2 = r2.f389075w
        L_0x0185:
            if (r1 != 0) goto L_0x018b
            com.google.android.gms.cast.framework.media.NotificationOptions r3 = r0.f389194d
            int r3 = r3.f389062j
        L_0x018b:
            if (r1 != 0) goto L_0x0191
            com.google.android.gms.cast.framework.media.NotificationOptions r1 = r0.f389194d
            int r2 = r1.f389076x
        L_0x0191:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r5)
            android.content.ComponentName r4 = r0.f389196f
            r1.setComponent(r4)
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r0, r12, r1, r15)
            androidx.core.app.r r4 = new androidx.core.app.r
            android.content.res.Resources r5 = r0.f389203m
            java.lang.String r2 = r5.getString(r2)
            r4.<init>(r3, r2, r1)
            androidx.core.app.s r1 = r4.mo5008a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.C143528o.m233076c(java.lang.String):androidx.core.app.s");
    }

    /* renamed from: d */
    private final void m233077d(C143505g gVar) {
        int[] iArr;
        C1832s sVar;
        int[] f = C143522o.m233072f(gVar);
        if (f == null) {
            iArr = null;
        } else {
            iArr = (int[]) f.clone();
        }
        this.f389199i = iArr;
        List<NotificationAction> e = C143522o.m233071e(gVar);
        this.f389198h = new ArrayList();
        if (e != null) {
            for (NotificationAction notificationAction : e) {
                String str = notificationAction.f389040a;
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    sVar = m233076c(notificationAction.f389040a);
                } else {
                    Intent intent = new Intent(notificationAction.f389040a);
                    intent.setComponent(this.f389196f);
                    sVar = new C1831r(notificationAction.f389041b, notificationAction.f389042c, PendingIntent.getBroadcast(this, 0, intent, 67108864)).mo5008a();
                }
                if (sVar != null) {
                    this.f389198h.add(sVar);
                }
            }
        }
    }

    /* renamed from: e */
    private final void m233078e() {
        this.f389198h = new ArrayList();
        for (String c : this.f389194d.f389055c) {
            C1832s c2 = m233076c(c);
            if (c2 != null) {
                this.f389198h.add(c2);
            }
        }
        int[] iArr = this.f389194d.f389056d;
        this.f389199i = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
    }

    /* renamed from: a */
    public final void mo118823a() {
        if (this.f389204n != null) {
            C143527n nVar = this.f389193b;
            PendingIntent pendingIntent = null;
            Bitmap bitmap = nVar == null ? null : nVar.f389190b;
            C1839z zVar = new C1839z(this, "cast_media_notification");
            zVar.f5688h = bitmap;
            zVar.f5679J.icon = this.f389194d.f389059g;
            zVar.f5685e = C1839z.m5037c(this.f389204n.f389185d);
            zVar.f5686f = C1839z.m5037c(this.f389203m.getString(this.f389194d.f389073u, new Object[]{this.f389204n.f389186e}));
            zVar.mo5015d(2, true);
            zVar.f5691k = false;
            zVar.f5671B = 1;
            ComponentName componentName = this.f389197g;
            if (componentName != null) {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                C1815be beVar = new C1815be(this);
                beVar.mo5004a(intent);
                if (!beVar.f5643a.isEmpty()) {
                    Intent[] intentArr = (Intent[]) beVar.f5643a.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    pendingIntent = C1813bc.m4981a(beVar.f5644b, 1, intentArr, 201326592, (Bundle) null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (pendingIntent != null) {
                zVar.f5687g = pendingIntent;
            }
            C143505g gVar = this.f389194d.f389052H;
            if (gVar != null) {
                f389192c.mo118888f("actionsProvider != null", new Object[0]);
                m233077d(gVar);
            } else {
                f389192c.mo118888f("actionsProvider == null", new Object[0]);
                m233078e();
            }
            for (C1832s f : this.f389198h) {
                zVar.mo5017f(f);
            }
            C2402b bVar = new C2402b();
            int[] iArr = this.f389199i;
            if (iArr != null) {
                bVar.f6642a = iArr;
            }
            MediaSessionCompat.Token token = this.f389204n.f389182a;
            if (token != null) {
                bVar.f6643b = token;
            }
            zVar.mo5022k(bVar);
            Notification a = zVar.mo5013a();
            this.f389206p = a;
            startForeground(1, a);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        this.f389205o = (NotificationManager) getSystemService("notification");
        C143429e f = C143429e.m232798f(this);
        this.f389207q = f;
        CastMediaOptions castMediaOptions = f.mo118636c().f388834f;
        C143919bh.m233958a(castMediaOptions);
        NotificationOptions notificationOptions = castMediaOptions.f389033c;
        C143919bh.m233958a(notificationOptions);
        this.f389194d = notificationOptions;
        this.f389195e = castMediaOptions.mo118725a();
        this.f389203m = getResources();
        this.f389196f = new ComponentName(getApplicationContext(), castMediaOptions.f389031a);
        if (!TextUtils.isEmpty(this.f389194d.f389058f)) {
            this.f389197g = new ComponentName(getApplicationContext(), this.f389194d.f389058f);
        } else {
            this.f389197g = null;
        }
        NotificationOptions notificationOptions2 = this.f389194d;
        this.f389200j = notificationOptions2.f389057e;
        int dimensionPixelSize = this.f389203m.getDimensionPixelSize(notificationOptions2.f389072t);
        this.f389202l = new ImageHints(1, dimensionPixelSize, dimensionPixelSize);
        this.f389201k = new C143509b(getApplicationContext(), this.f389202l);
        NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", getResources().getString(R.string.media_notification_channel_name), 2);
        notificationChannel.setShowBadge(false);
        this.f389205o.createNotificationChannel(notificationChannel);
        C143390i.m232669e(C59715c.CAF_NOTIFICATION_SERVICE);
    }

    public final void onDestroy() {
        C143509b bVar = this.f389201k;
        if (bVar != null) {
            bVar.mo118808a();
            bVar.f389142d = null;
        }
        f389191a = null;
        this.f389205o.cancel(1);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        WebImage webImage;
        C143526m mVar;
        Intent intent2 = intent;
        MediaInfo mediaInfo = (MediaInfo) intent2.getParcelableExtra("extra_media_info");
        C143919bh.m233958a(mediaInfo);
        MediaMetadata mediaMetadata = mediaInfo.f388637d;
        C143919bh.m233958a(mediaMetadata);
        int intExtra = intent2.getIntExtra("extra_remote_media_client_player_state", 0);
        CastDevice castDevice = (CastDevice) intent2.getParcelableExtra("extra_cast_device");
        C143919bh.m233958a(castDevice);
        C143526m mVar2 = new C143526m(intExtra == 2, mediaInfo.f388635b, mediaMetadata.mo118414a("com.google.android.gms.cast.metadata.TITLE"), castDevice.f388602d, (MediaSessionCompat.Token) intent2.getParcelableExtra("extra_media_session_token"), intent2.getBooleanExtra("extra_can_skip_next", false), intent2.getBooleanExtra("extra_can_skip_prev", false));
        if (intent2.getBooleanExtra("extra_media_notification_force_update", false) || (mVar = this.f389204n) == null || mVar2.f389183b != mVar.f389183b || mVar2.f389184c != mVar.f389184c || !C143596v.m233278k(mVar2.f389185d, mVar.f389185d) || !C143596v.m233278k(mVar2.f389186e, mVar.f389186e) || mVar2.f389187f != mVar.f389187f || mVar2.f389188g != mVar.f389188g) {
            this.f389204n = mVar2;
            mo118823a();
        }
        if (this.f389195e != null) {
            int i3 = this.f389202l.f389037a;
            webImage = C143523j.m233073a(mediaMetadata);
        } else {
            webImage = mediaMetadata.mo118418e() ? (WebImage) mediaMetadata.f388672b.get(0) : null;
        }
        C143527n nVar = new C143527n(webImage);
        C143527n nVar2 = this.f389193b;
        if (nVar2 == null || !C143596v.m233278k(nVar.f389189a, nVar2.f389189a)) {
            C143509b bVar = this.f389201k;
            bVar.f389142d = new C143525l(this, nVar);
            bVar.mo118809b(nVar.f389189a);
        }
        startForeground(1, this.f389206p);
        f389191a = new C143524k(this, i2);
        return 2;
    }
}
