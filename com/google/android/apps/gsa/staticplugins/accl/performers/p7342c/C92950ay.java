package com.google.android.apps.gsa.staticplugins.accl.performers.p7342c;

import androidx.p104d.p105a.C2168g;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.conversation.clientop.C22434e;
import com.google.android.libraries.gsa.conversation.clientop.C22538o;
import com.google.android.libraries.gsa.conversation.clientop.p1841b.C22402a;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.afr;
import com.google.assistant.p3897e.p3921j.afv;
import com.google.assistant.p3897e.p3921j.afw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.performers.c.ay */
/* compiled from: PG */
public final class C92950ay extends C22538o {

    /* renamed from: a */
    public static final C59071e f259298a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.performers.c.ay");

    /* renamed from: b */
    private final C92931af f259299b;

    public C92950ay(C92931af afVar) {
        this.f259299b = afVar;
    }

    /* renamed from: a */
    public final C60870cx mo20765a(C51809dy dyVar, C22434e eVar) {
        C51807dw dwVar = dyVar.f135938d;
        if (dwVar == null) {
            dwVar = C51807dw.f135930b;
        }
        afw afw = (afw) m41992m(dwVar, "screen_navigation_args", afw.f135019d.getParserForType());
        int a = afv.m86306a(afw.f135023c);
        if (a == 0) {
            a = 1;
        }
        if (a - 2 != 1) {
            C59052c cVar = (C59052c) ((C59052c) f259298a.mo56226d()).mo56372aa(13275);
            int a2 = afv.m86306a(afw.f135023c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 != 1) {
                cVar.mo56387q("Unsupported control: %s", a2 - 2);
                return C60856cj.m92900i(C22402a.m41822b(C52235kf.UNIMPLEMENTED, (String) null));
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        if (afw.f135021a == 5) {
            afr afr = (afr) afw.f135022b;
        } else {
            afr afr2 = afr.f135015a;
        }
        C92931af afVar = this.f259299b;
        C92930ae aeVar = new C92930ae(afVar.f259257d.mo83132f(), afVar.f259255b);
        C60870cx a3 = C2169h.m6027a(aeVar);
        ((C2168g) a3).f6144b.mo4106b(new C92927ab(afVar, a3, aeVar), C60826bg.f164896a);
        C60870cx g = C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i((C60838bs) C60856cj.m92908q(C60922j.m93045h(C60838bs.m92859i(a3), new C92928ac(afVar), afVar.f259256c), afVar.f259258e.mo85399d(C90126fx.f251508kD), TimeUnit.MILLISECONDS, afVar.f259256c)), C92948aw.f259296a, C60826bg.f164896a), Throwable.class, C92949ax.f259297a, C60826bg.f164896a);
        g.mo4106b(new C92947av(g), C60826bg.f164896a);
        return g;
    }
}
