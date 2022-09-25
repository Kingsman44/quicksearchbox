package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C55409rh;
import com.google.p4152bb.p4153a.C55421x;

/* compiled from: PG */
public class VoiceInteractionAction extends VisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87502x();

    /* renamed from: f */
    public final C54946ad f236039f;

    protected VoiceInteractionAction(Parcel parcel) {
        super(parcel);
        this.f236039f = (C54946ad) ProtoLiteParcelable.m147136g(parcel, C54946ad.f144531h);
    }

    /* renamed from: L */
    public final Object mo81132L(C87501w wVar) {
        return wVar.mo81498e(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return false;
    }

    /* renamed from: N */
    public final C55409rh mo81142N() {
        C54976bg bgVar = this.f236039f.f144537e;
        if (bgVar == null) {
            bgVar = C54976bg.f144641o;
        }
        if ((bgVar.f144643a & 2048) == 0) {
            return null;
        }
        C54976bg bgVar2 = this.f236039f.f144537e;
        if (bgVar2 == null) {
            bgVar2 = C54976bg.f144641o;
        }
        C55409rh rhVar = bgVar2.f144653k;
        return rhVar == null ? C55409rh.f146001d : rhVar;
    }

    /* renamed from: O */
    public final boolean mo81143O() {
        C54976bg bgVar = this.f236039f.f144537e;
        if (bgVar == null) {
            bgVar = C54976bg.f144641o;
        }
        if ((bgVar.f144643a & 8) == 0) {
            return true;
        }
        C54976bg bgVar2 = this.f236039f.f144537e;
        if (bgVar2 == null) {
            bgVar2 = C54976bg.f144641o;
        }
        return bgVar2.f144647e;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.THIRD_PARTY_VOICE_INTERACTION_API;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        ProtoLiteParcelable.m147140k(this.f236039f, parcel);
    }

    public VoiceInteractionAction(C54946ad adVar) {
        this.f236039f = adVar;
    }
}
