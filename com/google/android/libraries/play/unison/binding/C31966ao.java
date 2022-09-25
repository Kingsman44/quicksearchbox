package com.google.android.libraries.play.unison.binding;

import android.support.p033v7.p040e.C0430l;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.play.unison.binding.ao */
/* compiled from: PG */
final class C31966ao implements C0430l {

    /* renamed from: a */
    final /* synthetic */ C31967ap f85949a;

    public C31966ao(C31967ap apVar) {
        this.f85949a = apVar;
    }

    /* renamed from: a */
    public final void mo1392a(int i, int i2, Object obj) {
        int i3 = i + i2;
        while (true) {
            i3--;
            if (i3 >= i) {
                this.f85949a.f85955f[i3] = null;
            } else {
                this.f85949a.mObservable.mo2881c(i, i2, obj);
                return;
            }
        }
    }

    /* renamed from: b */
    public final void mo1393b(int i, int i2) {
        C31967ap apVar = this.f85949a;
        int i3 = apVar.f85956g;
        int i4 = i3 + i2;
        int max = Math.max(i4, apVar.mo37733b());
        C31967ap apVar2 = this.f85949a;
        C31955ad[] adVarArr = apVar2.f85955f;
        if (max > adVarArr.length) {
            apVar2.f85955f = (C31955ad[]) Arrays.copyOf(adVarArr, max);
        }
        int i5 = i + i2;
        C31955ad[] adVarArr2 = this.f85949a.f85955f;
        System.arraycopy(adVarArr2, i, adVarArr2, i5, i3 - i);
        Arrays.fill(this.f85949a.f85955f, i, i5, (Object) null);
        C31967ap apVar3 = this.f85949a;
        apVar3.f85956g = i4;
        apVar3.mObservable.mo2882d(i, i2);
    }

    /* renamed from: c */
    public final void mo1394c(int i, int i2) {
        C31955ad[] adVarArr = this.f85949a.f85955f;
        C31955ad adVar = adVarArr[i];
        if (i < i2) {
            System.arraycopy(adVarArr, i + 1, adVarArr, i, i2 - i);
        } else if (i > i2) {
            System.arraycopy(adVarArr, i2, adVarArr, i2 + 1, i - i2);
        }
        C31967ap apVar = this.f85949a;
        apVar.f85955f[i2] = adVar;
        apVar.mObservable.mo2880b(i, i2);
    }

    /* renamed from: d */
    public final void mo1395d(int i, int i2) {
        C31967ap apVar = this.f85949a;
        int i3 = apVar.f85956g;
        int i4 = i + i2;
        C31955ad[] adVarArr = apVar.f85955f;
        System.arraycopy(adVarArr, i4, adVarArr, i, i3 - i4);
        Arrays.fill(this.f85949a.f85955f, i4, i3, (Object) null);
        C31967ap apVar2 = this.f85949a;
        apVar2.f85956g = i3 - i2;
        apVar2.mObservable.mo2883e(i, i2);
    }
}
