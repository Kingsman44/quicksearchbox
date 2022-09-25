package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.support.p033v7.p040e.C0432n;
import android.support.p033v7.widget.p042b.C0530a;
import androidx.lifecycle.C2333ah;
import java.lang.reflect.Array;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.cards.be */
/* compiled from: PG */
final class C30377be implements C2333ah {

    /* renamed from: a */
    final /* synthetic */ C30378bf f82116a;

    /* renamed from: b */
    private final int f82117b;

    public C30377be(C30378bf bfVar, int i) {
        this.f82116a = bfVar;
        this.f82117b = i;
    }

    /* renamed from: hX */
    public final /* bridge */ /* synthetic */ void mo774hX(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C0432n nVar = this.f82116a.f82118a;
            Integer valueOf = Integer.valueOf(this.f82117b);
            int c = nVar.mo1406c(valueOf, nVar.f1438a, nVar.f1440c, 1);
            if (c == -1) {
                c = 0;
            } else if (c < nVar.f1440c) {
                Integer num = (Integer) nVar.f1438a[c];
                if (num.equals(valueOf)) {
                    if (num.equals(valueOf)) {
                        nVar.f1438a[c] = valueOf;
                        return;
                    }
                    nVar.f1438a[c] = valueOf;
                    ((C0530a) nVar.f1439b).f2097a.mObservable.mo2881c(c, 1, (Object) null);
                    return;
                }
            }
            int i = nVar.f1440c;
            if (c <= i) {
                Object[] objArr = nVar.f1438a;
                int length = objArr.length;
                if (i == length) {
                    Object[] objArr2 = (Object[]) Array.newInstance(nVar.f1441d, length + 10);
                    System.arraycopy(nVar.f1438a, 0, objArr2, 0, c);
                    objArr2[c] = valueOf;
                    System.arraycopy(nVar.f1438a, c, objArr2, c + 1, nVar.f1440c - c);
                    nVar.f1438a = objArr2;
                } else {
                    System.arraycopy(objArr, c, objArr, c + 1, i - c);
                    nVar.f1438a[c] = valueOf;
                }
                nVar.f1440c++;
                ((C0530a) nVar.f1439b).f2097a.mObservable.mo2882d(c, 1);
                return;
            }
            throw new IndexOutOfBoundsException("cannot add item to " + c + " because size is " + nVar.f1440c);
        }
        C0432n nVar2 = this.f82116a.f82118a;
        int c2 = nVar2.mo1406c(Integer.valueOf(this.f82117b), nVar2.f1438a, nVar2.f1440c, 2);
        if (c2 != -1) {
            Object[] objArr3 = nVar2.f1438a;
            System.arraycopy(objArr3, c2 + 1, objArr3, c2, (nVar2.f1440c - c2) - 1);
            int i2 = nVar2.f1440c - 1;
            nVar2.f1440c = i2;
            nVar2.f1438a[i2] = null;
            ((C0530a) nVar2.f1439b).f2097a.mObservable.mo2883e(c2, 1);
        }
    }
}
