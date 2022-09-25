package com.google.android.libraries.p590as.p593b.p596b.p607i;

import com.google.common.p4526f.p4527a.C58970a;
import com.google.p395al.p408c.p414c.p416b.C8476as;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.libraries.as.b.b.i.j */
/* compiled from: PG */
public final /* synthetic */ class C10931j implements Predicate {

    /* renamed from: a */
    public static final /* synthetic */ C10931j f36040a = new C10931j();

    private /* synthetic */ C10931j() {
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
        C8476as asVar = (C8476as) obj;
        int i = asVar.f29416a;
        boolean z = true;
        if ((i & 1) != 0 && (i & 4) != 0 && (i & 2) != 0 && (i & 1024) != 0) {
            return true;
        }
        C58970a aVar = (C58970a) ((C58970a) C10932k.f36041a.mo56225c()).mo56372aa(54021);
        int i2 = asVar.f29416a;
        Boolean valueOf = Boolean.valueOf(1 == (i2 & 1));
        Boolean valueOf2 = Boolean.valueOf((i2 & 4) != 0);
        Boolean valueOf3 = Boolean.valueOf((i2 & 2) != 0);
        if ((i2 & 1024) == 0) {
            z = false;
        }
        aVar.mo56360M("LanguagePack config is incompatible with Zipfile downloader due to missing field(s). Existence of [locale: %b, version: %b, downloadUrl: %b, hashValueSha1: %b]", valueOf, valueOf2, valueOf3, Boolean.valueOf(z));
        return false;
    }
}
