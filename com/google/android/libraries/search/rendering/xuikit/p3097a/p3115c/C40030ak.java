package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.evernote.android.state.BuildConfig;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4387a.p4390b.p4391a.C57693i;
import com.google.protos.youtube.elements.C66192df;
import com.google.protos.youtube.elements.C66198dl;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.ak */
/* compiled from: PG */
public final class C40030ak {
    /* renamed from: a */
    public static final C40035ap m69542a(C66192df dfVar) {
        C40035ap aoVar;
        C69664n.m101061g(dfVar, "loggingNode");
        C66198dl dlVar = dfVar.f179999b;
        if (dlVar == null) {
            dlVar = C66198dl.f180008b;
        }
        C69664n.m101060f(dlVar, BuildConfig.FLAVOR);
        if (C40036aq.m69548b(dlVar) != null && C40036aq.m69547a(dlVar) != null) {
            return C40031al.f105190a;
        }
        if (C40036aq.m69548b(dlVar) != null) {
            C57693i b = C40036aq.m69548b(dlVar);
            C69664n.m101058d(b);
            aoVar = new C40029aj(b, dfVar);
        } else if (C40036aq.m69547a(dlVar) == null) {
            return new C40032am(dfVar);
        } else {
            C57696b a = C40036aq.m69547a(dlVar);
            C69664n.m101058d(a);
            aoVar = new C40034ao(a, dfVar);
        }
        return aoVar;
    }
}
