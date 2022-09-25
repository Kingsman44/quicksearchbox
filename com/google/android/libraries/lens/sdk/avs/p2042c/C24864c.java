package com.google.android.libraries.lens.sdk.avs.p2042c;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24275a;
import com.google.android.libraries.lens.ondevice.p2018b.p2020b.C24280f;
import com.google.android.libraries.lens.ondevice.p2037n.C24794e;
import com.google.android.libraries.lens.ondevice.p2037n.C24795f;
import com.google.android.libraries.lens.sdk.avs.data.C24867b;
import com.google.android.libraries.lens.sdk.avs.data.C24868c;
import com.google.android.libraries.lens.sdk.avs.data.C24869d;
import com.google.android.libraries.lens.sdk.avs.data.C24871f;
import com.google.android.libraries.lens.sdk.avs.data.C24873h;
import com.google.android.libraries.lens.sdk.avs.data.C24875j;
import com.google.android.libraries.lens.sdk.avs.data.C24876k;
import com.google.android.libraries.lens.sdk.avs.data.C24880o;
import com.google.android.libraries.lens.sdk.avs.data.C24881p;
import com.google.android.libraries.lens.sdk.avs.data.C24887v;
import com.google.android.libraries.lens.sdk.p2045c.p2046a.C24915a;
import com.google.android.libraries.lens.sdk.p2045c.p2046a.C24916b;
import com.google.android.libraries.p1657ba.p1664c.p1668c.p1669a.C19651b;
import com.google.apps.tiktok.account.AccountId;
import com.google.common.base.C58833ax;
import com.google.common.base.C58837ba;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59907bp;
import com.google.common.p4552o.p4563i.C59908bq;
import com.google.common.p4552o.p4563i.C59909br;
import com.google.common.p4552o.p4563i.C59910bs;
import com.google.common.p4552o.p4563i.C59911bt;
import com.google.common.p4552o.p4563i.C59912bu;
import com.google.lens.p4701g.C62317cm;
import com.google.lens.p4701g.C62318cn;
import com.google.lens.p4701g.C62325cu;
import com.google.lens.p4701g.C62326cv;
import com.google.lens.p4701g.C62331d;
import com.google.lens.p4705i.p4706a.C62369aa;
import com.google.lens.p4705i.p4706a.C62370ab;
import com.google.lens.p4705i.p4706a.C62374e;
import com.google.lens.p4705i.p4706a.C62375f;
import com.google.lens.p4705i.p4706a.C62386q;
import com.google.lens.p4705i.p4706a.C62387r;
import com.google.lens.p4705i.p4706a.C62388s;
import com.google.lens.p4705i.p4706a.C62389t;
import com.google.lens.p4705i.p4706a.C62390u;
import com.google.lens.p4705i.p4706a.C62391v;
import com.google.lens.p4705i.p4706a.C62392w;
import com.google.lens.p4705i.p4706a.C62393x;
import com.google.lens.p4707j.C62505ea;
import com.google.protos.p4963bf.p4964a.p4965a.C64551a;
import com.google.protos.p4963bf.p4964a.p4965a.C64578b;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Comparator;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.sdk.avs.c.c */
/* compiled from: PG */
public final class C24864c {
    static {
        Comparator.CC.comparing(C24863b.f67917a);
        C58974d.m91135i("SessionUtils");
    }

    /* renamed from: a */
    public static Bundle m46002a(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("SessionType", "SessionTypeAvs");
        bundle2.putString("EventType", str);
        bundle2.putBundle("Payload", bundle);
        return bundle2;
    }

