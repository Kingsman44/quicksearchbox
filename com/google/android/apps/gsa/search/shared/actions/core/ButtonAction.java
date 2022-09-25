package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;

/* compiled from: PG */
public class ButtonAction extends NewVisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87402a();

    /* renamed from: f */
    public static final ButtonAction f236040f = new ButtonAction("Escape");

    /* renamed from: g */
    public final String f236041g;

    protected ButtonAction(Parcel parcel) {
        super(parcel);
        this.f236041g = parcel.readString();
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81162g(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: f */
    public final MatchingProviderInfo mo81065f() {
        return C87489k.m142013a();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("ButtonAction: ".concat(String.valueOf(this.f236041g)));
    }

    /* renamed from: t */
    public final boolean mo81081t() {
        return false;
    }

    public String toString() {
        String str = this.f236041g;
        return "ButtonAction[" + str + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f236041g);
    }

    public ButtonAction(String str) {
        this.f236041g = str;
    }
}
