package com.google.android.gms.learning.dynamite;

import com.evernote.android.state.BuildConfig;
import com.google.android.gms.phenotype.C145748z;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146013ai;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146042v;
import com.google.android.libraries.micore.learning.base.C29719k;

/* renamed from: com.google.android.gms.learning.dynamite.w */
/* compiled from: PG */
public final /* synthetic */ class C144733w implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ String f391531a;

    /* renamed from: b */
    public final /* synthetic */ C145748z f391532b;

    public /* synthetic */ C144733w(String str, C145748z zVar) {
        this.f391531a = str;
        this.f391532b = zVar;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        String str = this.f391531a;
        C145748z zVar = this.f391532b;
        Void voidR = (Void) obj;
        C29719k kVar = C144615aa.f391312a;
        C146006ab b = zVar.mo121902b(str, BuildConfig.FLAVOR);
        C146014aj ajVar = (C146014aj) b;
        ajVar.mo122495n(C146013ai.f394700a, new C144656t());
        ajVar.mo122494m(C146013ai.f394700a, new C144731u(str));
    }
}
