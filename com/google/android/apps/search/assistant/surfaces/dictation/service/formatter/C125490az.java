package com.google.android.apps.search.assistant.surfaces.dictation.service.formatter;

import com.google.android.apps.gsa.unifiedime.C118586d;
import java.util.Map;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.az */
/* compiled from: PG */
public final /* synthetic */ class C125490az implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ C125495bd f346050a;

    /* renamed from: b */
    public final /* synthetic */ Map.Entry f346051b;

    public /* synthetic */ C125490az(C125495bd bdVar, Map.Entry entry) {
        this.f346050a = bdVar;
        this.f346051b = entry;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        C125495bd bdVar = this.f346050a;
        Map.Entry entry = this.f346051b;
        String a = bdVar.f346058b.mo107533a(((C118586d) obj).f330856b);
        C125494bc bcVar = (C125494bc) entry.getKey();
        String sb = bdVar.f346061e.toString();
        int offsetByCodePoints = sb.offsetByCodePoints(0, Math.min(bcVar.mo106987b(), sb.codePointCount(0, sb.length())));
        if (!a.equals(bdVar.f346058b.mo107533a(sb.substring(offsetByCodePoints, sb.offsetByCodePoints(offsetByCodePoints, Math.min(bcVar.mo106986a(), sb.codePointCount(offsetByCodePoints, sb.length()))))))) {
            return true;
        }
        return false;
    }
}
