package com.google.android.apps.gsa.staticplugins.p8793w.p8802c.p8803a.p8806b.p8807a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90525q;
import com.google.android.apps.gsa.shared.speech.p7139a.C90529u;
import com.google.android.libraries.gsa.p1929o.p1930a.C23319a;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.c.a.b.a.c */
/* compiled from: PG */
public final class C117776c extends C68247h {

    /* renamed from: a */
    private final C68283d f326888a;

    /* renamed from: c */
    private final C68283d f326889c;

    /* renamed from: d */
    private final C68283d f326890d;

    /* renamed from: e */
    private final C68283d f326891e;

    public C117776c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C117776c.class), aVar);
        this.f326888a = C68236af.m98549d(dVar);
        this.f326889c = C68236af.m98549d(dVar2);
        this.f326890d = C68236af.m98549d(dVar3);
        this.f326891e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Query query = (Query) list.get(0);
        Set set = (Set) list.get(1);
        C58974d dVar = (C58974d) list.get(2);
        C58833ax axVar = (C58833ax) list.get(3);
        if (!axVar.mo56113h() || (((C67438ag) axVar.mo56107c()).f183258a & 16) == 0) {
            throw new C90525q();
        }
        C23319a aVar = new C23319a();
        C67442ak akVar = ((C67438ag) axVar.mo56107c()).f183263f;
        if (akVar == null) {
            akVar = C67442ak.f183276i;
        }
        long millis = TimeUnit.MICROSECONDS.toMillis(akVar.f183280c);
        C58485gu b = aVar.mo28813b(akVar);
        String str = (String) C58557jl.m90130k(b, BuildConfig.FLAVOR);
        if (!str.isEmpty()) {
            return C60856cj.m92900i(query.mo84270aG(str, b, millis, true));
        }
        throw new C90529u((byte[]) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f326888a.mo60297gq(), this.f326889c.mo60297gq(), this.f326890d.mo60297gq(), this.f326891e.mo60297gq());
    }
}
