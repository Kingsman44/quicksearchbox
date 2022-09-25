package com.google.android.gms.dynamite;

import android.content.Context;

/* renamed from: com.google.android.gms.dynamite.f */
/* compiled from: PG */
final class C144144f implements C144152n {
    /* renamed from: a */
    public final C144151m mo119692a(Context context, String str, C144150l lVar) {
        C144151m mVar = new C144151m();
        mVar.f390464a = lVar.mo119690a(context, str);
        int b = lVar.mo119691b(context, str, true);
        mVar.f390465b = b;
        int i = mVar.f390464a;
        if (i == 0) {
            i = 0;
            if (b == 0) {
                mVar.f390466c = 0;
                return mVar;
            }
        }
        if (i >= b) {
            mVar.f390466c = -1;
        } else {
            mVar.f390466c = 1;
        }
        return mVar;
    }
}
