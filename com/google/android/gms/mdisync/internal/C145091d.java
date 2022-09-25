package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143798cs;
import com.google.android.gms.mdisync.CallerInfo;
import com.google.android.gms.tasks.C146010af;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.mdisync.internal.d */
/* compiled from: PG */
public final /* synthetic */ class C145091d implements C143798cs {

    /* renamed from: a */
    public final /* synthetic */ SyncRequest f392153a;

    /* renamed from: b */
    public final /* synthetic */ CallerInfo f392154b;

    public /* synthetic */ C145091d(SyncRequest syncRequest, CallerInfo callerInfo) {
        this.f392153a = syncRequest;
        this.f392154b = callerInfo;
    }

    /* renamed from: a */
    public final void mo117678a(Object obj, Object obj2) {
        SyncRequest syncRequest = this.f392153a;
        CallerInfo callerInfo = this.f392154b;
        C145093f fVar = new C145093f((C146010af) obj2);
        C145090c cVar = (C145090c) ((C145095h) obj).mo119451G();
        Parcel gA = cVar.mo17260gA();
        C8850c.m23499h(gA, fVar);
        C8850c.m23497f(gA, syncRequest);
        C8850c.m23497f(gA, callerInfo);
        cVar.mo17262he(1, gA);
    }
}
