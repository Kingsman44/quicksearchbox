package com.google.android.libraries.logging;

import android.util.Log;
import android.view.View;
import com.google.common.p4552o.C60320od;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.aql;
import com.google.common.p4552o.aqm;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62947c;
import com.google.protos.p4816ai.p4818b.C63204j;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.libraries.logging.c */
/* compiled from: PG */
public final class C28285c {
    /* renamed from: a */
    public static C60321oe m52874a(View view, int i) {
        C28293k b = (view == null || C28295m.m52915a(view) == null) ? null : C28295m.m52916b(view);
        if (b == null) {
            return null;
        }
        return m52875b(b, i);
    }

    /* renamed from: b */
    public static C60321oe m52875b(C28293k kVar, int i) {
        if (kVar == null) {
            throw new NullPointerException("Use VeTreeNode.EMPTY instead of null");
        } else if (kVar.mo33745a() == null) {
            return null;
        } else {
            C60320od odVar = (C60320od) m52886m().toBuilder();
            aql aql = (aql) aqm.f159760n.createBuilder();
            aql.copyOnWrite();
            aqm aqm = (aqm) aql.instance;
            aqm.f159762a |= 4;
            aqm.f159765d = i;
            aqm aqm2 = (aqm) aql.build();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            aqm2.getClass();
            oeVar.f163230e = aqm2;
            oeVar.f163226a |= 16;
            ArrayList arrayList = new ArrayList();
            C60218r rVar = ((C60321oe) odVar.instance).f163227b;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            m52888o(arrayList, kVar, -1, rVar);
            if (!arrayList.isEmpty()) {
                odVar.copyOnWrite();
                ((C60321oe) odVar.instance).f163228c = C60321oe.emptyProtobufList();
                odVar.copyOnWrite();
                C60321oe oeVar2 = (C60321oe) odVar.instance;
                oeVar2.mo57085a();
                C62947c.addAll((Iterable) arrayList, (List) oeVar2.f163228c);
            }
            return (C60321oe) odVar.build();
        }
    }

    /* renamed from: c */
    public static C60321oe m52876c(C28293k kVar, View view) {
        return m52887n(kVar, m52882i(view, 1, (Integer) null));
    }

    /* renamed from: d */
    public static C60321oe m52877d(C28293k kVar, C28292j jVar) {
        return m52887n(kVar, m52883j(jVar, 1, (Integer) null));
    }

    /* renamed from: e */
    public static C60321oe m52878e(View view, C60220t tVar, String str) {
        C60321oe a = m52874a(view, 472);
        if (a == null) {
            return null;
        }
        C60320od odVar = (C60320od) a.toBuilder();
        C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
        qVar.copyOnWrite();
        C60218r rVar = (C60218r) qVar.instance;
        tVar.getClass();
        rVar.f162928b = tVar;
        rVar.f162927a |= 1;
        C60218r rVar2 = (C60218r) qVar.build();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        rVar2.getClass();
        oeVar.f163229d = rVar2;
        oeVar.f163226a |= 2;
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        str.getClass();
        aqm.f159762a |= 2;
        aqm.f159764c = str;
        aqm aqm2 = (aqm) aql.build();
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        aqm2.getClass();
        oeVar2.f163230e = aqm2;
        oeVar2.f163226a |= 16;
        odVar.copyOnWrite();
        C60321oe oeVar3 = (C60321oe) odVar.instance;
        oeVar3.f163231f = 3;
        oeVar3.f163226a |= 32;
        return (C60321oe) odVar.build();
    }

    /* renamed from: f */
    public static C60321oe m52879f(C28292j jVar, boolean z) {
        int i = 2;
        jVar.mo33794h(z ? 1 : 2);
        C60321oe j = m52883j(jVar, 1, (Integer) null);
        if (j == null) {
            return null;
        }
        C60320od odVar = (C60320od) j.toBuilder();
        if (true != z) {
            i = 3;
        }
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        oeVar.f163231f = i - 1;
        oeVar.f163226a |= 32;
        return (C60321oe) odVar.build();
    }

    /* renamed from: g */
    public static C60214n m52880g(C28292j jVar) {
        C60214n b = jVar.mo33788b();
        if (jVar.mo33791e()) {
            return b;
        }
        int i = ((C60214n) jVar.f76973a.instance).f162918c;
        Log.e("ClientVe", "Failed to create ClickTrackingCGI for user interaction on " + i + " because there is no runtime impression information on the VE.");
        return null;
    }

