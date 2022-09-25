package com.google.android.libraries.assistant.auto.tng.p945f.p953c.p961c;

import com.google.common.util.concurrent.C60842bw;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.c.c.a */
/* compiled from: PG */
public final class C13433a extends C13435c {

    /* renamed from: a */
    private final C60870cx f41261a;

    /* renamed from: b */
    private final C60870cx f41262b;

    public C13433a(C60870cx cxVar, C60870cx cxVar2) {
        this.f41261a = cxVar;
        this.f41262b = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo21084a() {
        return this.f41261a;
    }

    /* renamed from: b */
    public final C60870cx mo21085b() {
        return this.f41262b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13435c) {
            C13435c cVar = (C13435c) obj;
            return this.f41261a.equals(cVar.mo21084a()) && this.f41262b.equals(cVar.mo21085b());
        }
    }

    public final int hashCode() {
        return ((this.f41261a.hashCode() ^ 1000003) * 1000003) ^ this.f41262b.hashCode();
    }

    public final String toString() {
        String obj = ((C60842bw) this.f41261a).f164926b.toString();
        String obj2 = ((C60842bw) this.f41262b).f164926b.toString();
        return "TappedMessageData{bundledMessageNotification=" + obj + ", messageNotification=" + obj2 + "}";
    }
}
