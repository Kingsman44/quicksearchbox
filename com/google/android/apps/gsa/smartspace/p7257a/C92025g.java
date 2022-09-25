package com.google.android.apps.gsa.smartspace.p7257a;

import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.opa.smartspace.C83802r;
import com.google.android.apps.gsa.opa.smartspace.p6455d.C83761d;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.apps.gsa.smartspace.C92122r;
import com.google.assistant.p3886c.C50701am;
import com.google.assistant.p3886c.C50704ap;
import com.google.assistant.p3886c.C50706ar;
import com.google.assistant.p3886c.C50709au;
import com.google.assistant.p3886c.C50710av;
import com.google.assistant.p3886c.C50738bc;
import com.google.assistant.p3886c.C50745bj;
import com.google.assistant.p3886c.C50746bk;
import com.google.assistant.p3886c.C50788cl;
import com.google.assistant.p3886c.C50789cm;
import com.google.assistant.p3886c.C50790cn;
import com.google.assistant.p3886c.C50794cr;
import com.google.assistant.p3886c.C50796ct;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3886c.p3888b.C50729n;
import com.google.assistant.p3886c.p3888b.C50731p;
import com.google.assistant.p3886c.p3888b.C50732q;
import com.google.assistant.p3886c.p3888b.C50733r;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.io.ByteArrayOutputStream;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.smartspace.a.g */
/* compiled from: PG */
public final class C92025g {

    /* renamed from: a */
    private static final C59071e f256555a = C59071e.m91332i("com.google.android.apps.gsa.smartspace.a.g");

    /* renamed from: a */
    public static C50794cr m151032a(C50701am amVar) {
        C50794cr crVar = C50794cr.UNDEFINED;
        C50701am amVar2 = C50701am.UNKNOWN;
        int ordinal = amVar.ordinal();
        if (ordinal == 4 || ordinal == 14) {
            return C50794cr.MEDIA;
        }
        if (ordinal != 22) {
            return ordinal != 37 ? C50794cr.UNDEFINED : C50794cr.DRIVING_MODE;
        }
        return C50794cr.HAMMERSPACE_DEBUG;
    }

