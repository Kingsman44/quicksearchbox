package com.google.android.gms.search.queries;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143717b;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.C145891g;
import com.google.android.gms.search.p10865b.p10866a.C145863b;
import com.google.android.gms.search.queries.p10873a.C145919c;
import com.google.android.gms.search.queries.p10873a.C145925i;
import com.google.android.gms.search.queries.p10873a.C145927k;
import com.google.android.p445a.C8850c;
import java.util.List;

/* renamed from: com.google.android.gms.search.queries.a */
/* compiled from: PG */
public final class C145916a extends C145863b {

    /* renamed from: a */
    private final AnnotateCall$Request f394519a;

    public C145916a(AnnotateCall$Request annotateCall$Request, C143851w wVar) {
        super(C145891g.f394440m, wVar);
        this.f394519a = annotateCall$Request;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ C143711ad mo117683c(Status status) {
        return new AnnotateCall$Response(status, (List) null, (Bundle) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo117681h(C143717b bVar) {
        C145925i iVar = (C145925i) bVar;
        C145919c cVar = (C145919c) iVar.mo122241m();
        AnnotateCall$Request annotateCall$Request = this.f394519a;
        C145927k kVar = new C145927k(this, AnnotateCall$Response.class, iVar);
        Parcel gA = cVar.mo17260gA();
        C8850c.m23497f(gA, annotateCall$Request);
        C8850c.m23499h(gA, kVar);
        cVar.mo17262he(7, gA);
    }
}
