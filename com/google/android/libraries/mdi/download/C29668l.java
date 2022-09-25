package com.google.android.libraries.mdi.download;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.mdi.download.l */
/* compiled from: PG */
public final class C29668l extends C28806cu {

    /* renamed from: a */
    public C58833ax f80325a;

    /* renamed from: b */
    public C58833ax f80326b;

    /* renamed from: c */
    public boolean f80327c;

    /* renamed from: d */
    public byte f80328d;

    /* renamed from: e */
    private boolean f80329e;

    /* renamed from: f */
    private boolean f80330f;

    /* renamed from: g */
    private final C58833ax f80331g;

    /* renamed from: h */
    private boolean f80332h;

    public C29668l() {
        C58836b bVar = C58836b.f156633a;
        this.f80325a = bVar;
        this.f80326b = bVar;
        this.f80331g = bVar;
    }

    /* renamed from: a */
    public final C28807cv mo34457a() {
        if (this.f80328d == 15) {
            return new C29673m(this.f80329e, this.f80330f, this.f80325a, this.f80326b, this.f80331g, this.f80332h, this.f80327c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f80328d & 1) == 0) {
            sb.append(" includeAllGroups");
        }
        if ((this.f80328d & 2) == 0) {
            sb.append(" groupWithNoAccountOnly");
        }
        if ((this.f80328d & 4) == 0) {
            sb.append(" preserveZipDirectories");
        }
        if ((this.f80328d & 8) == 0) {
            sb.append(" verifyIsolatedStructure");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo34458b(C58833ax axVar) {
        if (axVar != null) {
            this.f80326b = axVar;
            return;
        }
        throw new NullPointerException("Null accountOptional");
    }

    /* renamed from: c */
    public final void mo34459c(boolean z) {
        this.f80330f = z;
        this.f80328d = (byte) (this.f80328d | 2);
    }

    /* renamed from: d */
    public final void mo34460d(boolean z) {
        this.f80329e = z;
        this.f80328d = (byte) (this.f80328d | 1);
    }

    /* renamed from: e */
    public final void mo34461e(boolean z) {
        this.f80332h = z;
        this.f80328d = (byte) (this.f80328d | 4);
    }
}
