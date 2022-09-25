package com.google.android.apps.gsa.shared.notificationlistening.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class StandardNotification extends C90421b implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C90434o();

    /* renamed from: u */
    private static final C59071e f252560u = C59071e.m91332i("com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification");

    /* renamed from: r */
    public final CharSequence f252561r;

    /* renamed from: s */
    public final CharSequence f252562s;

    /* renamed from: t */
    public final C90427h f252563t;

    public StandardNotification(C90435p pVar) {
        super(pVar);
        this.f252561r = pVar.f252645q;
        CharSequence charSequence = pVar.f252646r;
        if (charSequence == null) {
            ((C59052c) ((C59052c) f252560u.mo56226d()).mo56372aa(10946)).mo56386p("Content body is required.");
            int i = C90755l.f253831a;
            this.f252562s = BuildConfig.FLAVOR;
        } else {
            this.f252562s = charSequence;
        }
        this.f252563t = new C90427h(this.f252591l, this.f252581b, false, (String) null);
    }

    /* renamed from: b */
    public final C90427h mo84131b() {
        return this.f252563t;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo84133e(C90421b bVar) {
        if (super.mo84133e(bVar) && (bVar instanceof StandardNotification)) {
            StandardNotification standardNotification = (StandardNotification) bVar;
            if (!TextUtils.equals(this.f252561r, standardNotification.f252561r) || !TextUtils.equals(this.f252562s, standardNotification.f252562s)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return ("StandardNotification:  has contentHeader=" + (this.f252561r != null)) + ", identifier=" + this.f252563t.toString() + ", " + super.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f252562s, parcel, i);
        TextUtils.writeToParcel(this.f252561r, parcel, i);
    }
}
