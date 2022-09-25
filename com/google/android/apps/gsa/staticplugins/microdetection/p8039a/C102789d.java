package com.google.android.apps.gsa.staticplugins.microdetection.p8039a;

import com.google.android.apps.gsa.p5836c.p5843f.C74458k;
import com.google.android.apps.gsa.p8889z.p8907d.p8908a.C118948b;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90582d;
import com.google.android.apps.gsa.shared.speech.p7139a.C90515g;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92496a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92497b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7306c.C92504i;
import com.google.android.apps.gsa.speech.p7269b.C92216a;
import com.google.android.apps.gsa.speech.p7298l.C92460b;
import com.google.android.apps.gsa.speech.p7298l.C92473f;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102845n;
import com.google.android.apps.gsa.staticplugins.microdetection.p8042d.C102846o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.a.d */
/* compiled from: PG */
public final class C102789d implements C118948b {

    /* renamed from: a */
    public static final C59071e f287006a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.a.d");

    /* renamed from: b */
    public C102845n f287007b;

    /* renamed from: c */
    final C92504i f287008c;

    /* renamed from: d */
    public final C89994f f287009d;

    /* renamed from: e */
    public final C102846o f287010e;

    /* renamed from: f */
    private final C22871g f287011f;

    /* renamed from: g */
    private C60870cx f287012g = null;

    public C102789d(C92504i iVar, C89994f fVar, C22871g gVar, C102846o oVar) {
        this.f287008c = iVar;
        this.f287009d = fVar;
        this.f287011f = gVar;
        this.f287010e = oVar;
    }

    /* renamed from: a */
    public final void mo91277a(boolean z) {
        synchronized (this) {
            C102845n nVar = this.f287007b;
            if (nVar != null) {
                nVar.mo93510f();
                this.f287007b = null;
            }
        }
        C60870cx cxVar = this.f287012g;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
    }

    /* renamed from: b */
    public final void mo91278b(C92216a aVar, C92473f fVar, C58833ax axVar) {
        C92460b bVar = fVar.f258015c;
        if (axVar.mo56113h()) {
            bVar = ((C74458k) axVar.mo56107c()).mo70774a();
        } else {
            ((C59052c) ((C59052c) f287006a.mo56226d()).mo56372aa(21158)).mo56386p("AudioListeningSessionAdapterOptional is not present");
            int i = C90755l.f253831a;
        }
        C90582d j = bVar.mo87199j();
        if (j == null) {
            aVar.mo70939a(new C90515g("Invalid hotword specification", 524296, false));
            return;
        }
        int f = bVar.mo87195f();
        int bitCount = Integer.bitCount(bVar.mo87190a());
        int b = bVar.mo87191b();
        C92496a aVar2 = (C92496a) C92497b.f258129f.createBuilder();
        aVar2.copyOnWrite();
        C92497b bVar2 = (C92497b) aVar2.instance;
        bVar2.f258131a |= 2;
        bVar2.f258133c = f;
        aVar2.copyOnWrite();
        C92497b bVar3 = (C92497b) aVar2.instance;
        bVar3.f258131a |= 4;
        bVar3.f258134d = bitCount;
        aVar2.copyOnWrite();
        C92497b bVar4 = (C92497b) aVar2.instance;
        bVar4.f258131a |= 8;
        bVar4.f258135e = b;
        C60870cx b2 = this.f287008c.mo87262b(j, (C92497b) aVar2.build(), aVar, false);
        this.f287012g = b2;
        C90873ag agVar = new C90873ag(b2, this.f287011f, "Create Hotword Data", new C102786a(this, aVar, fVar, axVar, f, bitCount));
        agVar.mo85224b(CancellationException.class, C102787b.f287003a);
        agVar.mo85223a(new C102788c(aVar, j));
    }
}
