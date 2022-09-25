package com.google.android.libraries.storage.p3315b;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.storage.b.am */
/* compiled from: PG */
public final class C42827am {

    /* renamed from: a */
    public final C58480gp f112108a = C58485gu.m89837e();

    /* renamed from: b */
    public final C58480gp f112109b = C58485gu.m89837e();

    /* renamed from: c */
    public C42829ao f112110c;

    /* renamed from: d */
    private C58833ax f112111d = C58836b.f156633a;

    /* renamed from: a */
    public final C42835au mo45914a() {
        if (this.f112110c == null) {
            this.f112110c = new C42829ao();
        }
        return new C42835au(this.f112111d, this.f112108a.mo55394f(), this.f112109b.mo55394f(), this.f112110c);
    }

    /* renamed from: b */
    public final void mo45915b(String str) {
        this.f112108a.mo55395g(new C42831aq(str));
    }

    /* renamed from: c */
    public final void mo45916c(int i) {
        C58838bb.m90884s(this.f112108a.mo55394f().isEmpty(), "dropAllVersionsBefore() must be the first UpgradeStep. The newVersionNumber parameter must be the number of removed addSchemaVersion() steps plus one.");
        C58838bb.m90884s(!this.f112111d.mo56113h(), "Only one call to dropAllVersionsBefore() may be made. It must be the first call to a SQLSchema.Builder.");
        this.f112111d = C58833ax.m90834k(new C42830ap(i));
    }
}
