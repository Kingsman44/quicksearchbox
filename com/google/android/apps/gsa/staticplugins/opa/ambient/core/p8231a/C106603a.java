package com.google.android.apps.gsa.staticplugins.opa.ambient.core.p8231a;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.core.a.a */
/* compiled from: PG */
public final /* synthetic */ class C106603a implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C106615m f297234a;

    /* renamed from: b */
    public final /* synthetic */ Context f297235b;

    /* renamed from: c */
    public final /* synthetic */ int f297236c;

    public /* synthetic */ C106603a(C106615m mVar, Context context, int i) {
        this.f297234a = mVar;
        this.f297235b = context;
        this.f297236c = i;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C106615m mVar = this.f297234a;
        Context context = this.f297235b;
        int i = this.f297236c;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            boolean profileProxy = defaultAdapter.getProfileProxy(context, new C106614l(mVar, cVar, defaultAdapter), i);
            ((C58970a) ((C58970a) mVar.f297255c.mo56224b()).mo56372aa(23161)).mo56389s("Attempt to connect to profile proxy was successful? %s", Boolean.valueOf(profileProxy));
            if (profileProxy) {
                return "getDevicesForProfile";
            }
        }
        cVar.mo5437b(C58485gu.m89845m());
        return "getDevicesForProfile";
    }
}
