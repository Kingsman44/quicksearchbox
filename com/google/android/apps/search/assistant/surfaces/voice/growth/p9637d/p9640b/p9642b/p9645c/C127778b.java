package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127748i;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.c.b */
/* compiled from: PG */
public final /* synthetic */ class C127778b implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ String f351720a;

    public /* synthetic */ C127778b(String str) {
        this.f351720a = str;
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
        String str = this.f351720a;
        C58485gu guVar = C127782f.f351727a;
        C127748i iVar = ((C127743d) obj).f351641f;
        if (iVar == null) {
            iVar = C127748i.f351656e;
        }
        return iVar.f351659b.contains(str);
    }
}
