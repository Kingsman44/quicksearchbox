package com.google.android.libraries.lens.view.p2070an.p2071a;

import android.util.Size;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.p2014e.C24199ab;
import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24229u;
import com.google.android.libraries.lens.p2014e.C24233y;
import com.google.android.libraries.lens.view.p2070an.C25436h;
import com.google.android.libraries.lens.view.utils.C28130s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.amc;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62223d;
import com.google.p4017at.p4056g.p4057a.p4058a.C54038cs;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56280cg;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56301da;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56302db;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.lens.view.an.a.k */
/* compiled from: PG */
public final class C25362k implements C25436h {

    /* renamed from: a */
    private static final C58974d f69070a = C58974d.m91135i("TranslateTextSelectionHandler");

    /* renamed from: b */
    private final C25357f f69071b;

    public C25362k(C25357f fVar) {
        this.f69071b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo30410a(C24201ad adVar, C24229u uVar) {
        String str;
        String str2;
        C58833ax axVar;
        C56301da daVar;
        C56301da daVar2;
        if (uVar.mo29735d().mo56113h()) {
            return C60856cj.m92899h((Throwable) uVar.mo29735d().mo56107c());
        }
        C25357f fVar = this.f69071b;
        C56220aa j = uVar.mo29743j();
        C56280cg c = adVar.mo29679b().mo29686c();
        C24233y yVar = (C24233y) adVar.mo29682e().mo56107c();
        Iterator it = uVar.mo29744k().f150052a.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = BuildConfig.FLAVOR;
                break;
            }
            C56302db dbVar = (C56302db) it.next();
            if (dbVar.f150046b == 4) {
                daVar = (C56301da) dbVar.f150047c;
            } else {
                daVar = C56301da.f150037e;
            }
            if ((daVar.f150039a & 1) != 0) {
                if (dbVar.f150046b == 4) {
                    daVar2 = (C56301da) dbVar.f150047c;
                } else {
                    daVar2 = C56301da.f150037e;
                }
                str = daVar2.f150040b;
            }
        }
        C58485gu f = uVar.mo29738f();
        int size = f.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                str2 = BuildConfig.FLAVOR;
                break;
            }
            C62223d dVar = (C62223d) f.get(i);
            i++;
            if (dVar.f168007a == 10) {
                str2 = ((C62219be) dVar.f168008b).f167990c;
                break;
            }
        }
        Size n = adVar.mo29678a().mo29792n();
        if (uVar.mo29742i().f141703a.mo59173M()) {
            axVar = C58836b.f156633a;
        } else {
            try {
                axVar = C58833ax.m90834k((amc) C62942bv.parseFrom((C62942bv) amc.f159123i, uVar.mo29742i().f141703a, C62921ba.m95368a()));
            } catch (Exception e) {
                ((C58970a) ((C58970a) ((C58970a) f69070a.mo56226d()).mo56382g(e)).mo56372aa(49876)).mo56386p("Failed to parse serialized PresentationLogData");
                axVar = C58836b.f156633a;
            }
        }
        C58833ax a = fVar.mo30406a(j, c, yVar, str, str2, n, axVar, (C54038cs) uVar.mo29734c().mo56109e(C54038cs.f141782f));
        if (!a.mo56113h()) {
            return C60856cj.m92899h(new IllegalStateException("Failed to build interaction response"));
        }
        return C60856cj.m92900i((C24199ab) a.mo56107c());
    }

    /* renamed from: b */
    public final boolean mo30411b(C24201ad adVar) {
        return C28130s.m52412c(adVar.mo29679b().mo29686c(), C56306df.TRANSLATE);
    }
}
