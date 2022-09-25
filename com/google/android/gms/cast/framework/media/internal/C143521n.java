package com.google.android.gms.cast.framework.media.internal;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p031v4.media.C0329x;
import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0286ac;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.C0324z;
import android.support.p031v4.media.session.MediaSessionCompat;
import android.support.p031v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaQueueItem;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.C143406an;
import com.google.android.gms.cast.framework.C143410ar;
import com.google.android.gms.cast.framework.C143429e;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.internal.C143461y;
import com.google.android.gms.cast.framework.media.C143484aq;
import com.google.android.gms.cast.framework.media.C143500bf;
import com.google.android.gms.cast.framework.media.C143505g;
import com.google.android.gms.cast.framework.media.C143523j;
import com.google.android.gms.cast.framework.media.C143528o;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.media.NotificationAction;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.C143566ae;
import com.google.android.gms.common.images.WebImage;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.internal.n */
/* compiled from: PG */
public final class C143521n {

    /* renamed from: a */
    public static final C143566ae f389155a = new C143566ae("MediaSessionManager");

    /* renamed from: b */
    public final Context f389156b;

    /* renamed from: c */
    public final CastOptions f389157c;

    /* renamed from: d */
    public final C143461y f389158d;

    /* renamed from: e */
    public final C143410ar f389159e;

    /* renamed from: f */
    public final NotificationOptions f389160f;

    /* renamed from: g */
    public final ComponentName f389161g;

    /* renamed from: h */
    public final C143509b f389162h;

    /* renamed from: i */
    public final C143509b f389163i;

    /* renamed from: j */
    public final C143484aq f389164j;

    /* renamed from: k */
    public C143500bf f389165k;

    /* renamed from: l */
    public CastDevice f389166l;

    /* renamed from: m */
    public MediaSessionCompat f389167m;

    /* renamed from: n */
    public C0324z f389168n;

    /* renamed from: o */
    public boolean f389169o;

    /* renamed from: p */
    private final ComponentName f389170p;

    /* renamed from: q */
    private final Handler f389171q;

    /* renamed from: r */
    private final Runnable f389172r;

    /* renamed from: s */
    private PlaybackStateCompat.CustomAction f389173s;

    /* renamed from: t */
    private PlaybackStateCompat.CustomAction f389174t;

    /* renamed from: u */
    private PlaybackStateCompat.CustomAction f389175u;

    /* renamed from: v */
    private PlaybackStateCompat.CustomAction f389176v;

    public C143521n(Context context, CastOptions castOptions, C143461y yVar) {
        NotificationOptions notificationOptions;
        String str;
        String str2;
        this.f389156b = context;
        this.f389157c = castOptions;
        this.f389158d = yVar;
        C143429e a = C143429e.m232795a();
        ComponentName componentName = null;
        this.f389159e = a != null ? a.mo118637d() : null;
        CastMediaOptions castMediaOptions = castOptions.f388834f;
        if (castMediaOptions == null) {
            notificationOptions = null;
        } else {
            notificationOptions = castMediaOptions.f389033c;
        }
        this.f389160f = notificationOptions;
        this.f389164j = new C143520m(this);
        if (castMediaOptions == null) {
            str = null;
        } else {
            str = castMediaOptions.f389032b;
        }
        this.f389170p = !TextUtils.isEmpty(str) ? new ComponentName(context, str) : null;
        if (castMediaOptions == null) {
            str2 = null;
        } else {
            str2 = castMediaOptions.f389031a;
        }
        this.f389161g = !TextUtils.isEmpty(str2) ? new ComponentName(context, str2) : componentName;
        C143509b bVar = new C143509b(context);
        this.f389162h = bVar;
        bVar.f389142d = new C143517j(this);
        C143509b bVar2 = new C143509b(context);
        this.f389163i = bVar2;
        bVar2.f389142d = new C143518k(this);
        this.f389171q = new C144861c(Looper.getMainLooper());
        this.f389172r = new C143516i(this);
    }

