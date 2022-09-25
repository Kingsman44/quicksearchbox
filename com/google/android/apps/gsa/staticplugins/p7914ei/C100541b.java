package com.google.android.apps.gsa.staticplugins.p7914ei;

import android.util.SparseBooleanArray;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.udc.C87197aa;
import com.google.android.apps.gsa.search.core.udc.C87223s;
import com.google.android.apps.gsa.search.core.udc.C87224t;
import com.google.android.apps.gsa.search.core.udc.C87229y;
import com.google.android.apps.gsa.search.core.udc.C87230z;
import com.google.android.apps.gsa.shared.p7066m.C90109fg;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.C143843o;
import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.udc.p10875a.C146057j;
import com.google.android.gms.udc.p10875a.C146058k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.p4230bn.p4234b.p4235a.p4236a.p4237a.C56116b;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.ei.b */
/* compiled from: PG */
public final class C100541b implements C143712ae {

    /* renamed from: a */
    private static final C59071e f281102a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.ei.b");

    /* renamed from: b */
    private final C143851w f281103b;

    /* renamed from: c */
    private final C56116b[] f281104c;

    /* renamed from: d */
    private final C86124t f281105d;

    /* renamed from: e */
    private final SettableFuture f281106e = new SettableFuture();

    public C100541b(C143851w wVar, C86124t tVar, C56116b[] bVarArr) {
        this.f281103b = wVar;
        this.f281104c = bVarArr;
        this.f281105d = tVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo6030a(C143711ad adVar) {
        String str;
        C146058k kVar = (C146058k) adVar;
        this.f281103b.mo119132g();
        if (kVar.f394784a.mo119097c()) {
            SettableFuture settableFuture = this.f281106e;
            UdcCacheResponse udcCacheResponse = kVar.f394785b;
            udcCacheResponse.getClass();
            C87230z zVar = (C87230z) C87197aa.f235604b.createBuilder();
            int[] iArr = udcCacheResponse.f394771b;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr != null ? iArr.length : 0);
            if (iArr != null) {
                for (int put : iArr) {
                    sparseBooleanArray.put(put, true);
                }
            }
            List<UdcCacheResponse.UdcSetting> list = udcCacheResponse.f394770a;
            if (list != null) {
                for (UdcCacheResponse.UdcSetting udcSetting : list) {
                    C56116b a = C56116b.m87897a(udcSetting.f394774a);
                    if (a == null) {
                        a = C56116b.UNKNOWN_ID;
                    }
                    C87224t tVar = (C87224t) C87229y.f235649e.createBuilder();
                    tVar.copyOnWrite();
                    C87229y yVar = (C87229y) tVar.instance;
                    yVar.f235652b = a.f149511l;
                    yVar.f235651a |= 1;
                    int i = udcSetting.f394775b;
                    int i2 = 3;
                    int i3 = i != 2 ? i != 3 ? 1 : 3 : 2;
                    tVar.copyOnWrite();
                    C87229y yVar2 = (C87229y) tVar.instance;
                    yVar2.f235653c = i3 - 1;
                    yVar2.f235651a |= 2;
                    boolean z = udcSetting.f394775b == 2 || sparseBooleanArray.get(udcSetting.f394774a, false);
                    if ((this.f281105d.mo79746e(C90109fg.f250568j) && i3 == 1) || z) {
                        i2 = 2;
                    }
                    tVar.copyOnWrite();
                    C87229y yVar3 = (C87229y) tVar.instance;
                    yVar3.f235654d = i2 - 1;
                    yVar3.f235651a |= 4;
                    zVar.copyOnWrite();
                    C87197aa aaVar = (C87197aa) zVar.instance;
                    C87229y yVar4 = (C87229y) tVar.build();
                    yVar4.getClass();
                    aaVar.mo80832a();
                    aaVar.f235606a.add(yVar4);
                }
            }
            settableFuture.mo57356n((C87197aa) zVar.build());
            return;
        }
        C59052c cVar = (C59052c) ((C59052c) f281102a.mo56225c()).mo56372aa(33495);
        int i4 = kVar.f394784a.f389621g;
        switch (i4) {
            case 4500:
                str = "CONSENT_REQUIRED";
                break;
            case 4501:
                str = "NOT_AVAILABLE";
                break;
            case 4502:
                str = "CONNECTION_ERROR";
                break;
            case 4503:
                str = "PROTO_ERROR";
                break;
            case 4504:
                str = "AUTH_ERROR";
                break;
            case 4505:
                str = "SERVER_ERROR";
                break;
            case 4506:
                str = "CLIENT_ERROR";
                break;
            case 4507:
                str = "END_OF_SERVICE";
                break;
            default:
                str = C143843o.m233808a(i4);
                break;
        }
        cVar.mo56389s("Failed to get cached settings: %s", str);
        this.f281106e.mo57357o(new C87223s(kVar.f394784a.f389621g));
    }

    /* renamed from: b */
    public final C60870cx mo91961b() {
        int[] iArr = new int[this.f281104c.length];
        int i = 0;
        while (true) {
            C56116b[] bVarArr = this.f281104c;
            if (i < bVarArr.length) {
                iArr[i] = bVarArr[i].f149511l;
                i++;
            } else {
                C146057j.m237909a(this.f281103b, new UdcCacheRequest(iArr)).mo117321f(this);
                this.f281103b.mo119131f();
                return this.f281106e;
            }
        }
    }
}
