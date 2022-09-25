package com.google.android.apps.gsa.staticplugins.opa.setupwizard;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.gsa.opaonboarding.C83883aq;
import com.google.android.apps.gsa.opaonboarding.C83884ar;
import com.google.android.apps.gsa.opaonboarding.C83885as;
import com.google.android.apps.gsa.opaonboarding.C83944k;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.opaonboarding.C84036z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90062dn;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.speech.setupwizard.C92653e;
import com.google.android.apps.gsa.staticplugins.opa.omniconsent.C109789ai;
import com.google.android.apps.gsa.staticplugins.opa.p8625z.p8626a.C114540i;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.setupwizard.x */
/* compiled from: PG */
public final class C110500x extends C84036z {

    /* renamed from: a */
    public static final C59071e f308059a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.setupwizard.x");

    /* renamed from: b */
    public final C110502z f308060b;

    /* renamed from: c */
    public final C110475ay f308061c;

    /* renamed from: d */
    public final C92486a f308062d;

    /* renamed from: e */
    public final C86124t f308063e;

    /* renamed from: f */
    public final C114540i f308064f;

    /* renamed from: g */
    public C83956t f308065g;

    /* renamed from: h */
    public final C92533a f308066h;

    /* renamed from: i */
    private final C92653e f308067i;

    /* renamed from: j */
    private final C89994f f308068j;

    /* renamed from: k */
    private final C68214a f308069k;

    /* renamed from: l */
    private final C109789ai f308070l;

    public C110500x(C110502z zVar, C110475ay ayVar, C92653e eVar, C92486a aVar, C89994f fVar, C109789ai aiVar, C86124t tVar, C114540i iVar, C68214a aVar2, C92533a aVar3) {
        this.f308060b = zVar;
        this.f308061c = ayVar;
        this.f308067i = eVar;
        this.f308062d = aVar;
        this.f308068j = fVar;
        this.f308070l = aiVar;
        this.f308063e = tVar;
        this.f308064f = iVar;
        this.f308069k = aVar2;
        this.f308066h = aVar3;
    }

    /* renamed from: b */
    public final boolean mo98740b() {
        return ((SharedPreferences) this.f308069k.mo27525b()).getInt("opa_hotword_training_seen_count", 0) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C58485gu mo77495h() {
        String str;
        int i;
        if (this.f308063e.mo79746e(C90062dn.f249203b)) {
            return C58485gu.m89845m();
        }
        if (this.f308060b.mo98725e() && this.f308061c.mo98719f()) {
            return C58485gu.m89845m();
        }
        this.f308067i.mo87423a();
        Bundle a = this.f308061c.mo98714a();
        a.putString("opaSuwIsSpeakerIdSupported", String.valueOf(this.f308068j.mo83823l()));
        a.putString("opaSuwIsXGoogleEnabled", String.valueOf(this.f308068j.mo83834w()));
        if (this.f308068j.mo83834w()) {
            str = this.f308062d.mo87231e(Locale.getDefault().toString());
        } else {
            str = this.f308062d.mo87230d();
        }
        a.putString("opaSuwXGoogleHotword", str);
        a.putString("opaSuwHotwordEnrollmentState", String.valueOf(this.f308068j.mo83855R()));
        C59104x b = f308059a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "OpaSuwContentSeq");
        ((C59052c) ((C59052c) b).mo56372aa(26393)).mo56389s("Added Voice Match signals to opaSuwIntentExtras = %s", a);
        C58480gp e = C58485gu.m89837e();
        C110495s sVar = new C110495s(this);
        C110496t tVar = new C110496t(this);
        int i2 = 0;
        if (this.f308063e.mo79746e(C90062dn.f249205d)) {
            C110498v vVar = new C110498v(this);
            C110499w wVar = new C110499w(this);
            if (!this.f308060b.mo98723c()) {
                String ae = this.f308068j.mo83885ae();
                C58485gu c = this.f308063e.mo79745c(C90120fr.f250770J);
                int size = c.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    int i3 = i2 + 1;
                    if (ae.equals((String) c.get(i2))) {
                        e.mo55395g(vVar);
                        break;
                    }
                    i2 = i3;
                }
                e.mo55395g(tVar);
            }
            if (this.f308063e.mo79746e(C90062dn.f249204c) && !this.f308063e.mo79746e(C90062dn.f249215n)) {
                e.mo55395g(wVar);
            }
            e.mo55395g(sVar);
            e.mo55395g(new C110497u(this));
            return e.mo55394f();
        }
        if (this.f308063e.mo79746e(C90062dn.f249209h)) {
            C83883aq o = C83884ar.m133585o();
            o.mo77255j(15);
            o.mo77254i(29);
            C83944k kVar = (C83944k) o;
            kVar.f228637d = 14;
            o.mo77249d(false);
            o.mo77248c(false);
            if (this.f308063e.mo79746e(C90062dn.f249207f)) {
                o.mo77250e(true);
                i = 3;
            } else {
                o.mo77250e(false);
                i = 4;
            }
            kVar.f228636c = i;
            C83885as a2 = this.f308070l.mo98123a(o.mo77246a());
            this.f308065g = a2;
            e.mo55395g(a2);
        }
        C110494r rVar = new C110494r(this, true, sVar.mo98738d(), tVar.mo98739d());
        C110494r rVar2 = new C110494r(this, false, sVar.mo98738d(), tVar.mo98739d());
        if (this.f308063e.mo79746e(C90062dn.f249208g)) {
            e.mo55395g(sVar);
            e.mo55395g(tVar);
            if (this.f308063e.mo79746e(C90062dn.f249210i)) {
                e.mo55395g(rVar);
            }
            if (this.f308063e.mo79746e(C90062dn.f249211j)) {
                e.mo55395g(rVar2);
            }
        } else {
            if (this.f308063e.mo79746e(C90062dn.f249210i)) {
                e.mo55395g(rVar);
            }
            if (this.f308063e.mo79746e(C90062dn.f249211j)) {
                e.mo55395g(rVar2);
            }
            e.mo55395g(sVar);
            e.mo55395g(tVar);
        }
        e.mo55395g(new C110497u(this));
        return e.mo55394f();
    }
}
