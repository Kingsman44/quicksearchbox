package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.g */
/* compiled from: PG */
public final class C29436g extends C28739bq {

    /* renamed from: a */
    public String f79801a;

    /* renamed from: b */
    public C58833ax f79802b;

    /* renamed from: c */
    public C58833ax f79803c;

    /* renamed from: d */
    public C58833ax f79804d;

    /* renamed from: e */
    public C58833ax f79805e;

    /* renamed from: f */
    public C58833ax f79806f;

    /* renamed from: g */
    public C58833ax f79807g;

    /* renamed from: h */
    public boolean f79808h;

    /* renamed from: i */
    public byte f79809i;

    /* renamed from: j */
    public int f79810j;

    /* renamed from: k */
    private int f79811k;

    /* renamed from: l */
    private boolean f79812l;

    public C29436g() {
        C58836b bVar = C58836b.f156633a;
        this.f79802b = bVar;
        this.f79803c = bVar;
        this.f79804d = bVar;
        this.f79805e = bVar;
        this.f79806f = bVar;
        this.f79807g = bVar;
    }

    public C29436g(C28740br brVar) {
        C58836b bVar = C58836b.f156633a;
        this.f79802b = bVar;
        this.f79803c = bVar;
        this.f79804d = bVar;
        this.f79805e = bVar;
        this.f79806f = bVar;
        this.f79807g = bVar;
        C29473h hVar = (C29473h) brVar;
        this.f79801a = hVar.f79888a;
        this.f79802b = hVar.f79889b;
        this.f79803c = hVar.f79890c;
        this.f79804d = hVar.f79891d;
        this.f79805e = hVar.f79892e;
        this.f79806f = hVar.f79893f;
        this.f79807g = hVar.f79894g;
        this.f79811k = hVar.f79895h;
        this.f79810j = hVar.f79898k;
        this.f79812l = hVar.f79896i;
        this.f79808h = hVar.f79897j;
        this.f79809i = 7;
    }

    /* renamed from: a */
    public final C28740br mo34335a() {
        String str;
        int i;
        if (this.f79809i == 7 && (str = this.f79801a) != null && (i = this.f79810j) != 0) {
            return new C29473h(str, this.f79802b, this.f79803c, this.f79804d, this.f79805e, this.f79806f, this.f79807g, this.f79811k, i, this.f79812l, this.f79808h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f79801a == null) {
            sb.append(" groupName");
        }
        if ((this.f79809i & 1) == 0) {
            sb.append(" groupSizeBytes");
        }
        if (this.f79810j == 0) {
            sb.append(" showNotifications");
        }
        if ((this.f79809i & 2) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.f79809i & 4) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34336b(C58833ax axVar) {
        if (axVar != null) {
            this.f79802b = axVar;
            return;
        }
        throw new NullPointerException("Null accountOptional");
    }

    /* renamed from: c */
    public final void mo34337c(C58833ax axVar) {
        if (axVar != null) {
            this.f79806f = axVar;
            return;
        }
        throw new NullPointerException("Null downloadConditionsOptional");
    }

    /* renamed from: d */
    public final void mo34338d(String str) {
        if (str != null) {
            this.f79801a = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    /* renamed from: e */
    public final void mo34339e(int i) {
        this.f79811k = i;
        this.f79809i = (byte) (this.f79809i | 1);
    }

    /* renamed from: f */
    public final void mo34340f(boolean z) {
        this.f79812l = z;
        this.f79809i = (byte) (this.f79809i | 2);
    }

    /* renamed from: g */
    public final void mo34341g(C58833ax axVar) {
        this.f79803c = axVar;
    }
}
