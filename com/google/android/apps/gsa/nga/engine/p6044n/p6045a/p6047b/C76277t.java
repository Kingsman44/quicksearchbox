package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.android.libraries.gsa.conversation.clientop.C22428d;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52299mp;
import com.google.assistant.p3897e.p3921j.C52304mu;
import com.google.assistant.p3897e.p3921j.C52305mv;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.t */
/* compiled from: PG */
public final class C76277t extends C22538o {

    /* renamed from: a */
    private final PackageManager f211302a;

    /* renamed from: b */
    private final C22695ah f211303b;

    /* renamed from: c */
    private final KeyguardManager f211304c;

    public C76277t(PackageManager packageManager, C22695ah ahVar, Context context) {
        this.f211302a = packageManager;
        this.f211303b = ahVar;
        this.f211304c = (KeyguardManager) context.getSystemService("keyguard");
    }

    /* renamed from: b */
    private static Intent m122869b(Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.google.android.apps.cultural");
        intent.setData(uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        Intent intent;
        String str = dyVar.f135936b;
        if (((str.hashCode() == -1140792590 && str.equals("device.TAKE_PHOTO")) ? (char) 0 : 65535) == 0) {
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C52305mv mvVar = (C52305mv) m41992m(dwVar, "take_photo_args", C52305mv.f137299h.getParserForType());
            int a = C52299mp.m86565a(mvVar.f137302b);
            boolean z = a != 0 && a == 2;
            int seconds = (2 & mvVar.f137301a) != 0 ? (int) Duration.ofMillis(mvVar.f137303c).getSeconds() : 3;
            if (z) {
                if (!this.f211302a.hasSystemFeature("android.hardware.camera.front")) {
                    return C60856cj.m92900i(C22402a.m41822b(C52235kf.INVALID_ARGUMENT, "No Front camera exists."));
                }
            } else if (!this.f211302a.hasSystemFeature("android.hardware.camera")) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.NOT_FOUND, "No rear camera exists."));
            }
            Intent intent2 = new Intent("android.media.action.STILL_IMAGE_CAMERA");
            intent2.addFlags(268435456).addCategory("android.intent.category.VOICE").putExtra("android.intent.extra.REFERRER_NAME", "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("IsVoiceQuery", true).putExtra("NoUiQuery", true).putExtra("com.google.assistant.extra.TIMER_DURATION_SECONDS", seconds).putExtra("com.google.assistant.extra.USE_FRONT_CAMERA", z).putExtra("android.intent.extra.TIMER_DURATION_SECONDS", seconds).putExtra("android.intent.extra.USE_FRONT_CAMERA", z).putExtra("android.intent.extra.LENS_FACING_FRONT", z ? 1 : 0);
            if ((mvVar.f137301a & 16) != 0) {
                String str2 = mvVar.f137306f;
                if (!str2.equals("ART") || !z) {
                    intent = (!str2.equals("PET_PORTRAIT") || z) ? null : m122869b(Uri.parse("https://artsandculture.google.com/camera/pet-portraits"));
                } else {
                    intent = m122869b(Uri.parse("https://artsandculture.google.com/camera/selfie"));
                }
                if (intent == null || this.f211302a.resolveActivity(intent, 0) == null) {
                    intent2.putExtra("com.google.assistant.extra.CAMERA_MODE", str2);
                    intent2.putExtra("android.intent.extra.STILL_IMAGE_MODE", str2);
                } else {
                    this.f211303b.mo27807a(intent);
                    return C60856cj.m92900i(C22402a.f61893a);
                }
            }
            if (this.f211304c.isKeyguardLocked()) {
                intent2.setAction("android.media.action.STILL_IMAGE_CAMERA_SECURE");
            }
            if ((mvVar.f137301a & 4) != 0) {
                int a2 = C52304mu.m86566a(mvVar.f137304d);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a2 - 1 != 1) {
                    intent2.putExtra("com.google.assistant.extra.CAMERA_FLASH_MODE", "FLASH_OFF");
                } else if (!this.f211302a.hasSystemFeature("android.hardware.camera.flash")) {
                    intent2.putExtra("com.google.assistant.extra.CAMERA_FLASH_MODE", "FLASH_OFF");
                } else {
                    intent2.putExtra("com.google.assistant.extra.CAMERA_FLASH_MODE", "FLASH_ON");
                }
            }
            if ((mvVar.f137301a & 8) != 0) {
                intent2.putExtra("com.google.assistant.extra.CAMERA_OPEN_ONLY", mvVar.f137305e);
            }
            ResolveInfo resolveActivity = this.f211302a.resolveActivity(intent2, 0);
            if (resolveActivity == null && intent2.hasCategory("android.intent.category.VOICE")) {
                intent2.removeCategory("android.intent.category.VOICE");
                resolveActivity = this.f211302a.resolveActivity(intent2, 0);
            }
            if (resolveActivity == null) {
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.ABORTED, "No camera app is installed."));
            }
            if (intent2.hasCategory("android.intent.category.VOICE") && this.f211303b.mo27809c() && this.f211303b.mo27808b(intent2)) {
                return C60856cj.m92900i(C22402a.f61893a);
            }
            if (this.f211303b.mo27807a(intent2)) {
                return C60856cj.m92900i(C22402a.f61894b);
            }
            return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNKNOWN, "Camera failed to start."));
        }
        throw new C22428d(dyVar);
    }
}
