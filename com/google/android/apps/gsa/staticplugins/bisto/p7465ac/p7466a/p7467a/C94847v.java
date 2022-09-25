package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7469c.C94932d;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7470d.C94936d;
import com.google.android.libraries.assistant.accessory.p617a.C10992c;
import java.util.Deque;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.v */
/* compiled from: PG */
public final class C94847v {

    /* renamed from: a */
    public final C94828c f265242a;

    public C94847v(C94828c cVar) {
        this.f265242a = cVar;
    }

    /* renamed from: a */
    public final Deque mo88680a(byte[] bArr, C94936d dVar) {
        C94828c cVar = this.f265242a;
        C94936d dVar2 = C94936d.CONTROL_INPUT;
        C10992c cVar2 = null;
        switch (dVar.ordinal()) {
            case 0:
            case 1:
                C10992c cVar3 = cVar.f265168i;
                break;
            case 2:
            case 3:
                cVar2 = cVar.f265172m;
                break;
            case 4:
            case 5:
                C10992c cVar4 = cVar.f265169j;
                break;
            case 6:
            case 7:
                C10992c cVar5 = cVar.f265170k;
                break;
        }
        if (cVar2 != null) {
            return cVar2.mo19361a(bArr);
        }
        throw new C94932d("Not ready to get framed packets");
    }
}
