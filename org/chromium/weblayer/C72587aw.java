package org.chromium.weblayer;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.p445a.C8850c;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.chromium.p5643b.p5644a.C72304a;
import org.chromium.p5643b.p5644a.C72319ao;
import org.chromium.p5643b.p5644a.C72341bj;

/* renamed from: org.chromium.weblayer.aw */
/* compiled from: PG */
public final class C72587aw {

    /* renamed from: a */
    public static final Map f193119a = new HashMap();

    /* renamed from: b */
    public static final Map f193120b = new HashMap();

    /* renamed from: c */
    public final String f193121c;

    /* renamed from: d */
    public final boolean f193122d;

    /* renamed from: e */
    public final C72627p f193123e;

    /* renamed from: f */
    public final C72583as f193124f;

    /* renamed from: g */
    public C72319ao f193125g;

    protected C72587aw() {
        this.f193121c = null;
        this.f193122d = false;
        this.f193125g = null;
        this.f193123e = null;
        this.f193124f = null;
    }

    /* renamed from: a */
    public static Collection m107320a() {
        C72604bm.m107399a();
        HashSet hashSet = new HashSet();
        hashSet.addAll(f193119a.values());
        hashSet.addAll(f193120b.values());
        return hashSet;
    }

    /* renamed from: d */
    public static C72587aw m107321d(C72319ao aoVar) {
        C72587aw awVar;
        C72604bm.m107399a();
        try {
            Parcel gT = aoVar.mo17261gT(3, aoVar.mo17260gA());
            String readString = gT.readString();
            gT.recycle();
            try {
                Parcel gT2 = aoVar.mo17261gT(17, aoVar.mo17260gA());
                boolean i = C8850c.m23500i(gT2);
                gT2.recycle();
                if (i) {
                    awVar = (C72587aw) f193120b.get(readString);
                } else {
                    awVar = (C72587aw) f193119a.get(readString);
                }
                if (awVar != null) {
                    return awVar;
                }
                return new C72587aw(readString, aoVar, i);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } catch (RemoteException e2) {
            throw new C72304a(e2);
        }
    }

    /* renamed from: b */
    public final void mo64458b(C72607bp bpVar) {
        C72586av avVar;
        C72604bm.m107399a();
        try {
            C72319ao aoVar = this.f193125g;
            if (bpVar == null) {
                avVar = null;
            } else {
                avVar = new C72586av(bpVar);
            }
            Parcel gA = aoVar.mo17260gA();
            C8850c.m23499h(gA, avVar);
            aoVar.mo17262he(14, gA);
        } catch (RemoteException e) {
            throw new C72304a(e);
        }
    }

    /* renamed from: c */
    public final void mo64459c() {
        C72604bm.m107399a();
        C72319ao aoVar = this.f193125g;
        if (aoVar != null) {
            try {
                C72341bj bjVar = new C72341bj((Object) null);
                Parcel gA = aoVar.mo17260gA();
                C8850c.m23499h(gA, bjVar);
                aoVar.mo17262he(19, gA);
            } catch (RemoteException e) {
                throw new C72304a(e);
            }
        } else {
            throw new IllegalStateException("Profile can not be used once destroyed");
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C72587aw(java.lang.String r7, org.chromium.p5643b.p5644a.C72319ao r8, boolean r9) {
        /*
            r6 = this;
            r6.<init>()
            r6.f193121c = r7
            r6.f193125g = r8
            r6.f193122d = r9
            org.chromium.weblayer.p r0 = new org.chromium.weblayer.p     // Catch:{ RemoteException -> 0x0094 }
            android.os.Parcel r1 = r8.mo17260gA()     // Catch:{ RemoteException -> 0x0094 }
            r2 = 7
            android.os.Parcel r1 = r8.mo17261gT(r2, r1)     // Catch:{ RemoteException -> 0x0094 }
            android.os.IBinder r2 = r1.readStrongBinder()     // Catch:{ RemoteException -> 0x0094 }
            r3 = 0
            if (r2 != 0) goto L_0x001d
            r4 = r3
            goto L_0x002f
        L_0x001d:
            java.lang.String r4 = "org.chromium.weblayer_private.interfaces.ICookieManager"
            android.os.IInterface r4 = r2.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x0094 }
            boolean r5 = r4 instanceof org.chromium.p5643b.p5644a.C72355n     // Catch:{ RemoteException -> 0x0094 }
            if (r5 == 0) goto L_0x002a
            org.chromium.b.a.n r4 = (org.chromium.p5643b.p5644a.C72355n) r4     // Catch:{ RemoteException -> 0x0094 }
            goto L_0x002f
        L_0x002a:
            org.chromium.b.a.n r4 = new org.chromium.b.a.n     // Catch:{ RemoteException -> 0x0094 }
            r4.<init>(r2)     // Catch:{ RemoteException -> 0x0094 }
        L_0x002f:
            r1.recycle()     // Catch:{ RemoteException -> 0x0094 }
            r0.<init>(r4)     // Catch:{ RemoteException -> 0x0094 }
            r6.f193123e = r0
            org.chromium.weblayer.as r0 = new org.chromium.weblayer.as     // Catch:{ RemoteException -> 0x008d }
            android.os.Parcel r1 = r8.mo17260gA()     // Catch:{ RemoteException -> 0x008d }
            r2 = 16
            android.os.Parcel r8 = r8.mo17261gT(r2, r1)     // Catch:{ RemoteException -> 0x008d }
            android.os.IBinder r1 = r8.readStrongBinder()     // Catch:{ RemoteException -> 0x008d }
            if (r1 != 0) goto L_0x004a
            goto L_0x005d
        L_0x004a:
            java.lang.String r2 = "org.chromium.weblayer_private.interfaces.IPrerenderController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x008d }
            boolean r3 = r2 instanceof org.chromium.p5643b.p5644a.C72318an     // Catch:{ RemoteException -> 0x008d }
            if (r3 == 0) goto L_0x0058
            r3 = r2
            org.chromium.b.a.an r3 = (org.chromium.p5643b.p5644a.C72318an) r3     // Catch:{ RemoteException -> 0x008d }
            goto L_0x005d
        L_0x0058:
            org.chromium.b.a.an r3 = new org.chromium.b.a.an     // Catch:{ RemoteException -> 0x008d }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x008d }
        L_0x005d:
            r8.recycle()     // Catch:{ RemoteException -> 0x008d }
            r0.<init>(r3)     // Catch:{ RemoteException -> 0x008d }
            r6.f193124f = r0
            if (r9 == 0) goto L_0x006d
            java.util.Map r8 = f193120b
            r8.put(r7, r6)
            goto L_0x0072
        L_0x006d:
            java.util.Map r8 = f193119a
            r8.put(r7, r6)
        L_0x0072:
            org.chromium.b.a.ao r7 = r6.f193125g     // Catch:{ RemoteException -> 0x0086 }
            org.chromium.weblayer.au r8 = new org.chromium.weblayer.au     // Catch:{ RemoteException -> 0x0086 }
            r8.<init>(r6)     // Catch:{ RemoteException -> 0x0086 }
            android.os.Parcel r9 = r7.mo17260gA()     // Catch:{ RemoteException -> 0x0086 }
            com.google.android.p445a.C8850c.m23499h(r9, r8)     // Catch:{ RemoteException -> 0x0086 }
            r8 = 18
            r7.mo17262he(r8, r9)     // Catch:{ RemoteException -> 0x0086 }
            return
        L_0x0086:
            r7 = move-exception
            org.chromium.b.a.a r8 = new org.chromium.b.a.a
            r8.<init>(r7)
            throw r8
        L_0x008d:
            r7 = move-exception
            org.chromium.b.a.a r8 = new org.chromium.b.a.a
            r8.<init>(r7)
            throw r8
        L_0x0094:
            r7 = move-exception
            org.chromium.b.a.a r8 = new org.chromium.b.a.a
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.weblayer.C72587aw.<init>(java.lang.String, org.chromium.b.a.ao, boolean):void");
    }
}
