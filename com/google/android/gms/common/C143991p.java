package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.p */
/* compiled from: PG */
abstract class C143991p extends C143989n {

    /* renamed from: a */
    private static final WeakReference f390227a = new WeakReference((Object) null);

    /* renamed from: b */
    private WeakReference f390228b = f390227a;

    public C143991p(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo119486a();

    /* renamed from: e */
    public final byte[] mo119514e() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f390228b.get();
            if (bArr == null) {
                bArr = mo119486a();
                this.f390228b = new WeakReference(bArr);
            }
        }
        return bArr;
    }
}
