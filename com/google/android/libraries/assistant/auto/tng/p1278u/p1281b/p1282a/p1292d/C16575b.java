package com.google.android.libraries.assistant.auto.tng.p1278u.p1281b.p1282a.p1292d;

import android.content.Context;
import android.provider.Settings;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.common.base.C58837ba;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5208h.C66544aa;
import com.google.speech.p5208h.C66545ab;
import com.google.speech.p5208h.C66691y;
import com.google.speech.p5208h.C66692z;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.u.b.a.d.b */
/* compiled from: PG */
public final class C16575b extends C68247h {

    /* renamed from: a */
    private final C68283d f48614a;

    /* renamed from: c */
    private final C68283d f48615c;

    public C16575b(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C16575b.class), aVar);
        this.f48614a = C68236af.m98549d(dVar);
        this.f48615c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        Context context = (Context) list.get(0);
        C66544aa aaVar = (C66544aa) C66545ab.f180982c.createBuilder();
        C12989g a = C12989g.m29225a(((C12991i) list.get(1)).f40385d);
        if (a == null) {
            a = C12989g.UNKNOWN;
        }
        if (a == C12989g.MORRIS) {
            aaVar.copyOnWrite();
            C66545ab abVar = (C66545ab) aaVar.instance;
            abVar.f180985b = 0;
            abVar.f180984a |= 1;
        } else {
            aaVar.copyOnWrite();
            C66545ab abVar2 = (C66545ab) aaVar.instance;
            abVar2.f180985b = 3;
            abVar2.f180984a |= 1;
        }
        C66691y yVar = (C66691y) C66692z.f181426e.createBuilder();
        yVar.mo59705b((C66545ab) aaVar.build());
        String g = C58837ba.m90858g(Settings.Secure.getString(context.getContentResolver(), "android_id"));
        yVar.copyOnWrite();
        C66692z zVar = (C66692z) yVar.instance;
        zVar.f181429a |= 16;
        zVar.f181432d = g;
        return C60856cj.m92900i((C66692z) yVar.build());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f48614a.mo60297gq(), this.f48615c.mo60297gq());
    }
}