    /* renamed from: a */
    public static Bitmap m233054a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = (float) width;
        int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
        float f2 = ((float) (i - height)) / 2.0f;
        RectF rectF = new RectF(0.0f, f2, f, ((float) height) + f2);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b3  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long m233055h(java.lang.String r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            r1 = -945151566(0xffffffffc7aa21b2, float:-87107.39)
            r2 = -1
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x002b
            r1 = -945080078(0xffffffffc7ab38f2, float:-87665.89)
            if (r0 == r1) goto L_0x0021
            r1 = 235550565(0xe0a3765, float:1.7036485E-30)
            if (r0 == r1) goto L_0x0017
            goto L_0x0035
        L_0x0017:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = 0
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_PREV"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = 1
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "com.google.android.gms.cast.framework.action.SKIP_NEXT"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0035
            r8 = 2
            goto L_0x0036
        L_0x0035:
            r8 = -1
        L_0x0036:
            if (r8 == 0) goto L_0x00b3
            r0 = 0
            if (r8 == r4) goto L_0x007c
            if (r8 == r3) goto L_0x0040
            goto L_0x00bf
        L_0x0040:
            com.google.android.gms.cast.framework.media.bf r8 = r7.f389165k
            if (r8 == 0) goto L_0x0076
            boolean r9 = r8.mo118793u()
            if (r9 != 0) goto L_0x004b
            goto L_0x0076
        L_0x004b:
            com.google.android.gms.cast.MediaStatus r8 = r8.mo118781i()
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)
            r5 = 64
            boolean r9 = r8.mo118438e(r5)
            r5 = 32
            if (r9 == 0) goto L_0x005e
        L_0x005c:
            r0 = r5
            goto L_0x00bf
        L_0x005e:
            int r9 = r8.f388714p
            if (r9 != 0) goto L_0x005c
            int r9 = r8.f388701c
            java.lang.Integer r9 = r8.mo118437d(r9)
            if (r9 == 0) goto L_0x0076
            int r9 = r9.intValue()
            int r8 = r8.mo118435b()
            int r8 = r8 + r2
            if (r9 >= r8) goto L_0x0076
            goto L_0x005c
        L_0x0076:
            java.lang.String r8 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT"
            r10.putBoolean(r8, r4)
            return r0
        L_0x007c:
            com.google.android.gms.cast.framework.media.bf r8 = r7.f389165k
            if (r8 == 0) goto L_0x00ad
            boolean r9 = r8.mo118793u()
            if (r9 != 0) goto L_0x0087
            goto L_0x00ad
        L_0x0087:
            com.google.android.gms.cast.MediaStatus r8 = r8.mo118781i()
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)
            r2 = 128(0x80, double:6.32E-322)
            boolean r9 = r8.mo118438e(r2)
            r2 = 16
            if (r9 == 0) goto L_0x009a
        L_0x0098:
            r0 = r2
            goto L_0x00bf
        L_0x009a:
            int r9 = r8.f388714p
            if (r9 != 0) goto L_0x0098
            int r9 = r8.f388701c
            java.lang.Integer r8 = r8.mo118437d(r9)
            if (r8 == 0) goto L_0x00ad
            int r8 = r8.intValue()
            if (r8 <= 0) goto L_0x00ad
            goto L_0x0098
        L_0x00ad:
            java.lang.String r8 = "android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS"
            r10.putBoolean(r8, r4)
            return r0
        L_0x00b3:
            r8 = 3
            if (r9 != r8) goto L_0x00bb
            r9 = 514(0x202, double:2.54E-321)
            r0 = r9
            r9 = 3
            goto L_0x00bd
        L_0x00bb:
            r0 = 512(0x200, double:2.53E-321)
        L_0x00bd:
            if (r9 == r3) goto L_0x00c0
        L_0x00bf:
            return r0
        L_0x00c0:
            r8 = 516(0x204, double:2.55E-321)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.C143521n.m233055h(java.lang.String, int, android.os.Bundle):long");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m233057j(android.support.p031v4.media.session.C0298ao r13, java.lang.String r14, com.google.android.gms.cast.framework.media.NotificationAction r15) {
        /*
            r12 = this;
            int r0 = r14.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            java.lang.String r4 = "com.google.android.gms.cast.framework.action.FORWARD"
            java.lang.String r5 = "com.google.android.gms.cast.framework.action.DISCONNECT"
            java.lang.String r6 = "com.google.android.gms.cast.framework.action.STOP_CASTING"
            java.lang.String r7 = "com.google.android.gms.cast.framework.action.REWIND"
            switch(r0) {
                case -1699820260: goto L_0x002b;
                case -668151673: goto L_0x0023;
                case -124479363: goto L_0x001b;
                case 1362116196: goto L_0x0013;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x0033
        L_0x0013:
            boolean r0 = r14.equals(r4)
            if (r0 == 0) goto L_0x0033
            r0 = 0
            goto L_0x0034
        L_0x001b:
            boolean r0 = r14.equals(r5)
            if (r0 == 0) goto L_0x0033
            r0 = 3
            goto L_0x0034
        L_0x0023:
            boolean r0 = r14.equals(r6)
            if (r0 == 0) goto L_0x0033
            r0 = 2
            goto L_0x0034
        L_0x002b:
            boolean r0 = r14.equals(r7)
            if (r0 == 0) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = -1
        L_0x0034:
            java.lang.String r8 = "You must specify an icon resource id to build a CustomAction"
            java.lang.String r9 = "You must specify a name to build a CustomAction"
            java.lang.String r10 = "You must specify an action to build a CustomAction"
            r11 = 0
            if (r0 == 0) goto L_0x0146
            if (r0 == r3) goto L_0x00fd
            if (r0 == r2) goto L_0x00b7
            if (r0 == r1) goto L_0x0071
            if (r15 == 0) goto L_0x018e
            java.lang.String r0 = r15.f389042c
            int r15 = r15.f389041b
            boolean r1 = android.text.TextUtils.isEmpty(r14)
            if (r1 != 0) goto L_0x006b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0065
            if (r15 == 0) goto L_0x005f
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r1 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r1.<init>(r14, r0, r15, r11)
            r11 = r1
            goto L_0x018e
        L_0x005f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r8)
            throw r13
        L_0x0065:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r9)
            throw r13
        L_0x006b:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r10)
            throw r13
        L_0x0071:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r14 = r12.f389176v
            if (r14 != 0) goto L_0x00b3
            com.google.android.gms.cast.framework.media.NotificationOptions r14 = r12.f389160f
            if (r14 == 0) goto L_0x00b3
            android.content.Context r14 = r12.f389156b
            android.content.res.Resources r14 = r14.getResources()
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = r15.f389051G
            java.lang.String r14 = r14.getString(r15)
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = r15.f389071s
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00ad
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x00a7
            if (r15 == 0) goto L_0x00a1
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r0.<init>(r5, r14, r15, r11)
            r12.f389176v = r0
            goto L_0x00b3
        L_0x00a1:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r8)
            throw r13
        L_0x00a7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r9)
            throw r13
        L_0x00ad:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r10)
            throw r13
        L_0x00b3:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r11 = r12.f389176v
            goto L_0x018e
        L_0x00b7:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r14 = r12.f389175u
            if (r14 != 0) goto L_0x00f9
            com.google.android.gms.cast.framework.media.NotificationOptions r14 = r12.f389160f
            if (r14 == 0) goto L_0x00f9
            android.content.Context r14 = r12.f389156b
            android.content.res.Resources r14 = r14.getResources()
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = r15.f389051G
            java.lang.String r14 = r14.getString(r15)
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = r15.f389071s
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x00f3
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x00ed
            if (r15 == 0) goto L_0x00e7
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r0.<init>(r6, r14, r15, r11)
            r12.f389175u = r0
            goto L_0x00f9
        L_0x00e7:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r8)
            throw r13
        L_0x00ed:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r9)
            throw r13
        L_0x00f3:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r10)
            throw r13
        L_0x00f9:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r11 = r12.f389175u
            goto L_0x018e
        L_0x00fd:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r14 = r12.f389174t
            if (r14 != 0) goto L_0x0143
            com.google.android.gms.cast.framework.media.NotificationOptions r14 = r12.f389160f
            if (r14 == 0) goto L_0x0143
            long r0 = r14.f389057e
            int r14 = com.google.android.gms.cast.framework.media.internal.C143522o.m233070d(r14, r0)
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = com.google.android.gms.cast.framework.media.internal.C143522o.m233069c(r15, r0)
            android.content.Context r0 = r12.f389156b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r14 = r0.getString(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x013d
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0137
            if (r15 == 0) goto L_0x0131
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r0.<init>(r7, r14, r15, r11)
            r12.f389174t = r0
            goto L_0x0143
        L_0x0131:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r8)
            throw r13
        L_0x0137:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r9)
            throw r13
        L_0x013d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r10)
            throw r13
        L_0x0143:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r11 = r12.f389174t
            goto L_0x018e
        L_0x0146:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r14 = r12.f389173s
            if (r14 != 0) goto L_0x018c
            com.google.android.gms.cast.framework.media.NotificationOptions r14 = r12.f389160f
            if (r14 == 0) goto L_0x018c
            long r0 = r14.f389057e
            int r14 = com.google.android.gms.cast.framework.media.internal.C143522o.m233068b(r14, r0)
            com.google.android.gms.cast.framework.media.NotificationOptions r15 = r12.f389160f
            int r15 = com.google.android.gms.cast.framework.media.internal.C143522o.m233067a(r15, r0)
            android.content.Context r0 = r12.f389156b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r14 = r0.getString(r14)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0186
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0180
            if (r15 == 0) goto L_0x017a
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r0 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r0.<init>(r4, r14, r15, r11)
            r12.f389173s = r0
            goto L_0x018c
        L_0x017a:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r8)
            throw r13
        L_0x0180:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r9)
            throw r13
        L_0x0186:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>(r10)
            throw r13
        L_0x018c:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r11 = r12.f389173s
        L_0x018e:
            if (r11 == 0) goto L_0x0193
            r13.mo983b(r11)
        L_0x0193:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.internal.C143521n.m233057j(android.support.v4.media.session.ao, java.lang.String, com.google.android.gms.cast.framework.media.NotificationAction):void");
    }

    /* renamed from: k */
    private static final boolean m233058k(String str) {
        return TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) || TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT);
    }

    /* renamed from: l */
    private final void m233059l() {
        C143500bf bfVar;
        boolean z;
        boolean z2;
        if (this.f389166l != null && C143528o.m233075b(this.f389157c) && (bfVar = this.f389165k) != null) {
            Intent intent = new Intent(this.f389156b, C143528o.class);
            intent.putExtra("extra_media_notification_force_update", false);
            intent.setPackage(this.f389156b.getPackageName());
            intent.setAction("com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION");
            intent.putExtra("extra_media_info", bfVar.mo118778f());
            intent.putExtra("extra_remote_media_client_player_state", bfVar.mo118775c());
            intent.putExtra("extra_cast_device", this.f389166l);
            MediaSessionCompat mediaSessionCompat = this.f389167m;
            if (mediaSessionCompat != null) {
                intent.putExtra("extra_media_session_token", ((C0286ac) mediaSessionCompat.f982b).f1014b);
            }
            MediaStatus i = bfVar.mo118781i();
            if (i != null) {
                int i2 = i.f388714p;
                z2 = true;
                if (i2 == 1 || i2 == 2 || i2 == 3) {
                    z = true;
                    intent.putExtra("extra_can_skip_next", z2);
                    intent.putExtra("extra_can_skip_prev", z);
                    f389155a.mo118884b("Starting notification service.", new Object[0]);
                    this.f389156b.startForegroundService(intent);
                }
                Integer d = i.mo118437d(i.f388701c);
                if (d != null) {
                    z = d.intValue() > 0;
                    if (d.intValue() >= i.mo118435b() - 1) {
                        z2 = false;
                    }
                    intent.putExtra("extra_can_skip_next", z2);
                    intent.putExtra("extra_can_skip_prev", z);
                    f389155a.mo118884b("Starting notification service.", new Object[0]);
                    this.f389156b.startForegroundService(intent);
                }
            }
            z2 = false;
            z = false;
            intent.putExtra("extra_can_skip_next", z2);
            intent.putExtra("extra_can_skip_prev", z);
            f389155a.mo118884b("Starting notification service.", new Object[0]);
            try {
                this.f389156b.startForegroundService(intent);
            } catch (ForegroundServiceStartNotAllowedException e) {
                f389155a.mo118887e(e, "Failed to start CAF media notification because app is in background", new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public final void mo118816b(Bitmap bitmap, int i) {
        MediaSessionCompat mediaSessionCompat = this.f389167m;
        if (mediaSessionCompat != null) {
            String str = i == 0 ? "android.media.metadata.DISPLAY_ICON" : "android.media.metadata.ALBUM_ART";
            if (bitmap == null) {
                bitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                bitmap.eraseColor(0);
            }
            C0329x i2 = m233056i();
            i2.mo1091b(str, bitmap);
            mediaSessionCompat.mo875g(i2.mo1090a());
        }
    }

    /* renamed from: c */
    public final void mo118817c(boolean z) {
        if (this.f389157c.f388835g) {
            Runnable runnable = this.f389172r;
            if (runnable != null) {
                this.f389171q.removeCallbacks(runnable);
            }
            Intent intent = new Intent(this.f389156b, C143406an.class);
            intent.setPackage(this.f389156b.getPackageName());
            try {
                this.f389156b.startService(intent);
            } catch (IllegalStateException unused) {
                if (z) {
                    this.f389171q.postDelayed(this.f389172r, 1000);
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo118818d() {
        if (this.f389160f != null) {
            f389155a.mo118884b("Stopping notification service.", new Object[0]);
            Runnable runnable = C143528o.f389191a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: e */
    public final void mo118819e() {
        if (this.f389157c.f388835g) {
            this.f389171q.removeCallbacks(this.f389172r);
            Intent intent = new Intent(this.f389156b, C143406an.class);
            intent.setPackage(this.f389156b.getPackageName());
            this.f389156b.stopService(intent);
        }
    }

    /* renamed from: f */
    public final void mo118820f(int i, MediaInfo mediaInfo) {
        PlaybackStateCompat playbackStateCompat;
        MediaSessionCompat mediaSessionCompat;
        MediaMetadata mediaMetadata;
        PendingIntent pendingIntent;
        MediaSessionCompat mediaSessionCompat2 = this.f389167m;
        if (mediaSessionCompat2 != null) {
            Bundle bundle = new Bundle();
            C0298ao aoVar = new C0298ao();
            long j = 0;
            if (this.f389165k == null || this.f389160f == null || !C143528o.m233075b(this.f389157c)) {
                playbackStateCompat = aoVar.mo982a();
            } else {
                C143500bf bfVar = this.f389165k;
                C143919bh.m233958a(bfVar);
                aoVar.mo984c(i, (i == 0 || bfVar.mo118795w()) ? 0 : bfVar.mo118776d(), 1.0f, SystemClock.elapsedRealtime());
                if (i == 0) {
                    playbackStateCompat = aoVar.mo982a();
                } else {
                    C143505g gVar = this.f389160f.f389052H;
                    C143500bf bfVar2 = this.f389165k;
                    long j2 = (bfVar2 == null || bfVar2.mo118795w() || this.f389165k.mo118763B()) ? 0 : 256;
                    if (gVar != null) {
                        List<NotificationAction> e = C143522o.m233071e(gVar);
                        if (e != null) {
                            for (NotificationAction notificationAction : e) {
                                String str = notificationAction.f389040a;
                                if (m233058k(str)) {
                                    j2 |= m233055h(str, i, bundle);
                                } else {
                                    m233057j(aoVar, str, notificationAction);
                                }
                            }
                        }
                    } else {
                        for (String str2 : this.f389160f.f389055c) {
                            if (m233058k(str2)) {
                                j2 |= m233055h(str2, i, bundle);
                            } else {
                                m233057j(aoVar, str2, (NotificationAction) null);
                            }
                        }
                    }
                    aoVar.f1025b = j2;
                    playbackStateCompat = aoVar.mo982a();
                }
            }
            mediaSessionCompat2.mo876h(playbackStateCompat);
            NotificationOptions notificationOptions = this.f389160f;
            if (notificationOptions != null && notificationOptions.f389053I) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            NotificationOptions notificationOptions2 = this.f389160f;
            if (notificationOptions2 != null && notificationOptions2.f389054J) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                mediaSessionCompat2.mo874f(bundle);
            }
            if (i != 0) {
                if (this.f389165k != null) {
                    if (this.f389170p == null) {
                        pendingIntent = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(this.f389170p);
                        pendingIntent = PendingIntent.getActivity(this.f389156b, 0, intent, 201326592);
                    }
                    if (pendingIntent != null) {
                        mediaSessionCompat2.mo879k(pendingIntent);
                    }
                }
                C143500bf bfVar3 = this.f389165k;
                if (bfVar3 != null && (mediaSessionCompat = this.f389167m) != null && mediaInfo != null && (mediaMetadata = mediaInfo.f388637d) != null) {
                    if (!bfVar3.mo118795w()) {
                        j = mediaInfo.f388638e;
                    }
                    String a = mediaMetadata.mo118414a("com.google.android.gms.cast.metadata.TITLE");
                    String a2 = mediaMetadata.mo118414a("com.google.android.gms.cast.metadata.SUBTITLE");
                    C0329x i2 = m233056i();
                    i2.mo1092c("android.media.metadata.DURATION", j);
                    if (a != null) {
                        i2.mo1093d("android.media.metadata.TITLE", a);
                        i2.mo1093d("android.media.metadata.DISPLAY_TITLE", a);
                    }
                    if (a2 != null) {
                        i2.mo1093d("android.media.metadata.DISPLAY_SUBTITLE", a2);
                    }
                    mediaSessionCompat.mo875g(i2.mo1090a());
                    Uri m = m233060m(mediaMetadata);
                    if (m != null) {
                        this.f389162h.mo118809b(m);
                    } else {
                        mo118816b((Bitmap) null, 0);
                    }
                    Uri m2 = m233060m(mediaMetadata);
                    if (m2 != null) {
                        this.f389163i.mo118809b(m2);
                    } else {
                        mo118816b((Bitmap) null, 3);
                    }
                }
            } else {
                mediaSessionCompat2.mo875g(new C0329x().mo1090a());
            }
        }
    }

    /* renamed from: g */
    public final void mo118821g() {
        MediaQueueItem h;
        MediaInfo mediaInfo;
        C143500bf bfVar = this.f389165k;
        if (bfVar != null) {
            MediaInfo f = bfVar.mo118778f();
            int i = 6;
            int i2 = 0;
            if (!bfVar.mo118794v()) {
                if (bfVar.mo118762A()) {
                    i = 3;
                } else if (bfVar.mo118798z()) {
                    i = 2;
                } else if (!bfVar.mo118797y() || (h = bfVar.mo118780h()) == null || (mediaInfo = h.f388690a) == null) {
                    i = 0;
                } else {
                    f = mediaInfo;
                }
            }
            if (!(f == null || f.f388637d == null)) {
                i2 = i;
            }
            mo118820f(i2, f);
            if (!bfVar.mo118793u()) {
                mo118818d();
                mo118819e();
            } else if (i2 != 0) {
                m233059l();
                if (!bfVar.mo118797y()) {
                    mo118817c(true);
                }
            }
        }
    }

    /* renamed from: i */
    private final C0329x m233056i() {
        MediaMetadataCompat mediaMetadataCompat;
        MediaSessionCompat mediaSessionCompat = this.f389167m;
        if (mediaSessionCompat == null) {
            mediaMetadataCompat = null;
        } else {
            mediaMetadataCompat = mediaSessionCompat.f983c.mo1036d();
        }
        if (mediaMetadataCompat == null) {
            return new C0329x();
        }
        return new C0329x(mediaMetadataCompat);
    }

    /* renamed from: m */
    private final Uri m233060m(MediaMetadata mediaMetadata) {
        C143523j jVar;
        WebImage webImage;
        CastMediaOptions castMediaOptions = this.f389157c.f388834f;
        if (castMediaOptions == null) {
            jVar = null;
        } else {
            jVar = castMediaOptions.mo118725a();
        }
        if (jVar != null) {
            webImage = C143523j.m233073a(mediaMetadata);
        } else {
            webImage = mediaMetadata.mo118418e() ? (WebImage) mediaMetadata.f388672b.get(0) : null;
        }
        if (webImage == null) {
            return null;
        }
        return webImage.f389996b;
    }
}
