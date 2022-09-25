package com.google.android.apps.gsa.staticplugins.deeplink.p7793e;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6530ae.C84664b;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.shared.logger.C89839b;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.assistant.p3897e.p3921j.C51803ds;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52279lw;
import com.google.assistant.p3897e.p3921j.C52280lx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.e.f */
/* compiled from: PG */
public final class C99505f extends C86734a implements C84664b {

    /* renamed from: a */
    private static final C59071e f278441a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.e.f");

    /* renamed from: b */
    private final C85005h f278442b;

    /* renamed from: c */
    private final C86124t f278443c;

    public C99505f(C85005h hVar, C86124t tVar) {
        super(C118575h.WORKER_DEEPLINK, "familydeeplink");
        this.f278442b = hVar;
        this.f278443c = tVar;
    }

    /* renamed from: c */
    private final void m165036c(Uri uri) {
        try {
            String queryParameter = uri.getQueryParameter("obgid");
            if (queryParameter == null) {
                C59104x d = f278441a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
                ((C59052c) ((C59052c) d).mo56372aa(19261)).mo56389s("Obfuscated group id param is missing for TMF_BROADCAST_CARD deeplink[%s]", uri);
                return;
            }
            C87565h hVar = new C87565h();
            hVar.f236523a = "and.opa.conversation.deeplink";
            hVar.f236497A = false;
            hVar.f236560f = 3;
            C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
            jzVar.copyOnWrite();
            C52230ka kaVar = (C52230ka) jzVar.instance;
            kaVar.f137059a |= 1;
            kaVar.f137060b = "assistant.api.client_input.BroadcastCardInput";
            C52279lw lwVar = (C52279lw) C52280lx.f137230e.createBuilder();
            lwVar.copyOnWrite();
            C52280lx lxVar = (C52280lx) lwVar.instance;
            lxVar.f137235d = 2;
            lxVar.f137232a |= 128;
            lwVar.copyOnWrite();
            C52280lx lxVar2 = (C52280lx) lwVar.instance;
            lxVar2.f137233b = 12;
            lxVar2.f137234c = queryParameter;
            C63088z byteString = ((C52280lx) lwVar.build()).toByteString();
            jzVar.copyOnWrite();
            C52230ka kaVar2 = (C52230ka) jzVar.instance;
            byteString.getClass();
            kaVar2.f137059a |= 2;
            kaVar2.f137061c = byteString;
            C51803ds dsVar = (C51803ds) C51805du.f135924e.createBuilder();
            dsVar.copyOnWrite();
            C51805du duVar = (C51805du) dsVar.instance;
            duVar.f135926a |= 1;
            duVar.f135927b = "communication.BROADCAST_CARD";
            dsVar.mo53729a("broadcast_card_input", (C52230ka) jzVar.build());
            hVar.f236517U = ((C51805du) dsVar.build()).toByteArray();
            this.f278442b.mo78612H(hVar.mo81685a(), false);
        } catch (IllegalArgumentException | NullPointerException | UnsupportedOperationException e) {
            C59104x c = f278441a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19262)).mo56389s("Failed to parse family deeplink id. deeplink[%s]", uri);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039 A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m165037e(android.net.Uri r5) {
        /*
            r0 = 1
            java.lang.String r1 = "id"
            java.lang.String r1 = r5.getQueryParameter(r1)     // Catch:{ IllegalArgumentException -> 0x003e, NullPointerException -> 0x003c, UnsupportedOperationException -> 0x003a }
            if (r1 == 0) goto L_0x0053
            int r2 = r1.hashCode()     // Catch:{ IllegalArgumentException -> 0x003e, NullPointerException -> 0x003c, UnsupportedOperationException -> 0x003a }
            r3 = 433141802(0x19d1382a, float:2.1632778E-23)
            if (r2 == r3) goto L_0x0022
            r3 = 1698464128(0x653c8180, float:5.563711E22)
            if (r2 == r3) goto L_0x0018
            goto L_0x002c
        L_0x0018:
            java.lang.String r2 = "TMF_BROADCAST_CARD"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = 1
            goto L_0x002d
        L_0x0022:
            java.lang.String r2 = "UNKNOWN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = 0
            goto L_0x002d
        L_0x002c:
            r1 = -1
        L_0x002d:
            if (r1 == 0) goto L_0x0039
            if (r1 != r0) goto L_0x0033
            r5 = 2
            return r5
        L_0x0033:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x003e, NullPointerException -> 0x003c, UnsupportedOperationException -> 0x003a }
            r1.<init>()     // Catch:{ IllegalArgumentException -> 0x003e, NullPointerException -> 0x003c, UnsupportedOperationException -> 0x003a }
            throw r1     // Catch:{ IllegalArgumentException -> 0x003e, NullPointerException -> 0x003c, UnsupportedOperationException -> 0x003a }
        L_0x0039:
            return r0
        L_0x003a:
            r1 = move-exception
            goto L_0x003f
        L_0x003c:
            r1 = move-exception
            goto L_0x003f
        L_0x003e:
            r1 = move-exception
        L_0x003f:
            com.google.common.f.e r2 = f278441a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "FamilyDeeplinkWorker"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "Failed to parse family deeplink id. deeplink[%s]"
            r4 = 19255(0x4b37, float:2.6982E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56389s(r3, r5)
        L_0x0053:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.deeplink.p7793e.C99505f.m165037e(android.net.Uri):int");
    }

    /* renamed from: a */
    public final void mo78401a(Uri uri) {
        if (!this.f278443c.mo79746e(C89968ag.f246506f)) {
            C59104x d = f278441a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
            ((C59052c) ((C59052c) d).mo56372aa(19260)).mo56386p("Family deeplink is disabled.");
            return;
        }
        C58976aa aaVar = C58975e.f156826a;
        String host = uri.getHost();
        if (host == null || !host.equals("assistant.google.com")) {
            C59104x d2 = f278441a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
            ((C59052c) ((C59052c) d2).mo56372aa(19257)).mo56389s("Deeplink is missing family host: %s. Ignoring.", uri);
            C89839b.m146269a(false, 13228, 2);
            return;
        }
        String path = uri.getPath();
        if (path == null || !path.equals("/family")) {
            C59104x d3 = f278441a.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
            ((C59052c) ((C59052c) d3).mo56372aa(19258)).mo56389s("Deeplink is missing family path prefix: %s. Ignoring.", uri);
            C89839b.m146269a(false, 13228, 2);
        } else if (m165037e(uri) - 1 != 0) {
            m165036c(uri);
            C89839b.m146269a(true, 13492, 0);
        } else {
            C59104x c = f278441a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FamilyDeeplinkWorker");
            ((C59052c) ((C59052c) c).mo56372aa(19259)).mo56386p("Unknown feature id in family deeplink.");
            C89839b.m146269a(false, 13228, 2);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
