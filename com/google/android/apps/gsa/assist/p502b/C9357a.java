package com.google.android.apps.gsa.assist.p502b;

import android.content.Context;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Build;
import com.google.android.apps.gsa.assist.C9349at;
import com.google.android.apps.gsa.assist.C9350au;
import com.google.android.apps.gsa.assist.C9351av;
import com.google.android.apps.gsa.assist.C9352aw;
import com.google.android.apps.gsa.assist.C9353ax;
import com.google.android.apps.gsa.assist.C9354ay;
import com.google.android.apps.gsa.assist.C9355az;
import com.google.android.apps.gsa.assist.C9360ba;
import com.google.android.apps.gsa.assist.C9361bb;
import com.google.android.apps.gsa.assist.C9362bc;
import com.google.android.apps.gsa.assist.C9363bd;
import com.google.android.apps.gsa.assist.C9364be;
import com.google.android.apps.gsa.assist.C9365bf;
import com.google.android.apps.gsa.assist.C9366bg;
import com.google.android.apps.gsa.assist.p501a.C9313a;
import com.google.android.apps.gsa.location.C74637ae;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.google.C85881bd;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90933cc;
import com.google.android.libraries.search.location.C38725y;
import com.google.android.libraries.search.location.C38726z;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.assist.b.a */
/* compiled from: PG */
public final class C9357a {

    /* renamed from: a */
    private final Context f32496a;

    /* renamed from: b */
    private final String f32497b;

    /* renamed from: c */
    private final C86106b f32498c;

    /* renamed from: d */
    private final C74637ae f32499d;

    /* renamed from: e */
    private final C85881bd f32500e;

    /* renamed from: f */
    private final C9313a f32501f;

    /* renamed from: g */
    private final C85664bo f32502g;

    public C9357a(Context context, String str, C86106b bVar, C74637ae aeVar, C85881bd bdVar, C9313a aVar, C85664bo boVar) {
        this.f32496a = context;
        this.f32497b = str;
        this.f32498c = bVar;
        this.f32499d = aeVar;
        this.f32500e = bdVar;
        this.f32501f = aVar;
        this.f32502g = boVar;
    }

