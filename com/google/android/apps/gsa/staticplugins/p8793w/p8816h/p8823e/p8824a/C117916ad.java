package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e.p8824a;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.speech.C90606n;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.concurrent.ExecutionException;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.a.ad */
/* compiled from: PG */
public final class C117916ad extends C68247h {

    /* renamed from: a */
    private final C68283d f327292a;

    /* renamed from: c */
    private final C68283d f327293c;

    public C117916ad(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C117916ad.class), aVar);
        this.f327292a = C68236af.m98549d(dVar);
        this.f327293c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(1);
        if (((C58833ax) list.get(0)).mo56113h() && C57940c.m88582i(cVar)) {
            try {
                return C60856cj.m92900i(C58833ax.m90834k((C90606n) cVar.mo60292a()));
            } catch (ExecutionException e) {
                C0118a.m116x(C117952v.f327374a.mo56226d(), "Exception while Network fetch S3SynthesizedTtsResult.", 18931, e, C58975e.f156826a, "CarAssistTextSearchComp");
            }
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f327292a.mo60297gq(), C68236af.m98546a(this.f327293c.mo60297gq()));
    }
}
