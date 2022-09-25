package com.google.ads.interactivemedia.p367v3.internal;

import com.evernote.android.state.BuildConfig;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apy */
/* compiled from: PG */
public final class apy {

    /* renamed from: a */
    private final String f21367a;

    /* renamed from: b */
    private final apx f21368b;

    /* renamed from: c */
    private apx f21369c;

    public /* synthetic */ apy(String str) {
        apx apx = new apx((byte[]) null);
        this.f21368b = apx;
        this.f21369c = apx;
        aqd.m19282j(str);
        this.f21367a = str;
    }

    /* renamed from: a */
    public final apy mo15160a(Object obj) {
        apx apx = new apx((byte[]) null);
        this.f21369c.f21366b = apx;
        this.f21369c = apx;
        apx.f21365a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f21367a);
        sb.append('{');
        apx apx = this.f21368b.f21366b;
        String str = BuildConfig.FLAVOR;
        while (apx != null) {
            Object obj = apx.f21365a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            apx = apx.f21366b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
