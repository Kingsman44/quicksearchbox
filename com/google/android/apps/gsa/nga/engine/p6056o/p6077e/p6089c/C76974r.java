package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6089c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserManager;
import com.google.android.apps.gsa.nga.engine.am.g.a;
import com.google.android.apps.gsa.nga.engine.am.g.c;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5900ag.C74820be;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76590bg;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.c.r */
/* compiled from: PG */
public final class C76974r {

    /* renamed from: a */
    public final PackageManager f212490a;

    /* renamed from: b */
    private final UserManager f212491b;

    /* renamed from: c */
    private final C81515c f212492c;

    /* renamed from: d */
    private final C74820be f212493d;

    public C76974r(C74820be beVar, PackageManager packageManager, Context context, C81515c cVar) {
        this.f212493d = beVar;
        this.f212490a = packageManager;
        this.f212491b = (UserManager) context.getSystemService(UserManager.class);
        this.f212492c = cVar;
    }

    /* renamed from: d */
    static final Optional m123636d(C76590bg bgVar) {
        try {
            return bgVar.mo72274q("format", "camera_mode", "capture_mode").map(C76960d.f212478a).map(C76963g.f212481a).flatMap(C76969m.f212487a).findFirst();
        } catch (IllegalArgumentException unused) {
            return Optional.empty();
        }
    }

    /* renamed from: e */
    static final boolean m123637e(C76590bg bgVar) {
        Stream map = bgVar.mo72274q("instrument").map(C76960d.f212478a).map(C76963g.f212481a).map(C76964h.f212482a);
        a aVar = a.a;
        Objects.requireNonNull(aVar);
        return map.anyMatch(new C76965i(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Optional mo72377a(C76973q qVar) {
        C58485gu guVar;
        c cVar;
        if (this.f212493d.mo71218c()) {
            guVar = C58485gu.m89847o("android.media.action.STILL_IMAGE_CAMERA_SECURE", "android.media.action.IMAGE_CAPTURE_SECURE");
        } else {
            Optional c = qVar.mo72371c();
            if (!c.isEmpty() && ((cVar = (c) c.get()) == c.g || cVar == c.e || cVar == c.f)) {
                guVar = C58485gu.m89847o("android.media.action.VIDEO_CAMERA", "android.media.action.VIDEO_CAPTURE");
            } else {
                guVar = C58485gu.m89847o("android.media.action.STILL_IMAGE_CAMERA", "android.media.action.IMAGE_CAPTURE");
            }
        }
        return Collection.EL.stream(guVar).map(new C76966j(qVar)).filter(new C76967k(this)).peek(new C76968l(this)).findFirst();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo72378b(C80399l lVar, Locale locale) {
        C81442m.m129557s(lVar, t.r(this.f212492c.mo75121a(locale).getString(R.string.nga_phone_settings_cant_access_camera_restricted, new Object[0])));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo72379c() {
        UserManager userManager = this.f212491b;
        if (userManager == null) {
            return false;
        }
        return userManager.getUserRestrictions().getBoolean("no_camera");
    }
}
