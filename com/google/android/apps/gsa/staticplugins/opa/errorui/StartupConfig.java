package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;

/* compiled from: PG */
public abstract class StartupConfig implements Parcelable, C90991b {
    public static final Parcelable.Creator CREATOR = new C108939eo();

    /* renamed from: k */
    public static C108940ep m180996k() {
        C108995p pVar = new C108995p();
        pVar.mo97301h(0);
        pVar.mo97297d(false);
        pVar.mo97299f(false);
        pVar.mo97300g(false);
        pVar.mo97302i(0);
        pVar.mo97296c(false);
        pVar.mo97295b(false);
        return pVar;
    }

    /* renamed from: a */
    public abstract int mo97182a();

    /* renamed from: b */
    public abstract int mo97183b();

    /* renamed from: c */
    public abstract Bundle mo97184c();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract C108940ep mo97185e();

    /* renamed from: f */
    public abstract boolean mo97187f();

    /* renamed from: g */
    public abstract boolean mo97188g();

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85279c("triggered_by").mo85276a(C90752i.m148230d(Integer.valueOf(mo97182a())));
        fVar.mo85279c("prompted_for_hotword_training").mo85276a(C90752i.m148228b(Boolean.valueOf(mo97189h())));
    }

    /* renamed from: h */
    public abstract boolean mo97189h();

    /* renamed from: i */
    public abstract boolean mo97191i();

    /* renamed from: j */
    public abstract boolean mo97192j();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo97182a());
        parcel.writeInt(mo97189h() ? 1 : 0);
        parcel.writeParcelable(mo97184c(), i);
        parcel.writeInt(mo97191i() ? 1 : 0);
        parcel.writeInt(mo97192j() ? 1 : 0);
        parcel.writeInt(mo97183b());
        parcel.writeInt(mo97188g() ? 1 : 0);
        parcel.writeInt(mo97187f() ? 1 : 0);
    }
}
