package com.google.android.libraries.lens.view;

import com.google.android.libraries.lens.view.flags.C26239a;
import com.google.android.libraries.lens.view.flags.C26242ac;
import com.google.android.libraries.lens.view.flags.C26243ad;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2096f.C25799b;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.apps.tiktok.experiments.C46895g;
import com.google.apps.tiktok.experiments.C46904p;
import com.google.apps.tiktok.experiments.phenotype.C46990dc;
import com.google.apps.tiktok.experiments.phenotype.C47053g;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58535iq;
import com.google.common.p4522b.C58537is;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4541l.C59326i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.libraries.lens.view.c */
/* compiled from: PG */
public final class C25698c implements C27654a {

    /* renamed from: a */
    public static final C58974d f69868a = C58974d.m91135i("ConfigFlagsDumper");

    /* renamed from: b */
    public final C46990dc f69869b;

    /* renamed from: c */
    public final C46990dc f69870c;

    /* renamed from: d */
    public final boolean f69871d;

    /* renamed from: e */
    private final C26243ad f69872e;

    /* renamed from: f */
    private final C26244b f69873f;

    /* renamed from: g */
    private final C25799b f69874g;

    /* renamed from: h */
    private final C47053g f69875h;

    /* renamed from: i */
    private final C47053g f69876i;

    public C25698c(C26243ad adVar, C26244b bVar, C25799b bVar2, C47053g gVar, C47053g gVar2, C46990dc dcVar, C46990dc dcVar2, boolean z) {
        this.f69872e = adVar;
        this.f69873f = bVar;
        this.f69874g = bVar2;
        this.f69875h = gVar;
        this.f69876i = gVar2;
        this.f69869b = dcVar;
        this.f69870c = dcVar2;
        this.f69871d = z;
    }

    /* renamed from: d */
    private static String m47440d(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf > 0) {
            return str.substring(0, indexOf);
        }
        int indexOf2 = str.indexOf(32);
        return indexOf2 > 0 ? str.substring(0, indexOf2) : str;
    }

    /* renamed from: e */
    private static void m47441e(C58490gz gzVar, C47053g gVar) {
        String str;
        for (Map.Entry entry : gVar.mo50925a().entrySet()) {
            String d = m47440d((String) entry.getKey());
            if (m47442f(d)) {
                String str2 = (String) entry.getKey();
                int indexOf = str2.indexOf(32);
                C58838bb.m90869d(indexOf >= 0, "flag ID missing");
                C58838bb.m90869d(indexOf < str2.length() + -1, "flag ID empty");
                String str3 = d + " " + str2.substring(indexOf + 1);
                C46904p pVar = (C46904p) entry.getValue();
                pVar.getClass();
                C46895g gVar2 = C46895g.LONG_VALUE;
                int ordinal = pVar.f122373c.ordinal();
                if (ordinal == 0) {
                    str = String.format(Locale.ENGLISH, "%d", new Object[]{Long.valueOf(pVar.mo50903b())});
                } else if (ordinal == 1) {
                    str = String.valueOf(pVar.mo50907f());
                } else if (ordinal == 2) {
                    str = String.format(Locale.ENGLISH, "%f", new Object[]{Double.valueOf(pVar.mo50902a())});
                } else if (ordinal == 3) {
                    str = pVar.mo50906e();
                } else if (ordinal == 4) {
                    C59326i iVar = C59326i.f157516d;
                    byte[] N = pVar.mo50904c().mo59174N();
                    str = iVar.mo56837l(N, N.length);
                } else if (ordinal == 5) {
                    C59326i iVar2 = C59326i.f157516d;
                    byte[] byteArray = pVar.mo50905d().toByteArray();
                    str = iVar2.mo56837l(byteArray, byteArray.length);
                } else {
                    throw new IllegalArgumentException("Unhandled flag type: ".concat(String.valueOf(String.valueOf(pVar.f122373c))));
                }
                ((C58535iq) gzVar).mo55429h(str3, str);
            }
        }
    }

    /* renamed from: f */
    private static boolean m47442f(String str) {
        return m47440d(str).startsWith("com.google.android.apps.search.lens.");
    }

    /* renamed from: a */
    public final C58495hd mo30826a(C60870cx... cxVarArr) {
        C58535iq b = C58537is.m90049b();
        b.mo55429h("SingletonFlags", String.valueOf(this.f69872e.mo31460e()));
        b.mo55429h("ConfigFlags", String.valueOf(this.f69873f.mo31460e()));
        for (int i = 0; i < 2; i++) {
            C60870cx cxVar = cxVarArr[i];
            if (cxVar.isDone()) {
                try {
                    for (Map.Entry entry : ((Map) C60856cj.m92909r(cxVar)).entrySet()) {
                        if (m47442f((String) entry.getKey())) {
                            b.mo55429h(m47440d((String) entry.getKey()), (String) entry.getValue());
                        }
                    }
                } catch (ExecutionException e) {
                    ((C58970a) ((C58970a) ((C58970a) f69868a.mo56225c()).mo56382g(e)).mo56372aa(48967)).mo56386p("ServerToken future failed");
                }
            } else {
                ((C58970a) ((C58970a) f69868a.mo56226d()).mo56372aa(48966)).mo56386p("Ignoring incomplete ServerToken future");
            }
        }
        return b.mo55363c();
    }

    /* renamed from: b */
    public final C58537is mo30827b() {
        String str;
        C58535iq b = C58537is.m90049b();
        C26239a[] values = C26239a.values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            C26239a aVar = values[i];
            String aVar2 = aVar.toString();
            C46895g gVar = C46895g.LONG_VALUE;
            int i2 = aVar.f71362ae;
            int i3 = i2 - 1;
            if (i2 != 0) {
                if (i3 == 0) {
                    str = String.valueOf(this.f69873f.mo31462g(aVar));
                } else if (i3 == 1) {
                    str = String.format(Locale.ENGLISH, "%f", new Object[]{Double.valueOf(this.f69873f.mo31455a(aVar))});
                } else if (i3 == 2) {
                    str = String.format(Locale.ENGLISH, "%d", new Object[]{Long.valueOf(this.f69873f.mo31456b(aVar))});
                } else if (i3 != 3) {
                    throw new IllegalArgumentException("Unhandled flag type: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "STRING" : "LONG" : "DOUBLE" : "BOOLEAN"));
                } else {
                    str = this.f69873f.mo31461f(aVar);
                }
                b.mo55429h(aVar2, str);
                i++;
            } else {
                throw null;
            }
        }
        for (C26242ac acVar : C26242ac.values()) {
            b.mo55429h(acVar.toString(), String.valueOf(this.f69872e.mo31464k(acVar)));
        }
        m47441e(b, this.f69875h);
        m47441e(b, this.f69876i);
        return b.mo55363c();
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        if (this.f69871d || this.f69874g.mo30940a() || this.f69874g.mo30941b()) {
            C58537is b = mo30827b();
            int size = b.f156190b.size();
            eVar.mo33150g("ConfigFlagDump-Count[" + size + "]");
            C58800sl lA = b.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                eVar.mo33148e((String) entry.getKey(), (String) entry.getValue());
            }
            C58800sl lA2 = mo30826a(this.f69869b.mo50962a(), this.f69870c.mo50962a()).entrySet().iterator();
            while (lA2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) lA2.next();
                eVar.mo33148e("ServerToken-".concat(String.valueOf((String) entry2.getKey())), (String) entry2.getValue());
            }
        }
    }
}
