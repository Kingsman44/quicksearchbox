package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.search.googleapp.search.suggest.p10443a.p10444a.C137914i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.searchbox.root.p3199a.C41630d;
import com.google.android.libraries.searchbox.root.p3199a.C41633g;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.u */
/* compiled from: PG */
public final class C116935u implements C41630d, C89196a {

    /* renamed from: a */
    public final Context f324658a;

    /* renamed from: b */
    public C22871g f324659b;

    /* renamed from: c */
    private final C86034c f324660c;

    /* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.u$a */
    /* compiled from: PG */
    public interface C116936a {
        /* renamed from: ic */
        Optional mo103064ic();
    }

    public C116935u(Context context, C86034c cVar) {
        this.f324658a = context;
        this.f324660c = cVar;
    }

    /* renamed from: a */
    public final int mo44213a() {
        return 13000;
    }

    /* renamed from: b */
    public final boolean mo44214b(C41642a aVar, List list) {
        C88616t tVar = (C88616t) aVar;
        if (TextUtils.isEmpty(tVar.f239556a.mo84352bk()) && !list.isEmpty()) {
            ListIterator listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C41633g gVar = (C41633g) listIterator.next();
                if (gVar.mo44217m() == 179 && gVar.mo44222r().contains(517)) {
                    if (!tVar.f239556a.mo84406cm()) {
                        try {
                            C60870cx b = this.f324660c.mo79697b();
                            C116932r rVar = new C116932r(this);
                            if (((C137914i) C90877ak.m148472f(C60922j.m93045h(b, C47810es.m84966f(rVar), new C116933s(this)))).f375237b) {
                                listIterator.remove();
                                return true;
                            }
                        } catch (InterruptedException | ExecutionException unused) {
                            return false;
                        }
                    } else {
                        listIterator.remove();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final void mo82226hG(C22871g gVar) {
        this.f324659b = gVar;
    }

    /* renamed from: i */
    public final void mo82227i() {
    }
}
