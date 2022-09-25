package com.google.android.gms.people.internal;

import android.text.TextUtils;
import com.google.android.gms.common.data.C143865e;
import com.google.android.gms.common.data.C143869i;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.p10856c.C145645a;

/* renamed from: com.google.android.gms.people.internal.g */
/* compiled from: PG */
public final class C145670g extends C143865e implements C143869i {
    public C145670g(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo119345a() {
        throw null;
    }

    /* renamed from: f */
    public final boolean mo119333f() {
        boolean z;
        DataHolder dataHolder = this.f389974a;
        synchronized (dataHolder) {
            z = dataHolder.f389969i;
        }
        return !z;
    }

    /* renamed from: h */
    public final String mo121718h() {
        return C145645a.f393872a.mo121683a(mo119337kv("avatar"));
    }

    /* renamed from: i */
    public final String mo121719i() {
        if (!TextUtils.isEmpty(mo119337kv("display_name"))) {
            return mo119337kv("display_name");
        }
        return mo119337kv("account_name");
    }

    /* renamed from: j */
    public final String mo121720j() {
        return mo121722l() ? mo119337kv("family_name") : "null";
    }

    /* renamed from: k */
    public final String mo121721k() {
        return mo121723m() ? mo119337kv("given_name") : "null";
    }

    /* renamed from: l */
    public final boolean mo121722l() {
        return !TextUtils.isEmpty(mo119337kv("family_name"));
    }

    /* renamed from: m */
    public final boolean mo121723m() {
        return !TextUtils.isEmpty(mo119337kv("given_name"));
    }
}
