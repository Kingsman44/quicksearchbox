package com.google.apps.tiktok.contrib.p3629c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C1815be;
import androidx.navigation.C3820as;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45963aa;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.apps.tiktok.contrib.c.v */
/* compiled from: PG */
public final class C46501v {

    /* renamed from: a */
    public final C3820as f121651a;

    /* renamed from: b */
    public final Context f121652b;

    /* renamed from: c */
    private final C58833ax f121653c;

    public C46501v(C58833ax axVar, Context context) {
        C3820as asVar = new C3820as(context);
        this.f121651a = asVar;
        this.f121653c = axVar;
        this.f121652b = context;
        Bundle bundle = new Bundle();
        C46493n.m82877b(axVar, bundle);
        asVar.mo8081d(bundle);
    }

    /* renamed from: a */
    public final List mo50513a() {
        C1815be a = this.f121651a.mo8078a();
        int size = a.f5643a.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent((Intent) a.f5643a.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new Intent((Intent) a.f5643a.get(i));
            }
        }
        List<Intent> asList = Arrays.asList(intentArr);
        for (Intent a2 : asList) {
            C45963aa.m82131a(a2, (AccountId) ((C58847bk) this.f121653c).f156646a);
        }
        return asList;
    }

    /* renamed from: b */
    public final void mo50514b(int i, Bundle bundle) {
        C46493n.m82877b(this.f121653c, bundle);
        this.f121651a.mo8080c(i, bundle);
    }
}
