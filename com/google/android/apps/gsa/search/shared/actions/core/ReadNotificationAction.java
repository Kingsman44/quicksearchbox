package com.google.android.apps.gsa.search.shared.actions.core;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.util.TtsRequest;
import com.google.p4152bb.p4153a.C55421x;
import com.google.speech.p5224k.p5225a.C67190ah;
import com.google.speech.p5230n.p5232b.C67402ar;
import java.util.List;

/* compiled from: PG */
public class ReadNotificationAction extends NewVisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87408g();

    /* renamed from: f */
    public final TtsRequest f236055f;

    protected ReadNotificationAction(Parcel parcel) {
        super(parcel);
        this.f236055f = (TtsRequest) parcel.readParcelable(getClass().getClassLoader());
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81166k(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.READ_NOTIFICATION;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f236055f, i);
    }

    public ReadNotificationAction(List list) {
        this.f236055f = new TtsRequest((C67190ah) null, list, (C67402ar) null, (Uri) null, false);
    }
}
