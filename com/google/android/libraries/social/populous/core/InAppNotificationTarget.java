package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public abstract class InAppNotificationTarget extends ContactMethodField implements Parcelable {

    /* renamed from: a */
    private String f110776a;

    /* renamed from: o */
    public static C42298bx m74363o() {
        C42346g gVar = new C42346g();
        gVar.mo45262h(C42282bh.IN_APP_NOTIFICATION_TARGET);
        return gVar;
    }

    /* renamed from: b */
    public abstract PersonFieldMetadata mo44976b();

    /* renamed from: c */
    public abstract C42298bx mo45012c();

    /* renamed from: d */
    public abstract C58833ax mo45013d();

    /* renamed from: e */
    public abstract C58833ax mo45014e();

    /* renamed from: f */
    public abstract C58485gu mo45016f();

    /* renamed from: g */
    public abstract CharSequence mo44982g();

    /* renamed from: h */
    public abstract String mo45017h();

    /* renamed from: i */
    public abstract int mo45019i();

    /* renamed from: n */
    public final String mo45119n() {
        if (this.f110776a == null) {
            C42282bh lo = mo45020lo();
            int i = mo45019i();
            String obj = mo44982g().toString();
            int i2 = -1;
            if (i != 0) {
                i2 = -1 + i;
            }
            String valueOf = String.valueOf(lo);
            this.f110776a = obj + "," + i2 + "," + valueOf;
        }
        return this.f110776a;
    }
}
