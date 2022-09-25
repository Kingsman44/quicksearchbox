package com.google.android.libraries.lens.view.session;

import android.util.Size;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;

/* renamed from: com.google.android.libraries.lens.view.session.a */
/* compiled from: PG */
public final class C27732a extends C27792l {

    /* renamed from: a */
    public C58833ax f75709a;

    /* renamed from: b */
    public C58833ax f75710b;

    /* renamed from: c */
    public C58833ax f75711c;

    /* renamed from: d */
    public C58833ax f75712d;

    /* renamed from: e */
    public Size f75713e;

    /* renamed from: f */
    public long f75714f;

    /* renamed from: g */
    public byte f75715g;

    /* renamed from: h */
    private C56220aa f75716h;

    public C27732a() {
        C58836b bVar = C58836b.f156633a;
        this.f75709a = bVar;
        this.f75710b = bVar;
        this.f75711c = bVar;
        this.f75712d = bVar;
    }

    public C27732a(C27793m mVar) {
        C58836b bVar = C58836b.f156633a;
        this.f75709a = bVar;
        this.f75710b = bVar;
        this.f75711c = bVar;
        this.f75712d = bVar;
        C27764b bVar2 = (C27764b) mVar;
        this.f75716h = bVar2.f75772a;
        this.f75709a = bVar2.f75773b;
        this.f75710b = bVar2.f75774c;
        this.f75711c = bVar2.f75775d;
        this.f75712d = bVar2.f75776e;
        this.f75713e = bVar2.f75777f;
        this.f75714f = bVar2.f75778g;
        this.f75715g = 1;
    }

    /* renamed from: a */
    public final C27793m mo33219a() {
        C56220aa aaVar;
        Size size;
        if (this.f75715g == 1 && (aaVar = this.f75716h) != null && (size = this.f75713e) != null) {
            return new C27764b(aaVar, this.f75709a, this.f75710b, this.f75711c, this.f75712d, size, this.f75714f);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f75716h == null) {
            sb.append(" detectionResults");
        }
        if (this.f75713e == null) {
            sb.append(" imageSize");
        }
        if (this.f75715g == 0) {
            sb.append(" imageTimestampUs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo33220b(C56220aa aaVar) {
        if (aaVar != null) {
            this.f75716h = aaVar;
            return;
        }
        throw new NullPointerException("Null detectionResults");
    }
}
