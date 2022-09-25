package com.google.android.apps.gsa.search.shared.actions;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
public class PermissionPuntAction extends PuntAction {
    public static final Parcelable.Creator CREATOR = new C87472o();

    /* renamed from: f */
    public final Collection f236009f;

    /* renamed from: g */
    public final Intent f236010g;

    /* renamed from: h */
    public final boolean f236011h;

    /* renamed from: i */
    public boolean f236012i;

    public PermissionPuntAction(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.f236009f = arrayList;
        parcel.readStringList(arrayList);
        this.f236010g = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        boolean z = false;
        this.f236011h = parcel.readInt() == 1;
        this.f236012i = parcel.readInt() == 1 ? true : z;
    }

    /* renamed from: L */
    public final Object mo81132L(C87501w wVar) {
        return wVar.mo81494a(this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringList(new ArrayList(this.f236009f));
        parcel.writeParcelable(this.f236010g, 0);
        parcel.writeInt(this.f236011h ? 1 : 0);
        parcel.writeInt(this.f236012i ? 1 : 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PermissionPuntAction(java.util.Collection r8, android.content.Intent r9) {
        /*
            r7 = this;
            android.content.Intent r4 = new android.content.Intent
            java.lang.String r0 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r4.<init>(r0)
            java.lang.String r0 = "android.intent.category.DEFAULT"
            r4.addCategory(r0)
            java.lang.String r0 = "package:com.google.android.googlequicksearchbox"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.setData(r0)
            r1 = 0
            r2 = 2132091064(0x7f1520b8, float:1.9822486E38)
            r3 = 2132091063(0x7f1520b7, float:1.9822484E38)
            r5 = 11129(0x2b79, float:1.5595E-41)
            com.google.bb.a.x r6 = com.google.p4152bb.p4153a.C55421x.PUNT
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f236009f = r8
            r7.f236010g = r9
            r8 = 1
            r7.f236011h = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.actions.PermissionPuntAction.<init>(java.util.Collection, android.content.Intent):void");
    }
}
