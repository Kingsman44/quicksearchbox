package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.bl */
/* compiled from: PG */
abstract class C89473bl implements C89483bv {

    /* renamed from: a */
    private final String f242490a;

    /* renamed from: b */
    private final C58528ij f242491b;

    /* renamed from: l */
    protected final long f242492l;

    /* renamed from: m */
    final /* synthetic */ C89474bm f242493m;

    public C89473bl(C89474bm bmVar, String str, int i) {
        this(bmVar, str, (C58528ij) new C58759qy(Integer.valueOf(i)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g mo83357b(com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g r6) {
        /*
            r5 = this;
            java.lang.String r0 = r5.f242490a
            com.google.android.apps.gsa.shared.bisto.a.bm r1 = r5.f242493m
            android.content.Context r1 = r1.f242495b
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r2 = r6.f344053c
            if (r2 != 0) goto L_0x000c
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj.f343868n
        L_0x000c:
            int r2 = r2.f343870a
            r2 = r2 & 8
            if (r2 == 0) goto L_0x0014
            goto L_0x00c5
        L_0x0014:
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "simple-"
            boolean r2 = r0.startsWith(r2)
            r3 = 0
            if (r2 == 0) goto L_0x005f
            java.lang.String r2 = "usb"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.usb.UsbManager r1 = (android.hardware.usb.UsbManager) r1
            if (r1 != 0) goto L_0x002a
            goto L_0x0087
        L_0x002a:
            java.util.HashMap r1 = r1.getDeviceList()
            if (r1 != 0) goto L_0x0031
            goto L_0x0087
        L_0x0031:
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0039:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0087
            java.lang.Object r2 = r1.next()
            android.hardware.usb.UsbDevice r2 = (android.hardware.usb.UsbDevice) r2
            java.lang.String r4 = com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124521b.m203980c(r2)
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x0039
            java.lang.String r0 = r2.getProductName()
            java.lang.String r1 = r2.getDeviceName()
            java.lang.Object r0 = com.google.common.base.C58831av.m90830c(r0, r1)
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0087
        L_0x005f:
            java.lang.String r2 = "wired"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x0073
            android.content.res.Resources r0 = r1.getResources()
            r1 = 2132084008(0x7f150528, float:1.9808174E38)
            java.lang.String r3 = r0.getString(r1)
            goto L_0x0087
        L_0x0073:
            android.bluetooth.BluetoothAdapter r1 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r1 != 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            android.bluetooth.BluetoothDevice r0 = r1.getRemoteDevice(r0)     // Catch:{ IllegalArgumentException -> 0x0086 }
            if (r0 != 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            java.lang.String r3 = r0.getName()     // Catch:{ IllegalArgumentException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            boolean r0 = com.google.common.base.C58837ba.m90859h(r3)
            if (r0 != 0) goto L_0x00c5
            com.google.android.apps.search.assistant.surfaces.bisto.d.f r6 = com.google.android.apps.gsa.shared.bisto.p7028a.C89474bm.m145533c(r6)
            com.google.android.apps.search.assistant.surfaces.bisto.d.bi r0 = com.google.android.apps.gsa.shared.bisto.p7028a.C89474bm.m145538h(r6)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r1
            r3.getClass()
            int r2 = r1.f343870a
            r2 = r2 | 8
            r1.f343870a = r2
            r1.f343874e = r3
            r6.copyOnWrite()
            com.google.protobuf.bv r1 = r6.instance
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r1 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.bj r0 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj) r0
            r0.getClass()
            r1.f344053c = r0
            int r0 = r1.f344051a
            r0 = r0 | 2
            r1.f344051a = r0
            com.google.protobuf.bv r6 = r6.build()
            com.google.android.apps.search.assistant.surfaces.bisto.d.g r6 = (com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g) r6
        L_0x00c5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.shared.bisto.p7028a.C89473bl.mo83357b(com.google.android.apps.search.assistant.surfaces.bisto.d.g):com.google.android.apps.search.assistant.surfaces.bisto.d.g");
    }

    /* renamed from: c */
    public final void mo83358c(C124709g gVar, C124709g gVar2) {
        C58976aa aaVar = C58975e.f156826a;
        this.f242493m.mo83413s(this.f242490a, C89582fm.m145803a(this.f242491b, gVar, gVar2), this.f242492l, gVar2, true);
    }

    public C89473bl(C89474bm bmVar, String str, C58528ij ijVar) {
        this.f242493m = bmVar;
        this.f242490a = str;
        this.f242491b = ijVar;
        this.f242492l = bmVar.f242500g.mo26870b();
    }
}
