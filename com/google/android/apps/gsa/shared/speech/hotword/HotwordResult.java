package com.google.android.apps.gsa.shared.speech.hotword;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.speech.p7140b.C90531a;
import com.google.android.apps.gsa.shared.speech.speakerid.SpeakerIdModel;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59071e;
import com.google.speech.p5208h.C66626cx;
import com.google.speech.p5224k.p5225a.C67229g;
import java.io.Serializable;

/* compiled from: PG */
public abstract class HotwordResult implements Parcelable, C90531a {
    public static final Parcelable.Creator CREATOR = new C90598o();

    /* renamed from: E */
    public static final C59071e f253205E = C59071e.m91332i("com.google.android.apps.gsa.shared.speech.hotword.HotwordResult");

    /* renamed from: F */
    public static C90599p m147742F() {
        C90578a aVar = new C90578a();
        aVar.mo84733v(0);
        aVar.mo84718g(C66626cx.PHONE);
        aVar.mo84735x(false);
        aVar.mo84736y(false);
        aVar.mo84731t(0.0f);
        aVar.mo84734w(0.0f);
        aVar.mo84722k(0.0f);
        aVar.mo84715d(0.0f);
        aVar.mo84717f(1);
        aVar.f253213c = C58836b.f156633a;
        aVar.mo84728q(0);
        aVar.mo84727p(0);
        aVar.mo84713b(C67229g.UNKNOWN);
        aVar.mo84719h(false);
        aVar.mo84732u(false);
        aVar.mo84726o(false);
        aVar.mo84723l(0);
        aVar.mo84730s(false);
        aVar.mo84725n(0);
        aVar.mo84720i(0);
        aVar.mo84721j(2);
        return aVar;
    }

    /* renamed from: A */
    public abstract boolean mo84676A();

    /* renamed from: B */
    public abstract boolean mo84677B();

    /* renamed from: C */
    public abstract boolean mo84678C();

    /* renamed from: D */
    public abstract boolean mo84679D();

    /* renamed from: E */
    public abstract boolean mo84680E();

    /* renamed from: a */
    public abstract float mo84681a();

    /* renamed from: b */
    public abstract float mo84682b();

    /* renamed from: c */
    public abstract float mo84683c();

    /* renamed from: d */
    public abstract float mo84684d();

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public abstract int mo84685e();

    /* renamed from: f */
    public abstract int mo84687f();

    /* renamed from: g */
    public abstract int mo84688g();

    /* renamed from: h */
    public abstract int mo84689h();

    /* renamed from: i */
    public abstract int mo84691i();

    /* renamed from: j */
    public abstract int mo84692j();

    /* renamed from: k */
    public abstract long mo84693k();

    /* renamed from: l */
    public abstract long mo84694l();

    /* renamed from: m */
    public abstract Uri mo84695m();

    /* renamed from: n */
    public abstract C90599p mo84696n();

    /* renamed from: o */
    public abstract SpeakerIdModel mo84697o();

    /* renamed from: p */
    public abstract C58833ax mo84698p();

    /* renamed from: q */
    public abstract C58833ax mo84699q();

    /* renamed from: r */
    public abstract C58833ax mo84700r();

    /* renamed from: s */
    public abstract C58833ax mo84701s();

    /* renamed from: t */
    public abstract C58833ax mo84702t();

    /* renamed from: u */
    public abstract C58833ax mo84704u();

    /* renamed from: v */
    public abstract C66626cx mo84705v();

    /* renamed from: w */
    public abstract C67229g mo84706w();

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(mo84692j());
        parcel.writeInt(mo84705v().f181272r);
        parcel.writeByte(mo84676A() ? (byte) 1 : 0);
        parcel.writeByte(mo84677B() ? (byte) 1 : 0);
        parcel.writeFloat(mo84683c());
        parcel.writeString(mo84707x());
        parcel.writeFloat(mo84684d());
        parcel.writeFloat(mo84682b());
        parcel.writeFloat(mo84681a());
        parcel.writeByteArray((byte[]) mo84698p().mo56111f());
        parcel.writeInt(mo84685e());
        parcel.writeBooleanArray((boolean[]) mo84700r().mo56111f());
        parcel.writeInt(mo84691i());
        parcel.writeInt(mo84689h());
        parcel.writeInt(mo84706w().f182718e);
        parcel.writeByte(mo84678C() ? (byte) 1 : 0);
        parcel.writeByte(mo84680E() ? (byte) 1 : 0);
        parcel.writeParcelable(mo84697o(), i);
        parcel.writeByte(mo84679D() ? (byte) 1 : 0);
        parcel.writeString(mo84708y());
        parcel.writeInt(mo84688g());
        parcel.writeByte(mo84709z() ? (byte) 1 : 0);
        parcel.writeLong(mo84694l());
        parcel.writeLong(mo84693k());
        parcel.writeParcelable(mo84695m(), i);
        parcel.writeInt(mo84687f());
        C58833ax q = mo84699q();
        if (q.mo56113h()) {
            parcel.writeSerializable((Serializable) q.mo56107c());
        } else {
            parcel.writeSerializable((Serializable) null);
        }
        C58833ax u = mo84704u();
        if (u.mo56113h()) {
            parcel.writeSerializable((Serializable) u.mo56107c());
        } else {
            parcel.writeSerializable((Serializable) null);
        }
        parcel.writeByteArray((byte[]) mo84701s().mo56106b(C90596m.f253271a).mo56111f());
        parcel.writeByteArray((byte[]) mo84702t().mo56106b(C90597n.f253272a).mo56111f());
    }

    /* renamed from: x */
    public abstract String mo84707x();

    /* renamed from: y */
    public abstract String mo84708y();

    /* renamed from: z */
    public abstract boolean mo84709z();
}
