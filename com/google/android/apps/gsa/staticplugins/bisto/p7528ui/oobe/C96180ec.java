package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.util.Base64;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96448af;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96461as;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4591e.p4592a.p4594b.p4596b.C61024c;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ec */
/* compiled from: PG */
public final /* synthetic */ class C96180ec implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C96183ef f269217a;

    public /* synthetic */ C96180ec(C96183ef efVar) {
        this.f269217a = efVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        byte[] bArr;
        BluetoothAdapter defaultAdapter;
        byte[] decode;
        C96183ef efVar = this.f269217a;
        if (efVar.f269231h) {
            decode = efVar.f269230g;
            if (decode == null) {
                throw new IllegalStateException("gacsPsk is null");
            }
        } else {
            C61024c cVar = efVar.f269222A;
            if (cVar != null) {
                Map b = C96448af.m159803b(cVar.f165244b, "fgak");
                if (b == null || !b.containsKey(C19621k.f54601a)) {
                    C59104x c = C96448af.f269824a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "JwtParser");
                    ((C59052c) ((C59052c) c).mo56372aa(17150)).mo56386p("Missing PSK");
                } else {
                    try {
                        decode = Base64.decode((String) b.get(C19621k.f54601a), 8);
                    } catch (IllegalArgumentException e) {
                        C59104x d = C96448af.f269824a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "JwtParser");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17151)).mo56386p("Invalid URL_SAFE PSK");
                        try {
                            decode = Base64.decode((String) b.get(C19621k.f54601a), 0);
                        } catch (IllegalArgumentException e2) {
                            C59104x c2 = C96448af.f269824a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "JwtParser");
                            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(17152)).mo56386p("Invalid PSK");
                        }
                    }
                }
            }
            bArr = null;
            defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (!(bArr == null || efVar.f269227d == null || defaultAdapter == null)) {
                C96461as.m159825b(efVar.getContext(), defaultAdapter.getRemoteDevice(efVar.f269226c), efVar.f269227d, efVar.f269228e, bArr, ((C83893b) efVar.f269232i.mo27525b()).mo77278a());
            }
            return null;
        }
        bArr = decode;
        defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        C96461as.m159825b(efVar.getContext(), defaultAdapter.getRemoteDevice(efVar.f269226c), efVar.f269227d, efVar.f269228e, bArr, ((C83893b) efVar.f269232i.mo27525b()).mo77278a());
        return null;
    }
}
