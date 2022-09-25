package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate;

import com.google.android.libraries.assistant.auto.tng.assistant.p720b.p724d.C11983a;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.a */
/* compiled from: PG */
public final class C16666a extends C16777c {

    /* renamed from: a */
    private final C28310af f48816a;

    /* renamed from: b */
    private final C28306ab f48817b;

    /* renamed from: c */
    private final C28443m f48818c;

    /* renamed from: d */
    private final C11983a f48819d;

    public C16666a(C28310af afVar, C28306ab abVar, C28443m mVar, C11983a aVar) {
        this.f48816a = afVar;
        this.f48817b = abVar;
        this.f48818c = mVar;
        this.f48819d = aVar;
    }

    /* renamed from: a */
    public final C11983a mo22957a() {
        return this.f48819d;
    }

    /* renamed from: b */
    public final C28443m mo22958b() {
        return this.f48818c;
    }

    /* renamed from: c */
    public final C28306ab mo22959c() {
        return this.f48817b;
    }

    /* renamed from: d */
    public final C28310af mo22960d() {
        return this.f48816a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C16777c) {
            C16777c cVar = (C16777c) obj;
            return this.f48816a.equals(cVar.mo22960d()) && this.f48817b.equals(cVar.mo22959c()) && this.f48818c.equals(cVar.mo22958b()) && this.f48819d.equals(cVar.mo22957a());
        }
    }

    public final int hashCode() {
        return ((((((this.f48816a.hashCode() ^ 1000003) * 1000003) ^ this.f48817b.hashCode()) * 1000003) ^ this.f48818c.hashCode()) * 1000003) ^ this.f48819d.hashCode();
    }

    public final String toString() {
        String obj = this.f48816a.toString();
        String obj2 = this.f48817b.toString();
        String obj3 = this.f48818c.toString();
        String obj4 = this.f48819d.toString();
        return "VisualElementLogging{visualElements=" + obj + ", viewVisualElements=" + obj2 + ", interactionLogger=" + obj3 + ", veLoggingHelper=" + obj4 + "}";
    }
}
