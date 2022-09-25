package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100721ad;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100784o;
import com.google.android.apps.gsa.staticplugins.fedass.p7940b.C100788s;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerImpl;
import com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaterializerResult;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ai */
/* compiled from: PG */
public final class C101128ai {

    /* renamed from: a */
    public static final C59071e f282331a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.l.ai");

    /* renamed from: b */
    public final C100788s f282332b;

    /* renamed from: c */
    public final C100784o f282333c;

    /* renamed from: d */
    public final C100719ab f282334d;

    /* renamed from: e */
    public final C100721ad f282335e;

    /* renamed from: f */
    public final C68214a f282336f;

    /* renamed from: g */
    public final C86124t f282337g;

    /* renamed from: h */
    public final C92486a f282338h;

    public C101128ai(C100788s sVar, C100784o oVar, C100719ab abVar, C100721ad adVar, C68214a aVar, C86124t tVar, C92486a aVar2) {
        this.f282332b = sVar;
        this.f282333c = oVar;
        this.f282334d = abVar;
        this.f282335e = adVar;
        this.f282336f = aVar;
        this.f282337g = tVar;
        this.f282338h = aVar2;
    }

    /* renamed from: a */
    public static EkhoMaterializerResult m167327a(EkhoMaterializerImpl ekhoMaterializerImpl) {
        int i = 0;
        while (i < 3) {
            try {
                return ekhoMaterializerImpl.mo24639a();
            } catch (IOException e) {
                ((C59052c) ((C59052c) ((C59052c) f282331a.mo56225c()).mo56382g(e)).mo56372aa(19830)).mo56386p("IOException encountered. Moving on to the next example.");
                i++;
            }
        }
        return ekhoMaterializerImpl.mo24639a();
    }
}
