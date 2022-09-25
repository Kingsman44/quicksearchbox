package com.google.android.gms.droidguard.internal;

import android.os.Build;
import android.os.Parcel;
import com.google.android.gms.droidguard.p10791b.C144113a;
import com.google.android.gms.droidguard.p10791b.C144117e;
import java.util.Map;

/* renamed from: com.google.android.gms.droidguard.internal.j */
/* compiled from: PG */
public final /* synthetic */ class C144130j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C144132l f390427a;

    /* renamed from: b */
    public final /* synthetic */ Map f390428b;

    /* renamed from: c */
    public final /* synthetic */ C144113a f390429c;

    public /* synthetic */ C144130j(C144132l lVar, Map map, C144113a aVar) {
        this.f390427a = lVar;
        this.f390428b = map;
        this.f390429c = aVar;
    }

    public final void run() {
        byte[] bArr;
        C144132l lVar = this.f390427a;
        Map map = this.f390428b;
        C144113a aVar = this.f390429c;
        try {
            if (lVar.f390433c != null) {
                C144136p pVar = lVar.f390433c;
                Parcel gA = pVar.mo17260gA();
                gA.writeMap(map);
                Parcel gT = pVar.mo17261gT(2, gA);
                bArr = gT.createByteArray();
                gT.recycle();
            } else {
                bArr = null;
            }
            if (bArr == null) {
                lVar.f390432b = C144117e.m234325a("Received null", Build.VERSION.SDK_INT, (Throwable) null);
                bArr = lVar.f390432b;
            }
        } catch (Exception e) {
            lVar.f390432b = C144117e.m234325a("Snapshot failed: ".concat(e.toString()), Build.VERSION.SDK_INT, e);
            bArr = lVar.f390432b;
            lVar.close();
        }
        aVar.mo119662b(bArr);
    }
}
