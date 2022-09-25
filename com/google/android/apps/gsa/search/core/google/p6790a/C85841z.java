package com.google.android.apps.gsa.search.core.google.p6790a;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.C85662bm;
import com.google.android.apps.gsa.search.core.C85664bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90066dr;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8373k.p8374a.C109337a;
import com.google.android.libraries.gcoreclient.p1770i.p1771a.C21564c;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21675e;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21678h;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21682l;
import com.google.android.libraries.gcoreclient.p1796t.p1797a.C21683m;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3897e.p3917i.p3918a.C51262be;
import com.google.assistant.p3897e.p3917i.p3918a.C51264bg;
import com.google.assistant.p3897e.p3917i.p3918a.C51265bh;
import com.google.assistant.p3897e.p3917i.p3918a.C51266bi;
import com.google.assistant.p3897e.p3917i.p3918a.C51267bj;
import com.google.assistant.p3897e.p3917i.p3918a.C51269bl;
import com.google.assistant.p3897e.p3917i.p3918a.C51270bm;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52518us;
import com.google.assistant.p3897e.p3921j.C52522uw;
import com.google.common.android.p4521a.C58274c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.google.a.z */
/* compiled from: PG */
public final class C85841z {

    /* renamed from: a */
    public static final C59071e f232095a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.a.z");

    /* renamed from: b */
    public final Context f232096b;

    /* renamed from: c */
    public final C86124t f232097c;

    /* renamed from: d */
    public final C22871g f232098d;

    /* renamed from: e */
    public final C109337a f232099e;

    /* renamed from: f */
    public final C21682l f232100f;

    /* renamed from: g */
    public final C21683m f232101g;

    /* renamed from: h */
    public final C21675e f232102h;

    /* renamed from: i */
    private final C85664bo f232103i;

    /* renamed from: j */
    private final C22871g f232104j;

    /* renamed from: k */
    private final C21678h f232105k;

    public C85841z(Context context, C86124t tVar, C85664bo boVar, C21682l lVar, C21683m mVar, C21678h hVar, C21675e eVar, C22871g gVar, C22871g gVar2, C109337a aVar) {
        this.f232096b = context;
        this.f232103i = boVar;
        this.f232100f = lVar;
        this.f232101g = mVar;
        this.f232105k = hVar;
        this.f232102h = eVar;
        this.f232097c = tVar;
        this.f232098d = gVar;
        this.f232104j = gVar2;
        this.f232099e = aVar;
    }

    /* renamed from: b */
    public static C51267bj m137917b(C52522uw uwVar) {
        C51266bi biVar = (C51266bi) C51267bj.f133462e.createBuilder();
        long j = uwVar.f137869d;
        biVar.copyOnWrite();
        C51267bj bjVar = (C51267bj) biVar.instance;
        bjVar.f133464a |= 4;
        bjVar.f133467d = j;
        if (!uwVar.f137871f.isEmpty()) {
            String str = uwVar.f137870e;
            biVar.copyOnWrite();
            C51267bj bjVar2 = (C51267bj) biVar.instance;
            str.getClass();
            bjVar2.f133464a |= 1;
            bjVar2.f133465b = str;
            String str2 = uwVar.f137871f;
            biVar.copyOnWrite();
            C51267bj bjVar3 = (C51267bj) biVar.instance;
            str2.getClass();
            bjVar3.f133464a |= 2;
            bjVar3.f133466c = str2;
        }
        return (C51267bj) biVar.build();
    }

    /* renamed from: c */
    public static C52232kc m137918c(C51270bm bmVar) {
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "asst.device.carrier.params";
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.CarrierParams";
        C63088z byteString = bmVar.toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        return (C52232kc) kbVar.build();
    }

    /* renamed from: g */
    private final String m137919g() {
        m137920h();
        return "apn";
    }

    /* renamed from: h */
    private final boolean m137920h() {
        return this.f232096b.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }

