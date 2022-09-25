package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9471d;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.C126107dr;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126027d;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126029e;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.C126035k;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.C125996a;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9468a.C125999c;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9467c.p9469b.C126018r;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b.p9472d.C126028a;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3931f.p3939c.C52822al;
import com.google.assistant.p3931f.p3939c.C52824an;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.c.d.e */
/* compiled from: PG */
public final class C126026e implements C125996a {

    /* renamed from: a */
    public final C126107dr f347325a;

    /* renamed from: b */
    public final C126022a f347326b;

    /* renamed from: c */
    public final C126028a f347327c;

    /* renamed from: d */
    private final C125999c f347328d;

    /* renamed from: e */
    private final C126018r f347329e;

    /* renamed from: f */
    private final boolean f347330f;

    /* renamed from: g */
    private final Executor f347331g;

    public C126026e(C126107dr drVar, C126028a aVar, C126022a aVar2, C125999c cVar, C126018r rVar, boolean z, Executor executor) {
        this.f347325a = drVar;
        this.f347327c = aVar;
        this.f347326b = aVar2;
        this.f347328d = cVar;
        this.f347329e = rVar;
        this.f347330f = z;
        this.f347331g = executor;
    }

    /* renamed from: a */
    public final C60870cx mo107237a(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.keep".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.keep");
        return C60856cj.m92900i(this.f347328d.mo107240a(kVar));
    }

    /* renamed from: b */
    public final C60870cx mo107238b(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.keep".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.keep");
        C60870cx a = this.f347329e.mo107243a(kVar);
        C126025d dVar = new C126025d(this, kVar);
        return C60922j.m93044g(a, C47810es.m84963c(dVar), this.f347331g);
    }

    /* renamed from: c */
    public final C60870cx mo107239c(C126035k kVar) {
        C126029e eVar = (C126029e) kVar;
        C58838bb.m90879n("com.google.android.keep".equals(eVar.f347340a), "Package: \"%s\" doesn't match provider package: %s", eVar.f347340a, "com.google.android.keep");
        C58480gp e = C58485gu.m89837e();
        if (eVar.f347346g) {
            e.mo55395g(C126107dr.m206200n());
        }
        if (this.f347330f) {
            C52824an anVar = eVar.f347342c.f138614b;
            if (anVar == null) {
                anVar = C52824an.f138590b;
            }
            for (C52822al alVar : anVar.f138592a) {
                if (alVar.f138589c && !((C126027d) eVar.f347341b).f347332a) {
                    if (alVar.f138587a.equals("set_title_start_dictation") && alVar.f138588b.equals("title")) {
                        e.mo55395g(this.f347325a.mo107347f(eVar.f347344e, R.string.assistant_keyboard_start_dictating_title));
                    } else if (alVar.f138587a.equals("edit_start_dictation")) {
                        e.mo55395g(this.f347325a.mo107347f(eVar.f347344e, R.string.assistant_keyboard_start_dictating_note));
                    } else if (alVar.f138587a.equals("add_item_start_dictation")) {
                        e.mo55395g(this.f347325a.mo107347f(eVar.f347344e, R.string.assistant_keyboard_start_dictating_list));
                    }
                }
            }
        }
        e.mo55395g(this.f347325a.mo107352k(eVar.f347344e));
        return C60856cj.m92900i(e.mo55394f());
    }
}
