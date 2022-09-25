package com.google.android.gms.semanticlocation.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.semanticlocation.SemanticLocationEventRequest;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.semanticlocation.internal.c */
/* compiled from: PG */
public final /* synthetic */ class C145965c implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145969g f394650a;

    /* renamed from: b */
    public final /* synthetic */ SemanticLocationEventRequest f394651b;

    /* renamed from: c */
    public final /* synthetic */ PendingIntent f394652c;

    public /* synthetic */ C145965c(C145969g gVar, SemanticLocationEventRequest semanticLocationEventRequest, PendingIntent pendingIntent) {
        this.f394650a = gVar;
        this.f394651b = semanticLocationEventRequest;
        this.f394652c = pendingIntent;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145969g gVar = this.f394650a;
        SemanticLocationEventRequest semanticLocationEventRequest = this.f394651b;
        PendingIntent pendingIntent = this.f394652c;
        C145963a aVar = (C145963a) ((C145970h) obj).mo119451G();
        SemanticLocationParameters semanticLocationParameters = gVar.f394658a;
        C145967e eVar = new C145967e((C146010af) obj2);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, semanticLocationParameters);
        C8850c.m23499h(gA, eVar);
        C8850c.m23497f(gA, semanticLocationEventRequest);
        C8850c.m23497f(gA, pendingIntent);
        aVar.mo17262he(1, gA);
    }
}