    /* renamed from: a */
    public final C51265bh mo79472a() {
        Uri uri;
        if (!this.f232103i.mo79197l(C85662bm.DEVICE_CONTACTS)) {
            C51265bh bhVar = (C51265bh) C51270bm.f133476f.createBuilder();
            C51269bl blVar = C51269bl.UDC_DI_OPTED_OUT;
            bhVar.copyOnWrite();
            C51270bm bmVar = (C51270bm) bhVar.instance;
            bmVar.f133480c = Integer.valueOf(blVar.f133475f);
            bmVar.f133479b = 3;
            return bhVar;
        }
        TelephonyManager telephonyManager = (TelephonyManager) C39239a.m68666a(this.f232096b, C39226b.TAG_CLASSIC_ASSISTANT).getSystemService("phone");
        String str = null;
        if (telephonyManager == null) {
            return null;
        }
        C51265bh bhVar2 = (C51265bh) C51270bm.f133476f.createBuilder();
        if (telephonyManager.getSimState() == 1) {
            C51269bl blVar2 = C51269bl.SIM_STATE_ABSENT;
            bhVar2.copyOnWrite();
            C51270bm bmVar2 = (C51270bm) bhVar2.instance;
            bmVar2.f133480c = Integer.valueOf(blVar2.f133475f);
            bmVar2.f133479b = 3;
            return bhVar2;
        } else if (telephonyManager.getSimState() != 5) {
            C51269bl blVar3 = C51269bl.INVALID_SIM_STATE;
            bhVar2.copyOnWrite();
            C51270bm bmVar3 = (C51270bm) bhVar2.instance;
            bmVar3.f133480c = Integer.valueOf(blVar3.f133475f);
            bmVar3.f133479b = 3;
            return bhVar2;
        } else {
            C51262be beVar = (C51262be) C51264bg.f133454g.createBuilder();
            try {
                String simOperator = telephonyManager.getSimOperator();
                if (!TextUtils.isEmpty(simOperator)) {
                    beVar.mo53564c(Integer.parseInt(simOperator));
                }
            } catch (SecurityException e) {
                C59104x c = f232095a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7934)).mo56386p("SecurityException when reading MCCMNC");
            } catch (NumberFormatException e2) {
                C59104x c2 = f232095a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(7935)).mo56386p("Unexpected MCCMNC number");
            }
            try {
                String simOperatorName = telephonyManager.getSimOperatorName();
                if (!TextUtils.isEmpty(simOperatorName)) {
                    beVar.mo53565d(simOperatorName);
                }
            } catch (SecurityException e3) {
                C59104x c3 = f232095a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(7933)).mo56386p("SecurityException when reading SPN value");
            }
            if (!this.f232097c.mo79746e(C90066dr.f249686i)) {
                try {
                    String groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                    if (!TextUtils.isEmpty(groupIdLevel1)) {
                        beVar.mo53563b(groupIdLevel1);
                    }
                } catch (SecurityException e4) {
                    C59104x c4 = f232095a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                    ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(7932)).mo56386p("SecurityException when reading GID1 value");
                }
            }
            ContentResolver contentResolver = this.f232096b.getContentResolver();
            if (m137920h()) {
                uri = Telephony.Carriers.CONTENT_URI;
            } else {
                uri = Uri.parse("content://telephony/carriers/");
            }
            Cursor query = contentResolver.query(Uri.withAppendedPath(uri, "preferapn"), new String[]{m137919g()}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                try {
                    int columnIndex = query.getColumnIndex(m137919g());
                    if (columnIndex == -1) {
                        C59104x d = f232095a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                        ((C59052c) ((C59052c) d).mo56372aa(7945)).mo56386p("Requested APN column not present in the result cursor");
                    } else if (query.moveToNext()) {
                        str = query.getString(columnIndex);
                    }
                } catch (Exception e5) {
                    try {
                        C59104x d2 = f232095a.mo56226d();
                        d2.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                        ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e5)).mo56372aa(7944)).mo56386p("Failed to read APN");
                    } catch (SecurityException e6) {
                        C59104x c5 = f232095a.mo56225c();
                        c5.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                        ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e6)).mo56372aa(7931)).mo56386p("SecurityException when reading APN value");
                    } catch (Throwable th) {
                        query.close();
                        throw th;
                    }
                }
                query.close();
            }
            if (!TextUtils.isEmpty(str)) {
                beVar.mo53562a(str);
            }
            try {
                if (telephonyManager.isNetworkRoaming()) {
                    beVar.copyOnWrite();
                    C51264bg bgVar = (C51264bg) beVar.instance;
                    bgVar.f133461f = 1;
                    bgVar.f133456a |= 2;
                } else {
                    beVar.copyOnWrite();
                    C51264bg bgVar2 = (C51264bg) beVar.instance;
                    bgVar2.f133461f = 2;
                    bgVar2.f133456a |= 2;
                }
            } catch (SecurityException e7) {
                C59104x c6 = f232095a.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "CarrierParamsFiller");
                ((C59052c) ((C59052c) ((C59052c) c6).mo56382g(e7)).mo56372aa(7930)).mo56386p("SecurityException when reading isNetworkRoaming");
                beVar.copyOnWrite();
                C51264bg bgVar3 = (C51264bg) beVar.instance;
                bgVar3.f133461f = 0;
                bgVar3.f133456a |= 2;
            }
            C51264bg bgVar4 = (C51264bg) beVar.build();
            bhVar2.copyOnWrite();
            C51270bm bmVar4 = (C51270bm) bhVar2.instance;
            bgVar4.getClass();
            bmVar4.f133480c = bgVar4;
            bmVar4.f133479b = 1;
            return bhVar2;
        }
    }

    /* renamed from: d */
    public final C60870cx mo79473d(C85840y yVar) {
        C60870cx cxVar;
        C60870cx cxVar2;
        C58976aa aaVar = C58975e.f156826a;
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        usVar.copyOnWrite();
        C52522uw uwVar = (C52522uw) usVar.instance;
        uwVar.f137867b = 1;
        uwVar.f137866a = 1 | uwVar.f137866a;
        long a = this.f232097c.mo79743a(C90014bt.f247338fK);
        if (a != 0) {
            usVar.copyOnWrite();
            C52522uw uwVar2 = (C52522uw) usVar.instance;
            uwVar2.f137866a |= 4;
            uwVar2.f137869d = a;
            String x = this.f232097c.mo79758x(C90014bt.f247339fL);
            usVar.copyOnWrite();
            C52522uw uwVar3 = (C52522uw) usVar.instance;
            x.getClass();
            uwVar3.f137866a |= 8;
            uwVar3.f137870e = x;
            String x2 = this.f232097c.mo79758x(C90014bt.f247339fL);
            usVar.copyOnWrite();
            C52522uw uwVar4 = (C52522uw) usVar.instance;
            x2.getClass();
            uwVar4.f137866a |= 16;
            uwVar4.f137871f = x2;
            cxVar = C60856cj.m92900i((C52522uw) usVar.build());
        } else {
            C58872ci d = C58872ci.m90947d(C58274c.f155808a);
            Context context = this.f232096b;
            C85840y yVar2 = C85840y.OPA_TASK_REQUEST;
            try {
                cxVar2 = C21564c.m40696a(this.f232100f.mo27053a(context, this.f232101g.mo27054a().mo27055a()).mo27050a(this.f232105k.mo27070a(yVar.f232094c)));
            } catch (Exception e) {
                cxVar2 = C60856cj.m92899h(e);
            }
            C60856cj.m92911t(cxVar2, new C85839x(this, d), C60826bg.f164896a);
            cxVar = this.f232104j.mo28210j(cxVar2, "Handle gcoreMdpCarrierPlanIdResponseFuture to get CarrierParams", new C85833r(usVar));
        }
        return this.f232098d.mo28205e(C90877ak.m148471e(this.f232098d.mo28210j(cxVar, "Handle gtaf carrier plan information to get CarrierParams", new C85837v(this)), this.f232097c.mo79743a(C90014bt.f247437hD), TimeUnit.MILLISECONDS, this.f232104j), "Catching exceptions from fetching gtaf carrier plan info", Exception.class, new C85838w(this));
    }

    /* renamed from: e */
    public final C60870cx mo79474e(C85840y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        return this.f232104j.mo28209i(mo79473d(yVar), "Handle CarrierParams to get CarrierParamsProtobuf", C85836u.f232086a);
    }

    /* renamed from: f */
    public final C58833ax mo79475f(int i, String str) {
        C51265bh a = mo79472a();
        if (a == null) {
            return C58836b.f156633a;
        }
        C52518us usVar = (C52518us) C52522uw.f137864j.createBuilder();
        usVar.copyOnWrite();
        C52522uw uwVar = (C52522uw) usVar.instance;
        uwVar.f137867b = i - 1;
        uwVar.f137866a |= 1;
        usVar.copyOnWrite();
        C52522uw uwVar2 = (C52522uw) usVar.instance;
        uwVar2.f137866a |= 2;
        uwVar2.f137868c = str;
        a.copyOnWrite();
        C51270bm bmVar = (C51270bm) a.instance;
        C52522uw uwVar3 = (C52522uw) usVar.build();
        C51270bm bmVar2 = C51270bm.f133476f;
        uwVar3.getClass();
        bmVar.f133482e = uwVar3;
        bmVar.f133478a |= 16;
        C51267bj bjVar = C51267bj.f133462e;
        a.copyOnWrite();
        C51270bm bmVar3 = (C51270bm) a.instance;
        bjVar.getClass();
        bmVar3.f133481d = bjVar;
        bmVar3.f133478a |= 8;
        return C58833ax.m90834k((C51270bm) a.build());
    }
}
