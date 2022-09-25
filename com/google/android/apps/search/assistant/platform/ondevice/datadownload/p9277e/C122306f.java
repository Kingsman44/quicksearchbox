package com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e;

import java.util.Locale;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.f */
/* compiled from: PG */
public final /* synthetic */ class C122306f implements Function {

    /* renamed from: a */
    public final /* synthetic */ C122314n f339155a;

    /* renamed from: b */
    public final /* synthetic */ Optional f339156b;

    /* renamed from: c */
    public final /* synthetic */ Locale f339157c;

    /* renamed from: d */
    public final /* synthetic */ String f339158d;

    public /* synthetic */ C122306f(C122314n nVar, Optional optional, Locale locale, String str) {
        this.f339155a = nVar;
        this.f339156b = optional;
        this.f339157c = locale;
        this.f339158d = str;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.n r0 = r10.f339155a
            j$.util.Optional r1 = r10.f339156b
            java.util.Locale r2 = r10.f339157c
            java.lang.String r3 = r10.f339158d
            com.google.assistant.ae.a.b r11 = (com.google.assistant.p3793ae.p3794a.C48770b) r11
            r4 = 4
            j$.util.Optional[] r4 = new p3186j$.util.Optional[r4]
            com.google.android.libraries.mdi.f r5 = r11.f126196a
            if (r5 != 0) goto L_0x0013
            com.google.android.libraries.mdi.f r5 = com.google.android.libraries.mdi.C29690f.f80408m
        L_0x0013:
            java.lang.String r5 = r5.f80413d
            android.accounts.Account r6 = com.google.android.libraries.mdi.download.p2228a.C28694b.m53576a(r5)
            boolean r5 = r5.isEmpty()
            r7 = 1
            r8 = 0
            if (r5 != 0) goto L_0x0025
            if (r6 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = 0
        L_0x0026:
            boolean r9 = r1.isPresent()
            if (r9 == 0) goto L_0x0035
            if (r5 != 0) goto L_0x0035
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r1 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.NO_ACCOUNT
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x005e
        L_0x0035:
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.d r5 = new com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.d
            r5.<init>(r6)
            j$.util.Optional r1 = r1.map(r5)
            if (r6 == 0) goto L_0x0042
            r5 = 1
            goto L_0x0043
        L_0x0042:
            r5 = 0
        L_0x0043:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            java.lang.Object r1 = r1.orElse(r5)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005a
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r1 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.DIFFERENT_ACCOUNT
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x005e
        L_0x005a:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x005e:
            r4[r8] = r1
            com.google.assistant.ae.a.e r1 = r11.f126197b
            if (r1 == 0) goto L_0x0077
            java.lang.String r1 = r1.f126201b
            j$.util.Optional r1 = com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17161x.m34312a(r1, r2)
            boolean r1 = r1.isPresent()
            if (r1 != 0) goto L_0x00a1
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r1 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.DIFFERENT_LOCALE
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x00a5
        L_0x0077:
            com.google.android.libraries.mdi.f r1 = r11.f126196a
            if (r1 != 0) goto L_0x007d
            com.google.android.libraries.mdi.f r1 = com.google.android.libraries.mdi.C29690f.f80408m
        L_0x007d:
            boolean r1 = com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17160w.m34311b(r1)
            if (r1 == 0) goto L_0x00a1
            com.google.android.libraries.mdi.f r1 = r11.f126196a
            if (r1 != 0) goto L_0x0089
            com.google.android.libraries.mdi.f r1 = com.google.android.libraries.mdi.C29690f.f80408m
        L_0x0089:
            com.google.protobuf.cq r1 = r1.f80419j
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.j r5 = new com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.j
            r5.<init>(r2)
            boolean r1 = r1.anyMatch(r5)
            if (r1 != 0) goto L_0x00a1
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r1 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.DIFFERENT_LOCALE
            j$.util.Optional r1 = p3186j$.util.Optional.m71637of(r1)
            goto L_0x00a5
        L_0x00a1:
            j$.util.Optional r1 = p3186j$.util.Optional.empty()
        L_0x00a5:
            r4[r7] = r1
            android.content.Context r0 = r0.f339171c
            com.google.assistant.ae.a.e r1 = r11.f126197b
            if (r1 == 0) goto L_0x00be
            java.lang.String r0 = com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an.m34275j(r0)
            boolean r0 = com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an.m34280o(r1, r0)
            if (r0 != 0) goto L_0x00be
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r0 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.INCOMPATIBLE_MIN_APK
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x00c2
        L_0x00be:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x00c2:
            r1 = 2
            r4[r1] = r0
            com.google.android.libraries.mdi.f r11 = r11.f126196a
            if (r11 != 0) goto L_0x00cb
            com.google.android.libraries.mdi.f r11 = com.google.android.libraries.mdi.C29690f.f80408m
        L_0x00cb:
            int r0 = r11.f80415f
            com.google.android.libraries.mdi.e r0 = com.google.android.libraries.mdi.C29689e.m54781a(r0)
            if (r0 != 0) goto L_0x00d5
            com.google.android.libraries.mdi.e r0 = com.google.android.libraries.mdi.C29689e.UNSPECIFIED
        L_0x00d5:
            com.google.android.libraries.mdi.e r1 = com.google.android.libraries.mdi.C29689e.PENDING
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x00f5
            int r11 = r11.f80415f
            com.google.android.libraries.mdi.e r11 = com.google.android.libraries.mdi.C29689e.m54781a(r11)
            if (r11 != 0) goto L_0x00e7
            com.google.android.libraries.mdi.e r11 = com.google.android.libraries.mdi.C29689e.UNSPECIFIED
        L_0x00e7:
            com.google.android.libraries.mdi.e r0 = com.google.android.libraries.mdi.C29689e.PENDING_CUSTOM_VALIDATION
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x00f0
            goto L_0x00f5
        L_0x00f0:
            j$.util.Optional r11 = p3186j$.util.Optional.empty()
            goto L_0x00fb
        L_0x00f5:
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r11 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.PENDING_DOWNLOAD
            j$.util.Optional r11 = p3186j$.util.Optional.m71637of(r11)
        L_0x00fb:
            r0 = 3
            r4[r0] = r11
            j$.util.stream.Stream r11 = p3186j$.util.DesugarArrays.stream((T[]) r4)
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.c r0 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122303c.f339152a
            j$.util.stream.Stream r11 = r11.filter(r0)
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.e r0 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122305e.f339154a
            j$.util.stream.Stream r11 = r11.map(r0)
            j$.util.stream.Collector r0 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r11 = r11.collect(r0)
            com.google.common.b.gu r11 = (com.google.common.p4522b.C58485gu) r11
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0130
            com.google.common.f.a.d r11 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122314n.f339169a
            com.google.common.f.x r11 = r11.mo56226d()
            java.lang.String r0 = "Found a matching group for %s, but expected a reason this group does not match"
            r1 = 34748(0x87bc, float:4.8692E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r11).mo56372aa(r1)).mo56389s(r0, r3)
            com.google.android.apps.search.assistant.platform.ondevice.datadownload.e.a r11 = com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122301a.UNKNOWN_DIFFERENCE
            com.google.common.b.gu r11 = com.google.common.p4522b.C58485gu.m89846n(r11)
        L_0x0130:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9277e.C122306f.apply(java.lang.Object):java.lang.Object");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
