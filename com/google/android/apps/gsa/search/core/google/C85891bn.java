package com.google.android.apps.gsa.search.core.google;

import android.content.Context;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.p10905k.C146604c;

/* renamed from: com.google.android.apps.gsa.search.core.google.bn */
/* compiled from: PG */
public final class C85891bn {

    /* renamed from: a */
    private final Context f232222a;

    /* renamed from: b */
    private String f232223b;

    /* renamed from: c */
    private String f232224c;

    /* renamed from: d */
    private String f232225d;

    /* renamed from: e */
    private String f232226e;

    public C85891bn(Context context) {
        this.f232222a = context;
    }

    /* renamed from: e */
    private final String m138014e(String str) {
        C90476a aVar = C91018d.f254254a;
        return C146604c.m238837a(this.f232222a.getContentResolver(), C146604c.f395965a, str);
    }

    /* renamed from: a */
    public final synchronized String mo79522a() {
        String e;
        if (this.f232224c == null && (e = m138014e("client_id")) != null) {
            this.f232224c = e;
        }
        return this.f232224c;
    }

    /* renamed from: b */
    public final synchronized String mo79523b() {
        String e;
        if (this.f232226e == null && (e = m138014e("assistant_channel")) != null) {
            this.f232226e = e;
        }
        return this.f232226e;
    }

    /* renamed from: c */
    public final synchronized String mo79524c() {
        String e;
        if (this.f232225d == null && (e = m138014e("voicesearch_client_id")) != null) {
            this.f232225d = e;
        }
        return this.f232225d;
    }

    /* renamed from: d */
    public final synchronized String mo79525d() {
        String e;
        if (this.f232223b == null && (e = m138014e("search_client_id")) != null) {
            this.f232223b = e;
        }
        return this.f232223b;
    }
}
