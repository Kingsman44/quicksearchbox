package com.google.android.apps.gsa.nga.engine.warmactions;

import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.f */
/* compiled from: PG */
final class C79563f {

    /* renamed from: a */
    private static final C58495hd f218297a = C58495hd.m89906t(C79570b.CALL_NUMBER, 100, C79570b.CALL_CONTACT, 100, C79570b.CALL_NUMBER_V2, 100, C79570b.CALL_CONTACT_V2, 100, C79570b.TIMER, 50, C79570b.ALARM, 50, C79570b.MEDIA, 10);

    /* renamed from: a */
    public static int m127641a(C79570b bVar) {
        Optional ofNullable = Optional.ofNullable((Integer) f218297a.get(bVar));
        if (ofNullable.isEmpty()) {
            ((C58970a) ((C58970a) C79566g.f218307b.mo56226d()).mo56372aa(5598)).mo56389s("No priority defined for %s", bVar.name());
        }
        return ((Integer) ofNullable.orElse(Integer.valueOf(LinearLayoutManager.INVALID_OFFSET))).intValue();
    }
}
