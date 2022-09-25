package com.google.android.gms.search.queries.p10873a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.search.queries.GlobalQueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.queries.a.c */
/* compiled from: PG */
public final class C145919c extends C8848a implements IInterface {
    public C145919c(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.search.queries.internal.ISearchQueriesService");
    }

    /* renamed from: e */
    public final void mo122334e(GlobalQueryCall$Request globalQueryCall$Request, C145918b bVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, globalQueryCall$Request);
        C8850c.m23499h(gA, bVar);
        mo17262he(3, gA);
    }

    /* renamed from: f */
    public final void mo122335f(Bundle bundle) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        mo17263hf(8, gA);
    }

    /* renamed from: g */
    public final void mo122336g(QueryCall$Request queryCall$Request, C145918b bVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, queryCall$Request);
        C8850c.m23499h(gA, bVar);
        mo17262he(2, gA);
    }
}
