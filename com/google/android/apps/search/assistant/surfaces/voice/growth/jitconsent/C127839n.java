package com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent;

import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147489d;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147491a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147542p;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10995c.C147544r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23957g;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23959i;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.n */
/* compiled from: PG */
public final class C127839n {

    /* renamed from: c */
    private static final C59071e f351847c = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.jitconsent.n");

    /* renamed from: a */
    public final Context f351848a;

    /* renamed from: b */
    public final C23959i f351849b;

    public C127839n(C23957g gVar, Context context, C21370a aVar) {
        this.f351848a = context;
        C23959i.f65516b = gVar;
        try {
            C31760t.m59102i(context);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f351847c.mo56226d()).mo56382g(e)).mo56372aa(37616)).mo56386p("Attempted to set phenotype context more than once.");
        }
        C147542p pVar = C147542p.f398211a;
        if (context == null) {
            throw new NullPointerException("Null context");
        } else if (aVar != null) {
            C147489d dVar = !C58836b.f156633a.mo56113h() ? new C147489d() : null;
            C147479b bVar = !C58836b.f156633a.mo56113h() ? new C147479b(context) : null;
            if (bVar == null || dVar == null) {
                StringBuilder sb = new StringBuilder();
                if (bVar == null) {
                    sb.append(" loggerFactory");
                }
                if (dVar == null) {
                    sb.append(" flags");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            C23959i.f65517c = new C147544r(new C147491a(context, "assistant_jit_udc", aVar, bVar, pVar, dVar));
            this.f351849b = new C23959i();
        } else {
            throw new NullPointerException("Null clock");
        }
    }
}
