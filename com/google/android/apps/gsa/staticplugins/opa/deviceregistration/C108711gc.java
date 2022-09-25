package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gc */
/* compiled from: PG */
public final class C108711gc extends C83869ac {

    /* renamed from: a */
    private static final C59071e f302331a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.gc");

    /* renamed from: b */
    private final Context f302332b;

    /* renamed from: c */
    private final String f302333c;

    /* renamed from: d */
    private final String f302334d;

    /* renamed from: e */
    private final boolean f302335e;

    public C108711gc(Context context, String str, String str2, boolean z) {
        this.f302332b = context;
        this.f302333c = str;
        this.f302334d = str2;
        this.f302335e = z;
    }

    /* renamed from: f */
    private final Intent m180795f() {
        String str = this.f302333c;
        if (str == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str)).setFlags(268435456).setPackage(this.f302334d);
        PackageManager packageManager = this.f302332b.getPackageManager();
        if (packageManager != null && !C58837ba.m90859h(this.f302333c)) {
            if (intent.resolveActivity(packageManager) != null) {
                return intent;
            }
            if (this.f302334d != null) {
                intent.setPackage((String) null);
                if (intent.resolveActivity(packageManager) != null) {
                    return intent;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133542g(new C108710gb(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        return m180795f() != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo97075d() {
        if (!C58837ba.m90859h(this.f302333c)) {
            try {
                if (this.f302335e) {
                    mo97076e(0);
                    return;
                }
                Intent f = m180795f();
                if (f != null) {
                    this.f302332b.startActivity(f);
                }
            } catch (ActivityNotFoundException e) {
                C59104x c = f302331a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "StartSrcRtrnUrlSq");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(24224)).mo56386p("Could not start return activity");
            }
        }
    }

    /* renamed from: e */
    public final void mo97076e(int i) {
        Intent f;
        if (this.f302335e && mo77208b() && (f = m180795f()) != null) {
            String str = this.f302333c;
            str.getClass();
            f.setData(Uri.parse(str).buildUpon().appendQueryParameter("status", String.valueOf(i)).build());
            this.f302332b.startActivity(f);
        }
    }
}
