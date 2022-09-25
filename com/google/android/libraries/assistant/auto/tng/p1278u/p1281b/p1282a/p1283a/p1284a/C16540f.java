package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1283a.p1284a;

import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15481g;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.assistant.p3897e.p3917i.p3918a.C51236af;
import com.google.assistant.p3897e.p3917i.p3918a.C51239ai;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.a.a.f */
/* compiled from: PG */
public final class C16540f extends C68247h {

    /* renamed from: a */
    private final C68283d f48530a;

    /* renamed from: c */
    private final C68283d f48531c;

    public C16540f(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16540f.class), aVar);
        this.f48530a = C68236af.m98549d(dVar);
        this.f48531c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        C68282c cVar = (C68282c) list.get(0);
        C15481g gVar = (C15481g) list.get(1);
        if (!C57940c.m88582i(cVar) || TextUtils.isEmpty((CharSequence) cVar.mo60292a())) {
            obj2 = C58836b.f156633a;
        } else {
            gVar.mo22352b(C37179a.f97525br);
            C51236af afVar = (C51236af) C51239ai.f133399g.createBuilder();
            String str = (String) cVar.mo60292a();
            afVar.copyOnWrite();
            C51239ai aiVar = (C51239ai) afVar.instance;
            str.getClass();
            aiVar.f133401a |= 2;
            aiVar.f133404d = str;
            afVar.copyOnWrite();
            C51239ai aiVar2 = (C51239ai) afVar.instance;
            aiVar2.f133401a |= 4;
            aiVar2.f133405e = 1;
            obj2 = C58833ax.m90834k((C51239ai) afVar.build());
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(C68236af.m98546a(this.f48530a.mo60297gq()), this.f48531c.mo60297gq());
    }
}
