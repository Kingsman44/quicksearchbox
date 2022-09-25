package com.google.android.apps.gsa.velour.dynamichosts;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;
import com.google.android.apps.gsa.shared.util.ProguardMustNotDelete;
import com.google.android.apps.gsa.velour.dynamichosts.p8860a.C118615a;
import com.google.android.libraries.p1646ay.C19599a;
import com.google.android.libraries.p1646ay.C19600b;
import com.google.apps.tiktok.inject.C47266f;
import java.util.Map;
import p5460g.p5461a.C69464a;

@ProguardMustNotDelete
/* compiled from: PG */
public class VelvetDynamicHostActivity extends C19599a {

    /* renamed from: a */
    public Map f330912a;

    /* renamed from: com.google.android.apps.gsa.velour.dynamichosts.VelvetDynamicHostActivity$a */
    /* compiled from: PG */
    public interface C118614a {
        /* renamed from: rb */
        void mo103791rb(VelvetDynamicHostActivity velvetDynamicHostActivity);
    }

    /* renamed from: a */
    public final C19600b mo24852a(String str) {
        C69464a aVar = (C69464a) this.f330912a.get(str);
        if (aVar == null) {
            return null;
        }
        return ((C118615a) aVar.mo17428b()).mo87749a();
    }

    /* access modifiers changed from: protected */
    public final void attachBaseContext(Context context) {
        ((C118614a) C47266f.m84076a(context.getApplicationContext(), C118614a.class)).mo103791rb(this);
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C74504a.m120462a(f.aS);
        super.onCreate(bundle);
    }
}
