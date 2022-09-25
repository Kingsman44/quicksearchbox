package com.google.android.libraries.locale.manager;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import androidx.core.p094f.C1897j;
import androidx.work.C4378ab;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.WorkerParameters;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.languageprofile.C144453m;
import com.google.android.gms.languageprofile.ClientLanguageSettings;
import com.google.android.gms.languageprofile.p10819a.C144441e;
import com.google.android.libraries.p3339v.C43205e;
import com.google.common.base.C58819aj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;

/* compiled from: PG */
public final class SyncApplicationLocalesWorker extends C4378ab {
    public SyncApplicationLocalesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        C60870cx cxVar;
        Context context = this.f13999c;
        if (Build.VERSION.SDK_INT >= 33) {
            C144453m mVar = new C144453m(context);
            ArrayList arrayList = new ArrayList();
            C1897j b = C1897j.m5165b(((LocaleManager) context.getSystemService("locale")).getApplicationLocales().toLanguageTags());
            for (int i = 0; i < b.f5774b.f5775a.size(); i++) {
                arrayList.add(C144441e.m234701a(b.f5774b.f5775a.get(i)));
            }
            cxVar = C60846c.m92878g(C43205e.m76192b(mVar.mo119925b(new ClientLanguageSettings(arrayList))), C143842n.class, new C58819aj((Object) null), C60826bg.f164896a);
        } else {
            cxVar = C60866ct.f164955a;
        }
        return C60922j.m93044g(cxVar, new C58819aj(new C4645z(C4632m.f14549a)), C60826bg.f164896a);
    }
}
