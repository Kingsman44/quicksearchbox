package androidx.core.app;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.Set;

/* renamed from: androidx.core.app.ba */
/* compiled from: PG */
public final class C1811ba {

    /* renamed from: a */
    public final String f5636a;

    /* renamed from: b */
    public final CharSequence f5637b;

    /* renamed from: c */
    public final CharSequence[] f5638c;

    /* renamed from: d */
    public final boolean f5639d;

    /* renamed from: e */
    public final int f5640e;

    /* renamed from: f */
    public final Bundle f5641f;

    /* renamed from: g */
    public final Set f5642g;

    public C1811ba(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.f5636a = str;
        this.f5637b = charSequence;
        this.f5638c = charSequenceArr;
        this.f5639d = z;
        this.f5640e = i;
        this.f5641f = bundle;
        this.f5642g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    /* renamed from: a */
    public static RemoteInput[] m4980a(C1811ba[] baVarArr) {
        if (baVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[baVarArr.length];
        for (int i = 0; i < baVarArr.length; i++) {
            remoteInputArr[i] = C1806aw.m4967a(baVarArr[i]);
        }
        return remoteInputArr;
    }
}
