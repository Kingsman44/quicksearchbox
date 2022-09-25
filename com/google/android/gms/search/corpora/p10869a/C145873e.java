package com.google.android.gms.search.corpora.p10869a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.search.corpora.ClearCorpusCall$Request;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.corpora.a.e */
/* compiled from: PG */
public final /* synthetic */ class C145873e implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f394422a = "com.google.android.googlequicksearchbox";

    /* renamed from: b */
    public final /* synthetic */ String f394423b = ".implicit:";

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f394422a;
        String str2 = this.f394423b;
        C145876h hVar = new C145876h((C146010af) obj2);
        ClearCorpusCall$Request clearCorpusCall$Request = new ClearCorpusCall$Request();
        clearCorpusCall$Request.f394404a = str;
        clearCorpusCall$Request.f394405b = str2;
        C145871c cVar = (C145871c) ((C145877i) obj).mo119451G();
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, clearCorpusCall$Request);
        C8850c.m23499h(gA, hVar);
        cVar.mo17262he(3, gA);
    }
}
