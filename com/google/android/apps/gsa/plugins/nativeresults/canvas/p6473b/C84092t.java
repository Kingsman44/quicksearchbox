package com.google.android.apps.gsa.plugins.nativeresults.canvas.p6473b;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84128c;
import com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.C84150y;
import com.google.android.libraries.componentview.services.application.C20599bz;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.application.LogData;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.p4570p.C60344a;
import com.google.common.p4552o.p4570p.C60382c;
import com.google.common.p4552o.p4570p.C60383d;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.b.t */
/* compiled from: PG */
public final class C84092t implements C20601ca {

    /* renamed from: a */
    private static final C59071e f228994a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.b.t");

    /* renamed from: b */
    private final C84150y f228995b;

    /* renamed from: c */
    private final int f228996c;

    /* renamed from: d */
    private final boolean f228997d;

    public C84092t(C84150y yVar, int i, boolean z) {
        this.f228995b = yVar;
        this.f228996c = i;
        this.f228997d = z;
    }

    /* renamed from: a */
    public final void mo21037a(LogData logData) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f228997d) {
            try {
                boolean z = !TextUtils.isEmpty(logData.mo25460d());
                if (z) {
                    C59104x d = f228994a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "CanvasLogger");
                    ((C59052c) ((C59052c) d).mo56372aa(7035)).mo56386p("Set 'sqi' parameter without request ID");
                }
                C84128c cVar = new C84128c();
                cVar.mo77557b(logData);
                cVar.mo77558c(z);
                this.f228995b.mo77564b(cVar.mo77556a());
            } catch (RemoteException e) {
                C59104x c = f228994a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CanvasLogger");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7034)).mo56386p("RemoteException while logging clicks");
            }
        }
    }

    /* renamed from: b */
    public final void mo25487b(C20599bz bzVar) {
        Bundle bundle;
        try {
            byte[] bArr = null;
            if (bzVar.mo25543g() != null) {
                bundle = new Bundle();
                bundle.putSerializable("exception", bzVar.mo25543g());
            } else {
                bundle = null;
            }
            String f = bzVar.mo25542f();
            String c = bzVar.mo25539c();
            if (!(f == null && c == null)) {
                C60382c cVar = C60382c.f163409a;
                C60344a aVar = (C60344a) C60383d.f163411e.createBuilder();
                aVar.copyOnWrite();
                C60383d dVar = (C60383d) aVar.instance;
                cVar.getClass();
                dVar.f163414b = cVar;
                dVar.f163413a |= 1;
                if (f != null) {
                    aVar.copyOnWrite();
                    C60383d dVar2 = (C60383d) aVar.instance;
                    dVar2.f163413a |= 2;
                    dVar2.f163415c = f;
                }
                if (c != null) {
                    aVar.copyOnWrite();
                    C60383d dVar3 = (C60383d) aVar.instance;
                    dVar3.f163413a |= 4;
                    dVar3.f163416d = c;
                }
                bArr = ((C60383d) aVar.build()).toByteArray();
            }
            this.f228995b.mo77566d(this.f228996c, bzVar.mo25537a().f54847G + 459752, bundle, bArr);
        } catch (RemoteException e) {
            C59104x c2 = f228994a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "CanvasLogger");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(7037)).mo56386p("RemoteException while logging error");
        }
    }

    /* renamed from: c */
    public final void mo25488c(String str) {
        try {
            this.f228995b.mo77569g(str);
        } catch (RemoteException e) {
            C59104x c = f228994a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CanvasLogger");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7038)).mo56386p("RemoteException while logging raw click url");
        }
    }

    /* renamed from: d */
    public final void mo25489d(String str, String str2, String str3, Map map) {
        if (!this.f228997d) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        try {
            this.f228995b.mo77570h(str, str2, str3, map);
        } catch (RemoteException e) {
            C59104x c = f228994a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CanvasLogger");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7039)).mo56386p("RemoteException while logging a visibility change");
        }
    }

    /* renamed from: e */
    public final void mo25490e(C60321oe oeVar) {
        try {
            this.f228995b.mo77571i(oeVar.toByteArray());
        } catch (RemoteException e) {
            C59104x c = f228994a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CanvasLogger");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7041)).mo56386p("RemoteException while logging error");
        }
    }
}
