package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.googlehelp.C144280a;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.googlehelp.internal.common.s */
/* compiled from: PG */
public final class C144324s extends C144295aa {

    /* renamed from: a */
    final /* synthetic */ Intent f390877a;

    /* renamed from: d */
    final /* synthetic */ WeakReference f390878d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C144324s(C143851w wVar, Intent intent, WeakReference weakReference) {
        super(wVar);
        this.f390877a = intent;
        this.f390878d = weakReference;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo119854j(C144302ah ahVar) {
        GoogleHelp googleHelp = (GoogleHelp) this.f390877a.getParcelableExtra("EXTRA_GOOGLE_HELP");
        C144280a aVar = googleHelp.f390749L;
        C144304aj.m234566b(aVar, new C144313h(this, ahVar, this, aVar, googleHelp.f390750M), googleHelp);
    }
}
