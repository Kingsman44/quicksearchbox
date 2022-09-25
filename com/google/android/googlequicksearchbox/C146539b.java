package com.google.android.googlequicksearchbox;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84474e;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60637xg;
import com.google.common.p4552o.C60638xh;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.googlequicksearchbox.b */
/* compiled from: PG */
public final /* synthetic */ class C146539b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ LegacySearchActivity f395755a;

    /* renamed from: b */
    public final /* synthetic */ Intent f395756b;

    public /* synthetic */ C146539b(LegacySearchActivity legacySearchActivity, Intent intent) {
        this.f395755a = legacySearchActivity;
        this.f395756b = intent;
    }

    public final void run() {
        String str;
        LegacySearchActivity legacySearchActivity = this.f395755a;
        Intent intent = this.f395756b;
        if (((C84474e) legacySearchActivity.f395748h.mo27525b()).mo78075T()) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1650;
            C60637xg xgVar = (C60637xg) C60638xh.f164506e.createBuilder();
            intent.getClass();
            String action = intent.getAction();
            action.getClass();
            xgVar.copyOnWrite();
            C60638xh xhVar = (C60638xh) xgVar.instance;
            xhVar.f164508a |= 1;
            xhVar.f164509b = action;
            try {
                ActivityInfo activityInfo = legacySearchActivity.getPackageManager().getActivityInfo(legacySearchActivity.getComponentName(), 128);
                if (activityInfo.metaData != null && activityInfo.metaData.containsKey("alias_name")) {
                    str = activityInfo.metaData.getString("alias_name", BuildConfig.FLAVOR);
                    xgVar.copyOnWrite();
                    C60638xh xhVar2 = (C60638xh) xgVar.instance;
                    str.getClass();
                    xhVar2.f164508a |= 2;
                    xhVar2.f164510c = str;
                    String str2 = (String) legacySearchActivity.f395750j.orElse(BuildConfig.FLAVOR);
                    xgVar.copyOnWrite();
                    C60638xh xhVar3 = (C60638xh) xgVar.instance;
                    str2.getClass();
                    xhVar3.f164508a |= 4;
                    xhVar3.f164511d = str2;
                    C60638xh xhVar4 = (C60638xh) xgVar.build();
                    tzVar.copyOnWrite();
                    C60555uf ufVar2 = (C60555uf) tzVar.instance;
                    xhVar4.getClass();
                    ufVar2.f164213cN = xhVar4;
                    ufVar2.f164256k |= 16;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            str = BuildConfig.FLAVOR;
            xgVar.copyOnWrite();
            C60638xh xhVar22 = (C60638xh) xgVar.instance;
            str.getClass();
            xhVar22.f164508a |= 2;
            xhVar22.f164510c = str;
            String str22 = (String) legacySearchActivity.f395750j.orElse(BuildConfig.FLAVOR);
            xgVar.copyOnWrite();
            C60638xh xhVar32 = (C60638xh) xgVar.instance;
            str22.getClass();
            xhVar32.f164508a |= 4;
            xhVar32.f164511d = str22;
            C60638xh xhVar42 = (C60638xh) xgVar.build();
            tzVar.copyOnWrite();
            C60555uf ufVar22 = (C60555uf) tzVar.instance;
            xhVar42.getClass();
            ufVar22.f164213cN = xhVar42;
            ufVar22.f164256k |= 16;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
        }
    }
}
