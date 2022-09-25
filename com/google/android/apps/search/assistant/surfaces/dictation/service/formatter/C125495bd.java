package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118576a;
import com.google.android.apps.gsa.unifiedime.C118585c;
import com.google.android.apps.gsa.unifiedime.C118586d;
import com.google.android.apps.gsa.unifiedime.C118601s;
import com.google.android.apps.gsa.unifiedime.C118604v;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126323bd;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9482t.C126350a;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p4946az.C64364l;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.bd */
/* compiled from: PG */
public final class C125495bd {

    /* renamed from: j */
    private static final C59071e f346056j = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.bd");

    /* renamed from: a */
    public final String f346057a;

    /* renamed from: b */
    public final C126323bd f346058b;

    /* renamed from: c */
    public final boolean f346059c;

    /* renamed from: d */
    public final C58480gp f346060d = C58485gu.m89837e();

    /* renamed from: e */
    public final StringBuilder f346061e = new StringBuilder();

    /* renamed from: f */
    public final C58331bb f346062f = new C58331bb();

    /* renamed from: g */
    public final C58331bb f346063g = new C58331bb();

    /* renamed from: h */
    public final C58331bb f346064h = new C58331bb();

    /* renamed from: i */
    public int f346065i = 0;

    /* renamed from: k */
    private final C126350a f346066k;

    /* renamed from: l */
    private final Optional f346067l;

    public C125495bd(boolean z, C126350a aVar, Optional optional, Locale locale) {
        this.f346059c = z;
        this.f346066k = aVar;
        this.f346057a = locale.toLanguageTag();
        this.f346058b = new C126323bd(locale);
        this.f346067l = optional;
    }

    /* renamed from: a */
    public final C58495hd mo106988a(C64364l lVar) {
        C58490gz gzVar = new C58490gz(4);
        this.f346067l.flatMap(new C125484at(lVar)).ifPresent(new C125485au(gzVar));
        C126350a aVar = this.f346066k;
        C58485gu b = aVar.f348038c.mo55277g(aVar.f348037b.mo107533a(lVar.f173970b));
        int size = b.size();
        for (int i = 0; i < size; i++) {
            gzVar.mo55429h((String) b.get(i), C118585c.RECOGNITION);
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: b */
    public final void mo106989b(C58495hd hdVar, int i, int i2) {
        if (!hdVar.isEmpty()) {
            C125494bc c = C125494bc.m205461c(i, i2);
            C58800sl lA = hdVar.entrySet().iterator();
            while (lA.hasNext()) {
                Map.Entry entry = (Map.Entry) lA.next();
                C118576a aVar = (C118576a) C118586d.f330853e.createBuilder();
                String str = (String) entry.getKey();
                aVar.copyOnWrite();
                C118586d dVar = (C118586d) aVar.instance;
                str.getClass();
                dVar.f330855a |= 1;
                dVar.f330856b = str;
                aVar.copyOnWrite();
                C118586d dVar2 = (C118586d) aVar.instance;
                dVar2.f330858d = ((C118585c) entry.getValue()).f330852d;
                dVar2.f330855a |= 4;
                aVar.copyOnWrite();
                C118586d dVar3 = (C118586d) aVar.instance;
                dVar3.f330855a |= 2;
                dVar3.f330857c = 0.9f;
                C118586d dVar4 = (C118586d) aVar.build();
                C118585c a = C118585c.m196888a(dVar4.f330858d);
                if (a == null) {
                    a = C118585c.RECOGNITION;
                }
                int ordinal = a.ordinal();
                if (ordinal == 0) {
                    this.f346062f.mo54920x(c, dVar4);
                } else if (ordinal != 2) {
                    ((C59052c) ((C59052c) f346056j.mo56226d()).mo56372aa(36601)).mo56386p("Unknown alternate type. [SD]");
                } else {
                    this.f346063g.mo54920x(c, dVar4);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo106990c(int i, String str, C58495hd hdVar) {
        int codePointCount = str.codePointCount(0, str.length());
        if (codePointCount != 0) {
            if (i != 1) {
                C58480gp gpVar = this.f346060d;
                C118601s sVar = (C118601s) C118604v.f330885f.createBuilder();
                sVar.copyOnWrite();
                C118604v vVar = (C118604v) sVar.instance;
                vVar.f330890d = i - 1;
                vVar.f330887a |= 4;
                int i2 = this.f346065i;
                sVar.copyOnWrite();
                C118604v vVar2 = (C118604v) sVar.instance;
                vVar2.f330887a = 1 | vVar2.f330887a;
                vVar2.f330888b = i2;
                int i3 = this.f346065i;
                sVar.copyOnWrite();
                C118604v vVar3 = (C118604v) sVar.instance;
                vVar3.f330887a |= 2;
                vVar3.f330889c = i3 + codePointCount;
                gpVar.mo55395g((C118604v) sVar.build());
            }
            this.f346061e.append(str);
            mo106989b(hdVar, this.f346065i, codePointCount);
            this.f346065i += codePointCount;
        }
    }

    /* renamed from: d */
    public final void mo106991d(String str, int i) {
        if (i == 5) {
            mo106990c(5, str, C58729pv.f156485a);
        } else {
            mo106990c(4, " ".concat(String.valueOf(str)), C58729pv.f156485a);
        }
    }
}
