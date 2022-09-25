package com.google.android.gms.common.data;

import java.util.Iterator;

/* renamed from: com.google.android.gms.common.data.a */
/* compiled from: PG */
public abstract class C143861a implements C143863c {

    /* renamed from: a */
    protected final DataHolder f389971a;

    protected C143861a(DataHolder dataHolder) {
        this.f389971a = dataHolder;
    }

    /* renamed from: b */
    public final void mo119102b() {
        DataHolder dataHolder = this.f389971a;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }

    /* renamed from: c */
    public int mo119324c() {
        DataHolder dataHolder = this.f389971a;
        if (dataHolder == null) {
            return 0;
        }
        return dataHolder.f389968h;
    }

    public final void close() {
        mo119102b();
    }

    public final Iterator iterator() {
        return new C143864d(this);
    }
}
