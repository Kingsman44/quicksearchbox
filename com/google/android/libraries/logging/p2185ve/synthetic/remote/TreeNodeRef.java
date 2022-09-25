package com.google.android.libraries.logging.p2185ve.synthetic.remote;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.common.base.C58838bb;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.logging.ve.synthetic.remote.TreeNodeRef */
/* compiled from: PG */
public final class TreeNodeRef implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C28475e();

    /* renamed from: a */
    public final C28477g f77271a;

    private TreeNodeRef(C28477g gVar) {
        C58838bb.m90868c(gVar.f77280b > 0);
        this.f77271a = gVar;
    }

    /* renamed from: b */
    public static TreeNodeRef m53228b(int i) {
        C28476f fVar = (C28476f) C28477g.f77277c.createBuilder();
        fVar.copyOnWrite();
        C28477g gVar = (C28477g) fVar.instance;
        gVar.f77279a |= 1;
        gVar.f77280b = i;
        return new TreeNodeRef((C28477g) fVar.build());
    }

    /* renamed from: a */
    public final C28439i mo33927a(C28439i iVar) {
        AtomicReference atomicReference = new AtomicReference();
        new C28474d(this, atomicReference).mo33799b(iVar);
        return (C28439i) atomicReference.get();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77271a.f77280b);
    }
}
