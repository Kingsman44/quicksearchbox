package com.google.android.apps.gsa.staticplugins.paymentsauth.p8670c;

import android.hardware.biometrics.BiometricPrompt;
import android.os.CancellationSignal;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6984ai.p6985a.C89164c;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115952a;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115953b;
import com.google.android.apps.gsa.staticplugins.paymentsauth.p8668a.C115955d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28293k;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.paymentsauth.c.e */
/* compiled from: PG */
final class C115962e implements C22868d {

    /* renamed from: a */
    final /* synthetic */ C115963f f321532a;

    public C115962e(C115963f fVar) {
        this.f321532a = fVar;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        if (!this.f321532a.f321540h) {
            C59104x c = C115963f.f321533a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "AuthController");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30199)).mo56386p("Error generating CryptoObject availability");
            this.f321532a.mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
        }
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17702gm(Object obj) {
        BiometricPrompt.CryptoObject cryptoObject = (BiometricPrompt.CryptoObject) obj;
        C115963f fVar = this.f321532a;
        if (!fVar.f321540h) {
            if (cryptoObject == null) {
                C59104x c = C115963f.f321533a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AuthController");
                ((C59052c) ((C59052c) c).mo56372aa(30201)).mo56386p("CryptoObject could not be created");
                this.f321532a.mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
            } else if (!((C58833ax) ((C23251a) fVar.f321534b.mo102374l()).f63720e).mo56113h() || ((String) ((C58833ax) ((C23251a) this.f321532a.f321534b.mo102374l()).f63720e).mo56107c()).isEmpty()) {
                C59104x c2 = C115963f.f321533a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "AuthController");
                ((C59052c) ((C59052c) c2).mo56372aa(30200)).mo56386p("Title is required for biometric prompt, should not be missing.");
                this.f321532a.mo102363h(true, C58833ax.m90834k(C89164c.UNKNOWN_REASON));
            } else {
                String str = (String) ((C58833ax) ((C23251a) this.f321532a.f321534b.mo102374l()).f63720e).mo56107c();
                String str2 = (String) ((C58833ax) ((C23251a) this.f321532a.f321534b.mo102368f()).f63720e).mo56109e(BuildConfig.FLAVOR);
                String str3 = (String) ((C58833ax) ((C23251a) this.f321532a.f321534b.mo102373k()).f63720e).mo56109e(BuildConfig.FLAVOR);
                String string = this.f321532a.f321537e.getString(R.string.payments_auth_biometric_switch_to_password);
                C115961d dVar = new C115961d(this);
                C115963f fVar2 = this.f321532a;
                C115955d dVar2 = new C115955d(fVar2.f321537e, cryptoObject, dVar, fVar2);
                C60321oe b = C28285c.m52875b(C28293k.m52908e(C115955d.f321517a, C28293k.m52908e(C115955d.f321518b, new C28293k[0])), 1411);
                if (b != null) {
                    C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                    tzVar.copyOnWrite();
                    C60555uf ufVar = (C60555uf) tzVar.instance;
                    ufVar.f164093a |= 2;
                    ufVar.f164258m = 1411;
                    C89949q.m146525j((C60555uf) tzVar.build(), b, (C63196b) null, (String) null);
                }
                dVar2.f321523g = new CancellationSignal();
                BiometricPrompt.Builder builder = new BiometricPrompt.Builder(dVar2.f321519c);
                if (str.length() > 0) {
                    builder.setTitle(str);
                }
                if (str2.length() > 0) {
                    builder.setSubtitle(str2);
                }
                if (str3.length() > 0) {
                    builder.setDescription(str3);
                }
                builder.setNegativeButton(string, dVar2.f321521e, new C115952a(dVar2));
                builder.setConfirmationRequired(false);
                builder.build().authenticate(dVar2.f321520d, dVar2.f321523g, dVar2.f321521e, new C115953b(dVar2));
                this.f321532a.f321539g = C58833ax.m90834k(dVar2);
            }
        }
    }
}
