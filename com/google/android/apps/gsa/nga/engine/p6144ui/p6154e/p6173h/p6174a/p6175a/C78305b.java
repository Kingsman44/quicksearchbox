package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.b */
/* compiled from: PG */
final class C78305b extends C78304az {

    /* renamed from: a */
    public String f215602a;

    /* renamed from: b */
    public String f215603b;

    /* renamed from: c */
    public String f215604c;

    /* renamed from: d */
    private C80831aj f215605d;

    /* renamed from: e */
    private int f215606e;

    public C78305b() {
    }

    public C78305b(C78306ba baVar) {
        C78314c cVar = (C78314c) baVar;
        this.f215602a = cVar.f215623a;
        this.f215603b = cVar.f215624b;
        this.f215604c = cVar.f215625c;
        this.f215605d = cVar.f215626d;
        this.f215606e = cVar.f215627e;
    }

    /* renamed from: a */
    public final C78306ba mo73289a() {
        String str;
        String str2;
        C80831aj ajVar;
        int i;
        String str3 = this.f215602a;
        if (str3 != null && (str = this.f215603b) != null && (str2 = this.f215604c) != null && (ajVar = this.f215605d) != null && (i = this.f215606e) != 0) {
            return new C78314c(str3, str, str2, ajVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f215602a == null) {
            sb.append(" chipText");
        }
        if (this.f215603b == null) {
            sb.append(" primaryText");
        }
        if (this.f215604c == null) {
            sb.append(" clickText");
        }
        if (this.f215605d == null) {
            sb.append(" clickAction");
        }
        if (this.f215606e == 0) {
            sb.append(" type");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo73290b(String str) {
        this.f215602a = str;
    }

    /* renamed from: c */
    public final void mo73291c(C80831aj ajVar) {
        if (ajVar != null) {
            this.f215605d = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAction");
    }

    /* renamed from: d */
    public final void mo73292d(int i) {
        if (i != 0) {
            this.f215606e = i;
            return;
        }
        throw new NullPointerException("Null type");
    }
}
