package com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1156b.p1157a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1154d.p1156b.C15684a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5218j.p5219a.C66698ab;
import com.google.speech.p5218j.p5219a.C66699ac;
import com.google.speech.p5218j.p5219a.C66700ad;
import com.google.speech.p5218j.p5219a.C66701ae;
import com.google.speech.p5218j.p5219a.C66702af;
import com.google.speech.p5218j.p5219a.C66707ak;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.d.b.a.a */
/* compiled from: PG */
public final class C15685a implements C15684a {

    /* renamed from: a */
    private static final C59071e f46814a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.d.b.a.a");

    /* renamed from: b */
    private final Context f46815b;

    public C15685a(Context context) {
        this.f46815b = context;
    }

    /* renamed from: a */
    public final C60870cx mo22506a() {
        Intent action = new Intent().setAction("android.intent.action.MAIN");
        action.addCategory("android.intent.category.LAUNCHER");
        List<ResolveInfo> queryIntentActivities = this.f46815b.getPackageManager().queryIntentActivities(action, 0);
        C66699ac acVar = (C66699ac) C66700ad.f181439d.createBuilder();
        acVar.copyOnWrite();
        C66700ad adVar = (C66700ad) acVar.instance;
        adVar.f181441a |= 1;
        adVar.f181442b = "$APP";
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            try {
                PackageInfo packageInfo = this.f46815b.getPackageManager().getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 0);
                if (packageInfo.applicationInfo != null && packageInfo.applicationInfo.enabled) {
                    String str = packageInfo.applicationInfo.name;
                    if (!C58837ba.m90859h(str)) {
                        C66701ae aeVar = (C66701ae) C66702af.f181445c.createBuilder();
                        aeVar.copyOnWrite();
                        C66702af afVar = (C66702af) aeVar.instance;
                        str.getClass();
                        afVar.f181447a |= 1;
                        afVar.f181448b = str;
                        acVar.mo59708b((C66702af) aeVar.build());
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                ((C59052c) ((C59052c) ((C59052c) f46814a.mo56225c()).mo56382g(e)).mo56372aa(46269)).mo56386p("PackageManager.NameNotFoundException encountered while getting apps installed on device.");
            }
        }
        C66698ab abVar = (C66698ab) C66707ak.f181458e.createBuilder();
        abVar.copyOnWrite();
        C66707ak akVar = (C66707ak) abVar.instance;
        akVar.f181460a |= 1;
        akVar.f181463d = "app-names";
        abVar.copyOnWrite();
        C66707ak akVar2 = (C66707ak) abVar.instance;
        C66700ad adVar2 = (C66700ad) acVar.build();
        adVar2.getClass();
        akVar2.f181462c = adVar2;
        akVar2.f181461b = 3;
        return C60856cj.m92900i((C66707ak) abVar.build());
    }
}
