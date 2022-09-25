package com.google.android.gms.dynamite;

import android.content.Context;

/* renamed from: com.google.android.gms.dynamite.g */
/* compiled from: PG */
final class C144145g implements C144152n {
    /* renamed from: a */
    public final C144151m mo119692a(Context context, String str, C144150l lVar) {
        int i;
        C144151m mVar = new C144151m();
        int a = lVar.mo119690a(context, str);
        mVar.f390464a = a;
        int i2 = 0;
        if (a != 0) {
            i = lVar.mo119691b(context, str, false);
            mVar.f390465b = i;
        } else {
            i = lVar.mo119691b(context, str, true);
            mVar.f390465b = i;
        }
        int i3 = mVar.f390464a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            mVar.f390466c = 0;
            return mVar;
        }
        if (i2 >= i) {
            mVar.f390466c = -1;
        } else {
            mVar.f390466c = 1;
        }
        return mVar;
    }
}
