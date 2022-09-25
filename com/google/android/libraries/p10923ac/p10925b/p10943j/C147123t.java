package com.google.android.libraries.p10923ac.p10925b.p10943j;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.p10923ac.p10925b.p10927b.p10928a.C146771a;
import com.google.android.libraries.p10923ac.p10925b.p10933d.C146822a;
import com.google.android.libraries.p10923ac.p10925b.p10941h.C147053a;
import com.google.android.libraries.p10923ac.p10925b.p10945l.C147179m;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147254k;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a;
import com.google.common.base.C58885cv;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.List;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.ac.b.j.t */
/* compiled from: PG */
final class C147123t implements C147053a {

    /* renamed from: a */
    public final C68214a f397216a;

    /* renamed from: b */
    public final C146822a f397217b;

    /* renamed from: c */
    public final C147116m f397218c;

    /* renamed from: d */
    public final Context f397219d;

    /* renamed from: e */
    public final C147179m f397220e;

    /* renamed from: f */
    public final C68214a f397221f;

    /* renamed from: g */
    private final C146771a f397222g;

    /* renamed from: h */
    private final C68214a f397223h;

    /* renamed from: i */
    private final C147254k f397224i;

    public C147123t(C68214a aVar, C146822a aVar2, C147116m mVar, Context context, C146771a aVar3, C147254k kVar, C68214a aVar4, C147179m mVar2, C68214a aVar5) {
        this.f397216a = aVar;
        this.f397217b = aVar2;
        this.f397218c = mVar;
        this.f397219d = context;
        this.f397222g = aVar3;
        this.f397224i = kVar;
        this.f397223h = aVar4;
        this.f397220e = mVar2;
        this.f397221f = aVar5;
    }

    /* renamed from: c */
    public static boolean m239889c(String str, Context context) {
        return context.getPackageManager().getPackageInfo(str, 0).applicationInfo.enabled;
    }

    /* renamed from: d */
    public static boolean m239890d(String str, Context context) {
        return (context.getPackageManager().getPackageInfo(str, 0).applicationInfo.flags & C89885b.NOW_VALUE) != 0;
    }

    /* renamed from: a */
    public final C60870cx mo123852a(Bundle bundle) {
        if (!C147266a.m240141l()) {
            return C60922j.m93045h(this.f397224i.mo124056a(), new C147121r(this), this.f397222g);
        }
        C146771a aVar = this.f397222g;
        C147116m mVar = this.f397218c;
        Objects.requireNonNull(mVar);
        return C60922j.m93045h(aVar.mo123625a(new C147119p(mVar)), new C147120q(this), this.f397222g);
    }

    /* renamed from: b */
    public final C60870cx mo123944b(List list) {
        if (!((Boolean) new C58885cv(true).f156729a).booleanValue()) {
            return C60866ct.f164955a;
        }
        return C60922j.m93045h((C60870cx) this.f397223h.mo27525b(), new C147122s(this, list), this.f397222g);
    }
}