    /* renamed from: b */
    public static C24280f m46003b(Bitmap bitmap, C24876k kVar) {
        C24887v vVar;
        C24875j b = kVar.mo30088b();
        C58838bb.m90866a(b, "AVS query has no payload.");
        C62369aa aaVar = (C62369aa) C62370ab.f168371f.createBuilder();
        C24880o oVar = null;
        if (b.f67958a.containsKey("web_context")) {
            Bundle bundle = (Bundle) b.f67958a.getParcelable("web_context");
            if (bundle == null) {
                vVar = null;
            } else {
                vVar = new C24887v(bundle);
            }
            vVar.getClass();
            String g = C58837ba.m90858g(vVar.f67973a.getString("current_webpage_url"));
            aaVar.copyOnWrite();
            C62370ab abVar = (C62370ab) aaVar.instance;
            abVar.f168373a |= 1;
            abVar.f168374b = g;
            String string = vVar.f67973a.getString("description");
            aaVar.copyOnWrite();
            C62370ab abVar2 = (C62370ab) aaVar.instance;
            abVar2.f168373a |= 4;
            abVar2.f168376d = C58837ba.m90858g(string);
            String string2 = vVar.f67973a.getString("title");
            aaVar.copyOnWrite();
            C62370ab abVar3 = (C62370ab) aaVar.instance;
            abVar3.f168373a |= 2;
            abVar3.f168375c = C58837ba.m90858g(string2);
        }
        if (b.f67958a.containsKey("screen_context")) {
            Bundle bundle2 = (Bundle) b.f67958a.getParcelable("screen_context");
            if (bundle2 != null) {
                oVar = new C24880o(bundle2);
            }
            oVar.getClass();
            if (oVar.f67961a.containsKey("foreground_app_package_name")) {
                String g2 = C58837ba.m90858g(oVar.f67961a.getString("foreground_app_package_name"));
                aaVar.copyOnWrite();
                C62370ab abVar4 = (C62370ab) aaVar.instance;
                abVar4.f168373a |= 16;
                abVar4.f168377e = g2;
            }
        }
        C24275a aVar = new C24275a();
        aVar.f66317a = C58833ax.m90833j(bitmap);
        aVar.f66320d = C58833ax.m90833j((C62370ab) aaVar.build());
        return aVar.mo29823b();
    }

