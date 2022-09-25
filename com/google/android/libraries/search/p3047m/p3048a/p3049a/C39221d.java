package com.google.android.libraries.search.p3047m.p3048a.p3049a;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.C143701ac;
import com.google.android.libraries.p11029ao.p11031b.C147799a;
import com.google.common.p4552o.C59700co;
import dagger.C68214a;

/* renamed from: com.google.android.libraries.search.m.a.a.d */
/* compiled from: PG */
public final class C39221d {

    /* renamed from: a */
    private final Context f103235a;

    /* renamed from: b */
    private final C68214a f103236b;

    public C39221d(Context context, C68214a aVar) {
        this.f103235a = context;
        this.f103236b = aVar;
    }

    /* renamed from: a */
    public final String mo41732a(String str, Integer num, C59700co coVar) {
        if (TextUtils.isEmpty(str) || num == null) {
            return BuildConfig.FLAVOR;
        }
        if (Build.VERSION.SDK_INT < 30 || Process.isApplicationUid(num.intValue()) || num.intValue() < 1000 || num.intValue() >= 2000) {
            return ((coVar.equals(C59700co.INTERACTOR) || !((C143701ac) this.f103236b.mo27525b()).mo119085d(num.intValue())) && C147799a.m240899a(this.f103235a.getPackageManager(), num.intValue(), 1000) != 0) ? "untrusted" : str;
        }
        return str;
    }
}
