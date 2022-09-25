package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.g */
/* compiled from: PG */
public final class C35761g extends C35596cy {

    /* renamed from: a */
    public C36197b f93686a;

    /* renamed from: b */
    public C35470f f93687b;

    /* renamed from: c */
    public C36379e f93688c;

    /* renamed from: a */
    public final C35597cz mo39726a() {
        C35470f fVar;
        C36379e eVar;
        C36197b bVar = this.f93686a;
        if (bVar != null && (fVar = this.f93687b) != null && (eVar = this.f93688c) != null) {
            return new C35762h(bVar, fVar, eVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f93686a == null) {
            sb.append(" permissionsRequester");
        }
        if (this.f93687b == null) {
            sb.append(" contextIntentStarter");
        }
        if (this.f93688c == null) {
            sb.append(" locationService");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
