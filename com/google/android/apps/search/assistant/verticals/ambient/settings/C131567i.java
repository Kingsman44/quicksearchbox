package com.google.android.apps.search.assistant.verticals.ambient.settings;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.assistant.settings.features.d.ak;
import com.google.android.apps.gsa.p8867w.p8871b.C118734a;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.libraries.p8972f.p8973a.C119364a;
import com.google.android.apps.search.assistant.libraries.p8972f.p8973a.C119369f;
import com.google.android.apps.search.assistant.platform.p9141h.p9162h.C121125c;
import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.assistant.p3886c.C50794cr;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.ali;
import com.google.common.p4552o.alj;
import com.google.common.p4552o.alk;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.settings.i */
/* compiled from: PG */
public final class C131567i {

    /* renamed from: a */
    public static final C58528ij f359464a = C58528ij.m90015O(C50794cr.WEATHER, C50794cr.TIPS, C50794cr.OOBE, C50794cr.WEATHER_ALERT, C50794cr.SPORTS, C50794cr.STOCK_PRICE_CHANGE, new C50794cr[0]);

    /* renamed from: b */
    public final C60887da f359465b;

    /* renamed from: c */
    public final Context f359466c;

    /* renamed from: d */
    public final C118734a f359467d;

    /* renamed from: e */
    public final C121125c f359468e;

    /* renamed from: f */
    private final C58974d f359469f;

    /* renamed from: g */
    private final PackageManager f359470g;

    /* renamed from: h */
    private final C131575p f359471h;

    /* renamed from: i */
    private final C119369f f359472i;

    public C131567i(C118734a aVar, C60887da daVar, C130603a aVar2, C131575p pVar, PackageManager packageManager, C121125c cVar, C119369f fVar, Context context) {
        this.f359467d = aVar;
        this.f359465b = daVar;
        this.f359469f = aVar2.mo109740b(this);
        this.f359470g = packageManager;
        this.f359471h = pVar;
        this.f359468e = cVar;
        this.f359472i = fVar;
        this.f359466c = context;
    }

    /* renamed from: a */
    public static alk m213966a(ali ali, boolean z) {
        alj alj = (alj) alk.f159060d.createBuilder();
        alj.copyOnWrite();
        alk alk = (alk) alj.instance;
        alk.f159063b = ali.f159059C;
        alk.f159062a |= 1;
        alj.copyOnWrite();
        alk alk2 = (alk) alj.instance;
        alk2.f159062a |= 2;
        alk2.f159064c = z;
        return (alk) alj.build();
    }

    /* renamed from: b */
    public final C60870cx mo110190b() {
        C60870cx a = this.f359467d.mo103943a();
        C60870cx a2 = this.f359468e.mo105058a();
        C119369f fVar = this.f359472i;
        C119364a aVar = new C119364a();
        aVar.f332802a = 2;
        C60870cx a3 = fVar.mo104311a(aVar.mo104306a());
        C60870cx b = this.f359471h.mo110195b();
        C60870cx a4 = this.f359471h.mo110194a();
        return C47638k.m84753d(a, a2, a3, b, a4).mo51520a(new C131565g(this, a, a2, a3, b, a4), this.f359465b);
    }

    /* renamed from: c */
    public final boolean mo110191c(ak akVar, C50794cr crVar) {
        C50794cr crVar2 = C50794cr.UNDEFINED;
        switch (crVar.ordinal()) {
            case 0:
                break;
            case 1:
            case 35:
                return (akVar.a & 4194304) == 0 || akVar.x;
            case 2:
            case 8:
            case 37:
            case 38:
            case 39:
                return (akVar.b & 16) == 0 || akVar.L;
            case 3:
            case 24:
                return (akVar.a & 8) == 0 || akVar.e;
            case 4:
            case 36:
                return (akVar.a & 4) == 0 || akVar.d;
            case 5:
                return (akVar.a & LinearLayoutManager.INVALID_OFFSET) == 0 || akVar.G;
            case 6:
            case 9:
            case 21:
            case 32:
            case 42:
            case 44:
                ((C58970a) ((C58970a) this.f359469f.mo56226d()).mo56372aa(39065)).mo56389s("This card is not supported AmbientPreferencesData and is disabled by default, cardType: %s", crVar.name());
                return false;
            case 7:
                return this.f359470g.hasSystemFeature("com.google.android.feature.PIXEL_EXPERIENCE");
            case 10:
                return (akVar.a & 4096) == 0 || akVar.n;
            case 11:
                return true;
            case 12:
                return this.f359470g.hasSystemFeature("com.google.android.googlequicksearchbox.SMARTSPACE_DEVICE_FEATURE");
            case 13:
                return (akVar.a & 268435456) == 0 || akVar.D;
            case 14:
                return (akVar.b & 1) == 0 || akVar.H;
            case 15:
                return (akVar.a & 16777216) == 0 || akVar.z;
            case 16:
            case 20:
                return (akVar.a & 1073741824) == 0 || akVar.F;
            case 17:
            case 26:
                return (akVar.a & 1048576) == 0 || akVar.v;
            case 18:
            case 27:
            case 41:
                return (akVar.a & 65536) == 0 || akVar.r;
            case 19:
                return (akVar.a & C89885b.S3REQUEST_VALUE) == 0 || akVar.s;
            case 22:
                return (akVar.a & 16384) == 0 || akVar.p;
            case 23:
                return (akVar.a & 512) == 0 || akVar.k;
            case 25:
                return (akVar.a & 134217728) == 0 || akVar.C;
            case 28:
                return (akVar.a & 256) == 0 || akVar.j;
            case 29:
                return (akVar.a & 128) == 0 || akVar.i;
            case 30:
                return (akVar.b & 64) == 0 || akVar.N;
            case 31:
                return (akVar.b & 256) == 0 || akVar.P;
            case 33:
            case 34:
                return (akVar.b & 512) == 0 || akVar.Q;
            case 40:
                return (akVar.b & 2048) == 0 || akVar.S;
            case 43:
                return (akVar.b & 128) == 0 || akVar.O;
            default:
                return false;
        }
    }
}