    /* renamed from: b */
    public static C58833ax m151033b(C50738bc bcVar) {
        Object obj;
        C58833ax c = C58557jl.m90122c(bcVar.f132043j, C92023e.f256553a);
        if (!c.mo56113h()) {
            return C58836b.f156633a;
        }
        C50745bj bjVar = (C50745bj) C50746bk.f132059b.createBuilder();
        C50706ar arVar = ((C50704ap) c.mo56107c()).f131958c;
        if (arVar == null) {
            arVar = C50706ar.f131960a;
        }
        C62940bt r1 = C62942bv.checkIsLite(C83761d.f228302c);
        arVar.mo58887l(r1);
        Object l = arVar.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        Iterable iterable = (Iterable) Collection.EL.stream(((C83761d) obj).f228304a).map(C92024f.f256554a).collect(C58370cn.f155946a);
        bjVar.copyOnWrite();
        C50746bk bkVar = (C50746bk) bjVar.instance;
        C62971cq cqVar = bkVar.f132062a;
        if (!cqVar.mo58948c()) {
            bkVar.f132062a = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll(iterable, (List) bkVar.f132062a);
        return C58833ax.m90834k((C50746bk) bjVar.build());
    }

    /* renamed from: c */
    static C60870cx m151034c(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return C60856cj.m92900i(C58833ax.m90834k(byteArrayOutputStream.toByteArray()));
    }

    /* renamed from: d */
    public static C60870cx m151035d(String str, C91189au auVar, C60888db dbVar) {
        C58976aa aaVar = C58975e.f156826a;
        return C60922j.m93044g(auVar.mo85425m(Uri.parse(str), C58833ax.m90834k(Bitmap.CompressFormat.WEBP), 7), C92020b.f256548a, dbVar);
    }

    /* renamed from: f */
    public static C60870cx m151037f(C83802r rVar, C60888db dbVar, C91189au auVar, C86124t tVar) {
        C60870cx cxVar;
        if (rVar.mo77091a() != null) {
            Bitmap a = rVar.mo77091a();
            a.getClass();
            cxVar = m151034c(a);
        } else {
            if (rVar.mo77094d().mo56113h()) {
                C50710av avVar = ((C50738bc) rVar.mo77094d().mo56107c()).f132039f;
                if (avVar == null) {
                    avVar = C50710av.f131964d;
                }
                int a2 = C50709au.m85889a(avVar.f131967b);
                if (a2 != 0 && a2 == 2) {
                    C50710av avVar2 = ((C50738bc) rVar.mo77094d().mo56107c()).f132039f;
                    if (avVar2 == null) {
                        avVar2 = C50710av.f131964d;
                    }
                    cxVar = m151035d(avVar2.f131968c, auVar, dbVar);
                }
            }
            C59104x c = f256555a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BCSmartspaceUtil");
            ((C59052c) ((C59052c) c).mo56372aa(11974)).mo56386p("Cannot get icon from chip");
            cxVar = C60856cj.m92900i(C58836b.f156633a);
        }
        return C60922j.m93044g(cxVar, new C92022d(rVar, tVar), dbVar);
    }

    /* renamed from: g */
    static void m151038g(C50790cn cnVar) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.broadcastreceiver.CommonBroadcastReceiver")).setAction("com.google.android.apps.gsa.smartspace.DISMISS_EVENT").setPackage("com.google.android.googlequicksearchbox").addFlags(268435456);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_ID", ((C50818do) cnVar.instance).f132307d);
        C50794cr a = C50794cr.m85938a(((C50818do) cnVar.instance).f132315l);
        if (a == null) {
            a = C50794cr.UNDEFINED;
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_CARD_TYPE", a.f132222T);
        C50796ct ctVar = ((C50818do) cnVar.instance).f132320q;
        if (ctVar == null) {
            ctVar = C50796ct.f132223c;
        }
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_EXTRA_DISMISS_RECORD_EXPIRATION_TIME", ctVar.f132226b);
        intent.putExtra("com.google.android.apps.gsa.smartspace.extra.SMARTSPACE_IS_WORK_PROFILE", ((C50818do) cnVar.instance).f132322s);
        String uri = intent.toUri(1);
        C50794cr a2 = C50794cr.m85938a(((C50818do) cnVar.instance).f132315l);
        if (a2 == null) {
            a2 = C50794cr.UNDEFINED;
        }
        Intent p = C92122r.m151194p(uri, a2, C50731p.START_ACTIVITY, 2);
        C50788cl clVar = (C50788cl) C50789cm.f132161f.createBuilder();
        clVar.copyOnWrite();
        C50789cm cmVar = (C50789cm) clVar.instance;
        cmVar.f132167e = 1;
        cmVar.f132163a |= 8;
        C50732q qVar = (C50732q) C50733r.f132021d.createBuilder();
        C50731p pVar = C50731p.START_ACTIVITY;
        qVar.copyOnWrite();
        C50733r rVar = (C50733r) qVar.instance;
        rVar.f132024b = pVar.f132020d;
        rVar.f132023a |= 1;
        String uri2 = p.toUri(1);
        qVar.copyOnWrite();
        C50733r rVar2 = (C50733r) qVar.instance;
        uri2.getClass();
        rVar2.f132023a |= 2;
        rVar2.f132025c = uri2;
        C50733r rVar3 = (C50733r) qVar.build();
        clVar.copyOnWrite();
        C50789cm cmVar2 = (C50789cm) clVar.instance;
        rVar3.getClass();
        cmVar2.f132165c = rVar3;
        cmVar2.f132163a |= 2;
        cnVar.mo53460b((C50789cm) clVar.build());
    }

    /* renamed from: e */
    public static C60870cx m151036e(C92113i iVar, C60888db dbVar, C91189au auVar, C86124t tVar) {
        C60870cx cxVar;
        Bitmap bitmap = iVar.f256821b;
        if (bitmap != null) {
            cxVar = m151034c(bitmap);
        } else {
            C50818do doVar = iVar.f256820a;
            if ((doVar.f132304a & 512) != 0) {
                C50729n nVar = doVar.f132314k;
                if (nVar == null) {
                    nVar = C50729n.f132007g;
                }
                cxVar = m151035d(nVar.f132011c, auVar, dbVar);
            } else {
                cxVar = C60856cj.m92900i(C58836b.f156633a);
            }
        }
        return C60922j.m93044g(cxVar, new C92021c(iVar, tVar), dbVar);
    }
}
