package com.google.android.gms.search.corpora.p10869a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.search.corpora.DeleteUsageReportCall$Request;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.corpora.a.d */
/* compiled from: PG */
public final /* synthetic */ class C145872d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ String f394419a = "com.google.android.googlequicksearchbox";

    /* renamed from: b */
    public final /* synthetic */ String f394420b = ".implicit:";

    /* renamed from: c */
    public final /* synthetic */ String f394421c;

    public /* synthetic */ C145872d(String str) {
        this.f394421c = str;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        String str = this.f394419a;
        String str2 = this.f394420b;
        String str3 = this.f394421c;
        C145876h hVar = new C145876h((C146010af) obj2);
        DeleteUsageReportCall$Request deleteUsageReportCall$Request = new DeleteUsageReportCall$Request();
        deleteUsageReportCall$Request.f394407a = str;
        deleteUsageReportCall$Request.f394408b = str2;
        deleteUsageReportCall$Request.f394409c = str3;
        C145871c cVar = (C145871c) ((C145877i) obj).mo119451G();
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, deleteUsageReportCall$Request);
        C8850c.m23499h(gA, hVar);
        cVar.mo17262he(6, gA);
    }
}
