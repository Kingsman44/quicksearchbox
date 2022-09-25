package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.app.KeyguardManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.search.assistant.performer.deviceactions.p2749b.p2750a.C35903c;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2728a.C35473i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.t */
/* compiled from: PG */
public final class C35981t implements C35472h {

    /* renamed from: a */
    public static final C59071e f94162a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.deviceactions.t");

    /* renamed from: b */
    public final PackageManager f94163b;

    /* renamed from: c */
    public final C35473i f94164c;

    /* renamed from: d */
    public final C60887da f94165d;

    /* renamed from: e */
    public final C35903c f94166e;

    /* renamed from: f */
    private final C35470f f94167f;

    /* renamed from: g */
    private final KeyguardManager f94168g;

    /* renamed from: h */
    private final C35983v f94169h;

    public C35981t(PackageManager packageManager, KeyguardManager keyguardManager, C60887da daVar, C35903c cVar, C35983v vVar, C35470f fVar, C35473i iVar) {
        this.f94163b = packageManager;
        this.f94167f = fVar;
        this.f94164c = iVar;
        this.f94168g = keyguardManager;
        this.f94165d = daVar;
        this.f94166e = cVar;
        this.f94169h = vVar;
    }

    /* renamed from: e */
    private static Intent m64364e(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.google.android.apps.cultural");
        intent.setData(uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01cf  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20766a(com.google.assistant.p3897e.p3921j.C51809dy r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            com.google.common.f.e r2 = f94162a
            com.google.common.f.x r3 = r2.mo56224b()
            java.lang.String r4 = "TNG CameraActionPerformer."
            r5 = 51790(0xca4e, float:7.2573E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            java.lang.String r3 = r1.f135936b
            int r4 = r3.hashCode()
            r5 = -1840830587(0xffffffff92472785, float:-6.284204E-28)
            if (r4 == r5) goto L_0x002d
            r5 = -1140792590(0xffffffffbc00e2f2, float:-0.007866608)
            if (r4 == r5) goto L_0x0023
            goto L_0x0037
        L_0x0023:
            java.lang.String r4 = "device.TAKE_PHOTO"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0037
            r4 = 0
            goto L_0x0038
        L_0x002d:
            java.lang.String r4 = "device.RECORD_VIDEO"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0037
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = -1
        L_0x0038:
            java.lang.String r5 = "android.intent.extra.USE_FRONT_CAMERA"
            java.lang.String r9 = "android.intent.extra.TIMER_DURATION_SECONDS"
            java.lang.String r10 = "com.google.assistant.extra.USE_FRONT_CAMERA"
            java.lang.String r11 = "com.google.assistant.extra.TIMER_DURATION_SECONDS"
            java.lang.String r12 = "NoUiQuery"
            java.lang.String r13 = "IsVoiceQuery"
            java.lang.String r14 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            java.lang.String r15 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r7 = "No Front camera exists."
            java.lang.String r6 = "No front camera exists"
            java.lang.String r8 = "No rear camera exists."
            r16 = r3
            java.lang.String r3 = "No rear camera exists"
            r17 = r5
            java.lang.String r5 = "android.hardware.camera.front"
            r18 = r9
            java.lang.String r9 = "android.hardware.camera.any"
            r19 = 3
            r20 = r10
            java.lang.String r10 = "android.intent.category.VOICE"
            if (r4 == 0) goto L_0x01cf
            r21 = r11
            r11 = 1
            if (r4 != r11) goto L_0x01bd
            com.google.assistant.e.j.mr r4 = com.google.assistant.p3897e.p3921j.C52301mr.f137291f
            com.google.protobuf.eb r4 = r4.getParserForType()
            java.lang.String r11 = "record_video_args"
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r11, r4)
            com.google.assistant.e.j.mr r1 = (com.google.assistant.p3897e.p3921j.C52301mr) r1
            int r4 = r1.f137293a
            r11 = 1
            r4 = r4 & r11
            if (r4 == 0) goto L_0x01b0
            int r4 = r1.f137294b
            int r4 = com.google.assistant.p3897e.p3921j.C52299mp.m86565a(r4)
            if (r4 != 0) goto L_0x0085
        L_0x0083:
            r4 = 0
            goto L_0x0089
        L_0x0085:
            r11 = 2
            if (r4 != r11) goto L_0x0083
            r4 = 1
        L_0x0089:
            if (r4 == 0) goto L_0x00a9
            android.content.pm.PackageManager r3 = r0.f94163b
            boolean r3 = r3.hasSystemFeature(r5)
            if (r3 != 0) goto L_0x00c7
            com.google.common.f.x r1 = r2.mo56226d()
            r2 = 51794(0xca52, float:7.2579E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r6)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r7)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01bc
        L_0x00a9:
            android.content.pm.PackageManager r5 = r0.f94163b
            boolean r5 = r5.hasSystemFeature(r9)
            if (r5 != 0) goto L_0x00c7
            com.google.common.f.x r1 = r2.mo56226d()
            r2 = 51793(0xca51, float:7.2577E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r8)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01bc
        L_0x00c7:
            int r3 = r1.f137293a
            r5 = 2
            r3 = r3 & r5
            if (r3 == 0) goto L_0x00d9
            long r5 = r1.f137295c
            j$.time.Duration r3 = p3186j$.time.Duration.ofMillis(r5)
            long r5 = r3.getSeconds()
            int r3 = (int) r5
            goto L_0x00da
        L_0x00d9:
            r3 = 3
        L_0x00da:
            android.content.Intent r5 = new android.content.Intent
            java.lang.String r6 = "android.media.action.VIDEO_CAMERA"
            r5.<init>(r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r5 = r5.addFlags(r6)
            android.content.Intent r5 = r5.addCategory(r10)
            android.content.Intent r5 = r5.putExtra(r15, r14)
            r6 = 1
            android.content.Intent r5 = r5.putExtra(r13, r6)
            android.content.Intent r5 = r5.putExtra(r12, r6)
            r11 = r21
            android.content.Intent r5 = r5.putExtra(r11, r3)
            r6 = r20
            android.content.Intent r5 = r5.putExtra(r6, r4)
            r6 = r18
            android.content.Intent r3 = r5.putExtra(r6, r3)
            r5 = r17
            android.content.Intent r3 = r3.putExtra(r5, r4)
            java.lang.String r5 = "android.intent.extra.LENS_FACING_FRONT"
            android.content.Intent r3 = r3.putExtra(r5, r4)
            int r4 = r1.f137293a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x012c
            long r4 = r1.f137296d
            j$.time.Duration r4 = p3186j$.time.Duration.ofMillis(r4)
            long r4 = r4.getSeconds()
            int r5 = (int) r4
            java.lang.String r4 = "android.intent.extra.durationLimit"
            r3.putExtra(r4, r5)
        L_0x012c:
            android.app.KeyguardManager r4 = r0.f94168g
            boolean r4 = r4.isKeyguardLocked()
            if (r4 == 0) goto L_0x014b
            com.google.android.libraries.search.assistant.performer.deviceactions.v r4 = r0.f94169h
            java.lang.Boolean r4 = r4.mo39880b()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x014b
            java.lang.String r4 = "android.media.action.STILL_IMAGE_CAMERA_SECURE"
            r3.setAction(r4)
            java.lang.String r4 = "com.google.assistant.extra.OPEN_IN_VIDEO_MODE"
            r5 = 1
            r3.putExtra(r4, r5)
        L_0x014b:
            int r4 = r1.f137293a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0158
            java.lang.String r4 = "com.google.assistant.extra.CAMERA_OPEN_ONLY"
            boolean r1 = r1.f137297e
            r3.putExtra(r4, r1)
        L_0x0158:
            android.content.pm.PackageManager r1 = r0.f94163b
            r4 = 0
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r3, r4)
            if (r1 != 0) goto L_0x0170
            boolean r5 = r3.hasCategory(r10)
            if (r5 == 0) goto L_0x0170
            r3.removeCategory(r10)
            android.content.pm.PackageManager r1 = r0.f94163b
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r3, r4)
        L_0x0170:
            if (r1 != 0) goto L_0x018b
            com.google.common.f.x r1 = r2.mo56226d()
            java.lang.String r2 = "No camera app is installed"
            r3 = 51792(0xca50, float:7.2576E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.ABORTED
            java.lang.String r2 = "No camera app is installed"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01bc
        L_0x018b:
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            boolean r2 = r3.hasCategory(r10)
            if (r2 == 0) goto L_0x01a0
            com.google.android.libraries.search.assistant.performer.a.i r1 = r0.f94164c
            com.google.common.util.concurrent.cx r1 = r1.mo20099a(r3)
        L_0x01a0:
            com.google.android.libraries.search.assistant.performer.deviceactions.q r2 = new com.google.android.libraries.search.assistant.performer.deviceactions.q
            r2.<init>(r0, r3)
            com.google.common.util.concurrent.da r3 = r0.f94165d
            com.google.common.util.concurrent.s r2 = com.google.apps.tiktok.tracing.C47810es.m84966f(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r2, r3)
            goto L_0x01bc
        L_0x01b0:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r2 = "Camera type not specified"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x01bc:
            return r1
        L_0x01bd:
            com.google.android.libraries.search.assistant.performer.a.g r1 = new com.google.android.libraries.search.assistant.performer.a.g
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r16
            java.lang.String r3 = "ClientOp name is incorrect. Expected device.TAKE_PHOTO or device.RECORD_VIDEO, but got %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x01cf:
            r4 = r20
            com.google.assistant.e.j.mv r16 = com.google.assistant.p3897e.p3921j.C52305mv.f137299h
            com.google.protobuf.eb r4 = r16.getParserForType()
            r21 = r11
            java.lang.String r11 = "take_photo_args"
            com.google.protobuf.MessageLite r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36183e.m64584b(r1, r11, r4)
            com.google.assistant.e.j.mv r1 = (com.google.assistant.p3897e.p3921j.C52305mv) r1
            int r4 = r1.f137302b
            int r4 = com.google.assistant.p3897e.p3921j.C52299mp.m86565a(r4)
            if (r4 != 0) goto L_0x01ee
            r16 = r12
            r4 = 0
            r11 = 2
            goto L_0x01f6
        L_0x01ee:
            r11 = 2
            r16 = r12
            if (r4 != r11) goto L_0x01f5
            r4 = 1
            goto L_0x01f6
        L_0x01f5:
            r4 = 0
        L_0x01f6:
            int r12 = r1.f137301a
            r11 = r11 & r12
            if (r11 == 0) goto L_0x0207
            long r11 = r1.f137303c
            j$.time.Duration r11 = p3186j$.time.Duration.ofMillis(r11)
            long r11 = r11.getSeconds()
            int r12 = (int) r11
            goto L_0x0208
        L_0x0207:
            r12 = 3
        L_0x0208:
            if (r4 == 0) goto L_0x0228
            android.content.pm.PackageManager r3 = r0.f94163b
            boolean r3 = r3.hasSystemFeature(r5)
            if (r3 != 0) goto L_0x0246
            com.google.common.f.x r1 = r2.mo56226d()
            r2 = 51800(0xca58, float:7.2587E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r6)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r7)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0402
        L_0x0228:
            android.content.pm.PackageManager r5 = r0.f94163b
            boolean r5 = r5.hasSystemFeature(r9)
            if (r5 != 0) goto L_0x0246
            com.google.common.f.x r1 = r2.mo56226d()
            r2 = 51799(0xca57, float:7.2586E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r3)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.search.assistant.performer.p2767j.C36180b.m64579c(r1, r8)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x0402
        L_0x0246:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "android.media.action.STILL_IMAGE_CAMERA"
            r3.<init>(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r5 = r3.addFlags(r5)
            android.content.Intent r5 = r5.addCategory(r10)
            android.content.Intent r5 = r5.putExtra(r15, r14)
            r6 = 1
            android.content.Intent r5 = r5.putExtra(r13, r6)
            r7 = r16
            android.content.Intent r5 = r5.putExtra(r7, r6)
            r6 = r21
            android.content.Intent r5 = r5.putExtra(r6, r12)
            r6 = r20
            android.content.Intent r5 = r5.putExtra(r6, r4)
            r6 = r18
            android.content.Intent r5 = r5.putExtra(r6, r12)
            r6 = r17
            android.content.Intent r5 = r5.putExtra(r6, r4)
            java.lang.String r6 = "android.intent.extra.LENS_FACING_FRONT"
            r5.putExtra(r6, r4)
            int r5 = r1.f137301a
            r5 = r5 & 16
            if (r5 == 0) goto L_0x02f5
            java.lang.String r5 = r1.f137306f
            java.lang.String r6 = "ART"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x02a0
            if (r4 == 0) goto L_0x02a0
            java.lang.String r4 = "https://artsandculture.google.com/camera/selfie"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.content.Intent r4 = m64364e(r4)
            goto L_0x02b6
        L_0x02a0:
            java.lang.String r6 = "PET_PORTRAIT"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x02b5
            if (r4 != 0) goto L_0x02b5
            java.lang.String r4 = "https://artsandculture.google.com/camera/pet-portraits"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            android.content.Intent r4 = m64364e(r4)
            goto L_0x02b6
        L_0x02b5:
            r4 = 0
        L_0x02b6:
            if (r4 == 0) goto L_0x02df
            android.content.pm.PackageManager r6 = r0.f94163b
            r7 = 0
            android.content.pm.ResolveInfo r6 = r6.resolveActivity(r4, r7)
            if (r6 == 0) goto L_0x02df
            com.google.android.libraries.search.assistant.performer.a.f r1 = r0.f94167f
            com.google.common.util.concurrent.cx r1 = r1.mo20101f(r4)
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.search.assistant.performer.deviceactions.l r2 = com.google.android.libraries.search.assistant.performer.deviceactions.C35958l.f94132a
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51515h(r2, r3)
            java.lang.Class<java.lang.Exception> r2 = java.lang.Exception.class
            com.google.android.libraries.search.assistant.performer.deviceactions.m r3 = com.google.android.libraries.search.assistant.performer.deviceactions.C35959m.f94133a
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51513e(r2, r3, r4)
            goto L_0x0402
        L_0x02df:
            com.google.common.f.x r4 = r2.mo56226d()
            java.lang.String r6 = "Cultural app not installed, fallback to open natural camera."
            r7 = 51798(0xca56, float:7.2584E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r6)
            java.lang.String r4 = "com.google.assistant.extra.CAMERA_MODE"
            r3.putExtra(r4, r5)
            java.lang.String r4 = "android.intent.extra.STILL_IMAGE_MODE"
            r3.putExtra(r4, r5)
        L_0x02f5:
            android.app.KeyguardManager r4 = r0.f94168g
            boolean r4 = r4.isKeyguardLocked()
            if (r4 == 0) goto L_0x030e
            com.google.android.libraries.search.assistant.performer.deviceactions.v r4 = r0.f94169h
            java.lang.Boolean r4 = r4.mo39880b()
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x030e
            java.lang.String r4 = "android.media.action.STILL_IMAGE_CAMERA_SECURE"
            r3.setAction(r4)
        L_0x030e:
            int r4 = r1.f137301a
            r4 = r4 & 4
            if (r4 == 0) goto L_0x034b
            int r4 = r1.f137304d
            int r4 = com.google.assistant.p3897e.p3921j.C52304mu.m86566a(r4)
            if (r4 != 0) goto L_0x031d
            r4 = 1
        L_0x031d:
            r5 = -1
            int r4 = r4 + r5
            java.lang.String r5 = "com.google.assistant.extra.CAMERA_FLASH_MODE"
            r6 = 1
            if (r4 == r6) goto L_0x032a
            java.lang.String r4 = "FLASH_OFF"
            r3.putExtra(r5, r4)
            goto L_0x034b
        L_0x032a:
            android.content.pm.PackageManager r4 = r0.f94163b
            java.lang.String r6 = "android.hardware.camera.flash"
            boolean r4 = r4.hasSystemFeature(r6)
            if (r4 != 0) goto L_0x0346
            com.google.common.f.x r4 = r2.mo56226d()
            java.lang.String r6 = "No flash light exists."
            r7 = 51797(0xca55, float:7.2583E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r7)).mo56386p(r6)
            java.lang.String r4 = "FLASH_OFF"
            r3.putExtra(r5, r4)
            goto L_0x034b
        L_0x0346:
            java.lang.String r4 = "FLASH_ON"
            r3.putExtra(r5, r4)
        L_0x034b:
            int r4 = r1.f137301a
            r4 = r4 & 8
            if (r4 == 0) goto L_0x0358
            java.lang.String r4 = "com.google.assistant.extra.CAMERA_OPEN_ONLY"
            boolean r5 = r1.f137305e
            r3.putExtra(r4, r5)
        L_0x0358:
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60866ct.f164955a
            com.google.android.libraries.search.assistant.performer.deviceactions.v r5 = r0.f94169h
            java.lang.Boolean r5 = r5.mo39879a()
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x03f3
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r4 = "camera action sticky app enabled, setting the intent package name."
            r5 = 51796(0xca54, float:7.2582E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56386p(r4)
            com.google.assistant.e.c.c.gh r2 = r1.f137307g
            if (r2 != 0) goto L_0x0378
            com.google.assistant.e.c.c.gh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0378:
            int r4 = r2.f133012b
            r5 = 1
            if (r4 != r5) goto L_0x0382
            java.lang.Object r2 = r2.f133013c
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            goto L_0x0384
        L_0x0382:
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x0384:
            int r2 = r2.f132943a
            r2 = r2 & r5
            if (r2 == 0) goto L_0x03a1
            com.google.assistant.e.c.c.gh r1 = r1.f137307g
            if (r1 != 0) goto L_0x038f
            com.google.assistant.e.c.c.gh r1 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x038f:
            int r2 = r1.f133012b
            if (r2 != r5) goto L_0x0398
            java.lang.Object r1 = r1.f133013c
            com.google.assistant.e.c.c.ev r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r1
            goto L_0x039a
        L_0x0398:
            com.google.assistant.e.c.c.ev r1 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x039a:
            java.lang.String r1 = r1.f132944b
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x03a5
        L_0x03a1:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x03a5:
            boolean r2 = r1.isPresent()
            if (r2 == 0) goto L_0x03c1
            java.lang.Object r2 = r1.get()
            java.lang.String r2 = (java.lang.String) r2
            r3.setPackage(r2)
            com.google.android.libraries.search.assistant.performer.deviceactions.b.a.c r2 = r0.f94166e
            java.lang.Object r1 = r1.get()
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.util.concurrent.cx r4 = r2.mo39884a(r1)
            goto L_0x03f3
        L_0x03c1:
            com.google.android.libraries.search.assistant.performer.deviceactions.b.a.c r1 = r0.f94166e
            com.google.android.libraries.storage.protostore.ab r1 = r1.f94046a
            com.google.common.util.concurrent.cx r1 = r1.mo46042d()
            com.google.android.libraries.search.assistant.performer.deviceactions.b.a.a r2 = com.google.android.libraries.search.assistant.performer.deviceactions.p2749b.p2750a.C35899a.f94040a
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.bg r4 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.base.ah r2 = com.google.apps.tiktok.tracing.C47810es.m84963c(r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93044g(r1, r2, r4)
            com.google.apps.tiktok.tracing.contrib.b.f r1 = com.google.apps.tiktok.tracing.contrib.p3700b.C47633f.m84733g(r1)
            com.google.android.libraries.search.assistant.performer.deviceactions.r r2 = new com.google.android.libraries.search.assistant.performer.deviceactions.r
            r2.<init>(r0, r3)
            com.google.common.util.concurrent.da r4 = r0.f94165d
            com.google.apps.tiktok.tracing.contrib.b.f r1 = r1.mo51515h(r2, r4)
            com.google.android.libraries.search.assistant.performer.deviceactions.s r2 = new com.google.android.libraries.search.assistant.performer.deviceactions.s
            r2.<init>(r0, r3)
            com.google.common.util.concurrent.da r4 = r0.f94165d
            com.google.apps.tiktok.tracing.contrib.b.f r4 = r1.mo51516i(r2, r4)
        L_0x03f3:
            com.google.android.libraries.search.assistant.performer.deviceactions.n r1 = new com.google.android.libraries.search.assistant.performer.deviceactions.n
            r1.<init>(r0, r3)
            com.google.common.util.concurrent.da r2 = r0.f94165d
            com.google.common.util.concurrent.s r1 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r4, r1, r2)
        L_0x0402:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.performer.deviceactions.C35981t.mo20766a(com.google.assistant.e.j.dy):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo39914b(Intent intent) {
        return C47633f.m84733g(this.f94167f.mo20101f(intent)).mo51515h(C35961o.f94136a, this.f94165d).mo51513e(Exception.class, new C35962p(intent), this.f94165d);
    }

    /* renamed from: c */
    public final boolean mo39915c(Intent intent) {
        return this.f94163b.resolveActivity(intent, 0) != null;
    }

    /* renamed from: d */
    public final boolean mo39916d(String str) {
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                this.f94163b.getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
                return true;
            }
            this.f94163b.getPackageInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f94162a.mo56226d()).mo56382g(e)).mo56372aa(51806)).mo56389s("Cannot find package name :%s", str);
            return false;
        }
    }
}