    /* renamed from: c */
    public static C24795f m46004c(C24869d dVar) {
        if (!dVar.mo30069b()) {
            return C24795f.f67747l;
        }
        int a = dVar.mo30068a();
        if (a == 0) {
            C62374e eVar = (C62374e) C62375f.f168386d.createBuilder();
            C62390u uVar = (C62390u) C62393x.f168428g.createBuilder();
            uVar.copyOnWrite();
            ((C62393x) uVar.instance).f168431b = 0.41f;
            uVar.copyOnWrite();
            ((C62393x) uVar.instance).f168435f = 0;
            uVar.copyOnWrite();
            ((C62393x) uVar.instance).f168433d = 3;
            uVar.copyOnWrite();
            ((C62393x) uVar.instance).f168434e = 10;
            C62391v vVar = (C62391v) C62392w.f168423d.createBuilder();
            vVar.copyOnWrite();
            ((C62392w) vVar.instance).f168427c = true;
            vVar.mo58495b("/m/01g317");
            vVar.mo58495b("/m/03bt1vf");
            vVar.mo58495b("/m/05r655");
            vVar.mo58495b("/m/0jnvp");
            vVar.mo58495b("/m/04yx4");
            vVar.mo58495b("/m/01bl7v");
            vVar.mo58494a("/m/012ysf");
            vVar.mo58494a("/m/01g3x7");
            vVar.mo58494a("/m/0gxl3");
            vVar.mo58494a("/m/04ctx");
            vVar.mo58494a("/m/07cmd");
            vVar.mo58494a("/m/074d1");
            vVar.mo58494a("/m/06c54");
            vVar.mo58494a("/m/06msq");
            vVar.mo58494a("/m/06nrc");
            vVar.mo58494a("/m/06y5r");
            vVar.mo58494a("/m/09rvcxw");
            vVar.mo58494a("/m/0bg7b");
            vVar.mo58494a("/m/0c2jj");
            vVar.mo58494a("/m/083kb");
            vVar.mo58494a("/m/020kz");
            vVar.mo58494a("/j/3s1vm2");
            vVar.mo58494a("/j/1mscwj");
            vVar.mo58494a("/m/01xgg_");
            vVar.mo58494a("/m/02621mk");
            vVar.mo58494a("/m/012pld");
            vVar.mo58494a("/j/bzqyr6");
            vVar.mo58494a("/m/012sqm");
            C62392w wVar = (C62392w) vVar.build();
            uVar.copyOnWrite();
            wVar.getClass();
            ((C62393x) uVar.instance).f168432c = wVar;
            C62388s sVar = (C62388s) C62389t.f168414h.createBuilder();
            sVar.copyOnWrite();
            ((C62389t) sVar.instance).f168417b = 0.5f;
            sVar.copyOnWrite();
            ((C62389t) sVar.instance).f168419d = 0.5f;
            sVar.copyOnWrite();
            ((C62389t) sVar.instance).f168420e = 1;
            sVar.copyOnWrite();
            ((C62389t) sVar.instance).f168421f = 0.1f;
            sVar.copyOnWrite();
            ((C62389t) sVar.instance).f168418c = true;
            C62386q qVar = (C62386q) C62387r.f168411b.createBuilder();
            qVar.copyOnWrite();
            ((C62387r) qVar.instance).f168413a = 1000;
            C62387r rVar = (C62387r) qVar.build();
            sVar.copyOnWrite();
            rVar.getClass();
            ((C62389t) sVar.instance).f168422g = rVar;
            C64551a aVar = (C64551a) C64578b.f175086f.createBuilder();
            aVar.copyOnWrite();
            C64578b bVar = (C64578b) aVar.instance;
            bVar.f175088a |= 1;
            bVar.f175089b = 30;
            aVar.copyOnWrite();
            C64578b bVar2 = (C64578b) aVar.instance;
            bVar2.f175088a |= 2;
            bVar2.f175090c = 0.05d;
            aVar.copyOnWrite();
            C64578b bVar3 = (C64578b) aVar.instance;
            bVar3.f175088a |= 4;
            bVar3.f175091d = 0.5d;
            aVar.copyOnWrite();
            C64578b bVar4 = (C64578b) aVar.instance;
            bVar4.f175088a |= 8;
            bVar4.f175092e = 0.5d;
            C64578b bVar5 = (C64578b) aVar.build();
            sVar.copyOnWrite();
            bVar5.getClass();
            ((C62389t) sVar.instance).f168416a = bVar5;
            uVar.copyOnWrite();
            C62389t tVar = (C62389t) sVar.build();
            tVar.getClass();
            ((C62393x) uVar.instance).f168430a = tVar;
            C62393x xVar = (C62393x) uVar.build();
            eVar.copyOnWrite();
            C62375f fVar = (C62375f) eVar.instance;
            xVar.getClass();
            fVar.f168390c = xVar;
            fVar.f168388a |= 2;
            C62375f fVar2 = (C62375f) eVar.build();
            C62317cm cmVar = (C62317cm) C62318cn.f168229c.createBuilder();
            C19651b bVar6 = C19651b.f54657d;
            cmVar.copyOnWrite();
            C62318cn cnVar = (C62318cn) cmVar.instance;
            bVar6.getClass();
            cnVar.f168232b = bVar6;
            cnVar.f168231a |= 1;
            C62318cn cnVar2 = (C62318cn) cmVar.build();
            C24794e eVar2 = (C24794e) C24795f.f67747l.createBuilder();
            eVar2.copyOnWrite();
            C24795f fVar3 = (C24795f) eVar2.instance;
            fVar2.getClass();
            fVar3.f67759k = fVar2;
            fVar3.f67749a |= 512;
            eVar2.copyOnWrite();
            C24795f fVar4 = (C24795f) eVar2.instance;
            cnVar2.getClass();
            fVar4.f67754f = cnVar2;
            fVar4.f67749a |= 16;
            return (C24795f) eVar2.build();
        } else if (a == 1) {
            C62374e eVar3 = (C62374e) C62375f.f168386d.createBuilder();
            C62390u uVar2 = (C62390u) C62393x.f168428g.createBuilder();
            uVar2.copyOnWrite();
            ((C62393x) uVar2.instance).f168431b = 0.41f;
            uVar2.copyOnWrite();
            ((C62393x) uVar2.instance).f168435f = 0;
            uVar2.copyOnWrite();
            ((C62393x) uVar2.instance).f168433d = 3;
            uVar2.copyOnWrite();
            ((C62393x) uVar2.instance).f168434e = 3;
            C62388s sVar2 = (C62388s) C62389t.f168414h.createBuilder();
            sVar2.copyOnWrite();
            ((C62389t) sVar2.instance).f168417b = 0.5f;
            sVar2.copyOnWrite();
            ((C62389t) sVar2.instance).f168419d = 0.5f;
            sVar2.copyOnWrite();
            ((C62389t) sVar2.instance).f168420e = 1;
            sVar2.copyOnWrite();
            ((C62389t) sVar2.instance).f168421f = 0.1f;
            sVar2.copyOnWrite();
            ((C62389t) sVar2.instance).f168418c = true;
            C64551a aVar2 = (C64551a) C64578b.f175086f.createBuilder();
            aVar2.copyOnWrite();
            C64578b bVar7 = (C64578b) aVar2.instance;
            bVar7.f175088a |= 1;
            bVar7.f175089b = 30;
            aVar2.copyOnWrite();
            C64578b bVar8 = (C64578b) aVar2.instance;
            bVar8.f175088a |= 2;
            bVar8.f175090c = 0.05d;
            aVar2.copyOnWrite();
            C64578b bVar9 = (C64578b) aVar2.instance;
            bVar9.f175088a |= 4;
            bVar9.f175091d = 0.5d;
            aVar2.copyOnWrite();
            C64578b bVar10 = (C64578b) aVar2.instance;
            bVar10.f175088a |= 8;
            bVar10.f175092e = 0.5d;
            C64578b bVar11 = (C64578b) aVar2.build();
            sVar2.copyOnWrite();
            bVar11.getClass();
            ((C62389t) sVar2.instance).f168416a = bVar11;
            uVar2.copyOnWrite();
            C62389t tVar2 = (C62389t) sVar2.build();
            tVar2.getClass();
            ((C62393x) uVar2.instance).f168430a = tVar2;
            C62393x xVar2 = (C62393x) uVar2.build();
            eVar3.copyOnWrite();
            C62375f fVar5 = (C62375f) eVar3.instance;
            xVar2.getClass();
            fVar5.f168390c = xVar2;
            fVar5.f168388a |= 2;
            C62375f fVar6 = (C62375f) eVar3.build();
            C62325cu cuVar = (C62325cu) C62326cv.f168243c.createBuilder();
            C19651b bVar12 = C19651b.f54657d;
            cuVar.copyOnWrite();
            C62326cv cvVar = (C62326cv) cuVar.instance;
            bVar12.getClass();
            cvVar.f168246b = bVar12;
            cvVar.f168245a |= 1;
            C62326cv cvVar2 = (C62326cv) cuVar.build();
            C62317cm cmVar2 = (C62317cm) C62318cn.f168229c.createBuilder();
            C19651b bVar13 = C19651b.f54657d;
            cmVar2.copyOnWrite();
            C62318cn cnVar3 = (C62318cn) cmVar2.instance;
            bVar13.getClass();
            cnVar3.f168232b = bVar13;
            cnVar3.f168231a |= 1;
            C62318cn cnVar4 = (C62318cn) cmVar2.build();
            C24794e eVar4 = (C24794e) C24795f.f67747l.createBuilder();
            eVar4.copyOnWrite();
            C24795f fVar7 = (C24795f) eVar4.instance;
            fVar6.getClass();
            fVar7.f67759k = fVar6;
            fVar7.f67749a |= 512;
            eVar4.copyOnWrite();
            C24795f fVar8 = (C24795f) eVar4.instance;
            cvVar2.getClass();
            fVar8.f67753e = cvVar2;
            fVar8.f67749a |= 8;
            eVar4.copyOnWrite();
            C24795f fVar9 = (C24795f) eVar4.instance;
            cnVar4.getClass();
            fVar9.f67754f = cnVar4;
            fVar9.f67749a |= 16;
            return (C24795f) eVar4.build();
        } else if (a != 2) {
            return C24795f.f67747l;
        } else {
            C62325cu cuVar2 = (C62325cu) C62326cv.f168243c.createBuilder();
            C19651b bVar14 = C19651b.f54657d;
            cuVar2.copyOnWrite();
            C62326cv cvVar3 = (C62326cv) cuVar2.instance;
            bVar14.getClass();
            cvVar3.f168246b = bVar14;
            cvVar3.f168245a |= 1;
            C62326cv cvVar4 = (C62326cv) cuVar2.build();
            C62317cm cmVar3 = (C62317cm) C62318cn.f168229c.createBuilder();
            C19651b bVar15 = C19651b.f54657d;
            cmVar3.copyOnWrite();
            C62318cn cnVar5 = (C62318cn) cmVar3.instance;
            bVar15.getClass();
            cnVar5.f168232b = bVar15;
            cnVar5.f168231a |= 1;
            C62318cn cnVar6 = (C62318cn) cmVar3.build();
            C24794e eVar5 = (C24794e) C24795f.f67747l.createBuilder();
            eVar5.copyOnWrite();
            C24795f fVar10 = (C24795f) eVar5.instance;
            cvVar4.getClass();
            fVar10.f67753e = cvVar4;
            fVar10.f67749a |= 8;
            eVar5.copyOnWrite();
            C24795f fVar11 = (C24795f) eVar5.instance;
            cnVar6.getClass();
            fVar11.f67754f = cnVar6;
            fVar11.f67749a |= 16;
            return (C24795f) eVar5.build();
        }
    }

