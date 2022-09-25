package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1291c;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Map;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.c.b */
/* compiled from: PG */
public final class C16569b extends C68247h {

    /* renamed from: a */
    private final C68283d f48599a;

    /* renamed from: c */
    private final C68283d f48600c;

    public C16569b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16569b.class), aVar);
        this.f48599a = C68236af.m98549d(dVar);
        this.f48600c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        List list = (List) obj;
        Map map = (Map) list.get(0);
        C12991i iVar = (C12991i) list.get(1);
        C12989g a = C12989g.m29225a(iVar.f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (!map.containsKey(a)) {
            C59052c cVar = (C59052c) ((C59052c) C16568a.f48598a.mo56226d()).mo56372aa(46381);
            C12989g a2 = C12989g.m29225a(iVar.f40385d);
            if (a2 == null) {
                a2 = C12989g.UNKNOWN;
            }
            cVar.mo56389s("No agent ID provided for surface: %s", a2);
            obj2 = C58836b.f156633a;
        } else {
            C12989g a3 = C12989g.m29225a(iVar.f40385d);
            if (a3 == null) {
                a3 = C12989g.UNKNOWN;
            }
            obj2 = C58833ax.m90834k((String) map.get(a3));
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48599a.mo60297gq(), this.f48600c.mo60297gq());
    }
}
