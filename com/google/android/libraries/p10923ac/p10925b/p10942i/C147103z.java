package com.google.android.libraries.p10923ac.p10925b.p10942i;

import android.database.Cursor;
import com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10962d.C147256m;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63088z;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.libraries.ac.b.i.z */
/* compiled from: PG */
public final /* synthetic */ class C147103z implements C147063ah {

    /* renamed from: a */
    public final /* synthetic */ C147087j f397164a;

    public /* synthetic */ C147103z(C147087j jVar) {
        this.f397164a = jVar;
    }

    /* renamed from: a */
    public final Object mo123868a(Cursor cursor) {
        C147087j jVar = this.f397164a;
        while (cursor.moveToNext()) {
            C63088z A = C63088z.m96139A(cursor.getBlob(0));
            try {
                MessageLite messageLite = (MessageLite) ((C147083f) jVar).f397127e.f397134c.mo59008g(C63088z.m96139A(cursor.getBlob(1)));
                C147083f fVar = (C147083f) jVar;
                if (fVar.f397125c >= ((long) messageLite.getSerializedSize())) {
                    fVar.f397125c -= (long) messageLite.getSerializedSize();
                    fVar.f397124b = A;
                    fVar.f397123a.mo55395g(messageLite);
                } else {
                    ((C147256m) fVar.f397127e.f397133b.mo27525b()).mo124064g("Size limit(%d) exceeded, stopping adding rest of changes.", Long.valueOf(fVar.f397126d));
                    return false;
                }
            } catch (C62974ct e) {
                C147083f fVar2 = (C147083f) jVar;
                ((C147256m) fVar2.f397127e.f397133b.mo27525b()).mo124063f("Skipping unparsable Change proto:", e, new Object[0]);
                fVar2.f397124b = A;
            }
        }
        return true;
    }
}
