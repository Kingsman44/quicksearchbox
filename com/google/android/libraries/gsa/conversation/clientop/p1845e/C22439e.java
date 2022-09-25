package com.google.android.libraries.gsa.conversation.clientop.p1845e;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.gsa.conversation.clientop.e.e */
/* compiled from: PG */
public final class C22439e extends C22538o {

    /* renamed from: a */
    private static final C59071e f61956a = C59071e.m91332i("com.google.android.libraries.gsa.conversation.clientop.e.e");

    /* renamed from: b */
    private final PackageManager f61957b;

    /* renamed from: c */
    private final C22695ah f61958c;

    /* renamed from: d */
    private final KeyguardManager f61959d;

    public C22439e(PackageManager packageManager, C22695ah ahVar, Context context) {
        this.f61957b = packageManager;
        this.f61958c = ahVar;
        this.f61959d = (KeyguardManager) context.getSystemService("keyguard");
    }

    /* renamed from: b */
    private static Intent m41877b(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.google.android.apps.cultural");
        intent.setData(uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01cd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20765a(com.google.assistant.p3897e.p3921j.C51809dy r22, com.google.android.libraries.gsa.conversation.clientop.C22434e r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            java.lang.String r2 = r1.f135936b
            int r3 = r2.hashCode()
            r4 = -1840830587(0xffffffff92472785, float:-6.284204E-28)
            if (r3 == r4) goto L_0x001f
            r4 = -1140792590(0xffffffffbc00e2f2, float:-0.007866608)
            if (r3 == r4) goto L_0x0015
            goto L_0x0029
        L_0x0015:
            java.lang.String r3 = "device.TAKE_PHOTO"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = 0
            goto L_0x002a
        L_0x001f:
            java.lang.String r3 = "device.RECORD_VIDEO"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0029
            r2 = 1
            goto L_0x002a
        L_0x0029:
            r2 = -1
        L_0x002a:
            java.lang.String r3 = "android.intent.extra.USE_FRONT_CAMERA"
            java.lang.String r4 = "android.intent.extra.TIMER_DURATION_SECONDS"
            java.lang.String r8 = "com.google.assistant.extra.USE_FRONT_CAMERA"
            java.lang.String r9 = "com.google.assistant.extra.TIMER_DURATION_SECONDS"
            java.lang.String r10 = "NoUiQuery"
            java.lang.String r11 = "IsVoiceQuery"
            java.lang.String r12 = "android-app://com.google.android.googlequicksearchbox/https/www.google.com"
            java.lang.String r13 = "android.intent.extra.REFERRER_NAME"
            java.lang.String r15 = "android.intent.category.VOICE"
            java.lang.String r5 = "No Front camera exists."
            java.lang.String r6 = "No front camera exists"
            java.lang.String r14 = "No rear camera exists."
            java.lang.String r7 = "No rear camera exists"
            r16 = r3
            java.lang.String r3 = "android.hardware.camera.front"
            r17 = r4
            java.lang.String r4 = "android.hardware.camera"
            r18 = 3
            r19 = r8
            if (r2 == 0) goto L_0x01cd
            r8 = 1
            if (r2 != r8) goto L_0x01c7
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x005b
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x005b:
            com.google.assistant.e.j.mr r2 = com.google.assistant.p3897e.p3921j.C52301mr.f137291f
            com.google.protobuf.eb r2 = r2.getParserForType()
            java.lang.String r8 = "record_video_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r8, r2)
            com.google.assistant.e.j.mr r1 = (com.google.assistant.p3897e.p3921j.C52301mr) r1
            int r2 = r1.f137293a
            r8 = 1
            r2 = r2 & r8
            if (r2 == 0) goto L_0x01ba
            int r2 = r1.f137294b
            int r2 = com.google.assistant.p3897e.p3921j.C52299mp.m86565a(r2)
            if (r2 != 0) goto L_0x0079
        L_0x0077:
            r2 = 0
            goto L_0x007d
        L_0x0079:
            r8 = 2
            if (r2 != r8) goto L_0x0077
            r2 = 1
        L_0x007d:
            if (r2 == 0) goto L_0x009f
            android.content.pm.PackageManager r4 = r0.f61957b
            boolean r3 = r4.hasSystemFeature(r3)
            if (r3 != 0) goto L_0x00bf
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 48278(0xbc96, float:6.7652E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r6)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r5)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x009f:
            android.content.pm.PackageManager r3 = r0.f61957b
            boolean r3 = r3.hasSystemFeature(r4)
            if (r3 != 0) goto L_0x00bf
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 48277(0xbc95, float:6.765E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r7)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r14)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x00bf:
            int r3 = r1.f137293a
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x00cf
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r1.f137295c
            long r3 = r3.toSeconds(r4)
            int r4 = (int) r3
            goto L_0x00d0
        L_0x00cf:
            r4 = 3
        L_0x00d0:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "android.media.action.VIDEO_CAMERA"
            r3.<init>(r5)
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r3 = r3.addFlags(r5)
            android.content.Intent r3 = r3.addCategory(r15)
            android.content.Intent r3 = r3.putExtra(r13, r12)
            r5 = 1
            android.content.Intent r3 = r3.putExtra(r11, r5)
            android.content.Intent r3 = r3.putExtra(r10, r5)
            android.content.Intent r3 = r3.putExtra(r9, r4)
            r8 = r19
            android.content.Intent r3 = r3.putExtra(r8, r2)
            r5 = r17
            android.content.Intent r3 = r3.putExtra(r5, r4)
            r4 = r16
            android.content.Intent r3 = r3.putExtra(r4, r2)
            java.lang.String r4 = "android.intent.extra.LENS_FACING_FRONT"
            android.content.Intent r2 = r3.putExtra(r4, r2)
            int r3 = r1.f137293a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x011e
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r1.f137296d
            long r3 = r3.toSeconds(r4)
            int r4 = (int) r3
            java.lang.String r3 = "android.intent.extra.durationLimit"
            r2.putExtra(r3, r4)
        L_0x011e:
            android.app.KeyguardManager r3 = r0.f61959d
            boolean r3 = r3.isKeyguardLocked()
            if (r3 == 0) goto L_0x0131
            java.lang.String r3 = "android.media.action.STILL_IMAGE_CAMERA_SECURE"
            r2.setAction(r3)
            java.lang.String r3 = "com.google.assistant.extra.OPEN_IN_VIDEO_MODE"
            r4 = 1
            r2.putExtra(r3, r4)
        L_0x0131:
            int r3 = r1.f137293a
            r3 = r3 & 8
            if (r3 == 0) goto L_0x013e
            java.lang.String r3 = "com.google.assistant.extra.CAMERA_OPEN_ONLY"
            boolean r1 = r1.f137297e
            r2.putExtra(r3, r1)
        L_0x013e:
            android.content.pm.PackageManager r1 = r0.f61957b
            r3 = 0
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r2, r3)
            if (r1 != 0) goto L_0x0156
            boolean r4 = r2.hasCategory(r15)
            if (r4 == 0) goto L_0x0156
            r2.removeCategory(r15)
            android.content.pm.PackageManager r1 = r0.f61957b
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r2, r3)
        L_0x0156:
            if (r1 != 0) goto L_0x0173
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "No camera app is installed"
            r3 = 48276(0xbc94, float:6.7649E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.ABORTED
            java.lang.String r2 = "No camera app is installed"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x0173:
            boolean r1 = r2.hasCategory(r15)
            if (r1 == 0) goto L_0x0190
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27809c()
            if (r1 == 0) goto L_0x0190
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27808b(r2)
            if (r1 == 0) goto L_0x0190
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x0190:
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27807a(r2)
            if (r1 == 0) goto L_0x019f
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x019f:
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to open camera app"
            r3 = 48275(0xbc93, float:6.7648E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r2 = "Camera failed to start"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x01c6
        L_0x01ba:
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r2 = "Camera type not specified"
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x01c6:
            return r1
        L_0x01c7:
            com.google.android.libraries.gsa.conversation.clientop.d r2 = new com.google.android.libraries.gsa.conversation.clientop.d
            r2.<init>(r1)
            throw r2
        L_0x01cd:
            r2 = r17
            r8 = r19
            com.google.assistant.e.j.dw r1 = r1.f135938d
            if (r1 != 0) goto L_0x01d7
            com.google.assistant.e.j.dw r1 = com.google.assistant.p3897e.p3921j.C51807dw.f135930b
        L_0x01d7:
            com.google.assistant.e.j.mv r17 = com.google.assistant.p3897e.p3921j.C52305mv.f137299h
            r19 = r2
            com.google.protobuf.eb r2 = r17.getParserForType()
            r17 = r8
            java.lang.String r8 = "take_photo_args"
            com.google.protobuf.MessageLite r1 = m41992m(r1, r8, r2)
            com.google.assistant.e.j.mv r1 = (com.google.assistant.p3897e.p3921j.C52305mv) r1
            int r2 = r1.f137302b
            int r2 = com.google.assistant.p3897e.p3921j.C52299mp.m86565a(r2)
            if (r2 != 0) goto L_0x01f6
            r20 = r9
            r2 = 0
            r8 = 2
            goto L_0x01fe
        L_0x01f6:
            r8 = 2
            r20 = r9
            if (r2 != r8) goto L_0x01fd
            r2 = 1
            goto L_0x01fe
        L_0x01fd:
            r2 = 0
        L_0x01fe:
            int r9 = r1.f137301a
            r8 = r8 & r9
            if (r8 == 0) goto L_0x020f
            long r8 = r1.f137303c
            j$.time.Duration r8 = p3186j$.time.Duration.ofMillis(r8)
            long r8 = r8.getSeconds()
            int r9 = (int) r8
            goto L_0x0210
        L_0x020f:
            r9 = 3
        L_0x0210:
            if (r2 == 0) goto L_0x0232
            android.content.pm.PackageManager r4 = r0.f61957b
            boolean r3 = r4.hasSystemFeature(r3)
            if (r3 != 0) goto L_0x0252
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 48286(0xbc9e, float:6.7663E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r6)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.INVALID_ARGUMENT
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r5)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x0232:
            android.content.pm.PackageManager r3 = r0.f61957b
            boolean r3 = r3.hasSystemFeature(r4)
            if (r3 != 0) goto L_0x0252
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            r2 = 48285(0xbc9d, float:6.7662E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r2)).mo56386p(r7)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.NOT_FOUND
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r14)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x0252:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "android.media.action.STILL_IMAGE_CAMERA"
            r3.<init>(r4)
            r4 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r4 = r3.addFlags(r4)
            android.content.Intent r4 = r4.addCategory(r15)
            android.content.Intent r4 = r4.putExtra(r13, r12)
            r5 = 1
            android.content.Intent r4 = r4.putExtra(r11, r5)
            android.content.Intent r4 = r4.putExtra(r10, r5)
            r5 = r20
            android.content.Intent r4 = r4.putExtra(r5, r9)
            r5 = r17
            android.content.Intent r4 = r4.putExtra(r5, r2)
            r5 = r19
            android.content.Intent r4 = r4.putExtra(r5, r9)
            r5 = r16
            android.content.Intent r4 = r4.putExtra(r5, r2)
            java.lang.String r5 = "android.intent.extra.LENS_FACING_FRONT"
            r4.putExtra(r5, r2)
            int r4 = r1.f137301a
            r4 = r4 & 16
            if (r4 == 0) goto L_0x02f0
            java.lang.String r4 = r1.f137306f
            java.lang.String r5 = "ART"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x02aa
            if (r2 == 0) goto L_0x02aa
            java.lang.String r2 = "https://artsandculture.google.com/camera/selfie"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r2 = m41877b(r2)
            goto L_0x02c0
        L_0x02aa:
            java.lang.String r5 = "PET_PORTRAIT"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x02bf
            if (r2 != 0) goto L_0x02bf
            java.lang.String r2 = "https://artsandculture.google.com/camera/pet-portraits"
            android.net.Uri r2 = android.net.Uri.parse(r2)
            android.content.Intent r2 = m41877b(r2)
            goto L_0x02c0
        L_0x02bf:
            r2 = 0
        L_0x02c0:
            if (r2 == 0) goto L_0x02d8
            android.content.pm.PackageManager r5 = r0.f61957b
            r6 = 0
            android.content.pm.ResolveInfo r5 = r5.resolveActivity(r2, r6)
            if (r5 == 0) goto L_0x02d8
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            r1.mo27807a(r2)
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x02d8:
            com.google.common.f.e r2 = f61956a
            com.google.common.f.x r2 = r2.mo56226d()
            java.lang.String r5 = "Cultural app not installed, fallback to open natural camera."
            r6 = 48284(0xbc9c, float:6.766E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r6)).mo56386p(r5)
            java.lang.String r2 = "com.google.assistant.extra.CAMERA_MODE"
            r3.putExtra(r2, r4)
            java.lang.String r2 = "android.intent.extra.STILL_IMAGE_MODE"
            r3.putExtra(r2, r4)
        L_0x02f0:
            android.app.KeyguardManager r2 = r0.f61959d
            boolean r2 = r2.isKeyguardLocked()
            if (r2 == 0) goto L_0x02fd
            java.lang.String r2 = "android.media.action.STILL_IMAGE_CAMERA_SECURE"
            r3.setAction(r2)
        L_0x02fd:
            int r2 = r1.f137301a
            r2 = r2 & 4
            if (r2 == 0) goto L_0x033c
            int r2 = r1.f137304d
            int r8 = com.google.assistant.p3897e.p3921j.C52304mu.m86566a(r2)
            r2 = -1
            if (r8 != 0) goto L_0x030d
            r8 = 1
        L_0x030d:
            int r8 = r8 + r2
            java.lang.String r2 = "com.google.assistant.extra.CAMERA_FLASH_MODE"
            r4 = 1
            if (r8 == r4) goto L_0x0319
            java.lang.String r4 = "FLASH_OFF"
            r3.putExtra(r2, r4)
            goto L_0x033c
        L_0x0319:
            android.content.pm.PackageManager r4 = r0.f61957b
            java.lang.String r5 = "android.hardware.camera.flash"
            boolean r4 = r4.hasSystemFeature(r5)
            if (r4 != 0) goto L_0x0337
            com.google.common.f.e r4 = f61956a
            com.google.common.f.x r4 = r4.mo56226d()
            java.lang.String r5 = "No flash light exists."
            r6 = 48283(0xbc9b, float:6.7659E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            java.lang.String r4 = "FLASH_OFF"
            r3.putExtra(r2, r4)
            goto L_0x033c
        L_0x0337:
            java.lang.String r4 = "FLASH_ON"
            r3.putExtra(r2, r4)
        L_0x033c:
            int r2 = r1.f137301a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0349
            java.lang.String r2 = "com.google.assistant.extra.CAMERA_OPEN_ONLY"
            boolean r1 = r1.f137305e
            r3.putExtra(r2, r1)
        L_0x0349:
            android.content.pm.PackageManager r1 = r0.f61957b
            r2 = 0
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r3, r2)
            if (r1 != 0) goto L_0x0361
            boolean r4 = r3.hasCategory(r15)
            if (r4 == 0) goto L_0x0361
            r3.removeCategory(r15)
            android.content.pm.PackageManager r1 = r0.f61957b
            android.content.pm.ResolveInfo r1 = r1.resolveActivity(r3, r2)
        L_0x0361:
            if (r1 != 0) goto L_0x037e
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "No camera app is installed."
            r3 = 48282(0xbc9a, float:6.7657E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.ABORTED
            java.lang.String r2 = "No camera app is installed."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x037e:
            boolean r1 = r3.hasCategory(r15)
            if (r1 == 0) goto L_0x03a9
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27809c()
            if (r1 == 0) goto L_0x03a9
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27808b(r3)
            if (r1 == 0) goto L_0x03a9
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "start the camera app using VIS."
            r3 = 48281(0xbc99, float:6.7656E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61893a
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x03a9:
            com.google.android.libraries.gsa.conversation.h.ah r1 = r0.f61958c
            boolean r1 = r1.mo27807a(r3)
            if (r1 == 0) goto L_0x03c6
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "use intent starter to start camera, some feature are not available."
            r3 = 48280(0xbc98, float:6.7655E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.f61894b
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            goto L_0x03e0
        L_0x03c6:
            com.google.common.f.e r1 = f61956a
            com.google.common.f.x r1 = r1.mo56226d()
            java.lang.String r2 = "Failed to open camera app."
            r3 = 48279(0xbc97, float:6.7653E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r3)).mo56386p(r2)
            com.google.assistant.e.j.kf r1 = com.google.assistant.p3897e.p3921j.C52235kf.UNKNOWN
            java.lang.String r2 = "Camera failed to start."
            com.google.assistant.e.j.ec r1 = com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a.m41822b(r1, r2)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
        L_0x03e0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.conversation.clientop.p1845e.C22439e.mo20765a(com.google.assistant.e.j.dy, com.google.android.libraries.gsa.conversation.clientop.e):com.google.common.util.concurrent.cx");
    }
}
