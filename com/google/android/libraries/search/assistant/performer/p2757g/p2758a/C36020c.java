package com.google.android.libraries.search.assistant.performer.p2757g.p2758a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.a.c */
/* compiled from: PG */
final class C36020c extends C36012a {

    /* renamed from: a */
    public C60870cx f94227a;

    /* renamed from: b */
    public boolean f94228b;

    /* renamed from: c */
    public byte f94229c;

    /* renamed from: a */
    public final C36019b mo39934a() {
        C60870cx cxVar;
        if (this.f94229c == 1 && (cxVar = this.f94227a) != null) {
            return new C36021d(cxVar, this.f94228b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f94227a == null) {
            sb.append(" mediaControllerCompatFuture");
        }
        if (this.f94229c == 0) {
            sb.append(" isFromExistingMediaSession");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
