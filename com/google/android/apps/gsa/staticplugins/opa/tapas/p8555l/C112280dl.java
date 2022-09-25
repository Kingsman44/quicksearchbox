package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C79938am;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113206m;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113425ff;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54813af;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54814ag;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54844bj;
import com.google.p4140ba.p4141a.p4145b.p4146a.C54845bk;
import p3186j$.util.StringJoiner;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.dl */
/* compiled from: PG */
public final class C112280dl extends C112164aq {

    /* renamed from: a */
    static final Function f311599a = new C112243cu();

    /* renamed from: b */
    static final Function f311600b = new C112288dt();

    /* renamed from: c */
    static final Function f311601c = new C112275dg();

    /* renamed from: d */
    static final Function f311602d = new C112226cd();

    /* renamed from: e */
    static final Function f311603e = new C112219by();

    /* renamed from: f */
    private final C113206m f311604f;

    /* renamed from: g */
    private final C86124t f311605g;

    /* renamed from: h */
    private final C113425ff f311606h;

    public C112280dl(C113206m mVar, C86124t tVar, C113425ff ffVar, C112289du duVar, C112292dx dxVar, C112244cv cvVar, C112216bv bvVar, C112276dh dhVar) {
        super(duVar, dxVar, cvVar, bvVar, dhVar);
        this.f311604f = mVar;
        this.f311605g = tVar;
        this.f311606h = ffVar;
    }

    /* renamed from: b */
    public final void mo99447b(C79938am amVar, C54844bj bjVar) {
        if (!this.f311604f.mo99855n(amVar.f219192k)) {
            String str = amVar.f219192k;
            bjVar.copyOnWrite();
            C54845bk bkVar = (C54845bk) bjVar.instance;
            C54845bk bkVar2 = C54845bk.f143986C;
            str.getClass();
            bkVar.f143990a |= 512;
            bkVar.f144000k = str;
        }
    }

    /* renamed from: c */
    public final void mo99448c(C79938am amVar, C54844bj bjVar) {
        if (this.f311605g.mo79746e(C90063do.f249373cM) && this.f311606h.mo100143i()) {
            int ordinal = C48672ag.m85259b(amVar.f219187f).ordinal();
            if (ordinal != 2) {
                if (!(ordinal == 29 || ordinal == 38)) {
                    if (ordinal != 33) {
                        if (ordinal != 34) {
                            switch (ordinal) {
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                    break;
                                default:
                                    switch (ordinal) {
                                        case 16:
                                        case 17:
                                        case 18:
                                            break;
                                    }
                            }
                        }
                    } else if (!this.f311606h.mo100142h()) {
                        return;
                    }
                    String str = amVar.f219183b;
                    bjVar.copyOnWrite();
                    C54845bk bkVar = (C54845bk) bjVar.instance;
                    C54845bk bkVar2 = C54845bk.f143986C;
                    str.getClass();
                    bkVar.f143990a |= 1;
                    bkVar.f143991b = str;
                    return;
                }
                if (this.f311606h.mo100139e()) {
                    C54814ag agVar = amVar.f219181E;
                    if (agVar == null) {
                        agVar = C54814ag.f143814c;
                    }
                    C54813af a = C54813af.m87536a(agVar.f143817b);
                    if (a == null) {
                        a = C54813af.UNKNOWN;
                    }
                    if (a == C54813af.APP_SHORTCUT_DYNAMIC && !this.f311606h.mo100142h()) {
                        return;
                    }
                    String str2 = amVar.f219183b;
                    bjVar.copyOnWrite();
                    C54845bk bkVar3 = (C54845bk) bjVar.instance;
                    C54845bk bkVar22 = C54845bk.f143986C;
                    str2.getClass();
                    bkVar3.f143990a |= 1;
                    bkVar3.f143991b = str2;
                    return;
                }
                return;
            }
            if (this.f311606h.mo100140f()) {
                C54814ag agVar2 = amVar.f219181E;
                if (agVar2 == null) {
                    agVar2 = C54814ag.f143814c;
                }
                C54813af a2 = C54813af.m87536a(agVar2.f143817b);
                if (a2 == null) {
                    a2 = C54813af.UNKNOWN;
                }
                if (a2 == C54813af.CONTACTS) {
                    String str3 = amVar.f219183b;
                    StringJoiner stringJoiner = new StringJoiner(" ");
                    for (String str4 : C58869cf.m90936b(new C58903m(' ')).mo56153g(str3)) {
                        String str5 = "[REDACTED]";
                        if (str4.length() >= 4) {
                            str5 = String.valueOf(str4.substring(0, 2)).concat(str5);
                        } else if (str4.length() == 3) {
                            str5 = String.valueOf(str4.substring(0, 1)).concat(str5);
                        }
                        stringJoiner.add(str5);
                    }
                    String stringJoiner2 = stringJoiner.toString();
                    bjVar.copyOnWrite();
                    C54845bk bkVar4 = (C54845bk) bjVar.instance;
                    C54845bk bkVar5 = C54845bk.f143986C;
                    stringJoiner2.getClass();
                    bkVar4.f143990a |= 1;
                    bkVar4.f143991b = stringJoiner2;
                }
            }
        }
    }
}
