package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.base.C58879cp;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.bk */
/* compiled from: PG */
public final /* synthetic */ class C96015bk implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268824a;

    /* renamed from: b */
    public final /* synthetic */ String f268825b;

    /* renamed from: c */
    public final /* synthetic */ int f268826c;

    public /* synthetic */ C96015bk(C96017bm bmVar, String str, int i) {
        this.f268824a = bmVar;
        this.f268825b = str;
        this.f268826c = i;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268824a;
        String str = this.f268825b;
        int i = this.f268826c;
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String R = ((C124548d) entry.getValue()).mo106477R();
            if (!C58879cp.m90962d(R) && R.equals(str)) {
                BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice((String) entry.getKey());
                bmVar.f268838h.mo19417j(remoteDevice, str);
                bmVar.mo89887k(remoteDevice, (C124548d) entry.getValue(), i);
            }
        }
    }
}
