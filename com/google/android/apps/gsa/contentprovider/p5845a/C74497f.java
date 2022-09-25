package com.google.android.apps.gsa.contentprovider.p5845a;

import android.content.ContentValues;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.gsa.contentprovider.i;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1646ay.C19602d;

/* renamed from: com.google.android.apps.gsa.contentprovider.a.f */
/* compiled from: PG */
public final /* synthetic */ class C74497f implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ j f208614a;

    /* renamed from: b */
    public final /* synthetic */ i f208615b;

    public /* synthetic */ C74497f(j jVar, i iVar) {
        this.f208614a = jVar;
        this.f208615b = iVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        j jVar = this.f208614a;
        i iVar = this.f208615b;
        Pair a = jVar.a(iVar.f208620a);
        Uri uri = (Uri) a.second;
        ContentValues contentValues = iVar.b;
        String str = iVar.c;
        String[] strArr = iVar.d;
        return Integer.valueOf(((C19602d) a.first).mo24919l());
    }
}
