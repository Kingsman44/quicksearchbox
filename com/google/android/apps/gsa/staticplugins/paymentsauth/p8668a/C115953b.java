package com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a;

import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89167f;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89168g;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89171j;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c.C115963f;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.a.b */
/* compiled from: PG */
public final class C115953b extends BiometricPrompt.AuthenticationCallback {

    /* renamed from: a */
    final /* synthetic */ C115955d f321516a;

    public C115953b(C115955d dVar) {
        this.f321516a = dVar;
    }

    public final void onAuthenticationError(int i, CharSequence charSequence) {
        C28292j jVar = C115955d.f321517a;
        super.onAuthenticationError(i, charSequence);
        if (i != 1) {
            if (i != 5) {
                if (i != 7) {
                    switch (i) {
                        case 10:
                            break;
                        case 11:
                        case 12:
                            break;
                        default:
                            this.f321516a.f321522f.mo102359b();
                            return;
                    }
                }
            }
            ((C115963f) this.f321516a.f321522f).mo102362f();
            return;
        }
        this.f321516a.f321522f.mo102359b();
    }

    public final void onAuthenticationFailed() {
        C28292j jVar = C115955d.f321517a;
        super.onAuthenticationFailed();
        C59104x d = C115963f.f321533a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AuthController");
        ((C59052c) ((C59052c) d).mo56372aa(30206)).mo56386p("onBiometricAuthenticationFailed");
    }

    public final void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        C28292j jVar = C115955d.f321517a;
        super.onAuthenticationSucceeded(authenticationResult);
        C115954c cVar = this.f321516a.f321522f;
        C89168g gVar = (C89168g) C89171j.f241759f.createBuilder();
        gVar.copyOnWrite();
        C89171j jVar2 = (C89171j) gVar.instance;
        jVar2.f241762b = 1;
        jVar2.f241761a = 1 | jVar2.f241761a;
        C89167f fVar = C89167f.FINGERPRINT;
        gVar.copyOnWrite();
        C89171j jVar3 = (C89171j) gVar.instance;
        jVar3.f241763c = fVar.f241757d;
        jVar3.f241761a |= 2;
        C115963f fVar2 = (C115963f) cVar;
        if (!((String) ((C23251a) fVar2.f321534b.mo102365c()).f63720e).isEmpty()) {
            String str = (String) ((C23251a) fVar2.f321534b.mo102365c()).f63720e;
            gVar.copyOnWrite();
            C89171j jVar4 = (C89171j) gVar.instance;
            str.getClass();
            jVar4.f241761a |= 8;
            jVar4.f241765e = str;
        }
        Intent intent = new Intent();
        if (fVar2.f321538f.mo56113h()) {
            intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_STRING_AUTHENTICATION_REQUEST_CLIENT_INPUT_NAME", (String) fVar2.f321538f.mo56107c());
        }
        intent.putExtra("com.google.android.apps.gsa.staticplugins.paymentsauth.EXTRA_PROTO_PARCELABLE_AUTHENTICATION_RESULTS", C23245b.m43556a((C89171j) gVar.build()));
        fVar2.f321541i.mo80936b(-1, intent);
        C60321oe j = C28285c.m52883j(C115955d.f321518b, 5, (Integer) null);
        if (j != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1411;
            C89949q.m146525j((C60555uf) tzVar.build(), j, (C63196b) null, (String) null);
        }
    }
}
