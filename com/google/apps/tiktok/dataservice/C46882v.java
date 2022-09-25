package com.google.apps.tiktok.dataservice;

import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.apps.tiktok.dataservice.v */
/* compiled from: PG */
public final class C46882v {

    /* renamed from: a */
    public C60870cx f122320a;

    /* renamed from: b */
    public Object f122321b;

    /* renamed from: c */
    public C58817ah f122322c;

    /* renamed from: a */
    public final C46771co mo50884a() {
        Object obj;
        C60870cx cxVar = this.f122320a;
        if (cxVar != null && (obj = this.f122321b) != null) {
            return new C46883w(cxVar, obj, this.f122322c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f122320a == null) {
            sb.append(" future");
        }
        if (this.f122321b == null) {
            sb.append(" key");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo50885b(C60870cx cxVar) {
        if (cxVar != null) {
            this.f122320a = cxVar;
            return;
        }
        throw new NullPointerException("Null future");
    }

    /* renamed from: c */
    public final void mo50886c(Object obj) {
        if (obj != null) {
            this.f122321b = obj;
            return;
        }
        throw new NullPointerException("Null key");
    }
}
