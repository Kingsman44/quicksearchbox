package com.google.android.apps.gsa.search.core.p6884y.p6885a;

import android.os.Bundle;
import android.os.Parcelable;
import android.os.Trace;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87987kz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87993le;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87999lk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88001lm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88005lq;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88007ls;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88012lx;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.libraries.gsa.monet.internal.service.C23005ab;
import com.google.android.libraries.gsa.monet.internal.service.C23015k;
import com.google.android.libraries.gsa.monet.internal.service.C23018n;
import com.google.android.libraries.gsa.monet.internal.service.C23020p;
import com.google.android.libraries.gsa.monet.internal.service.C23024t;
import com.google.android.libraries.gsa.monet.internal.service.C23025u;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.internal.service.C23029y;
import com.google.android.libraries.gsa.monet.internal.service.C23030z;
import com.google.android.libraries.gsa.monet.internal.shared.FeatureStateSnapshot;
import com.google.android.libraries.gsa.monet.internal.shared.HierarchyState;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23091e;
import com.google.android.libraries.gsa.monet.shared.p1893c.C23095a;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23107j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.search.core.y.a.a */
/* compiled from: PG */
public final class C87284a {

    /* renamed from: a */
    private final C23005ab f235747a;

    public C87284a(C23005ab abVar) {
        this.f235747a = abVar;
    }

