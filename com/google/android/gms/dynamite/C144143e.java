package com.google.android.gms.dynamite;

import android.content.Context;

/* renamed from: com.google.android.gms.dynamite.e */
/* compiled from: PG */
final class C144143e implements C144152n {
    /* renamed from: a */
    public final C144151m mo119692a(Context context, String str, C144150l lVar) {
        C144151m mVar = new C144151m();
        int b = lVar.mo119691b(context, str, true);
        mVar.f390465b = b;
        if (b != 0) {
            mVar.f390466c = 1;
        } else {
            int a = lVar.mo119690a(context, str);
            mVar.f390464a = a;
            if (a != 0) {
                mVar.f390466c = -1;
            }
        }
        return mVar;
    }
}
