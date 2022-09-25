package com.google.android.libraries.social.populous.storage;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.p182p.C3925ah;
import androidx.p182p.p185c.C3940b;
import androidx.p186q.p187a.C4056k;

/* renamed from: com.google.android.libraries.social.populous.storage.cf */
/* compiled from: PG */
public final class C42659cf extends C42658ce {

    /* renamed from: a */
    private final C3925ah f111863a;

    public C42659cf(C3925ah ahVar) {
        this.f111863a = ahVar;
    }

    /* renamed from: b */
    public final long mo45759b(C4056k kVar) {
        this.f111863a.mo8175S();
        Cursor a = C3940b.m11293a(this.f111863a, kVar, false, (CancellationSignal) null);
        try {
            return a.moveToFirst() ? a.getLong(0) : 0;
        } finally {
            a.close();
        }
    }
}
