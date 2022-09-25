package com.google.android.apps.gsa.staticplugins.fedass.brella;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100741g;
import com.google.android.gms.learning.internal.C144771c;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.brella.c */
/* compiled from: PG */
public final /* synthetic */ class C100798c implements C100741g {

    /* renamed from: a */
    public final /* synthetic */ C144771c f281727a;

    public /* synthetic */ C100798c(C144771c cVar) {
        this.f281727a = cVar;
    }

    /* renamed from: a */
    public final void mo92032a(Object obj) {
        byte[] bArr;
        C144771c cVar = this.f281727a;
        EkhoMaterializerResult ekhoMaterializerResult = (EkhoMaterializerResult) obj;
        if (ekhoMaterializerResult == null || (bArr = ekhoMaterializerResult.exampleBytes) == null || bArr.length == 0) {
            cVar.mo120203b((byte[]) null, (byte[]) null);
        } else {
            cVar.mo120203b(bArr, ekhoMaterializerResult.resumptionToken);
        }
    }
}
