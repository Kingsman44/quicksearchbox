package com.google.android.gms.presencemanager.p10860a;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.presencemanager.PresentUser;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.presencemanager.a.d */
/* compiled from: PG */
public final /* synthetic */ class C145753d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ PresentUser f394091a;

    public /* synthetic */ C145753d(PresentUser presentUser) {
        this.f394091a = presentUser;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        PresentUser presentUser = this.f394091a;
        C145755f fVar = new C145755f((C146010af) obj2);
        C145752c cVar = (C145752c) ((C145757h) obj).mo119451G();
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, presentUser);
        C8850c.m23499h(gA, fVar);
        cVar.mo17262he(1, gA);
    }
}
