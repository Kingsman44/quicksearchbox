package com.google.android.libraries.p590as.p611d.p613b.p614a.p615a;

import com.google.common.base.C58817ah;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.as.d.b.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C10978e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ String f36115a;

    public /* synthetic */ C10978e(String str) {
        this.f36115a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f36115a;
        C10976c cVar = (C10976c) obj;
        if (str.equals(cVar.f36111c)) {
            return cVar;
        }
        ArrayList arrayList = new ArrayList(cVar.f36112d);
        arrayList.remove(str);
        arrayList.add(cVar.f36111c);
        C10975b bVar = (C10975b) C10976c.f36107e.createBuilder();
        bVar.mo19351a(arrayList);
        bVar.copyOnWrite();
        C10976c cVar2 = (C10976c) bVar.instance;
        str.getClass();
        cVar2.f36109a |= 2;
        cVar2.f36111c = str;
        return (C10976c) bVar.build();
    }
}
