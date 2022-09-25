package com.google.android.apps.search.googleapp.p10117aa;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import com.google.android.apps.search.googleapp.p10117aa.p10121d.C133118a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.web.profile.C44070e;
import com.google.android.libraries.web.profile.C44074i;
import com.google.android.libraries.web.weblayer.p3448b.C44127c;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.contrib.work.C46506a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.Set;

/* renamed from: com.google.android.apps.search.googleapp.aa.au */
/* compiled from: PG */
public final class C133103au {

    /* renamed from: a */
    public static final C46690ah f362875a = new C46885y("tabs");

    /* renamed from: b */
    public final C42876ab f362876b;

    /* renamed from: c */
    public final C60887da f362877c;

    /* renamed from: d */
    public final C60888db f362878d;

    /* renamed from: e */
    public final C46778cv f362879e;

    /* renamed from: f */
    public final C44070e f362880f;

    /* renamed from: g */
    public final C44074i f362881g;

    /* renamed from: h */
    public final C21370a f362882h;

    /* renamed from: i */
    public final C133118a f362883i;

    /* renamed from: j */
    private final Context f362884j;

    /* renamed from: k */
    private final AccountId f362885k;

    /* renamed from: l */
    private final C46506a f362886l;

    /* renamed from: m */
    private final C44127c f362887m;

    public C133103au(Context context, C60887da daVar, C60888db dbVar, C46778cv cvVar, C42876ab abVar, AccountId accountId, C21370a aVar, C44127c cVar, C44070e eVar, C44074i iVar, C46506a aVar2, C133118a aVar3) {
        this.f362884j = context;
        this.f362876b = abVar;
        this.f362877c = daVar;
        this.f362878d = dbVar;
        this.f362879e = cvVar;
        this.f362885k = accountId;
        this.f362880f = eVar;
        this.f362881g = iVar;
        this.f362882h = aVar;
        this.f362886l = aVar2;
        this.f362887m = cVar;
        this.f362883i = aVar3;
    }

    /* renamed from: a */
    public static int m216064a(C133127l lVar, String str) {
        for (int i = 0; i < lVar.f362935b.size(); i++) {
            if (((C133125j) lVar.f362935b.get(i)).f362925e.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final C60870cx mo110973b() {
        C60870cx d = this.f362876b.mo46042d();
        C133133r rVar = new C133133r(this);
        return C60922j.m93045h(d, C47810es.m84966f(rVar), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo110974c(Set set) {
        C60870cx a = this.f362876b.mo46039a(new C133141z(set), C60826bg.f164896a);
        this.f362879e.mo50787a(a, f362875a);
        return C47638k.m84753d(a).mo51521b(new C133083aa(this, set), C60826bg.f164896a);
    }

    /* renamed from: d */
    public final C60870cx mo110975d(Set set) {
        C60870cx a = this.f362887m.mo47087a();
        C133090ah ahVar = new C133090ah(this, set);
        return C60922j.m93045h(a, C47810es.m84966f(ahVar), this.f362878d);
    }

    /* renamed from: e */
    public final C60870cx mo110976e(C133124i iVar, Bitmap bitmap, boolean z) {
        C60870cx cxVar;
        C60870cx cxVar2;
        if (bitmap == null) {
            cxVar = mo110977f(iVar, z);
        } else {
            DisplayMetrics displayMetrics = this.f362884j.getResources().getDisplayMetrics();
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) / 2;
            if (bitmap.getWidth() > min || bitmap.getHeight() > min) {
                cxVar2 = this.f362877c.mo19399b(C47810es.m84978r(new C133091ai(bitmap, min)));
            } else {
                cxVar2 = C60856cj.m92900i(bitmap);
            }
            C133089ag agVar = new C133089ag(this, iVar, z);
            cxVar = C60922j.m93045h(cxVar2, C47810es.m84966f(agVar), C60826bg.f164896a);
        }
        this.f362879e.mo50787a(cxVar, f362875a);
        return cxVar;
    }

    /* renamed from: f */
    public final C60870cx mo110977f(C133124i iVar, boolean z) {
        C46459k.m82829b(this.f362886l.mo50518b(this.f362885k, C133117d.m216080a()), "Failed to enqueue Tabs auto deletion work.", new Object[0]);
        return this.f362876b.mo46039a(new C133088af(this, iVar, z), C60826bg.f164896a);
    }
}
