package com.google.apps.tiktok.p3648i.p3650b;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.protostore.C42882ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.protos.p4874ap.p4877b.p4878a.C63691b;

/* renamed from: com.google.apps.tiktok.i.b.a */
/* compiled from: PG */
public final class C47155a extends C47161e {

    /* renamed from: a */
    public C42882ah f122777a;

    /* renamed from: b */
    public C63691b f122778b;

    /* renamed from: c */
    public C58833ax f122779c;

    /* renamed from: d */
    public C58833ax f122780d;

    /* renamed from: e */
    public int f122781e;

    /* renamed from: f */
    private C21370a f122782f;

    public C47155a() {
        C58836b bVar = C58836b.f156633a;
        this.f122779c = bVar;
        this.f122780d = bVar;
    }

    /* renamed from: a */
    public final C47162f mo51054a() {
        C21370a aVar;
        int i;
        C42882ah ahVar = this.f122777a;
        if (ahVar != null && (aVar = this.f122782f) != null && (i = this.f122781e) != 0) {
            return new C47158b(ahVar, this.f122778b, aVar, i, this.f122779c, this.f122780d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f122777a == null) {
            sb.append(" adapter");
        }
        if (this.f122782f == null) {
            sb.append(" clock");
        }
        if (this.f122781e == 0) {
            sb.append(" clientId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo51055b(C21370a aVar) {
        if (aVar != null) {
            this.f122782f = aVar;
            return;
        }
        throw new NullPointerException("Null clock");
    }
}