    /* renamed from: a */
    public final void mo80927a(ClientEventData clientEventData) {
        Object obj;
        C88005lq lqVar;
        C23025u uVar;
        C87993le leVar;
        C87993le leVar2;
        C87993le leVar3;
        boolean c;
        C88001lm lmVar;
        boolean c2;
        C62940bt btVar = C87987kz.f237952a;
        C87741bw bwVar = clientEventData.f236955a;
        C62940bt r3 = C62942bv.checkIsLite(btVar);
        bwVar.mo58887l(r3);
        Object l = bwVar.f169962ag.mo58854l(r3.f169971d);
        if (l == null) {
            obj = r3.f169969b;
        } else {
            obj = r3.mo58889c(l);
        }
        C88012lx lxVar = (C88012lx) obj;
        int i = lxVar.f238013b;
        if (i == 6) {
            C87999lk lkVar = (C87999lk) lxVar.f238014c;
            if ((lkVar.f237975a & 16) != 0) {
                C23107j jVar = lkVar.f237980f;
                if (jVar == null) {
                    jVar = C23107j.f63462d;
                }
                this.f235747a.mo28411b(new C23129y(jVar.f63465b), new ProtoParcelable(jVar.f63466c.mo59174N()));
            }
        } else if (i == 1) {
            C23005ab abVar = this.f235747a;
            Bundle bundle = (Bundle) clientEventData.mo81912b(Bundle.class);
            if (lxVar.f238013b == 1) {
                lmVar = (C88001lm) lxVar.f238014c;
            } else {
                lmVar = C88001lm.f237981c;
            }
            String str = lmVar.f237984b;
            try {
                if (abVar.f63277c.mo28573c()) {
                    C23005ab.m43093a("ServiceUpdateReceiver.modelUpdate-" + str);
                }
                C23015k a = abVar.f63275a.mo28443a(str);
                if (a == null) {
                    C23095a.m43281d("ServiceUpdateReceiver", "Ignoring update for non-existing controller.", new Object[0]);
                    if (!c2) {
                        return;
                    }
                    return;
                }
                a.f63312g.mo28476l(bundle);
                a.f63308c.mo28462a(bundle);
                if (abVar.f63277c.mo28573c()) {
                    Trace.endSection();
                }
            } finally {
                if (abVar.f63277c.mo28573c()) {
                    Trace.endSection();
                }
            }
        } else if (i == 2) {
            Parcelable b = clientEventData.mo81912b(Parcelable.class);
            if (b instanceof Bundle) {
                ((Bundle) b).setClassLoader(getClass().getClassLoader());
            }
            C23005ab abVar2 = this.f235747a;
            if (lxVar.f238013b == 2) {
                leVar = (C87993le) lxVar.f238014c;
            } else {
                leVar = C87993le.f237961e;
            }
            String str2 = leVar.f237964b;
            int i2 = lxVar.f238013b;
            if (i2 == 2) {
                leVar2 = (C87993le) lxVar.f238014c;
            } else {
                leVar2 = C87993le.f237961e;
            }
            String str3 = leVar2.f237965c;
            if (i2 == 2) {
                leVar3 = (C87993le) lxVar.f238014c;
            } else {
                leVar3 = C87993le.f237961e;
            }
            String str4 = leVar3.f237966d;
            try {
                if (abVar2.f63277c.mo28573c()) {
                    C23005ab.m43093a("ServiceUpdateReceiver.sendFeatureUiEvent-" + str2 + ":" + str3);
                }
                C23015k a2 = abVar2.f63275a.mo28443a(str2);
                if (a2 == null) {
                    C23095a.m43281d("ServiceUpdateReceiver", "Ignoring update for non-existing controller.", new Object[0]);
                    if (!c) {
                        return;
                    }
                    return;
                }
                for (C23113i a3 : a2.f63314i) {
                    a3.mo28561a(str3, str4, b);
                }
                a2.mo28422b().mo28493N(str3, str4, b);
                if (abVar2.f63277c.mo28573c()) {
                    Trace.endSection();
                }
            } finally {
                if (abVar2.f63277c.mo28573c()) {
                    Trace.endSection();
                }
            }
        } else if (i == 3) {
            C23107j jVar2 = ((C88007ls) lxVar.f238014c).f237998b;
            if (jVar2 == null) {
                jVar2 = C23107j.f63462d;
            }
            this.f235747a.mo28411b(new C23129y(jVar2.f63465b), new ProtoParcelable(jVar2.f63466c.mo59174N()));
        } else if (i == 4) {
            Bundle bundle2 = (Bundle) clientEventData.mo81912b(Bundle.class);
            bundle2.setClassLoader(getClass().getClassLoader());
            HierarchyState hierarchyState = (HierarchyState) bundle2.getParcelable(HierarchyState.class.getCanonicalName());
            if (lxVar.f238013b == 4) {
                lqVar = (C88005lq) lxVar.f238014c;
            } else {
                lqVar = C88005lq.f237991c;
            }
            C23107j jVar3 = lqVar.f237994b;
            if (jVar3 == null) {
                jVar3 = C23107j.f63462d;
            }
            C23005ab abVar3 = this.f235747a;
            C23129y yVar = new C23129y(jVar3.f63465b);
            ProtoParcelable protoParcelable = new ProtoParcelable(jVar3.f63466c.mo59174N());
            try {
                if (abVar3.f63277c.mo28573c()) {
                    C23005ab.m43093a("ServiceUpdateReceiver.restoreHierarchy");
                }
                uVar = abVar3.f63276b;
                C23091e b2 = C23025u.m43149b(hierarchyState.f63364a);
                FeatureStateSnapshot featureStateSnapshot = (FeatureStateSnapshot) b2.get("DC");
                if (featureStateSnapshot != null) {
                    C23029y a4 = C23025u.m43148a(featureStateSnapshot, b2);
                    C23020p pVar = uVar.f63346a;
                    ((C23030z) pVar.f63337c.mo27525b()).mo28451a();
                    C23018n nVar = pVar.f63335a;
                    C23028x xVar = new C23028x(pVar.f63336b, a4);
                    if (xVar.f63351a.f63353a.containsKey("root")) {
                        C23029y a5 = xVar.f63351a.mo28450a("root");
                        a5.getClass();
                        nVar.mo28437f(a5.f63354b, (ProtoParcelable) null, xVar);
                        if (abVar3.f63277c.mo28573c()) {
                            Trace.endSection();
                            return;
                        }
                        return;
                    }
                    throw new C23024t("No root feature.");
                }
                throw new C23024t("Hierarchy state does not contain an entry for the display coordinator");
            } catch (C23024t e) {
                uVar.f63347b.f252333a.mo83756b(new C90452a(e, 29, C89885b.MONET_RESTORE_FAILED_VALUE)).mo83721a();
                C23095a.m43280c("HierarchyRestorer", e, "Couldn't restore hierarchy. Re-initializing.", new Object[0]);
                uVar.f63346a.mo28442a(yVar, protoParcelable);
            } catch (Throwable th) {
                if (abVar3.f63277c.mo28573c()) {
                    Trace.endSection();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Received unknown update.");
        }
    }
}
