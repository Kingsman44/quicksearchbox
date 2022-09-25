package com.google.android.apps.gsa.staticplugins.offline.p8167b.p8168a;

import com.google.android.apps.gsa.shared.p7066m.C90042cu;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.velvet.p8863ui.settings.legal.C118659a;
import com.google.android.libraries.social.licenses.C41958f;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.p5610a.p5611a.p5612a.C71978d;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.staticplugins.offline.b.a.o */
/* compiled from: PG */
public final class C105874o implements C118659a {

    /* renamed from: a */
    private static final C59071e f295504a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.offline.b.a.o");

    /* renamed from: b */
    private final C105871l f295505b;

    public C105874o(C105871l lVar) {
        this.f295505b = lVar;
    }

    /* renamed from: b */
    private static boolean m176371b(String str) {
        if (str.isEmpty()) {
            return false;
        }
        try {
            File file = new File(str);
            if (!file.exists()) {
                C59104x d = f295504a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                ((C59052c) ((C59052c) d).mo56372aa(22511)).mo56386p("File doesn't exist.");
                return false;
            } else if (file.canRead()) {
                return true;
            } else {
                C59104x d2 = f295504a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                ((C59052c) ((C59052c) d2).mo56372aa(22509)).mo56386p("File can't be read.");
                return false;
            }
        } catch (SecurityException e) {
            C59104x d3 = f295504a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
            ((C59052c) ((C59052c) ((C59052c) d3).mo56382g(e)).mo56372aa(22510)).mo56386p("File permissions");
            return false;
        }
    }

    /* renamed from: a */
    public final List mo95126a() {
        try {
            C105871l lVar = this.f295505b;
            C60870cx h = C60922j.m93045h(lVar.f295498c.mo46042d(), new C105868i(lVar, lVar.f295497b.mo79752r(C90042cu.f248711l)), C60826bg.f164896a);
            C90476a aVar = C91018d.f254254a;
            C58833ax axVar = (C58833ax) h.get();
            if (!axVar.mo56113h()) {
                C58976aa aaVar = C58975e.f156826a;
                return C58485gu.m89845m();
            }
            String b = ((C105870k) axVar.mo56107c()).mo95112b();
            String a = ((C105870k) axVar.mo56107c()).mo95111a();
            if (!m176371b(b)) {
                C59104x d = f295504a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                ((C59052c) ((C59052c) d).mo56372aa(22506)).mo56386p("Can't read metadata file");
                return C58485gu.m89845m();
            } else if (!m176371b(a)) {
                C59104x d2 = f295504a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                ((C59052c) ((C59052c) d2).mo56372aa(22505)).mo56386p("Can't read license file");
                return C58485gu.m89845m();
            } else {
                try {
                    String b2 = C71978d.m105261b(new File(b), StandardCharsets.UTF_8);
                    if (!b2.isEmpty()) {
                        return C58485gu.m89842j(C41958f.m73471b(b2, a));
                    }
                    C59104x d3 = f295504a.mo56226d();
                    d3.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                    ((C59052c) ((C59052c) d3).mo56372aa(22504)).mo56386p("Empty metadata");
                    return C58485gu.m89845m();
                } catch (IOException e) {
                    C59104x d4 = f295504a.mo56226d();
                    d4.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
                    ((C59052c) ((C59052c) ((C59052c) d4).mo56382g(e)).mo56372aa(22503)).mo56386p("File read exception");
                    return C58485gu.m89845m();
                }
            }
        } catch (InterruptedException | ExecutionException e2) {
            C59104x d5 = f295504a.mo56226d();
            d5.mo56378ag(C58975e.f156826a, "TransibLicAccessor");
            ((C59052c) ((C59052c) ((C59052c) d5).mo56382g(e2)).mo56372aa(22507)).mo56386p("LicenseResource");
            return C58485gu.m89845m();
        }
    }
}
