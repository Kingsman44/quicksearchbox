package com.google.android.gms.maps;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.p10793f.C144156a;
import com.google.android.gms.p10793f.C144162g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.maps.f */
/* compiled from: PG */
public final class C145009f extends C144162g {

    /* renamed from: c */
    public final List f391998c = new ArrayList();

    /* renamed from: d */
    protected C144156a f391999d;

    /* renamed from: e */
    private final ViewGroup f392000e;

    /* renamed from: f */
    private final Context f392001f;

    /* renamed from: g */
    private final GoogleMapOptions f392002g;

    public C145009f(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
        this.f392000e = viewGroup;
        this.f392001f = context;
        this.f392002g = googleMapOptions;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo119698b(com.google.android.gms.p10793f.C144156a r4) {
        /*
            r3 = this;
            r3.f391999d = r4
            if (r4 == 0) goto L_0x00a1
            com.google.android.gms.maps.e r4 = r3.f390475b
            if (r4 != 0) goto L_0x00a1
            android.content.Context r4 = r3.f392001f     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.maps.C145011h.m235672a(r4)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            android.content.Context r4 = r3.f392001f     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r0 = 0
            com.google.android.gms.maps.a.c r4 = com.google.android.gms.maps.p10845a.C145004i.m235663a(r4, r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            android.content.Context r0 = r3.f392001f     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.f.k r1 = new com.google.android.gms.f.k     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.maps.GoogleMapOptions r0 = r3.f392002g     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            android.os.Parcel r2 = r4.mo17260gA()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.p445a.C8850c.m23499h(r2, r1)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.p445a.C8850c.m23497f(r2, r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r0 = 3
            android.os.Parcel r4 = r4.mo17261gT(r0, r2)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            android.os.IBinder r0 = r4.readStrongBinder()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            if (r0 != 0) goto L_0x0034
            r0 = 0
            goto L_0x0048
        L_0x0034:
            java.lang.String r1 = "com.google.android.gms.maps.internal.IMapViewDelegate"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            boolean r2 = r1 instanceof com.google.android.gms.maps.p10845a.C145000e     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            if (r2 == 0) goto L_0x0042
            r0 = r1
            com.google.android.gms.maps.a.e r0 = (com.google.android.gms.maps.p10845a.C145000e) r0     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            goto L_0x0048
        L_0x0042:
            com.google.android.gms.maps.a.e r1 = new com.google.android.gms.maps.a.e     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r0 = r1
        L_0x0048:
            r4.recycle()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            if (r0 != 0) goto L_0x004e
            goto L_0x00a1
        L_0x004e:
            com.google.android.gms.f.a r4 = r3.f391999d     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.maps.e r1 = new com.google.android.gms.maps.e     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            android.view.ViewGroup r2 = r3.f392000e     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r1.<init>(r2, r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.f.g r0 = r4.f390468a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r0.f390475b = r1     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            java.util.LinkedList r0 = r0.f390474a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
        L_0x0061:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            if (r1 == 0) goto L_0x0073
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.f.f r1 = (com.google.android.gms.p10793f.C144161f) r1     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.f.g r2 = r4.f390468a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r1.mo119695b()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            goto L_0x0061
        L_0x0073:
            com.google.android.gms.f.g r0 = r4.f390468a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            java.util.LinkedList r0 = r0.f390474a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r0.clear()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.f.g r4 = r4.f390468a     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            java.util.List r4 = r3.f391998c     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
        L_0x0082:
            boolean r0 = r4.hasNext()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r0 = r4.next()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.maps.i r0 = (com.google.android.gms.maps.C145012i) r0     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            com.google.android.gms.maps.e r1 = r3.f390475b     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r1.mo120499a(r0)     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            goto L_0x0082
        L_0x0094:
            java.util.List r4 = r3.f391998c     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
            r4.clear()     // Catch:{ RemoteException -> 0x009a, y -> 0x0099 }
        L_0x0099:
            return
        L_0x009a:
            r4 = move-exception
            com.google.android.gms.maps.model.g r0 = new com.google.android.gms.maps.model.g
            r0.<init>(r4)
            throw r0
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.C145009f.mo119698b(com.google.android.gms.f.a):void");
    }
}
