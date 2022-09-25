package com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6076i;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.nga.shared.p6407v.C83334w;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82413eg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82883dz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82885ea;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82887ec;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82892eh;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82893ei;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122106o;
import com.google.android.libraries.assistant.portable.p1586b.C19072d;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Map;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.d.i.q */
/* compiled from: PG */
public final class C76757q implements C76746f {

    /* renamed from: a */
    public static final C58974d f212118a = C58974d.m91136j();

    /* renamed from: b */
    public final C83334w f212119b;

    /* renamed from: c */
    private final C83305i f212120c;

    /* renamed from: d */
    private final C76092h f212121d;

    public C76757q(C83305i iVar, C76092h hVar, C83334w wVar) {
        this.f212120c = iVar;
        this.f212121d = hVar;
        this.f212119b = wVar;
    }

    /* renamed from: c */
    public static String m123368c(C19072d dVar) {
        return String.format(Locale.ENGLISH, "%s pos:%d len:%d score:%f annotator: %s", new Object[]{dVar.f53499a, Integer.valueOf(dVar.f53500b), Integer.valueOf(dVar.f53501c), Float.valueOf(dVar.f53502d), dVar.f53503e});
    }

    /* renamed from: d */
    public static String m123369d(C122106o oVar) {
        int i = oVar.f338760a;
        if (i == 1) {
            return (String) oVar.f338761b;
        }
        return i == 2 ? Integer.toString(((Integer) oVar.f338761b).intValue()) : BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final void mo72318a(C122448cm cmVar, C83320io ioVar) {
        int i = cmVar.f339456a;
        if (i > 0) {
            mo72321f("fMissingContext", Integer.toString(i), ioVar);
        }
        Collection.EL.stream(cmVar.f339457b).forEach(new C76753m(this, ioVar));
        Collection.EL.stream(cmVar.f339459d).forEach(new C76754n(this, ioVar));
        mo72320e(cmVar.f339458c, ioVar);
        Collection.EL.stream(cmVar.f339460e).forEach(new C76755o(this, ioVar));
        mo72321f("lifecycle_num", Integer.toString(cmVar.f339461f), ioVar);
        mo72321f("lifecycle_time", Long.toString(cmVar.f339462g), ioVar);
        Map.EL.forEach(Collections.unmodifiableMap(cmVar.f339463h), new C76756p(this, ioVar));
    }

    /* renamed from: b */
    public final void mo72319b(C122448cm cmVar, int i) {
        int i2;
        String str;
        C83305i iVar = this.f212120c;
        int i3 = cmVar.f339456a;
        Iterator it = cmVar.f339459d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i2 = 100;
                break;
            }
            String str2 = (String) it.next();
            if (!str2.startsWith("apa_pop")) {
                if (!str2.startsWith("nga_pop")) {
                    if (!str2.startsWith("apa_canteen_03_01")) {
                        if (str2.startsWith("nga_canteen_03_01")) {
                            i2 = 4;
                            break;
                        }
                    } else {
                        i2 = 3;
                        break;
                    }
                } else {
                    i2 = 2;
                    break;
                }
            } else {
                i2 = 1;
                break;
            }
        }
        String str3 = (String) Collection.EL.stream(cmVar.f339457b).map(C76749i.f212104a).map(C76750j.f212105a).sorted().collect(Collectors.joining(";"));
        if (str3 != null) {
            Iterator it2 = cmVar.f339459d.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    str = BuildConfig.FLAVOR;
                    break;
                }
                String str4 = (String) it2.next();
                if (str4.startsWith("webref")) {
                    str = str4;
                    break;
                }
            }
            if (str != null) {
                String languageTag = this.f212121d.mo72021b().mo72039e().toLanguageTag();
                if (languageTag != null) {
                    iVar.mo75579d(new C82413eg("NGA_POP_FULFILLMENT_STATS", i3, true, languageTag, i2, str3, i, str));
                    return;
                }
                throw new NullPointerException("Null locale");
            }
            throw new NullPointerException("Null webrefGroup");
        }
        throw new NullPointerException("Null contextFailures");
    }

    /* renamed from: e */
    public final void mo72320e(List list, C83320io ioVar) {
        Collection.EL.stream(list).forEach(new C76752l(this, ioVar));
    }

    /* renamed from: f */
    public final void mo72321f(String str, String str2, C83320io ioVar) {
        String str3 = ioVar.f227136c;
        String str4 = ioVar.f227135b;
        C83334w wVar = this.f212119b;
        C82887ec ecVar = C82887ec.ONDEVICE_FULFILLMENT_ERROR_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82892eh ehVar = (C82892eh) C82893ei.f226110e.createBuilder();
        ehVar.copyOnWrite();
        C82893ei eiVar = (C82893ei) ehVar.instance;
        str2.getClass();
        eiVar.f226112a |= 1;
        eiVar.f226113b = str2;
        ehVar.copyOnWrite();
        C82893ei eiVar2 = (C82893ei) ehVar.instance;
        str.getClass();
        eiVar2.f226112a |= 2;
        eiVar2.f226114c = str;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82893ei eiVar3 = (C82893ei) ehVar.build();
        eiVar3.getClass();
        eaVar.f225980b = eiVar3;
        eaVar.f225979a = 113;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
    }

    /* renamed from: g */
    public final void mo72322g(String str, String str2, C83320io ioVar, String str3) {
        C83334w wVar = this.f212119b;
        C82887ec ecVar = C82887ec.ONDEVICE_FULFILLMENT_ERROR_EVENT;
        C82883dz dzVar = (C82883dz) C82885ea.f225977c.createBuilder();
        C82892eh ehVar = (C82892eh) C82893ei.f226110e.createBuilder();
        ehVar.copyOnWrite();
        C82893ei eiVar = (C82893ei) ehVar.instance;
        str2.getClass();
        eiVar.f226112a |= 1;
        eiVar.f226113b = str2;
        ehVar.copyOnWrite();
        C82893ei eiVar2 = (C82893ei) ehVar.instance;
        eiVar2.f226112a |= 2;
        eiVar2.f226114c = str;
        ehVar.copyOnWrite();
        C82893ei eiVar3 = (C82893ei) ehVar.instance;
        str3.getClass();
        eiVar3.f226112a |= 4;
        eiVar3.f226115d = str3;
        dzVar.copyOnWrite();
        C82885ea eaVar = (C82885ea) dzVar.instance;
        C82893ei eiVar4 = (C82893ei) ehVar.build();
        eiVar4.getClass();
        eaVar.f225980b = eiVar4;
        eaVar.f225979a = 113;
        wVar.mo75545c(ecVar, (C82885ea) dzVar.build(), ioVar);
    }
}
