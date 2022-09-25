package com.google.android.apps.gsa.staticplugins.s3request.p8690a;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.protobuf.C62940bt;
import com.google.speech.p5208h.C66568ay;
import com.google.speech.p5208h.C66569az;
import com.google.speech.p5208h.C66589bo;
import com.google.speech.p5208h.C66590bp;
import com.google.speech.p5208h.C66600bz;
import com.google.speech.p5208h.C66603ca;
import com.google.speech.p5208h.C66662eb;
import com.google.speech.p5208h.C66663ec;
import com.google.speech.p5208h.C66664ed;
import com.google.speech.p5208h.C66665ee;
import com.google.speech.p5208h.C66679m;
import com.google.speech.p5208h.C66680n;

/* renamed from: com.google.android.apps.gsa.staticplugins.s3request.a.al */
/* compiled from: PG */
public final class C116257al {

    /* renamed from: a */
    private final SharedPreferences f322351a;

    private C116257al(SharedPreferences sharedPreferences) {
        this.f322351a = sharedPreferences;
    }

    /* renamed from: a */
    static C116257al m192814a(C86338r rVar) {
        String string = rVar.getString("debug_pinhole_server_override", (String) null);
        boolean z = rVar.getBoolean("s3ForceReturnSemanticResult", false);
        float f = rVar.getFloat("overrideUnigramScoringParam", 0.0f);
        float f2 = rVar.getFloat("overrideBigramScoringParam", 0.0f);
        if (!TextUtils.isEmpty(string) || z || (f != 0.0f && f2 != 0.0f)) {
            return new C116257al(rVar);
        }
        return null;
    }

    /* renamed from: b */
    public final C66603ca mo102638b() {
        C66600bz bzVar = (C66600bz) C66603ca.f181183a.createBuilder();
        SharedPreferences sharedPreferences = this.f322351a;
        String string = sharedPreferences.getString("debug_pinhole_server_override", (String) null);
        if (!TextUtils.isEmpty(string)) {
            C66568ay ayVar = (C66568ay) C66569az.f181077c.createBuilder();
            ayVar.copyOnWrite();
            C66569az azVar = (C66569az) ayVar.instance;
            string.getClass();
            azVar.f181080a |= 1;
            azVar.f181081b = string;
            bzVar.mo58885m(C66569az.f181078d, (C66569az) ayVar.build());
        }
        if (sharedPreferences.getBoolean("s3ForceReturnSemanticResult", false)) {
            C62940bt btVar = C66590bp.f181134d;
            C66589bo boVar = (C66589bo) C66590bp.f181133c.createBuilder();
            boVar.copyOnWrite();
            C66590bp bpVar = (C66590bp) boVar.instance;
            bpVar.f181136a |= 256;
            bpVar.f181137b = true;
            bzVar.mo58885m(btVar, (C66590bp) boVar.build());
        }
        float f = sharedPreferences.getFloat("overrideUnigramScoringParam", 0.0f);
        float f2 = sharedPreferences.getFloat("overrideBigramScoringParam", 0.0f);
        if (!(f == 0.0f || f2 == 0.0f)) {
            C62940bt btVar2 = C66680n.f181394d;
            C66679m mVar = (C66679m) C66680n.f181393c.createBuilder();
            C66662eb ebVar = (C66662eb) C66663ec.f181340c.createBuilder();
            C66664ed edVar = (C66664ed) C66665ee.f181345d.createBuilder();
            edVar.copyOnWrite();
            C66665ee eeVar = (C66665ee) edVar.instance;
            eeVar.f181347a |= 1;
            eeVar.f181348b = f;
            edVar.copyOnWrite();
            C66665ee eeVar2 = (C66665ee) edVar.instance;
            eeVar2.f181347a |= 2;
            eeVar2.f181349c = f2;
            ebVar.copyOnWrite();
            C66663ec ecVar = (C66663ec) ebVar.instance;
            C66665ee eeVar3 = (C66665ee) edVar.build();
            eeVar3.getClass();
            ecVar.f181343b = eeVar3;
            ecVar.f181342a = 3;
            mVar.copyOnWrite();
            C66680n nVar = (C66680n) mVar.instance;
            C66663ec ecVar2 = (C66663ec) ebVar.build();
            ecVar2.getClass();
            nVar.f181397b = ecVar2;
            nVar.f181396a |= 1;
            bzVar.mo58885m(btVar2, (C66680n) mVar.build());
        }
        return (C66603ca) bzVar.build();
    }
}