    /* renamed from: a */
    public final C9352aw mo17546a() {
        Location location;
        C9351av avVar = (C9351av) C9352aw.f32476g.createBuilder();
        String str = null;
        if (this.f32500e.mo79513d(true)) {
            C91018d.m148680c();
            C74637ae aeVar = this.f32499d;
            C38725y d = C38726z.m68011d(C39226b.TAG_CLASSIC_SERVICES_CONTEXTUALCARDS_LO);
            d.mo41493b(Duration.ofDays(1));
            C60870cx c = aeVar.mo71020c(d.mo41492a());
            C90933cc.m148547b(c, TimeUnit.MILLISECONDS);
            location = (Location) C90877ak.m148475i(c, (Object) null);
        } else {
            location = null;
        }
        if (location != null) {
            C9361bb bbVar = (C9361bb) C9364be.f32516c.createBuilder();
            C9362bc bcVar = (C9362bc) C9363bd.f32511d.createBuilder();
            double latitude = location.getLatitude();
            bcVar.copyOnWrite();
            C9363bd bdVar = (C9363bd) bcVar.instance;
            bdVar.f32513a |= 1;
            bdVar.f32514b = (float) latitude;
            double longitude = location.getLongitude();
            bcVar.copyOnWrite();
            C9363bd bdVar2 = (C9363bd) bcVar.instance;
            bdVar2.f32513a |= 2;
            bdVar2.f32515c = (float) longitude;
            bbVar.copyOnWrite();
            C9364be beVar = (C9364be) bbVar.instance;
            C9363bd bdVar3 = (C9363bd) bcVar.build();
            bdVar3.getClass();
            beVar.f32519b = bdVar3;
            beVar.f32518a |= 1;
            avVar.copyOnWrite();
            C9352aw awVar = (C9352aw) avVar.instance;
            C9364be beVar2 = (C9364be) bbVar.build();
            beVar2.getClass();
            awVar.f32480c = beVar2;
            awVar.f32478a |= 2;
        }
        Locale locale = this.f32496a.getResources().getConfiguration().locale;
        C9355az azVar = (C9355az) C9360ba.f32505e.createBuilder();
        String languageTag = locale.toLanguageTag();
        azVar.copyOnWrite();
        C9360ba baVar = (C9360ba) azVar.instance;
        languageTag.getClass();
        baVar.f32507a |= 1;
        baVar.f32508b = languageTag;
        String country = locale.getCountry();
        azVar.copyOnWrite();
        C9360ba baVar2 = (C9360ba) azVar.instance;
        country.getClass();
        baVar2.f32507a |= 2;
        baVar2.f32509c = country;
        String id = TimeZone.getDefault().getID();
        azVar.copyOnWrite();
        C9360ba baVar3 = (C9360ba) azVar.instance;
        id.getClass();
        baVar3.f32507a |= 4;
        baVar3.f32510d = id;
        avVar.copyOnWrite();
        C9352aw awVar2 = (C9352aw) avVar.instance;
        C9360ba baVar4 = (C9360ba) azVar.build();
        baVar4.getClass();
        awVar2.f32479b = baVar4;
        awVar2.f32478a |= 1;
        C9365bf bfVar = (C9365bf) C9366bg.f32520f.createBuilder();
        String str2 = Build.VERSION.RELEASE;
        bfVar.copyOnWrite();
        C9366bg bgVar = (C9366bg) bfVar.instance;
        str2.getClass();
        bgVar.f32522a |= 1;
        bgVar.f32523b = str2;
        String str3 = this.f32497b;
        bfVar.copyOnWrite();
        C9366bg bgVar2 = (C9366bg) bfVar.instance;
        str3.getClass();
        bgVar2.f32522a |= 2;
        bgVar2.f32524c = str3;
        long j = this.f32501f.f32327a;
        bfVar.copyOnWrite();
        C9366bg bgVar3 = (C9366bg) bfVar.instance;
        bgVar3.f32522a |= 16;
        bgVar3.f32526e = j;
        C86106b bVar = this.f32498c;
        if (bVar != null) {
            str = bVar.mo79727b();
        }
        if (str != null) {
            bfVar.copyOnWrite();
            C9366bg bgVar4 = (C9366bg) bfVar.instance;
            bgVar4.f32522a |= 4;
            bgVar4.f32525d = str;
        }
        avVar.copyOnWrite();
        C9352aw awVar3 = (C9352aw) avVar.instance;
        C9366bg bgVar5 = (C9366bg) bfVar.build();
        bgVar5.getClass();
        awVar3.f32481d = bgVar5;
        awVar3.f32478a |= 4;
        C9349at atVar = (C9349at) C9350au.f32472c.createBuilder();
        boolean l = this.f32502g.mo79197l(C85662bm.WEB_HISTORY);
        atVar.copyOnWrite();
        C9350au auVar = (C9350au) atVar.instance;
        auVar.f32474a |= 1;
        auVar.f32475b = l;
        avVar.copyOnWrite();
        C9352aw awVar4 = (C9352aw) avVar.instance;
        C9350au auVar2 = (C9350au) atVar.build();
        auVar2.getClass();
        awVar4.f32482e = auVar2;
        awVar4.f32478a |= 8;
        Configuration configuration = this.f32496a.getResources().getConfiguration();
        C9353ax axVar = (C9353ax) C9354ay.f32484e.createBuilder();
        int i = configuration.screenWidthDp;
        axVar.copyOnWrite();
        C9354ay ayVar = (C9354ay) axVar.instance;
        ayVar.f32486a = 1 | ayVar.f32486a;
        ayVar.f32487b = i;
        int i2 = configuration.screenHeightDp;
        axVar.copyOnWrite();
        C9354ay ayVar2 = (C9354ay) axVar.instance;
        ayVar2.f32486a |= 2;
        ayVar2.f32488c = i2;
        int i3 = configuration.densityDpi;
        axVar.copyOnWrite();
        C9354ay ayVar3 = (C9354ay) axVar.instance;
        ayVar3.f32486a |= 4;
        ayVar3.f32489d = i3;
        avVar.copyOnWrite();
        C9352aw awVar5 = (C9352aw) avVar.instance;
        C9354ay ayVar4 = (C9354ay) axVar.build();
        ayVar4.getClass();
        awVar5.f32483f = ayVar4;
        awVar5.f32478a |= 16;
        return (C9352aw) avVar.build();
    }
}
