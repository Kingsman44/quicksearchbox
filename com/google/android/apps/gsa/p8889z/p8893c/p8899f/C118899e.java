package com.google.android.apps.gsa.p8889z.p8893c.p8899f;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67468p;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.z.c.f.e */
/* compiled from: PG */
public final /* synthetic */ class C118899e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118897c f331598a;

    public /* synthetic */ C118899e(C118897c cVar) {
        this.f331598a = cVar;
    }

    public final Object apply(Object obj) {
        C67442ak akVar;
        String str;
        C118897c cVar = this.f331598a;
        C67438ag agVar = (C67438ag) obj;
        int a = C67437af.m97466a(agVar.f183259b);
        if (a == 0 || a == 1) {
            Pair a2 = cVar.mo104065a(agVar);
            return new C118895a((String) a2.first, (String) a2.second, false, (String) null);
        }
        if ((agVar.f183258a & 16) != 0) {
            akVar = agVar.f183263f;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
        } else {
            akVar = agVar.f183261d;
            if (akVar == null) {
                akVar = C67442ak.f183276i;
            }
        }
        C58480gp e = C58485gu.m89837e();
        Iterator it = akVar.f183281d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            str = BuildConfig.FLAVOR;
            if (!hasNext) {
                break;
            }
            C67468p pVar = (C67468p) it.next();
            if ((pVar.f183366a & 1) != 0) {
                str = pVar.f183367b;
            }
            e.mo55395g(str);
        }
        C58485gu f = e.mo55394f();
        String str2 = f.isEmpty() ? str : (String) f.get(0);
        StringBuilder sb = cVar.f331596a;
        sb.delete(0, sb.length());
        cVar.f331596a.append(str2);
        return new C118895a(!f.isEmpty() ? (String) f.get(0) : str, str, true, (String) null);
    }
}
