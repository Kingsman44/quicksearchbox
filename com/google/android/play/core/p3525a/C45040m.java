package com.google.android.play.core.p3525a;

import com.google.android.gms.tasks.C146010af;
import com.google.android.play.core.p3533e.C45069a;

/* renamed from: com.google.android.play.core.a.m */
/* compiled from: PG */
final class C45040m extends C45069a {

    /* renamed from: a */
    final /* synthetic */ String f117664a;

    /* renamed from: b */
    final /* synthetic */ C146010af f117665b;

    /* renamed from: c */
    final /* synthetic */ C45043p f117666c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45040m(C45043p pVar, C146010af afVar, String str, C146010af afVar2) {
        super(afVar);
        this.f117666c = pVar;
        this.f117664a = str;
        this.f117665b = afVar2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:5|6) */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        com.google.android.play.core.p3525a.C45043p.f117671a.mo48884b("The current version of the app could not be retrieved", new java.lang.Object[0]);
        r1 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0044 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48871a() {
        /*
            r9 = this;
            r0 = 0
            com.google.android.play.core.a.p r1 = r9.f117666c     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.play.core.e.k r2 = r1.f117673b     // Catch:{ RemoteException -> 0x0074 }
            android.os.IInterface r2 = r2.f117737m     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.play.core.a.a.a r2 = (com.google.android.play.core.p3525a.p3526a.C45026a) r2     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r3 = r1.f117674c     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r4 = r9.f117664a     // Catch:{ RemoteException -> 0x0074 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0074 }
            r5.<init>()     // Catch:{ RemoteException -> 0x0074 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0074 }
            r6.<init>()     // Catch:{ RemoteException -> 0x0074 }
            android.os.Bundle r7 = com.google.android.play.core.common.C45057b.m80219a()     // Catch:{ RemoteException -> 0x0074 }
            r6.putAll(r7)     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r7 = "playcore.version.code"
            r8 = 11004(0x2afc, float:1.542E-41)
            r6.putInt(r7, r8)     // Catch:{ RemoteException -> 0x0074 }
            r5.putAll(r6)     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r6 = "package.name"
            r5.putString(r6, r4)     // Catch:{ RemoteException -> 0x0074 }
            android.content.Context r4 = r1.f117675d     // Catch:{ NameNotFoundException -> 0x0044 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0044 }
            android.content.Context r1 = r1.f117675d     // Catch:{ NameNotFoundException -> 0x0044 }
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0044 }
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r4, r0)     // Catch:{ NameNotFoundException -> 0x0044 }
            int r1 = r1.versionCode     // Catch:{ NameNotFoundException -> 0x0044 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NameNotFoundException -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            com.google.android.play.core.c.a r1 = com.google.android.play.core.p3525a.C45043p.f117671a     // Catch:{ RemoteException -> 0x0074 }
            java.lang.String r4 = "The current version of the app could not be retrieved"
            java.lang.Object[] r6 = new java.lang.Object[r0]     // Catch:{ RemoteException -> 0x0074 }
            r1.mo48884b(r4, r6)     // Catch:{ RemoteException -> 0x0074 }
            r1 = 0
        L_0x004e:
            if (r1 == 0) goto L_0x0059
            java.lang.String r4 = "app.version.code"
            int r1 = r1.intValue()     // Catch:{ RemoteException -> 0x0074 }
            r5.putInt(r4, r1)     // Catch:{ RemoteException -> 0x0074 }
        L_0x0059:
            com.google.android.play.core.a.o r1 = new com.google.android.play.core.a.o     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.play.core.a.p r4 = r9.f117666c     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.gms.tasks.af r6 = r9.f117665b     // Catch:{ RemoteException -> 0x0074 }
            r1.<init>(r4, r6)     // Catch:{ RemoteException -> 0x0074 }
            android.os.Parcel r4 = r2.mo17260gA()     // Catch:{ RemoteException -> 0x0074 }
            r4.writeString(r3)     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.p445a.C8850c.m23497f(r4, r5)     // Catch:{ RemoteException -> 0x0074 }
            com.google.android.p445a.C8850c.m23499h(r4, r1)     // Catch:{ RemoteException -> 0x0074 }
            r1 = 2
            r2.mo17263hf(r1, r4)     // Catch:{ RemoteException -> 0x0074 }
            return
        L_0x0074:
            r1 = move-exception
            com.google.android.play.core.c.a r2 = com.google.android.play.core.p3525a.C45043p.f117671a
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r9.f117664a
            r3[r0] = r4
            java.lang.String r0 = "requestUpdateInfo(%s)"
            r2.mo48885c(r1, r0, r3)
            com.google.android.gms.tasks.af r0 = r9.f117665b
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            com.google.android.gms.tasks.aj r0 = r0.f394698a
            r0.mo122509w(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p3525a.C45040m.mo48871a():void");
    }
}
