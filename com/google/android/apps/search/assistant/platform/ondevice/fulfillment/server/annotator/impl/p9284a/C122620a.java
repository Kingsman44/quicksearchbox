package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.a */
/* compiled from: PG */
final class C122620a extends C122643aw {

    /* renamed from: a */
    public final TextClassifierLib f339804a;

    /* renamed from: b */
    public final C122644ax f339805b;

    public C122620a(TextClassifierLib textClassifierLib, C122644ax axVar) {
        this.f339804a = textClassifierLib;
        this.f339805b = axVar;
    }

    /* renamed from: a */
    public final TextClassifierLib mo105701a() {
        return this.f339804a;
    }

    /* renamed from: b */
    public final C122644ax mo105702b() {
        return this.f339805b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C122643aw) {
            C122643aw awVar = (C122643aw) obj;
            return this.f339804a.equals(awVar.mo105701a()) && this.f339805b.equals(awVar.mo105702b());
        }
    }

    public final int hashCode() {
        return ((this.f339804a.hashCode() ^ 1000003) * 1000003) ^ this.f339805b.hashCode();
    }

    public final String toString() {
        String obj = this.f339804a.toString();
        String obj2 = this.f339805b.toString();
        return "TextClassifierData{textClassifier=" + obj + ", midLookup=" + obj2 + "}";
    }
}
