package com.google.android.apps.gsa.staticplugins.deeplink.p7788a;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C89968ag;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p5238v.p5239a.C67537ah;
import com.google.p5238v.p5239a.C67542b;
import com.google.p5238v.p5239a.C67904t;
import com.google.p5238v.p5239a.p5255j.C67729de;
import com.google.p5238v.p5239a.p5256k.C67813y;
import com.google.protobuf.C62974ct;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.apps.gsa.staticplugins.deeplink.a.b */
/* compiled from: PG */
public final class C99468b {

    /* renamed from: a */
    private static final C59071e f278339a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.deeplink.a.b");

    /* renamed from: a */
    public static C67537ah m164994a(C86124t tVar) {
        String x = tVar.mo79758x(C89968ag.f246515o);
        try {
            C67813y.m97933a();
            C67729de a = new C67542b(new ByteArrayInputStream(Base64.decode(x, 8))).mo59915a();
            C67904t.m98170e(a);
            return (C67537ah) C67904t.m98167a(a).mo60041c(C67537ah.class);
        } catch (C62974ct unused) {
            throw new GeneralSecurityException("invalid keyset");
        } catch (IllegalArgumentException e) {
            C59104x c = f278339a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeeplinkModule");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(19227)).mo56389s("Invalid base64 public key: %s.", x);
            return null;
        } catch (IOException | GeneralSecurityException e2) {
            C59104x c2 = f278339a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "DeeplinkModule");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(19228)).mo56386p("GeneralSecurityException while decoding public key.");
            return null;
        }
    }
}
