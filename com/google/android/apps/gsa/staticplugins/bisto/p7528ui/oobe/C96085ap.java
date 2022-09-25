package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.gsa.assistant.shared.cb;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.staticplugins.opa.errorui.C108824ah;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ap */
/* compiled from: PG */
public final class C96085ap extends C84036z {

    /* renamed from: a */
    private static final C59071e f269013a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ap");

    /* renamed from: b */
    private final Context f269014b;

    /* renamed from: c */
    private final cb f269015c;

    /* renamed from: d */
    private final String f269016d;

    /* renamed from: e */
    private final C83893b f269017e;

    /* renamed from: f */
    private final C96097ba f269018f;

    /* renamed from: g */
    private final C108824ah f269019g;

    public C96085ap(Context context, C83893b bVar, cb cbVar, String str, C108824ah ahVar, C96325jm jmVar) {
        this.f269014b = context;
        this.f269015c = cbVar;
        this.f269016d = str;
        this.f269017e = bVar;
        this.f269019g = ahVar;
        this.f269018f = jmVar.f269538a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        C58833ax a = this.f269017e.mo77278a();
        if (C124521b.m203981d(this.f269016d, this.f269018f.f269047b)) {
            try {
                this.f269014b.getPackageManager().getPackageInfo("com.google.android.apps.wearables.maestro.companion", 0);
                C59104x b = f269013a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoEmailOptIn");
                ((C59052c) ((C59052c) b).mo56372aa(16947)).mo56389s("%s installed, skipping email sequence", "com.google.android.apps.wearables.maestro.companion");
            } catch (PackageManager.NameNotFoundException unused) {
                C59104x b2 = f269013a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "BistoEmailOptIn");
                ((C59052c) ((C59052c) b2).mo56372aa(16948)).mo56389s("%s not installed, showing email sequence", "com.google.android.apps.wearables.maestro.companion");
            }
            return C58485gu.m89845m();
        }
        if (a.mo56113h() && !this.f269015c.g((Account) this.f269017e.mo77278a().mo56107c())) {
            return C58485gu.m89846n(this.f269019g);
        }
        return C58485gu.m89845m();
    }
}
