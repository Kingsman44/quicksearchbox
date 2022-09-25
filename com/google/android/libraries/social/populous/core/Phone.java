package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.google.common.base.C58833ax;

/* compiled from: PG */
public abstract class Phone extends ContactMethodField implements Parcelable {

    /* renamed from: a */
    private String f110805a;

    /* renamed from: b */
    public abstract PersonFieldMetadata mo44976b();

    /* renamed from: c */
    public abstract C58833ax mo45039c();

    /* renamed from: d */
    public abstract C58833ax mo45040d();

    /* renamed from: e */
    public abstract C58833ax mo45041e();

    /* renamed from: f */
    public abstract CharSequence mo45043f();

    /* renamed from: g */
    public abstract CharSequence mo44982g();

    /* renamed from: lo */
    public final C42282bh mo45020lo() {
        return C42282bh.PHONE;
    }

    /* renamed from: n */
    public final String mo45119n() {
        CharSequence charSequence;
        if (this.f110805a == null) {
            C42299by byVar = C42299by.PHONE_NUMBER;
            if (mo45043f() != null) {
                charSequence = mo45043f();
            } else {
                charSequence = mo44982g();
            }
            this.f110805a = m74310m(byVar, charSequence.toString());
        }
        return this.f110805a;
    }
}
