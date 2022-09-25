package com.google.android.gms.semanticlocation.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.semanticlocation.internal.b */
/* compiled from: PG */
public final /* synthetic */ class C145964b implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ C145969g f394648a;

    /* renamed from: b */
    public final /* synthetic */ PendingIntent f394649b;

    public /* synthetic */ C145964b(C145969g gVar, PendingIntent pendingIntent) {
        this.f394648a = gVar;
        this.f394649b = pendingIntent;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        C145969g gVar = this.f394648a;
        PendingIntent pendingIntent = this.f394649b;
        C145963a aVar = (C145963a) ((C145970h) obj).mo119451G();
        SemanticLocationParameters semanticLocationParameters = gVar.f394658a;
        C145968f fVar = new C145968f((C146010af) obj2);
        Parcel gA = aVar.mo17260gA();
        C8850c.m23497f(gA, semanticLocationParameters);
        C8850c.m23499h(gA, fVar);
        C8850c.m23497f(gA, pendingIntent);
        aVar.mo17262he(2, gA);
    }
}
