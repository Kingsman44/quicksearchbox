package com.google.android.libraries.social.peoplekit.common.p3283e;

import android.content.Context;
import com.google.android.gms.phenotype.C145722af;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146042v;

/* renamed from: com.google.android.libraries.social.peoplekit.common.e.d */
/* compiled from: PG */
final class C42134d implements C146042v {

    /* renamed from: a */
    final /* synthetic */ C145748z f110224a;

    /* renamed from: b */
    final /* synthetic */ String f110225b;

    /* renamed from: c */
    final /* synthetic */ Context f110226c;

    /* renamed from: d */
    final /* synthetic */ String f110227d;

    public C42134d(C145748z zVar, String str, Context context, String str2) {
        this.f110224a = zVar;
        this.f110225b = str;
        this.f110226c = context;
        this.f110227d = str2;
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ void mo18632e(Object obj) {
        Void voidR = (Void) obj;
        new C145722af(this.f110224a, this.f110225b, this.f110226c.getSharedPreferences("phenotype_shared_prefs", 0)).mo121883b(this.f110227d, C146013ai.f394700a, new C42133c());
    }
}
