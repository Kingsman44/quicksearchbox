package com.google.android.gms.learning.dynamite.training;

import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.common.base.C58835az;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.gms.learning.dynamite.training.br */
/* compiled from: PG */
final class C144702br extends C144718n {

    /* renamed from: a */
    final /* synthetic */ SettableFuture f391485a;

    public C144702br(SettableFuture settableFuture) {
        this.f391485a = settableFuture;
    }

    /* renamed from: e */
    public final void mo120156e(byte[] bArr, int i) {
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C29719k kVar = C144704bt.f391492a;
                Object[] objArr = new Object[1];
                if (bArr == null) {
                    z = false;
                }
                objArr[0] = Boolean.valueOf(z);
                kVar.mo34867i("Training ended with error (hasRetryWindow=%s). ", objArr);
            } else if (i != 2) {
                C144704bt.f391492a.mo34863e("Training ended in unknown state.");
            }
            this.f391485a.mo57356n(new C58835az(bArr, Integer.valueOf(i)));
        }
        C29719k kVar2 = C144704bt.f391492a;
        Object[] objArr2 = new Object[1];
        if (bArr == null) {
            z = false;
        }
        objArr2[0] = Boolean.valueOf(z);
        kVar2.mo34865g("Training ended with success (hasRetryWindow=%s).", objArr2);
        this.f391485a.mo57356n(new C58835az(bArr, Integer.valueOf(i)));
    }
}
