package com.google.android.apps.gsa.shared.p7122o;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.shared.o.g */
/* compiled from: PG */
public final class C90443g {

    /* renamed from: a */
    private static final C58827ar f252664a = C58827ar.m90818c('.');

    /* renamed from: b */
    private static final C58827ar f252665b = C58827ar.m90818c(';');

    /* renamed from: c */
    private final String f252666c;

    /* renamed from: d */
    private final C90442f f252667d;

    public C90443g(String str, C90442f fVar) {
        this.f252666c = str;
        this.f252667d = fVar;
    }

    /* renamed from: a */
    public static String m147128a(C90443g... gVarArr) {
        C58485gu l = C58485gu.m89844l(gVarArr);
        if (l.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        ArrayList arrayList = new ArrayList();
        C58801sm G = l.listIterator(0);
        while (G.hasNext()) {
            C90443g gVar = (C90443g) G.next();
            C58827ar arVar = f252664a;
            String str = gVar.f252666c;
            arrayList.add(arVar.mo56097d(new C58825ap(new Object[]{gVar.f252667d.f252663d}, str, BuildConfig.FLAVOR)));
        }
        f252665b.mo56100g(sb, arrayList);
        return sb.toString();
    }
}
