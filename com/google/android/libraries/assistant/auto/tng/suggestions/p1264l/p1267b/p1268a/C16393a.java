package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1268a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C16393a implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C16394b f48248a;

    public /* synthetic */ C16393a(C16394b bVar) {
        this.f48248a = bVar;
    }

    public final int compare(Object obj, Object obj2) {
        C16394b bVar = this.f48248a;
        C16170n nVar = (C16170n) obj;
        C16170n nVar2 = (C16170n) obj2;
        int b = bVar.mo22896b(nVar.mo22752f());
        int b2 = bVar.mo22896b(nVar2.mo22752f());
        return ((b == b2 ? 0 : b < b2 ? -1 : 1) * 10) + Integer.signum(nVar.mo22752f().compareTo(nVar2.mo22752f()));
    }
}
