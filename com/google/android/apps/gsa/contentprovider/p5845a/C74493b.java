package com.google.android.apps.gsa.contentprovider.p5845a;

import android.content.ContentValues;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.gsa.contentprovider.c;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1646ay.C19602d;

/* renamed from: com.google.android.apps.gsa.contentprovider.a.b */
/* compiled from: PG */
public final /* synthetic */ class C74493b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ j f208606a;

    /* renamed from: b */
    public final /* synthetic */ c f208607b;

    public /* synthetic */ C74493b(j jVar, c cVar) {
        this.f208606a = jVar;
        this.f208607b = cVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        j jVar = this.f208606a;
        c cVar = this.f208607b;
        Pair a = jVar.a(cVar.f208620a);
        ContentValues[] contentValuesArr = cVar.b;
        for (ContentValues c : contentValuesArr) {
            ((C19602d) a.first).mo24916c((Uri) a.second, c);
        }
        return Integer.valueOf(contentValuesArr.length);
    }
}
