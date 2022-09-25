package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.googlequicksearchbox.R;
import com.google.p4152bb.p4153a.C55399qy;
import com.google.p4152bb.p4153a.C55400qz;
import com.google.p4152bb.p4153a.C55421x;

/* compiled from: PG */
public class VoiceDelightAction extends NewVisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87410i();

    /* renamed from: f */
    public static final int[] f236063f = {R.string.immersive_actions_voice_delight_first_timeout, R.string.immersive_actions_voice_delight_second_timeout, R.string.immersive_actions_voice_delight_third_timeout};

    /* renamed from: g */
    public C55400qz f236064g;

    protected VoiceDelightAction(Parcel parcel) {
        super(parcel);
        this.f236064g = (C55400qz) ProtoLiteParcelable.m147136g(parcel, C55400qz.f145967f);
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81168m(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.VOICE_DELIGHT;
    }

    /* renamed from: r */
    public final boolean mo81079r() {
        int a = C55399qy.m87683a(this.f236064g.f145973d);
        return a != 0 && a == 3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ProtoLiteParcelable.m147140k(this.f236064g, parcel);
    }

    public VoiceDelightAction(C55400qz qzVar) {
        this.f236064g = qzVar;
    }
}
