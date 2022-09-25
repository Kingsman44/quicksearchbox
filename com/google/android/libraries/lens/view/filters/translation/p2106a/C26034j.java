package com.google.android.libraries.lens.view.filters.translation.p2106a;

import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58468gd;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5124m.p5125a.C65603f;
import java.util.Arrays;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.a.j */
/* compiled from: PG */
public final class C26034j {

    /* renamed from: a */
    public static final C59071e f70751a = C59071e.m91332i("com.google.android.libraries.lens.view.filters.translation.a.j");

    /* renamed from: b */
    public final C69464a f70752b;

    /* renamed from: c */
    public final C69464a f70753c;

    /* renamed from: d */
    private final C58881cr f70754d = C58886cw.m90973a(new C26032h(this));

    /* renamed from: e */
    private final C58881cr f70755e = C58886cw.m90973a(new C26033i(this));

    public C26034j(C69464a aVar, C69464a aVar2) {
        this.f70752b = aVar;
        this.f70753c = aVar2;
    }

    /* renamed from: c */
    public static C58495hd m48061c(C65603f fVar) {
        C58490gz gzVar = new C58490gz(4);
        for (String str : fVar.f178307a) {
            String[] split = str.split(":");
            if (split.length != 2) {
                ((C59052c) ((C59052c) f70751a.mo56225c()).mo56372aa(49405)).mo56354G("Skipping %s: %s doesn't have 2 parts", str, Arrays.toString(split));
            } else {
                gzVar.mo55429h(split[0], split[1]);
            }
        }
        return gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public final long mo31239a(String str) {
        Long l = (Long) ((C58495hd) this.f70755e.mo6453a()).getOrDefault(str, 45000000L);
        l.getClass();
        return l.longValue();
    }

    /* renamed from: b */
    public final C58468gd mo31240b() {
        return (C58468gd) this.f70754d.mo6453a();
    }

    /* renamed from: d */
    public final boolean mo31241d(Locale locale) {
        return mo31240b().containsKey(locale.toLanguageTag());
    }
}
