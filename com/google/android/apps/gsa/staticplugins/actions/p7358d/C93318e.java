package com.google.android.apps.gsa.staticplugins.actions.p7358d;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.d.e */
/* compiled from: PG */
public final class C93318e extends C68247h {

    /* renamed from: a */
    private final C68283d f260239a;

    public C93318e(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C93318e.class), aVar);
        this.f260239a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        if (list.isEmpty()) {
            obj2 = C58836b.f156633a;
        } else {
            obj2 = C58833ax.m90834k((VoiceAction) list.get(0));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f260239a.mo60297gq();
    }
}
