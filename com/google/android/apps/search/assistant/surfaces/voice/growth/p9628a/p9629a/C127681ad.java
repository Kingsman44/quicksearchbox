package com.google.android.apps.search.assistant.surfaces.voice.growth.p9628a.p9629a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9141h.p9148c.C121011a;
import com.google.android.apps.search.assistant.platform.p9141h.p9156f.C121090b;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36973a;
import com.google.android.libraries.search.assistant.p2828y.p2848i.C36979g;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.C47245e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52265li;
import com.google.assistant.p3897e.p3921j.ame;
import com.google.assistant.p3897e.p3921j.amf;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ad */
/* compiled from: PG */
public final class C127681ad {

    /* renamed from: a */
    public static final C59071e f351536a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ad");

    /* renamed from: d */
    private static final amf f351537d;

    /* renamed from: b */
    public final Context f351538b;

    /* renamed from: c */
    public final String f351539c;

    /* renamed from: e */
    private final C68214a f351540e;

    /* renamed from: f */
    private final AccountId f351541f;

    /* renamed from: g */
    private final String f351542g;

    /* renamed from: h */
    private final boolean f351543h;

    /* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.a.a.ad$a */
    /* compiled from: PG */
    public interface C127682a {
        /* renamed from: aj */
        C121011a mo108177aj();

        /* renamed from: fE */
        C36979g mo108178fE();
    }

    static {
        ame ame = (ame) amf.f135365e.createBuilder();
        ame.copyOnWrite();
        amf amf = (amf) ame.instance;
        amf.f135367a |= 2;
        amf.f135369c = "OPA_AGSA";
        f351537d = (amf) ame.build();
    }

    public C127681ad(C68214a aVar, AccountId accountId, Context context, String str, boolean z) {
        this.f351540e = aVar;
        this.f351541f = accountId;
        this.f351538b = context;
        this.f351542g = str;
        this.f351543h = z;
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.ID;
        String b = m208737b("com.android.chrome", context);
        String b2 = m208737b(context.getPackageName(), context);
        this.f351539c = "Mozilla/5.0 (Linux; Android " + str2 + "; Build/" + str3 + ") AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/" + b + " Mobile Safari/537.36 GSA/" + b2;
    }

    /* renamed from: b */
    private static String m208737b(String str, Context context) {
        PackageInfo packageInfo;
        try {
            if (Build.VERSION.SDK_INT < 33) {
                packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0));
            }
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            C59104x d = f351536a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "OlcReqGen");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(37608)).mo56386p("Cannot find package name.");
            return "0.0.0.0";
        }
    }

    /* renamed from: a */
    public final C60870cx mo108176a(Bundle bundle) {
        C60870cx cxVar;
        C60870cx a = ((C127682a) C47245e.m84045a(this.f351538b, C127682a.class, this.f351541f)).mo108177aj().mo104231a();
        if (this.f351543h) {
            C58976aa aaVar = C58975e.f156826a;
            cxVar = ((C121090b) this.f351540e.mo27525b()).mo105044b();
        } else {
            C58976aa aaVar2 = C58975e.f156826a;
            cxVar = C60856cj.m92900i(Locale.getDefault());
        }
        C60870cx cxVar2 = cxVar;
        C36979g fE = ((C127682a) C47245e.m84045a(this.f351538b, C127682a.class, this.f351541f)).mo108178fE();
        C36973a aVar = new C36973a();
        aVar.mo40502d(f351537d);
        aVar.mo40501c(C52265li.f137167I);
        aVar.mo40500b();
        C60870cx a2 = fE.mo40506a(aVar.mo40499a());
        String string = bundle.getString("olc.module_order", this.f351542g);
        return C60856cj.m92895d(a, cxVar2, a2).mo57334a(C47810es.m84978r(new C127680ac(this, a, a2, cxVar2, string)), C60826bg.f164896a);
    }
}
