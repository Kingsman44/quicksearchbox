package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8505c;

import android.content.pm.ShortcutInfo;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112142i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113188cs;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113263ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.assistant.p3781ad.p3789d.p3791b.p3792a.C48599ao;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import com.google.protobuf.C62995dn;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.Optional;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.c.ah */
/* compiled from: PG */
public final /* synthetic */ class C111431ah implements Supplier {

    /* renamed from: a */
    public final /* synthetic */ C111442as f310008a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f310009b;

    /* renamed from: c */
    public final /* synthetic */ ShortcutInfo f310010c;

    /* renamed from: d */
    public final /* synthetic */ C113405ep f310011d;

    /* renamed from: e */
    public final /* synthetic */ String f310012e;

    /* renamed from: f */
    public final /* synthetic */ Map f310013f;

    /* renamed from: g */
    public final /* synthetic */ double f310014g;

    public /* synthetic */ C111431ah(C111442as asVar, C60870cx cxVar, ShortcutInfo shortcutInfo, C113405ep epVar, String str, Map map, double d) {
        this.f310008a = asVar;
        this.f310009b = cxVar;
        this.f310010c = shortcutInfo;
        this.f310011d = epVar;
        this.f310012e = str;
        this.f310013f = map;
        this.f310014g = d;
    }

    public final Object get() {
        C54813af afVar;
        double d;
        double d2;
        double d3;
        double d4;
        C111442as asVar = this.f310008a;
        C60870cx cxVar = this.f310009b;
        ShortcutInfo shortcutInfo = this.f310010c;
        C113405ep epVar = this.f310011d;
        String str = this.f310012e;
        Map map = this.f310013f;
        double d5 = this.f310014g;
        C113188cs csVar = (C113188cs) asVar.f310038g.mo27525b();
        double doubleValue = ((Double) Map.EL.getOrDefault(map, str, Double.valueOf(C59203do.f157270a))).doubleValue();
        if (!epVar.mo100022f().f53686n) {
            String o = C111442as.m185203o(epVar);
            double m = asVar.f310034c.mo79747m(C90063do.f249510er);
            Optional j = ((C112471ap) asVar.f310037f.mo27525b()).mo99539j();
            if (j.isPresent()) {
                str.getClass();
                C62995dn dnVar = ((C48599ao) j.get()).f125609a;
                if (dnVar.containsKey(str)) {
                    m = ((Double) dnVar.get(str)).doubleValue();
                }
            }
            C58976aa aaVar = C58975e.f156826a;
            if (o.isEmpty()) {
                d4 = asVar.f310034c.mo79747m(C90063do.f249251X);
                d3 = asVar.f310034c.mo79747m(C90063do.f249250W);
                d = asVar.f310034c.mo79747m(C90063do.f249252Y);
                d2 = C59203do.f157270a;
            } else {
                d4 = asVar.f310034c.mo79747m(C90063do.f249242O);
                d3 = asVar.f310034c.mo79747m(C90063do.f249240M);
                d2 = asVar.f310034c.mo79747m(C90063do.f249244Q);
                d = asVar.f310034c.mo79747m(C90063do.f249243P);
            }
            d5 = d4 + (d3 * doubleValue) + (d2 * d5) + (d * m);
        }
        if (shortcutInfo == null || !shortcutInfo.isEnabled() || csVar.mo99903e(shortcutInfo) == null) {
            return Optional.empty();
        }
        C113263ap apVar = new C113263ap();
        apVar.f313631c = Optional.m71637of(shortcutInfo);
        apVar.f313632d = Optional.m71637of(cxVar);
        C113284bi a = apVar.mo99958a();
        CharSequence e = csVar.mo99903e(shortcutInfo);
        e.getClass();
        String obj = e.toString();
        if (csVar.f313516e.mo79746e(C90063do.f249318bK) && csVar.f313516e.mo79746e(C90063do.f249319bL)) {
            ((C111248k) csVar.f313514c.mo27525b()).mo99076a(C111255r.ANDROID_APP_SHORTCUTS, String.format("Params for AppShortcut suggestion '%s':\n%s", new Object[]{obj, shortcutInfo}));
        }
        C113414ey R = C113415ez.m187750R();
        R.mo100175t(C48672ag.APP_SHORTCUTS);
        R.mo100164i(obj);
        C113386e eVar = (C113386e) R;
        eVar.f313957e = Optional.m71637of(a);
        R.mo100167l(10001);
        R.mo100180y(20030);
        R.mo100177v(C48580an.APP_SHORTCUTS);
        if (shortcutInfo.isDynamic()) {
            afVar = C54813af.APP_SHORTCUT_DYNAMIC;
        } else {
            afVar = C54813af.APP_SHORTCUT_STATIC;
        }
        eVar.f313966n = Optional.m71637of(afVar);
        eVar.f313963k = C58495hd.m89900n(C112142i.DISPLAY_TEXT, csVar.mo99902c(C48580an.APP_SHORTCUTS, obj, shortcutInfo.getPackage()));
        R.mo100174s(d5);
        C113415ez a2 = R.mo100156a();
        C58976aa aaVar2 = C58975e.f156826a;
        return Optional.m71637of(a2);
    }
}
