package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.j */
/* compiled from: PG */
public final class C29663j extends C28804cs {

    /* renamed from: a */
    public String f80313a;

    /* renamed from: b */
    public C58833ax f80314b;

    /* renamed from: c */
    public C58833ax f80315c;

    /* renamed from: d */
    private boolean f80316d;

    /* renamed from: e */
    private boolean f80317e;

    /* renamed from: f */
    private byte f80318f;

    public C29663j() {
        C58836b bVar = C58836b.f156633a;
        this.f80314b = bVar;
        this.f80315c = bVar;
    }

    /* renamed from: a */
    public final C28805ct mo34447a() {
        String str;
        if (this.f80318f == 3 && (str = this.f80313a) != null) {
            return new C29665k(str, this.f80314b, this.f80315c, this.f80316d, this.f80317e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f80313a == null) {
            sb.append(" groupName");
        }
        if ((this.f80318f & 1) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.f80318f & 2) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34448b(C58833ax axVar) {
        if (axVar != null) {
            this.f80314b = axVar;
            return;
        }
        throw new NullPointerException("Null accountOptional");
    }

    /* renamed from: c */
    public final void mo34449c(String str) {
        if (str != null) {
            this.f80313a = str;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    /* renamed from: d */
    public final void mo34450d(boolean z) {
        this.f80316d = z;
        this.f80318f = (byte) (this.f80318f | 1);
    }

    /* renamed from: e */
    public final void mo34451e(boolean z) {
        this.f80317e = z;
        this.f80318f = (byte) (this.f80318f | 2);
    }
}
