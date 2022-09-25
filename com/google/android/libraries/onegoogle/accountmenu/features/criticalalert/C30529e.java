package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.onegoogle.common.C30921h;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.e */
/* compiled from: PG */
public final /* synthetic */ class C30529e implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C30535k f82464a;

    /* renamed from: b */
    public final /* synthetic */ C30897z f82465b;

    /* renamed from: c */
    public final /* synthetic */ C30922i f82466c;

    /* renamed from: d */
    public final /* synthetic */ Object f82467d;

    /* renamed from: e */
    public final /* synthetic */ boolean f82468e;

    public /* synthetic */ C30529e(C30535k kVar, C30897z zVar, C30922i iVar, Object obj, boolean z) {
        this.f82464a = kVar;
        this.f82465b = zVar;
        this.f82466c = iVar;
        this.f82467d = obj;
        this.f82468e = z;
    }

    public final void onClick(View view) {
        C30535k kVar = this.f82464a;
        C30897z zVar = this.f82465b;
        C30922i iVar = this.f82466c;
        Object obj = this.f82467d;
        boolean z = this.f82468e;
        zVar.mo35826f(C28442l.m53142h(), view);
        C30921h.m57712a(iVar, new C30533i(kVar, obj, view, z));
    }
}
