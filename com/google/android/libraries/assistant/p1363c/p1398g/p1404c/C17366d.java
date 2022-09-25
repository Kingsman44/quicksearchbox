package com.google.android.libraries.assistant.p1363c.p1398g.p1404c;

import com.google.android.libraries.assistant.p1363c.p1398g.C17331a;
import com.google.android.libraries.assistant.p1363c.p1398g.C17360b;
import com.google.android.libraries.assistant.p1363c.p1398g.p1405d.C17377g;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.assistant.c.g.c.d */
/* compiled from: PG */
public final /* synthetic */ class C17366d implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ StringBuilder f50222a;

    public /* synthetic */ C17366d(StringBuilder sb) {
        this.f50222a = sb;
    }

    public final void accept(Object obj, Object obj2) {
        StringBuilder sb = this.f50222a;
        C17364b bVar = (C17364b) obj;
        C17331a a = ((C17360b) obj2).mo23302a();
        String f = C17377g.m34658f(bVar.mo23310a(), bVar.mo23311b(), a.mo23277c(), a.mo23276b(), a.mo23275a());
        sb.append("  ");
        sb.append(f);
        sb.append("\n");
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
