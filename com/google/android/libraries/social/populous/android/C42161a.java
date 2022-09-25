package com.google.android.libraries.social.populous.android;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.C42384e;
import com.google.android.libraries.social.populous.C42556g;
import com.google.android.libraries.social.populous.core.C42262ao;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.logging.C42573h;
import com.google.android.libraries.social.populous.logging.C42576k;
import com.google.android.libraries.social.populous.logging.C42589x;
import com.google.android.libraries.social.populous.logging.C42590y;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42403a;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42405ab;
import com.google.android.libraries.social.populous.p3296e.p3298b.C42418ao;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42449a;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42454ae;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42457ah;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42475b;
import com.google.android.libraries.social.populous.p3296e.p3299c.C42476c;
import com.google.common.base.C58836b;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.android.a */
/* compiled from: PG */
public final /* synthetic */ class C42161a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ AndroidLibAutocompleteSession f110430a;

    /* renamed from: b */
    public final /* synthetic */ C42576k f110431b;

    /* renamed from: c */
    public final /* synthetic */ C42556g f110432c;

    /* renamed from: d */
    public final /* synthetic */ C58872ci f110433d;

    public /* synthetic */ C42161a(AndroidLibAutocompleteSession androidLibAutocompleteSession, C42576k kVar, C42556g gVar, C58872ci ciVar) {
        this.f110430a = androidLibAutocompleteSession;
        this.f110431b = kVar;
        this.f110432c = gVar;
        this.f110433d = ciVar;
    }

    public final Object call() {
        C58485gu guVar;
        AndroidLibAutocompleteSession androidLibAutocompleteSession = this.f110430a;
        C42576k kVar = this.f110431b;
        C42556g gVar = this.f110432c;
        C58872ci ciVar = this.f110433d;
        C42475b bVar = androidLibAutocompleteSession.f110428y;
        ClientConfigInternal clientConfigInternal = bVar.f111413b;
        if (!clientConfigInternal.f110737w) {
            C58528ij ijVar = clientConfigInternal.f110725k;
            if ((ijVar.contains(C42262ao.PHONE_NUMBER) || ijVar.contains(C42262ao.EMAIL)) && C42454ae.m74855h(bVar.f111412a)) {
                C42476c cVar = bVar.f111416e;
                Context context = bVar.f111412a;
                ClientConfigInternal clientConfigInternal2 = bVar.f111413b;
                C42403a aVar = bVar.f111414c;
                C42591z zVar = bVar.f111415d;
                C58872ci b = zVar.mo45632b();
                C58485gu e = C42454ae.m74852e(context, BuildConfig.FLAVOR, clientConfigInternal2, aVar, zVar, kVar, C42454ae.f111367b);
                zVar.mo45638h(65, b, kVar);
                C58480gp f = C58485gu.m89838f(e.size());
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    C42457ah ahVar = (C42457ah) e.get(i);
                    C42405ab g = ahVar.mo45506g((String) null, C58836b.f156633a);
                    C42418ao c = ahVar.mo45502c();
                    if (!(c == null || c.mo45432l() == null)) {
                        g.mo45408i(g.mo45405g(), new C42449a(c));
                    }
                    f.mo55395g(g);
                }
                guVar = f.mo55394f();
                C42384e a = gVar.mo45559a(guVar);
                C42591z zVar2 = androidLibAutocompleteSession.f110342c;
                C42589x g2 = C42590y.m75179g();
                ((C42573h) g2).f111717a = ciVar;
                g2.mo45652c(2);
                zVar2.mo45637g(12, 2, g2.mo45650a(), 0, kVar);
                return a;
            }
        }
        guVar = C58485gu.m89845m();
        C42384e a2 = gVar.mo45559a(guVar);
        C42591z zVar22 = androidLibAutocompleteSession.f110342c;
        C42589x g22 = C42590y.m75179g();
        ((C42573h) g22).f111717a = ciVar;
        g22.mo45652c(2);
        zVar22.mo45637g(12, 2, g22.mo45650a(), 0, kVar);
        return a2;
    }
}
