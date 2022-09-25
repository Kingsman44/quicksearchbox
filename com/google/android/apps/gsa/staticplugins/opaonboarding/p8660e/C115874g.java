package com.google.android.apps.gsa.staticplugins.opaonboarding.p8660e;

import android.accounts.Account;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84026u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.assistant.p3861at.C50144me;
import com.google.assistant.p3861at.acu;
import com.google.assistant.p3861at.acv;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.e.g */
/* compiled from: PG */
public final class C115874g extends C83869ac {

    /* renamed from: a */
    public static final C59071e f321310a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.e.g");

    /* renamed from: b */
    private final SharedPreferences f321311b;

    /* renamed from: c */
    private final l f321312c;

    /* renamed from: d */
    private final C83893b f321313d;

    /* renamed from: e */
    private final PackageManager f321314e;

    /* renamed from: f */
    private final C84026u f321315f;

    /* renamed from: g */
    private final C86124t f321316g;

    /* renamed from: h */
    private C60870cx f321317h;

    public C115874g(SharedPreferences sharedPreferences, l lVar, C83893b bVar, PackageManager packageManager, C84026u uVar, C86124t tVar) {
        this.f321311b = sharedPreferences;
        this.f321312c = lVar;
        this.f321313d = bVar;
        this.f321314e = packageManager;
        this.f321315f = uVar;
        this.f321316g = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        acu acu = (acu) acv.f128920X.createBuilder();
        acu.copyOnWrite();
        acv acv = (acv) acu.instance;
        acv.f128945a |= 2;
        acv.f128949e = true;
        C60870cx j = this.f321312c.j((Account) this.f321313d.mo77278a().mo56111f(), (acv) acu.build(), (C50144me) null, 10, TimeUnit.SECONDS, getClass().getSimpleName());
        this.f321317h = j;
        return C83875ai.m133538c(C58485gu.m89847o(this.f321315f.mo77487a(j, C115871d.f321309a), C83875ai.m133536a(this.f321317h, new C115872e(), new C115873f())));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        if (!TextUtils.isEmpty(this.f321311b.getString("opa_android_sticky_media_app", BuildConfig.FLAVOR))) {
            return false;
        }
        List<ResolveInfo> queryIntentActivities = this.f321314e.queryIntentActivities(new Intent("android.media.action.MEDIA_PLAY_FROM_SEARCH"), 65536);
        C58528ij F = C58528ij.m90006F(this.f321316g.mo79745c(C90014bt.f247058W));
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo next : queryIntentActivities) {
            if (!F.contains(next.activityInfo.packageName)) {
                arrayList.add(next.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        if (arrayList.size() != 1) {
            return true;
        }
        this.f321311b.edit().putString("opa_android_sticky_media_app", (String) arrayList.get(0)).apply();
        return false;
    }
}
