package com.google.android.apps.gsa.velour;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1646ay.C19601c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* compiled from: PG */
public class DynamicActivityTrampoline extends C118613d {

    /* renamed from: a */
    public static final C59071e f330901a = C59071e.m91332i("com.google.android.apps.gsa.velour.DynamicActivityTrampoline");

    /* renamed from: b */
    public C22871g f330902b;

    /* renamed from: c */
    public C86034c f330903c;

    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aO);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C19601c.m37398e(intent)) {
            C59104x c = f330901a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DynActTrampoline");
            ((C59052c) ((C59052c) c).mo56372aa(34061)).mo56389s("Not a valid dynamic intent: %s", intent);
            ResolveInfo resolveActivity = getPackageManager().resolveActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").addCategory("android.intent.category.DEFAULT"), 0);
            if (!(resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName == null || !resolveActivity.activityInfo.packageName.equals("com.microsoft.launcher"))) {
                startActivity(C89429a.m145445c(this, "and.gsa.launcher.icon.bad"));
            }
            finish();
            return;
        }
        String d = C19601c.m37397d(intent);
        if (intent.hasCategory("android.intent.category.BROWSABLE")) {
            C59104x c2 = f330901a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DynActTrampoline");
            ((C59052c) ((C59052c) c2).mo56372aa(34060)).mo56389s("Dynamic activity not browsable: %s", d);
            finish();
            return;
        }
        intent.setComponent(new ComponentName(this, "com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity"));
        if (d.equals("WeatherActivity") || d.equals("ProxyActivity")) {
            Intent b = C19601c.m37395b(intent);
            new C90873ag(this.f330903c.mo79696a(), this.f330902b, "startTngWeatherActivity", new C118610a(this, b.getStringExtra("source"), b.getStringExtra("location_64"), b.getIntExtra("default_tab_index", 0))).mo85223a(C118611b.f330908a);
        } else {
            startActivity(intent);
        }
        finish();
    }
}
