package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public abstract class ProfileId extends ContactMethodField implements Parcelable {

    /* renamed from: a */
    private String f110806a;

    /* renamed from: b */
    public abstract PersonFieldMetadata mo44976b();

    /* renamed from: c */
    public abstract C58833ax mo45053c();

    /* renamed from: d */
    public abstract C58833ax mo45054d();

    /* renamed from: g */
    public abstract CharSequence mo44982g();

    /* renamed from: lo */
    public final C42282bh mo45020lo() {
        return C42282bh.PROFILE_ID;
    }

    /* renamed from: n */
    public final String mo45119n() {
        if (this.f110806a == null) {
            this.f110806a = m74310m(C42299by.PROFILE_ID, mo44982g().toString());
        }
        return this.f110806a;
    }
}
