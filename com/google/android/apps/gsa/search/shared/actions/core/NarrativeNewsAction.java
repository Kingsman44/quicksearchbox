package com.google.android.apps.gsa.search.shared.actions.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p4152bb.p4153a.C55365pr;
import com.google.p4152bb.p4153a.C55421x;

/* compiled from: PG */
public class NarrativeNewsAction extends NewVisitableAbstractVoiceAction {
    public static final Parcelable.Creator CREATOR = new C87406e();

    /* renamed from: f */
    public final C55365pr f236050f;

    /* renamed from: g */
    private final byte[] f236051g;

    protected NarrativeNewsAction(Parcel parcel) {
        super(parcel);
        byte[] bArr = new byte[parcel.readInt()];
        this.f236051g = bArr;
        parcel.readByteArray(bArr);
        this.f236050f = (C55365pr) ProtoLiteParcelable.m147135f(parcel, C55365pr.f145876l);
    }

    /* renamed from: L */
    public final Object mo81146L(C87407f fVar) {
        return fVar.mo81165j(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return true;
    }

    /* renamed from: g */
    public final C55421x mo81066g() {
        return C55421x.NARRATIVE_NEWS;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f236051g.length);
        parcel.writeByteArray(this.f236051g);
        ProtoLiteParcelable.m147140k(this.f236050f, parcel);
    }

    public NarrativeNewsAction(byte[] bArr, C55365pr prVar) {
        this.f236051g = bArr;
        this.f236050f = prVar;
    }
}
