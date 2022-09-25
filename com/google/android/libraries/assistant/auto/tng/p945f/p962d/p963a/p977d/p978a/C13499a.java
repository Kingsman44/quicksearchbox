package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p977d.p978a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.d.a.a */
/* compiled from: PG */
public final class C13499a extends C13510c {

    /* renamed from: a */
    public String f41408a;

    /* renamed from: b */
    public String f41409b;

    /* renamed from: c */
    public String f41410c;

    /* renamed from: d */
    public C58833ax f41411d;

    /* renamed from: e */
    public C58833ax f41412e;

    /* renamed from: f */
    public C58833ax f41413f;

    /* renamed from: g */
    public C58833ax f41414g;

    /* renamed from: h */
    public C58833ax f41415h;

    /* renamed from: i */
    public C58833ax f41416i;

    /* renamed from: j */
    public C58833ax f41417j;

    /* renamed from: k */
    public int f41418k;

    public C13499a() {
        C58836b bVar = C58836b.f156633a;
        this.f41411d = bVar;
        this.f41412e = bVar;
        this.f41413f = bVar;
        this.f41414g = bVar;
        this.f41415h = bVar;
        this.f41416i = bVar;
        this.f41417j = bVar;
    }

    /* renamed from: a */
    public final C13512e mo21131a() {
        String str;
        String str2;
        int i;
        String str3 = this.f41408a;
        if (str3 != null && (str = this.f41409b) != null && (str2 = this.f41410c) != null && (i = this.f41418k) != 0) {
            return new C13509b(str3, str, str2, i, this.f41411d, this.f41412e, this.f41413f, this.f41414g, this.f41415h, this.f41416i, this.f41417j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f41408a == null) {
            sb.append(" displayString");
        }
        if (this.f41409b == null) {
            sb.append(" messageString");
        }
        if (this.f41410c == null) {
            sb.append(" type");
        }
        if (this.f41418k == 0) {
            sb.append(" queryStatus");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo21132b(C58833ax axVar) {
        if (axVar != null) {
            this.f41411d = axVar;
            return;
        }
        throw new NullPointerException("Null mapsNavigationStateOptional");
    }
}