    /* renamed from: d */
    public static C24868c m46005d(C24869d dVar) {
        if (dVar.mo30069b()) {
            if (dVar.mo30068a() == 2) {
                C24868c cVar = new C24868c();
                C24867b bVar = new C24867b();
                bVar.mo30064b();
                bVar.mo30063a(false);
                cVar.mo30066b(bVar);
                cVar.mo30067c(1);
                return cVar;
            } else if (dVar.mo30068a() == 1) {
                C24868c cVar2 = new C24868c();
                C24867b bVar2 = new C24867b();
                bVar2.mo30064b();
                bVar2.mo30063a(false);
                cVar2.mo30066b(bVar2);
                cVar2.mo30067c(1);
                return cVar2;
            } else if (dVar.mo30068a() == 0) {
                C24868c cVar3 = new C24868c();
                C24867b bVar3 = new C24867b();
                bVar3.mo30064b();
                bVar3.mo30063a(true);
                cVar3.mo30066b(bVar3);
                cVar3.mo30067c(0);
                return cVar3;
            }
        }
        return new C24868c();
    }

    /* renamed from: e */
    public static C24873h m46006e(C24881p pVar) {
        C24873h hVar;
        if (pVar.f67962a.containsKey("logging_modalities")) {
            Bundle bundle = (Bundle) pVar.f67962a.getParcelable("logging_modalities");
            if (bundle == null) {
                hVar = null;
            } else {
                hVar = new C24873h(bundle);
            }
            hVar.getClass();
            return hVar;
        }
        C24873h hVar2 = new C24873h();
        hVar2.mo30082c(false);
        hVar2.f67932a.putBoolean("deidentified_appflow_logging_enabled", false);
        hVar2.f67932a.putBoolean("debug_mode_logging_enabled", false);
        return hVar2;
    }

