package com.google.android.libraries.search.p2998g;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.deeplink.p7792d.C99497a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2998g.p2999a.C38364e;
import com.google.android.libraries.search.p2998g.p2999a.C38365f;
import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38380u;
import com.google.android.libraries.search.p2998g.p2999a.C38384y;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p5238v.p5239a.C67537ah;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.libraries.search.g.l */
/* compiled from: PG */
public final class C38396l {

    /* renamed from: a */
    public static final C59071e f101643a = C59071e.m91332i("com.google.android.libraries.search.g.l");

    /* renamed from: b */
    public final C86124t f101644b;

    /* renamed from: c */
    public final int f101645c;

    /* renamed from: d */
    public final C21370a f101646d;

    /* renamed from: e */
    private final C67537ah f101647e;

    public C38396l(C86124t tVar, int i, C21370a aVar, C67537ah ahVar) {
        this.f101644b = tVar;
        this.f101645c = i;
        this.f101646d = aVar;
        this.f101647e = ahVar;
    }

    /* renamed from: a */
    public static int m67669a(C38370k kVar) {
        C38380u uVar;
        C38380u uVar2;
        C38365f fVar = kVar.f101598d;
        if (fVar == null) {
            fVar = C38365f.f101578c;
        }
        if (fVar.f101580a == 2) {
            uVar = (C38380u) fVar.f101581b;
        } else {
            uVar = C38380u.f101620d;
        }
        if (C99497a.m165019a(uVar) != null) {
            C38365f fVar2 = kVar.f101598d;
            if (fVar2 == null) {
                fVar2 = C38365f.f101578c;
            }
            if (fVar2.f101580a == 2) {
                uVar2 = (C38380u) fVar2.f101581b;
            } else {
                uVar2 = C38380u.f101620d;
            }
            if ((uVar2.f101622a & 2) != 0) {
                return 9;
            }
        }
        return 5;
    }

    /* renamed from: c */
    public static boolean m67670c(int i) {
        C38364e eVar = C38364e.SESSION_DEEPLINK;
        switch (i - 1) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    public final int mo41410b(C38384y yVar, boolean z) {
        if (z) {
            return 9;
        }
        C67537ah ahVar = this.f101647e;
        if (ahVar != null) {
            try {
                ahVar.mo59912a(yVar.f101630b.mo59174N(), yVar.f101631c.mo59174N());
                return 9;
            } catch (GeneralSecurityException e) {
                C59104x c = f101643a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DeeplinkVerifier");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(53097)).mo56386p("Deeplink is untrusted.");
                return 5;
            }
        } else {
            C59104x c2 = f101643a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeeplinkVerifier");
            ((C59052c) ((C59052c) c2).mo56372aa(53098)).mo56386p("Failed to initialize PublicKeyVerify. This likely indicates a configuration error. Please check your flag settings.");
            return 6;
        }
    }
}