    /* renamed from: h */
    public static C60321oe m52881h(int i, C28293k kVar, View view) {
        C28292j a = kVar.mo33745a();
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (view == null) {
                    return null;
                }
                return m52876c(kVar, view);
            } else if (a != null) {
                return m52879f(a, false);
            } else {
                Log.e("ClientVe", "Failed to create ClientVisualElementsProto for HIDE grafting because the VeTreeNode has no Ve associated with it.");
                return null;
            }
        } else if (a != null) {
            return m52879f(a, true);
        } else {
            Log.e("ClientVe", "Failed to create ClientVisualElementsProto for SHOW grafting because the VeTreeNode has no Ve associated with it.");
            return null;
        }
    }

    /* renamed from: i */
    public static C60321oe m52882i(View view, int i, Integer num) {
        if (view == null) {
            Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction because the view is null.");
            return null;
        }
        C28292j a = C28295m.m52915a(view);
        if (a != null) {
            return m52883j(a, i, num);
        }
        String obj = view.toString();
        Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction on view " + obj + " because the view is not tagged for visual element logging.");
        return null;
    }

    /* renamed from: j */
    public static C60321oe m52883j(C28292j jVar, int i, Integer num) {
        int i2 = i - 1;
        if (jVar.mo33790d(i2) || i == 1) {
            C60214n b = jVar.mo33788b();
            if (!jVar.mo33791e()) {
                Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction on " + ((C60214n) jVar.f76973a.instance).f162918c + " because there is no runtime impression information on the VE.");
                return null;
            }
            C60320od odVar = (C60320od) m52884k(jVar, i, num).toBuilder();
            C60218r rVar = b.f162921f;
            if (rVar == null) {
                rVar = C60218r.f162925d;
            }
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            rVar.getClass();
            oeVar.f163229d = rVar;
            oeVar.f163226a |= 2;
            aqm aqm = oeVar.f163230e;
            if (aqm == null) {
                aqm = aqm.f159760n;
            }
            aql aql = (aql) aqm.toBuilder();
            int i3 = b.f162917b;
            aql.copyOnWrite();
            aqm aqm2 = (aqm) aql.instance;
            aqm2.f159762a |= 8;
            aqm2.f159766e = i3;
            aqm aqm3 = (aqm) aql.build();
            odVar.copyOnWrite();
            C60321oe oeVar2 = (C60321oe) odVar.instance;
            aqm3.getClass();
            oeVar2.f163230e = aqm3;
            oeVar2.f163226a |= 16;
            return (C60321oe) odVar.build();
        }
        Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction " + i2 + " on " + ((C60214n) jVar.f76973a.instance).f162918c + " because that user interaction is not enabled for the VE.");
        return null;
    }

    /* renamed from: k */
    public static C60321oe m52884k(C28292j jVar, int i, Integer num) {
        int i2 = i - 1;
        if (jVar.mo33790d(i2) || i == 1) {
            C60320od odVar = (C60320od) m52886m().toBuilder();
            aql aql = (aql) aqm.f159760n.createBuilder();
            int i3 = ((C60214n) jVar.f76973a.instance).f162918c;
            aql.copyOnWrite();
            aqm aqm = (aqm) aql.instance;
            aqm.f159762a |= 4;
            aqm.f159765d = i3;
            aql.copyOnWrite();
            aqm aqm2 = (aqm) aql.instance;
            aqm2.f159762a |= 16;
            aqm2.f159767f = i2;
            if (num != null) {
                int intValue = num.intValue();
                aql.copyOnWrite();
                aqm aqm3 = (aqm) aql.instance;
                aqm3.f159762a |= 128;
                aqm3.f159770i = intValue;
            }
            aqm aqm4 = (aqm) aql.build();
            odVar.copyOnWrite();
            C60321oe oeVar = (C60321oe) odVar.instance;
            aqm4.getClass();
            oeVar.f163230e = aqm4;
            oeVar.f163226a |= 16;
            return (C60321oe) odVar.build();
        }
        Log.e("ClientVe", "Failed to create ClientVisualElementsProto for user interaction " + i2 + " on " + ((C60214n) jVar.f76973a.instance).f162918c + " because that user interaction is not enabled for the VE.");
        return null;
    }

    /* renamed from: l */
    public static C60321oe m52885l(String str, int i) {
        if (str == null) {
            StringBuilder sb = new StringBuilder("Failed to create ClientVisualElementsProto for user interaction ");
            sb.append(i - 1);
            sb.append(" because there is no ved for the VE");
            Log.e("ClientVe", sb.toString());
            return null;
        }
        C60320od odVar = (C60320od) m52886m().toBuilder();
        aql aql = (aql) aqm.f159760n.createBuilder();
        aql.copyOnWrite();
        aqm aqm = (aqm) aql.instance;
        aqm.f159762a |= 2;
        aqm.f159764c = str;
        aql.copyOnWrite();
        aqm aqm2 = (aqm) aql.instance;
        aqm2.f159762a |= 16;
        aqm2.f159767f = i - 1;
        aqm aqm3 = (aqm) aql.build();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        aqm3.getClass();
        oeVar.f163230e = aqm3;
        oeVar.f163226a |= 16;
        return (C60321oe) odVar.build();
    }

    /* renamed from: m */
    private static C60321oe m52886m() {
        C60320od odVar = (C60320od) C60321oe.f163224i.createBuilder();
        C60218r a = C28260b.m52825a();
        odVar.copyOnWrite();
        C60321oe oeVar = (C60321oe) odVar.instance;
        a.getClass();
        oeVar.f163227b = a;
        oeVar.f163226a |= 1;
        return (C60321oe) odVar.build();
    }

    /* renamed from: n */
    private static C60321oe m52887n(C28293k kVar, C60321oe oeVar) {
        C60321oe b;
        if (oeVar == null || (b = m52875b(kVar, 472)) == null || b.f163228c.size() == 0) {
            return null;
        }
        C60320od odVar = (C60320od) b.toBuilder();
        C60218r rVar = oeVar.f163229d;
        if (rVar == null) {
            rVar = C60218r.f162925d;
        }
        odVar.copyOnWrite();
        C60321oe oeVar2 = (C60321oe) odVar.instance;
        rVar.getClass();
        oeVar2.f163229d = rVar;
        oeVar2.f163226a |= 2;
        aqm aqm = oeVar.f163230e;
        if (aqm == null) {
            aqm = aqm.f159760n;
        }
        odVar.copyOnWrite();
        C60321oe oeVar3 = (C60321oe) odVar.instance;
        aqm.getClass();
        oeVar3.f163230e = aqm;
        oeVar3.f163226a |= 16;
        odVar.copyOnWrite();
        C60321oe oeVar4 = (C60321oe) odVar.instance;
        oeVar4.f163231f = 3;
        oeVar4.f163226a |= 32;
        return (C60321oe) odVar.build();
    }

    /* renamed from: o */
    private static void m52888o(ArrayList arrayList, C28293k kVar, int i, C60218r rVar) {
        C28292j a = kVar.mo33745a();
        if (a != null) {
            aqp aqp = (aqp) aqs.f159780k.createBuilder();
            int i2 = ((C60214n) a.f76973a.instance).f162918c;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs.f159782a |= 1;
            aqs.f159783b = i2;
            int i3 = a.f76977e;
            if (i3 != 1) {
                aqp.copyOnWrite();
                aqs aqs2 = (aqs) aqp.instance;
                int i4 = i3 - 1;
                if (i3 != 0) {
                    aqs2.f159789h = i4;
                    aqs2.f159782a |= 32;
                } else {
                    throw null;
                }
            }
            if (a.mo33789c() != null) {
                C63204j c = a.mo33789c();
                aqp.copyOnWrite();
                aqs aqs3 = (aqs) aqp.instance;
                c.getClass();
                aqs3.f159788g = c;
                aqs3.f159782a |= 16;
            }
            aqp.mergeFrom((aqs) a.f76974b.build());
            arrayList.add((aqs) aqp.build());
            int size = arrayList.size() - 1;
            if (i >= 0) {
                aqp aqp2 = (aqp) ((aqs) arrayList.get(i)).toBuilder();
                aqp2.mo57037a(size);
                arrayList.set(i, (aqs) aqp2.build());
            }
            i = arrayList.size() - 1;
            C60213m mVar = (C60213m) a.mo33788b().toBuilder();
            mVar.copyOnWrite();
            C60214n nVar = (C60214n) mVar.instance;
            rVar.getClass();
            nVar.f162921f = rVar;
            nVar.f162916a |= 2048;
            mVar.copyOnWrite();
            C60214n nVar2 = (C60214n) mVar.instance;
            nVar2.f162916a |= 1;
            nVar2.f162917b = i;
            a.mo33793g((C60214n) mVar.build());
        }
        for (C28293k o : kVar.mo33746b()) {
            m52888o(arrayList, o, i, rVar);
        }
    }
}