    /* renamed from: f */
    public static C59912bu m46007f(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        C58838bb.m90884s(activityManager != null, "Expected non-null ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        C59910bs bsVar = (C59910bs) C59911bt.f161919e.createBuilder();
        long j = memoryInfo.totalMem;
        bsVar.copyOnWrite();
        C59911bt btVar = (C59911bt) bsVar.instance;
        btVar.f161921a |= 1;
        btVar.f161922b = j / 1000;
        long j2 = memoryInfo.availMem;
        bsVar.copyOnWrite();
        C59911bt btVar2 = (C59911bt) bsVar.instance;
        btVar2.f161921a |= 2;
        btVar2.f161923c = j2 / 1000;
        boolean z = memoryInfo.lowMemory;
        bsVar.copyOnWrite();
        C59911bt btVar3 = (C59911bt) bsVar.instance;
        btVar3.f161921a |= 4;
        btVar3.f161924d = z;
        C59911bt btVar4 = (C59911bt) bsVar.build();
        C59908bq bqVar = (C59908bq) C59909br.f161915c.createBuilder();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        bqVar.copyOnWrite();
        C59909br brVar = (C59909br) bqVar.instance;
        brVar.f161917a |= 1;
        brVar.f161918b = availableProcessors;
        C59909br brVar2 = (C59909br) bqVar.build();
        C59907bp bpVar = (C59907bp) C59912bu.f161925d.createBuilder();
        bpVar.copyOnWrite();
        C59912bu buVar = (C59912bu) bpVar.instance;
        btVar4.getClass();
        buVar.f161928b = btVar4;
        buVar.f161927a |= 1;
        bpVar.copyOnWrite();
        C59912bu buVar2 = (C59912bu) bpVar.instance;
        brVar2.getClass();
        buVar2.f161929c = brVar2;
        buVar2.f161927a |= 2;
        return (C59912bu) bpVar.build();
    }

    /* renamed from: g */
    public static C62331d m46008g(C24869d dVar) {
        if (!dVar.mo30069b()) {
            return C62331d.UNKNOWN;
        }
        int a = dVar.mo30068a();
        if (a == 0) {
            return C62331d.AVS_GLEAM_GENERATION_CASCADE;
        }
        if (a == 1) {
            return C62331d.VISUAL_SHOPPING_INTENT_CASCADE;
        }
        if (a != 2) {
            return C62331d.UNKNOWN;
        }
        return C62331d.PROACTIVE_CASCADE_SHOPPING_INTENT;
    }

    /* renamed from: h */
    public static C62505ea m46009h(C24881p pVar) {
        C24869d a = pVar.mo30103a();
        a.getClass();
        if (!a.mo30069b()) {
            return C62505ea.SURFACE_UNSPECIFIED;
        }
        int a2 = a.mo30068a();
        if (a2 == 0) {
            return C62505ea.GOOGLE_PHOTOS;
        }
        if (a2 == 1) {
            return C62505ea.ASSISTANT;
        }
        if (a2 == 2) {
            return C62505ea.SEARCH;
        }
        if (a2 != 3) {
            return C62505ea.SURFACE_UNSPECIFIED;
        }
        return C62505ea.CHROMIUM;
    }

    /* renamed from: i */
    public static Optional m46010i(C24881p pVar) {
        C24869d a = pVar.mo30103a();
        a.getClass();
        if (!a.f67929a.containsKey("account_id")) {
            return Optional.empty();
        }
        AccountId accountId = (AccountId) a.f67929a.getParcelable("account_id");
        accountId.getClass();
        return Optional.m71637of(accountId);
    }

    /* renamed from: j */
    public static Optional m46011j(C24915a aVar, C24876k kVar) {
        C24875j b = kVar.mo30088b();
        C58838bb.m90866a(b, "AVS query has no payload.");
        C24871f a = b.mo30085a();
        C58838bb.m90866a(a, "AVS query has null image.");
        if (a.f67931a.containsKey("uri")) {
            Uri uri = (Uri) a.f67931a.getParcelable("uri");
            uri.getClass();
            return C24916b.m46124a(aVar, uri);
        } else if (a.mo30076b()) {
            Bitmap a2 = a.mo30075a();
            a2.getClass();
            return Optional.m71637of(a2);
        } else {
            throw new IllegalArgumentException("AVS query has no bitmap.");
        }
    }

    /* renamed from: k */
    public static boolean m46012k(List list, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.equals(str) || (str2.endsWith("*") && str.startsWith(str2.substring(0, str2.length() - 1)))) {
                return true;
            }
        }
        return false;
    }
}
